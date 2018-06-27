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
 * Length Units
 * 
 * All unit values are conversions of M (Meter) at the value of 1 converted into each unit.
 */
public enum O {
    A(1e10),                    //Angstrom
    AM(1e18),                   //Attometer 
    BC(1/(0.2286/27.0)),        //Barleycorn 
    CBLIMP(1/185.3184),         //Cable Length (Imperial)
    CBLIN(1/185.2),             //Cable Length (International)
    CBLUS(1/219.456),           //Cable Length (US)
    CL(1/0.000254),             //Caliber 
    CIN(1/0.000254),            //Centiinch 
    CM(1e2),                    //Centimeter 
    CH(1/20.1168),              //Chain 
    CU(1/0.4572),               //Cubit
    DM(1e1),                    //Decimeter 
    DAM(1e-1),                  //Dekameter
    ELL(1/1.143),               //Ell
    EM(1e-18),                  //Exameter 
    FTM(1/1.8288),              //Fathom 
    FT(1/0.3048),               //Foot 
    FM(1e15),                   //Femtometer 
    FING(1/0.1143),             //Finger 
    FUR(1/201.168),             //Furlong 
    GM(1e-9),                   //Gigameter 
    HAND(1/0.1016),             //Hand 
    HM(1e-2),                   //Hectometer 
    IN(1/0.0254),               //Inch 
    KM(1e-3),                   //Kilometer 
    KYD(1/914.4),               //Kiloyard 
    LEA(1/4828.032),            //League
    LY(1/9.46073047258e15),     //Lightyear
    LNK(1/0.201168),            //Link 
    MM(1e-6),                   //Megameter
    M(1),                       //Meter 
    MUIN(1/(0.0000254/1000.0)), //Microinch 
    MUM(1e6),                   //Micrometer 
    MURM(1e6),                  //Micron 
    MI(1/1609.344),             //Mile 
    MILM(1e3),                  //Millimeter
    NAIL(1/0.05715),            //Nail 
    NM(1e9),                    //Nanometer 
    NLEAIN(1/5556.0),           //Nautical League (International) 
    NLEAUK(1/5559.552),         //Nautical League (UK)
    NMIINT(1/1852.0),           //Nautical Mile (International)
    NMIUK(1/1853.184),          //Nautical Mile (UK)
    NMIUS(1/1853.248),          //Nautical Mile (US) 
    PER(1/5.0292),              //Perch
    PEM(1e-15),                 //Petameter 
    PM(1e12),                   //Picometer 
    POL(1/5.0292),              //Pole
    RD(1/5.0292),               //Rod
    ROPE(1/6.096),              //Rope 
    SPAN(1/0.2286),             //Span 
    TM(1e-12),                  //Terameter 
    TIN(1/0.0000254),           //Thousandth of Inch
    YD(1/0.9144);               //Yard
    
    public final double TO_M;   //Key: Meter
    O(double v){
        this.TO_M = v;
    }
}
