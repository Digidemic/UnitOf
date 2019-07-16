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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.digidemic.unitof;

/**
 * DataStorage Units
 * 
 * All unit values are conversions of MB (Megabyte) at the value of 1 converted into each unit.
 */
public enum DataStorageUnits {
    B(1.0 * 8.0 * 1024.0 * 1024.0), //Bit
    BL(1.0 * 1.0 * 2.0 * 1024.0),   //Block
    BD2(1/51200.0),                 //Blu-ray Disc (Double-Layer)
    BD1(1/25600.0),                 //Blu-ray Disc (Single-Layer)
    BY(1.0 * 1.0 * 1024.0 * 1024.0),//Byte
    CD74(1/(665096.0/1024.0)),      //CD (74 Minute)
    CD80(1/702.170607567),          //CD (80 Minute)
    D22(1/17408.0),                 //DVD (2 Layer 2 Side)
    D12(1/9625.6),                  //DVD (1 Layer 2 Side)
    D21(1/8704.0),                  //DVD (2 Layer 1 Side)
    D11(1/4812.8),                  //DVD (1 Layer 1 Side)
    EBI(8/(Math.pow(1024, 4))),     //Exabit
    EB(1/(Math.pow(1024, 4))),      //Exabyte 
    F35DD(1/(711.75/1024.0)),       //Floppy Disk (3.5 DD)
    F35ED(1/(2847.0/1024.0)),       //Floppy Disk (3.5 ED)
    F35HD(1/(1423.5/1024.0)),       //Floppy Disk (3.5 HD)
    F525DD(1/(355.875/1024.0)),     //Floppy Disk (5.25 DD)
    F525HD(1/(1185.5/1024.0)),      //Floppy Disk (5.25 HD)
    GBI(8/(Math.pow(1024, 1))),     //Gigabit
    GB(1/(Math.pow(1024, 1))),      //Gigabyte
    KBI(8 * 1024),                  //Kilobit
    KB(1024),                       //Kilobyte
    MBI(8),                         //Megabit
    MB(1),                          //Megabyte
    NI(1.0 * 2.0 * 1024.0 * 1024.0),//Nibble 
    PBI(8/(Math.pow(1024, 3))),     //Petabit
    PB(1/(Math.pow(1024, 3))),      //Petabyte    
    SIEBI(((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 5)),//SI Exabit
    SIEB(((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 5)), //SI Exabyte
    SIGBI(((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 2)),//SI Gigabit
    SIGB(((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 2)), //SI Gigbyte
    SIKBI((8 * 1024.0) * (1024 / 1000.0)),                      //SI Kilobit
    SIKB((1 * 1024.0) * (1024 / 1000.0)),                       //SI Kilobyte
    SIMBI(((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 1)),//SI Megabit
    SIMB(((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 1)), //SI Megabyte
    SIPBI(((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 4)),//SI Petabit
    SIPB(((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 4)), //SI Petabyte
    SITBI(((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 3)),//SI Terabit
    SITB(((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 3)), //SI Terabyte
    SIYBI(((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 7)),//SI Yottabit
    SIYB(((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 7)), //SI Yottabyte
    SIZBI(((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 6)),//SI Zettabit
    SIZB(((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 6)), //SI Zettabyte    
    TBI(8/(Math.pow(1024, 2))),     //Terabit
    TB(1/(Math.pow(1024, 2))),      //Terabyte
    W(1.0 * 1.0 * 512.0 * 1024.0),  //Word
    YBI(8/(Math.pow(1024, 6))),     //Yottabit
    YB(1/(Math.pow(1024, 6))),      //Yottabyte
    ZBI(8/(Math.pow(1024, 5))),     //Zettabit
    ZB(1/(Math.pow(1024, 5)));      //Zettabyte
    
    public final double TO_MB;  //Key: Megabyte

    DataStorageUnits(double valueInMegabytes) {
        this.TO_MB = valueInMegabytes;
    }
}
