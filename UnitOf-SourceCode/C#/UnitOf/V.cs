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
/// Speed Units
/// 
/// All unit values are conversions of each unit at the value of 1 converted into MS (Meters per Second).
/// </summary>
[Serializable]
public struct V {
    internal static readonly double CMH=1/36e4;             //Centimeter per Hour
    internal static readonly double CMM=1/6e3;              //Centimeter per Minute
    internal static readonly double CMS=1/1e2;              //Centimeter per Second 
    internal static readonly double EV=29765;               //Earths Velocity
    internal static readonly double FTH=1/11811.02362205;   //Feet per Hour
    internal static readonly double FTM=0.00508;            //Feet per Minute
    internal static readonly double FTS=0.3048;             //Feet per Second
    internal static readonly double CV1=7900;               //Cosmic Velocity First
    internal static readonly double INH=7.0555555555e-6;    //Inch per Hour
    internal static readonly double INM=4.2333333333e-4;    //Inch per Minute
    internal static readonly double INS=0.0254;             //Inch per Second
    internal static readonly double KMH=1/3.6;              //Kilometer per Hour
    internal static readonly double KMM=1/6e-2;             //Kilometer per Minute
    internal static readonly double KMS=1e3;                //Kilometer per Second
    internal static readonly double KN=1/1.943844492441;    //Knot
    internal static readonly double C=299792458;            //Light
    internal static readonly double MA=295.0464000003;      //Mach SI Standard
    internal static readonly double MH=1/36e2;              //Meters per Hour
    internal static readonly double MM=1/60.0;              //Meters per Minute
    internal static readonly double MS=1;                   //Meters per Second
    internal static readonly double MIH=0.44704;            //Miles per Hour
    internal static readonly double MIM=26.8224;            //Miles per Minute
    internal static readonly double MIS=1609.344;           //Miles per Second
    internal static readonly double MMH=1/36e5;             //Millimeter per Hour
    internal static readonly double MMM=1/6e4;              //Millimeter per Minute
    internal static readonly double MMS=1/1e3;              //Millimeter per Second   
    internal static readonly double CV2=11200;              //Cosmic Velocity Second
    internal static readonly double SA=344;                 //Speed of Sound in Air
    internal static readonly double SW=1482.7;              //Speed of Sound in Water
    internal static readonly double CV3=16670;              //Cosmic Velocity Third
    internal static readonly double YH=0.000254;            //Yard per Hour
    internal static readonly double YM=0.01524;             //Yard per Minute
    internal static readonly double YS=0.9144;              //Yard per Second
}