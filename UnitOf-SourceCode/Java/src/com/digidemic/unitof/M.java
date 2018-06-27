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
 * Frequency Units
 * 
 * All unit values are conversions of MHZ (Megahertz) at the value of 1 converted into each unit.
 */
public enum M {  
    AHZ(1e24),  //Attohertz 
    CHZ(1e8),   //Centihertz
    CS(1e6),    //Cycle per Second
    DHZ(1e7),   //Decihertz   
    DAHZ(1e5),  //Dekahertz   
    EHZ(1e-12), //Exahertz
    FHZ(1e21),  //Femtohertz 
    GHZ(1e-3),  //Gigahertz
    HHZ(1e4),   //Hectohertz  
    HZ(1e6),    //Hertz
    KHZ(1e3),   //Kilohertz 
    MHZ(1),     //Megahertz
    MUHZ(1e12), //Microhertz
    MIHZ(1e9),  //Millihertz
    NHZ(1e15),  //Nanohertz
    PEHZ(1e-9), //Petahertz
    PHZ(1e18),  //Picohertz 
    RD(864e8),  //Revolution per Day 
    RH(36e8),   //Revolution per Hour
    RM(6e7),    //Revolution per Minute
    RS(1e6),    //Revolution per Second
    THZ(1e-6);  //Terahertz
    
    public final double TO_MHZ; //Key: Megahertz
    M(double v){
        this.TO_MHZ = v;
    }
}
