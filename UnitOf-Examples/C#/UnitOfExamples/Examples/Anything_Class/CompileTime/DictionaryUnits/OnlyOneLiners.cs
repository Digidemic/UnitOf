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
     * This example allows the custom class to perform immediate one off conversions. 
     * Passing in the "from" unit name, "from" unit value, and "to" unit name will perform and return a conversion.
     * 
     * Everything static, no constructor used here, and the only public method (convert()) is the one that performs the conversion.
     * public "Unit" variables are used to be passed into this public method (convert()) as the units available for conversions.
     * 
     * The units are also passed into UnitOf.Anything as a Dictionary<Object,Double>
     * Rather than the other option of double[]. (Examples of double[] in their respected directory)
     */
    public class OnlyOneLiners {

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
        Allows for a one line conversion where the "from" value, "from" unit, and converting "to" unit is all passed in with the conversion returned.
        */
        public static double convert(double input, OnlyOneLiners.Units from, OnlyOneLiners.Units to){
            return CUSTOM_LENGTH.ConvertNow(input, from.ToString(), to.ToString());
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
            p("\n-=-=-=-=-=-=-=-=-\nAnything_Class > CompileTime > DictionaryUnits > OnlyOneLiners");
            p("-=-=-=-=-\nEx 1 of 2: 5 meters is equal to:");
            pt(OnlyOneLiners.convert(5, OnlyOneLiners.Units.METERS, OnlyOneLiners.Units.FEET));     //Returns 16.404 as 5 meters to feet = ~16.404 feet
            pt(OnlyOneLiners.convert(5, OnlyOneLiners.Units.METERS, OnlyOneLiners.Units.INCHES));   //Returns 196.85 as 5 meters to inches = ~196.85 inches
        
            p("-=-=-=-=-\nEx 2 of 2: 12.5 meters is equal to:");
            pt(OnlyOneLiners.convert(12.5, OnlyOneLiners.Units.FEET, OnlyOneLiners.Units.METERS));  //Returns 3.81 as 12.5 feet to meters = 3.81 meters
            pt(OnlyOneLiners.convert(12.5, OnlyOneLiners.Units.FEET, OnlyOneLiners.Units.INCHES));  //Returns 150 as 12.5 feet to inches = 150 inches
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
