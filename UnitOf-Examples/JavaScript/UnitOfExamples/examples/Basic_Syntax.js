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
 * "Basic_Syntax" demonstrates many of the easy ways to use UnitOf for converting conventional measurements.
 * This "Basic_Syntax" class DOES NOT contain examples of UnitOf.DataType() and UnitOf.Anything().
 * These have their own examples that can also be found in this example project.
 */
var basicSyntax = function(){
    var results = '';

    var oneLiner_1_Step = function () {
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 1 step conversion | One Liner, 12.5 feet to meters");

        var feetToMeters = UnitOf.Length.fromFeet(12.5).toMeters;   //12.5 feet to meters = 3.81 meters

        pt(feetToMeters);   //prints 3.81 as 12.5 feet to meters = 3.81 meters
    };

    var setThenConvert_2_Steps = function () {
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 2 step conversion | set then convert to any unit of the measurement, 5 meters to feet and inches");

        var meters = UnitOf.Length.fromMeters(5);   //Instantiate UnitOf.Length meters and set "meters" variable as 5 meters
        var feet = meters.toFeet;       //5 meters to feet = ~16.404 feet
        var inches = meters.toInches;   //5 meters to inches = ~196.85 inches

        pt(feet);   //prints 16.404 as 5 meters to feet = ~16.404 feet
        pt(inches); //prints 196.85 as 5 meters to inches = ~196.85 inches
    };

    var instantiateSetThenConvert_3_Steps = function () {
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 3 step conversion | instantiate, set, then convert, 3 inches to feet and meters");

        var length = UnitOf.Length;     //Instantiate UnitOf.Length length
        length = length.fromInches(3);  //Set length variable as 3 inches
        var feet = length.toFeet;       //3 inches to feet = 0.25 feet
        var meters = length.toMeters;   //3 inches to meters = 0.0762 meters

        pt(feet);   //prints 0.25 as 3 inches to feet = 0.25 feet
        pt(meters); //prints 0.0762 as 3 inches to meters = 0.0762 meters
    };

    var getFromTypeAndValue = function () {
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: Get the passed in \"from\" type constant and value | 5 meters is passed in");

        var length = UnitOf.Length.fromMeters(5);       //Instantiate UnitOf.Length length and set "length" variable as 5 meters
        var fromType = length.getTypeConstantPassed;    //"M" is returned as meters is the set "from" unit, "M" represents the contant of meters.
        var fromVal = length.getValuePassed;            //5 is returned as 5 meters is the set "from" unit and value.

        pt(fromType);   //prints "M" as meters is the current set from type
        pt(fromVal);    //prints 5 as the current set from value to meters was passed in as 5. Object is returned because other measurements like NumericBase and DataType can pass in values other than numbers.
        pt(UnitOf.DataType(fromVal).toInt(-1)); //prints 5 - shameless plug for UnitOf.DataType(), convert the fromVal of type Object to a float. If converting to float fails, defailt to -1.
    };

    var setThenConvertTwice = function () {
        p("\n-=-=-=-=-=-=-=-=-\nBasic Syntax: 2 step conversion reassigning \"from\" | set then convert, 5 meters to feet and inches then update from value to be 12.5 inches. Then convert to meters and inches");

        var len = UnitOf.Length.fromMeters(5);  //Instantiate UnitOf.Length len and set "len" variable as 5 meters
        var feet1 = len.toFeet;     //5 meters to feet = ~16.404 feet
        var inches1 = len.toInches; //5 meters to inches = ~196.85 inches


        len = UnitOf.Length.fromFeet(12.5); //Set len variable as 12.5 feet
        var meters2 = len.toMeters;         //12.5 feet to meters = 3.81 meters
        var inches2 = len.toInches;         //12.5 feet to inches = 150 inches

        pt(feet1);      //prints 16.404 as 5 meters to feet = ~16.404 feet
        pt(inches1);    //prints 196.85 as 5 meters to inches = ~196.85 inches
        pt(meters2);    //prints 3.81 as 12.5 feet to meters = 3.81 meters
        pt(inches2);    //prints 150 as 12.5 feet to inches = 150 inches
    };

    //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    //Print object passed, starting with a tab
    function pt(o){
        p("\t" + o);
    }

    //Print object passed
    function p(o){
        results += o + '<br />';
    }

    oneLiner_1_Step();
    setThenConvert_2_Steps();
    instantiateSetThenConvert_3_Steps();
    getFromTypeAndValue();
    setThenConvertTwice();

    return results;
};
