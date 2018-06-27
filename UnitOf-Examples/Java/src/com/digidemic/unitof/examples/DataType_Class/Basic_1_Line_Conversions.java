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

package com.digidemic.unitof.examples.DataType_Class;

import com.digidemic.unitof.UnitOf;
import java.util.Date;

/**
 * Convert any Java data type and more including converting to and from fractions.
 * 
 * Default Values:
 * 
 * When a conversion in DataType fails its default, passed by caller as a parameter or if not uses UnitOf's defaults, is returned.
 * UnitOf defaults (when no parameter is passed) for each method are as follows:
 * toObject(): null
 * toString(): ""
 * toBoolean(): false
 * toChar(): '\u0000'
 * toByte(): (byte)0
 * toShort(): (short)0
 * toInt(): 0
 * toLong(): (long)0
 * toFloat(): 0.0f
 * toDouble(): 0.0d
 * toFraction(): ""
 * 
 * NOTE: toByte, toInt, toLong, toFloat, and toDouble methods on failure will attempt to read the value as a fraction and convert it to a decimal form.
 * This is to account for fractions originally passed in as Strings to be converted as a number type (EX: "2/4" toDouble() will return 0.5).
 * 
 */
public class Basic_1_Line_Conversions {
    public static void run(){
        p("\n-=-=-=-=-=-=-=-=-\nDataType_Class > Basic_1_Line_Conversions");
        
        /*
        Get Passed DataType Value and Type
        */
        String passedDataType = new UnitOf.DataType(1.23).getTypeConstantPassed();  //Returns "Double" as the data type passed in (1.23) is a float.
        Object passedValue = new UnitOf.DataType(1.23).getValuePassed();            //Returns 1.23 as it is the original value passed.
              
        /*
        To Double
        
        Tries to convert the value passed in the UnitOf.DataType() constructor into a double type.
        If this conversion fails the default value (which may be passed in as a parameter) is returned.
        */
        double intToDouble_default0 = new UnitOf.DataType(12).toDouble();               //Returns 12.0 from 12 (int). If the conversion did fail, the .toDouble() default value of 0.0d is returned.
        double doubleToDouble_default7 = new UnitOf.DataType(12.5).toDouble(7.0);       //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toDouble() passed default value of 7.0 is returned.
        double stringDoubleToDouble_default0 = new UnitOf.DataType("-12.5").toDouble(); //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toDouble() default value of 0.0d is returned.
        double booleanToDouble_default7 = new UnitOf.DataType(true).toDouble(7.0);      //Conversion fails: Returns 7.0 from true (boolean). Because the conversion failed to convert the boolean "true" to a double, its passed default value of 7.0 was returned.
        double fractionToDouble_default0 = new UnitOf.DataType("5/2").toDouble();       //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toDouble() default value of 0.0d is returned.
        double charToDouble_default7 = new UnitOf.DataType('5').toDouble(7.0);          //Returns 5.0 from '5' (char). If the conversion did fail, the .toDouble() passed default value of 7.0 is returned.
        double longToDouble_default0 = new UnitOf.DataType((long)new Date().getTime()).toDouble();  //Using system's time in milliseconds at time of execution (can be 1500000000000 (long)) will return 1.5 x 10^12. If the conversion did fail, the .toDouble() default value of 0.0d is returned.
        
        /*
        To Int
        
        Tries to convert the value passed in the UnitOf.DataType() constructor into an int type.
        If this conversion fails the default value (which may be passed in as a parameter) is returned.
        */
        int intToInt_default0 = new UnitOf.DataType(12).toInt();                //Returns 12 from 12 (int). If the conversion did fail, the .toInt() default value of 0 is returned.
        int doubleToInt_default7 = new UnitOf.DataType(12.5).toInt(7);          //Returns 12 from 12.5 (double). If the conversion did fail, the .toInt() passed default value of 7 is returned.
        int stringDoubleToInt_default0 = new UnitOf.DataType("-12.5").toInt();  //Returns -12 from "-12.5" (String). If the conversion did fail, the .toInt() default value of 0 is returned.
        int booleanToInt_default7 = new UnitOf.DataType(true).toInt(7);         //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
        int fractionToInt_default0 = new UnitOf.DataType("5/2").toInt();        //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .toInt() default value of 0 is returned.
        int charToInt_default7 = new UnitOf.DataType('5').toInt(7);             //Returns 5 from '5' (char). If the conversion did fail, the .toInt() passed default value of 7 is returned.
        int longToInt_default0 = new UnitOf.DataType((long)new Date().getTime()).toInt();   //Using system's time in milliseconds at time of execution (can be 1500000000000 (long)) will return 2147483647 since the original value exceeds the max int value (which is returned). If the conversion did fail, the .toDouble() default value of 0 is returned.
        
        /*
        To String
        
        Tries to convert the value passed in the UnitOf.DataType() constructor into a String type.
        If this conversion fails the default value (which may be passed in as a parameter) is returned.
        */
        String intToString_defaultEmptyString = new UnitOf.DataType(12).toString();                         //Returns "12" from 12 (int). If the conversion did fail, the .toString() default value of "" is returned.
        String doubleToString_defaultFailedTxt = new UnitOf.DataType(12.5).toString("Conversion Failed");   //Returns "12.5" from 12.5 (double). If the conversion did fail, the .toString() passed default value of "Conversion Failed" is returned.
        String stringDoubleToString_default0 = new UnitOf.DataType("-12.5").toString();                     //Returns "-12.5" from "-12.5" (String). If the conversion did fail, the .toString() default value of "" is returned.
        String booleanToString_defaultFailedTxt = new UnitOf.DataType(true).toString("Conversion Failed");  //Returns "true" from true (boolean). Because the conversion failed to convert the boolean "true" to a String, its passed default value of "Conversion Failed" was returned.
        String fractionToString_default0 = new UnitOf.DataType("5/2").toString();                           //Returns "5/2" from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toString() default value of "" is returned.
        String charToString_defaultFailedTxt = new UnitOf.DataType('5').toString("Conversion Failed");      //Returns "5" from '5' (char). If the conversion did fail, the .toString() passed default value of "Conversion Failed" is returned.
        String longToString_default0 = new UnitOf.DataType((long)new Date().getTime()).toString();          //Using system's time in milliseconds at time of execution (can be 1500000000000 (long)) will return "1500000000000". If the conversion did fail, the .toString() default value of "" is returned.
           
        /*
        To Boolean - More in its own extended class - examples/DataType_Class/Boolean_Extended_Syntax.java
        
        Tries to convert the value passed in the UnitOf.DataType() constructor into a boolean type.
        If this conversion fails the default value (which may be passed in as a parameter) is returned.
        */
        boolean doubleToBoolean_defaultFalse = new UnitOf.DataType(12.5).toBoolean();           //Conversion fails: Returns false from 12.5 (double). Because the conversion failed to convert the double "12.5" to a boolean, its default value of false was returned.
        boolean stringDoubleToBoolean_defaultTrue = new UnitOf.DataType("-12").toBoolean(true); //Conversion fails: Returns true from "-12" (String). Because the conversion failed to convert the String "-12" to a boolean, its passed default value of true was returned.
        boolean stringBooleanToBoolean_defaultFalse = new UnitOf.DataType("TrUe").toBoolean();  //Returns true from "TrUe" (String). If the conversion did fail, the .toBoolean() default value of false is returned.
        boolean stringToBoolean_falseIfNotContained = new UnitOf.DataType("12.5").toBoolean(new Integer[]{5,12,3},false,true);  //(More information on this form of the syntax in Boolean_Extended_Syntax.java)Returns true from "12.5" with containing searching values of 5, 12, and 3. "12" is within "12.5" so true. Otherwise the default of false would have been returned.
    
        /*
        To Fraction - More in its own extended class - examples/DataType_Class/Fraction_Extended_Syntax.java
        
        Tries to convert the value passed in the UnitOf.DataType() constructor into a fraction of type String.
        This simplifies existing fraction Strings or turn numeric values into fraction Strings.
        */
        String doubleToFraction_default3Over2 = new UnitOf.DataType(12.5).toFraction("3/2");                //Returns "25/2" from 12.5 (double). If the conversion did fail, the .toFraction() passed default value of "3/2" is returned.
        String stringDoubleToFraction_defaultEmptyString = new UnitOf.DataType("-12.5").toFraction();       //Returns "-25/2" from 12.5 (double). If the conversion did fail, the .toFraction() passed default value of "" is returned.
        String stringToFraction_default3Over2 = new UnitOf.DataType("Can't make a fraction outta this").toFraction("3/2");  //Conversion fails: Returns "3/2" from "Can't make a fraction outta this" (String). Because the conversion failed to convert the String "Can't make a fraction outta this" to a fraction, its passed default value of "3/2" was returned.
        String reducableFractionToFraction_defaultEmptyString = new UnitOf.DataType("2/4").toFraction();    //Returns "1/2" from "2/4" (String fraction). If the conversion did fail, the .toFraction() passed default value of "" is returned.
        String simplifiableFractionToFraction_defaultEmptyString = new UnitOf.DataType("5/2").toFraction(); //Returns "5/2" from "5/2" (String fraction). If the conversion did fail, the .toFraction() passed default value of "" is returned.
                
        /*
        Fraction String to Decimal
        
        Demonstrates that fractions as strings can be converted into their decimal equivalent.
        */
        double reducableFractionToDouble_default0 = new UnitOf.DataType("2/4").toDouble();          //Returns 0.5 from "2/4" (String fraction). If the conversion did fail, the .toDouble() default value of 0.0d is returned.
        double simplifiableFractionToDecimal_default50 = new UnitOf.DataType("5/2").toDouble(50);   //Returns 2.5 from "5/2" (String fraction). If the conversion did fail, the .toDouble() default value of 50 is returned.
               
        /*
        To Object
        
        Tries to convert the value passed in the UnitOf.DataType() constructor into an Object type.
        If this conversion fails the default value (which may be passed in as a parameter) is returned.
        */
        Object stringToObject_defaultNull = new UnitOf.DataType("12.5").toObject();                 //Returns "12.5" from "12.5" (String). If the conversion did fail, the .toObject() default value of null is returned.
        Object stringToObject_default1dot23Double = new UnitOf.DataType("12.5").toObject(1.23);     //Returns "12.5" from "12.5" (String). If the conversion did fail, the .toObject() passed default value of 1.23 is returned.
        Object stringToObject_default12dot3String = new UnitOf.DataType("12.5").toObject("12.3");   //Returns "12.5" from "12.5" (String). If the conversion did fail, the .toObject() passed default value of "12.3" is returned.
        
        /*
        To Char
        
        Tries to convert the value passed in the UnitOf.DataType() constructor into a char type.
        If this conversion fails the default value (which may be passed in as a parameter) is returned.
        */
        char intToChar_default0 = new UnitOf.DataType(12).toChar();                     //Returns '1' from 12 (int). If the conversion did fail, the .toChar() default value of '\u0000' is returned.
        char doubleToChar_default7 = new UnitOf.DataType(12.5).toChar('@');             //Returns '1' from 12.5 (double). If the conversion did fail, the .toChar() passed default value of '@' is returned.
        char stringDoubleToChar_default0 = new UnitOf.DataType("-12.5").toChar();       //Returns '-' from "-12.5" (String). If the conversion did fail, the .toChar() default value of '\u0000' is returned.
        char booleanToChar_default7 = new UnitOf.DataType(true).toChar('@');            //Returns 't' from '@' (char). If the conversion did fail, the .toChar() passed default value of '@' is returned.
        char stringTextToChar_default0 = new UnitOf.DataType("String Example").toChar();//Returns 'S' from "String Example" (String). If the conversion did fail, the .toChar() default value of '\u0000' is returned.
              
        /*
        To Float
        
        Tries to convert the value passed in the UnitOf.DataType() constructor into a float type.
        If this conversion fails the default value (which may be passed in as a parameter) is returned.
        */
        double intToFloat_default0 = new UnitOf.DataType(12).toFloat();                 //Returns 12.0 from 12 (int). If the conversion did fail, the .toFloat() default value of 0.0f is returned.
        double doubleToFloat_default7f = new UnitOf.DataType(12.5).toFloat(7.0f);       //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toFloat() passed default value of 7.0f is returned.
        double stringDoubleToFloat_default0 = new UnitOf.DataType("-12.5").toFloat();   //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toFloat() default value of 0.0f is returned.
        double booleanToFloat_default7f = new UnitOf.DataType(true).toFloat(7.0f);      //Conversion fails: Returns 7.0f from true (boolean). Because the conversion failed to convert the boolean "true" to a float, its passed default value of 7.0f was returned.
        double fractionToFloat_default0 = new UnitOf.DataType("5/2").toFloat();         //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toFloat() default value of 0.0f is returned.
        double charToFloat_default7f = new UnitOf.DataType('5').toFloat(7.0f);          //Returns 5.0 from '5' (char). If the conversion did fail, the .toFloat() passed default value of 7.0f is returned.
        double longToFloat_default0 = new UnitOf.DataType((long)new Date().getTime()).toFloat();    //Using system's time in milliseconds at time of execution (can be 1500000000000 (long)) will return 1.5 x 10^12. If the conversion did fail, the .toFloat() default value of 0.0f is returned.
            
        /*
        To Long
        
        Tries to convert the value passed in the UnitOf.DataType() constructor into a long type.
        If this conversion fails the default value (which may be passed in as a parameter) is returned.
        */
        long intToLong_default0 = new UnitOf.DataType(12).toLong();                 //Returns 12 from 12 (int). If the conversion did fail, the .toLong() default value of 0 is returned.
        long doubleToLong_default7 = new UnitOf.DataType(12.5).toLong(7);           //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toLong() passed default value of 7 is returned.
        long stringDoubleToLong_default0 = new UnitOf.DataType("-12.5").toLong();   //Returns -12 from "-12.5" (String). If the conversion did fail, the .toLong() default value of 0 is returned.
        long booleanToLong_default7 = new UnitOf.DataType(true).toLong(7);          //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a long, its passed default value of 7 was returned.
        long fractionToLong_default0 = new UnitOf.DataType("5/2").toLong();         //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to long. If the conversion did fail, the .toLong() default value of 0 is returned.
        long charToLong_default7 = new UnitOf.DataType('5').toLong(7);              //Returns 5 from '5' (char). If the conversion did fail, the .toLong() passed default value of 7 is returned.
        long longToLong_default0 = new UnitOf.DataType((long)new Date().getTime()).toLong();    //Using system's time in milliseconds at time of execution (can be 1500000000000 (long)) will return the same value of 1500000000000. If the conversion did fail, the .toLong() default value of 0 is returned.
               
        /*
        To Short
        
        Tries to convert the value passed in the UnitOf.DataType() constructor into a short type.
        If this conversion fails the default value (which may be passed in as a parameter) is returned.
        */
        short intToShort_default0 = new UnitOf.DataType(12).toShort();               //Returns 12 from 12 (int). If the conversion did fail, the .toShort() default value of 0 is returned.
        short doubleToShort_default7 = new UnitOf.DataType(12.5).toShort((short)7);  //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toShort() passed default value of 7 is returned.
        short stringDoubleToShort_default0 = new UnitOf.DataType("-12.5").toShort(); //Returns -12 from "-12.5" (String). If the conversion did fail, the .toShort() default value of 0 is returned.
        short booleanToShort_default7 = new UnitOf.DataType(true).toShort((short)7); //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a short, its passed default value of 7 was returned.
        short fractionToShort_default0 = new UnitOf.DataType("5/2").toShort();       //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to short. If the conversion did fail, the .toShort() default value of 0 is returned.
        short charToShort_default7 = new UnitOf.DataType('5').toShort((short)7);     //Returns 5 from '5' (char). If the conversion did fail, the .toShort() passed default value of 7 is returned.
        short longToShort_default0 = new UnitOf.DataType((long)new Date().getTime()).toShort();  //Using system's time in milliseconds at time of execution (can be 1500000000000 (short)) will return -1 because it exceeds its max data type value. If the conversion did fail, the .toShort() default value of 0 is returned.
              
        /*
        To Byte
        
        Tries to convert the value passed in the UnitOf.DataType() constructor into a byte type.
        If this conversion fails the default value (which may be passed in as a parameter) is returned.
        */
        byte intToByte_default0 = new UnitOf.DataType(12).toByte();                 //Returns 12 from 12 (int). If the conversion did fail, the .toByte() default value of 0 is returned.
        byte doubleToByte_default7 = new UnitOf.DataType(12.5).toByte((byte)7);     //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toByte() passed default value of 7 is returned.
        byte stringDoubleToByte_default0 = new UnitOf.DataType("-12.5").toByte();   //Returns -12 from "-12.5" (String). If the conversion did fail, the .toByte() default value of 0 is returned.
        byte booleanToByte_default7 = new UnitOf.DataType(true).toByte((byte)7);    //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a byte, its passed default value of 7 was returned.
        byte fractionToByte_default0 = new UnitOf.DataType("5/2").toByte();         //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to byte. If the conversion did fail, the .toByte() default value of 0 is returned.
        byte charToByte_default7 = new UnitOf.DataType('5').toByte((byte)7);        //Returns 5 from '5' (char). If the conversion did fail, the .toByte() passed default value of 7 is returned.
        byte longToByte_default0 = new UnitOf.DataType((long)new Date().getTime()).toByte();    //Using system's time in milliseconds at time of execution (can be 1500000000000 (byte)) will return -1 because it exceeds its max data type value. If the conversion did fail, the .toByte() default value of 0 is returned.
        
        
        /*
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        Print Conversions
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        */
        p("-=-=-=-=-\nType and Value passed in (1.23 as a double)");
        pt("Passed Data Type: " + passedDataType);
        pt("Passed Value: " + passedValue);
        
        p("-=-=-=-=-\nConverted toDouble()");
        pt("intToDouble_default0: " + intToDouble_default0);                    //Returns 12.0 from 12 (int). If the conversion did fail, the .toDouble() default value of 0.0d is returned.
        pt("doubleToDouble_default7: " + doubleToDouble_default7);              //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toDouble() passed default value of 7.0 is returned.
        pt("stringDoubleToDouble_default0: " + stringDoubleToDouble_default0);  //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toDouble() default value of 0.0d is returned.
        pt("booleanToDouble_default7: " + booleanToDouble_default7);            //Conversion fails: Returns 7.0 from true (boolean). Because the conversion failed to convert the boolean "true" to a double, its passed default value of 7.0 was returned.
        pt("fractionToDouble_default0: " + fractionToDouble_default0);          //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toDouble() default value of 0.0d is returned.
        pt("charToDouble_default7: " + charToDouble_default7);                  //Returns 5.0 from '5' (char). If the conversion did fail, the .toDouble() passed default value of 7.0 is returned.
        pt("longToDouble_default0: " + longToDouble_default0);                  //Using system's time in milliseconds at time of execution (can be 1500000000000 (long)) will return 1.5 x 10^12. If the conversion did fail, the .toDouble() default value of 0.0d is returned.
        
        p("-=-=-=-=-\nConverted toInt()");
        pt("intToInt_default0: " + intToInt_default0);                  //Returns 12 from 12 (int). If the conversion did fail, the .toInt() default value of 0 is returned.
        pt("doubleToInt_default7: " + doubleToInt_default7);            //Returns 12 from 12.5 (double). If the conversion did fail, the .toInt() passed default value of 7.0 is returned.
        pt("stringDoubleToInt_default0: " + stringDoubleToInt_default0);//Returns -12 from "-12.5" (String). If the conversion did fail, the .toInt() default value of 0 is returned.
        pt("booleanToInt_default7: " + booleanToInt_default7);          //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a int, its passed default value of 7 was returned.
        pt("fractionToInt_default0: " + fractionToInt_default0);        //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to int. If the conversion did fail, the .toInt() default value of 0 is returned.
        pt("charToInt_default7: " + charToInt_default7);                //Returns 5 from '5' (char). If the conversion did fail, the .toInt() passed default value of 7 is returned.
        pt("longToInt_default0: " + longToInt_default0);                //Using system's time in milliseconds at time of execution (can be 1500000000000 (long)) will return 2147483647 since the original value exceeds the max int value (which is returned). If the conversion did fail, the .toDouble() default value of 0.0d is returned.
        
        p("-=-=-=-=-\nConverted toString()");
        pt("intToString_defaultEmptyString: " + intToString_defaultEmptyString);    //Returns "12" from 12 (int). If the conversion did fail, the .toString() default value of "" is returned.
        pt("doubleToString_defaultFailedTxt: " + doubleToString_defaultFailedTxt);  //Returns "12.5" from 12.5 (double). If the conversion did fail, the .toString() passed default value of "Conversion Failed" is returned.
        pt("stringDoubleToString_default0: " + stringDoubleToString_default0);      //Returns "-12.5" from "-12.5" (String). If the conversion did fail, the .toString() default value of "" is returned.
        pt("booleanToString_defaultFailedTxt: " + booleanToString_defaultFailedTxt);//Returns "true" from true (boolean). Because the conversion failed to convert the boolean "true" to a String, its passed default value of "Conversion Failed" was returned.
        pt("fractionToString_default0: " + fractionToString_default0);              //Returns "5/2" from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toString() default value of "" is returned.
        pt("charToString_defaultFailedTxt: " + charToString_defaultFailedTxt);      //Returns "5" from '5' (char). If the conversion did fail, the .toString() passed default value of "Conversion Failed" is returned.
        pt("longToString_default0: " + longToString_default0);                      //Using system's time in milliseconds at time of execution (can be 1500000000000 (long)) will return "1500000000000". If the conversion did fail, the .toString() default value of "" is returned.
        
        p("-=-=-=-=-\nConverted toBoolean()");
        pt("doubleToBoolean_defaultFalse: " + doubleToBoolean_defaultFalse);                //Conversion fails: Returns false from 12.5 (double). Because the conversion failed to convert the double "12.5" to a boolean, its default value of false was returned.
        pt("stringDoubleToBoolean_defaultTrue: " + stringDoubleToBoolean_defaultTrue);      //Conversion fails: Returns true from "-12" (String). Because the conversion failed to convert the String "-12" to a boolean, its passed default value of true was returned.
        pt("stringBooleanToBoolean_defaultFalse: " + stringBooleanToBoolean_defaultFalse);  //Returns true from "TrUe" (String). If the conversion did fail, the .toBoolean() default value of false is returned.
        pt("stringToBoolean_falseIfNotContained: " + stringToBoolean_falseIfNotContained);  //(More information on this form of the syntax in Boolean_Extended_Syntax.java)Returns true from "12.5" with containing searching values of 5, 12, and 3. "12" is within "12.5" so true. Otherwise the default of false would have been returned.

        p("-=-=-=-=-\nConverted toFraction()");
        pt("doubleToFraction_default3Over2: " + doubleToFraction_default3Over2);                                        //Returns "25/2" from 12.5 (double). If the conversion did fail, the .toFraction() passed default value of "3/2" is returned.
        pt("stringDoubleToFraction_defaultEmptyString: " + stringDoubleToFraction_defaultEmptyString);                  //Returns "-25/2" from 12.5 (double). If the conversion did fail, the .toFraction() passed default value of "" is returned.
        pt("stringToFraction_default3Over2: " + stringToFraction_default3Over2);                                        //Conversion fails: Returns "3/2" from "Can't make a fraction outta this" (String). Because the conversion failed to convert the String "Can't make a fraction outta this" to a fraction, its passed default value of "3/2" was returned.
        pt("reducableFractionToFraction_defaultEmptyString: " + reducableFractionToFraction_defaultEmptyString);        //Returns "1/2" from "2/4" (String fraction). If the conversion did fail, the .toFraction() passed default value of "" is returned.
        pt("simplifiableFractionToFraction_defaultEmptyString: " + simplifiableFractionToFraction_defaultEmptyString);  //Returns "5/2" from "5/2" (String fraction). If the conversion did fail, the .toFraction() passed default value of "" is returned.
        
        p("-=-=-=-=-\nConverted Fraction passed toDecimal()");
        pt("reducableFractionToDouble_default0: " + reducableFractionToDouble_default0);            //Returns 0.5 from "2/4" (String fraction). If the conversion did fail, the .todouble() default value of 0.0d is returned.
        pt("simplifiableFractionToDecimal_default50: " + simplifiableFractionToDecimal_default50);  //Returns 2.5 from "5/2" (String fraction). If the conversion did fail, the .todouble() default value of 50 is returned.
        
        p("-=-=-=-=-\nConverted toObject()");
        pt("stringToObject_defaultNull: " + stringToObject_defaultNull);                //Returns "12.5" from "12.5" (String). If the conversion did fail, the .toObject() default value of null is returned.
        pt("stringToObject_default1dot23Double: " + stringToObject_default1dot23Double);//Returns "12.5" from "12.5" (String). If the conversion did fail, the .toObject() passed default value of 1.23 is returned.
        pt("stringToObject_default12dot3String: " + stringToObject_default12dot3String);//Returns "12.5" from "12.5" (String). If the conversion did fail, the .toObject() passed default value of "12.3" is returned.
        
        p("-=-=-=-=-\nConverted toChar()");
        pt("intToChar_default0: " + intToChar_default0);                    //Returns '1' from 12 (int). If the conversion did fail, the .toChar() default value of '\u0000' is returned.
        pt("doubleToChar_default7: " + doubleToChar_default7);              //Returns '1' from 12.5 (double). If the conversion did fail, the .toChar() passed default value of '@' is returned.
        pt("stringDoubleToChar_default0: " + stringDoubleToChar_default0);  //Returns '-' from "-12.5" (String). If the conversion did fail, the .toChar() default value of '\u0000' is returned.
        pt("booleanToChar_default7: " + booleanToChar_default7);            //Returns 't' from '@' (char). If the conversion did fail, the .toChar() passed default value of '@' is returned.
        pt("stringTextToChar_default0: " + stringTextToChar_default0);      //Returns 'S' from "String Example" (String). If the conversion did fail, the .toChar() default value of '\u0000' is returned.
              
        p("-=-=-=-=-\nConverted toFloat()");
        pt("intToFloat_default0: " + intToFloat_default0);                  //Returns 12.0 from 12 (int). If the conversion did fail, the .toFloat() default value of 0.0f is returned.
        pt("doubleToFloat_default7f: " + doubleToFloat_default7f);          //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toFloat() passed default value of 7.0f is returned.
        pt("stringDoubleToFloat_default0: " + stringDoubleToFloat_default0);//Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toFloat() default value of 0.0f is returned.
        pt("booleanToFloat_default7f: " + booleanToFloat_default7f);        //Conversion fails: Returns 7.0f from true (boolean). Because the conversion failed to convert the boolean "true" to a float, its passed default value of 7.0f was returned.
        pt("fractionToFloat_default0: " + fractionToFloat_default0);        //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toFloat() default value of 0.0f is returned.
        pt("charToFloat_default7f: " + charToFloat_default7f);              //Returns 5.0 from '5' (char). If the conversion did fail, the .toFloat() passed default value of 7.0f is returned.
        pt("longToFloat_default0: " + longToFloat_default0);                //Using system's time in milliseconds at time of execution (can be 1500000000000 (long)) will return 1.5 x 10^12. If the conversion did fail, the .toFloat() default value of 0.0f is returned.
        
        p("-=-=-=-=-\nConverted toLong()");
        pt("intToLong_default0: " + intToLong_default0);                    //Returns 12 from 12 (int). If the conversion did fail, the .toLong() default value of 0 is returned.
        pt("doubleToLong_default7: " + doubleToLong_default7);              //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toLong() passed default value of 7 is returned.
        pt("stringDoubleToLong_default0: " + stringDoubleToLong_default0);  //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toLong() default value of 0 is returned.
        pt("booleanToLong_default7: " + booleanToLong_default7);            //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a long, its passed default value of 7 was returned.
        pt("fractionToLong_default0: " + fractionToLong_default0);          //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to long. If the conversion did fail, the .toLong() default value of 0 is returned.
        pt("charToLong_default7: " + charToLong_default7);                  //Returns 5 from '5' (char). If the conversion did fail, the .toLong() passed default value of 7 is returned.
        pt("longToLong_default0: " + longToLong_default0);                  //Using system's time in milliseconds at time of execution (can be 1500000000000 (long)) will return the same value of 1500000000000. If the conversion did fail, the .toLong() default value of 0 is returned.
        
        p("-=-=-=-=-\nConverted toShort()");
        pt("intToShort_default0: " + intToShort_default0);                  //Returns 12 from 12 (int). If the conversion did fail, the .toShort() default value of 0 is returned.
        pt("doubleToShort_default7: " + doubleToShort_default7);            //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toShort() passed default value of 7 is returned.
        pt("stringDoubleToShort_default0: " + stringDoubleToShort_default0);//Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toShort() default value of 0 is returned.
        pt("booleanToShort_default7: " + booleanToShort_default7);          //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a short, its passed default value of 7 was returned.
        pt("fractionToShort_default0: " + fractionToShort_default0);        //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to short. If the conversion did fail, the .toShort() default value of 0 is returned.
        pt("charToShort_default7: " + charToShort_default7);                //Returns 5 from '5' (char). If the conversion did fail, the .toShort() passed default value of 7 is returned.
        pt("longToShort_default0: " + longToShort_default0);                //Using system's time in milliseconds at time of execution (can be 1500000000000 (short)) will return -1 because it exceeds its max data type value. If the conversion did fail, the .toShort() default value of 0 is returned.
        
        p("-=-=-=-=-\nConverted toByte()");
        pt("intToByte_default0: " + intToByte_default0);                    //Returns 12 from 12 (int). If the conversion did fail, the .toByte() default value of 0 is returned.
        pt("doubleToByte_default7: " + doubleToByte_default7);              //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toByte() passed default value of 7 is returned.
        pt("stringDoubleToByte_default0: " + stringDoubleToByte_default0);  //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toByte() default value of 0 is returned.
        pt("booleanToByte_default7: " + booleanToByte_default7);            //Conversion fails: Returns 7 from true (boolean). Because the conversion failed to convert the boolean "true" to a byte, its passed default value of 7 was returned.
        pt("fractionToByte_default0: " + fractionToByte_default0);          //Returns 2 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form then rounds down to byte. If the conversion did fail, the .toByte() default value of 0 is returned.
        pt("charToByte_default7: " + charToByte_default7);                  //Returns 5 from '5' (char). If the conversion did fail, the .toByte() passed default value of 7 is returned.
        pt("longToByte_default0: " + longToByte_default0);                  //Using system's time in milliseconds at time of execution (can be 1500000000000 (byte)) will return -1 because it exceeds its max data type value. If the conversion did fail, the .toByte() default value of 0 is returned.
    }
    
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    //Print object passed, starting with a tab
    private static void pt(Object o){
        p("\t" + o);
    }
    
    //Print object passed
    private static void p(Object o){
        System.out.println(String.valueOf(o));
    }
}
