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
/// Energy/Work Units
/// 
/// All unit values are conversions of J (Joule) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct K {
    internal static readonly double AJ=1e18;                    //Attojoule 
    internal static readonly double BTU=1/1055.05585262;        //British Thermal Unit 
    internal static readonly double BTUTH=1/1054.349999974;     //Thermochemical British Thermal Unit  
    internal static readonly double BOE=1/61178632e2;           //Barrel of Oil Equivalent
    internal static readonly double CALIT=1/4.1868;             //Calorie (International Steam)
    internal static readonly double CALN=1/4186.8;              //Calorie (Nutritional)
    internal static readonly double CALTH=1/4.184;              //Calorie (Thermochemical)
    internal static readonly double DYNCM=1/1e-7;               //Dyne Centimeter 
    internal static readonly double EV=1/1.60217733e-19;        //Electron Volt
    internal static readonly double ERG=1e7;                    //Erg 
    internal static readonly double FTLBF=0.737562149;          //Foot Pound
    internal static readonly double GJ=1e-9;                    //Gigajoule 
    internal static readonly double GT=1/4.184e18;              //Gigaton of TNT
    internal static readonly double GWH=1/36e11;                //Gigawatt Hour
    internal static readonly double GFCM=10197.16213009;        //Gram Force Centimeter
    internal static readonly double GFM=101.9716213009;         //Gram Force Meter
    internal static readonly double H=1/4.3597482e-18;          //Hartree Energy
    internal static readonly double HPH=1/2684519.537696172792; //Horsepower Hour
    internal static readonly double HPHM=1/2647795.5;           //Horsepower Hour (Metric)
    internal static readonly double INOZF=141.611932666;        //Inch Ounce
    internal static readonly double INLBF=8.850745792;          //Inch Pound
    internal static readonly double J=1;                        //Joule 
    internal static readonly double KCALIT=1/4186.8;            //Kilocalorie (International Steam)
    internal static readonly double KCALTH=1/4184.0;            //Kilocalorie (Thermochemical)
    internal static readonly double KEV=1/1.60217733e-16;       //Kiloelectron Volt
    internal static readonly double KGFCM=10.19716213009;       //Kilogram Force Centimeter
    internal static readonly double KGFM=0.1019716213009;       //Kilogram Force Meter
    internal static readonly double KGT=1/4184e3;               //Kilogram of TNT 
    internal static readonly double KJ=1e-3;                    //Kilojoule 
    internal static readonly double KPM=0.1019716213009;        //Kilopond Meter
    internal static readonly double KT=1/4.184e12;              //Kiloton of TNT
    internal static readonly double KWH=1/36e5;                 //Kilowatt Hour
    internal static readonly double KWS=1e-3;                   //Kilowatt Second
    internal static readonly double LA=1/101.325;               //Liter Atmosphere
    internal static readonly double MBTU=1/1055055852.62;       //Mega British Thermal Unit
    internal static readonly double MEV=1/1.60217733e-13;       //Megaelectron Volt
    internal static readonly double MJ=1e-6;                    //Megajoule 
    internal static readonly double MT=1/4.184e15;              //Megaton of TNT
    internal static readonly double MWH=1/36e8;                 //Megawatt Hour
    internal static readonly double MUJ=1e6;                    //Microjoule 
    internal static readonly double MILJ=1e3;                   //Millijoule 
    internal static readonly double NJ=1e9;                     //Nanojoule 
    internal static readonly double NM=1;                       //Newton Meter
    internal static readonly double EP=1/19561e5;               //Planck Energy
    internal static readonly double PDLFT=1/0.04214011;         //Poundal Foot
    internal static readonly double RY=1/2.179872e-18;          //Rydberg
    internal static readonly double THMEC=1/105505600.0;        //Therm (EC)
    internal static readonly double THMUS=1/105480400.0;        //Therm (US)
    internal static readonly double TT=1/4184e6;                //Ton of TNT
    internal static readonly double WH=1/36e2;                  //Watt Hour
    internal static readonly double WS=1;                       //Watt Second   
}