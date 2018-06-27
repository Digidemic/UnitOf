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
/// Area Units
/// 
/// All unit values are conversions of M (Square Meter) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct F {   
    internal static readonly double AC=1/4046.8564224;  //Acre
    internal static readonly double A=1e-2;             //Are
    internal static readonly double AR=1/3418.740000066;//Arpent
    internal static readonly double B=1e28;             //Barn
    internal static readonly double CRIN=1973.52524139; //Circular Inch
    internal static readonly double CRMIL=1973525241.39;//Circular Mil
    internal static readonly double HA=1e-4;            //Hactare
    internal static readonly double HS=1/647497.027584; //Homestead 
    internal static readonly double R=1/1011.7141056;   //Rood
    internal static readonly double S=1/0.09290304;     //Sabin
    internal static readonly double C=1e4;              //Square Centimeter
    internal static readonly double CH=1/404.68564224;  //Square Chain
    internal static readonly double D=1e2;              //Square Decimeter
    internal static readonly double DA=1e-2;            //Square Dekameter
    internal static readonly double FT=1/0.09290304;    //Square Foot
    internal static readonly double H=1e-4;             //Square Hectometer
    internal static readonly double IN=1/0.00064516;    //Square Inch
    internal static readonly double K=1e-6;             //Square Kilometer
    internal static readonly double M=1;                //Square Meter
    internal static readonly double MU=1e12;            //Square Micrometer  
    internal static readonly double MI=1/2589988.110336;//Square Mile
    internal static readonly double MIL=1e6;            //Square millimeter  
    internal static readonly double N=1e18;             //Square Nanometer
    internal static readonly double PE=1/25.29285264;   //Square Perch
    internal static readonly double PO=1/25.29285264;   //Square Pole
    internal static readonly double ROD=1/25.29285264;  //Square Rod
    internal static readonly double YD=1/0.83612736;    //Square Yard
}