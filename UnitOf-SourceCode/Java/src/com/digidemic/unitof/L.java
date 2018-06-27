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
 * Force Units
 * 
 * All unit values are conversions of N (Newton) at the value of 1 converted into each unit.
 */
public enum L {
    AUF(12137804.11081),        //Atomic Unit of Force
    AN(1e18),                   //Attonewton
    CN(1e2),                    //Centinewton
    DN(1e1),                    //Decinewton
    DAN(1e-1),                  //Dekanewton  
    DYN(1e5),                   //Dyne
    EN(1e-18),                  //Exanewton
    FN(1e15),                   //Femtonewton
    GN(1e-9),                   //Giganewton
    GF(1/9.80665e-3),           //Gram Force
    GFF(1/9.80665),             //Grave Force
    HN(1e-2),                   //Hectonewton 
    JCM(1e2),                   //Joule per Centimeter 
    JM(1),                      //Joule per Meter
    KGF(1/9.80665),             //Kilogram force
    KN(1e-3),                   //Kilonewton
    KP(1/9.80665),              //Kilopond
    KIP(1/4448.221615255),      //Kilopound Force
    LTF(1/9964.01641818352),    //Long Ton Force
    MN(1e-6),                   //Meganewton
    TFM(1/9806.65),             //Ton Force (Metric)
    MUN(1e6),                   //Micronewton
    MGF(1/9.80665e-3),          //Milligrave Force
    MILN(1e3),                  //Millinewton
    NN(1e9),                    //Nanonewton
    N(1),                       //Newton
    OZF(1/0.27801385095378125), //Ounce Force
    PEN(1e-15),                 //Petanewton
    PN(1e12),                   //Piconewton
    P(1/9.80665e-3),            //Pond
    LBFT(1/0.138254954376),     //Pound Foot per Second Squared
    LBF(1/4.4482216152605),     //Pound Force
    PDL(1/0.138254954376),      //Poundal
    TFS(1/8896.443230521),      //Ton Force (Short)
    SN(1/1e3),                  //Sthene
    TN(1e-12);                  //Teranewton
    
    public final double TO_N;   //Key: Newton
    L(double v){
        this.TO_N = v;
    }
}
