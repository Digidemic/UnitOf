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
/// Length Units
/// 
/// All unit values are conversions of M (Meter) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct O {
    internal static readonly double A=1e10;                     //Angstrom
    internal static readonly double AM=1e18;                    //Attometer 
    internal static readonly double BC=1/(0.2286/27.0);         //Barleycorn 
    internal static readonly double CBLIMP=1/185.3184;          //Cable Length (Imperial)
    internal static readonly double CBLIN=1/185.2;              //Cable Length (International)
    internal static readonly double CBLUS=1/219.456;            //Cable Length (US)
    internal static readonly double CL=1/0.000254;              //Caliber 
    internal static readonly double CIN=1/0.000254;             //Centiinch 
    internal static readonly double CM=1e2;                     //Centimeter 
    internal static readonly double CH=1/20.1168;               //Chain 
    internal static readonly double CU=1/0.4572;                //Cubit
    internal static readonly double DM=1e1;                     //Decimeter 
    internal static readonly double DAM=1e-1;                   //Dekameter
    internal static readonly double ELL=1/1.143;                //Ell
    internal static readonly double EM=1e-18;                   //Exameter 
    internal static readonly double FTM=1/1.8288;               //Fathom 
    internal static readonly double FT=1/0.3048;                //Foot 
    internal static readonly double FM=1e15;                    //Femtometer 
    internal static readonly double FING=1/0.1143;              //Finger 
    internal static readonly double FUR=1/201.168;              //Furlong 
    internal static readonly double GM=1e-9;                    //Gigameter 
    internal static readonly double HAND=1/0.1016;              //Hand 
    internal static readonly double HM=1e-2;                    //Hectometer 
    internal static readonly double IN=1/0.0254;                //Inch 
    internal static readonly double KM=1e-3;                    //Kilometer 
    internal static readonly double KYD=1/914.4;                //Kiloyard 
    internal static readonly double LEA=1/4828.032;             //League 
    internal static readonly double LY=1/9.46073047258e15;      //Lightyear
    internal static readonly double LNK=1/0.201168;             //Link 
    internal static readonly double MM=1e-6;                    //Megameter
    internal static readonly double M=1;                        //Meter 
    internal static readonly double MUIN=1/(0.0000254/1000.0);  //Microinch 
    internal static readonly double MUM=1e6;                    //Micrometer 
    internal static readonly double MURM=1e6;                   //Micron 
    internal static readonly double MI=1/1609.344;              //Mile 
    internal static readonly double MILM=1e3;                   //Millimeter
    internal static readonly double NAIL=1/0.05715;             //Nail 
    internal static readonly double NM=1e9;                     //Nanometer 
    internal static readonly double NLEAIN=1/5556.0;            //Nautical League (International) 
    internal static readonly double NLEAUK=1/5559.552;          //Nautical League (UK)
    internal static readonly double NMIINT=1/1852.0;            //Nautical Mile (International)
    internal static readonly double NMIUK=1/1853.184;           //Nautical Mile (UK)
    internal static readonly double NMIUS=1/1853.248;           //Nautical Mile (US) 
    internal static readonly double PER=1/5.0292;               //Perch
    internal static readonly double PEM=1e-15;                  //Petameter 
    internal static readonly double PM=1e12;                    //Picometer 
    internal static readonly double POL=1/5.0292;               //Pole
    internal static readonly double RD=1/5.0292;                //Rod
    internal static readonly double ROPE=1/6.096;               //Rope 
    internal static readonly double SPAN=1/0.2286;              //Span 
    internal static readonly double TM=1e-12;                   //Terameter 
    internal static readonly double TIN=1/0.0000254;            //Thousandth of Inch
    internal static readonly double YD=1/0.9144;                //Yard
}