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

import java.io.Serializable;
import java.math.BigInteger;

import static com.digidemic.unitof.NumericBase.*;

/**
 * NumericBase Conversions
 *
 * Ex:
 * String hexToBinary = "";
 * try{
 * hexToBinary = new UnitOf.NumericBase().fromHexadecimal("ADa3").toBinary();//Returns 1010110110100011
 * } catch(Exception e){
 * //Handle exception: all NumericBase conversion "To" are throwable. For many conversions, strings with letter have to be passed in but do not always apply to every numeric base
 * }
 */
public class NumericBaseConversions extends BaseMeasurementUnit<NumericBase> implements Serializable {

    /*
    "to" Methods

    Ex 1: double bar = foo.toBinary(); //Variable "bar" being of type UnitOf.NumericBase with "from" value already assigned
    Ex 2: double bar = new UnitOf.NumericBase().fromHexadecimal("ADa3").toBinary(); //One line conversion from "ADa3" Hex to Binary
    */
    public final String toBase11() throws Exception {
        return convert(B11);
    }

    public final String toBase12() throws Exception {
        return convert(B12);
    }

    public final String toBase13() throws Exception {
        return convert(B13);
    }

    public final String toBase14() throws Exception {
        return convert(B14);
    }

    public final String toBase15() throws Exception {
        return convert(B15);
    }

    public final String toBase17() throws Exception {
        return convert(B17);
    }

    public final String toBase18() throws Exception {
        return convert(B18);
    }

    public final String toBase19() throws Exception {
        return convert(B19);
    }

    public final String toBase20() throws Exception {
        return convert(B20);
    }

    public final String toBase21() throws Exception {
        return convert(B21);
    }

    public final String toBase22() throws Exception {
        return convert(B22);
    }

    public final String toBase23() throws Exception {
        return convert(B23);
    }

    public final String toBase24() throws Exception {
        return convert(B24);
    }

    public final String toBase25() throws Exception {
        return convert(B25);
    }

    public final String toBase26() throws Exception {
        return convert(B26);
    }

    public final String toBase27() throws Exception {
        return convert(B27);
    }

    public final String toBase28() throws Exception {
        return convert(B28);
    }

    public final String toBase29() throws Exception {
        return convert(B29);
    }

    public final String toBase3() throws Exception {
        return convert(B3);
    }

    public final String toBase30() throws Exception {
        return convert(B30);
    }

    public final String toBase31() throws Exception {
        return convert(B31);
    }

    public final String toBase32() throws Exception {
        return convert(B32);
    }

    public final String toBase33() throws Exception {
        return convert(B33);
    }

    public final String toBase34() throws Exception {
        return convert(B34);
    }

    public final String toBase35() throws Exception {
        return convert(B35);
    }

    public final String toBase36() throws Exception {
        return convert(B36);
    }

    public final String toBase4() throws Exception {
        return convert(B4);
    }

    public final String toBase5() throws Exception {
        return convert(B5);
    }

    public final String toBase6() throws Exception {
        return convert(B6);
    }

    public final String toBase7() throws Exception {
        return convert(B7);
    }

    public final String toBase9() throws Exception {
        return convert(B9);
    }

    public final String toBinary() throws Exception {
        return convert(B2);
    }

    public final String toDecimal() throws Exception {
        return convert(B10);
    }

    public final String toHexadecimal() throws Exception {
        return convert(B16);
    }

    public final String toOctal() throws Exception {
        return convert(B8);
    }

    /**
     * Method to perform all conversions within NumericBase class.
     * All conversions convert user passed base and value into decimal (Base 10) then from decimal to desired base.
     */
    private final String convert(NumericBase t) {
        return decimalToAnyBase(anyBaseToDecimal(String.valueOf(conversionHelper.obj), conversionHelper.type.TO_B10), t.TO_B10);
    }

    /**
     * Takes decimal (Base 10) value and converts it into desired base
     */
    private static final String decimalToAnyBase(String v, int base) {
        BigInteger bi = new BigInteger((v.startsWith("-")) ? (v.substring(1)).toUpperCase().trim() : v.toUpperCase().trim());
        BigInteger r;
        String s = "";
        BigInteger bt = new BigInteger(String.valueOf(base));

        while (!bi.toString().equals("0")) {
            r = bi.mod(bt);
            s = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(r.intValue()) + s;
            bi = bi.divide(bt);
        }
        s = (v.startsWith("-")) ? "-" + s : s;
        return s;
    }

    /**
     * Takes any base passed in and converts the value into decimal (Base 10)
     */
    private static final String anyBaseToDecimal(String v, int base) {
        String nn = (v.startsWith("-")) ? (v.substring(1)).toUpperCase().trim() : v.toUpperCase().trim();
        BigInteger bb = new BigInteger(String.valueOf(base));

        BigInteger z = new BigInteger("0");
        for (int i = 0; i < nn.length(); i++) {
            z = z.multiply(bb);
            int in = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(nn.charAt(i));
            if (in + 1 > base || in < 0) {
                throw new IllegalArgumentException(String.valueOf("Base " + base + " does not support " + v));
            }
            z = z.add(new BigInteger(String.valueOf(in)));
        }
        return (v.startsWith("-")) ? "-" + z.toString() : z.toString();
    }
}
