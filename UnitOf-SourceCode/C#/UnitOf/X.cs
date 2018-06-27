/**
 * UnitOf v1.0.0.0 - https://github.com/Digidemic/UnitOf
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
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;

/// <summary>
/// Time Units
/// 
/// All unit values are conversions of S (Seconds) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct X {
    internal static readonly double AS=1e18;            //Attoseconds
    internal static readonly double C=1/31536e5;        //Centuries
    internal static readonly double D=1/864e2;          //Days
    internal static readonly double DE=1/31536e4;       //Decades
    internal static readonly double FS=1e15;            //Femtoseconds
    internal static readonly double FN=1/1209600.0;     //Fortnight
    internal static readonly double GY=1/31556952.00001;//Gregorian Years
    internal static readonly double H=1/36e2;           //Hours
    internal static readonly double JY=1/31557600.0;    //Yulian Years
    internal static readonly double LY=1/31622400.0;    //Leap Years
    internal static readonly double MUS=1e6;            //Microseconds
    internal static readonly double M=1/31536e6;        //Millenniums
    internal static readonly double MS=1e3;             //Milliseconds
    internal static readonly double MIN=1/60.0;         //Minutes
    internal static readonly double MON=1/2628000.0;    //Months
    internal static readonly double NS=1e9;             //Nanoseconds
    internal static readonly double PS=1e12;            //Picoseconds
    internal static readonly double S=1;                //Seconds
    internal static readonly double WK=1/604800.0;      //Weeks
    internal static readonly double Y=1/31536e3;        //Years
}