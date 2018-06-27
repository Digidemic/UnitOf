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
/// Volume Units
/// 
/// All unit values are conversions of M (Cubic Meter) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct Z{
    internal static readonly double ACFTUS=0.0008107083295205;  //Acre Foot (US)
    internal static readonly double ACIN=0.009728558325479;     //Acre Inch
    internal static readonly double ACFTO=0.0008107131937899;   //Acre Foot
    internal static readonly double AL=1e21;                    //Attoliter
    internal static readonly double BBLO=6.289810770432;        //Barrel (Oil)
    internal static readonly double BBLUK=6.110256897197;       //Barrel (UK) 
    internal static readonly double BBLUS=8.386414360576;       //Barrel (US)
    internal static readonly double FBM=423.7760006579;         //Board Foot
    internal static readonly double CL=1e5;                     //Centiliter 
    internal static readonly double CORD=0.2758958337616;       //Cord 
    internal static readonly double CM=1e6;                     //Cubic Centimeter
    internal static readonly double DM=1e3;                     //Cubic Decimeter
    internal static readonly double FT=35.31466672148;          //Cubic Foot
    internal static readonly double IN=61023.74409473;          //Cubic Inch
    internal static readonly double KM=1e-9;                    //Cubic Kilometer
    internal static readonly double M=1;                        //Cubic Meter
    internal static readonly double MI=2.399127585789e-10;      //Cubic Mile
    internal static readonly double MM=1e9;                     //Cubic Millimeter
    internal static readonly double YD=1.307950619314;          //Cubic Yard
    internal static readonly double CUPM=4e3;                   //Cup (Metric)
    internal static readonly double CUPUK=3519.507972785;       //Cup (UK)
    internal static readonly double CUPUS=4226.75283773;        //Cup (US)
    internal static readonly double DL=1e4;                     //Deciliter 
    internal static readonly double DECI=1e1;                   //Decistere 
    internal static readonly double DAL=1e2;                    //Dekaliter 
    internal static readonly double DEKA=0.1;                   //Dekastere
    internal static readonly double DSTSPNUK=84468.19134685;    //Dessertspoon (UK)
    internal static readonly double DSTSPNUS=101442.0681055;    //Dessertspoon (US)
    internal static readonly double DROP=2e7;                   //Drop
    internal static readonly double EL=1e-15;                   //Exaliter 
    internal static readonly double FL=1e18;                    //Femtoliter
    internal static readonly double FLOZUK=35195.07972785;      //Fluid Ounce (UK)
    internal static readonly double FLOZUS=33814.02270184;      //Fluid Ounce (US)
    internal static readonly double GALUK=219.9692482991;       //Gallon (UK)
    internal static readonly double GALUS=264.1720523581;       //Gallon (US)
    internal static readonly double GL=1e-6;                    //Gigaliter 
    internal static readonly double GILUK=7039.015945571;       //Fill (UK)
    internal static readonly double GILUS=8453.505675461;       //Gill (US)
    internal static readonly double HL=1e1;                     //Hectoliter 
    internal static readonly double HOG=4.193207180288;         //Hogshead
    internal static readonly double CCF=0.3531466672149;        //100 Cubic Feet
    internal static readonly double KL=1;                       //Kiloliter 
    internal static readonly double L=1e3;                      //Liter
    internal static readonly double ML=1e-3;                    //Megaliter 
    internal static readonly double MUL=1e9;                    //Microliter 
    internal static readonly double MILL=1e6;                   //Milliliter 
    internal static readonly double MINIUK=16893638.26937;      //Minim (UK)    
    internal static readonly double MINIUS=16230730.89688;      //Minim (US)
    internal static readonly double NL=1e12;                    //Nanoliter 
    internal static readonly double PEL=1e-12;                  //Petaliter 
    internal static readonly double PL=1e15;                    //Picoliter 
    internal static readonly double PTUK=1759.753986393;        //Pint (UK)
    internal static readonly double PTUS=2113.376418865;        //Pint (US) 
    internal static readonly double QTUK=879.8769931964;        //Quart (UK)
    internal static readonly double QTUS=1056.688209433;        //Quart (US)
    internal static readonly double REGTON=0.3531466672149;     //Register Ton
    internal static readonly double ST=1;                       //Stere 
    internal static readonly double TBSPM=66666.66666667;       //Tablespoon (Metric)
    internal static readonly double TBSPUK=56312.12756457;      //Tablespoon (UK)
    internal static readonly double TBSPUS=67628.04540369;      //Tablespoon (US)
    internal static readonly double TSPM=2e5;                   //Teaspoon (Metric)
    internal static readonly double TSPUK=168936.3826937;       //Teaspoon (UK)
    internal static readonly double TSPUS=202884.1362111;       //Teaspoon (US)
    internal static readonly double TL=1e-9;                    //Teraliter 
    internal static readonly double TUN=1.048301795072;         //Tun
}