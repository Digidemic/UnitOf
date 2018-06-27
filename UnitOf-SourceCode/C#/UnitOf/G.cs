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
/// DataStorage Units
/// 
/// All unit values are conversions of MB (Megabyte) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct G {
    internal static readonly double B=1.0 * 8.0 * 1024.0 * 1024.0;  //Bit
    internal static readonly double BL=1.0 * 1.0 * 2.0 * 1024.0;    //Block
    internal static readonly double BD2=1/51200.0;                  //Blu-ray Disc (Double-Layer)
    internal static readonly double BD1=1/25600.0;                  //Blu-ray Disc (Single-Layer)
    internal static readonly double BY=1.0 * 1.0 * 1024.0 * 1024.0; //Byte
    internal static readonly double CD74=1/(665096.0/1024.0);       //CD (74 Minute)
    internal static readonly double CD80=1/702.170607567;           //CD (80 Minute)
    internal static readonly double D22=1/17408.0;                  //DVD (2 Layer 2 Side)
    internal static readonly double D12=1/9625.6;                   //DVD (1 Layer 2 Side)
    internal static readonly double D21=1/8704.0;                   //DVD (2 Layer 1 Side)
    internal static readonly double D11=1/4812.8;                   //DVD (1 Layer 1 Side)
    internal static readonly double EBI=8/(Math.Pow(1024, 4));      //Exabit
    internal static readonly double EB=1/(Math.Pow(1024, 4));       //Exabyte 
    internal static readonly double F35DD=1/(711.75/1024.0);        //Floppy Disk (3.5 DD)
    internal static readonly double F35ED=1/(2847.0/1024.0);        //Floppy Disk (3.5 ED)
    internal static readonly double F35HD=1/(1423.5/1024.0);        //Floppy Disk (3.5 HD)
    internal static readonly double F525DD=1/(355.875/1024.0);      //Floppy Disk (5.25 DD)
    internal static readonly double F525HD=1/(1185.5/1024.0);       //Floppy Disk (5.25 HD)
    internal static readonly double GBI=8/(Math.Pow(1024, 1));      //Gigabit
    internal static readonly double GB=1/(Math.Pow(1024, 1));       //Gigbyte
    internal static readonly double KBI=8 * 1024;                   //Kilobit
    internal static readonly double KB=1024;                        //Kilobyte
    internal static readonly double MBI=8;                          //Megabit
    internal static readonly double MB=1;                           //Megabyte
    internal static readonly double NI=1.0 * 2.0 * 1024.0 * 1024.0; //Nibble 
    internal static readonly double PBI=8/(Math.Pow(1024, 3)) ;     //Petabit
    internal static readonly double PB=1/(Math.Pow(1024, 3)) ;      //Petabyte
    internal static readonly double SIEBI=((8 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 5); //SI Exabit
    internal static readonly double SIEB=((1 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 5);  //SI Exabyte
    internal static readonly double SIGBI=((8 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 2); //SI Gigabit
    internal static readonly double SIGB=((1 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 2);  //SI Gigbyte
    internal static readonly double SIKBI=(8 * 1024.0) * (1024 / 1000.0);                       //SI Kilobit
    internal static readonly double SIKB=(1 * 1024.0) * (1024 / 1000.0);                        //SI Kilobyte
    internal static readonly double SIMBI=((8 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 1); //SI Megabit
    internal static readonly double SIMB=((1 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 1);  //SI Megabyte
    internal static readonly double SIPBI=((8 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 4); //SI Petabit
    internal static readonly double SIPB=((1 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 4);  //SI Petabyte
    internal static readonly double SITBI=((8 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 3); //SI Terabit
    internal static readonly double SITB=((1 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 3);  //SI Terabyte
    internal static readonly double SIYBI=((8 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 7); //SI Yottabit
    internal static readonly double SIYB=((1 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 7);  //SI Yottabyte
    internal static readonly double SIZBI=((8 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 6); //SI Zettabit
    internal static readonly double SIZB=((1 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 6);  //SI Zettabyte   
    internal static readonly double TBI=8/(Math.Pow(1024, 2));      //Terabit
    internal static readonly double TB=1/(Math.Pow(1024, 2));       //Terabyte
    internal static readonly double W=1.0 * 1.0 * 512.0 * 1024.0;   //Word
    internal static readonly double YBI=8/(Math.Pow(1024, 6));      //Yottabit
    internal static readonly double YB=1/(Math.Pow(1024, 6));       //Yottabyte
    internal static readonly double ZBI=8/(Math.Pow(1024, 5));      //Zettabit
    internal static readonly double ZB=1/(Math.Pow(1024, 5));       //Zettabyte
}