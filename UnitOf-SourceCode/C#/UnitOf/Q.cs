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
/// MetricPrefix Units
/// 
/// All unit values are conversions of each unit at the value of 1 converted into NN (No Prefix).
/// </summary>
[Serializable]
public struct Q {
    internal static readonly double A=1e-18;    //Atto
    internal static readonly double C=1e-2;     //Centi
    internal static readonly double D=1e-1;     //Deci
    internal static readonly double DA=1e1;     //Deka
    internal static readonly double E=1e18;     //Exa
    internal static readonly double F=1e-15;    //Femto
    internal static readonly double G=1e9;      //Giga
    internal static readonly double H=1e2;      //Hecto
    internal static readonly double K=1e3;      //Kilo
    internal static readonly double M=1e6;      //Mega
    internal static readonly double MU=1e-6;    //Micro
    internal static readonly double MIL=1e-3;   //Milli
    internal static readonly double N=1e-9;     //Nano
    internal static readonly double NN=1e0;     //No Prefix
    internal static readonly double PE=1e15;    //Peta
    internal static readonly double P=1e-12;    //Pico
    internal static readonly double T=1e12;     //Tera
    internal static readonly double YO=1e-24;   //Yocto
    internal static readonly double Y=1e24;     //Yotta
    internal static readonly double ZO=1e-21;   //Zepto
    internal static readonly double Z=1e21;     //Zetta
}