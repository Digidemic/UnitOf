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
/// Pressure Units
/// 
/// All unit values are conversions of PA (Pascal) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct T {
    internal static readonly double APA=1e18;               //Attopascal
    internal static readonly double BAR=1e-5;               //Bar
    internal static readonly double BA=1e1;                 //Barye 
    internal static readonly double CMHG=1/1333.22;         //Centimeter Mercury (0C)
    internal static readonly double CMW4=1/98.0638;         //Centimeter Water (4C)
    internal static readonly double CPA=1e2;                //Centipascal
    internal static readonly double DBAR=1e-4;              //Decibar 
    internal static readonly double DPA=1e1;                //Decipascal
    internal static readonly double DAPA=1e-1;              //Dekapascal
    internal static readonly double DYNCM=1e1;              //Dyne per Square Centimeter
    internal static readonly double EPA=1e-18;              //Exapascal
    internal static readonly double FSW=1/3064.30593138;    //Foot Sea Water (15С)
    internal static readonly double FTW4=1/2988.98;         //Foot Water (4C)
    internal static readonly double FTW60=1/2986.116;       //Foot Water (60F)
    internal static readonly double FPA=1e15;               //Femtopascal
    internal static readonly double GPA=1e-9;               //Gigapascal
    internal static readonly double GFCM=1/98.0665;         //Gram Force per Square Centimeter
    internal static readonly double HPA=1e-2;               //Hectopascal
    internal static readonly double INHG32=1/3386.38;       //Inch Mercury (32F)
    internal static readonly double INHG60=1/3376.85;       //Inch Mercury (60F)
    internal static readonly double INW4=1/249.082;         //Inch Water (4C)
    internal static readonly double INW60=1/248.843;        //Inch Water (60F)
    internal static readonly double KSI=1/6894757.293178;   //KSI
    internal static readonly double KGFCM=1/98066.5;        //Kilogram Force per Square Centimeter
    internal static readonly double KGFM=1/9.80665;         //Kilogram Force per Square Meter   
    internal static readonly double KFGMM=1/9806650.0;      //Kilogram Force per Square Millimeter
    internal static readonly double KNM=1e-3;               //Kilonewton per Square Meter
    internal static readonly double KPA=1e-3;               //Kilopascal
    internal static readonly double KIPFIN=1/6894757.293178;//Kip Force per Square Inch
    internal static readonly double TFFTL=1/107251.780116;  //Ton Force per Square Foot (Long)
    internal static readonly double TFINL=1/15444256.3367;  //Ton Force per Square Inch (Long)
    internal static readonly double MPA=1e-6;               //Megapascal
    internal static readonly double MSW=1e-4;               //Meter Sea Water
    internal static readonly double MW4=1/9806.38;          //Meter Water (4C)
    internal static readonly double MUBAR=1e1;              //Microbar 
    internal static readonly double MUPA=1e6;               //Micropascal
    internal static readonly double MILBAR=1e-2;            //Millibar 
    internal static readonly double MMHG=1/133.322;         //Millimeter Mercury (0C)
    internal static readonly double MMW4=1/9.80638;         //Millimeter Water (4C)
    internal static readonly double MILPA=1e3;              //Millipascal
    internal static readonly double NPA=1e9;                //Nanopascal
    internal static readonly double NCM=1e-4;               //Newton per Square Centimeter
    internal static readonly double NM=1;                   //Newton per Square Meter
    internal static readonly double NMM=1e-6;               //Newton per Square Millimeter
    internal static readonly double PSI=1/6894.757293178;   //PSI
    internal static readonly double PA=1;                   //Pascal
    internal static readonly double PEPA=1e-15;             //Petapascal
    internal static readonly double PPA=1e12;               //Picopascal
    internal static readonly double PIZ=1e-3;               //Pieze 
    internal static readonly double PDLFT=1/1.48816394357;  //Poundal per Square Foot
    internal static readonly double LBFFT=1/47.8802589804;  //Pound Force per Square Foot
    internal static readonly double LBFIN=1/6894.757293178; //Pound Force per Square Inch
    internal static readonly double TFFTS=1/95760.51796068; //Ton Force per Square Foot (Short)
    internal static readonly double TFINS=1/13789514.58634; //Ton Force per Square Inch (Short)
    internal static readonly double ATM=1/101325.0;         //Standard Atmosphere
    internal static readonly double SM=1e-3;                //Sthene per Square Meter
    internal static readonly double AT=1/98066.5;           //Atmosphere Technical
    internal static readonly double TPA=1e-12;              //Terapascal
    internal static readonly double TORR=1/133.3223684211;  //Torr
}