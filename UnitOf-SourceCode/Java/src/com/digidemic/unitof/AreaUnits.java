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
 * Area Units
 *
 * All unit values are conversions of M (Square Meter) at the value of 1 converted into each unit.
 */
public enum AreaUnits {
    AC(1/4046.8564224),     //Acre
    A(1e-2),                //Are
    AR(1/3418.740000066),   //Arpent
    B(1e28),                //Barn
    CRIN(1973.52524139),    //Circular Inch
    CRMIL(1973525241.39),   //Circular Mil
    HA(1e-4),               //Hactare
    HS(1/647497.027584),    //Homestead 
    R(1/1011.7141056),      //Rood
    S(1/0.09290304),        //Sabin
    C(1e4),                 //Square Centimeter
    CH(1/404.68564224),     //Square Chain
    D(1e2),                 //Square Decimeter
    DA(1e-2),               //Square Dekameter
    FT(1/0.09290304),       //Square Foot
    H(1e-4),                //Square Hectometer
    IN(1/0.00064516),       //Square Inch
    K(1e-6),                //Square Kilometer
    M(1),                   //Square Meter
    MU(1e12),               //Square Micrometer  
    MI(1/2589988.110336),   //Square Mile
    MIL(1e6),               //Square Millimeter  
    N(1e18),                //Square Nanometer
    PE(1/25.29285264),      //Square Perch
    PO(1/25.29285264),      //Square Pole   
    ROD(1/25.29285264),     //Square Rod
    YD(1/0.83612736);       //Square Yard

    public final double TO_M;   //Key: Square Meter

    AreaUnits(double valueInSquareMeters) {
        this.TO_M = valueInSquareMeters;
    }
}
