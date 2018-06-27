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
 * ElectricCharge Units
 * 
 * All unit values are conversions of MC (Megacoulomb) at the value of 1 converted into each unit.
 */
public enum J {
    ABC(1e5),                   //Abcoulomb
    AH(1/0.0036),               //Ampere Hour
    AM(1/0.00006),              //Ampere Minute
    AS(1e6),                    //Ampere Second
    C(1e6),                     //Coulomb
    EMU(1e5),                   //EMU of Charge
    ESU(2.99792457999957e15),   //ESU of Charge
    E(1/1.60217646e-25),        //Electron Charge
    F(1e6),                     //Farad Volt
    FA12(1/0.0964853103),       //Faraday (Carbon 12)
    FACH(1/0.0964957007),       //Faraday (Chemistry)
    FAPH(1/0.0965219008),       //Faraday (Physics)
    FR(2.99792457999957e15),    //Franklin
    KC(1e3),                    //Kilocoulomb
    MC(1),                      //Megacoulomb
    MUC(1e12),                  //Microcoulomb
    MILC(1e9),                  //Millicoulomb
    NC(1e15),                   //Nanocoulomb
    PC(1e18),                   //Picocoulomb
    STC(2.99792457999957e15);   //Statcoulomb
            
    public final double TO_MC;  //Key: Megacoulomb
    J(double v){
        this.TO_MC = v;
    }
}
