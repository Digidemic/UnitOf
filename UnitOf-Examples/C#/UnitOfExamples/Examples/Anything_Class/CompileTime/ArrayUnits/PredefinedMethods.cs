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
using UnitOf;

/**
 * Example of a static, on compile time, custom UnitOf.Anything measurement 
 * using the unit values as the UnitOf.Anything unit names.
 * 
 * Using feet as our key, all other units in our custom length class here
 * are equal the number they will take to equal 1 foot.
 * 
 * These units are private and are only accessible by the predefined
 * public methods that do all the work in defining the "from" and "to" conversions.
 * 
 * The main benefit using it this way is there is nothing custom or proprietary the user needs to pass. 
 * Just reference the public methods and the class figures out the type that needs to be passed so there is no possibility for any kind of error or confusion.
 * 
 * The units are also passed into UnitOf.Anything as a double[] rather
 * than the other option of Dictionary<Object,Double>.
 */
namespace UnitOfExamples.Examples.Anything_Class.CompileTime.ArrayUnits
{
    public class PredefinedMethods {

        /*
        Our custom units for our custom measurement.
        */
        private const double FEET = 1;          //Unit "Feet" is the key for all conversions here. All added units are their conversion into 1 foot.
        private const double METERS = 0.3048;   //Unit name/value: 0.3048 Meters in 1 foot. 
        private const double INCHES = 12;       //Unit name/value: 12 inches in 1 foot.  

        /*
        Create our custom UnitOf measurement and add its collection of units by only using the Unit's unique value.
        First Parameter: Feet.Val - added as our key.
        Second Parameter: Array of doubles - all available units added to the .Anything() custom measurement
        */
        private static UnitOf.Anything CUSTOM_LENGTH = new UnitOf.Anything(FEET, new double[]{
            FEET,
            METERS,
            INCHES
        });

        /*
        public "from" methods which is our starting point for conversions. 
        Takes the number passed, associates it with the type, and set the instance's "from" unit/value.
        */
        public void fromFeet(double input){
            CUSTOM_LENGTH.From(FEET, input);
        }
        public void fromMeters(double input){
            CUSTOM_LENGTH.From(METERS, input);
        }
        public void fromInches(double input){
            CUSTOM_LENGTH.From(INCHES, input);
        }

        /*
        Public "to" methods which converts our set "from" value to the method type called.
        */
        public double toFeet(){
            return CUSTOM_LENGTH.To(FEET);
        }
        public double toMeters(){
            return CUSTOM_LENGTH.To(METERS);
        }
        public double toInches(){
            return CUSTOM_LENGTH.To(INCHES);
        }
    
        //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        //Method only exists to allow outside class to run this example class.
        public static void runTestExample(){
            TestExampleClass_For_PredefinedMethods.run();
        }
    }
    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    /**
     * Standard use of creating and using a new instance of our UnitOf.Anything static class.
     * How you may want to consume this class from your code had you written it to your specifications.
     */
    class TestExampleClass_For_PredefinedMethods{
        public static void run(){
            p("\n-=-=-=-=-=-=-=-=-\nAnything_Class > CompileTime > ArrayUnits > PredefinedMethods");
            p("-=-=-=-=-\nEx 1 of 2: 5 meters is equal to:");
            PredefinedMethods ex1 = new PredefinedMethods();
            ex1.fromMeters(5);              //Sets ex1 to 5 meters
            pt(ex1.toFeet() + " feet");     //Returns 16.404 as 5 meters to feet = ~16.404 feet
            pt(ex1.toMeters() + " meters"); //Returns 16.404 as 5 meters to meters = 5 meters
            pt(ex1.toInches() + " inches"); //Returns 196.85 as 5 meters to inches = ~196.85 inches

            p("-=-=-=-=-\nEx 2 of 2: 12.5 feet is equal to:");
            PredefinedMethods ex2 = new PredefinedMethods();
            ex2.fromFeet(12.5);             //Sets ex2 to 12.5 feet
            pt(ex2.toFeet() + " feet");     //Returns 12.5 as 12.5 feet to feet = 12.5 feet
            pt(ex2.toMeters() + " meters"); //Returns 3.81 as 12.5 feet to meters = 3.81 meters
            pt(ex2.toInches() + " inches"); //Returns 150 as 12.5 feet to inches = 150 inches
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
