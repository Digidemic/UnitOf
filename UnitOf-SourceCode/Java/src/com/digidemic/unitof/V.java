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
 * Speed Units
 * 
 * All unit values are conversions of each unit at the value of 1 converted into MS (Meters per Second).
 */
public enum V {
    CMH(1/36e4),            //Centimeter per Hour
    CMM(1/6e3),             //Centimeter per Minute
    CMS(1/1e2),             //Centimeter per Second 
    EV(29765),              //Earths Velocity
    FTH(1/11811.02362205),  //Feet per Hour
    FTM(0.00508),           //Feet per Minute
    FTS(0.3048),            //Feet per Second
    CV1(7900),              //Cosmic Velocity First
    INH(7.0555555555e-6),   //Inch per Hour
    INM(4.2333333333e-4),   //Inch per Minute
    INS(0.0254),            //Inch per Second
    KMH(1/3.6),             //Kilometer per Hour
    KMM(1/6e-2),            //Kilometer per Minute
    KMS(1e3),               //Kilometer per Second
    KN(1/1.943844492441),   //Knot
    C(299792458),           //Light
    MA(295.0464000003),     //Mach SI Standard
    MH(1/36e2),             //Meters per Hour
    MM(1/60.0),             //Meters per Minute
    MS(1),                  //Meters per Second
    MIH(0.44704),           //Miles per Hour
    MIM(26.8224),           //Miles per Minute
    MIS(1609.344),          //Miles per Second
    MMH(1/36e5),            //Millimeter per Hour
    MMM(1/6e4),             //Millimeter per Minute
    MMS(1/1e3),             //Millimeter per Second   
    CV2(11200),             //Cosmic Velocity Second
    SA(344),                //Speed of Sound in Air
    SW(1482.7),             //Speed of Sound in Water
    CV3(16670),             //Cosmic Velocity Third
    YH(0.000254),           //Yard per Hour
    YM(0.01524),            //Yard per Minute
    YS(0.9144);             //Yard per Second
    
    public final double TO_MS;  //Key: Meters per Second
    V(double v){
        this.TO_MS = v;
    }
}
