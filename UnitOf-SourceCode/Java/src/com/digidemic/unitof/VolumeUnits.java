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
 * Volume Units
 *
 * All unit values are conversions of M (Cubic Meter) at the value of 1 converted into each unit.
 */
public enum VolumeUnits {
    ACFTUS(0.0008107083295205), //Acre Foot (US)
    ACIN(0.009728558325479),    //Acre Inch
    ACFTO(0.0008107131937899),  //Acre Foot
    AL(1e21),                   //Attoliter
    BBLO(6.289810770432),       //Barrel (Oil)
    BBLUK(6.110256897197),      //Barrel (UK) 
    BBLUS(8.386414360576),      //Barrel (US)
    FBM(423.7760006579),        //Board Foot
    CL(1e5),                    //Centiliter 
    CORD(0.2758958337616),      //Cord 
    CM(1e6),                    //Cubic Centimeter
    DM(1e3),                    //Cubic Decimeter
    FT(35.31466672148),         //Cubic Foot
    IN(61023.74409473),         //Cubic Inch
    KM(1e-9),                   //Cubic Kilometer
    M(1),                       //Cubic Meter
    MI(2.399127585789e-10),     //Cubic Mile
    MM(1e9),                    //Cubic Millimeter
    YD(1.307950619314),         //Cubic Yard
    CUPM(4e3),                  //Cup (Metric)
    CUPUK(3519.507972785),      //Cup (UK)
    CUPUS(4226.75283773),       //Cup (US)
    DL(1e4),                    //Deciliter 
    DECI(1e1),                  //Decistere 
    DAL(1e2),                   //Dekaliter 
    DEKA(0.1),                  //Dekastere
    DSTSPNUK(84468.19134685),   //Dessertspoon (UK)
    DSTSPNUS(101442.0681055),   //Dessertspoon (US)
    DROP(2e7),                  //Drop
    EL(1e-15),                  //Exaliter 
    FL(1e18),                   //Femtoliter
    FLOZUK(35195.07972785),     //Fluid Ounce (UK)
    FLOZUS(33814.02270184),     //Fluid Ounce (US)
    GALUK(219.9692482991),      //Gallon (UK)
    GALUS(264.1720523581),      //Gallon (US)
    GL(1e-6),                   //Gigaliter 
    GILUK(7039.015945571),      //Fill (UK)
    GILUS(8453.505675461),      //Gill (US)
    HL(1e1),                    //Hectoliter 
    HOG(4.193207180288),        //Hogshead
    CCF(0.3531466672149),       //100 Cubic Feet
    KL(1),                      //Kiloliter 
    L(1e3),                     //Liter
    ML(1e-3),                   //Megaliter 
    MUL(1e9),                   //Microliter 
    MILL(1e6),                  //Milliliter 
    MINIUK(16893638.26937),     //Minim (UK)    
    MINIUS(16230730.89688),     //Minim (US)
    NL(1e12),                   //Nanoliter 
    PEL(1e-12),                 //Petaliter 
    PL(1e15),                   //Picoliter 
    PTUK(1759.753986393),       //Pint (UK)
    PTUS(2113.376418865),       //Pint (US) 
    QTUK(879.8769931964),       //Quart (UK)
    QTUS(1056.688209433),       //Quart (US)
    REGTON(0.3531466672149),    //Register Ton
    ST(1),                      //Stere 
    TBSPM(66666.66666667),      //Tablespoon (Metric)
    TBSPUK(56312.12756457),     //Tablespoon (UK)    
    TBSPUS(67628.04540369),     //Tablespoon (US)
    TSPM(2e5),                  //Teaspoon (Metric)
    TSPUK(168936.3826937),      //Teaspoon (UK)
    TSPUS(202884.1362111),      //Teaspoon (US)
    TL(1e-9),                   //Teraliter 
    TUN(1.048301795072);        //Tun

    public final double TO_M;   //Key: Cubic Meter

    VolumeUnits(double valueInCubicMeter) {
        this.TO_M = valueInCubicMeter;
    }
}
