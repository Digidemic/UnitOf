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


/// <summary>
/// Instantiated variables from new UnitOf instance (Only used in class B).
/// </summary>
/// <typeparam name="Type"></typeparam>
[Serializable]
public class A<Type>{
    internal readonly object o; //Only used in DataType measurement (class), user passed "From" value (Object). When this is the case, variable "v" is not used.
    internal readonly double v; //User passed "From" value (double). When this is the case, variable "o" is not used.
    internal readonly double t; //Struct readonly constant value representing the "From" method of the measurement used.
    internal readonly string ts;//String value of struct readonly constant representing the "From" method of the measurement used.
    internal readonly bool d;   //Used in class B.cs "GetValuePassed()". True if "From" value was a double, false for Object (Object only used in DataType measurement (class)).

    /// <summary>
    /// Empty constructor only called when instantiating from class B.cs
    /// </summary>
    internal A() {
        o = "";
        v = -1;
        t = -1;
        ts = "";
        d = true;
    }

    /// <summary>
    /// Only used in class B.cs when measurement "From" method only converts numbers.
    /// All measurements other than DataType use this constructor.
    /// </summary>
    /// <param name="w">User passed "From" value (double).</param>
    /// <param name="s">Struct readonly constant value representing the "From" method of the measurement used.</param>
    /// <param name="z">String value of struct readonly constant representing the "From" method of the measurement used.</param>
    internal A(double w, double s, string z){
        o = "";     //This variable (Object value) will not be used when this constructor is called, default it to an empty string.
        v = w;
        t = s;
        ts = z;
        d = true;   //Variable d set to true as "From" value passed is a numeric type not an Object.
    }

    /// <summary>
    /// Only used in class B.cs when measurement "From" method can convert more than numbers and an Object is passed as the value.
    /// Only measurement DataType use this constructor.
    /// </summary>
    /// <param name="w">User passed "From" value (Object).</param>
    /// <param name="z">String value of struct readonly constant representing the "From" method of the measurement used.</param>
    internal A(object w, string z){
        o = w;
        v = -1;     //This variable (double value) will not be used when this constructor is called, default it to -1
        t = -1;
        ts = z;
        d = false;  //Variable d set to false as "From" value passed is an Object not double.
    }
}