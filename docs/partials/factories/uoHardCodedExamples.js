app.factory('UOHardCodedExamples', function() {
    return {
        oneLiner: {
            java: 'double foo = new UnitOf.Mass().fromPounds(<span class="c-input">5</span>).toKilograms();&nbsp;//2.26796 returned as 5 pounds is 2.26796 kilograms',
            javascript: 'var foo = UnitOf.Mass.fromPounds(<span class="c-input">5</span>).toKilograms;&nbsp;//2.26796 returned as 5 pounds is 2.26796 kilograms',
            csharp: 'double foo = new UnitOf.Mass().FromPounds(<span class="c-input">5</span>).ToKilograms();&nbsp;//2.26796 returned as 5 pounds is 2.26796 kilograms'
        },
        setThenConvert_1: {
            java: 'UnitOf.Length feet = new UnitOf.Length().fromFeet(<span class="c-input">5.5</span>);&nbsp;//Instantiate UnitOf.Length and set &quot;feet&quot; as 5.5',
            javascript: 'var feet = UnitOf.Length.fromFeet(<span class="c-input">5.5</span>);&nbsp;//Instantiate UnitOf.Length and set &quot;feet&quot; as 5.5',
            csharp: 'UnitOf.Length feet = new UnitOf.Length().FromFeet(<span class="c-input">5.5</span>);&nbsp;//Instantiate UnitOf.Length and set &quot;feet&quot; as 5.5'
        },
        setThenConvert_2: {
            java: 'double foo = feet.toInches();&nbsp;//66 returned as 5.5 feet is 66 inches',
            javascript: 'var foo = feet.toInches;&nbsp;//66 returned as 5.5 feet is 66 inches',
            csharp: 'double foo = feet.ToInches();&nbsp;//66 returned as 5.5 feet is 66 inches'
        },
        setThenConvert_3: {
            java: 'double bar = feet.toMeters();&nbsp;//1.6764 returned as 5.5 feet is 1.6764 meters',
            javascript: 'var bar = feet.toMeters;&nbsp;//1.6764 returned as 5.5 feet is 1.6764 meters',
            csharp: 'double bar = feet.ToMeters();&nbsp;//1.6764 returned as 5.5 feet is 1.6764 meters'
        },
        dataTypeAndFractions_1: {
            java: 'double foo = new UnitOf.DataType(<span class="c-input">&quot;12.5&quot;</span>).toDouble();&nbsp;//12.5 of type double returned. 0.0 would be returned if conversion failed',
            javascript: 'var foo = UnitOf.DataType(<span class="c-input">&quot;12.5&quot;</span>).toFloat();&nbsp;//12.5 of type Float returned. 0 would be returned if conversion failed',
            csharp: 'double foo = new UnitOf.DataType(<span class="c-input">&quot;12.5&quot;</span>).ToDouble();&nbsp;//12.5 of type double returned. 0 would be returned if conversion failed'
        },
        dataTypeAndFractions_2: {
            java: 'int bar = new UnitOf.DataType(<span class="c-input">&quot;Not A Number&quot;</span>).toInt(<span class="c-input">10</span>);&nbsp;//10 of type int returned as conversion fails',
            javascript: 'var bar = UnitOf.DataType(<span class="c-input">&quot;Not A Number&quot;</span>).toInt(<span class="c-input">10</span>);&nbsp;//10 of type Int returned as conversion fails',
            csharp: 'int bar = new UnitOf.DataType(<span class="c-input">&quot;Not A Number&quot;</span>).ToInt(<span class="c-input">10</span>);&nbsp;//10 of type int returned as conversion fails'
        },
        dataTypeAndFractions_3: {
            java: 'String foobar = new UnitOf.DataType(<span class="c-input">0.5</span>).toFraction();&nbsp;//&quot;1/2&quot; of type String returned. Empty string would be returned if failed',
            javascript: 'var foobar = UnitOf.DataType(<span class="c-input">0.5</span>).toFraction();&nbsp;//&quot;1/2&quot; of type string returned. Empty string would be returned if failed',
            csharp: 'String foobar = new UnitOf.DataType(<span class="c-input">0.5</span>).ToFraction();&nbsp;//&quot;1/2&quot; of type String returned. Empty string would be returned if failed'
        },
        createAnything_2: {
            java: 'double foo = x.convertNow(<span class="c-input">36</span>, <span class="c-input">&quot;INCHES&quot;</span>, <span class="c-input">&quot;FEET&quot;</span>);&nbsp;//3 returned as 36 inches is 3 feet',
            javascript: 'var foo = x.convertNow(<span class="c-input">36</span>, <span class="c-input">&quot;INCHES&quot;</span>, <span class="c-input">&quot;FEET&quot;</span>);&nbsp;//3 returned as 36 inches is 3 feet',
            csharp: 'double foo = x.ConvertNow(<span class="c-input">36</span>, <span class="c-input">&quot;INCHES&quot;</span>, <span class="c-input">&quot;FEET&quot;</span>);&nbsp;//3 returned as 36 inches is 3 feet'
        },
        createAnything_3: {
            java: 'double bar = x.convertNow(<span class="c-input">3</span>, <span class="c-input">&quot;FEET&quot;</span>, <span class="c-input">&quot;METERS&quot;</span>);&nbsp;//0.9144 returned as 3 feet is 0.9144 meters',
            javascript: 'var bar = x.convertNow(<span class="c-input">&quot;3&quot;</span>, <span class="c-input">&quot;FEET&quot;</span>, <span class="c-input">&quot;METERS&quot;</span>);&nbsp;//0.9144 returned as 3 feet is 0.9144 meters',
            csharp: 'double bar = x.ConvertNow(<span class="c-input">3</span>, <span class="c-input">&quot;FEET&quot;</span>, <span class="c-input">&quot;METERS&quot;</span>);&nbsp;//0.9144 returned as 3 feet is 0.9144 meters'
        }
    };
});