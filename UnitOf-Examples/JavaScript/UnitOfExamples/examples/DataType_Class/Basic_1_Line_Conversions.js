/**
 * https://github.com/Digidemic/UnitOf
 * (c) 2018 DIGIDEMIC, LLC - All Rights Reserved
 * UnitOf developed by Adam Steinberg of DIGIDEMIC, LLC
 * License: Apache License 2.0
 *
 * ====
 *
 * Copyright 2018 DIGIDEMIC, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

'use strict';

/**
 * Convert any JavaScript data type and more including converting to and from fractions.
 *
 * Default Values:
 *
 * When a conversion in DataType fails its default, passed by caller as a parameter or if not uses UnitOf's defaults, is returned.
 * UnitOf defaults (when no parameter is passed) for each function are as follows:
 * toString(): ""
 * toBoolean(): false
 * toNumber(): 0
 * toChar(): ""
 * toInt(): 0
 * toFloat(): 0
 * toFraction(): ""
 *
 * NOTE: all functions of toNumber, toInt, and toFloat functions on failure will attempt to read the value as a fraction and convert it to a decimal form.
 * This is to account for fractions originally passed in as Strings to be converted as a number type (EX: "2/4" toFloat() will return 0.5).
 */
var dataTypeOneLiners = function() {

    /*
     Get Passed DataType Value and Type
     */
    var passedDataType = UnitOf.DataType(1.23).getTypeConstantPassed; //Returns "number" as the data type passed in (1.23) is a number.
    var passedValue = UnitOf.DataType(1.23).getValuePassed;           //Returns 1.23 as it is the original value passed.

    /*
     To Float

     Tries to convert the value passed in the UnitOf.DataType() constructor into a float type.
     If this conversion fails the default value (which may be passed in as a parameter) is returned.
     */
    var intToFloat_default0 = UnitOf.DataType(12).toFloat();                //Returns 12.0 from 12 (int). If the conversion did fail, the .toFloat() default value of 0 is returned.
    var floatToFloat_default7 = UnitOf.DataType(12.5).toFloat(7.0);        //Returns 12.5 from 12.5 (float). If the conversion did fail, the .toFloat() passed default value of 7.0 is returned.
    var stringFloatToFloat_default0 = UnitOf.DataType("-12.5").toFloat();  //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toFloat() default value of 0 is returned.
    var booleanToFloat_default7 = UnitOf.DataType(null).toFloat(7.0);       //Conversion fails: Returns 7.0 from null. Because the conversion failed to convert the boolean "true" to a float, its passed default value of 7.0 was returned.
    var fractionToFloat_default0 = UnitOf.DataType("5/2").toFloat();        //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toFloat() default value of 0 is returned.
    var charToFloat_default7 = UnitOf.DataType('5').toFloat(7.0);           //Returns 5.0 from '5' (char). If the conversion did fail, the .toFloat() passed default value of 7.0 is returned.

    /*
     To Int

     Tries to convert the value passed in the UnitOf.DataType() constructor into an int type.
     If this conversion fails the default value (which may be passed in as a parameter) is returned.
     */
    var intToInt_default0 = UnitOf.DataType(12).toInt();                //Returns 12 from 12 (int). If the conversion did fail, the .toInt() default value of 0 is returned.
    var floatToInt_default7 = UnitOf.DataType(12.5).toInt(7);          //Returns 12 from 12.5 (float). If the conversion did fail, the .toInt() passed default value of 7 is returned.
    var stringFloatToInt_default0 = UnitOf.DataType("-12.5").toInt();  //Returns -12 from "-12.5" (String). If the conversion did fail, the .toInt() default value of 0 is returned.
    var booleanToInt_default7 = UnitOf.DataType(null).toInt(7);         //Conversion fails: Returns 7 from null. Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
    var fractionToInt_default0 = UnitOf.DataType("5/2").toInt();        //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .toInt() default value of 0 is returned.
    var charToInt_default7 = UnitOf.DataType('5').toInt(7);             //Returns 5 from '5' (char). If the conversion did fail, the .toInt() passed default value of 7 is returned.

    /*
     To String

     Tries to convert the value passed in the UnitOf.DataType() constructor into a String type.
     If this conversion fails the default value (which may be passed in as a parameter) is returned.
     */
    var intToString_defaultEmptyString = UnitOf.DataType(12).toString();                        //Returns "12" from 12 (int). If the conversion did fail, the .toString() default value of "" is returned.
    var floatToString_defaultFailedTxt = UnitOf.DataType(12.5).toString("Conversion Failed");  //Returns "12.5" from 12.5 (float). If the conversion did fail, the .toString() passed default value of "Conversion Failed" is returned.
    var stringFloatToString_default0 = UnitOf.DataType("-12.5").toString();                    //Returns "-12.5" from "-12.5" (String). If the conversion did fail, the .toString() default value of "" is returned.
    var booleanToString_defaultFailedTxt = UnitOf.DataType(null).toString("Conversion Failed"); //Returns "Conversion Failed" from null. Because the conversion failed to convert the boolean "true" to a String, its passed default value of "Conversion Failed" was returned.
    var fractionToString_default0 = UnitOf.DataType("5/2").toString();                          //Returns "5/2" from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toString() default value of "" is returned.
    var charToString_defaultFailedTxt = UnitOf.DataType('5').toString("Conversion Failed");     //Returns "5" from '5' (char). If the conversion did fail, the .toString() passed default value of "Conversion Failed" is returned.

    /*
     To Boolean - More in its own extended class - examples/DataType_Class/Boolean_Extended_Syntax.js

     Tries to convert the value passed in the UnitOf.DataType() constructor into a boolean type.
     If this conversion fails the default value (which may be passed in as a parameter) is returned.
     */
    var floatToBoolean_defaultFalse = UnitOf.DataType(12.5).toBoolean();                               //Conversion fails: Returns false from 12.5 (float). Because the conversion failed to convert the float "12.5" to a boolean, its default value of false was returned.
    var stringFloatToBoolean_defaultTrue = UnitOf.DataType("-12").toBoolean(true);                     //Conversion fails: Returns true from "-12" (String). Because the conversion failed to convert the String "-12" to a boolean, its passed default value of true was returned.
    var stringBooleanToBoolean_defaultFalse = UnitOf.DataType("TrUe").toBoolean();                      //Returns true from "TrUe" (String). If the conversion did fail, the .toBoolean() default value of false is returned.
    var stringToBoolean_falseIfNotContained = UnitOf.DataType("12.5").toBoolean([5,12,3],false,true);   //(More information on this form of the syntax in Boolean_Extended_Syntax.js)Returns true from "12.5" with containing searching values of 5, 12, and 3. "12" is within "12.5" so true. Otherwise the default of false would have been returned.

    /*
     To Fraction - More in its own extended class - examples/DataType_Class/Fraction_Extended_Syntax.js

     Tries to convert the value passed in the UnitOf.DataType() constructor into a fraction of type String.
     This simplifies existing fraction Strings or turn numeric values into fraction Strings.
     */
    var floatToFraction_default3Over2 = UnitOf.DataType(12.5).toFraction("3/2");                   //Returns "25/2" from 12.5 (float). If the conversion did fail, the .toFraction() passed default value of "3/2" is returned.
    var stringFloatToFraction_defaultEmptyString = UnitOf.DataType("-12.5").toFraction();          //Returns "-25/2" from 12.5 (float). If the conversion did fail, the .toFraction() passed default value of "" is returned.
    var stringToFraction_default3Over2 = UnitOf.DataType("Can't make a fraction outta this").toFraction("3/2"); //Conversion fails: Returns "3/2" from "Can't make a fraction outta this" (String). Because the conversion failed to convert the String "Can't make a fraction outta this" to a fraction, its passed default value of "3/2" was returned.
    var reducableFractionToFraction_defaultEmptyString = UnitOf.DataType("2/4").toFraction();       //Returns "1/2" from "2/4" (String fraction). If the conversion did fail, the .toFraction() passed default value of "" is returned.
    var simplifiableFractionToFraction_defaultEmptyString = UnitOf.DataType("5/2").toFraction();    //Returns "5/2" from "5/2" (String fraction). If the conversion did fail, the .toFraction() passed default value of "" is returned.

    /*
     Fraction String to Decimal

     Demonstrates that fractions as strings can be converted into their decimal equivalent.
     */
    var reducableFractionToFloat_default0 = UnitOf.DataType("2/4").toFloat();          //Returns 0.5 from "2/4" (String fraction). If the conversion did fail, the .toFloat() default value of 0 is returned.
    var simplifiableFractionToDecimal_default50 = UnitOf.DataType("5/2").toFloat(50);   //Returns 2.5 from "5/2" (String fraction). If the conversion did fail, the .toFloat() default value of 50 is returned.

    /*
     To Char

     Tries to convert the value passed in the UnitOf.DataType() constructor into a char type.
     If this conversion fails the default value (which may be passed in as a parameter) is returned.
     */
    var intToChar_default0 = UnitOf.DataType(12).toChar();                      //Returns '1' from 12 (int). If the conversion did fail, the .toChar() default value of '' is returned.
    var floatToChar_default7 = UnitOf.DataType(12.5).toChar('@');              //Returns '1' from 12.5 (float). If the conversion did fail, the .toChar() passed default value of '@' is returned.
    var stringFloatToChar_default0 = UnitOf.DataType("-12.5").toChar();        //Returns '-' from "-12.5" (String). If the conversion did fail, the .toChar() default value of '' is returned.
    var booleanToChar_default7 = UnitOf.DataType(true).toChar('@');             //Returns 't' from '@' (char). If the conversion did fail, the .toChar() passed default value of '@' is returned.
    var stringTextToChar_default0 = UnitOf.DataType("String Example").toChar(); //Returns 'S' from "String Example" (String). If the conversion did fail, the .toChar() default value of '' is returned.

    /*
     To Number

     Tries to convert the value passed in the UnitOf.DataType() constructor into a numeric type (includes integer and float).
     If this conversion fails the default value (which may be passed in as a parameter) is returned.
     */
    var intToNumber_default0 = UnitOf.DataType(12).toNumber();                  //Returns 12.0 from 12 (int). If the conversion did fail, the .toFloat() default value of 0 is returned.
    var floatToNumber_default7 = UnitOf.DataType(12.5).toNumber(7.0);          //Returns 12.5 from 12.5 (float). If the conversion did fail, the .toNumber() passed default value of 7.0 is returned.
    var stringFloatToNumber_default0 = UnitOf.DataType("-12.5").toNumber();    //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toNumber() default value of 0 is returned.
    var booleanToNumber_default7 = UnitOf.DataType(null).toNumber(7.0);         //Conversion fails: Returns 7.0 from null. Because the conversion failed to convert the boolean "true" to a number, its passed default value of 7.0 was returned.
    var fractionToNumber_default0 = UnitOf.DataType("5/2").toNumber();          //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toNumber() default value of 0 is returned.
    var charToNumber_default7 = UnitOf.DataType('5').toNumber(7.0);             //Returns 5.0 from '5' (char). If the conversion did fail, the .toNumber() passed default value of 7.0 is returned.


    /*
     -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
     Print Conversions
     -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
     */
    var results = '';
    p("-=-=-=-=-\nType and Value passed in (1.23 as a float)");
    pt("Passed Data Type: " + passedDataType);  //Returns "number" as the data type passed in (1.23) is a number.
    pt("Passed Value: " + passedValue);         //Returns 1.23 as it is the original value passed.

    p("-=-=-=-=-\nConverted toFloat()");
    pt("intToFloat_default0: " + intToFloat_default0);                      //Returns 12.0 from 12 (int). If the conversion did fail, the .toFloat() default value of 0 is returned.
    pt("floatToFloat_default7: " + floatToFloat_default7);                //Returns 12.5 from 12.5 (float). If the conversion did fail, the .toFloat() passed default value of 7.0 is returned.
    pt("stringFloatToFloat_default0: " + stringFloatToFloat_default0);    //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toFloat() default value of 0 is returned.
    pt("booleanToFloat_default7: " + booleanToFloat_default7);              //Conversion fails: Returns 7.0 from null. Because the conversion failed to convert the boolean "true" to a float, its passed default value of 7.0 was returned.
    pt("fractionToFloat_default0: " + fractionToFloat_default0);            //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toFloat() default value of 0 is returned.
    pt("charToFloat_default7: " + charToFloat_default7);                    //Returns 5.0 from '5' (char). If the conversion did fail, the .toFloat() passed default value of 7.0 is returned.

    p("-=-=-=-=-\nConverted toInt()");
    pt("intToInt_default0: " + intToInt_default0);                      //Returns 12 from 12 (int). If the conversion did fail, the .toInt() default value of 0 is returned.
    pt("floatToInt_default7: " + floatToInt_default7);                //Returns 12 from 12.5 (float). If the conversion did fail, the .toInt() passed default value of 7 is returned.
    pt("stringFloatToInt_default0: " + stringFloatToInt_default0);    //Returns -12 from "-12.5" (String). If the conversion did fail, the .toInt() default value of 0 is returned.
    pt("booleanToInt_default7: " + booleanToInt_default7);              //Conversion fails: Returns 7 from null. Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
    pt("fractionToInt_default0: " + fractionToInt_default0);            //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .toInt() default value of 0 is returned.
    pt("charToInt_default7: " + charToInt_default7);                    //Returns 5 from '5' (char). If the conversion did fail, the .toInt() passed default value of 7 is returned.

    p("-=-=-=-=-\nConverted toString()");
    pt("intToString_defaultEmptyString: " + intToString_defaultEmptyString);        //Returns "12" from 12 (int). If the conversion did fail, the .toString() default value of "" is returned.
    pt("floatToString_defaultFailedTxt: " + floatToString_defaultFailedTxt);      //Returns "12.5" from 12.5 (float). If the conversion did fail, the .toString() passed default value of "Conversion Failed" is returned.
    pt("stringFloatToString_default0: " + stringFloatToString_default0);          //Returns "-12.5" from "-12.5" (String). If the conversion did fail, the .toString() default value of "" is returned.
    pt("booleanToString_defaultFailedTxt: " + booleanToString_defaultFailedTxt);    //Returns "Conversion Failed" from null. Because the conversion failed to convert the boolean "true" to a String, its passed default value of "Conversion Failed" was returned.
    pt("fractionToString_default0: " + fractionToString_default0);                  //Returns "5/2" from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toString() default value of "" is returned.
    pt("charToString_defaultFailedTxt: " + charToString_defaultFailedTxt);          //Returns "5" from '5' (char). If the conversion did fail, the .toString() passed default value of "Conversion Failed" is returned.

    p("-=-=-=-=-\nConverted toBoolean()");
    pt("floatToBoolean_defaultFalse: " + floatToBoolean_defaultFalse);                //Conversion fails: Returns false from 12.5 (float). Because the conversion failed to convert the float "12.5" to a boolean, its default value of false was returned.
    pt("stringFloatToBoolean_defaultTrue: " + stringFloatToBoolean_defaultTrue);      //Conversion fails: Returns true from "-12" (String). Because the conversion failed to convert the String "-12" to a boolean, its passed default value of true was returned.
    pt("stringBooleanToBoolean_defaultFalse: " + stringBooleanToBoolean_defaultFalse);  //Returns true from "TrUe" (String). If the conversion did fail, the .toBoolean() default value of false is returned.
    pt("stringToBoolean_falseIfNotContained: " + stringToBoolean_falseIfNotContained);  //(More information on this form of the syntax in Boolean_Extended_Syntax.js)Returns true from "12.5" with containing searching values of 5, 12, and 3. "12" is within "12.5" so true. Otherwise the default of false would have been returned.

    p("-=-=-=-=-\nConverted toFraction()");
    pt("floatToFraction_default3Over2: " + floatToFraction_default3Over2);                        //Returns "25/2" from 12.5 (float). If the conversion did fail, the .toFraction() passed default value of "3/2" is returned.
    pt("stringFloatToFraction_defaultEmptyString: " + stringFloatToFraction_defaultEmptyString);  //Returns "-25/2" from 12.5 (float). If the conversion did fail, the .toFraction() passed default value of "" is returned.
    pt("stringFloatToFraction_defaultEmptyString: " + stringFloatToFraction_defaultEmptyString);  //Returns "-25/2" from 12.5 (float). If the conversion did fail, the .toFraction() passed default value of "" is returned.
    pt("stringToFraction_default3Over2: " + stringToFraction_default3Over2);                        //Conversion fails: Returns "3/2" from "Can't make a fraction outta this" (String). Because the conversion failed to convert the String "Can't make a fraction outta this" to a fraction, its passed default value of "3/2" was returned.
    pt("reducableFractionToFraction_defaultEmptyString: " + reducableFractionToFraction_defaultEmptyString);        //Returns "1/2" from "2/4" (String fraction). If the conversion did fail, the .toFraction() passed default value of "" is returned.
    pt("simplifiableFractionToFraction_defaultEmptyString: " + simplifiableFractionToFraction_defaultEmptyString);  //Returns "5/2" from "5/2" (String fraction). If the conversion did fail, the .toFraction() passed default value of "" is returned.

    p("-=-=-=-=-\nConverted Fraction passed toFloat()");
    pt("reducableFractionToFloat_default0: " + reducableFractionToFloat_default0);            //Returns 0.5 from "2/4" (String fraction). If the conversion did fail, the .toFloat() default value of 0 is returned.
    pt("simplifiableFractionToDecimal_default50: " + simplifiableFractionToDecimal_default50);  //Returns 2.5 from "5/2" (String fraction). If the conversion did fail, the .toFloat() default value of 50 is returned.

    p("-=-=-=-=-\nConverted toChar()");
    pt("intToChar_default0: " + intToChar_default0);                    //Returns '1' from 12 (int). If the conversion did fail, the .toChar() default value of '' is returned.
    pt("floatToChar_default7: " + floatToChar_default7);              //Returns '1' from 12.5 (float). If the conversion did fail, the .toChar() passed default value of '@' is returned.
    pt("stringFloatToChar_default0: " + stringFloatToChar_default0);  //Returns '-' from "-12.5" (String). If the conversion did fail, the .toChar() default value of '' is returned.
    pt("booleanToChar_default7: " + booleanToChar_default7);            //Returns 't' from '@' (char). If the conversion did fail, the .toChar() passed default value of '@' is returned.
    pt("stringTextToChar_default0: " + stringTextToChar_default0);      //Returns 'S' from "String Example" (String). If the conversion did fail, the .toChar() default value of '' is returned.

    p("-=-=-=-=-\nConverted toNumber()");
    pt("intToNumber_default0: " + intToNumber_default0);                    //Returns 12.0 from 12 (int). If the conversion did fail, the .toFloat() default value of 0 is returned.
    pt("floatToNumber_default7: " + floatToNumber_default7);              //Returns 12.5 from 12.5 (float). If the conversion did fail, the .toNumber() passed default value of 7.0 is returned.
    pt("stringFloatToNumber_default0: " + stringFloatToNumber_default0);  //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toNumber() default value of 0 is returned.
    pt("booleanToNumber_default7: " + booleanToNumber_default7);            //Conversion fails: Returns 7.0 from null. Because the conversion failed to convert the boolean "true" to a number, its passed default value of 7.0 was returned.
    pt("fractionToNumber_default0: " + fractionToNumber_default0);          //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toNumber() default value of 0 is returned.
    pt("charToNumber_default7: " + charToNumber_default7);                  //Returns 5.0 from '5' (char). If the conversion did fail, the .toNumber() passed default value of 7.0 is returned.

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    //Print object passed, starting with a tab
    function pt(o){
        p("\t" + o);
    }

    //Print object passed
    function p(o){
        results += o + '<br />';
    }

    return results;
};