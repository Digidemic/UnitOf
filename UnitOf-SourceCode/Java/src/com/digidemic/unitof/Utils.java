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
import java.util.HashMap;

/**
 * Shared static methods
 */
public final class Utils implements Serializable {
    private Utils() {
    }

    /**
     * All conversions use the following method to multiply or divide depending on how the measurement'store units are defined (See Enums).
     */
    public static double divideOrMultiply(double n, double d, boolean isMultiplication) {
        return (isMultiplication) ? n * d : n / d;
    }

    /**
     * Array of doubles to HashMap<Object,Double>
     * Several UnitOf.Anything constructors accept an array of values to be passed serving as both the key and value of the unit.
     * This method will turn that array into a HashMap as that is the format UnitOf.Anything uses behind the scenes.
     */
    public static HashMap<Object, Double> convertDoubleArrayToHashMap(double[] values) {
        HashMap<Object, Double> hashMap = new HashMap<>();
        if (values == null) {
            return hashMap;
        }
        for (int i = 0; i < values.length; i++) {
            hashMap.put(values[i], values[i]);
        }
        return hashMap;
    }
}
