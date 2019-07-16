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
 * Pressure Units
 * 
 * All unit values are conversions of PA (Pascal) at the value of 1 converted into each unit.
 */
public enum PressureUnits {
    APA(1e18),                  //Attopascal
    BAR(1e-5),                  //Bar
    BA(1e1),                    //Barye 
    CMHG(1/1333.22),            //Centimeter Mercury (0C)
    CMW4(1/98.0638),            //Centimeter Water (4C)
    CPA(1e2),                   //Centipascal
    DBAR(1e-4),                 //Decibar 
    DPA(1e1),                   //Decipascal
    DAPA(1e-1),                 //Dekapascal
    DYNCM(1e1),                 //Dyne per Square Centimeter
    EPA(1e-18),                 //Exapascal
    FSW(1/3064.30593138),       //Foot Sea Water (15С)
    FTW4(1/2988.98),            //Foot Water (4C)
    FTW60(1/2986.116),          //Foot Water (60F)
    FPA(1e15),                  //Femtopascal
    GPA(1e-9),                  //Gigapascal
    GFCM(1/98.0665),            //Gram Force per Square Centimeter
    HPA(1e-2),                  //Hectopascal
    INHG32(1/3386.38),          //Inch Mercury (32F)
    INHG60(1/3376.85),          //Inch Mercury (60F)
    INW4(1/249.082),            //Inch Water (4C)
    INW60(1/248.843),           //Inch Water (60F)
    KSI(1/6894757.293178),      //KSI
    KGFCM(1/98066.5),           //Kilogram Force per Square Centimeter
    KGFM(1/9.80665),            //Kilogram Force per Square Meter   
    KFGMM(1/9806650.0),         //Kilogram Force per Square Millimeter
    KNM(1e-3),                  //Kilonewton per Square Meter
    KPA(1e-3),                  //Kilopascal
    KIPFIN(1/6894757.293178),   //Kip Force per Square Inch
    TFFTL(1/107251.780116),     //Ton Force per Square Foot (Long)
    TFINL(1/15444256.3367),     //Ton Force per Square Inch (Long)
    MPA(1e-6),                  //Megapascal
    MSW(1e-4),                  //Meter Sea Water
    MW4(1/9806.38),             //Meter Water (4C)
    MUBAR(1e1),                 //Microbar 
    MUPA(1e6),                  //Micropascal
    MILBAR(1e-2),               //Millibar 
    MMHG(1/133.322),            //Millimeter Mercury (0C)
    MMW4(1/9.80638),            //Millimeter Water (4C)
    MILPA(1e3),                 //Millipascal
    NPA(1e9),                   //Nanopascal
    NCM(1e-4),                  //Newton per Square Centimeter
    NM(1),                      //Newton per Square Meter
    NMM(1e-6),                  //Newton per Square Millimeter
    PSI(1/6894.757293178),      //PSI
    PA(1),                      //Pascal
    PEPA(1e-15),                //Petapascal
    PPA(1e12),                  //Picopascal
    PIZ(1e-3),                  //Pieze 
    PDLFT(1/1.48816394357),     //Poundal per Square Foot
    LBFFT(1/47.8802589804),     //Pound Force per Square Foot
    LBFIN(1/6894.757293178),    //Pound Force per Square Inch
    TFFTS(1/95760.51796068),    //Ton Force per Square Foot (Short)
    TFINS(1/13789514.58634),    //Ton Force per Square Inch (Short)
    ATM(1/101325.0),            //Standard Atmosphere
    SM(1e-3),                   //Sthene per Square Meter
    AT(1/98066.5),              //Atmosphere Technical
    TPA(1e-12),                 //Terapascal
    TORR(1/133.3223684211);     //Torr
    
    public final double TO_PA;  //Key: Pascal

    PressureUnits(double valueInPascal) {
        this.TO_PA = valueInPascal;
    }
}
