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
 * The structure of this example demonstrates using public Unit variables, the constructor (for setting "from")
 * and a single public "to" method converts anything in the custom measurement.
 *
 * The units are also passed into UnitOf.Anything as an object rather
 * than the other option of float[] (Examples of float[] in their respected directory)
 */
var obj_PublicUnits = {};
(function() {

    /*
     Our custom units for our custom measurement.
     */
    obj_PublicUnits.FEET = "ft";
    obj_PublicUnits.METERS = "m";
    obj_PublicUnits.INCHES = "in";

    /*
     Only function. First available which is used to set the "from" value and unit.
     Once set, inner "to" function is available
     */
    obj_PublicUnits.from = function(unit, input){

        /*
         Create our custom UnitOf measurement and add its collection of units by only using the Unit's unique value.
         First Parameter: Feet.Val - added as our key.
         Second Parameter: Key value - foot set at 1
         Third Parameter: Object - all available units added to the .Anything() custom measurement
         */
        var CUSTOM_LENGTH = UnitOf.Anything(obj_PublicUnits.FEET, 1, true, {
            "ft": 1.0,      //Unit "Feet" is the key for all conversions here. All added units are their conversion into 1 foot.
            "m": 0.3048,    //Unit name/value: 0.3048 Meters in 1 foot.
            "in": 12.0      //Unit name/value: 12 inches in 1 foot.
        });
        CUSTOM_LENGTH.from(unit, input);    //sets the passed in unit and value
        return {

            /*
             Convert into the unit passed.
             Units are defined in in this class an are intended to be passed in by the caller to this "to" method
             */
            to: function(unit){
                return CUSTOM_LENGTH.to(unit);
            }
        };
    };
})();

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/**
 * Standard use of creating and using a new instance of our UnitOf.Anything static class.
 * How you may want to consume this class from your code had you written it to your specifications.
 */
var anythingObjectPublicUnits = function(){
    var results = '';

    p("\n-=-=-=-=-=-=-=-=-\nAnything_Class > CompileTime > ObjectUnits > PublicUnits");
    p("-=-=-=-=-\nEx 1 of 2: 5 meters is equal to:");
    var ex1 = obj_PublicUnits.from(obj_PublicUnits.METERS, 5);  //Sets ex1 to 5 meters
    pt(ex1.to(obj_PublicUnits.FEET) + " feet");      //Returns 16.404 as 5 meters to feet = ~16.404 feet
    pt(ex1.to(obj_PublicUnits.METERS) + " meters");  //Returns 5 as 5 meters to meters = 5 meters
    pt(ex1.to(obj_PublicUnits.INCHES) + " inches");  //Returns 196.85 as 5 meters to inches = ~196.85 inches

    p("-=-=-=-=-\nEx 2 of 2: 12.5 feet is equal to:");
    var ex2 = obj_PublicUnits.from(obj_PublicUnits.FEET, 12.5); //Sets ex2 to 12.5 feet
    pt(ex2.to(obj_PublicUnits.FEET) + " feet");      //Returns 12.5 as 12.5 feet to feet = 12.5 feet
    pt(ex2.to(obj_PublicUnits.METERS) + " meters");  //Returns 3.81 as 12.5 feet to meters = 3.81 meters
    pt(ex2.to(obj_PublicUnits.INCHES) + " inches");  //Returns 150 as 12.5 feet to inches = 150 inches

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