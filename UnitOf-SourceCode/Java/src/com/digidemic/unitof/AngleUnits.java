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
 * Angle Units
 * 
 * All unit values are conversions of D (Degree) at the value of 1 converted into each unit.
 */
public enum AngleUnits {
    C(1/360.0),         //Circle
    D(1),               //Degree
    G(1/0.9),           //Gradian
    MIL((1/0.05625)),   //Angular Mil
    M(60),              //Minute 
    Q(1/90.0),          //Quadrant
    RAD(Math.PI/180.0), //Radian
    R(1/360.0),         //Revolution
    RA(1/90.0),         //Right Angle
    S(3600),            //Second 
    SE(1/60.0),         //Sextant
    SI((1/30.0)),       //Sign
    T(1/360.0);         //Turn
    
    public final double TO_D;   //Key: Degree

    AngleUnits(double valueInDegrees) {
        this.TO_D = valueInDegrees;
    }
}
