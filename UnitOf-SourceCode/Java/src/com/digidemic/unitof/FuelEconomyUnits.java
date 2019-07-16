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
 * FuelEconomy Units
 * 
 * All unit values are conversions of MCM (Meter per Cubic Centimeter) at the value of 1 converted into each unit.
 */
public enum FuelEconomyUnits {
    CML(1e5),               //Centimeter per Liter    
    DAML(1e2),              //Dekameter per Liter
    EML(1e-15),             //Exameter per Liter
    GML(1e-6),              //Gigameter per Liter
    HML(1e1),               //Hectometer per Liter
    KMGALUK(4.546099293921),//Kilometer per Gallon (UK)
    KMGALUS(3.7854117834),  //Kilometer per Gallon (US)
    KML(1),                 //Kilometer per Liter
    MML(1e-3),              //Megameter per Liter
    MCM(1),                 //Meter per Cubic Centimeter
    MFT(28316.84659319),    //Meter per Cubic Foot
    MIN(16.38706400127),    //Meter per Cubic Inch
    MM(1e6),                //Meter per Cubic Meter
    MYD(764554.8581679),    //Meter per Cubic Yard
    MCUPUK(284.1312059185), //Meter per Cup (UK)
    MCUPUS(236.5882364849), //Meter per Cup (US)
    MFOZUK(28.41312059185), //Meter per Fluid Ounce (UK)
    MFOZUS(29.57352956411), //Meter per Fluid Ounce (US)
    MGALUK(4546.099293921), //Meter per Gallon (UK)
    MGALUS(3785.4117834),   //Meter per Gallon (US)
    ML(1e3),                //Meter per Liter
    MPTUK(568.2624116755),  //Meter per Pint (UK)
    MPTUS(473.1764729698),  //Meter per Pint (US)
    MQTUK(1136.524822963),  //Meter per Quart (UK)
    MQTUS(946.3529463874),  //Meter per Quart (US)
    MIGALUK(2.824809362797),//Mile per Gallon (UK)
    MIGALUS(2.352145832948),//Mile per Gallon (US)
    MIL(1/1.609344),        //Mile per Liter (US)
    NMIGAL(1/0.4895755247), //Nautical Mile/Gallon (US)   
    NMIL(1/1.85324496),     //Nautical Mile per Liter
    PML(1e-12),             //Petameter per Liter
    TML(1e-9);              //Terameter per Liter
    
    public final double TO_KML; //Key: Kilometer per Liter

    FuelEconomyUnits(double valueInKilometerPerLiter) {
        this.TO_KML = valueInKilometerPerLiter;
    }
}
