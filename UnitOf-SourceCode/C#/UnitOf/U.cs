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
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Collections.Generic;

/// <summary>
/// Shared static methods
/// </summary>
[Serializable]
public class U {
    
    /// <summary>
    /// All conversions use the following method to multiply or divide depending on how the measurement's units are defined (See struct readonly constants).
    /// </summary>
    public static double I(double n, double d, bool mult){
        return (mult) ? n * d : n / d;
    }

    /// <summary>
    /// Array of doubles to Dictionary<object,double>
    /// Several UnitOf.Anything constructors accept an array of values to be passed serving as both the key and value of the unit.
    /// This method will turn that array into a Dictionary as that is the format UnitOf.Anything uses behind the scenes.
    /// </summary>
    public static Dictionary<object,double> Ad(double[] d){
        Dictionary<object, double> hm = new Dictionary<object, double>();
        if(d == null){
            return hm;
        }
        for(int i = 0; i < d.Length; i++){
            if (!hm.ContainsKey(d[i])){
                hm.Add(d[i], d[i]);
            }else{
                hm[d[i]] = d[i];
            }
        }
        return hm;
    }
}