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
/// Angle Units
/// 
/// All unit values are conversions of D (Degree) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct E {
    internal static readonly double C=1/360.0;          //Circle
    internal static readonly double D=1;                //Degree
    internal static readonly double G=1/0.9;            //Gradian
    internal static readonly double MIL=(1/0.05625);    //Angular Mil
    internal static readonly double M=60;               //Minute 
    internal static readonly double Q=1/90.0;           //Quadrant
    internal static readonly double RAD=Math.PI/180.0;  //Radian
    internal static readonly double R=1/360.0;          //Revolution
    internal static readonly double RA=1/90.0;          //Right Angle
    internal static readonly double S=3600;             //Second 
    internal static readonly double SE=1/60.0;          //Sextant
    internal static readonly double SI=(1/30.0);        //Sign
    internal static readonly double T=1/360.0;          //Turn
}