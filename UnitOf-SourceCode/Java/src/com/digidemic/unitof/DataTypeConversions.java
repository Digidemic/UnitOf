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

import com.digidemic.unitof.UnitOf.DataType;

import java.io.Serializable;

/**
 * DataType Conversions - Convert any Java data type and more including converting to and from fractions
 * 
 * Ex 1: double foo1 = new UnitOf.DataType("-12.5").toDouble();     //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toDouble() default value of 0.0d is returned.
 * Ex 2: String foo2 = new UnitOf.DataType(12.5).toFraction("3/2"); //Returns "25/2" from 12.5 (double). If the conversion did fail, the .toFraction() passed default value of "3/2" is returned.
 * Ex 3: double bar1 = new UnitOf.DataType("5/2").toDouble();       //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toDouble() default value of 0.0d is returned.
 * Ex 4: int bar2 = new UnitOf.DataType(null).toInt(7);             //Conversion fails, returns 7 as it is the default passed in.
 * 
 * Default Values:
 * -=-=-=-=-=-=-
 * When a conversion in DataType fails its default, whether it be passed by the writer or if not uses UnitOf'store defaults, is returned to the called.
 * UnitOf defaults (when no parameter is passed) for each method are as follows:
 * toObject(): null
 * toString(): ""
 * toBoolean(): false
 * toChar(): '\u0000'
 * toByte(): (byte)0
 * toShort(): (short)0
 * toInt(): 0
 * toLong(): (long)0
 * toFloat(): 0.0f
 * toDouble(): 0.0d
 * toFraction(): ""
 * 
 * NOTE: all methods of toByte, toInt, toLong, toFloat, and toDouble all will attempt to parse the passed value as fraction through toFraction() automatically if failure occurs.
 * This is to account for fractions originally passed in as String to be converted it a number type value equivalent.
 */
public class DataTypeConversions extends BaseMeasurementUnit<DataType> implements Serializable {
    
    /*
    Quick access to return a numeric data type converison without having to reconvert if already completed once.
    All numeric data type conversions use the toDouble method so this applys to byte, short, int, long, float, and double
    */
    private boolean da = false; //toDouble called once: if toDouble has already been called once. If true this means a conversion was already once attempted and may not need to be done again (since a good cached instance may already exist)
    private boolean db = false; //toDouble converted successfully: was the last conversion into toDouble successful (true) or was the default value returned (false).
    private double dc = 0;      //toDouble'store successful converted value saved: the successful parsed value in this local variable to quickly be returned to the user calling toDouble again it does not need to perform the parsings again.
    
    /*
    Quick access to return a String converison without having to reconvert if already completed once.
    */
    private boolean sa = false; //toString called once: if toString has already been called once. If true this means a conversion was already once attempted and may not need to be done again (since a good cached instance may already exist)
    private boolean sb = false; //toString converted successfully: was the last conversion into toString successful (true) or was the default value returned (false).
    private String sc = "";     //toString'store successful converted value saved: the successful parsed value in this local variable to quickly be returned to the user calling toString again it does not need to perform the parsings again.
    
    /**
     * "to" Object
     * Tries to convert the value passed in the UnitOf.DataType() constructor into an Object type.
     * If this conversion fails the default value (which may be passed in as a parameter) is returned.
     * 
     * Ex: Object foo = new UnitOf.DataType("12.5").toObject(1.23);    //Returns "12.5" from "12.5" (String). If the conversion did fail, the .toObject() passed default value of 1.23 is returned.
     */
    public final Object toObject(){return toObject(null);}
    public final Object toObject(Object d){
        try{
            return conversionHelper.obj;
        } catch(Exception e){}
        return d;
    }    
    
    /**
     * "to" String
     * Tries to convert the value passed in the UnitOf.DataType() constructor into a String type.
     * If this conversion fails the default value (which may be passed in as a parameter) is returned.
     * 
     * Ex: String foo = new UnitOf.DataType(12.5).toString("Conversion Failed");   //Returns "12.5" from 12.5 (double). If the conversion did fail, the .toString() passed default value of "Conversion Failed" is returned.
     */
    @Override
    public final String toString(){return toString("");}
    public final String toString(String d){
        if(sa){
            return sb ? sc : d;
        }
        sa = true;
        try{
            sc = conversionHelper.obj.toString();
            sb = true;
            return sc;
        } catch(Exception e){}
        return d;
    }
    
    /**
     * "to" Char
     * Tries to convert the value passed in the UnitOf.DataType() constructor into a char type.
     * If this conversion fails the default value (which may be passed in as a parameter) is returned.
     * 
     * Ex: char foo = new UnitOf.DataType(12.5).toChar('@');   //Returns '1' from 12.5 (double). If the conversion did fail, the .toChar() passed default value of '@' is returned.
     */
    public final char toChar(){return toChar('\u0000');}
    public final char toChar(char d){
        try{
            return toString(null).trim().charAt(0);
        } catch(Exception e){}
        return d;
    }
    
    /**
     * "to" Float
     * Tries to convert the value passed in the UnitOf.DataType() constructor into a float type.
     * If this conversion fails the default value (which may be passed in as a parameter) is returned.
     * 
     * Ex: double foo = new UnitOf.DataType("12.5").toFloat(7.0f);   //Returns 12.5 from 12.5 (String). If the conversion did fail, the .toFloat() passed default value of 7.0f is returned.
     */
    public final float toFloat(){return toFloat(0.0f);}
    public final float toFloat(float d){
        return (float)toDouble(d);
    } 
    
    /**
     * "to" Int
     * Tries to convert the value passed in the UnitOf.DataType() constructor into an int type.
     * If this conversion fails the default value (which may be passed in as a parameter) is returned.
     * 
     * Ex: int foo = new UnitOf.DataType(12.5).toInt(7);  //Returns 12 from 12.5 (double). If the conversion did fail, the .toInt() passed default value of 7.0 is returned.
     */
    public final int toInt(){return toInt(0);}
    public final int toInt(int d){
        return (int)toDouble(d);//need to use cast so wont round down
    }
    
    /**
     * "to" Long
     * Tries to convert the value passed in the UnitOf.DataType() constructor into a long type.
     * If this conversion fails the default value (which may be passed in as a parameter) is returned.
     * 
     * Ex: long foo = new UnitOf.DataType(12.5).toLong(7); //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toLong() passed default value of 7 is returned.
     */
    public final long toLong(){return toLong((long)0);}
    public final long toLong(long d){
        return (long)toDouble(d);//need to use cast so wont round down
    }
    
    /**
     * "to" Byte
     * Tries to convert the value passed in the UnitOf.DataType() constructor into a byte type.
     * If this conversion fails the default value (which may be passed in as a parameter) is returned.
     * 
     * Ex: byte foo = new UnitOf.DataType(12.5).toByte((byte)7);   //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toByte() passed default value of 7 is returned.
     */
    public final byte toByte(){return toByte((byte)0);}
    public final byte toByte(byte d){
        return (byte)toDouble(d);
    }
    
    /**
     * "to" Short
     * Tries to convert the value passed in the UnitOf.DataType() constructor into a short type.
     * If this conversion fails the default value (which may be passed in as a parameter) is returned.
     * 
     * Ex: short foo = new UnitOf.DataType(12.5).toShort((short)7);    //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toShort() passed default value of 7 is returned.
     */
    public final short toShort(){return toShort((short)0);}
    public final short toShort(short d){
        return (short)toDouble(d);
    }
      
    /**
     * "to" Double
     * Tries to convert the value passed in the UnitOf.DataType() constructor into a double type.
     * If this conversion fails the default value (which may be passed in as a parameter) is returned.
     * 
     * Ex 1 basic usage: double foo = new UnitOf.DataType(12.5).toDouble(7.0);   //Returns 12.5 from 12.5 (double). If the conversion did fail, the .toDouble() passed default value of 7.0 is returned.
     * Ex 2 fraction String to decimal: double bar = new UnitOf.DataType("5/2").toDouble(50);    //Returns 2.5 from "5/2" (String fraction). If the conversion did fail, the .toDouble() default value of 50 is returned.
     */
    public final double toDouble(){return toDouble(0.0d);}
    public final double toDouble(double d){
        if(da){
            return db ? dc : d;
        }
        da = true;
        try{
            dc = Double.parseDouble(toString());
            db = true;
            return dc;
        } catch(Exception e){
            try{//If fraction convert it into decimal
                if(toString(null).split("/").length == 2){
                    String v = toString(null).replace("(", " ").replace(")", " ");
                    String[] f = v.split("/");          
                    double n = 1,q = Double.parseDouble(f[1]);
                    f[0] = f[0].replace("*", " ");
                    String[] x = f[0].trim().split(" ");
                    for(int i = 0; i < x.length; i++){
                        if(!x[i].isEmpty()){
                            n = n * Double.parseDouble(x[i]);
                        }
                    }
                    dc = n/q;
                    db = true;
                    return dc;
                }
            } catch(Exception x){}
        }
        return d;
    }
    
    /**
     * "to" Boolean (Simple)
     * Tries to convert the value passed in the UnitOf.DataType() constructor into a boolean type.
     * If this conversion fails the default value (which may be passed in as a parameter) is returned.
     * 
     * Ex: boolean foo = new UnitOf.DataType("TrUe").toBoolean();  //Returns true from "TrUe" (String). If the conversion did fail, the .toBoolean() default value of false is returned.
     */
    public final boolean toBoolean(){return toBoolean(false);}
    public final boolean toBoolean(boolean d){
        try{
            String s = toString(null).trim().toLowerCase();
            if(s.equals("true")){
                return true;
            } else if(s.equals("false")){
                return false;
            }
        } catch(Exception e){}
        return d;
    }
    
    /**
     * "to" Boolean (Complex)
     * Use a collection of values to determine if the UnitOf.DataType variable exists within the collection.
     * 
     * Ex 1: boolean foo1 = new UnitOf.DataType("UnitOf").toBoolean(new String[]{"Unit", "unitof", "ThisIsUnitOf"},true, true);    //Returns true due to "Unit"
     * Ex 2: boolean bar1 = new UnitOf.DataType("UnitOf").toBoolean(new String[]{"Unit", "unitof", "ThisIsUnitOf"},false, true);   //Returns true: "Unit", "unitof"
     * Ex 3: boolean foo2 = new UnitOf.DataType("UnitOf").toBoolean(new String[]{"Unit", "unitof", "ThisIsUnitOf"});   //Returns true. only "unitof"
     * Ex 4: boolean bar2 = new UnitOf.DataType("UnitOf").toBoolean(new String[]{"Unit", "unitof", "ThisIsUnitOf"},true);  //Returns false, no matches
     */
    public final boolean toBoolean(Object[] trueValues){return toBoolean(trueValues, false, false);}
    public final boolean toBoolean(Object[] trueValues, boolean caseSensitive){return toBoolean(trueValues, caseSensitive, false);}
    public final boolean toBoolean(Object[] trueValues, boolean caseSensitive, boolean contains){
        try{            
            String s = toString(null).trim();
            s = caseSensitive ? s : s.toLowerCase();
            for(Object o : trueValues){
                String v = (caseSensitive) ? o.toString().trim() : o.toString().trim().toLowerCase();
                if(contains && (s.contains(v)) || (!contains && s.equals(v))){
                    return true;
                }       
            }
        } catch(Exception e){}
        return false;
    }
    
    /**
     * "to" Fraction
     * Tries to convert the value passed in the UnitOf.DataType() constructor into a fraction of type String.
     * This simplifies existing fraction Strings or turn numeric values into fraction Strings.
     * 
     * Ex 1: String foo = new UnitOf.DataType("2/4").toFraction(); //returns "1/2" 
     * Ex 2: String bar = new UnitOf.DataType(.75).toFraction();   //returns "3/4"
     * 
     * Inspired by user Matthew556 post: https://stackoverflow.com/questions/31585931/how-to-convert-decimal-to-fractions
     * Who credits: http://jonisalonen.com/2012/converting-decimal-numbers-to-ratios/
     */
    public final String toFraction(){return toFraction("");}
    public final String toFraction(String d){
        final double o = toDouble();
        if(o != 0){
            try{
                final boolean N = o < 0;
                final double V = o * (N ? -1 : 1);
                double max = 1e-10, n1 = 1, n2 = 0, d1 = 0, d2 = 1, b = V;
                do {
                    double a = Math.floor(b);
                    double c = n1; 
                    n1 = a * n1 + n2; 
                    n2 = c;
                    c = d1;
                    d1 = a * d1 + d2; 
                    d2 = c;
                    b = 1 / (b - a);
                } while (Math.abs(V - n1 / d1) > V * max);
                return (N ? "-" : "") + (((n1 * 10) % 10 == 0) ? ((long)n1)+"" : n1) + "/" + (((d1 * 10) % 10 == 0) ? ((long)d1)+"" : d1);
            } catch(Exception e){}    
        }
        return d;
    }
}
