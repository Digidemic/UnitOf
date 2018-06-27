app.factory('UOFeatures', function() {
    return [
        {
            name: 'Easy Usage',
            icon: 'fa fa-trophy',
            items: [
                {
                    text: 'Standalone solution',
                    info: 'Just import the single file of UnitOf into your project and you\'re done! No additional library dependencies needed for proper installation. See the GitHub for more details on installation.'
                },{
                    text: 'One line conversions',
                    info: 'Perform single line conversions simply by defining your "from" unit & value then appending your desired "to" unit. That\'s it! UnitOf will do everything else and return the conversion.'
                },{
                    text: 'Simple & coherent syntax',
                    info: 'Easy to use syntax that anyone can pick up and grasp. It\'s short syntax that is written the way it sounds.'
                },{
                    text: 'No math knowledge needed',
                    info: 'Seriously, no knowledge of how units are converted is needed on your part. The only input needed is your starting value. You will never need to know how many inches are in a meter or seconds in an hour, it\'s all built-in!'
                },{
                    text: 'No nulls or conversion errors',
                    info: 'Parsing data types in code is always so prone to throwing errors. Developers are normally obligated to use an ugly try/catch to anticipate the potential error only bloating the code. This is not the case with UnitOf.DataType. UnitOf.DataType will never throw an exception or return null when converting data types (unless null is explicitly passed as the default). UnitOf.DataType supports the passing in of a default value in the event a parse fails (like the string "example" parsed into integer). When a default value is passed in it will only be returned if the conversion fails. Otherwise the predefined UnitOf default value of the "to" data type will be returned if the data type conversion fails. Note: UnitOf.NumericBase can throw an exception as out of bounds characters can be passed in.'
                },{
                    text: 'No more messy conversion code',
                    info: 'No more having to define conversion factor variables or formulas using precious space and memory. UnitOf performs conversions with a single line using its built in formulas!'
                },{
                    text: 'Easy installation',
                    info: 'Because UnitOf is compiled down to a single file (per language) it is the only file you will need! See the GitHub for more details on installation.'
                },{
                    text: 'npm install unitof',
                    info: 'Easily install the minified javascript version of UnitOf with npm. Install using the following command: npm install unitof'
                },{
                    text: 'Free & open-sourced on GitHub',
                    info: 'Link to the main GitHub page at the top right of the page.<br>https://github.com/Digidemic/UnitOf)'
                }
            ]
        },{
            name: 'Flexible',
            icon: 'fa fa-magic',
            items: [
                {
                    text: 'For sole developers or large teams',
                    info: 'Perfect for teams anywhere in the world. For the same project, one team can define their units in imperial while the other can be in metric. Once initialized, the measurement is stateless. It can be viewed as any other unit in the measurement despite the unit it started in!'
                },{
                    text: 'Minimal specs needed',
                    info: 'UnitOf was designed to work with older software for maximum backwards compatibility.<br><br><u>Minimum specs required per language</u><br><b>Java</b>: 1.5<br><b>C#</b>: .NET 2.0<br><b>JavaScript</b>: N/A - pure JavaScript, no additional plugins needed (Even compatible with Internet Explorer IE).'
                },{
                    text: 'Parse programming data types',
                    info: 'UnitOf not only converts conventional measurements but programming data types as well. UnitOf provides an easy way to pass in ANY native data type to be parsed into any other without error.'
                },{
                    text: 'Create your own measurements',
                    info: 'Is UnitOf missing some units or measurements? No problem! Create your own measurement or add your own units at compile or runtime in as little as a single line with UnitOf.Anything.'
                },{
                    text: '22 unique measurements',
                    info: '20 of the most common conventional measurements predefined with all their most used units and then some. The 2 other measurements being "Data type" and "Anything". UnitOf.DataType varies between all programming languages by containing ALL of their defined language\'s data types. Parse from or to any data type with the UnitOf.DateType measurement. UnitOf.Anything taps into the backbone of UnitOf allowing you to create your own measurements at compile or runtime in as little as a single line of code.'
                },{
                    text: 'Android compatible',
                    info: 'UnitOf is fully supported for Android projects and apps. See the GitHub for more information on installing through Android Studio.'
                },{
                    text: 'Compare collections of data',
                    info: 'UnitOf.DataType.toBoolean() can find if a value exists in a collection of data. See the documentation of "Data Type" for more information.'
                },{
                    text: 'No limit of decimal places',
                    info: 'UnitOf offers extremely accurate conversions without a set limit of decimal places. When a conversion is performed in UnitOf it will not round to the nearest 2nd or 3rd decimal place like most tools do. Instead it returns the max decimal place the language will allow (if the conversion has an excess number of decimal places that is). This allows the developer to decide how many decimal places they would want their conversion to be while stay as accurate and true to form as possible.'
                },{
                    text: 'Fraction simplification and conversions',
                    info: 'UnitOf.DataType.toDouble() allows a passed in fraction (type string) to be converted into its decimal equivalent. Contrarily, UnitOf.DataType.toFraction() converts a number into its simplified fraction equivalent (type string). UnitOf.DataType.toFraction() also has the ability to take an existing fraction (type string) and return its lowest common denominator.'
                }
            ]
        },{
            name: 'Love & Care',
            icon: 'fa fa-heart',
            items: [
                {
                    text: 'Built from the ground up',
                    info: 'Built from scratch using no additional plugins or frameworks to allow full backwards compatibility on any of the 3 supported languages: Java, JavaScript, and C#'
                },{
                    text: 'Stateless forms of measurement',
                    info: 'Every UnitOf variable initialization is made stateless. ' +
                    'It is stateless, meaning that the original value and unit passed never needs to be known or persisted again, the unit variable can now be observed in any of the measurement\'s units regardless of what the unit started as. ' +
                    'This removes the potential confusion of converting from/to imperial/metric. Thus allowing projects built with UnitOf being perfect for teams all over the globe. ' +
                    'For the same project, one team can define their units in imperial while the other can be in metric.'
                },{
                    text: 'Available in the 3 languages',
                    info: 'UnitOf is available in the top 3 "in-demand" programming languages: Java, JavaScript, and C#'
                },{
                    text: 'For beginner & experienced developers',
                    info: 'Easy to use syntax that anyone can pick up and grasp. It\'s short syntax that is written the way it sounds.'
                },{
                    text: 'Minimized source code (64kb)',
                    info: 'Small in size was a must from the start of UnitOf\'s development. Syntax minimized to be as few kilobytes as possible.<br><br><u>As of version 1.0.0.0</u><br><b>JavaScript</b>: 63.6kb<br><b>Java</b>: 72.2kb<br><b>C#</b>: 98.0kb'
                },{
                    text: 'Fast & efficient conversions',
                    info: 'Converting both units of measure and data type in UnitOf is fast and efficient. Simple arithmetic is performed for all of UnitOf\'s conventional measurement conversions to be lightweight, fast, and memory-efficient. UnitOf.DataType performs a similar set of steps with a built-in caching mechanism for faster returns and more efficient in memory management.'
                },{
                    text: 'Palindrome Conversion Algorithm',
                    info: 'Digidemic\'s own conversion algorithm is used as the backbone of UnitOf to keep it lightweight, fast, and small in size. Read more about this in our "Palindrome Conversion Algorithm" section.'
                },{
                    text: 'Personal & commercial use',
                    info: 'UnitOf is free and is licensed under the Apache License 2.0'
                },{
                    text: 'Serializable',
                    info: 'For Java & C# users, the entire UnitOf suite can be serialized (converted to and from a byte stream).'
                }
            ]
        }
    ]
});