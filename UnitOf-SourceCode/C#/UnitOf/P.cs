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
/// Mass Units
/// 
/// All unit values are conversions of G (Gram) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct P {
    internal static readonly double AG=1e18;                //Attogram 
    internal static readonly double CT=5;                   //Carat
    internal static readonly double CG=1e2;                 //Centigram
    internal static readonly double CWT=1e-5;               //Centner
    internal static readonly double DG=1e1;                 //Decigram
    internal static readonly double DAG=1e-1;               //Dekagram
    internal static readonly double EG=1e-18;               //Exagram
    internal static readonly double FG=1e15;                //Femtogram
    internal static readonly double GAMM=1e6;               //Gamma
    internal static readonly double GG=1e-9;                //Gigagram
    internal static readonly double G=1;                    //Gram
    internal static readonly double HG=1e-2;                //Hectogram
    internal static readonly double KG=1e-3;                //Kilogram
    internal static readonly double KIP=1/453592.37;        //Kilopound
    internal static readonly double TK=1e-9;                //Kilotons (Metric)
    internal static readonly double MG=1e-6;                //Megagram
    internal static readonly double MUG=1e6;                //Microgram
    internal static readonly double MILG=1e3;               //Milligram
    internal static readonly double NG=1e9;                 //Nanogram
    internal static readonly double MOZ=4e-2;               //Ounce (Metric)
    internal static readonly double USOZ=1/28.349523125;    //Ounce (US)
    internal static readonly double PEG=1e-15;              //Petagram
    internal static readonly double PG=1e12;                //Picogram
    internal static readonly double LB=1/453.592;           //Pound 
    internal static readonly double QU=1e-5;                //Quintal (Metric) 
    internal static readonly double SLUG=1/14593.9029372;   //Slug
    internal static readonly double STUK=1/6350.29318;      //Stone (UK)
    internal static readonly double STUS=1/5669.904625;     //Stone (US)
    internal static readonly double TG=1e-12;               //Teragram
    internal static readonly double TI=1/1016000.0;         //Ton (Imperial)
    internal static readonly double TM=1e-6;                //Tons (Metric)
    internal static readonly double TUS=1/907185.0;         //Ton (US)
}