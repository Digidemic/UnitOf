$(function() {
    $('.zoomImg').hover(function() {
        var newSize = $('.zoomImg').height() * 0.9;
        var sectionHeight = $('.section-resize').height();
        $('.section-resize').css('height', (sectionHeight + newSize) + 'px');
        $('.zoomImgText').css('display', 'none');
    }, function() {
        $('.section-resize').css('height', '');
        $('.zoomImgText').css('display', '');
    });
});