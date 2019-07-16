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
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.digidemic.unitof;

/**
 * DataTransferRate Units
 *
 * All unit values are conversions of MBS (Megabyte per Second) at the value of 1 converted into each unit.
 */
public enum DataTransferRateUnits {
    BIS(1.0 * 8.0 * 1024.0 * 1024.0),           //Bit per Second
    BS(1.0 * 1.0 * 1024.0 * 1024.0),            //Byte per Second
    E10((1.0 * 8.0 * 1024.0 * 1024.0) / (Math.pow(1000, 2) * 10.0)),     //10 Base-T Ethernet
    E100((1.0 * 8.0 * 1024.0 * 1024.0) / (Math.pow(1000, 2) * 100.0)),   //100 Base-T Ethernet
    E1000((1.0 * 8.0 * 1024.0 * 1024.0) / (Math.pow(1000, 2) * 1000.0)), //1000 Base-T Ethernet
    FW400(0.02 * 1.048576),                     //FireWire 400
    FW800(0.01 * 1.048576),                     //FireWire 800
    FW3200(0.0025 * 1.048576),                  //FireWire S1600 and S3200 
    GBIS(8 / (Math.pow(1024, 1))),                //Gigabit per Second
    GBS(1 / (Math.pow(1024, 1))),                 //Gigabyte per Second
    ISDND(65.536),                              //ISDN (Dual Channel) 
    ISDNS(131.072),                             //ISDN (Single Channel) 
    KBIS(8 * 1024),                             //Kilobit per Second
    KBS(1024),                                  //Kilobyte per Second
    MBIS(8),                                    //Megabit per Second
    MBS(1),                                     //Megabyte per Second
    M110((1 / 110.0) * (8.0 * 1024.0 * 1024.0)),  //110 BPS Modem
    M1200((1 / 1200.0) * (8.0 * 1024.0 * 1024.0)),//1200 BPS Modem
    M14K((1 / 14400.0) * (8.0 * 1024.0 * 1024.0)),//14.4 KBPS Modem
    M2400((1 / 2400.0) * (8.0 * 1024.0 * 1024.0)),//2400 BPS Modem
    M28K((1 / 28800.0) * (8.0 * 1024.0 * 1024.0)),//28.8 KBPS Modem
    M300((1 / 300.0) * (8.0 * 1024.0 * 1024.0)),  //300 BPS Modem
    M33K((1 / 33600.0) * (8.0 * 1024.0 * 1024.0)),//33.6 KBPS Modem
    M56K((1 / 56000.0) * (8.0 * 1024.0 * 1024.0)),//56 KBPS Modem
    M9600((1 / 9600.0) * (8.0 * 1024.0 * 1024.0)),//9600 BPS Modem
    OC1((1 / 6.48) * 1.048576),                   //OC1
    OC12((1 / (6.48 * 12.0)) * 1.048576),         //OC12
    OC192((1 / (6.48 * 192.0)) * 1.048576),       //OC192
    OC24((1 / (6.48 * 24.0)) * 1.048576),         //OC24
    OC3((1 / (6.48 * 3.0)) * 1.048576),           //OC3
    OC48((1 / (6.48 * 48.0)) * 1.048576),         //OC48
    OC768((1 / (6.48 * 768.0)) * 1.048576),       //OC768
    PBIS(8 / (Math.pow(1024, 3))),                //Petabit per Second
    PBS(1 / (Math.pow(1024, 3))),                 //Petabyte per Second
    SIGBIS(((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 2)),       //SI Gigabit per Second
    SIGBS(((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 2)),        //SI Gigabyte per Second
    SIKBIS((8 * 1024.0) * (1024 / 1000.0)),                             //SI Kilobit per Second
    SIKBS((1 * 1024.0) * (1024 / 1000.0)),                              //SI Kilobyte per Second
    SIMBIS(((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 1)),       //SI Megabit per Second
    SIMBS(((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 1)),        //SI Megabyte per Second
    SIPBIS(((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 4)),       //SI Petabit per Second
    SIPBS(((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 4)),        //SI Petabyte per Second
    SITBIS(((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 3)),       //SI Terabit per Second
    SITBS(((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 3)),        //SI Terabyte per Second 
    TBIS(8 / (Math.pow(1024, 2))),                //Terabit per Second
    TBS(1 / (Math.pow(1024, 2))),                 //Terabyte per Second
    USB1((1 / 1.5) * 1.048576),                   //USB 1.X
    USB2((1 / 35.0) * 1.048576),                  //USB 2.X
    USB3((1 / 625.0) * 1.048576),                 //USB 3.0
    USB31((1 / 1250.0) * 1.048576);               //USB 3.1

    public final double TO_MBS; //Key: Megabyte

    DataTransferRateUnits(double valueInMegabyte) {
        this.TO_MBS = valueInMegabyte;
    }
}
