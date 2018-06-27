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

/**
 * Generic base class for most UnitOf measurement classes.
 */
public class B<P> implements Serializable{
    protected A<P> me = new A();    //Instantiate class A.java for variables needed to perform conversions.
    
    /**
     * Returns value initially passed into the measurement's "from" method.
     */
    public final Object getValuePassed(){            
        return (me.d) ? me.v : me.o;    //true returns numeric value passed, false returns Object passed.
    }
    
    /**
     * Returns the enum constant value representing the "from" method of the measurement used.
     */
    public final String getTypeConstantPassed(){
        return me.ts;
    }
       
    /**
     * Stores the needed values to do conversions of the measurement.
     * This overload of the method is used in "from" methods in every measurement class other than Anything(), DataType(), and NumericBase().
     * 
     * @param <T> Class context of measurement passed (usually "this" is passed from caller).
     * @param <TT> Enum constant value representing the "from" method of the measurement used.
     * @param t Class context of measurement passed (usually "this" is passed from caller).
     * @param v User passed "from" value (double).
     * @param tt Enum constant value representing the "from" method of the measurement used.
     * @return class context passed in so variable like "UnitOf.Length len" can be used as the variable type
     */
    protected final <T,TT> T s(T t, double v, TT tt){
        me = new A(v, tt, st(tt));
        return t;
    }
     
    /**
     * Stores the needed values to do conversions of the measurement.
     * This overload of the method is used only in DataType and NumericBase as Objects can be passed as "from" values.
     * 
     * @param <T> Class context of measurement passed (usually "this" is passed from caller).
     * @param <TT> Enum constant value representing the "from" method of the measurement used.
     * @param t Class context of measurement passed (usually "this" is passed from caller).
     * @param v User passed "from" value (Object).
     * @param tt Enum constant value representing the "from" method of the measurement used.
     * @return class context passed in so variable like "UnitOf.DataType dt" can be used as the variable type
     */
    protected final <T,TT> T s(T t, Object v, TT tt){
        me = new A(v, tt, st(tt));
        return t;
    }
    
    /**
     * Gets and returns the string value of constant representing the "from" method of the measurement used.
     */
    private final <TT> String st(TT tt){
        try{
            return tt.toString();
        } catch(Exception e){}
        return "";
    }
    
    /**
     * Used by every measurement class that converts just numbers (Anything(), DataType(), NumericBase() do not apply here).
     * Method performs the full conversion of taking the user defined "from" value and converting it into the user desired "to" value.
     * @param a Enum constant value of "to" unit. Unit being converted into conversion constant value.
     * @param b Enum constant value of "from" unit. Unit starting from conversion constant value.
     * @return Finished conversion. "From" converted into "to" value.
     */
    protected final double k(double a, double b){
        return k(a,b,true);
    }
    
     /**
     * Used by every measurement class that converts just numbers (Anything(), DataType(), NumericBase() do not apply here)
     * Method performs the full conversion of taking the user defined "from" value and converting it into the user desired "to" value.
     * @param a Enum constant value of "to" unit. Unit being converted into conversion constant value.
     * @param b Enum constant value of "from" unit. Unit starting from conversion constant value.
     * @param q Multiply then divide conversion algorithm, false will divide then multiply when converting "to"
     * @return Finished conversion. "from" converted into "to" value.
     */
    protected final double k(double a, double b, boolean q){
        return U.i(U.i(me.v, a, q), b, !q);
    }
}
