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

'use strict';

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
 * The units are also passed into UnitOf.Anything as a float[] rather
 * than the other option of object (Examples of objects in their respected directory)
 */
var arr_PredefinedFunctions = {};
(function() {

    /*
     Our custom units for our custom measurement.
     */
    var FEET = 1;           //Unit "Feet" is the key for all conversions here. All added units are their conversion into 1 foot.
    var METERS = 0.3048;    //Unit name/value: 0.3048 Meters in 1 foot.
    var INCHES = 12;        //Unit name/value: 12 inches in 1 foot.

    /*
     Create our custom UnitOf measurement and add its collection of units by only using the Unit's unique value.
     First Parameter: Feet.Val - added as our key.
     Second Parameter: Key value - foot set at 1
     Third Parameter: Array of floats - all available units added to the .Anything() custom measurement
     */
    var CUSTOM_LENGTH = UnitOf.Anything(FEET, 1, true, [
        FEET,
        METERS,
        INCHES
    ]);

    /*
     Public "from" methods which is our starting point for conversions.
     Takes the number passed, associates it with the type, and set the instance's "from" unit/value.
     */
    arr_PredefinedFunctions = {
        fromFeet: function (input) {
            return setUnit(FEET, input);
        },
        fromMeters: function (input) {
            return setUnit(METERS, input);
        },
        fromInches: function (input) {
            return setUnit(INCHES, input);
        }
    };

    /*
     Public "to" methods which converts our set "from" value to the method type called.
     */
    function setUnit(unit, input) {
        CUSTOM_LENGTH.from(unit, input);
        return {
            toFeet: CUSTOM_LENGTH.to(FEET),
            toMeters: CUSTOM_LENGTH.to(METERS),
            toInches: CUSTOM_LENGTH.to(INCHES)
        };
    }
})();

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/**
 * Standard use of creating and using a new instance of our UnitOf.Anything static class.
 * How you may want to consume this class from your code had you written it to your specifications.
 */
var anythingArrayPredefinedFunctions = function(){
    var results = '';

    p("\n-=-=-=-=-=-=-=-=-\nAnything_Class > CompileTime > ArrayUnits > PredefinedFunctions");
    p("-=-=-=-=-\nEx 1 of 2: 5 meters is equal to:");
    var ex1 = arr_PredefinedFunctions.fromMeters(5);    //Sets ex1 to 5 meters
    pt(ex1.toFeet + " feet");     //Returns 16.404 as 5 meters to feet = ~16.404 feet
    pt(ex1.toMeters + " meters"); //Returns 5 as 5 meters to meters = 5 meters
    pt(ex1.toInches + " inches"); //Returns 196.85 as 5 meters to inches = ~196.85 inches

    p("-=-=-=-=-\nEx 2 of 2: 12.5 feet is equal to:");
    var ex2 = arr_PredefinedFunctions.fromFeet(12.5);   //Sets ex2 to 12.5 feet
    pt(ex2.toFeet + " feet");     //Returns 12.5 as 12.5 feet to feet = 12.5 feet
    pt(ex2.toMeters + " meters"); //Returns 3.81 as 12.5 feet to meters = 3.81 meters
    pt(ex2.toInches + " inches"); //Returns 150 as 12.5 feet to inches = 150 inches


    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    //Print object passed, starting with a tab
    function pt(o){
        p("\t" + o);
    }

    //Print object passed
    function p(o){
        results += o + '<br />';
    }

    return results;
};