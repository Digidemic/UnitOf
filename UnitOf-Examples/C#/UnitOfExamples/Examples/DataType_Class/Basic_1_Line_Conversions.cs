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

using System;
using System.Collections.Generic;
using System.Text;

namespace UnitOfExamples.Examples.DataType_Class
{
    /**
     * Convert any C# data type and more including converting to and from fractions.
     * 
     * Default Values:
     * 
     * When a conversion in DataType fails its default, passed by caller as a parameter or if not uses UnitOf's defaults, is returned.
     * UnitOf defaults (when no parameter is passed) for each method are as follows:
     * toObject(): null
     * toString(): ""
     * toBoolean(): false
     * toChar(): '\0'
     * toByte(): 0
     * toSbyte(): 0
     * toShort(): 0
     * toUint(): 0
     * toUlong: 0
     * toUshort: 0
     * toInt(): 0
     * toLong(): 0L
     * toFloat(): 0.0F
     * toDecimal(): 0.0M
     * toDouble(): 0.0D
     * toDateTime(): new DateTime()
     * toTimeSpan(): new TimeSpan()
     * toFraction(): ""
     * 
     * NOTE: ToInt, ToLong, ToFloat, ToDouble, ToSbyte, ToShort, ToUint, ToUlong, and ToUshort methods on failure will attempt to read the value as a fraction and convert it to a decimal form.
     * This is to account for fractions originally passed in as Strings to be converted as a number type (EX: "2/4" ToDouble() will return 0.5).
     * 
     */
    public class Basic_1_Line_Conversions
    {
        public static void run()
        {
            p("\n-=-=-=-=-=-=-=-=-\nDataType_Class > Basic_1_Line_Conversions");

            /*
            Get Passed DataType Value and Type
            */
            string passedDataType = new UnitOf.DataType(1.23).GetTypeConstantPassed();  //Returns "Double" as the data type passed in (1.23) is a float.
            object passedValue = new UnitOf.DataType(1.23).GetValuePassed();            //Returns 1.23 as it is the original value passed.

            /*
            To Double
             
            Tries to convert the value passed in the UnitOf.DataType() constructor into a double type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned.
            */
            double intToDouble_default0 = new UnitOf.DataType(12).ToDouble();                   //Returns 12.0 from 12 (int). If the conversion did fail, the .ToDouble() default value of 0.0d is returned.            
            double doubleToDouble_default7 = new UnitOf.DataType(12.5).ToDouble(7.0);           //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToDouble() passed default value of 7.0 is returned.
            double stringDoubleToDouble_default0 = new UnitOf.DataType("-12.5").ToDouble();     //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .ToDouble() default value of 0.0d is returned.
            double booleanToDouble_default7 = new UnitOf.DataType(true).ToDouble(7.0);          //Conversion fails: Returns 7.0 from true (boolean). Because the conversion failed to convert the boolean "true" to a double, its passed default value of 7.0 was returned.
            double fractionToDouble_default0 = new UnitOf.DataType("5/2").ToDouble();           //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .ToDouble() default value of 0.0d is returned.
            double charToDouble_default7 = new UnitOf.DataType('5').ToDouble(7.0);              //Returns 5.0 from '5' (char). If the conversion did fail, the .ToDouble() passed default value of 7.0 is returned.
            double dateTimeToDouble_default0 = new UnitOf.DataType(DateTime.Now).ToDouble();    //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To Int
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into an int type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned. 
            */
            int intToInt_default0 = new UnitOf.DataType(12).ToInt();                //Returns 12 from 12 (int). If the conversion did fail, the .ToInt() default value of 0 is returned.
            int doubleToInt_default7 = new UnitOf.DataType(12.5).ToInt(7);          //Returns 12 from 12.5 (double). If the conversion did fail, the .ToInt() passed default value of 7 is returned.
            int stringDoubleToInt_default0 = new UnitOf.DataType("-12.5").ToInt();  //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToInt() default value of 0 is returned.
            int booleanToInt_default7 = new UnitOf.DataType(true).ToInt(7);         //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            int fractionToInt_default0 = new UnitOf.DataType("5/2").ToInt();        //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToInt() default value of 0 is returned.
            int charToInt_default7 = new UnitOf.DataType('5').ToInt(7);             //Returns 5 from '5' (char). If the conversion did fail, the .ToInt() passed default value of 7 is returned.
            int dateTimeToInt_default0 = new UnitOf.DataType(DateTime.Now).ToInt(); //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To String
             
            Tries to convert the value passed in the UnitOf.DataType() constructor into a String type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned. 
            */
            string intToString_defaultEmptyString = new UnitOf.DataType(12).ToString();                         //Returns "12" from 12 (int). If the conversion did fail, the .ToString() default value of "" is returned.
            string doubleToString_defaultFailedTxt = new UnitOf.DataType(12.5).ToString("Conversion Failed");   //Returns "12.5" from 12.5 (double). If the conversion did fail, the .ToString() passed default value of "Conversion Failed" is returned.
            string stringDoubleToString_default0 = new UnitOf.DataType("-12.5").ToString();                     //Returns "-12.5" from "-12.5" (String). If the conversion did fail, the .ToString() default value of "" is returned.
            string booleanToString_defaultFailedTxt = new UnitOf.DataType(true).ToString("Conversion Failed");  //Returns "true" from true (boolean). Because the conversion failed to convert the boolean "true" to a String, its passed default value of "Conversion Failed" was returned.
            string fractionToString_default0 = new UnitOf.DataType("5/2").ToString();                           //Returns "5/2" from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .ToString() default value of "" is returned.
            string charToString_defaultFailedTxt = new UnitOf.DataType('5').ToString("Conversion Failed");      //Returns "5" from '5' (char). If the conversion did fail, the .ToString() passed default value of "Conversion Failed" is returned.
            string dateTimeToString_default0 = new UnitOf.DataType(DateTime.Now).ToString();                    //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To Boolean - More in its own extended class - Examples/DataType_Class/Boolean_Extended_Syntax.cs
             
            Tries to convert the value passed in the UnitOf.DataType() constructor into a boolean type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned. 
            */
            bool doubleToBoolean_defaultFalse = new UnitOf.DataType(12.5).ToBoolean();              //Conversion fails: Returns false from 12.5 (double). Because the conversion failed to convert the double "12.5" to a boolean, its default value of false was returned.
            bool stringDoubleToBoolean_defaultTrue = new UnitOf.DataType("-12").ToBoolean(true);    //Conversion fails: Returns true from "-12" (String). Because the conversion failed to convert the String "-12" to a boolean, its passed default value of true was returned.
            bool stringBooleanToBoolean_defaultFalse = new UnitOf.DataType("TrUe").ToBoolean();     //Returns true from "TrUe" (String). If the conversion did fail, the .ToBoolean() default value of false is returned.
            bool stringToBoolean_falseIfNotContained = new UnitOf.DataType("12.5").ToBoolean(new object[] { 5, 12, 3 }, false, true);   //(More information on this form of the syntax in Boolean_Extended_Syntax.cs)Returns true from "12.5" with containing searching values of 5, 12, and 3. "12" is within "12.5" so true. Otherwise the default of false would have been returned.

            /*
            To Fraction - More in its own extended class - Examples/DataType_Class/Fraction_Extended_Syntax.cs
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a fraction of type String.
            This simplifies existing fraction Strings or turn numeric values into fraction Strings. 
            */
            string doubleToFraction_default3Over2 = new UnitOf.DataType(12.5).ToFraction("3/2");                //Returns "25/2" from 12.5 (double). If the conversion did fail, the .ToFraction() passed default value of "3/2" is returned.        
            string stringDoubleToFraction_defaultEmptyString = new UnitOf.DataType("-12.5").ToFraction();       //Returns "-25/2" from 12.5 (double). If the conversion did fail, the .ToFraction() passed default value of "" is returned.
            string stringToFraction_default3Over2 = new UnitOf.DataType("Can't make a fraction outta this").ToFraction("3/2");  //Conversion fails: Returns "3/2" from "Can't make a fraction outta this" (String). Because the conversion failed to convert the String "Can't make a fraction outta this" to a fraction, its passed default value of "3/2" was returned.
            string reducableFractionToFraction_defaultEmptyString = new UnitOf.DataType("2/4").ToFraction();    //Returns "1/2" from "2/4" (String fraction). If the conversion did fail, the .ToFraction() passed default value of "" is returned.
            string simplifiableFractionToFraction_defaultEmptyString = new UnitOf.DataType("5/2").ToFraction(); //Returns "5/2" from "5/2" (String fraction). If the conversion did fail, the .ToFraction() passed default value of "" is returned.

            /*
            Fraction String to Decimal
        
            Demonstrates that fractions as strings can be converted into their decimal equivalent.
            */
            double reducableFractionToDouble_default0 = new UnitOf.DataType("2/4").ToDouble();          //Returns 0.5 from "2/4" (String fraction). If the conversion did fail, the .ToDouble() default value of 0.0d is returned.
            double simplifiableFractionToDecimal_default50 = new UnitOf.DataType("5/2").ToDouble(50);   //Returns 2.5 from "5/2" (String fraction). If the conversion did fail, the .ToDouble() default value of 50 is returned.

            /*
            To Object
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into an Object type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned. 
            */
            object stringToObject_defaultNull = new UnitOf.DataType("12.5").ToObject();                 //Returns "12.5" from "12.5" (String). If the conversion did fail, the .ToObject() default value of null is returned.
            object stringToObject_default1dot23Double = new UnitOf.DataType("12.5").ToObject(1.23);     //Returns "12.5" from "12.5" (String). If the conversion did fail, the .ToObject() passed default value of 1.23 is returned.
            object stringToObject_default12dot3String = new UnitOf.DataType("12.5").ToObject("12.3");   //Returns "12.5" from "12.5" (String). If the conversion did fail, the .ToObject() passed default value of "12.3" is returned.

            /*
            To Char
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a char type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned. 
            */
            char intToChar_default0 = new UnitOf.DataType(12).ToChar();                         //Returns '1' from 12 (int). If the conversion did fail, the .ToChar() default value of '\0' is returned.
            char doubleToChar_default7 = new UnitOf.DataType(12.5).ToChar('@');                 //Returns '1' from 12.5 (double). If the conversion did fail, the .ToChar() passed default value of '@' is returned.
            char stringDoubleToChar_default0 = new UnitOf.DataType("-12.5").ToChar();           //Returns '-' from "-12.5" (String). If the conversion did fail, the .ToChar() default value of '\0' is returned.
            char booleanToChar_default7 = new UnitOf.DataType(true).ToChar('@');                //Returns 't' from '@' (char). If the conversion did fail, the .ToChar() passed default value of '@' is returned.
            char stringTextToChar_default0 = new UnitOf.DataType("String Example").ToChar();    //Returns 'S' from "String Example" (String). If the conversion did fail, the .ToChar() default value of '\0' is returned.

            /*
            To Float
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a float type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned. 
            */
            double intToFloat_default0 = new UnitOf.DataType(12).ToFloat();                 //Returns 12.0 from 12 (int). If the conversion did fail, the .ToFloat() default value of 0.0f is returned.
            double doubleToFloat_default7f = new UnitOf.DataType(12.5).ToFloat(7.0f);       //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToFloat() passed default value of 7.0f is returned.
            double stringDoubleToFloat_default0 = new UnitOf.DataType("-12.5").ToFloat();   //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .ToFloat() default value of 0.0f is returned.
            double booleanToFloat_default7f = new UnitOf.DataType(true).ToFloat(7.0f);      //Conversion fails: Returns 7.0f from true (boolean). Because the conversion failed to convert the boolean "true" to a float, its passed default value of 7.0f was returned.
            double fractionToFloat_default0 = new UnitOf.DataType("5/2").ToFloat();         //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .ToFloat() default value of 0.0f is returned.
            double charToFloat_default7f = new UnitOf.DataType('5').ToFloat(7.0f);          //Returns 5.0 from '5' (char). If the conversion did fail, the .ToFloat() passed default value of 7.0f is returned.
            double dateTimeToFloat_default0 = new UnitOf.DataType(DateTime.Now).ToFloat();  //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To Long
             
            Tries to convert the value passed in the UnitOf.DataType() constructor into a long type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned.
            */
            long intToLong_default0 = new UnitOf.DataType(12).ToLong();                 //Returns 12 from 12 (int). If the conversion did fail, the .ToLong() default value of 0 is returned.
            long doubleToLong_default7 = new UnitOf.DataType(12.5).ToLong(7);           //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToLong() passed default value of 7 is returned.
            long stringDoubleToLong_default0 = new UnitOf.DataType("-12.5").ToLong();   //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToLong() default value of 0 is returned.
            long booleanToLong_default7 = new UnitOf.DataType(true).ToLong(7);          //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a long, its passed default value of 7 was returned.
            long fractionToLong_default0 = new UnitOf.DataType("5/2").ToLong();         //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to long. If the conversion did fail, the .ToLong() default value of 0 is returned.
            long charToLong_default7 = new UnitOf.DataType('5').ToLong(7);              //Returns 5 from '5' (char). If the conversion did fail, the .ToLong() passed default value of 7 is returned.
            long dateTimeToLong_default0 = new UnitOf.DataType(DateTime.Now).ToLong();  //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To Short
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a short type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned. 
            */
            short intToShort_default0 = new UnitOf.DataType(12).ToShort();                  //Returns 12 from 12 (int). If the conversion did fail, the .ToShort() default value of 0 is returned.
            short doubleToShort_default7 = new UnitOf.DataType(12.5).ToShort((short)7);     //Returns 12 from 12.5 (double). If the conversion did fail, the .ToShort() passed default value of 7 is returned.
            short stringDoubleToShort_default0 = new UnitOf.DataType("-12.5").ToShort();    //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToShort() default value of 0 is returned.
            short booleanToShort_default7 = new UnitOf.DataType(true).ToShort((short)7);    //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            short fractionToShort_default0 = new UnitOf.DataType("5/2").ToShort();          //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToShort() default value of 0 is returned.
            short charToShort_default7 = new UnitOf.DataType('5').ToShort((short)7);        //Returns 5 from '5' (char). If the conversion did fail, the .ToShort() passed default value of 7 is returned.
            short dateTimeToShort_default0 = new UnitOf.DataType(DateTime.Now).ToShort();   //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To Byte
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a byte type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned. 
            */
            byte intToByte_default0 = new UnitOf.DataType(12).ToByte();                 //Returns 12 from 12 (int). If the conversion did fail, the .ToByte() default value of 0 is returned.
            byte doubleToByte_default7 = new UnitOf.DataType(12.5).ToByte((byte)7);     //Returns 12 from 12.5 (double). If the conversion did fail, the .ToByte() passed default value of 7 is returned.
            byte stringDoubleToByte_default0 = new UnitOf.DataType("-12.5").ToByte();   //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToByte() default value of 0 is returned.
            byte booleanToByte_default7 = new UnitOf.DataType(true).ToByte((byte)7);    //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            byte fractionToByte_default0 = new UnitOf.DataType("5/2").ToByte();         //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToByte() default value of 0 is returned.
            byte charToByte_default7 = new UnitOf.DataType('5').ToByte((byte)7);        //Returns 5 from '5' (char). If the conversion did fail, the .ToByte() passed default value of 7 is returned.
            byte longToByte_default0 = new UnitOf.DataType(DateTime.Now).ToByte();      //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To Sbyte
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a sbyte type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned. 
            */
            sbyte intToSbyte_default0 = new UnitOf.DataType(12).ToSbyte();                  //Returns 12 from 12 (int). If the conversion did fail, the .ToSbyte() default value of 0 is returned.
            sbyte doubleToSbyte_default7 = new UnitOf.DataType(12.5).ToSbyte((sbyte)7);     //Returns 12 from 12.5 (double). If the conversion did fail, the .ToSbyte() passed default value of 7 is returned.
            sbyte stringDoubleToSbyte_default0 = new UnitOf.DataType("-12.5").ToSbyte();    //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToSbyte() default value of 0 is returned.
            sbyte booleanToSbyte_default7 = new UnitOf.DataType(true).ToSbyte((sbyte)7);    //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            sbyte fractionToSbyte_default0 = new UnitOf.DataType("5/2").ToSbyte();          //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToSbyte() default value of 0 is returned.
            sbyte charToSbyte_default7 = new UnitOf.DataType('5').ToSbyte((sbyte)7);        //Returns 5 from '5' (char). If the conversion did fail, the .ToSbyte() passed default value of 7 is returned.
            sbyte longToSbyte_default0 = new UnitOf.DataType(DateTime.Now).ToSbyte();       //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To Uint
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a Uint type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned.
            */
            uint intToUint_default0 = new UnitOf.DataType(12).ToUint();                 //Returns 12 from 12 (int). If the conversion did fail, the .ToUint() default value of 0 is returned.
            uint doubleToUint_default7 = new UnitOf.DataType(12.5).ToUint((uint)7);     //Returns 12 from 12.5 (double). If the conversion did fail, the .ToUint() passed default value of 7 is returned.
            uint stringDoubleToUint_default0 = new UnitOf.DataType("-12.5").ToUint();   //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToUint() default value of 0 is returned.
            uint booleanToUint_default7 = new UnitOf.DataType(true).ToUint((uint)7);    //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            uint fractionToUint_default0 = new UnitOf.DataType("5/2").ToUint();         //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToUint() default value of 0 is returned.
            uint charToUint_default7 = new UnitOf.DataType('5').ToUint((uint)7);        //Returns 5 from '5' (char). If the conversion did fail, the .ToUint() passed default value of 7 is returned.
            uint longToUint_default0 = new UnitOf.DataType(DateTime.Now).ToUint();      //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To Ulong
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a Ulong type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned.
            */
            ulong intToUlong_default0 = new UnitOf.DataType(12).ToUlong();                  //Returns 12 from 12 (int). If the conversion did fail, the .ToUlong() default value of 0 is returned.
            ulong doubleToUlong_default7 = new UnitOf.DataType(12.5).ToUlong((ulong)7);     //Returns 12 from 12.5 (double). If the conversion did fail, the .ToUlong() passed default value of 7 is returned.
            ulong stringDoubleToUlong_default0 = new UnitOf.DataType("-12.5").ToUlong();    //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToUlong() default value of 0 is returned.
            ulong booleanToUlong_default7 = new UnitOf.DataType(true).ToUlong((ulong)7);    //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            ulong fractionToUlong_default0 = new UnitOf.DataType("5/2").ToUlong();          //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToUlong() default value of 0 is returned.
            ulong charToUlong_default7 = new UnitOf.DataType('5').ToUlong((ulong)7);        //Returns 5 from '5' (char). If the conversion did fail, the .ToUlong() passed default value of 7 is returned.
            ulong longToUlong_default0 = new UnitOf.DataType(DateTime.Now).ToUlong();       //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To Ushort
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a Ushort type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned. 
            */
            ushort intToUshort_default0 = new UnitOf.DataType(12).ToUshort();                   //Returns 12 from 12 (int). If the conversion did fail, the .ToUshort() default value of 0 is returned.
            ushort doubleToUshort_default7 = new UnitOf.DataType(12.5).ToUshort((ushort)7);     //Returns 12 from 12.5 (double). If the conversion did fail, the .ToUshort() passed default value of 7 is returned.
            ushort stringDoubleToUshort_default0 = new UnitOf.DataType("-12.5").ToUshort();     //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToUshort() default value of 0 is returned.
            ushort booleanToUshort_default7 = new UnitOf.DataType(true).ToUshort((ushort)7);    //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            ushort fractionToUshort_default0 = new UnitOf.DataType("5/2").ToUshort();           //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToUshort() default value of 0 is returned.
            ushort charToUshort_default7 = new UnitOf.DataType('5').ToUshort((ushort)7);        //Returns 5 from '5' (char). If the conversion did fail, the .ToUshort() passed default value of 7 is returned.
            ushort longToUshort_default0 = new UnitOf.DataType(DateTime.Now).ToUshort();        //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To Decimal
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a decimal type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned. 
            */
            decimal intToDecimal_default0 = new UnitOf.DataType(12).ToDecimal();                //Returns 12 from 12 (int). If the conversion did fail, the .ToDecimal() default value of 0 is returned.
            decimal doubleToDecimal_default7 = new UnitOf.DataType(12.5).ToDecimal(7M);         //Returns 12 from 12.5 (double). If the conversion did fail, the .ToDecimal() passed default value of 7 is returned.
            decimal stringDoubleToDecimal_default0 = new UnitOf.DataType("-12.5").ToDecimal();  //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToDecimal() default value of 0 is returned.
            decimal booleanToDecimal_default7 = new UnitOf.DataType(true).ToDecimal(7M);        //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            decimal fractionToDecimal_default0 = new UnitOf.DataType("5/2").ToDecimal();        //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToDecimal() default value of 0 is returned.
            decimal charToDecimal_default7 = new UnitOf.DataType('5').ToDecimal(7M);            //Returns 5 from '5' (char). If the conversion did fail, the .ToDecimal() passed default value of 7 is returned.
            decimal longToDecimal_default0 = new UnitOf.DataType(DateTime.Now).ToDecimal();     //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            /*
            To DateTime
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a DateType type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned.
            */
            DateTime intToDateTime_defaultNewDT = new UnitOf.DataType(12).ToDateTime();                     //Returns "1/1/001 12:00:00 AM"
            DateTime doubleToDateTime_defaultDTNow = new UnitOf.DataType(12.5).ToDateTime(DateTime.Now);    //Returns "12/5/2018 12:00:00 AM"
            DateTime stringDoubleToDateTime_defaultNewDT = new UnitOf.DataType("-12.5").ToDateTime();       //Returns "1/1/001 12:00:00 AM"
            DateTime booleanToDateTime_defaultDTNow = new UnitOf.DataType(true).ToDateTime(DateTime.Now);   //Conversion Fails: Returns system's current full time , Ex: "1/30/2018 10:30:05 PM"
            DateTime fractionToDateTime_defaultNewDT = new UnitOf.DataType("5/2").ToDateTime();             //Returns "5/2/2018 12:00:00 AM"
            DateTime charToDateTime_defaultDTNow = new UnitOf.DataType('5').ToDateTime(DateTime.Now);       //Conversion Fails: Returns system's current full time , Ex: "1/30/2018 10:30:05 PM"
            DateTime longToDateTime_defaultNewDT = new UnitOf.DataType(DateTime.Now).ToDateTime();          //Conversion Fails: Returns system's current full time , Ex: "1/30/2018 10:30:05 PM"

            /*
            To TimeSpan
            
            Tries to convert the value passed in the UnitOf.DataType() constructor into a TimeSpan type.
            If this conversion fails the default value (which may be passed in as a parameter) is returned.
            */
            TimeSpan intToDateTime_defaultNewTS = new UnitOf.DataType(12).ToTimeSpan();                             //Returns "12.00:00:00"
            TimeSpan doubleToDateTime_default2Min = new UnitOf.DataType(12.5).ToTimeSpan(TimeSpan.FromMinutes(2));  //Conversion Fails: Returns "00:02:00"
            TimeSpan stringDoubleToDateTime_defaultNewTS = new UnitOf.DataType("-12.5").ToTimeSpan();               //Returns "00:00:00"
            TimeSpan booleanToDateTime_default2Min = new UnitOf.DataType(true).ToTimeSpan(TimeSpan.FromMinutes(2)); //Conversion Fails: Returns "00:02:00" 
            TimeSpan fractionToDateTime_defaultNewTS = new UnitOf.DataType("5/2").ToTimeSpan();                     //Returns "00:00:00"
            TimeSpan charToDateTime_default2Min = new UnitOf.DataType('5').ToTimeSpan(TimeSpan.FromMinutes(2));     //Returns "00:00:00"
            TimeSpan longToDateTime_defaultNewTS = new UnitOf.DataType(DateTime.Now).ToTimeSpan();                  //Returns "00:00:00"


            /*
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            Print Conversions
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            */
            p("-=-=-=-=-\nType and Value passed in (1.23 as a double)");
            pt("Passed Data Type: " + passedDataType);  //Returns "Double" as the data type passed in (1.23) is a float.
            pt("Passed Value: " + passedValue);         //Returns 1.23 as it is the original value passed.

            p("-=-=-=-=-\nConverted toDouble()");
            pt("intToDouble_default0: " + intToDouble_default0);                    //Returns 12.0 from 12 (int). If the conversion did fail, the .ToDouble() default value of 0.0d is returned.    
            pt("doubleToDouble_default7: " + doubleToDouble_default7);              //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToDouble() passed default value of 7.0 is returned.
            pt("stringDoubleToDouble_default0: " + stringDoubleToDouble_default0);  //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .ToDouble() default value of 0.0d is returned.
            pt("booleanToDouble_default7: " + booleanToDouble_default7);            //Conversion fails: Returns 7.0 from true (boolean). Because the conversion failed to convert the boolean "true" to a double, its passed default value of 7.0 was returned.
            pt("fractionToDouble_default0: " + fractionToDouble_default0);          //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .ToDouble() default value of 0.0d is returned.
            pt("charToDouble_default7: " + charToDouble_default7);                  //Returns 5.0 from '5' (char). If the conversion did fail, the .ToDouble() passed default value of 7.0 is returned.
            pt("dateTimeToDouble_default0: " + dateTimeToDouble_default0);          //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            p("-=-=-=-=-\nConverted toInt()");
            pt("intToInt_default0: " + intToInt_default0);                      //Returns 12 from 12 (int). If the conversion did fail, the .ToInt() default value of 0 is returned.
            pt("doubleToInt_default7: " + doubleToInt_default7);                //Returns 12 from 12.5 (double). If the conversion did fail, the .ToInt() passed default value of 7 is returned.
            pt("stringDoubleToInt_default0: " + stringDoubleToInt_default0);    //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToInt() default value of 0 is returned.
            pt("booleanToInt_default7: " + booleanToInt_default7);              //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            pt("fractionToInt_default0: " + fractionToInt_default0);            //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToInt() default value of 0 is returned.
            pt("charToInt_default7: " + charToInt_default7);                    //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns
            pt("dateTimeToInt_default0: " + dateTimeToInt_default0);            

            p("-=-=-=-=-\nConverted toString()");
            pt("intToString_defaultEmptyString: " + intToString_defaultEmptyString);        //Returns "12" from 12 (int). If the conversion did fail, the .ToString() default value of "" is returned.
            pt("doubleToString_defaultFailedTxt: " + doubleToString_defaultFailedTxt);      //Returns "12.5" from 12.5 (double). If the conversion did fail, the .ToString() passed default value of "Conversion Failed" is returned.
            pt("stringDoubleToString_default0: " + stringDoubleToString_default0);          //Returns "-12.5" from "-12.5" (String). If the conversion did fail, the .ToString() default value of "" is returned.
            pt("booleanToString_defaultFailedTxt: " + booleanToString_defaultFailedTxt);    //Returns "true" from true (boolean). Because the conversion failed to convert the boolean "true" to a String, its passed default value of "Conversion Failed" was returned.
            pt("fractionToString_default0: " + fractionToString_default0);                  //Returns "5/2" from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .ToString() default value of "" is returned.
            pt("charToString_defaultFailedTxt: " + charToString_defaultFailedTxt);          //Returns "5" from '5' (char). If the conversion did fail, the .ToString() passed default value of "Conversion Failed" is returned.
            pt("dateTimeToString_default0: " + dateTimeToString_default0);                  //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            p("-=-=-=-=-\nConverted toBoolean()");
            pt("doubleToBoolean_defaultFalse: " + doubleToBoolean_defaultFalse);                //Conversion fails: Returns false from 12.5 (double). Because the conversion failed to convert the double "12.5" to a boolean, its default value of false was returned.
            pt("stringDoubleToBoolean_defaultTrue: " + stringDoubleToBoolean_defaultTrue);      //Conversion fails: Returns true from "-12" (String). Because the conversion failed to convert the String "-12" to a boolean, its passed default value of true was returned.
            pt("stringBooleanToBoolean_defaultFalse: " + stringBooleanToBoolean_defaultFalse);  //Returns true from "TrUe" (String). If the conversion did fail, the .ToBoolean() default value of false is returned.
            pt("stringToBoolean_falseIfNotContained: " + stringToBoolean_falseIfNotContained);  //(More information on this form of the syntax in Boolean_Extended_Syntax.cs)Returns true from "12.5" with containing searching values of 5, 12, and 3. "12" is within "12.5" so true. Otherwise the default of false would have been returned.

            p("-=-=-=-=-\nConverted toBoolean()");
            pt("doubleToFraction_default3Over2: " + doubleToFraction_default3Over2);                        //Returns "25/2" from 12.5 (double). If the conversion did fail, the .ToFraction() passed default value of "3/2" is returned.   
            pt("stringDoubleToFraction_defaultEmptyString: " + stringDoubleToFraction_defaultEmptyString);  //Returns "-25/2" from 12.5 (double). If the conversion did fail, the .ToFraction() passed default value of "" is returned.
            pt("stringToFraction_default3Over2: " + stringToFraction_default3Over2);                        //Conversion fails: Returns "3/2" from "Can't make a fraction outta this" (String). Because the conversion failed to convert the String "Can't make a fraction outta this" to a fraction, its passed default value of "3/2" was returned.
            pt("reducableFractionToFraction_defaultEmptyString: " + reducableFractionToFraction_defaultEmptyString);        //Returns "1/2" from "2/4" (String fraction). If the conversion did fail, the .ToFraction() passed default value of "" is returned.
            pt("simplifiableFractionToFraction_defaultEmptyString: " + simplifiableFractionToFraction_defaultEmptyString);  //Returns "5/2" from "5/2" (String fraction). If the conversion did fail, the .ToFraction() passed default value of "" is returned.

            p("-=-=-=-=-\nConverted fraction string to double()");
            pt("reducableFractionToDouble_default0: " + reducableFractionToDouble_default0);            //Returns 0.5 from "2/4" (String fraction). If the conversion did fail, the .ToDouble() default value of 0.0d is returned.
            pt("simplifiableFractionToDecimal_default50: " + simplifiableFractionToDecimal_default50);  //Returns 2.5 from "5/2" (String fraction). If the conversion did fail, the .ToDouble() default value of 50 is returned.

            p("-=-=-=-=-\nConverted toObject()");
            pt("stringToObject_defaultNull: " + stringToObject_defaultNull);                    //Returns "12.5" from "12.5" (String). If the conversion did fail, the .ToObject() default value of null is returned.
            pt("stringToObject_default1dot23Double: " + stringToObject_default1dot23Double);    //Returns "12.5" from "12.5" (String). If the conversion did fail, the .ToObject() passed default value of 1.23 is returned.
            pt("stringToObject_default12dot3String: " + stringToObject_default12dot3String);    //Returns "12.5" from "12.5" (String). If the conversion did fail, the .ToObject() passed default value of "12.3" is returned.

            p("-=-=-=-=-\nConverted toChar()");
            pt("intToChar_default0: " + intToChar_default0);                    //Returns '1' from 12 (int). If the conversion did fail, the .ToChar() default value of '\0' is returned.
            pt("doubleToChar_default7: " + doubleToChar_default7);              //Returns '1' from 12.5 (double). If the conversion did fail, the .ToChar() passed default value of '@' is returned.
            pt("stringDoubleToChar_default0: " + stringDoubleToChar_default0);  //Returns '-' from "-12.5" (String). If the conversion did fail, the .ToChar() default value of '\0' is returned.
            pt("booleanToChar_default7: " + booleanToChar_default7);            //Returns 't' from '@' (char). If the conversion did fail, the .ToChar() passed default value of '@' is returned.
            pt("stringTextToChar_default0: " + stringTextToChar_default0);      //Returns 'S' from "String Example" (String). If the conversion did fail, the .ToChar() default value of '\0' is returned.

            p("-=-=-=-=-\nConverted toFloat()");
            pt("intToFloat_default0: " + intToFloat_default0);                      //Returns 12.0 from 12 (int). If the conversion did fail, the .ToFloat() default value of 0.0f is returned.
            pt("doubleToFloat_default7f: " + doubleToFloat_default7f);              //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToFloat() passed default value of 7.0f is returned.
            pt("stringDoubleToFloat_default0: " + stringDoubleToFloat_default0);    //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .ToFloat() default value of 0.0f is returned.
            pt("booleanToFloat_default7f: " + booleanToFloat_default7f);            //Conversion fails: Returns 7.0f from true (boolean). Because the conversion failed to convert the boolean "true" to a float, its passed default value of 7.0f was returned.
            pt("fractionToFloat_default0: " + fractionToFloat_default0);            //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .ToFloat() default value of 0.0f is returned.
            pt("charToFloat_default7f: " + charToFloat_default7f);                  //Returns 5.0 from '5' (char). If the conversion did fail, the .ToFloat() passed default value of 7.0f is returned.
            pt("dateTimeToFloat_default0: " + dateTimeToFloat_default0);            //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            p("-=-=-=-=-\nConverted toLong()");
            pt("intToLong_default0: " + intToLong_default0);                    //Returns 12 from 12 (int). If the conversion did fail, the .ToLong() default value of 0 is returned.
            pt("doubleToLong_default7: " + doubleToLong_default7);              //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToLong() passed default value of 7 is returned.
            pt("stringDoubleToLong_default0: " + stringDoubleToLong_default0);  //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToLong() default value of 0 is returned.
            pt("booleanToLong_default7: " + booleanToLong_default7);            //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a long, its passed default value of 7 was returned.
            pt("fractionToLong_default0: " + fractionToLong_default0);          //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to long. If the conversion did fail, the .ToLong() default value of 0 is returned.
            pt("charToLong_default7: " + charToLong_default7);                  //Returns 5 from '5' (char). If the conversion did fail, the .ToLong() passed default value of 7 is returned.
            pt("dateTimeToLong_default0: " + dateTimeToLong_default0);          //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns   

            p("-=-=-=-=-\nConverted toShort()");
            pt("intToShort_default0: " + intToShort_default0);                      //Returns 12 from 12 (int). If the conversion did fail, the .ToShort() default value of 0 is returned.
            pt("doubleToShort_default7: " + doubleToShort_default7);                //Returns 12 from 12.5 (double). If the conversion did fail, the .ToShort() passed default value of 7 is returned.
            pt("stringDoubleToShort_default0: " + stringDoubleToShort_default0);    //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToShort() default value of 0 is returned.
            pt("booleanToShort_default7: " + booleanToShort_default7);              //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            pt("fractionToShort_default0: " + fractionToShort_default0);            //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToShort() default value of 0 is returned.
            pt("charToShort_default7: " + charToShort_default7);                    //Returns 5 from '5' (char). If the conversion did fail, the .ToShort() passed default value of 7 is returned.
            pt("dateTimeToShort_default0: " + dateTimeToShort_default0);            //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            p("-=-=-=-=-\nConverted toByte()");
            pt("intToByte_default0: " + intToByte_default0);                    //Returns 12 from 12 (int). If the conversion did fail, the .ToByte() default value of 0 is returned.
            pt("doubleToByte_default7: " + doubleToByte_default7);              //Returns 12 from 12.5 (double). If the conversion did fail, the .ToByte() passed default value of 7 is returned.
            pt("stringDoubleToByte_default0: " + stringDoubleToByte_default0);  //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToByte() default value of 0 is returned.
            pt("booleanToByte_default7: " + booleanToByte_default7);            //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            pt("fractionToByte_default0: " + fractionToByte_default0);          //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToByte() default value of 0 is returned.
            pt("charToByte_default7: " + charToByte_default7);                  //Returns 5 from '5' (char). If the conversion did fail, the .ToByte() passed default value of 7 is returned.
            pt("longToByte_default0: " + longToByte_default0);                  //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            p("-=-=-=-=-\nConverted toSbyte()");
            pt("intToSbyte_default0: " + intToSbyte_default0);                      //Returns 12 from 12 (int). If the conversion did fail, the .ToSbyte() default value of 0 is returned.
            pt("doubleToSbyte_default7: " + doubleToSbyte_default7);                //Returns 12 from 12.5 (double). If the conversion did fail, the .ToSbyte() passed default value of 7 is returned.
            pt("stringDoubleToSbyte_default0: " + stringDoubleToSbyte_default0);    //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToSbyte() default value of 0 is returned.
            pt("booleanToSbyte_default7: " + booleanToSbyte_default7);              //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            pt("fractionToSbyte_default0: " + fractionToSbyte_default0);            //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToSbyte() default value of 0 is returned.
            pt("charToSbyte_default7: " + charToSbyte_default7);                    //Returns 5 from '5' (char). If the conversion did fail, the .ToSbyte() passed default value of 7 is returned.
            pt("longToSbyte_default0: " + longToSbyte_default0);                    //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            p("-=-=-=-=-\nConverted toUint()");
            pt("intToUint_default0: " + intToUint_default0);                    //Returns 12 from 12 (int). If the conversion did fail, the .ToUint() default value of 0 is returned.
            pt("doubleToUint_default7: " + doubleToUint_default7);              //Returns 12 from 12.5 (double). If the conversion did fail, the .ToUint() passed default value of 7 is returned.
            pt("stringDoubleToUint_default0: " + stringDoubleToUint_default0);  //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToUint() default value of 0 is returned.
            pt("booleanToUint_default7: " + booleanToUint_default7);            //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            pt("fractionToUint_default0: " + fractionToUint_default0);          //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToUint() default value of 0 is returned.
            pt("charToUint_default7: " + charToUint_default7);                  //Returns 5 from '5' (char). If the conversion did fail, the .ToUint() passed default value of 7 is returned.
            pt("longToUint_default0: " + longToUint_default0);                  //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            p("-=-=-=-=-\nConverted toUlong()");
            pt("intToUlong_default0: " + intToUlong_default0);                      //Returns 12 from 12 (int). If the conversion did fail, the .ToUlong() default value of 0 is returned.
            pt("doubleToUlong_default7: " + doubleToUlong_default7);                //Returns 12 from 12.5 (double). If the conversion did fail, the .ToUlong() passed default value of 7 is returned.
            pt("stringDoubleToUlong_default0: " + stringDoubleToUlong_default0);    //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToUlong() default value of 0 is returned.
            pt(":booleanToUlong_default7 " + booleanToUlong_default7);              //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            pt("fractionToUlong_default0: " + fractionToUlong_default0);            //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToUlong() default value of 0 is returned.
            pt("charToUlong_default7: " + charToUlong_default7);                    //Returns 5 from '5' (char). If the conversion did fail, the .ToUlong() passed default value of 7 is returned.
            pt("longToUlong_default0: " + longToUlong_default0);                    //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            p("-=-=-=-=-\nConverted toUshort()");
            pt("intToUshort_default0: " + intToUshort_default0);                    //Returns 12 from 12 (int). If the conversion did fail, the .ToUshort() default value of 0 is returned.
            pt("doubleToUshort_default7: " + doubleToUshort_default7);              //Returns 12 from 12.5 (double). If the conversion did fail, the .ToUshort() passed default value of 7 is returned.
            pt("stringDoubleToUshort_default0: " + stringDoubleToUshort_default0);  //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToUshort() default value of 0 is returned.
            pt("booleanToUshort_default7: " + booleanToUshort_default7);            //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            pt("fractionToUshort_default0: " + fractionToUshort_default0);          //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToUshort() default value of 0 is returned.
            pt("charToUshort_default7: " + charToUshort_default7);                  //Returns 5 from '5' (char). If the conversion did fail, the .ToUshort() passed default value of 7 is returned.
            pt("longToUshort_default0: " + longToUshort_default0);                  //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            p("-=-=-=-=-\nConverted toDecimal()");
            pt("intToDecimal_default0: " + intToDecimal_default0);                      //Returns 12 from 12 (int). If the conversion did fail, the .ToDecimal() default value of 0 is returned.
            pt("doubleToDecimal_default7: " + doubleToDecimal_default7);                //Returns 12 from 12.5 (double). If the conversion did fail, the .ToDecimal() passed default value of 7 is returned.
            pt("stringDoubleToDecimal_default0: " + stringDoubleToDecimal_default0);    //Returns -12 from "-12.5" (String). If the conversion did fail, the .ToDecimal() default value of 0 is returned.
            pt("booleanToDecimal_default7: " + booleanToDecimal_default7);              //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
            pt("fractionToDecimal_default0: " + fractionToDecimal_default0);            //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .ToDecimal() default value of 0 is returned.
            pt("charToDecimal_default7: " + charToDecimal_default7);                    //Returns 5 from '5' (char). If the conversion did fail, the .ToDecimal() passed default value of 7 is returned.
            pt("longToDecimal_default0: " + longToDecimal_default0);                    //Using system's time in milliseconds at time of execution. If the conversion fails the value 0 returns

            p("-=-=-=-=-\nConverted toDateTime()");
            pt("intToDateTime_defaultNewDT: " + intToDateTime_defaultNewDT);                    //Returns "1/1/001 12:00:00 AM"
            pt("doubleToDateTime_defaultDTNow: " + doubleToDateTime_defaultDTNow);              //Returns "12/5/2018 12:00:00 AM"
            pt("stringDoubleToDateTime_defaultNewDT: " + stringDoubleToDateTime_defaultNewDT);  //Returns "1/1/001 12:00:00 AM"
            pt("booleanToDateTime_defaultDTNow: " + booleanToDateTime_defaultDTNow);            //Conversion Fails: Returns system's current full time , Ex: "1/30/2018 10:30:05 PM"
            pt("fractionToDateTime_defaultNewDT: " + fractionToDateTime_defaultNewDT);          //Returns "5/2/2018 12:00:00 AM"
            pt("charToDateTime_defaultDTNow: " + charToDateTime_defaultDTNow);                  //Conversion Fails: Returns system's current full time , Ex: "1/30/2018 10:30:05 PM"
            pt("longToDateTime_defaultNewDT: " + longToDateTime_defaultNewDT);                  //Conversion Fails: Returns system's current full time , Ex: "1/30/2018 10:30:05 PM"

            p("-=-=-=-=-\nConverted toTimeSpan()");
            pt("intToDateTime_defaultNewTS: " + intToDateTime_defaultNewTS);                    //Returns "12.00:00:00"
            pt("doubleToDateTime_default2Min: " + doubleToDateTime_default2Min);                //Conversion Fails: Returns "00:02:00"
            pt("stringDoubleToDateTime_defaultNewTS: " + stringDoubleToDateTime_defaultNewTS);  //Returns "00:00:00"
            pt("booleanToDateTime_default2Min: " + booleanToDateTime_default2Min);              //Conversion Fails: Returns "00:02:00" 
            pt("fractionToDateTime_defaultNewTS: " + fractionToDateTime_defaultNewTS);          //Returns "00:00:00"
            pt("charToDateTime_default2Min: " + charToDateTime_default2Min);                    //Returns "00:00:00"
            pt("longToDateTime_defaultNewTS: " + longToDateTime_defaultNewTS);                  //Returns "00:00:00"
        }

        //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        //Print object passed, starting with a tab
        private static void pt(object o){
            p("\t" + o);
        }

        //Print object passed
        private static void p(object o){
            Console.WriteLine(o.ToString());
        }
    }
}
