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

package com.digidemic.unitof.examples.Inheritance;

import com.digidemic.unitof.UnitOf;

/**
 * Almost an exact copy of class "Basic_Syntax.java" only without having to write "UnitOf" anywhere in the body as it is being inherited for this class.
 * Any measurement from the UnitOf library can be used here as Length and Mass are demonstrated in oneLiner_1_Step().
 */
public class Extends_All_UnitOf_Measurements extends UnitOf{
    
    public static void oneLiner_1_Step(){
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 1 setp conversion|One Liner, 12.5 feet to meters");
        
        double feetToMeters = new Length().fromFeet(12.5).toMeters();           //12.5 feet to meters = 3.81 meters
        double poundsToKilograms = new Mass().fromPounds(12.5).toKilograms();   //12.5 pounds to kilograms = 5.669905 kilograms
        
        pt(feetToMeters);       //Prints 3.81 as 12.5 feet to meters = 3.81 meters
        pt(poundsToKilograms);  //Prints 5.6699 as 12.5 pounds to kilograms = 5.6699 kilograms
    }
    
    public static void setThenConvert_2_Steps(){
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 2 step conversion|set then convert, 5 meters to feet and inches");
        
        Length meters = new Length().fromMeters(5); //Instantiate UnitOf.Length meters and set "meters" variable as 5 meters
        double feet = meters.toFeet();      //5 meters to feet = ~16.404 feet
        double inches = meters.toInches();  //5 meters to inches = ~196.85 inches
        
        pt(feet);   //Prints 16.404 as 5 meters to feet = ~16.404 feet
        pt(inches); //Prints 196.85 as 5 meters to inches = ~196.85 inches
    }
    
    public static void instantiateSetThenConvert_3_Steps(){
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 3 step conversion|instantiate,set, then convert, 3 inches to feet and meters");
        
        Length length = new Length();       //Instantiate UnitOf.Length length
        length.fromInches(3);               //Set length variable as 3 inches
        double feet = length.toFeet();      //3 inches to feet = 0.25 feet
        double meters = length.toMeters();  //3 inches to meters = 0.0762 meters
        
        pt(feet);   //Prints 0.25 as 3 inches to feet = 0.25 feet
        pt(meters); //Prints 0.062 as 3 inches to meters = 0.0762 meters
    }
    
    public static void getFromTypeAndValue(){
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: Get the passed in from type constant and value");
        
        Length length = new Length().fromMeters(5);         //Instantiate UnitOf.Length length and set "length" variable as 5 meters
        String fromType = length.getTypeConstantPassed();   //"M" is returned as meters is the set "from" unit, "M" represents the contant of meters.
        Object fromVal = length.getValuePassed();           //5 is returned as 5 meters is the set "from" unit and value.
        
        pt(fromType);   //Prints "M" as meters is the current set from type
        pt(fromVal);    //Prints 5 as the current set from value to meters was passed in as 5. Object is returned because other measurements like NumericBase and DataType can pass in values other than numbers.
        pt(new DataType(fromVal).toDouble(-1)); //Prints 5. Shameless plug for UnitOf.DataType(), convert the fromVal of type Object to a double. If convertin to double fails, defailt to -1
    }
        
    public static void setThenConvertTwice(){
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 2 step conversion, set then convert, 5 meters to feet and inches. Update from value to be 12.5 inches. Then convert to meters and inches");
        
        Length len = new Length().fromMeters(5);    //Instantiate UnitOf.Length len and set "len" variable as 5 meters
        double feet1 = len.toFeet();        //5 meters to feet = ~16.404 feet
        double inches1 = len.toInches();    //5 meters to inches = ~196.85 inches
        
        len.fromFeet(12.5);                 //Set len variable as 12.5 feet
        double meters2 = len.toMeters();    //12.5 feet to meters = 3.81 meters
        double inches2 = len.toInches();    //12.5 feet to inches = 150 inches
        
        pt(feet1);      //Prints 16.404 as 5 meters to feet = ~16.404 feet
        pt(inches1);    //Prints 196.85 as 5 meters to inches = ~196.85 inches
        pt(meters2);    //Prints 3.81 as 12.5 feet to meters = 3.81 meters
        pt(inches2);    //Prints 150 as 12.5 feet to inches = 150 inches
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
