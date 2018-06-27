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

package com.digidemic.unitof.examples.Anything_Class;

import com.digidemic.unitof.UnitOf;

/**
 * Example on how to create your own custom UnitOf measurements.
 * The following demonstrates the possible parameters and methods to use.
 * 
 * The way the code below is written is to just show the amount of options you have with the syntax.
 * This is not a realistic example of how this would actually be written in a program.
 * 
 * NOTE: While you can create UnitOf.Anywhere instances at runtime (like this example) it is highly
 * recommended to create a static class for your UnitOf.Anything() functionality so it is at runtime compile time
 * 
 * Please see the "CompileTime" directory within the "Anything_Class" directory for some examples of what these could look like.
 * examples/Anything_Class/CompileTime/
 */
public class Main_Example_RunTime {

    public static void run(){
        p("\n-=-=-=-=-=-=-=-=-\nAnything_Class > Main_Example_RunTime");
        
        /*
        Units available for our custom UnitOf measurement
        */
        final String FEET = "Feet";     //Unit name "Feet" as String.
        final String METERS = "Meters"; //Unit name "Meters" as String.
        final double INCHES = 12;       //Unit name can also be the key conversion value (12 inches in 1 foot).
        
        /*
        Create our custom UnitOf measurement and add the units with their values.
        The values are defined by how many units it takes to equal one key unit.
        Key = 1 foot | values = 12 inches (12 inches in 1 foot), 0.3048 meters (0.3048 meters in 1 foot)
        */
        UnitOf.Anything length = new UnitOf.Anything(FEET); //Our key if 1 foot. All added units are their conversion into 1 foot.
        length.addUnit(METERS, 0.3048);                     //Unit name/value: 0.3048 Meters in 1 foot. 
        length.addUnit(INCHES);                             //Unit name/value: 12 inches in 1 foot.
        
        /*
        One line conversions 
        
        No "from" value set yet but can still perform one line conversions by passing in the "from" unit and value as well as the "to" unit.
        */
        double from12d5_FeetToMeters = length.convertNow(12.5, FEET, METERS);  //Returns 3.81 as 12.5 feet to meters = 3.81 meters
        double from12d5_FeetToInches = length.convertNow(12.5, FEET, INCHES);  //Returns 150 as 12.5 feet to inches = 150 inches
           
        /*
        Setting then converting
        
        The custom UnitOf measurement can define a "from" unit/value so to allow it to be converted more than once.
        */
        length.from(METERS, 5);                             //Set the length to 5 Meters
        double from5_MetersToFeet = length.to(FEET);        //Returns 16.404 as 5 meters to feet = ~16.404 feet
        double from5_MetersToInches = length.to(INCHES);    //Returns 196.85 as 5 meters to inches = ~196.85 inches
        
        
        /*
        Returns the currently set values
        */
        p("\n-=-=-=-=-=-=-=-=-\nCurrent Set Values");
        pt("Key Name: " + length.getKeyName());         //Returns "Feet"
        pt("Key Value: " + length.getKeyValue());       //Returns 1
        pt("Set From Name: " + length.getFromName());   //Returns "Meters"
        pt("Set From Value: " + length.getFromValue()); //Returns 5
        
        /*
        Print Results
        */
        p("\n-=-=-=-=-=-=-=-=-\nResults");
        pt("from12d5_FeetToMeters: " + from12d5_FeetToMeters);  //Returns 3.81 as  12.5 feet to meters = 3.81 meters
        pt("from12d5_FeetToInches: " + from12d5_FeetToInches);  //Returns 150 as 12.5 feet to inches = 150 inches
        pt("from5_MetersToFeet: " + from5_MetersToFeet);        //Returns 16.404 as 5 meters to feet = ~16.404 feet
        pt("from5_MetersToInches: " + from5_MetersToInches);    //Returns 196.85 as 5 meters to inches = ~196.85 inches
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
