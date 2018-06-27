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
 * This example allows the custom class to perform immediate one off conversions.
 * Passing in the "from" unit name, "from" unit value, and "to" unit name will perform and return a conversion.
 *
 * No constructor used here, function convert() is the one that performs the conversion.
 * Variables units are used to be passed into this function (convert()) as the units available for conversions.
 *
 * The units are also passed into UnitOf.Anything as a float[]
 * rather than the other option of Object. (Examples of Objects in their respected directory)
 */
var arr_OneLiner = {};
(function(){

    /*
     Our custom units for our custom measurement.
     */
    arr_OneLiner.FEET = 1;          //Unit "Feet" is the key for all conversions here. All added units are their conversion into 1 foot.
    arr_OneLiner.METERS = 0.3048;   //Unit name/value: 0.3048 Meters in 1 foot.
    arr_OneLiner.INCHES = 12;       //Unit name/value: 12 inches in 1 foot.

    /*
     Create our custom UnitOf measurement and add its collection of units by only using the Unit's unique value.
     First Parameter: Feet.Val - added as our key.
     Second Parameter: Key value - foot set at 1
     Third Parameter: Array of floats - all available units added to the .Anything() custom measurement
     */
    var CUSTOM_LENGTH = UnitOf.Anything(arr_OneLiner.FEET, 1,true, [
        arr_OneLiner.FEET,
        arr_OneLiner.METERS,
        arr_OneLiner.INCHES
    ]);

    /*
     Allows for a one line conversion where the "from" value, "from" unit, and converting "to" unit is all passed in with the conversion returned.
     */
    arr_OneLiner.convert = function(input, from, to){
        return CUSTOM_LENGTH.convertNow(input, from, to);   //Use UnitOf.Anything's convertNow() method to perform the one line conversion.
    };
})();

//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
/**
 * Standard use of creating and using a new instance of our UnitOf.Anything static class
 * How you may want to consume this class from your code had you written it to your specifications
 */
var anythingArrayOneLiner = function(){
    var results = '';

    p("\n-=-=-=-=-=-=-=-=-\nAnything_Class > CompileTime > ArrayUnits > OnlyOneLiners");
    p("-=-=-=-=-\nEx 1 of 2: 5 meters is equal to:");
    pt(arr_OneLiner.convert(5, arr_OneLiner.METERS, arr_OneLiner.FEET));    //Returns 16.404 as 5 meters to feet = ~16.404 feet
    pt(arr_OneLiner.convert(5, arr_OneLiner.METERS, arr_OneLiner.INCHES));  //Returns 196.85 as 5 meters to inches = ~196.85 inches

    p("-=-=-=-=-\nEx 2 of 2: 12.5 meters is equal to:");
    pt(arr_OneLiner.convert(12.5, arr_OneLiner.FEET, arr_OneLiner.METERS)); //Returns 3.81 as 12.5 feet to meters = 3.81 meters
    pt(arr_OneLiner.convert(12.5, arr_OneLiner.FEET, arr_OneLiner.INCHES)); //Returns 150 as 12.5 feet to inches = 150 inches

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