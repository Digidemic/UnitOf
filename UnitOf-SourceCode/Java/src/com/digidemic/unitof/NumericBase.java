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
 * NumericBase Units
 */
public enum NumericBase {
    B11(11),    //Base 11
    B12(12),    //Base 12
    B13(13),    //Base 13
    B14(14),    //Base 14
    B15(15),    //Base 15
    B17(17),    //Base 17
    B18(18),    //Base 18
    B19(19),    //Base 19
    B20(20),    //Base 20
    B21(21),    //Base 21
    B22(22),    //Base 22
    B23(23),    //Base 23
    B24(24),    //Base 24
    B25(25),    //Base 25
    B26(26),    //Base 26
    B27(27),    //Base 27
    B28(28),    //Base 28
    B29(29),    //Base 29
    B3(3),      //Base 3
    B30(30),    //Base 30
    B31(31),    //Base 31
    B32(32),    //Base 32
    B33(33),    //Base 33
    B34(34),    //Base 34
    B35(35),    //Base 35
    B36(36),    //Base 36
    B4(4),      //Base 4
    B5(5),      //Base 5
    B6(6),      //Base 5
    B7(7),      //Base 6
    B9(9),      //Base 9
    B2(2),      //Binary / Base 2
    B10(10),    //Decimal / Base 10
    B16(16),    //Hex / Base 16
    B8(8);      //Octal / Base 8

    public final int TO_B10;    //Key: Base 10 / Decimal

    NumericBase(int valueInBase10) {
        this.TO_B10 = valueInBase10;
    }
}
