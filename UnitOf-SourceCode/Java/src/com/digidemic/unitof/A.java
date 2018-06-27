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
 * Instantiated variables from new UnitOf instance (Only used in class B).
 */
public final class A<Type> implements Serializable{
    public final Object o;      //Only used in DataType and NumericBase measurements (classes), user passed "from" value (Object). When this is the case, variable "v" is not used.
    public final double v;      //User passed "from" value (double). When this is the case, variable "o" is not used.
    public final Type t;        //Enum constant value representing the "from" method of the measurement used.
    protected final String ts;  //String value of enum constant representing the "from" method of the measurement used.
    protected final boolean d;  //Used in class B.java "getValuePassed()". True if "from" value was a double, false for Object (Object only used in DataType and NumericBase measurements (classes)).
      
    /**
     * Empty constructor only called when instantiating from class B.java
     */
    public A(){
        o = "";
        v = -1;
        t = null;
        ts = "";
        d = true;
    }
 
    /**
     * Only used in class B.java when measurement "from" method only converts numbers.
     * All measurements other than DataType and NumericBase use this constructor.
     * @param w User passed "from" value (double).
     * @param s Enum constant value representing the "from" method of the measurement used.
     * @param z String value of enum constant representing the "from" method of the measurement used.
     */
    public A(double w, Type s, String z){
        o = "";     //This variable (Object value) will not be used when this constructor is called, default it to an empty string.
        v = w;
        t = s;
        ts = z;
        d = true;   //Variable d set to true as "from" value passed is a numeric type not an Object.
    }
    
    /**
     * Only used in class B.java when measurement "from" method can convert more than numbers and an Object is passed as the value.
     * Only measurements DataType and NumericBase use this constructor.
     * @param w User passed "from" value (Object).
     * @param s Enum constant value representing the "from" method of the measurement used.
     * @param z String value of enum constant representing the "from" method of the measurement used.
     */
    public A(Object w, Type s, String z){
        o = w;
        v = -1;     //This variable (double value) will not be used when this constructor is called, default it to -1
        t = s;
        ts = z;
        d = false;  //Variable d set to false as "from" value passed is an Object not double.
    }
}