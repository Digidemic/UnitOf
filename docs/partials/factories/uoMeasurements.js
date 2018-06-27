app.factory('UOMeasurements', function() {
    return [
        {
            measurement: {uo: 'length', text: 'Length'},
            units: [
                {uo: 'Centimeters', text: 'Centimeters', abbr: 'cm'},
                {uo: 'Meters', text: 'Meters', abbr: 'm'},
                {uo: 'Millimeters', text: 'Millimeters', abbr: 'mm'},
                {uo: 'Inches', text: 'Inches', abbr: 'in'},
                {uo: 'Feet', text: 'Feet', abbr: 'ft'},
                {uo: 'Miles', text: 'Miles', abbr: 'mi'}
            ]
        },{
            measurement: {uo: 'dataStorage', text: 'Data Storage'},
            units: [
                {uo: 'Bits', text: 'Bits', abbr: 'b'},
                {uo: 'Bytes', text: 'Bytes', abbr: 'bytes'},
                {uo: 'Kilobytes', text: 'Kilobytes', abbr: 'kb'},
                {uo: 'Megabytes', text: 'Megabytes', abbr: 'mb'},
                {uo: 'Gigabytes', text: 'Gigabytes', abbr: 'gb'},
                {uo: 'Terabytes', text: 'Terabytes', abbr: 'tb'}
            ]
        },{
            measurement: {uo: 'time', text: 'Time'},
            units: [
                {uo: 'Milliseconds', text: 'Milliseconds', abbr: 'ms'},
                {uo: 'Seconds', text: 'Seconds', abbr: 's'},
                {uo: 'Minutes', text: 'Minutes', abbr: 'min'},
                {uo: 'Hours', text: 'Hours', abbr: 'hr'},
                {uo: 'Days', text: 'Days', abbr: 'd'},
                {uo: 'Years', text: 'Years', abbr: 'y'}
            ]
        },{
            measurement: {uo: 'mass', text: 'Mass'},
            units: [
                {uo: 'Kilograms', text: 'Kilograms', abbr: 'kg'},
                {uo: 'Grams', text: 'Grams', abbr: 'g'},
                {uo: 'Milligrams', text: 'Milligrams', abbr: 'mg'},
                {uo: 'Pounds', text: 'Pounds', abbr: 'lb'},
                {uo: 'OuncesUS', text: 'Ounces', abbr: 'oz'},
                {uo: 'TonsUS', text: 'Tons', abbr: 't'}
            ]
        },{
            measurement: {uo: 'angle', text: 'Angle'},
            units: [
                {uo: 'Degrees', text: 'Degrees', abbr: 'deg'},
                {uo: 'Radians',  text: 'Radians', abbr: 'rad'},
                {uo: 'Gradians', text: 'Gradians', abbr: 'grad'},
                {uo: 'Revolutions', text: 'Revolutions', abbr: 'rev'},
                {uo: 'Quadrants', text: 'Quadrants', abbr: 'quad'},
                {uo: 'Sextants', text: 'Sextants', abbr: 'sext'}
            ]
        },{
            measurement: {uo: 'volume', text: 'Volume'},
            units: [
                {uo: 'CupsUS', text: 'Cups', abbr: 'cup'},
                {uo: 'GallonsUS', text: 'Gallons', abbr: 'gal'},
                {uo: 'Liters', text: 'Liters', abbr: 'ltr'},
                {uo: 'FluidOuncesUS', text: 'Ounces', abbr: 'floz'},
                {uo: 'PintsUS', text: 'Pints', abbr: 'pt'},
                {uo: 'QuartsUS', text: 'Quarts', abbr: 'qt'}
            ]
        }
    ]
});