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
/// Acceleration Units
/// 
/// All unit values are conversions of each unit at the value of 1 converted into MS (Meter per Second Squared).
/// </summary>
[Serializable]
public struct D {
    internal static readonly double AS=1e-18;           //Attometer per Second Squared
    internal static readonly double CS=1e-2;            //Centimeter per Second Squared
    internal static readonly double DS=1e-1;            //Decimeter per Second Squared
    internal static readonly double DAS=1e1;            //Dekameter per Second Squared
    internal static readonly double ES=1e18;            //Exameter per Second Squared
    internal static readonly double FTHS=0.000084666666666667;//Foot per Hour per Second
    internal static readonly double FTMS=0.00508;       //Foot/Minute per Second
    internal static readonly double FTS=0.3048;         //Foot per Second Squared
    internal static readonly double FS=1e-15;           //Femtometer per Second Squared
    internal static readonly double GAL=1/1e2;          //Galileo
    internal static readonly double GS=1e9;             //Gigameter per Second Squared
    internal static readonly double G=9.80665;          //Gravity
    internal static readonly double HS=1e2;             //Hectometer per Second Squared
    internal static readonly double INMS=0.0004233333;  //Inch per Minute per Second
    internal static readonly double INS=0.0254;         //Inch per Second Squared
    internal static readonly double KHS=1/3.6;          //Kilometers per Hour per Second
    internal static readonly double KH=1/12960.0;       //Kilometers per Hour Squared
    internal static readonly double KS=1e3;             //Kilometer per Second Squared
    internal static readonly double KNS=0.514444444444; //Knot per Second
    internal static readonly double MGS=1e6;            //Megameter per Second Squared
    internal static readonly double MS=1;               //Meter per Second Squared
    internal static readonly double MUGAL=1/1e8;        //Microgalileo
    internal static readonly double MUS=1e-6;           //Micrometerper Second Squared
    internal static readonly double MIHS=0.44704;       //Mile per Hour per Second
    internal static readonly double MIMS=26.8224;       //Mile per Minute per Second
    internal static readonly double MIS=1609.344;       //Mile per Second Squared
    internal static readonly double MILGAL=1/1e5;       //Milligalileo
    internal static readonly double MILS=1e-3;          //Millimeter per Second Squared
    internal static readonly double NS=1e-9;            //Nanometer per Second Squared
    internal static readonly double PES=1e15;           //Petameter per Second Squared
    internal static readonly double PS=1e-12;           //Picometer per Second Squared
    internal static readonly double TS=1e12;            //Terameter per Second Squared
    internal static readonly double YDS=0.9144;         //Yard per Second Squared
}