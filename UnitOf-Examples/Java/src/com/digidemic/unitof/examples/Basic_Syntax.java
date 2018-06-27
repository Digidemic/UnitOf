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

package com.digidemic.unitof.examples;

import com.digidemic.unitof.UnitOf;

/**
 * "Basic_Syntax" demonstrates many of the easy ways to use UnitOf for converting conventional measurements.
 * This "Basic_Syntax" class DOES NOT contain examples of UnitOf.DataType() and UnitOf.Anything().
 * These have their own examples that can also be found in this example project.
 */
public class Basic_Syntax {
    
    public static void oneLiner_1_Step(){
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 1 step conversion | One Liner, 12.5 feet to meters");
        
        double feetToMeters = new UnitOf.Length().fromFeet(12.5).toMeters();    //12.5 feet to meters = 3.81 meters
        
        pt(feetToMeters);   //prints 3.81 as 12.5 feet to meters = 3.81 meters
    }
    
    public static void setThenConvert_2_Steps(){
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 2 step conversion | set then convert to any unit of the measurement, 5 meters to feet and inches");
        
        UnitOf.Length meters = new UnitOf.Length().fromMeters(5);   //Instantiate UnitOf.Length meters and set "meters" variable as 5 meters
        double feet = meters.toFeet();      //5 meters to feet = ~16.404 feet
        double inches = meters.toInches();  //5 meters to inches = ~196.85 inches
        
        pt(feet);   //prints 16.404 as 5 meters to feet = ~16.404 feet
        pt(inches); //prints 196.85 as 5 meters to inches = ~196.85 inches
    }
    
    public static void instantiateSetThenConvert_3_Steps(){
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 3 step conversion | instantiate, set, then convert, 3 inches to feet and meters");
        
        UnitOf.Length length = new UnitOf.Length(); //Instantiate UnitOf.Length length
        length.fromInches(3);                       //Set length variable as 3 inches
        double feet = length.toFeet();              //3 inches to feet = 0.25 feet
        double meters = length.toMeters();          //3 inches to meters = 0.0762 meters
        
        pt(feet);   //prints 0.25 as 3 inches to feet = 0.25 feet
        pt(meters); //prints 0.0762 as 3 inches to meters = 0.0762 meters
    }
    
    public static void getFromTypeAndValue(){
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: Get the passed in \"from\" type constant and value | 5 meters is passed in");
        
        UnitOf.Length length = new UnitOf.Length().fromMeters(5);   //Instantiate UnitOf.Length length and set "length" variable as 5 meters
        String fromType = length.getTypeConstantPassed();           //"M" is returned as meters is the set "from" unit, "M" represents the contant of meters.
        Object fromVal = length.getValuePassed();                   //5 is returned as 5 meters is the set "from" unit and value.
        
        pt(fromType);   //prints "M" as meters is the current set from type
        pt(fromVal);    //prints 5 as the current set from value to meters was passed in as 5. Object is returned because other measurements like NumericBase and DataType can pass in values other than numbers.
        pt(new UnitOf.DataType(fromVal).toDouble(-1));  //prints 5 - shameless plug for UnitOf.DataType(), convert the fromVal of type Object to a double. If convertin to double fails, defailt to -1.
    }
        
    public static void setThenConvertTwice(){
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 2 step conversion reassigning \"from\" | set then convert, 5 meters to feet and inches then update from value to be 12.5 inches. Then convert to meters and inches");
        
        UnitOf.Length len = new UnitOf.Length().fromMeters(5);  //Instantiate UnitOf.Length len and set "len" variable as 5 meters
        double feet1 = len.toFeet();        //Prints 16.404 as 5 meters to feet = ~16.404 feet
        double inches1 = len.toInches();    //Prints 196.85 as 5 meters to inches = ~196.85 inches
        
        len.fromFeet(12.5);                 //Set len variable as 12.5 feet
        double meters2 = len.toMeters();    //Prints 3.81 as 12.5 feet to meters = 3.81 meters
        double inches2 = len.toInches();    //Prints 150 as 12.5 feet to inches = 150 inches
        
        pt(feet1);      //prints 16.404 as 5 meters to feet = ~16.404 feet
        pt(inches1);    //prints 196.85 as 5 meters to inches = ~196.85 inches
        pt(meters2);    //prints 3.81 as 12.5 feet to meters = 3.81 meters
        pt(inches2);    //prints 150 as 12.5 feet to inches = 150 inches
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
