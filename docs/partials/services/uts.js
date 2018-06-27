app.service('Uts', function(){
    var self = this;
    this.carouselSelectedRGBA = "rgba(0, 0, 0, 0.8)";
    this.carouselRestRGBA = "rgba(0, 0, 0, 0.4)";
    this.carouselTextColor = "rgba(255, 255, 255, 0.6)";
    this.carouselTextSelectedColor = "rgba(255, 255, 255, 1)";
    this.UnitOfJS = UnitOf;

    this.getDegree = function(index, arrLength){
        return (360 / arrLength) * index;
    };

    this.pascalCase = function(str){
        str = str || '  ';
        return str.charAt(0).toUpperCase() + str.slice(1);
    };

    this.camelCase = function(str){
        str = str || '  ';
        return str.charAt(0).toLowerCase() + str.slice(1);
    };

    // this.roundTo = function(n, digits) {
    //     if (digits === undefined) {
    //         digits = 0;
    //     }
    //
    //     var multiplicator = Math.pow(10, digits);
    //     n = parseFloat((n * multiplicator).toFixed(11));
    //     return (Math.round(n) / multiplicator).toFixed(2);
    // };
});