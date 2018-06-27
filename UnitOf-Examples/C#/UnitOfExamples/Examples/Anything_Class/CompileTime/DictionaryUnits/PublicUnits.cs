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

namespace UnitOfExamples.Examples.Anything_Class.CompileTime.DictionaryUnits
{
    /**
     * The structure of this example demonstrates using public Unit variables, the constructor (for setting "from") 
     * and a single public "to" method converts anything in the custom measurement.
     * 
     * The units are also passed into UnitOf.Anything as a Dictionary<Object,Double> rather
     * than the other option of double[] (Examples of double[] in their respected directory)
     */
    public class PublicUnits {

        /*
        Our custom units for our custom measurement.
        */
        public enum Units {
            FEET,
            METERS,
            INCHES
        }

        /*
        Create our custom UnitOf measurement and add its collection of units by only using the Unit's unique value.
        First Parameter: Feet.Val - added as our key.
        Second Parameter: Dictionary<Object,Double> - all available units added to the .Anything() custom measurement
        */
        private static UnitOf.Anything CUSTOM_LENGTH = new UnitOf.Anything(Units.FEET.ToString(), new Dictionary<object, double>()
        {
            {Units.FEET.ToString(), 1.0},       //Unit "Feet" is the key for all conversions here. All added units are their conversion into 1 foot.
            {Units.METERS.ToString(), 0.3048},  //Unit name/value: 0.3048 Meters in 1 foot. 
            {Units.INCHES.ToString(), 12.0}     //Unit name/value: 12 inches in 1 foot.
        });

        /*
        Constructor which also is needed to set the "from" value and unit
        */
        public PublicUnits(PublicUnits.Units unit, double input){
            CUSTOM_LENGTH.From(unit.ToString(), input);
        }

        /*
        Convert into the unit passed.
        Units are defined in in this class an are intended to be passed in by the caller to this "to" method
        */
        public double to(PublicUnits.Units unit){
            return CUSTOM_LENGTH.To(unit.ToString());
        }
    
        //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        //Method only exists to allow outside class to run this example class.
        public static void runTestExample(){
            TestExampleClass_For_PublicUnits.run();
        }
    }

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    /**
     * Standard use of creating and using a new instance of our UnitOf.Anything static class.
     * How you may want to consume this class from your code had you written it to your specifications.
     */
    class TestExampleClass_For_PublicUnits{
        public static void run(){
            p("\n-=-=-=-=-=-=-=-=-\nAnything_Class > CompileTime > DictionaryUnits > PublicUnits");
            p("-=-=-=-=-\nEx 1 of 2: 5 meters is equal to:");
            PublicUnits ex1 = new PublicUnits(PublicUnits.Units.METERS, 5); //Sets ex1 to 5 meters
            pt(ex1.to(PublicUnits.Units.FEET) + " feet");      //Returns 16.404 as 5 meters to feet = ~16.404 feet
            pt(ex1.to(PublicUnits.Units.METERS) + " meters");  //Returns 5 as 5 meters to meters = 5 meters
            pt(ex1.to(PublicUnits.Units.INCHES) + " inches");  //Returns 196.85 as 5 meters to inches = ~196.85 inches
        
            p("-=-=-=-=-\nEx 2 of 2: 12.5 feet is equal to:");
            PublicUnits ex2 = new PublicUnits(PublicUnits.Units.FEET, 12.5);    //Sets ex2 to 12.5 feet
            pt(ex2.to(PublicUnits.Units.FEET) + " feet");      //Returns 12.5 as 12.5 feet to feet = 12.5 feet
            pt(ex2.to(PublicUnits.Units.METERS) + " meters");  //Returns 3.81 as 12.5 feet to meters = 3.81 meters
            pt(ex2.to(PublicUnits.Units.INCHES) + " inches");  //Returns 150 as 12.5 feet to inches = 150 inches
        }
    
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
