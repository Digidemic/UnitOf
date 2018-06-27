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
/// Torque Units
/// 
/// All unit values are conversions of KGFM (Kilogram Force Meter) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct Y {
    internal static readonly double DYNCM=9.80665e7;        //Dyne Centimeter
    internal static readonly double DYNM=9.80665e5;         //Dyne Meter
    internal static readonly double DYNMM=9.80665e8;        //Dyne Millimeter
    internal static readonly double GFCM=1e5;               //Gram Force Centimeter
    internal static readonly double GFM=1e3;                //Gram Force Meter
    internal static readonly double GFMM=1e6;               //Gram Force Millimeter
    internal static readonly double KGFCM=1e2;              //Kilogram Force Centimeter
    internal static readonly double KGFM=1;                 //Kilogram Force Meter
    internal static readonly double KGFMM=1e3;              //Kilogram Force Millimeter
    internal static readonly double KNM=9.80665e-3;         //Kilonewton Meter
    internal static readonly double NCM=9.80665e2;          //Newton Centimeter
    internal static readonly double NM=9.80665;             //Newton Meter
    internal static readonly double NMM=9.80665e3;          //Newton Millimeter
    internal static readonly double OZFFT=115.7282185748;   //Ounce Force Foot
    internal static readonly double OZFIN=1388.738622898;   //Ounce Force Inch
    internal static readonly double LBFFT=7.23301357557;    //Pound Force Foot
    internal static readonly double LBFIN=86.79616290684;   //Pound Force Inch
}