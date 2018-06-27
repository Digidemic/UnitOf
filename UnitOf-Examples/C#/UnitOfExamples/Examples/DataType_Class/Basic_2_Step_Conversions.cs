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
     * NOTE: ToByte, ToInt, ToLong, ToFloat, ToDouble, ToSbyte, ToShort, ToUint, ToUlong, and ToUshort methods on failure will attempt to read the value as a fraction and convert it to a decimal form.
     * This is to account for fractions originally passed in as Strings to be converted as a number type (EX: "2/4" toDouble() will return 0.5).
     * 
     */
    public class Basic_2_Step_Conversions{
        public static void run(){
            //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            /*
            Our intial value of "12.5" as type String is passed into our new instance of UnitOf.DataType.
            UnitOf.DataType determines the type passed in making it unnecessary for the user to have to manually define this.
            Below are also just a few examples of what can be passed in
            */
            p("\n-=-=-=-=-=-=-=-=-\nDataType_Class > Basic_2_Step_Conversions");
            p("-=-=-=-=-\nInstantiating UnitOf.DataType(\"12.5\")");
            UnitOf.DataType uoDataType = new UnitOf.DataType("12.5");   //String passed in.
            //dt = new UnitOf.DataType(12.5);                           //Example of double passed in.
            //dt = new UnitOf.DataType(12);                             //Example of int passed in.
            //dt = new UnitOf.DataType('$');                            //Example of char pssed in.
            //dt = new UnitOf.DataType(false);                          //Example of boolean passed in.
            //dt = new UnitOf.DataType("12.5");                         //Back to our example, 12.5 in string form
            //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

            /*
            getTypeConstantPassed() and getValuePassed() return the variable type and value passed in respectively.
            Because we passed in "12.5" as a String, the getTypeConstantPassed() will return the word "String".
            getValuePassed() will return "12.5" as a string since that is how it was passed in.
            */
            string dataTypePassedType = uoDataType.GetTypeConstantPassed(); //The word "String" is returned
            object dataTypePassedValue = uoDataType.GetValuePassed();       //"12.5" as a String is returned


            /*
            Returns an double equivalent of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToDouble() default value of 0.0d is returned. 
            */
            double doubleDefault0 = uoDataType.ToDouble();          //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.ToDouble() default value of 0.0d is returned.
            double doubleDefault1dot23 = uoDataType.ToDouble(1.23); //Returns 12.5 If the conversion did fail, 1.23 would be returned.


            /*
            Returns an int equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToInt() default value of 0 is returned. 
            */
            int intDefault0 = uoDataType.ToInt();           //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToInt() default value of 0 is returned.
            int intDefaultNeg25 = uoDataType.ToInt(-25);    //Returns 12 If the conversion did fail, -25 would be returned.


            /*
            Returns a String equivalent of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToString() default value of "" is returned. 
            */
            string stringDefaultEmptyStr = uoDataType.ToString();           //String equivalent of "12.5" is returned, If the conversion did fail, the UnitOf.ToString() default value of null is returned.
            string stringDefault1dot23Str = uoDataType.ToString("1.23");    //Returns "12.5" If the conversion did fail, "1.23" would be returned.


            /*
            Returns a boolean equivalent of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToBoolean() default value of false is returned. 
            NOTE: More in its own extended class - examples/DataType_Class/Boolean_Extended_Syntax.cs
            */

            bool booleanDefaultFalse = uoDataType.ToBoolean();       //Conversion fails: false is returned. No default was passed in so the UnitOf.ToBoolean() default of false is returned.
            bool booleanDefaultTrue = uoDataType.ToBoolean(true);    //Conversion fails: true is returned. Default of true was passed in so it is returned


            /*
            Returns a String fraction equivalent of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToFraction() default value of "" is returned. 
            */
            string fractionDefaultEmpty = uoDataType.ToFraction();          //Returns "25/2" passed in as 25 divided by 2 equals the DataType value passed in, 12.5. If the conversion did fail, the UnitOf.ToFraction() default value of "" is returned.
            string fractionDefault2Slash5 = uoDataType.ToFraction("2/5");   //Returns "25/2" If the conversion did fail, "2/5" would be returned.


            /*
            Returns an Object equivalent of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToObject() default value of null is returned. 
            */
            object objectDefaultNull = uoDataType.ToObject();               //Object equivalent of "12.5" is returned, If the conversion fails, the UnitOf.ToObject() default value of null is returned.
            object objectDefault123 = uoDataType.ToObject(123);             //Returns "12.5" If the conversion did fail, 123 as an Object would be returned.
            object objectDefault1dot23 = uoDataType.ToObject(1.23);         //Returns "12.5" If the conversion did fail, 1.23 as an Object would be returned.
            object objectDefault12dot3Str = uoDataType.ToObject("12.3");    //Returns "12.5" If the conversion did fail, "12.3" as an Object would be returned.


            /*
            Returns a char equivalent by taking the first non-spaced character of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToChar() default value of '\0' is returned. 
            */
            char charDefaultCharNul = uoDataType.ToChar();      //Returns '1' as it is the first non-spaced character of "12.5" passed in , If the conversion did fail, the UnitOf.ToChar() default value of '\0' is returned.
            char charDefaultAtSign = uoDataType.ToChar('@');    //Returns '1' If the conversion did fail, '@' would be returned.


            /*
            Returns an float equivalent of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToFloat() default value of 0.0f is returned. 
            */
            float floatDefault0 = uoDataType.ToFloat();             //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.ToFloat() default value of 0.0f is returned.
            float floatDefault1dot23f = uoDataType.ToFloat(1.23f);  //Returns 12.5 If the conversion did fail, 1.23f would be returned.


            /*
            Returns an long equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToLong() default value of (long)0 is returned. 
            */
            long longDefault0 = uoDataType.ToLong();    //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToLong() default value of (long)0 is returned.
            long longDefault25 = uoDataType.ToLong(25); //Returns 12 If the conversion did fail, 25 would be returned.


            /*
            Returns a short equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToShort() default value of (short)0 is returned. 
            */
            short shortDefault0 = uoDataType.ToShort();             //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToShort() default value of (short)0 is returned.
            short shortDefault15 = uoDataType.ToShort((short)15);   //Returns 12 If the conversion did fail, (short)15 would be returned.


            /*
            Returns a byte equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToByte() default value of (byte)0 is returned. 
            */
            byte byteDefault0 = uoDataType.ToByte();        //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToByte() default value of (byte)0 is returned.
            byte byteDefault5 = uoDataType.ToByte((byte)5); //Returns 12 If the conversion did fail, (byte)5 would be returned.


            /*
            Returns an sbyte equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToSbyte() default value of (sbyte)0 is returned. 
            */
            sbyte sbyteDefault0 = uoDataType.ToSbyte();         //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToSbyte() default value of (sbyte)0 is returned.
            sbyte sbyteDefault6 = uoDataType.ToSbyte((sbyte)6); //Returns 12 If the conversion did fail, (sbyte)6 would be returned.


            /*
            Returns a uint equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToUint() default value of (uint)0 is returned. 
            */
            uint uintDefault0 = uoDataType.ToUint();        //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToUint() default value of (uint)0 is returned.
            uint uintDefault7 = uoDataType.ToUint((uint)7); //Returns 12 If the conversion did fail, (uint)7 would be returned.


            /*
            Returns a ulong equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToUlong() default value of (ulong)0 is returned. 
            */
            ulong ulongDefault0 = uoDataType.ToUlong();         //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToUlong() default value of (ulong)0 is returned.
            ulong ulongDefault8 = uoDataType.ToUlong((ulong)8); //Returns 12 If the conversion did fail, (ulong)8 would be returned.


            /*
            Returns a ushort equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToUshort() default value of (ushort)0 is returned. 
            */
            ushort ushortDefault0 = uoDataType.ToUshort();          //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToUshort() default value of (ushort)0 is returned.
            ushort ushortDefault9 = uoDataType.ToUshort((ushort)9); //Returns 12 If the conversion did fail, (ushort)9 would be returned.


            /*
            Returns a decimal equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToDecimal() default value of 0.0M is returned. 
            */
            decimal decimalDefault0 = uoDataType.ToDecimal();       //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToDecimal() default value of 0.0M is returned.
            decimal decimalDefault1M = uoDataType.ToDecimal(1M);    //Returns 12 If the conversion did fail, 1M would be returned.


            /*
            Returns a DateTime equivalent of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToDateTime() default value of DateTime.Today is returned. 
            */
            DateTime dateTimeDefaultNewDT = uoDataType.ToDateTime();                //Returns "12/5/2018 12:00:00 AM" (if compiled in the US during the year of 2018) as "12.5" is read as month: 12, day: 5, and the rest are defaults. If the conversion did fail, the UnitOf.ToDateTime() default value of DateTime.Today is returned.
            DateTime dateTimeDefaultToday = uoDataType.ToDateTime(DateTime.Today);  //Returns "12/5/2018 12:00:00 AM"  If failed, returns DateTime.Today, today (your system's date and time) would be returned like 11/30/2008 12:00:00 AM.


            /*
            Returns a DateTime equivalent of what was passed in as the DataType value, "12.5". 
            If the conversion fails, The user defined parameter passed is returned. 
            Otherwise if nothing is passed in the UnitOf.ToDateTime() default value of DateTime.Today is returned. 
            */
            TimeSpan timeSpanDefaultNewTS = uoDataType.ToTimeSpan();                                //Returns "00:00:00" as the conversion fails and this is the default
            TimeSpan timeSpanDefaultFrom2Minues = uoDataType.ToTimeSpan(TimeSpan.FromMinutes(2));   //Returns "00:02:00" as the conversion fails and the default passed in was 2 minutes
            

            /*
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            Print Conversions
            -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
            */
            p("-=-=-=-=-\nType and Value Originally passed in (\"12.5\" as a String)");
            pt(dataTypePassedType);         //The word "String" is returned
            pt(dataTypePassedValue);        //"12.5" as a String is returned

            p("-=-=-=-=-\nConverted \"12.5\" toDouble()");
            pt(doubleDefault0);             //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.ToDouble() default value of 0.0d is returned.
            pt(doubleDefault1dot23);        //Returns 12.5 If the conversion did fail, 1.23 would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toInt()");
            pt(intDefault0);                //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToInt() default value of 0 is returned.
            pt(intDefaultNeg25);            //Returns 12 If the conversion did fail, -25 would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toString()");
            pt(stringDefaultEmptyStr);      //String equivalent of "12.5" is returned, If the conversion did fail, the UnitOf.ToString() default value of null is returned.
            pt(stringDefault1dot23Str);     //Returns "12.5" If the conversion did fail, "1.23" would be returned.

            p("-=-=-=-=-\nConverting toBoolean()");
            pt(booleanDefaultFalse);        //Conversion fails: false is returned. No default was passed in so the UnitOf.ToBoolean() default of false is returned.
            pt(booleanDefaultTrue);         //Conversion fails: true is returned. Default of true was passed in so it is returned

            p("-=-=-=-=-\nConverting toFraction()");
            pt(fractionDefaultEmpty);       //Returns "25/2" passed in as 25 divided by 2 equals the DataType value passed in, 12.5. If the conversion did fail, the UnitOf.ToFraction() default value of "" is returned.
            pt(fractionDefault2Slash5);     //Returns "25/2" If the conversion did fail, "2/5" would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toObject()");
            pt(objectDefaultNull);          //Object equivalent of "12.5" is returned, If the conversion fails, the UnitOf.ToObject() default value of null is returned.
            pt(objectDefault123);           //Returns "12.5" If the conversion did fail, 123 as an Object would be returned.
            pt(objectDefault1dot23);        //Returns "12.5" If the conversion did fail, 1.23 as an Object would be returned.
            pt(objectDefault12dot3Str);     //Returns "12.5" If the conversion did fail, "12.3" as an Object would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toChar()");
            pt(charDefaultCharNul);         //Returns '1' as it is the first non-spaced character of "12.5" passed in , If the conversion did fail, the UnitOf.ToChar() default value of '\0' is returned.
            pt(charDefaultAtSign);          //Returns '1' If the conversion did fail, '@' would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toFloat()");
            pt(floatDefault0);              //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.ToFloat() default value of 0.0f is returned.
            pt(floatDefault1dot23f);        //Returns 12.5 If the conversion did fail, 1.23f would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toLong()");
            pt(longDefault0);               //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToLong() default value of (long)0 is returned.
            pt(longDefault25);              //Returns 12 If the conversion did fail, 25 would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toShort()");
            pt(shortDefault0);              //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToShort() default value of (short)0 is returned.
            pt(shortDefault15);             //Returns 12 If the conversion did fail, (short)15 would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toByte()");
            pt(byteDefault0);               //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToByte() default value of (byte)0 is returned.
            pt(byteDefault5);               //Returns 12 If the conversion did fail, (byte)5 would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toSbyte()");
            pt(sbyteDefault0);              //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToSbyte() default value of (sbyte)0 is returned.
            pt(sbyteDefault6);              //Returns 12 If the conversion did fail, (sbyte)6 would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toUint()");
            pt(uintDefault0);               //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToUint() default value of (uint)0 is returned.
            pt(uintDefault7);               //Returns 12 If the conversion did fail, (uint)7 would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toUlong()");
            pt(ulongDefault0);              //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToUlong() default value of (ulong)0 is returned.
            pt(ulongDefault8);              //Returns 12 If the conversion did fail, (ulong)8 would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toUshort()");
            pt(ushortDefault0);             //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToUshort() default value of (ushort)0 is returned.
            pt(ushortDefault9);             //Returns 12 If the conversion did fail, (ushort)9 would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toDecimal()");
            pt(decimalDefault0);            //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.ToDecimal() default value of 0.0M is returned.
            pt(decimalDefault1M);           //Returns 12 If the conversion did fail, 1M would be returned.

            p("-=-=-=-=-\nConverted \"12.5\" toDateTime()");
            pt(dateTimeDefaultNewDT);       //Returns "12/5/2018 12:00:00 AM" (if compiled in the US during the year of 2018) as "12.5" is read as month: 12, day: 5, and the rest are defaults. If the conversion did fail, the UnitOf.ToDateTime() default value of DateTime.Today is returned.
            pt(dateTimeDefaultToday);       //Returns "12/5/2018 12:00:00 AM"  If failed, returns DateTime.Today, today (your system's date and time) would be returned like 11/30/2008 12:00:00 AM.

            p("-=-=-=-=-\nConverted \"12.5\" toTimeSpan()");
            pt(timeSpanDefaultNewTS);       //Returns "00:00:00" as the conversion fails and this is the default
            pt(timeSpanDefaultFrom2Minues); //Returns "00:02:00" as the conversion fails and the default passed in was 2 minutes
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
