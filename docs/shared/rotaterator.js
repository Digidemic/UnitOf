//fade in/out text
(function($){
    var defaults = {
        fadeSpeed: 500,
        pauseSpeed: 8500,
        child:null
    };
    var extendedPauseOnStart = 15000;//have first element take longer to transition the first time since it is probably the first time the user is seeing it
    var o = null;
    var obj = null;
    var nextJQuery;
    var indexClicked = null;

    $.fn.extend({
        rotaterator: function(options, scope) {
            var op = $.extend(defaults, options);
            return this.each(function() {
                o = op;
                obj = $(this);
                var items = $(obj.children(), obj);
                items.each(function () {
                    $(this).hide();
                });

                nextJQuery = (!o.child) ? $(obj).children(':first') : o.child;
                setHeaderText(nextJQuery, scope);
                $(nextJQuery).fadeIn(o.fadeSpeed, function () {
                    $(nextJQuery).delay(o.pauseSpeed + extendedPauseOnStart).fadeOut(o.fadeSpeed, function () {
                        goNext(this, scope);
                    })
                });
            });
        },
        rotateratorTextClicked: function(){
            //nextJQuery.dequeue();
            $(nextJQuery).dequeue();
        },
        rotateratorClickedBar: function(index, scope){
            indexClicked = index;
            $(nextJQuery).dequeue();
            // try {
            //     nextJQuery.dequeue();
            // } catch(e){
            //     $(nextJQuery).dequeue();
            // }
        }
    });

    function setHeaderText(txt, scope){
        try {
            txt = txt || [];
            txt = txt.innerText || txt[0].innerText;
        } catch(e){
            txt = '';
        }
        scope.$apply(function () {
            scope.setHeaderText = txt;
        });
    }

    function goNext(next, scope){
        extendedPauseOnStart = 0;
        var tNext = $(next).next();
        if(indexClicked !== null){
            var items = $(obj.children(), obj);
            tNext = items.get(indexClicked);
        }

        scope.$apply(function () {
            scope.selectedIndexOfRot = (indexClicked === null) ? scope.selectedIndexOfRot + 1 : indexClicked;
        });

        indexClicked = null;
        if (tNext.length == 0) {
            tNext = $(obj).children(':first');
            scope.$apply(function () {
                scope.selectedIndexOfRot = 0;
            });
        }
        $(obj).rotaterator({child: tNext, fadeSpeed: o.fadeSpeed, pauseSpeed: o.pauseSpeed}, scope);
    }
})(jQuery);