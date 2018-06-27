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
/// 
/// DataType Conversions - Convert any C# data type and more including converting to and from fractions
/// 
/// Ex 1: double foo1 = new UnitOf.DataType("-12.5").ToDouble();     //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .ToDouble() default value of 0.0d is returned.
/// Ex 2: String foo2 = new UnitOf.DataType(12.5).ToFraction("3/2"); //Returns "25/2" from 12.5 (double). If the conversion did fail, the .ToFraction() passed default value of "3/2" is returned.
/// Ex 3: double bar1 = new UnitOf.DataType("5/2").ToDouble();       //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .ToDouble() default value of 0.0d is returned.
/// Ex 4: int bar2 = new UnitOf.DataType(null).ToInt(7);             //Conversion fails, returns 7 as it is the default passed in.
/// 
/// Default Values:
/// -=-=-=-=-=-=-
/// When a conversion in DataType fails its default, whether it be passed by the writer or if not uses UnitOf's defaults, is returned to the called.
/// UnitOf defaults (when no parameter is passed) for each method are as follows:
/// toObject(): null
/// toString(): ""
/// toBoolean(): false
/// toChar(): '\0'
/// toByte(): 0
/// toSbyte(): 0
/// toShort(): 0
/// toUint(): 0
/// toUlong: 0
/// toUshort: 0
/// toInt(): 0
/// toLong(): 0L
/// toFloat(): 0.0F
/// toDecimal(): 0.0M
/// toDouble(): 0.0D
/// toDateTime(): new DateTime()
/// toTimeSpan(): new TimeSpan()
/// toFraction(): ""
/// 
/// NOTE: all methods of ToByte, ToInt, ToLong, ToFloat, ToDouble, ToSbyte, ToShort, ToUint, ToUlong, and ToUshort all will attempt to parse the passed value as fraction through toFraction() automatically if failure occurs.
/// This is to account for fractions originally passed in as String to be converted it a number type value equivalent. 
/// 
/// </summary>
[Serializable]
public class I : B<UnitOf.DataType>{
    
    /// <summary>
    /// Quick access to return a numeric data type converison without having to reconvert if already completed once.
    /// All numeric data type conversions use the ToDouble method so this applys to byte, short, int, long, float, double, sbyte, ulong, ushort
    /// </summary>
    private bool da = false;//ToDouble called once: if ToDouble has already been called once. If true this means a conversion was already once attempted and may not need To be done again (since a good cache instance may already exist)
    private bool db = false;//ToDouble converted successfully: was the last conversion into ToDouble successful (true) or was the default value returned (false).
    private double dc = 0;//ToDouble's successful converted value saved: the successful parsed value in this local variable To quickly be returned To the user calling ToDouble again it does not need To perform the parsings again.

    /// <summary>
    /// Quick access to return a String converison without having to reconvert if already completed once.
    /// </summary>
    private bool sa = false;//ToString called once: if ToString has already been called once. If true this means a conversion was already once attempted and may not need To be done again (since a good cache instance may already exist)
    private bool sb = false;//ToString converted successfully: was the last conversion into ToString successful (true) or was the default value returned (false).
    private string sc = "";//ToString's successful converted value saved: the successful parsed value in this local variable To quickly be returned To the user calling ToString again it does not need To perform the parsings again.
    
    /// <summary>
    /// "To" Object
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into an Object type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: Object foo = new UnitOf.DataType("12.5").ToObject(1.23);    //Returns "12.5" from "12.5" (String). If the conversion did fail, the .ToObject() passed default value of 1.23 is returned.
    /// </summary>
    public object ToObject(){return ToObject(null);}
    public object ToObject(object d){
        try{
            return me.o;
        }
        catch (Exception e){}
        return d;
    }

    /// <summary>
    /// "To" String
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a String type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: String foo = new UnitOf.DataType(12.5).ToString("Conversion Failed");   //Returns "12.5" from 12.5 (double). If the conversion did fail, the .ToString() passed default value of "Conversion Failed" is returned.
    /// </summary>
    public override string ToString(){return ToString("");}
    public string ToString(string d) {
        if (sa){
            return sb ? sc : d;
        }
        sa = true;
        try{
            sc = me.o.ToString();
            sb = true;
            return sc;
        }
        catch (Exception e) { }
        return d;
    }

    /// <summary>
    /// "To" Char
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a char type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: char foo = new UnitOf.DataType(12.5).ToChar('@');   //Returns '1' from 12.5 (double). If the conversion did fail, the .ToChar() passed default value of '@' is returned.
    /// </summary>
    public char ToChar(){return ToChar('\0');}
    public char ToChar(char d){
        try{
            return ToString(null).Trim()[0];
        }
        catch (Exception e){}
        return d;
    }

    /// <summary>
    /// "To" Float
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a float type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: double foo = new UnitOf.DataType("12.5").ToFloat(7.0f);   //Returns 12.5 from 12.5 (String). If the conversion did fail, the .ToFloat() passed default value of 7.0f is returned.
    /// </summary>
    public float ToFloat(){return ToFloat(0.0F);}
    public float ToFloat(float d){
        return (float)ToDouble(d);
    }

    /// <summary>
    /// "To" Int
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into an int type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: int foo = new UnitOf.DataType(12.5).ToInt(7);  //Returns 12 from 12.5 (double). If the conversion did fail, the .ToInt() passed default value of 7.0 is returned.
    /// </summary>
    public int ToInt(){return ToInt(0);}
    public int ToInt(int d){
        return (int)ToDouble(d);
    }

    /// <summary>
    /// "To" Long
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a long type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: long foo = new UnitOf.DataType(12.5).ToLong(7); //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToLong() passed default value of 7 is returned.
    /// </summary>
    public long ToLong(){return ToLong(0L);}
    public long ToLong(long d){
        return (long)ToDouble(d);
    }

    /// <summary>
    /// "To" Byte
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a byte type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: byte foo = new UnitOf.DataType(12.5).ToByte((byte)7);   //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToByte() passed default value of 7 is returned.
    /// </summary>
    public byte ToByte(){return ToByte(0);}
    public byte ToByte(byte d){
        return (byte)ToDouble(d);
    }

    /// <summary>
    /// "To" Sbyte
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a sbyte type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: sbyte foo = new UnitOf.DataType(12.5).ToSbyte((sbyte)7);   //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToSbyte() passed default value of 7 is returned.
    /// </summary>
    public sbyte ToSbyte(){return ToSbyte(0);}
    public sbyte ToSbyte(sbyte d){
        return (sbyte)ToDouble(d);
    }

    /// <summary>
    /// "To" Short
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a short type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: short foo = new UnitOf.DataType(12.5).ToShort((short)7);    //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToShort() passed default value of 7 is returned.
    /// </summary>
    public short ToShort(){return ToShort(0);}
    public short ToShort(short d){
        return (short)ToDouble(d);
    }

    /// <summary>
    /// "To" Uint
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a Uint type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: uint foo = new UnitOf.DataType(12.5).ToUint((uint)7);    //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToUint() passed default value of 7 is returned.
    /// </summary>
    public uint ToUint(){return ToUint(0);}
    public uint ToUint(uint d){
        return (uint)ToDouble(d);
    }

    /// <summary>
    /// "To" Ulong
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a Ulong type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: ulong foo = new UnitOf.DataType(12.5).ToUlong((ulong)7);    //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToUlong() passed default value of 7 is returned.
    /// </summary>
    public ulong ToUlong(){return ToUlong(0);}
    public ulong ToUlong(ulong d){
        return (ulong)ToDouble(d);
    }

    /// <summary>
    /// "To" Ushort
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a Ushort type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: ushort foo = new UnitOf.DataType(12.5).ToUshort((ushort)7);    //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToUshort() passed default value of 7 is returned.
    /// </summary>
    public ushort ToUshort(){return ToUshort(0);}
    public ushort ToUshort(ushort d){
        return (ushort)ToDouble(d);
    }

    /// <summary>
    /// "To" Decimal
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a decimal type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: decimal foo = new UnitOf.DataType(12.5).ToDecimal((decimal)7);    //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToDecimal() passed default value of 7 is returned.
    /// </summary>
    public decimal ToDecimal(){return ToDecimal(0.0M);}
    public decimal ToDecimal(decimal d){
        try{
            return decimal.Parse(ToString(null));
        }
        catch (Exception e){}
        return d;
    }

    /// <summary>
    /// "To" Double
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a double type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex 1 basic usage: double foo = new UnitOf.DataType(12.5).ToDouble(7.0);   //Returns 12.5 from 12.5 (double). If the conversion did fail, the .ToDouble() passed default value of 7.0 is returned.
    /// Ex 2 fraction String to decimal: double bar = new UnitOf.DataType("5/2").ToDouble(50);    //Returns 2.5 from "5/2" (String fraction). If the conversion did fail, the .Todouble() default value of 50 is returned.
    /// </summary>
    public double ToDouble(){return ToDouble(0.0D);}
    public double ToDouble(double d){
        if (da){
            return db ? dc : d;
        }
        da = true;
        try{
            dc = double.Parse(ToString());
            db = true;
            return dc;
        }
        catch (Exception e){
            try{//If fraction convert it into double
                if (ToString(null).Split('/').Length == 2){
                    string v = ToString(null).Replace("(", " ").Replace(")", " ");
                    string[] f = v.Split('/');
                    double n = 1, q = double.Parse(f[1]);
                    f[0] = f[0].Replace("*", " ");
                    string[] x = f[0].Trim().Split(' ');
                    for (int i = 0; i < x.Length; i++){
                        if (x[i].Length != 0){
                            n = n * double.Parse(x[i]);
                        }
                    }
                    dc = n / q;
                    db = true;
                    return dc;
                }
            }
            catch (Exception x) { }
        }
        return d;
    }

    /// <summary>
    /// "To" Boolean (Simple)
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a boolean type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: bool foo = new UnitOf.DataType("TrUe").ToBoolean();  //Returns true from "TrUe" (String). If the conversion did fail, the .ToBoolean() default value of false is returned.
    /// </summary>
    public bool ToBoolean(){return ToBoolean(false);}
    public bool ToBoolean(bool d){
        try{
            string s = ToString(null).Trim().ToLower();
            if (s.Equals("true")){
                return true;
            }
            else if (s.Equals("false")){
                return false;
            }
        }
        catch (Exception e){}
        return d;
    }

    /// <summary>
    /// "To" Boolean (Complex) 
    /// Use a collection of values to determine if the UnitOf.DataType variable exists within the collection.
    /// 
    /// Ex 1: bool foo1 = new UnitOf.DataType("UnitOf").ToBoolean(new string[]{"Unit", "unitof", "ThisIsUnitOf"},true, true);    //Returns true due to "Unit"
    /// Ex 2: bool bar1 = new UnitOf.DataType("UnitOf").ToBoolean(new string[]{"Unit", "unitof", "ThisIsUnitOf"},false, true);   //Returns true: "Unit", "unitof"
    /// Ex 3: bool foo2 = new UnitOf.DataType("UnitOf").ToBoolean(new string[]{"Unit", "unitof", "ThisIsUnitOf"});   //Returns true. only "unitof"
    /// Ex 4: bool bar2 = new UnitOf.DataType("UnitOf").ToBoolean(new string[]{"Unit", "unitof", "ThisIsUnitOf"},true);  //Returns false, no matches
    /// </summary>
    public bool ToBoolean(object[] trueValues) { return ToBoolean(trueValues, false, false); }
    public bool ToBoolean(object[] trueValues, bool caseSensitive) { return ToBoolean(trueValues, caseSensitive, false); }
    public bool ToBoolean(object[] trueValues, bool caseSensitive, bool contains){
        try{
            string s = ToString(null).Trim();
            s = caseSensitive ? s : s.ToLower();
            foreach (object o in trueValues){
                string v = (caseSensitive) ? o.ToString().Trim() : o.ToString().Trim().ToLower();
                if (contains && (s.Contains(v)) || (!contains && s.Equals(v))){
                    return true;
                }
            }
        }
        catch (Exception e) { }
        return false;
    }

    /// <summary>
    /// "To" DateTime
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a DateType type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: DateTime foo = new UnitOf.DataType(12.5).ToDateTime(DateTime.Now);  //Returns 12/5/2018 12:00:00 AM for U.S. from 12.5 (double). If the conversion did fail the system's current date and time would be returned since that is the passed default paramter
    /// </summary>
    public DateTime ToDateTime(){return ToDateTime(new DateTime());}
    public DateTime ToDateTime(DateTime d){
        try{
            return DateTime.Parse(ToString(null));
        }
        catch (Exception e){}
        return d;
    }

    /// <summary>
    /// "To" TimeSpan
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a TimeSpan type.
    /// If this conversion fails the default value (which may be passed in as a parameter) is returned.
    /// 
    /// Ex: TimeSpan foo = new UnitOf.DataType(12.5).ToTimeSpan(TimeSpan.FromMinutes(2));   //Returns 00:02:00 from 12.5 (double) since the conversion failed and 2 minutes was passed in as default
    /// </summary>
    public TimeSpan ToTimeSpan(){return ToTimeSpan(new TimeSpan());}
    public TimeSpan ToTimeSpan(TimeSpan d){
        try{
            return TimeSpan.Parse(ToString(null));
        }
        catch (Exception e){}
        return d;
    }

    /// <summary>
    /// "To" Fraction
    /// Tries to convert the value passed in the UnitOf.DataType() constructor into a fraction of type String.
    /// This simplifies existing fraction Strings or turn numeric values into fraction Strings.
    /// 
    /// Ex 1: String foo = new UnitOf.DataType("2/4").ToFraction(); //returns "1/2" 
    /// Ex 2: String bar = new UnitOf.DataType(.75).ToFraction();   //returns "3/4"
    /// 
    /// Inspired by user Matthew556 post: https://stackoverflow.com/questions/31585931/how-To-convert-decimal-To-fractions
    /// Who credits: http://jonisalonen.com/2012/converting-decimal-numbers-To-ratios/
    /// </summary>
    public string ToFraction(){return ToFraction("");}
    public string ToFraction(string d){
        double o = ToDouble();
        if(o != 0){//if 0, a valid number value was not passed in so return the default
            try{
                bool N = o < 0;
                double V = o * (N ? -1 : 1);
                double max = 1e-10, n1 = 1, n2 = 0, d1 = 0, d2 = 1, b = V;
                do {
                    double a = Math.Floor(b);
                    double c = n1; 
                    n1 = a * n1 + n2; 
                    n2 = c;
                    c = d1;
                    d1 = a * d1 + d2; 
                    d2 = c;
                    b = 1 / (b - a);
                } while (Math.Abs(V - n1 / d1) > V * max);
                return (N ? "-" : "") + n1 + "/" + d1;
            } catch(Exception e){}
        }
        return d;
    }
}