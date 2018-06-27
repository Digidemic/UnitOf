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
 * NOTE: toNumber, toInt, and toFloat  functions on failure will attempt to read the value as a fraction and convert it to a decimal form.
 * This is to account for fractions originally passed in as Strings to be converted as a number type (EX: "2/4" toFloat() will return 0.5).
 */
var dataTypeTwoSteps = function() {
    var results = '';

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    /*
     Our initial value of "12.5" as type String is passed into our new instance of UnitOf.DataType.
     UnitOf.DataType determines the type passed in making it unnecessary for the user to have to manually define this.
     Below are also just a few examples of what can be passed in
     */
    p("\n-=-=-=-=-=-=-=-=-\nDataType_Class > Basic_2_Step_Conversions");
    p("-=-=-=-=-\nInstantiating UnitOf.DataType(\"12.5\")");
    var uoDataType = UnitOf.DataType("12.5");   //String passed in.
    //dt = UnitOf.DataType(12.5);               //Example of float passed in.
    //dt = UnitOf.DataType(12);                 //Example of int passed in.
    //dt = UnitOf.DataType('$');                //Example of char pssed in.
    //dt = UnitOf.DataType(false);              //Example of boolean passed in.
    //dt = UnitOf.DataType("12.5");             //Back to our example, 12.5 in string form
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

    /*
     getTypeConstantPassed and getValuePassed return the variable type and value passed in respectively.
     Because we passed in "12.5" as a String, the getTypeConstantPassed will return the word "String".
     getValuePassed will return "12.5" as a string since that is how it was passed in.
     */
    var dataTypePassedType = uoDataType.getTypeConstantPassed; //The word "String" is returned
    var dataTypePassedValue = uoDataType.getValuePassed;       //"12.5" as a String is returned


    /*
     Returns an float equivalent of what was passed in as the DataType value, "12.5".
     If the conversion fails, The user defined parameter passed is returned.
     Otherwise if nothing is passed in the UnitOf.toFloat() default value of 0 is returned.
     */
    var floatDefault0 = uoDataType.toFloat();           //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.toFloat() default value of 0 is returned.
    var floatDefault1dot23f = uoDataType.toFloat(1.23); //Returns 12.5 If the conversion did fail, 1.23 would be returned.


    /*
     Returns an int equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5".
     If the conversion fails, The user defined parameter passed is returned.
     Otherwise if nothing is passed in the UnitOf.toInt() default value of 0 is returned.
     */
    var intDefault0 = uoDataType.toInt();           //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.toInt() default value of 0 is returned.
    var intDefaultNeg25 = uoDataType.toInt(-25);    //Returns 12 If the conversion did fail, -25 would be returned.


    /*
     Returns a String equivalent of what was passed in as the DataType value, "12.5".
     If the conversion fails, The user defined parameter passed is returned.
     Otherwise if nothing is passed in the UnitOf.toString() default value of "" is returned.
     */
    var stringDefaultEmptyStr = uoDataType.toString();          //String equivalent of "12.5" is returned, If the conversion did fail, the UnitOf.toString() default value of null is returned.
    var stringDefault1dot23Str = uoDataType.toString("1.23");   //Returns "12.5" If the conversion did fail, "1.23" would be returned.


    /*
     Returns a boolean equivalent of what was passed in as the DataType value, "12.5".
     If the conversion fails, The user defined parameter passed is returned.
     Otherwise if nothing is passed in the UnitOf.toBoolean() default value of false is returned.
     NOTE: More in its own extended class - examples/DataType_Class/Boolean_Extended_Syntax.js
     */

    var booleanDefaultFalse = uoDataType.toBoolean();       //Conversion fails: false is returned. No default was passed in so the UnitOf.toBoolean() default of false is returned.
    var booleanDefaultTrue = uoDataType.toBoolean(true);    //Conversion fails: true is returned. Default of true was passed in so it is returned


    /*
     Returns a String fraction equivalent of what was passed in as the DataType value, "12.5".
     If the conversion fails, The user defined parameter passed is returned.
     Otherwise if nothing is passed in the UnitOf.toFraction() default value of "" is returned.
     */
    var fractionDefaultEmpty = uoDataType.toFraction();          //Returns "25/2" passed in as 25 divided by 2 equals the DataType value passed in, 12.5. If the conversion did fail, the UnitOf.toFraction() default value of "" is returned.
    var fractionDefault2Slash5 = uoDataType.toFraction("2/5");   //Returns "25/2" If the conversion did fail, "2/5" would be returned.

    /*
     Returns a char equivalent by taking the first non-spaced character of what was passed in as the DataType value, "12.5".
     If the conversion fails, The user defined parameter passed is returned.
     Otherwise if nothing is passed in the UnitOf.toChar() default value of '\u0000' is returned.
     */
    var charDefaultCharNul = uoDataType.toChar();      //Returns '1' as it is the first non-spaced character of "12.5" passed in , If the conversion did fail, the UnitOf.toChar() default value of '\u0000' is returned.
    var charDefaultAtSign = uoDataType.toChar('@');    //Returns '1' If the conversion did fail, '@' would be returned.

    /*
     Returns a number equivalent of what was passed in as the DataType value, "12.5".
     If the conversion fails, The user defined parameter passed is returned.
     Otherwise if nothing is passed in the UnitOf.toNumber() default value of 0 is returned.
     */
    var numberDefault0 = uoDataType.toNumber();             //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.toFloat() default value of 0 is returned.
    var numberDefault1dot23f = uoDataType.toNumber(1.23);   //Returns 12.5 If the conversion did fail, 1.23f would be returned.


    /*
     -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
     Print Conversions
     -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
     */
    p("-=-=-=-=-\nType and Value Originally passed in (\"12.5\" as a String)");
    pt(dataTypePassedType);     //The word "String" is returned
    pt(dataTypePassedValue);    //"12.5" as a String is returned

    p("-=-=-=-=-\nConverted \"12.5\" toFloat()");
    pt(floatDefault0);          //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.toFloat() default value of 0 is returned.
    pt(floatDefault1dot23f);    //Returns 12.5 If the conversion did fail, 1.23 would be returned.

    p("-=-=-=-=-\nConverted \"12.5\" toInt()");
    pt(intDefault0);            //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.toInt() default value of 0 is returned.
    pt(intDefaultNeg25);        //Returns 12 If the conversion did fail, -25 would be returned.

    p("-=-=-=-=-\nConverted \"12.5\" toString()");
    pt(stringDefaultEmptyStr);  //String equivalent of "12.5" is returned, If the conversion did fail, the UnitOf.toString() default value of null is returned.
    pt(stringDefault1dot23Str); //Returns "12.5" If the conversion did fail, "1.23" would be returned.

    p("-=-=-=-=-\nConverting toBoolean()");
    pt(booleanDefaultFalse);    //Conversion fails: false is returned. No default was passed in so the UnitOf.toBoolean() default of false is returned.
    pt(booleanDefaultTrue);     //Conversion fails: true is returned. Default of true was passed in so it is returned

    p("-=-=-=-=-\nConverting toFraction()");
    pt(fractionDefaultEmpty);   //Returns "25/2" passed in as 25 divided by 2 equals the DataType value passed in, 12.5. If the conversion did fail, the UnitOf.toFraction() default value of "" is returned.
    pt(fractionDefault2Slash5); //Returns "25/2" If the conversion did fail, "2/5" would be returned.

    p("-=-=-=-=-\nConverted \"12.5\" toChar()");
    pt(charDefaultCharNul);     //Returns '1' as it is the first non-spaced character of "12.5" passed in , If the conversion did fail, the UnitOf.toChar() default value of '\u0000' is returned.
    pt(charDefaultAtSign);      //Returns '1' If the conversion did fail, '@' would be returned.

    p("-=-=-=-=-\nConverted \"12.5\" toNumber()");
    pt(numberDefault0);         //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.toFloat() default value of 0 is returned.
    pt(numberDefault1dot23f);   //Returns 12.5 If the conversion did fail, 1.23f would be returned.

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