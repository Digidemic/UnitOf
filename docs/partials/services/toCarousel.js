app.service('ToCarousel', function(Uts) {
    var self = this;
    this.currdeg = 0;

    this.onStartUp = function(){
        $("#itemTo" + this.currdeg).css({
            "background": Uts.carouselSelectedRGBA,
            "color": Uts.carouselTextSelectedColor
        });
    };

    this.toRotate = function(goToRight, vis) {
        if (goToRight !== null) {
            this.currdeg = (goToRight) ? this.currdeg - 60 :  this.currdeg + 60;
            $("#" + vis.currentID).css({
                "background": Uts.carouselRestRGBA,
                "color": Uts.carouselTextColor
            });
            $("#" + vis.leftID).css({
                "background": ((goToRight) ? Uts.carouselRestRGBA : Uts.carouselSelectedRGBA),
                "color": ((goToRight) ? Uts.carouselTextColor : Uts.carouselTextSelectedColor)
            });
            $("#" + vis.rightID).css({
                "background": ((goToRight) ? Uts.carouselSelectedRGBA : Uts.carouselRestRGBA),
                "color": ((goToRight) ? Uts.carouselTextSelectedColor : Uts.carouselTextColor)
            });

            $(".carousel-to").css({
                "-webkit-transform": "rotateY(" + this.currdeg + "deg)",
                "-moz-transform": "rotateY(" + this.currdeg + "deg)",
                "-o-transform": "rotateY(" + this.currdeg + "deg)",
                "transform": "rotateY(" + this.currdeg + "deg)"
            });
        }
    };

    this.getVisibleCarouselValues = function(){
        var vis = {
            currentID: "",
            leftID: "",
            rightID: ""
        };
        var rot = this.currdeg * -1;

        while(rot < 0){
            rot += 360;
        }
        while(rot >= 360){
            rot -= 360;
        }

        var caroCount = ($(".carousel-to")[0].children).length;
        for(var i = caroCount - 1; i >= 0; i-- ){
            var id = ($(".carousel-to")[0].children)[i].id;
            var idRot = Math.abs(id.replace("itemTo",""));

            if((rot === 0 && rot === idRot) || (rot !== 0 && rot % idRot == 0)) {
                vis.currentID = id;
                if (i == caroCount - 1) {
                    vis.leftID = ($(".carousel-to")[0].children)[i - 1].id;
                    vis.rightID = ($(".carousel-to")[0].children)[0].id;
                } else if (i == 0) {
                    vis.leftID = ($(".carousel-to")[0].children)[caroCount - 1].id;
                    vis.rightID = ($(".carousel-to")[0].children)[i + 1].id;
                } else {
                    vis.leftID = ($(".carousel-to")[0].children)[i - 1].id;
                    vis.rightID = ($(".carousel-to")[0].children)[i + 1].id;
                }
                break;
            }
        }
        return vis;
    };

    this.transformToCarousel = function(index, arrLength){
        var deg = Uts.getDegree(index, arrLength);
        var zPx = 125;
        var transform =
            '-webkit-transform: rotateY(' + deg + 'deg) translateZ(' + zPx + 'px);' +
            '-moz-transform: rotateY(' + deg + 'deg) translateZ(' + zPx + 'px);' +
            '-ms-transform: rotateY(' + deg + 'deg) translateZ(' + zPx + 'px);' +
            '-o-transform: rotateY(' + deg + 'deg) translateZ(' + zPx + 'px);' +
            'transform: rotateY(' + deg + 'deg) translateZ(' + zPx + 'px);';
        return transform;
    };
});