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
/// Force Units
/// 
/// All unit values are conversions of N (Newton) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct L {
    internal static readonly double AUF=12137804.11081;         //Atomic Unit of Force
    internal static readonly double AN=1e18;                    //Attonewton
    internal static readonly double CN=1e2;                     //Centinewton
    internal static readonly double DN=1e1;                     //DeciNewton
    internal static readonly double DAN=1e-1;                   //Dekanewton  
    internal static readonly double DYN=1e5;                    //Dyne
    internal static readonly double EN=1e-18;                   //Exanewton
    internal static readonly double FN=1e15;                    //Femtonewton
    internal static readonly double GN=1e-9;                    //Giganewton
    internal static readonly double GF=1/9.80665e-3;            //Gram Force
    internal static readonly double GFF=1/9.80665;              //Grave Force
    internal static readonly double HN=1e-2;                    //Hectonewton 
    internal static readonly double JCM=1e2;                    //Joule per Centimeter 
    internal static readonly double JM=1;                       //Joule per Meter
    internal static readonly double KGF=1/9.80665;              //Kilogram force
    internal static readonly double KN=1e-3;                    //Kilonewton
    internal static readonly double KP=1/9.80665;               //Kilopond
    internal static readonly double KIP=1/4448.221615255;       //Kilopound Force
    internal static readonly double LTF=1/9964.01641818352;     //Long Ton Force
    internal static readonly double MN=1e-6;                    //Meganewton
    internal static readonly double TFM=1/9806.65;              //Ton Force (Metric)
    internal static readonly double MUN=1e6;                    //Micronewton
    internal static readonly double MGF=1/9.80665e-3;           //Milligrave Force
    internal static readonly double MILN=1e3;                   //Millinewton
    internal static readonly double NN=1e9;                     //Nanonewton
    internal static readonly double N=1;                        //Newton
    internal static readonly double OZF=1/0.27801385095378125;  //Ounce Force
    internal static readonly double PEN=1e-15;                  //Petanewton
    internal static readonly double PN=1e12;                    //Piconewton
    internal static readonly double P=1/9.80665e-3;             //Pond
    internal static readonly double LBFT=1/0.138254954376;      //Pound Foot per Second Squared
    internal static readonly double LBF=1/4.4482216152605;      //Pound Force
    internal static readonly double PDL=1/0.138254954376;       //Poundal
    internal static readonly double TFS=1/8896.443230521;       //Ton Force (Short)
    internal static readonly double SN=1/1e3;                   //Sthene
    internal static readonly double TN=1e-12;                   //Teranewton   
}