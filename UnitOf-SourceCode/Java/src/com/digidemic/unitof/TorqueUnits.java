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
 * Torque Units
 *
 * All unit values are conversions of KGFM (Kilogram Force Meter) at the value of 1 converted into each unit.
 */
public enum TorqueUnits {
    DYNCM(9.80665e7),       //Dyne Centimeter
    DYNM(9.80665e5),        //Dyne Meter
    DYNMM(9.80665e8),       //Dyne Millimeter
    GFCM(1e5),              //Gram Force Centimeter
    GFM(1e3),               //Gram Force Meter
    GFMM(1e6),              //Gram Force Millimeter
    KGFCM(1e2),             //Kilogram Force Centimeter
    KGFM(1),                //Kilogram Force Meter
    KGFMM(1e3),             //Kilogram Force Millimeter
    KNM(9.80665e-3),        //Kilonewton Meter
    NCM(9.80665e2),         //Newton Centimeter
    NM(9.80665),            //Newton Meter
    NMM(9.80665e3),         //Newton Millimeter
    OZFFT(115.7282185748),  //Ounce Force Foot
    OZFIN(1388.738622898),  //Ounce Force Inch
    LBFFT(7.23301357557),   //Pound Force Foot
    LBFIN(86.79616290684);  //Pound Force Inch

    public final double TO_KGFM;    //Key: Kilogram Force Meter

    TorqueUnits(double valueInKilogramForceMeter) {
        this.TO_KGFM = valueInKilogramForceMeter;
    }
}
