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
 * Acceleration Units
 * 
 * All unit values are conversions of each unit at the value of 1 converted into MS (Meter per Second Squared).
 */
public enum D {
    AS(1e-18),          //Attometer per Second Squared
    CS(1e-2),           //Centimeter per Second Squared
    DS(1e-1),           //Decimeter per Second Squared
    DAS(1e1),           //Dekameter per Second Squared
    ES(1e18),           //Exameter per Second Squared
    FTHS(0.000084666666666667),//Foot per Hour per Second
    FTMS(0.00508),      //Foot per Minute per Second
    FTS(0.3048),        //Foot per Second Squared
    FS(1e-15),          //Femtometer per Second Squared
    GAL(1/1e2),         //Galileo
    GS(1e9),            //Gigameter per Second Squared
    G(9.80665),         //Gravity
    HS(1e2),            //Hectometer per Second Squared
    INMS(0.0004233333), //Inch per Minute per Second
    INS(0.0254),        //Inch per Second Squared
    KHS(1/3.6),         //Kilometers per Hour per Second
    KH(1/12960.0),      //Kilometers per Hour Squared
    KS(1e3),            //Kilometer per Second Squared
    KNS(0.514444444444),//Knot per Second
    MGS(1e6),           //Megameter per Second Squared
    MS(1),              //Meter per Second Squared
    MUGAL(1/1e8),       //Microgalileo
    MUS(1e-6),          //Micrometer per Second Squared
    MIHS(0.44704),      //Mile per Hour per Second
    MIMS(26.8224),      //Mile per Minute per Second
    MIS(1609.344),      //Mile per Second Squared
    MILGAL(1/1e5),      //Milligalileo
    MILS(1e-3),         //Millimeter per Second Squared
    NS(1e-9),           //Nanometer per Second Squared
    PES(1e15),          //Petameter per Second Squared
    PS(1e-12),          //Picometer per Second Squared
    TS(1e12),           //Terameter per Second Squared
    YDS(0.9144);        //Yard per Second Squared
    
    public final double TO_MS;  //Key: Meter per Second Squared
    D(double v){
        this.TO_MS = v;
    }
}
