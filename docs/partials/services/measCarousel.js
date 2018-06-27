app.service('MeasCarousel', function(Uts) {
    var self = this;
    this.currdeg = 0;

    this.onStartUp = function(){
        $("#itemMeas" + this.currdeg).css({
            "background": Uts.carouselSelectedRGBA,
            "color": Uts.carouselTextSelectedColor
        });
    };

    this.measRotate = function(goToRight, vis) {
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

            $(".carousel-meas").css({
                "-webkit-transform": "rotateX(" + this.currdeg + "deg)",
                "-moz-transform": "rotateX(" + this.currdeg + "deg)",
                "-o-transform": "rotateX(" + this.currdeg + "deg)",
                "transform": "rotateX(" + this.currdeg + "deg)"
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

        var caroCount = ($(".carousel-meas")[0].children).length;
        for(var i = caroCount - 1; i >= 0; i-- ){
            var id = ($(".carousel-meas")[0].children)[i].id;
            var idRot = Math.abs(id.replace("itemMeas",""));

            if((rot === 0 && rot === idRot) || (rot !== 0 && rot % idRot == 0)) {
                vis.currentID = id;
                if (i == caroCount - 1) {
                    vis.leftID = ($(".carousel-meas")[0].children)[i - 1].id;
                    vis.rightID = ($(".carousel-meas")[0].children)[0].id;
                } else if (i == 0) {
                    vis.leftID = ($(".carousel-meas")[0].children)[caroCount - 1].id;
                    vis.rightID = ($(".carousel-meas")[0].children)[i + 1].id;
                } else {
                    vis.leftID = ($(".carousel-meas")[0].children)[i - 1].id;
                    vis.rightID = ($(".carousel-meas")[0].children)[i + 1].id;
                }
                break;
            }
        }
        return vis;
    };

    this.transformToCarousel = function(index, arrLength){
        var deg = Uts.getDegree(index, arrLength);
        var zPx = 78;
        var transform =
            '-webkit-transform: rotateX(' + deg + 'deg) translateZ(' + zPx + 'px);' +
            '-moz-transform: rotateX(' + deg + 'deg) translateZ(' + zPx + 'px);' +
            '-ms-transform: rotateX(' + deg + 'deg) translateZ(' + zPx + 'px);' +
            '-o-transform: rotateX(' + deg + 'deg) translateZ(' + zPx + 'px);' +
            'transform: rotateX(' + deg + 'deg) translateZ(' + zPx + 'px);';
        return transform;
    };
});