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
/// DataTransferRate Units
/// 
/// All unit values are conversions of MBS (Megabyte per Second) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct H {
    internal static readonly double BIS=1.0 * 8.0 * 1024.0 * 1024.0;            //Bit per Second
    internal static readonly double BS=1.0 * 1.0 * 1024.0 * 1024.0;             //Byte per Second
    internal static readonly double E10=(1.0 * 8.0 * 1024.0 * 1024.0) / (Math.Pow(1000,2) * 10.0);      //10 Base-T Ethernet
    internal static readonly double E100=(1.0 * 8.0 * 1024.0 * 1024.0) / (Math.Pow(1000,2) * 100.0);    //100 Base-T Ethernet
    internal static readonly double E1000=(1.0 * 8.0 * 1024.0 * 1024.0) / (Math.Pow(1000,2) * 1000.0);  //1000 Base-T Ethernet
    internal static readonly double FW400=0.02 * 1.048576;                      //FireWire 400
    internal static readonly double FW800=0.01 * 1.048576;                      //FireWire 800
    internal static readonly double FW3200=0.0025 * 1.048576;                   //FireWire S1600 and S3200 
    internal static readonly double GBIS=8/(Math.Pow(1024, 1));                 //Gigabit per Second
    internal static readonly double GBS=1/(Math.Pow(1024, 1));                  //Gigabyte per Second
    internal static readonly double ISDND=65.536;                               //ISDN (Dual Channel) 
    internal static readonly double ISDNS=131.072;                              //ISDN (Single Channel) 
    internal static readonly double KBIS=8 * 1024;                              //Kilobit per Second
    internal static readonly double KBS=1024;                                   //Kilobyte per Second
    internal static readonly double MBIS=8;                                     //Megabit per Second
    internal static readonly double MBS=1;                                      //Megabyte per Second
    internal static readonly double M110=(1/110.0) * (8.0 * 1024.0 * 1024.0);   //110 BPS Modem
    internal static readonly double M1200=(1/1200.0) * (8.0 * 1024.0 * 1024.0); //1200 BPS Modem
    internal static readonly double M14K=(1/14400.0) * (8.0 * 1024.0 * 1024.0); //14.4 KBPS Modem
    internal static readonly double M2400=(1/2400.0) * (8.0 * 1024.0 * 1024.0); //2400 BPS Modem
    internal static readonly double M28K=(1/28800.0) * (8.0 * 1024.0 * 1024.0); //28.8 KBPS Modem
    internal static readonly double M300=(1/300.0) * (8.0 * 1024.0 * 1024.0);   //300 BPS Modem
    internal static readonly double M33K=(1/33600.0) * (8.0 * 1024.0 * 1024.0); //33.6 KBPS Modem
    internal static readonly double M56K=(1/56000.0) * (8.0 * 1024.0 * 1024.0); //56 KBPS Modem
    internal static readonly double M9600=(1/9600.0) * (8.0 * 1024.0 * 1024.0); //9600 BPS Modem
    internal static readonly double OC1=(1/6.48) * 1.048576;                    //OC1
    internal static readonly double OC12=(1/(6.48 * 12.0)) * 1.048576;          //OC12
    internal static readonly double OC192=(1/(6.48 * 192.0)) * 1.048576;        //OC192
    internal static readonly double OC24=(1/(6.48 * 24.0)) * 1.048576;          //OC24
    internal static readonly double OC3=(1/(6.48 * 3.0)) * 1.048576;            //OC3
    internal static readonly double OC48=(1/(6.48 * 48.0)) * 1.048576;          //OC48
    internal static readonly double OC768=(1/(6.48 * 768.0)) * 1.048576;        //OC768
    internal static readonly double PBIS=8/(Math.Pow(1024, 3));                 //Petabit per Second
    internal static readonly double PBS=1/(Math.Pow(1024, 3));                  //Petabyte per Second
    internal static readonly double SIGBIS=((8 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 2);        //SI Gigabit per Second
    internal static readonly double SIGBS=((1 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 2);         //SI Gigabyte per Second
    internal static readonly double SIKBIS=(8 * 1024.0) * (1024 / 1000.0);                              //SI Kilobit per Second
    internal static readonly double SIKBS=(1 * 1024.0) * (1024 / 1000.0);                               //SI Kilobyte per Second
    internal static readonly double SIMBIS=((8 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 1);        //SI Megabit per Second
    internal static readonly double SIMBS=((1 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 1);         //SI Megabyte per Second
    internal static readonly double SIPBIS=((8 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 4);        //SI Petabit per Second
    internal static readonly double SIPBS=((1 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 4);         //SI Petabyte per Second
    internal static readonly double SITBIS=((8 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 3);        //SI Terabit per Second
    internal static readonly double SITBS=((1 * 1024.0) * (1024 / 1000.0)) / Math.Pow(1000, 3);         //SI Terabyte per Second
    internal static readonly double TBIS=8/(Math.Pow(1024, 2));                 //Terabit per Second
    internal static readonly double TBS=1/(Math.Pow(1024, 2));                  //Terabyte per Second
    internal static readonly double USB1=(1/1.5) * 1.048576;                    //USB 1.X
    internal static readonly double USB2=(1/35.0) * 1.048576;                   //USB 2.X
    internal static readonly double USB3=(1/625.0) * 1.048576;                  //USB 3.0
    internal static readonly double USB31=(1/1250.0) * 1.048576;                //USB 3.1
}