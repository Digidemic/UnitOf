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
/// Frequency Units
/// 
/// All unit values are conversions of MHZ (Megahertz) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct M {  
    internal static readonly double AHZ=1e24;   //Attohertz 
    internal static readonly double CHZ=1e8;    //Centihertz
    internal static readonly double CS=1e6;     //Cycle per Second
    internal static readonly double DHZ=1e7;    //Decihertz   
    internal static readonly double DAHZ=1e5;   //Dekahertz   
    internal static readonly double EHZ=1e-12;  //Exahertz
    internal static readonly double FHZ=1e21;   //Femtohertz 
    internal static readonly double GHZ=1e-3;   //Gigahertz
    internal static readonly double HHZ=1e4;    //Hectohertz  
    internal static readonly double HZ=1e6;     //Hertz
    internal static readonly double KHZ=1e3;    //Kilohertz 
    internal static readonly double MHZ=1;      //Megahertz
    internal static readonly double MUHZ=1e12;  //Microhertz
    internal static readonly double MIHZ=1e9;   //Millihertz
    internal static readonly double NHZ=1e15;   //Nanohertz
    internal static readonly double PEHZ=1e-9;  //Petahertz
    internal static readonly double PHZ=1e18;   //Picohertz 
    internal static readonly double RD=864e8;   //Revolution per Day 
    internal static readonly double RH=36e8;    //Revolution per Hour
    internal static readonly double RM=6e7;     //Revolution per Minute
    internal static readonly double RS=1e6;     //Revolution per Second
    internal static readonly double THZ=1e-6;   //Terahertz
}