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
 * MetricPrefix Units
 * 
 * All unit values are conversions of each unit at the value of 1 converted into NN (No Prefix).
 */
public enum Q {
    A(1e-18),   //Atto
    C(1e-2),    //Centi
    D(1e-1),    //Deci
    DA(1e1),    //Deka
    E(1e18),    //Exa
    F(1e-15),   //Femto
    G(1e9),     //Giga
    H(1e2),     //Hecto
    K(1e3),     //Kilo
    M(1e6),     //Mega
    MU(1e-6),   //Micro
    MIL(1e-3),  //Milli
    N(1e-9),    //Nano
    NN(1e0),    //No Prefix
    PE(1e15),   //Peta
    P(1e-12),   //Pico
    T(1e12),    //Tera
    YO(1e-24),  //Yocto
    Y(1e24),    //Yotta
    ZO(1e-21),  //Zepto
    Z(1e21);    //Zetta
     
    public final double TO_NN;  //Key: No Prefix
    Q(double v){
        this.TO_NN = v;
    }
}
