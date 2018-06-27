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
 * Mass Units
 * 
 * All unit values are conversions of G (Gram) at the value of 1 converted into each unit.
 */
public enum P {
    AG(1e18),               //Attogram 
    CT(5),                  //Carat
    CG(1e2),                //Centigram
    CWT(1e-5),              //Centner
    DG(1e1),                //Decigram
    DAG(1e-1),              //Dekagram
    EG(1e-18),              //Exagram
    FG(1e15),               //Femtogram
    GAMM(1e6),              //Gamma
    GG(1e-9),               //Gigagram
    G(1),                   //Gram
    HG(1e-2),               //Hectogram
    KG(1e-3),               //Kilogram
    KIP(1/453592.37),       //Kilopound
    TK(1e-9),               //Kilotons (Metric)
    MG(1e-6),               //Megagram
    MUG(1e6),               //Microgram
    MILG(1e3),              //Milligram
    NG(1e9),                //Nanogram
    MOZ(4e-2),              //Ounce (Metric)
    USOZ(1/28.349523125),   //Ounce (US)
    PEG(1e-15),             //Petagram
    PG(1e12),               //Picogram
    LB(1/453.592),          //Pound 
    QU(1e-5),               //Quintal (Metric) 
    SLUG(1/14593.9029372),  //Slug
    STUK(1/6350.29318),     //Stone (UK)
    STUS(1/5669.904625),    //Stone (US)
    TG(1e-12),              //Teragram
    TI(1/1016000.0),        //Ton (Imperial)
    TM(1e-6),               //Tons (Metric)
    TUS(1/907185.0);        //Ton (US)
    
    public final double TO_G;   //Key: Gram
    P(double v){
        this.TO_G = v;
    }
}