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
public class Basic_2_Step_Conversions {
    public static void run(){
        
        //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        /*
        Our initial value of "12.5" as type String is passed into our new instance of UnitOf.DataType.
        UnitOf.DataType determines the type passed in making it unnecessary for the user to have to manually define this.
        Below are also just a few examples of what can be passed in
        */
        p("\n-=-=-=-=-=-=-=-=-\nDataType_Class > Basic_2_Step_Conversions");
        p("-=-=-=-=-\nInstantiating UnitOf.DataType(\"12.5\")");
        UnitOf.DataType uoDataType = new UnitOf.DataType("12.5");   //String passed in.
        //uoDataType = new UnitOf.DataType(12.5);                   //Example of double passed in.
        //uoDataType = new UnitOf.DataType(12);                     //Example of int passed in.
        //uoDataType = new UnitOf.DataType('$');                    //Example of char pssed in.
        //uoDataType = new UnitOf.DataType(false);                  //Example of boolean passed in.
        //uoDataType = new UnitOf.DataType("12.5");                 //Back to our example, 12.5 in string form
        //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        
        /*
        getTypeConstantPassed() and getValuePassed() return the variable type and value passed in respectively.
        Because we passed in "12.5" as a String, the getTypeConstantPassed() will return the word "String".
        getValuePassed() will return "12.5" as a string since that is how it was passed in.
        */
        String dataTypePassedType = uoDataType.getTypeConstantPassed(); //The word "String" is returned
        Object dataTypePassedValue = uoDataType.getValuePassed();       //"12.5" as a String is returned
        
        
        /*
        Returns an double equivalent of what was passed in as the DataType value, "12.5". 
        If the conversion fails, The user defined parameter passed is returned. 
        Otherwise if nothing is passed in the UnitOf.toDouble() default value of 0.0d is returned. 
        */
        double doubleDefault0 = uoDataType.toDouble();          //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.toDouble() default value of 0.0d is returned.
        double doubleDefault1dot23 = uoDataType.toDouble(1.23); //Returns 12.5 If the conversion did fail, 1.23 would be returned.
        
        
        /*
        Returns an int equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
        If the conversion fails, The user defined parameter passed is returned. 
        Otherwise if nothing is passed in the UnitOf.toInt() default value of 0 is returned. 
        */   
        int intDefault0 = uoDataType.toInt();           //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.toInt() default value of 0 is returned.
        int intDefaultNeg25 = uoDataType.toInt(-25);    //Returns 12 If the conversion did fail, -25 would be returned.
        
        
        /*
        Returns a String equivalent of what was passed in as the DataType value, "12.5". 
        If the conversion fails, The user defined parameter passed is returned. 
        Otherwise if nothing is passed in the UnitOf.toString() default value of "" is returned. 
        */
        String stringDefaultEmptyStr = uoDataType.toString();           //String equivalent of "12.5" is returned, If the conversion did fail, the UnitOf.toString() default value of null is returned.
        String stringDefault1dot23Str = uoDataType.toString("1.23");    //Returns "12.5" If the conversion did fail, "1.23" would be returned.
        
        
        /*
        Returns a boolean equivalent of what was passed in as the DataType value, "12.5". 
        If the conversion fails, The user defined parameter passed is returned. 
        Otherwise if nothing is passed in the UnitOf.toBoolean() default value of false is returned. 
        NOTE: More in its own extended class - examples/DataType_Class/Boolean_Extended_Syntax.java
        */
        
        boolean booleanDefaultFalse = uoDataType.toBoolean();       //Conversion fails: false is returned. No default was passed in so the UnitOf.toBoolean() default of false is returned.
        boolean booleanDefaultTrue = uoDataType.toBoolean(true);    //Conversion fails: true is returned. Default of true was passed in so it is returned
        
             
        /*
        Returns a String fraction equivalent of what was passed in as the DataType value, "12.5". 
        If the conversion fails, The user defined parameter passed is returned. 
        Otherwise if nothing is passed in the UnitOf.toFraction() default value of "" is returned. 
        NOTE: More in its own exntended class - examples/DataType/_Class/Fraction_Extended_Syntax.java
        */
        String fractionDefaultEmpty = uoDataType.toFraction();          //Returns "25/2" passed in as 25 divided by 2 equals the DataType value passed in, 12.5. If the conversion did fail, the UnitOf.toFraction() default value of "" is returned.
        String fractionDefault2Slash5 = uoDataType.toFraction("2/5");   //Returns "25/2" If the conversion did fail, "2/5" would be returned.
        
        
        /*
        Returns an Object equivalent of what was passed in as the DataType value, "12.5". 
        If the conversion fails, The user defined parameter passed is returned. 
        Otherwise if nothing is passed in the UnitOf.toObject() default value of null is returned. 
        */
        Object objectDefaultNull = uoDataType.toObject();               //Object equivalent of "12.5" is returned, If the conversion fails, the UnitOf.toObject() default value of null is returned.
        Object objectDefault123 = uoDataType.toObject(123);             //Returns "12.5" If the conversion did fail, 123 as an Object would be returned.
        Object objectDefault1dot23 = uoDataType.toObject(1.23);         //Returns "12.5" If the conversion did fail, 1.23 as an Object would be returned.
        Object objectDefault12dot3Str = uoDataType.toObject("12.3");    //Returns "12.5" If the conversion did fail, "12.3" as an Object would be returned.
        
        
        /*
        Returns a char equivalent by taking the first non-spaced character of what was passed in as the DataType value, "12.5". 
        If the conversion fails, The user defined parameter passed is returned. 
        Otherwise if nothing is passed in the UnitOf.toChar() default value of '\u0000' is returned. 
        */
        char charDefaultCharNul = uoDataType.toChar();      //Returns '1' as it is the first non-spaced character of "12.5" passed in , If the conversion did fail, the UnitOf.toChar() default value of '\u0000' is returned.
        char charDefaultAtSign = uoDataType.toChar('@');    //Returns '1' If the conversion did fail, '@' would be returned.
        
        
        /*
        Returns an float equivalent of what was passed in as the DataType value, "12.5". 
        If the conversion fails, The user defined parameter passed is returned. 
        Otherwise if nothing is passed in the UnitOf.toFloat() default value of 0.0f is returned. 
        */  
        float floatDefault0 = uoDataType.toFloat();             //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.toFloat() default value of 0.0f is returned.
        float floatDefault1dot23f = uoDataType.toFloat(1.23f);  //Returns 12.5 If the conversion did fail, 1.23f would be returned.
        
        
        /*
        Returns an long equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
        If the conversion fails, The user defined parameter passed is returned. 
        Otherwise if nothing is passed in the UnitOf.toLong() default value of (long)0 is returned. 
        */    
        long longDefault0 = uoDataType.toLong();    //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.toLong() default value of (long)0 is returned.
        long longDefault25 = uoDataType.toLong(25); //Returns 12 If the conversion did fail, 25 would be returned.
        
        
        /*
        Returns a short equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
        If the conversion fails, The user defined parameter passed is returned. 
        Otherwise if nothing is passed in the UnitOf.toShort() default value of (short)0 is returned. 
        */
        short shortDefault0 = uoDataType.toShort();             //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.toShort() default value of (short)0 is returned.
        short shortDefault15 = uoDataType.toShort((short)15);   //Returns 12 If the conversion did fail, (short)15 would be returned.
        
        
        /*
        Returns a byte equivalent (ending decimal values will be dropped) of what was passed in as the DataType value, "12.5". 
        If the conversion fails, The user defined parameter passed is returned. 
        Otherwise if nothing is passed in the UnitOf.toByte() default value of (byte)0 is returned. 
        */
        byte byteDefault0 = uoDataType.toByte();        //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.toByte() default value of (byte)0 is returned.
        byte byteDefault5 = uoDataType.toByte((byte)5); //Returns 12 If the conversion did fail, (byte)5 would be returned.
         
        
        /*
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        Print Conversions
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        */     
        p("-=-=-=-=-\nType and Value Originally passed in (\"12.5\" as a String)");
        pt(dataTypePassedType);     //The word "String" is returned
        pt(dataTypePassedValue);    //"12.5" as a String is returned
        
        p("-=-=-=-=-\nConverted \"12.5\" toDouble()");
        pt(doubleDefault0);         //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.toDouble() default value of 0.0d is returned.
        pt(doubleDefault1dot23);    //Returns 12.5 If the conversion did fail, 1.23 would be returned.
        
        p("-=-=-=-=-\nConverted \"12.5\" toInt()");
        pt(intDefault0);            //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.toInt() default value of 0 is returned.
        pt(intDefaultNeg25);        //Returns 12 If the conversion did fail, -25 would be returned.

        p("-=-=-=-=-\nConverted \"12.5\" toString()");
        pt(stringDefaultEmptyStr);  //String equivalent of "12.5" is returned, If the conversion did fail, the UnitOf.toString() default value of null is returned.
        pt(stringDefault1dot23Str); //Returns 12 If the conversion did fail, -25 would be returned.

        p("-=-=-=-=-\nConverting toBoolean()");
        pt(booleanDefaultFalse);    //Conversion fails: false is returned. No default was passed in so the UnitOf.toBoolean() default of false is returned.
        pt(booleanDefaultTrue);     //Conversion fails: true is returned. Default of true was passed in so it is returned

        p("-=-=-=-=-\nConverting toFraction()");
        pt(fractionDefaultEmpty);   //Returns "25/2" passed in as 25 divided by 2 equals the DataType value passed in, 12.5. If the conversion did fail, the UnitOf.toFraction() default value of "" is returned.
        pt(fractionDefault2Slash5); //Returns "25/2" If the conversion did fail, "2/5" would be returned.
               
        p("-=-=-=-=-\nConverted \"12.5\" toObject()");
        pt(objectDefaultNull);      //Object equivalent of "12.5" is returned, If the conversion fails, the UnitOf.toObject() default value of null is returned.
        pt(objectDefault123);       //Returns "12.5" If the conversion did fail, 123 as an Object would be returned.
        pt(objectDefault1dot23);    //Returns "12.5" If the conversion did fail, 1.23 as an Object would be returned.
        pt(objectDefault12dot3Str); //Returns "12.5" If the conversion did fail, "12.3" as an Object would be returned.
         
        p("-=-=-=-=-\nConverted \"12.5\" toChar()");
        pt(charDefaultCharNul);     //Returns '1' as it is the first non-spaced character of "12.5" passed in , If the conversion did fail, the UnitOf.toChar() default value of '\u0000' is returned.
        pt(charDefaultAtSign);      //Returns '1' If the conversion did fail, '@' would be returned.
        
        p("-=-=-=-=-\nConverted \"12.5\" toFloat()");
        pt(floatDefault0);          //Returns 12.5 from "12.5", If the conversion did fail, the UnitOf.toFloat() default value of 0.0f is returned.
        pt(floatDefault1dot23f);    //Returns 12.5 If the conversion did fail, 1.23f would be returned.
        
        p("-=-=-=-=-\nConverted \"12.5\" toLong()");
        pt(longDefault0);           //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.toLong() default value of (long)0 is returned.
        pt(longDefault25);          //Returns 12 If the conversion did fail, 25 would be returned.
         
        p("-=-=-=-=-\nConverted \"12.5\" toShort()");
        pt(shortDefault0);          //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.toShort() default value of (short)0 is returned.
        pt(shortDefault15);         //Returns 12 If the conversion did fail, (short)15 would be returned.
         
        p("-=-=-=-=-\nConverted \"12.5\" toByte()");
        pt(byteDefault0);           //Returns 12 as "12.5" passed in is a non-decimal type so the ".5" is dropped, If the conversion did fail, the UnitOf.toByte() default value of (byte)0 is returned.
        pt(byteDefault5);           //Returns 12 If the conversion did fail, (byte)5 would be returned.  
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
