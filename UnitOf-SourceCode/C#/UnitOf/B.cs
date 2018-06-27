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
/// Generic base class for most UnitOf measurement classes
/// </summary>
[Serializable]
public class B<P> {
    protected A<P> me = new A<P>(); //Instantiate class A.cs for variables needed to perform conversions.

    /// <summary>
    /// Returns value initially passed into the measurement's "From" method.
    /// </summary>
    public object GetValuePassed(){    
        return (me.d) ? me.v : me.o;
    }
    
    /// <summary>
    /// Returns the struct readonly constant value representing the "From" method of the measurement used.
    /// </summary>
    public string GetTypeConstantPassed(){
        return me.ts;
    }

    /// <summary>
    /// Stores the needed values to do conversions of the measurement.
    /// This overload of the method is used in "From" methods in every measurement class other than Anything() and DataType().
    /// </summary>
    /// <typeparam name="T">Class context of measurement passed (usually "this" is passed from caller).</typeparam>
    /// <param name="t">Class context of measurement passed (usually "this" is passed from caller).</param>
    /// <param name="v">User passed "From" value (double).</param>
    /// <param name="tt">Struct readonly constant value representing the "From" method of the measurement used.</param>
    /// <param name="ty">String value of the struct readonly constant value representing the "From" method of the measurement used.</param>
    /// <returns>class context passed in so variable like "UnitOf.Length len" can be used as the variable type</returns>
    protected T s<T>(T t, double v, double tt, string ty){
        me = new A<P>(v, tt, ty);
        return t;
    }

    /// <summary>
    /// Stores the needed values to do conversions of the measurement.
    /// This overload of the method is used only in DataType as Objects can be passed as "From" values.
    /// </summary>
    /// <typeparam name="T">Class context of measurement passed (usually "this" is passed from caller).</typeparam>
    /// <param name="t">Class context of measurement passed (usually "this" is passed from caller).</param>
    /// <param name="v">User passed "From" value (object).</param>
    /// <param name="ty">Struct readonly constant value representing the "From" method of the measurement used.</param>
    /// <returns>class context passed in so variable like "UnitOf.DataType dt" can be used as the variable type</returns>
    protected T s<T>(T t, object v, string ty) {
        me = new A<P>(v, ty);
        return t;
    }

    /// <summary>
    /// Used by every measurement class that converts just numbers (Anything() and DataType() do not apply here).
    /// Method performs the full conversion of taking the user defined "From" value and converting it into the user desired "To" value.
    /// </summary>
    /// <param name="a">Struct readonly constant value of "To" unit. Unit being converted into conversion constant value.</param>
    /// <param name="b">Struct readonly constant value of "From" unit. Unit starting from conversion constant value.</param>
    /// <returns></returns>
    protected double k(double a, double b){
        return k(a,b,true);
    }

    /// <summary>
    /// Used by every measurement class that converts just numbers (Anything() and DataType() do not apply here).
    /// Method performs the full conversion of taking the user defined "From" value and converting it into the user desired "To" value.
    /// </summary>
    /// <param name="a">Struct readonly constant value of "To" unit. Unit being converted into conversion constant value.</param>
    /// <param name="b">Struct readonly constant value of "From" unit. Unit starting from conversion constant value.</param>
    /// <param name="q">Multiply then divide conversion algorithm, false will divide then multiply when converting "To"</param>
    /// <returns>Finished conversion. "from" converted into "to" value.</returns>
    protected double k(double a, double b, bool q){
        return U.I(U.I(me.v, a, q), b, !q);
    }
}