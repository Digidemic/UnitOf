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
/// ElectricCharge Units
/// 
/// All unit values are conversions of MC (Megacoulomb) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct J {
    internal static readonly double ABC=1e5;                //Abcoulomb
    internal static readonly double AH=1/0.0036;            //Ampere Hour
    internal static readonly double AM=1/0.00006;           //Ampere Minute
    internal static readonly double AS=1e6;                 //Ampere Second
    internal static readonly double C=1e6;                  //Coulomb
    internal static readonly double EMU=1e5;                //EMU of Charge
    internal static readonly double ESU=2.99792457999957e15;//ESU of Charge
    internal static readonly double E=1/1.60217646e-25;     //Electron Vharge
    internal static readonly double F=1e6;                  //Farad Volt
    internal static readonly double FA12=1/0.0964853103;    //Faraday (Carbon 12)
    internal static readonly double FACH=1/0.0964957007;    //Faraday (Chemistry)
    internal static readonly double FAPH=1/0.0965219008;    //Faraday (Physics)
    internal static readonly double FR=2.99792457999957e15; //Franklin
    internal static readonly double KC=1e3;                 //Kilocoulomb
    internal static readonly double MC=1;                   //Megacoulomb
    internal static readonly double MUC=1e12;               //Microcoulomb
    internal static readonly double MILC=1e9;               //Millicoulomb
    internal static readonly double NC=1e15;                //Nanocoulomb
    internal static readonly double PC=1e18;                //Picocoulomb
    internal static readonly double STC=2.99792457999957e15;//Statcoulomb
}