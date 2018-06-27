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

import java.io.Serializable;
import java.util.HashMap;

/**
 * Shared static methods
 */
public final class U implements Serializable{ 
    /**
     * All conversions use the following method to multiply or divide depending on how the measurement's units are defined (See Enums).
     */
    public static final double i(double n, double d, boolean mult){
        return (mult) ? n * d : n / d;
    }
     
    /**
     * Array of doubles to HashMap<Object,Double>
     * Several UnitOf.Anything constructors accept an array of values to be passed serving as both the key and value of the unit.
     * This method will turn that array into a HashMap as that is the format UnitOf.Anything uses behind the scenes.
     */
    public static final HashMap<Object,Double> ah(double[] d){
        HashMap<Object,Double> hm = new HashMap();
        if(d == null){
            return hm;
        }
        for(int i = 0; i < d.length; i++){
            hm.put(d[i], d[i]);
        }
        return hm;
    }
}
