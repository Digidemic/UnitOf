app.factory('UOFAQ', function() {
    return [
        {
            icon: 'fa fa-puzzle-piece',
            question: 'Besides adding UnitOf to my project, are there any other dependencies needed?',
            answer: 'A BigInteger library is only required for JavaScript\'s version of UnitOf.NumericBase.' +
            'The following was used in developing/testing UnitOf and is recommended: https://peterolson.github.io/BigInteger.js/BigInteger.min.js'
        },{
            icon: 'fa fa-download',
            question: 'Any examples I can download and run on my computer?',
            answer: 'Yes, download the UnitOf .zip or see the main GitHub page (links to both at the top right of the page). ' +
            'There are also live examples within the documentation of the UnitOf website.'
        },{
            icon: 'fa fa-star-half-o',
            question: 'Some measurements and units I need are missing from UnitOf',
            answer: 'UnitOf.Anything was added for the inevitability that someone would eventually have this sort of issue. ' +
            'With this, you can create your own measurement or add your own units at compile or runtime! ' +
            'See the documentation of "Anything" for more information.'
        },{
            icon: 'fa fa-question',
            question: 'Why are all the \"to\" variables in JavaScript constants yet methods in Java and C#?',
            answer: 'In short, JavaScript\'s file size and performance was far worse as functions than constants. ' +
            'As of v1.0.0.0, the minified Javascript version of UnitOf is 63.6kb. ' +
            'Adding \"function(){return c(v)}\" alone to over 1,400 lines of code would have added over 24kb to the minified JavaScript version of UnitOf. ' +
            'That is an almost 40% increase with no real gain! ' +
            'In addition, the performance of JavaScript\'s UnitOf was slower as functions than constants. ' +
            'Writing a test script for both the function and constant JavaScript version of UnitOf to perform every conversion combination 100,000 times on all 5 major browser resulted in the function test taking 20% longer to finish than the constants.'
        },{
            icon: 'fa fa-code',
            question: 'Looking at the code, what\'s with the naming of classes, methods, and other elements as random letters?',
            answer: 'Obsessing over compiled file sizes, performance, and consistent syntax amongst the 3 languages led to the shortened names in the code of UnitOf. ' +
            'During development, many experiments and tests were performed to see how slight changes in the naming conventions would affect the overall size of the final product. ' +
            'These changes to just a few letters resulted in better performance and smaller compiled size across all 3 languages.' +
            'It was also important to try to have the syntax of all 3 languages as closely related as possible. ' +
            'Because JavaScript is an interpreted language, the amount of letters used here needed to be as few as possible. ' +
            'This ultimately affected the namings in the other languages as well. ' +
            'At the end of the day, we are proud to offer UnitOf in its entirety of 22 measurements for as little as 63.6kb.'
        },{
            icon: 'fa fa-clock-o',
            question: 'UnitOf is great! Is there anything else coming soon?',
            answer: 'Yes! More measurements, units, and a site upgrade to allow custom UnitOf libraries to be built! ' +
            'If you have any suggestions please email us at digidemic@gmail.com'
        }
    ]
});