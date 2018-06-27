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
 * Time Units
 * 
 * All unit values are conversions of S (Seconds) at the value of 1 converted into each unit.
 */
public enum X {
    AS(1e18),               //Attoseconds
    C(1/31536e5),           //Centuries
    D(1/864e2),             //Days
    DE(1/31536e4),          //Decades
    FS(1e15),               //Femtoseconds
    FN(1/1209600.0),        //Fortnight
    GY(1/31556952.00001),   //Gregorian Years
    H(1/36e2),              //Hours
    JY(1/31557600.0),       //Julian Years
    LY(1/31622400.0),       //Leap Years
    MUS(1e6),               //Microseconds
    M(1/31536e6),           //Millenniums
    MS(1e3),                //Milliseconds
    MIN(1/60.0),            //Minutes
    MON(1/2628000.0),       //Months
    NS(1e9),                //Nanoseconds
    PS(1e12),               //Picoseconds
    S(1),                   //Seconds
    WK(1/604800.0),         //Weeks
    Y(1/31536e3);           //Years
        
    public final double TO_S;   //Key: Seconds
    X(double v){
        this.TO_S = v;
    }
}
