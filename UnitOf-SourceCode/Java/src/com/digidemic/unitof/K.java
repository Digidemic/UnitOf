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
 * Energy/Work Units
 * 
 * All unit values are conversions of J (Joule) at the value of 1 converted into each unit.
 */
public enum K {
    AJ(1e18),                   //Attojoule 
    BTU(1/1055.05585262),       //British Thermal Unit 
    BTUTH(1/1054.349999974),    //Thermochemical British Thermal Unit  
    BOE(1/61178632e2),          //Barrel of Oil Equivalent
    CALIT(1/4.1868),            //Calorie (International Steam)
    CALN(1/4186.8),             //Calorie (Nutritional)
    CALTH(1/4.184),             //Calorie (Thermochemical)
    DYNCM(1/1e-7),              //Dyne Centimeter 
    EV(1/1.60217733e-19),       //Electron Volt
    ERG(1e7),                   //Erg 
    FTLBF(0.737562149),         //Foot Pound
    GJ(1e-9),                   //Gigajoule 
    GT(1/4.184e18),             //Gigaton of TNT
    GWH(1/36e11),               //Gigawatt Hour
    GFCM(10197.16213009),       //Gram Force Centimeter
    GFM(101.9716213009),        //Gram Force Meter
    H(1/4.3597482e-18),         //Hartree Energy
    HPH(1/2684519.537696172792),//Horsepower Hour
    HPHM(1/2647795.5),          //Horsepower Hour (Metric)
    INOZF(141.611932666),       //Inch Ounce
    INLBF(8.850745792),         //Inch Pound
    J(1),                       //Joule 
    KCALIT(1/4186.8),           //Kilocalorie (International Steam)
    KCALTH(1/4184.0),           //Kilocalorie (Thermochemical)
    KEV(1/1.60217733e-16),      //Kiloelectron Volt
    KGFCM(10.19716213009),      //Kilogram Force Centimeter
    KGFM(0.1019716213009),      //Kilogram Force Meter
    KGT(1/4184e3),              //Kilogram of TNT 
    KJ(1e-3),                   //Kilojoule 
    KPM(0.1019716213009),       //Kilopond Meter
    KT(1/4.184e12),             //Kiloton of TNT
    KWH(1/36e5),                //Kilowatt Hour
    KWS(1e-3),                  //Kilowatt Second
    LA(1/101.325),              //Liter Atmosphere
    MBTU(1/1055055852.62),      //Mega British Thermal Unit
    MEV(1/1.60217733e-13),      //Megaelectron Volt
    MJ(1e-6),                   //Megajoule 
    MT(1/4.184e15),             //Megaton of TNT
    MWH(1/36e8),                //Megawatt Hour
    MUJ(1e6),                   //Microjoule 
    MILJ(1e3),                  //Millijoule 
    NJ(1e9),                    //Nanojoule 
    NM(1),                      //Newton Meter
    EP(1/19561e5),              //Planck Energy
    PDLFT(1/0.04214011),        //Poundal Foot
    RY(1/2.179872e-18),         //Rydberg
    THMEC(1/105505600.0),       //Therm (EC)
    THMUS(1/105480400.0),       //Therm (US)
    TT(1/4184e6),               //Ton of TNT
    WH(1/36e2),                 //Watt Hour
    WS(1);                      //Watt Second
    
    public final double TO_J;   //Key: Joule
    K(double v){
        this.TO_J = v;
    }
}