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

package com.digidemic.unitof.examples.Anything_Class.CompileTime.ArrayUnits;

import com.digidemic.unitof.UnitOf;

/**
 * This example allows the custom class to perform immediate one off conversions. 
 * Passing in the "from" unit name, "from" unit value, and "to" unit name will perform and return a conversion.
 * 
 * Everything static, no constructor used here, and the only public method (convert()) is the one that performs the conversion.
 * public "Unit" variables are used to be passed into this public method (convert()) as the units available for conversions.
 * 
 * The units are also passed into UnitOf.Anything as a double[] 
 * rather than the other option of HashMap<Object,Double>. (Examples of HashMaps in their respected directory)
 */
public class OnlyOneLiners {
    
    /*
    Our custom units for our custom measurement.
    */
    public static final Unit FEET = new Unit(1);        //Unit "Feet" is the key for all conversions here. All added units are their conversion into 1 foot.
    public static final Unit METERS = new Unit(0.3048); //Unit name/value: 0.3048 Meters in 1 foot. 
    public static final Unit INCHES = new Unit(12);     //Unit name/value: 12 inches in 1 foot.
    
    /*
    Create our custom UnitOf measurement and add its collection of units by only using the Unit's unique value.
    First Parameter: Feet.Val - added as our key.
    Second Parameter: Array of doubles - all available units added to the .Anything() custom measurement
    */
    private final static UnitOf.Anything CUSTOM_LENGTH = new UnitOf.Anything(FEET.VAL, new double[]{
        FEET.VAL,
        METERS.VAL,
        INCHES.VAL
    });
    
    /*
    Allows for a one line conversion where the "from" value, "from" unit, and converting "to" unit is all passed in with the conversion returned.
    */
    public static double convert(double input, OnlyOneLiners.Unit from, OnlyOneLiners.Unit to){
        return CUSTOM_LENGTH.convertNow(input, from.VAL, to.VAL);   //Use UnitOf.Anything's convertNow() method to perform the one line conversion.
    } 
    
    /*
    Inner classed used to declare the custom units for this .Anything() custom measurement.
    */
    private static class Unit{
        private final double VAL;
        Unit(final double VAL){
            this.VAL = VAL;
        }
    }
    
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    //Method only exists to allow outside class to run this example class.
    public static void runTestExample(){
        TestExampleClass_For_OnlyOneLiners.run();
    }
}

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/**
 * Standard use of creating and using a new instance of our UnitOf.Anything static class.
 * How you may want to consume this class from your code had you written it to your specifications.
 */
class TestExampleClass_For_OnlyOneLiners{
    public static void run(){
        p("\n-=-=-=-=-=-=-=-=-\nAnything_Class > CompileTime > ArrayUnits > OnlyOneLiners");
        p("-=-=-=-=-\nEx 1 of 2: 5 meters is equal to:");
        pt(OnlyOneLiners.convert(5, OnlyOneLiners.METERS, OnlyOneLiners.FEET));     //Returns 16.404 as 5 meters to feet = ~16.404 feet
        pt(OnlyOneLiners.convert(5, OnlyOneLiners.METERS, OnlyOneLiners.INCHES));   //Returns 196.85 as 5 meters to inches = ~196.85 inches
        
        p("-=-=-=-=-\nEx 2 of 2: 12.5 meters is equal to:");
        pt(OnlyOneLiners.convert(12.5, OnlyOneLiners.FEET, OnlyOneLiners.METERS));  //Returns 3.81 as 12.5 feet to meters = 3.81 meters
        pt(OnlyOneLiners.convert(12.5, OnlyOneLiners.FEET, OnlyOneLiners.INCHES));  //Returns 150 as 12.5 feet to inches = 150 inches
    }
    
    //Print object passed, starting with a tab
    private static void pt(Object o){
        p("\t" + o);
    }
    
    //Print object passed
    private static void p(Object o){
        System.out.println(String.valueOf(o));
    }
}
