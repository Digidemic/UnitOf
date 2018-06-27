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

/**
 * https://github.com/Digidemic/UnitOf for Code, Documentation, Examples, Feature List, Diagrams, FAQ and more.
 * 
 * UnitOf is also available in Java and JavaScript.
 * 
 * 
 * Measurements Available:
 * -=-=-=-=-=-=-
 * Acceleration
 * Angle
 * Anything (Build your own custom measurement at compile or run-time using the UnitOf methodology)
 * Area
 * DataStorage
 * DataTransferRate
 * DataType (Convert any C# data type and more including converting to and from fractions)
 * ElectricCharge
 * Energy / Work
 * Force
 * Frequency
 * FuelEconomy
 * Length
 * Mass
 * MetricPrefix
 * NumericBase (Currently only available Java and JavaScript)
 * Pressure
 * Speed
 * Temperature
 * Time
 * Torque
 * Volume 
 */
namespace UnitOf {

    /// <summary>
    /// UnitOf.Acceleration()
    /// 
    /// Ex: double foo = new UnitOf.Acceleration().FromGravity(1.25).ToGalileos(); //One line conversion from 1.25 Gravity to Galileos
    /// </summary>
    [Serializable]
    public class Acceleration : B<D> {

        /// <summary>
        /// Method to perform all conversions within Acceleration class.
        /// All "To" methods within Acceleration use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t,false);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Acceleration foo = new UnitOf.Acceleration().FromGravity(1.25); //Variable "foo" will be able to convert 1.25 Gravity into any unit of Acceleration
        /// </summary>
        public Acceleration FromAttometersPerSecondSquared(double v){return s(this,v,D.AS,"AS");}
        public Acceleration FromCentimeterPerSecondSquared(double v){return s(this,v,D.CS,"CS");}
        public Acceleration FromDecimetersPerSecondSquared(double v){return s(this,v,D.DS,"DS");}
        public Acceleration FromDekametersPerSecondSquared(double v){return s(this,v,D.DAS,"DAS");}
        public Acceleration FromExametersPerSecondSquared(double v){return s(this,v,D.ES,"ES");}
        public Acceleration FromFeetPerHourPerSecond(double v){return s(this,v,D.FTHS,"FTHS");}
        public Acceleration FromFeetPerMinutePerSecond(double v){return s(this,v,D.FTMS,"FTMS");}
        public Acceleration FromFeetPerSecondSquared(double v){return s(this,v,D.FTS,"FTS");}
        public Acceleration FromFemtometersPerSecondSquared(double v){return s(this,v,D.FS,"FS");}
        public Acceleration FromGalileos(double v){return s(this,v,D.GAL,"GAL");}
        public Acceleration FromGigametersPerSecondSquared(double v){return s(this,v,D.GS,"GS");}
        public Acceleration FromGravity(double v){return s(this,v,D.G,"G");}
        public Acceleration FromHectometersPerSecondSquared(double v){return s(this,v,D.HS,"HS");}
        public Acceleration FromInchesPerMinutePerSecond(double v){return s(this,v,D.INMS,"INMS");}
        public Acceleration FromInchesPerSecondSquared(double v){return s(this,v,D.INS,"INS");}
        public Acceleration FromKilometersPerHourPerSecond(double v){return s(this,v,D.KHS,"KHS");}
        public Acceleration FromKilometersPerHourSquared(double v){return s(this,v,D.KH,"KH");}
        public Acceleration FromKilometersPerSecondSquared(double v){return s(this,v,D.KS,"KS");}
        public Acceleration FromKnotsPerSecond(double v){return s(this,v,D.KNS,"KNS");}
        public Acceleration FromMegametersPerSecondSquared(double v){return s(this,v,D.MGS,"MGS");}
        public Acceleration FromMetersPerSecondSquared(double v){return s(this,v,D.MS,"MS");}
        public Acceleration FromMicrogalileos(double v){return s(this,v,D.MUGAL,"MUGAL");}
        public Acceleration FromMicrometersPerSecondSquared(double v){return s(this,v,D.MUS,"MUS");}
        public Acceleration FromMilesPerHourPerSecond(double v){return s(this,v,D.MIHS,"MIHS");}
        public Acceleration FromMilesPerMinutePerSecond(double v){return s(this,v,D.MIMS,"MIMS");}
        public Acceleration FromMilesPerSecondSquared(double v){return s(this,v,D.MIS,"MIS");}
        public Acceleration FromMilligalileos(double v){return s(this,v,D.MILGAL,"MILGAL");}
        public Acceleration FromMillimetersPerSecondSquared(double v){return s(this,v,D.MILS,"MILS");}
        public Acceleration FromNanometersPerSecondSquared(double v){return s(this,v,D.NS,"NS");}
        public Acceleration FromPetametersPerSecondSquared(double v){return s(this,v,D.PES,"PES");}
        public Acceleration FromPicometersPerSecondSquared(double v){return s(this,v,D.PS,"PS");}
        public Acceleration FromTerametersPerSecondSquared(double v){return s(this,v,D.TS,"TS");}
        public Acceleration FromYardsPerSecondSquared(double v){return s(this,v,D.YDS,"YDS");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToGalileos(); //Variable "bar" being of type UnitOf.Acceleration with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Acceleration().FromGravity(1.25).ToGalileos(); //One line conversion from 1.25 Gravity to Galileos
        /// </summary>
        public double ToAttometersPerSecondSquared(){return c(D.AS);}
        public double ToCentimeterPerSecondSquared(){return c(D.CS);}
        public double ToDecimetersPerSecondSquared(){return c(D.DS);}
        public double ToDekametersPerSecondSquared(){return c(D.DAS);}
        public double ToExametersPerSecondSquared(){return c(D.ES);}
        public double ToFeetPerHourPerSecond(){return c(D.FTHS);}
        public double ToFeetPerMinutePerSecond(){return c(D.FTMS);}
        public double ToFeetPerSecondSquared(){return c(D.FTS);}
        public double ToFemtometersPerSecondSquared(){return c(D.FS);}
        public double ToGalileos(){return c(D.GAL);}
        public double ToGigametersPerSecondSquared(){return c(D.GS);}
        public double ToGravity(){return c(D.G);}
        public double ToHectometersPerSecondSquared(){return c(D.HS);}
        public double ToInchesPerMinutePerSecond(){return c(D.INMS);}
        public double ToInchesPerSecondSquared(){return c(D.INS);}
        public double ToKilometersPerHourPerSecond(){return c(D.KHS);} 
        public double ToKilometersPerHourSquared(){return c(D.KH);} 
        public double ToKilometersPerSecondSquared(){return c(D.KS);}
        public double ToKnotsPerSecond(){return c(D.KNS);}
        public double ToMegametersPerSecondSquared(){return c(D.MGS);}
        public double ToMetersPerSecondSquared(){return c(D.MS);}
        public double ToMicrogalileos(){return c(D.MUGAL);}
        public double ToMicrometersPerSecondSquared(){return c(D.MUS);}
        public double ToMilesPerHourPerSecond(){return c(D.MIHS);}
        public double ToMilesPerMinutePerSecond(){return c(D.MIMS);}
        public double ToMilesPerSecondSquared(){return c(D.MIS);} 
        public double ToMilligalileos(){return c(D.MILGAL);}
        public double ToMillimetersPerSecondSquared(){return c(D.MILS);}
        public double ToNanometersPerSecondSquared(){return c(D.NS);}
        public double ToPetametersPerSecondSquared(){return c(D.PES);}
        public double ToPicometersPerSecondSquared(){return c(D.PS);}
        public double ToTerametersPerSecondSquared(){return c(D.TS);}
        public double ToYardsPerSecondSquared(){return c(D.YDS);}
    }

    /// <summary>
    /// UnitOf.Angle()
    /// 
    /// Ex: double foo = new UnitOf.Angle().FromDegrees(1.25).ToRadians(); //One line conversion from 1.25 Degrees to Radians
    /// </summary>
    [Serializable]
    public class Angle : B<E> {

        /// <summary>
        /// Method to perform all conversions within Angle class.
        /// All "To" methods within Angle use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Angle foo = new UnitOf.Angle().FromDegrees(1.25); //Variable "foo" will be able to convert 1.25 Degrees into any unit of Angle
        /// </summary>
        public Angle FromCircles(double v){return s(this,v,E.C,"C");}
        public Angle FromDegrees(double v){return s(this,v,E.D,"D");}
        public Angle FromGradians(double v){return s(this,v,E.G,"G");}
        public Angle FromMils(double v){return s(this,v,E.MIL,"MIL");}
        public Angle FromMinutes(double v){return s(this,v,E.M,"M");}
        public Angle FromQuadrants(double v){return s(this,v,E.Q,"Q");}
        public Angle FromRadians(double v){return s(this,v,E.RAD,"RAD");}
        public Angle FromRevolutions(double v){return s(this,v,E.R,"R");}
        public Angle FromRightAngles(double v){return s(this,v,E.RA,"RA");}
        public Angle FromSeconds(double v){return s(this,v,E.S,"S");}
        public Angle FromSextants(double v){return s(this,v,E.SE,"SE");}
        public Angle FromSigns(double v){return s(this,v,E.SI,"SI");}
        public Angle FromTurns(double v){return s(this,v,E.T,"T");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToRadians(); //Variable "bar" being of type UnitOf.Angle with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Angle().FromDegrees(1.25).ToRadians(); //One line conversion from 1.25 Degrees to Radians
        /// </summary>
        public double ToCircles(){return c(E.C);}
        public double ToDegrees(){return c(E.D);}
        public double ToGradians(){return c(E.G);}
        public double ToMils(){return c(E.MIL);}  
        public double ToMinutes(){return c(E.M);}
        public double ToQuadrants(){return c(E.Q);}
        public double ToRadians(){return c(E.RAD);}  
        public double ToRevolutions(){return c(E.R);}
        public double ToRightAngles(){return c(E.RA);}
        public double ToSeconds(){return c(E.S);}
        public double ToSextants(){return c(E.SE);}
        public double ToSigns(){return c(E.SI);}
        public double ToTurns(){return c(E.T);}
    }

    /// <summary>
    /// UnitOf.Anything() - Build your own custom measurement at compile or run-time using the UnitOf methodology
    /// 
    /// See UnitOf example projects on Github for fully working examples
    /// </summary>
    [Serializable]
    public class Anything{
        private Dictionary<object, double> u = new Dictionary<object, double>();    //Units available to convert "From" and "To", includes key/value
        private bool mtd = true;    //Multiply then divide conversion algorithm, false will divide then multiply when converting "To"
        private object kn = "";     //Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name (kn).
        private double kv = 0;      //Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. UnitOf.Anything() conversion works by converting the starting value to the defined key, then from the key to the desired value (kv).
        private object fn = "";     //From Unit Name. Unit to be used for conversions. Ex: from passed in was 5 meters, "meters" would be the From Unit Name (fn).
        private double fv = 0;      //From Unit Value. Unit to be used for conversions. Ex: from passed in was 5 meters, 5 would be the From Unit Name (fv).

        /// <summary>
        /// Method to perform all conversions within Anything class
        /// </summary>
        /// <param name="fc">Constant value of "From" unit. Unit starting from factor value.</param>
        /// <param name="cv">"From" value passed. Unit value being converted that passed by the user.</param>
        /// <param name="tc">Constant value of "To" unit. Unit being converted into factor value.</param>
        /// <returns>Finished conversion. "from" converted into "to" value.</returns>
        private double c(double fc, double cv, double tc){
            return U.I(U.I(cv, tc, mtd), fc, !mtd);
        }

        /// <summary>
        /// Create new UnitOf.Anything
        /// Ex: new UnitOf.Anything("Feet");
        /// </summary>
        /// <param name="keyName">Key Unit Name. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        public Anything(object keyName){
            anythingSetup(keyName, 1, true, new Dictionary<object, double>());
        }

        /// <summary>
        /// Create new UnitOf.Anything
        /// Ex: new UnitOf.Anything("Feet",1);
        /// </summary>
        /// <param name="keyName">Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="keyValue">Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        public Anything(object keyName, double keyValue){
            anythingSetup(keyName, keyValue, true, new Dictionary<object, double>());
        }

        /// <summary>
        /// Create new UnitOf.Anything
        /// Ex: new UnitOf.Anything("Feet",true);
        /// </summary>
        /// <param name="keyName">Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="multiplyToKeyThenDivide">Multiply then divide conversion algorithm, false will divide then multiply when converting "To"</param>
        public Anything(object keyName, bool multiplyToKeyThenDivide){
            anythingSetup(keyName, 1, multiplyToKeyThenDivide, new Dictionary<object, double>());
        }

        /// <summary>
        /// Create new UnitOf.Anything
        /// Ex: new UnitOf.Anything("Feet", new Dictionary<object, double>(){{"Meters",0.3048}, {"Inches",12.0}});
        /// </summary>
        /// <param name="keyName">Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="units">Available units defined by the user what can be converted from and into. This works similarly to the structs of each UnitOf measurement. Type Dictionary of objects/double for the key/value (Ex: Feet/1).</param>
        public Anything(object keyName, Dictionary<object, double> units){
            anythingSetup(keyName, 1, true, units);
        }

        /// <summary>
        /// Create new UnitOf.Anything
        /// Ex: new UnitOf.Anything("Feet", new double[]{1,0.3048,12});
        /// </summary>
        /// <param name="keyName">Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="units">Available units defined by the user what can be converted from and into. This works similarly to the structs of each UnitOf measurement. Type Array of doubles: unlike the constructors that uses a HashMap to define the key/value pair (like meters/1), only the value is defined here and is used for both key/value (so 1/1)</param>
        public Anything(object keyName, double[] units){
            anythingSetup(keyName, 1, true, U.Ad(units));
        }

        /// <summary>
        /// Create new UnitOf.Anything
        /// Ex: new UnitOf.Anything("Feet",1,true);
        /// </summary>
        /// <param name="keyName">Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="keyValue">Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="multiplyToKeyThenDivide">Multiply then divide conversion algorithm, false will divide then multiply when converting "To"</param>
        public Anything(object keyName, double keyValue, bool multiplyToKeyThenDivide){
            anythingSetup(keyName, keyValue, multiplyToKeyThenDivide, new Dictionary<object, double>());
        }

        /// <summary>
        /// Create new UnitOf.Anything
        /// Ex: new UnitOf.Anything("Feet", 1, new Dictionary<object, double>(){{"Meters",0.3048},{"Inches",12.0}});
        /// </summary>
        /// <param name="keyName">Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="keyValue">Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="units">Available units defined by the user what can be converted from and into. This works similarly to the structs of each UnitOf measurement. Type Dictionary of objects/double for the key/value (Ex: Feet/1).</param>
        public Anything(object keyName, double keyValue, Dictionary<object, double> units){
            anythingSetup(keyName, keyValue, true, units);
        }

        /// <summary>
        /// Create new UnitOf.Anything
        /// Ex: new UnitOf.Anything("Feet",1, new double[]{1,0.3048,12});
        /// </summary>
        /// <param name="keyName">Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="keyValue">Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="units">Available units defined by the user what can be converted from and into. This works similarly to the structs of each UnitOf measurement. Type Array of doubles: unlike the constructors that uses a HashMap to define the key/value pair (like meters/1), only the value is defined here and is used for both key/value (so 1/1)</param>
        public Anything(object keyName, double keyValue, double[] units){
            anythingSetup(keyName, keyValue, true, U.Ad(units));
        }

        /// <summary>
        /// Create new UnitOf.Anything
        /// Ex: new UnitOf.Anything("Feet",1,true, new double[]{1,0.3048,12});
        /// </summary>
        /// <param name="keyName">Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="keyValue">Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="multiplyToKeyThenDivide">Multiply then divide conversion algorithm, false will divide then multiply when converting "To"</param>
        /// <param name="units">Available units defined by the user what can be converted from and into. This works similarly to the structs of each UnitOf measurement. Type Array of doubles: unlike the constructors that uses a HashMap to define the key/value pair (like meters/1), only the value is defined here and is used for both key/value (so 1/1)</param>
        public Anything(object keyName, double keyValue, bool multiplyToKeyThenDivide, double[] units){
            anythingSetup(keyName, keyValue, multiplyToKeyThenDivide, U.Ad(units));
        }

        /// <summary>
        /// Create new UnitOf.Anything
        /// Ex: new UnitOf.Anything("Feet", 1, true, new Dictionary<object, double>(){{"Meters",0.3048},{"Inches",12.0}});
        /// </summary>
        /// <param name="keyName">Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="keyValue">Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="multiplyToKeyThenDivide">Multiply then divide conversion algorithm, false will divide then multiply when converting "To"</param>
        /// <param name="units">Available units defined by the user what can be converted from and into. This works similarly to the structs of each UnitOf measurement. Type Dictionary of objects/double for the key/value (Ex: Feet/1).</param>
        public Anything(object keyName, double keyValue, bool multiplyToKeyThenDivide, Dictionary<object, double> units){
            anythingSetup(keyName, keyValue, multiplyToKeyThenDivide, units);
        }

        /// <summary>
        /// Create new UnitOf.Anything
        /// Ex: new UnitOf.Anything("Feet", 1, true, new Dictionary<object, double>(){{"Meters",0.3048},{"Inches",12.0}});
        /// </summary>
        /// <param name="keyName">Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="keyValue">Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.</param>
        /// <param name="multiplyToKeyThenDivide">Multiply then divide conversion algorithm, false will divide then multiply when converting "To"</param>
        /// <param name="units">Available units defined by the user what can be converted from and into. This works similarly to the structs of each UnitOf measurement. Type Dictionary of objects/double for the key/value (Ex: Feet/1).</param>
        private void anythingSetup(object keyName, double keyValue, bool multiplyToKeyThenDivide, Dictionary<object, double> units){
            this.kn = nc(keyName);
            this.fn = this.kn;
            this.kv = keyValue;
            this.fv = this.kv;
            this.mtd = multiplyToKeyThenDivide;
            if (units != null){
                this.u = units;
            }
            if (!this.u.ContainsKey(this.kn)) { //if collection of units is passed in it is not necessary to include it with the collection of units as it is added/updated here.
                this.u.Add(this.kn, this.kv);
            } else {
                this.u[this.kn] = this.kv;
            }
        }

        /// <summary>
        /// Adds or updates a Unit's Name with its associated Value in relation to the Key to the collection of Units.
        /// </summary>
        /// <param name="nameAndValue">Unit Value for the Unit Name in relation to the Key. Unit Name here is also the value.</param>
        public void AddUnit(double nameAndValue){
            AddUnit(nameAndValue,nameAndValue);
        }
        
        /// <summary>
        /// Adds or updates a Unit's Name with its associated Value in relation to the Key to the collection of Units.
        /// </summary>
        /// <param name="name">Unit name</param>
        /// <param name="val">Unit Value for the Unit Name in relation to the Key</param>
        public void AddUnit(object name, double val){
            Object n = nc(name);
            if(kn.Equals(n)){
                kn = n;
                kv = val;
            }
            u.Add(n, val);
        }

        /// <summary>
        /// Takes the Unit Name passed and returns the found Unit's Value
        /// </summary>
        /// <param name="name">Unit Name</param>
        /// <returns>Unit Value of the Unit Name passed in. Returns 0.0 if Unit Name cannot be found.</returns>
        private double GetUnitValueByName(Object name){
            try{
                return u[nc(name)];
            } catch(Exception e){
                double k = (new DataType(name)).ToDouble(-998.7654);
                return u.ContainsKey(k) ? k : 0.0;
            }
        }
        
        /// <summary>
        /// View the Unit Key Name originally passed in to the .Anything() constructor.
        /// Conversion here works by converting the starting value to this key then from the key to the desired value.
        /// </summary>
        /// <returns>The Unit Key Name</returns>
        public object GetKeyName(){
            return kn;
        }

        /// <summary>
        /// View the Unit Key Value originally passed in to the .Anything() constructor.
        /// Conversion here works by converting the starting value to this key then from the key to the desired value.
        /// </summary>
        /// <returns>The Unit Key Value</returns>
        public double GetKeyValue(){
            return kv;
        }
        
        /// <summary>
        /// Returns the set "From" Unit Name
        /// </summary>
        public object GetFromName(){
            return fn;
        }

        /// <summary>
        /// Returns the set "From" Unit Value
        /// </summary>
        public double GetFromValue(){
            return fv;
        }

        /// <summary>
        /// Initializes the declared new UnitOf.Anything variable with its Unit Name/Value.
        /// Following this with UnitOf.Anything's To() will convert this value to the desired type's value
        /// </summary>
        /// <param name="fromName">Starting Unit Value to be converted</param>
        /// <param name="fromValue">Starting Unit Name to be converted</param>
        public void From(object fromName, double fromValue){
            this.fn = nc(fromName);
            this.fv = fromValue;
        }

        /// <summary>
        /// Convert the already passed in "From" Unit Name/Value
        /// </summary>
        /// <param name="toName">Convert already passed in "From" Unit into this unit by name</param>
        /// <returns>The finished conversion Value</returns>
        public double To(object toName){
            return ConvertNow(fv, fn, toName);
        }
        
        /// <summary>
        /// One liner conversion, pass in a starting Unit Name/Value to be converted into the desired Unit by Name.
        /// </summary>
        /// <param name="fromValue">Starting Unit Value</param>
        /// <param name="fromName">Starting Unit Name</param>
        /// <param name="toName">Converting into Unit Name</param>
        /// <returns>The finished conversion Value</returns>
        public double ConvertNow(double fromValue, object fromName, object toName){
            return c(GetUnitValueByName(fromName), fromValue, GetUnitValueByName(toName));
        }  
        
        /// <summary>
        /// Safely check and replace object if null
        /// </summary>
        /// <param name="o">Object to be checked if null</param>
        /// <returns>"null" if null, Object passed in if not null</returns>
        private object nc(object o){
            return (o == null) ? "null" : o;
        }
    }
    
    /// <summary>
    /// UnitOf.Area()
    /// 
    /// Ex: double foo = new UnitOf.Area().fromSquareMeters(1.25).toAcres(); //One line conversion from 1.25 SquareMeters to Acres
    /// </summary>
    [Serializable]
    public class Area : B<F>{

        /// <summary>
        /// Method to perform all conversions within Area class.
        /// All "To" methods within Area use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Area foo = new UnitOf.Area().FromSquareMeters(1.25); //Variable "foo" will be able to convert 1.25 SquareMeters into any unit of Area
        /// </summary>
        public Area FromAcres(double v){return s(this,v,F.AC,"AC");}
        public Area FromAres(double v){return s(this,v,F.A,"A");}
        public Area FromArpents(double v){return s(this,v,F.AR,"AR");}
        public Area FromBarns(double v){return s(this,v,F.B,"B");}
        public Area FromCircularInches(double v){return s(this,v,F.CRIN,"CRIN");}
        public Area FromCircularMils(double v){return s(this,v,F.CRMIL,"CRMIL");}
        public Area FromHectares(double v){return s(this,v,F.HA,"HA");}
        public Area FromHomesteads(double v){return s(this,v,F.HS,"HS");}
        public Area FromRoods(double v){return s(this,v,F.R,"R");}
        public Area FromSabins(double v){return s(this,v,F.S,"S");}
        public Area FromSquareCentimeters(double v){return s(this,v,F.C,"C");}
        public Area FromSquareChains(double v){return s(this,v,F.CH,"CH");}
        public Area FromSquareDecimeters(double v){return s(this,v,F.D,"D");}
        public Area FromSquareDekameters(double v){return s(this,v,F.DA,"DA");}
        public Area FromSquareFeet(double v){return s(this,v,F.FT,"FT");}
        public Area FromSquareHectometers(double v){return s(this,v,F.H,"H");}
        public Area FromSquareInches(double v){return s(this,v,F.IN,"IN");}
        public Area FromSquareKilometers(double v){return s(this,v,F.K,"K");}
        public Area FromSquareMeters(double v){return s(this,v,F.M,"M");}
        public Area FromSquareMicrometers(double v){return s(this,v,F.MU,"MU");}
        public Area FromSquareMiles(double v){return s(this,v,F.MI,"MI");}
        public Area FromSquareMillimeters(double v){return s(this,v,F.MIL,"MIL");}
        public Area FromSquareNanometers(double v){return s(this,v,F.N,"N");}
        public Area FromSquarePerches(double v){return s(this,v,F.PE,"PE");}
        public Area FromSquarePoles(double v){return s(this,v,F.PO,"PO");}
        public Area FromSquareRods(double v){return s(this,v,F.ROD,"ROD");}
        public Area FromSquareYards(double v){return s(this,v,F.YD,"YD");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToAcres(); //Variable "bar" being of type UnitOf.Area with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Area().FromSquareMeters(1.25).ToAcres(); //One line conversion from 1.25 SquareMeters to Acres
        /// </summary>
        public double ToAcres(){return c(F.AC);}
        public double ToAres(){return c(F.A);}
        public double ToArpents(){return c(F.AR);}
        public double ToBarns(){return c(F.B);}
        public double ToCircularInches(){return c(F.CRIN);}
        public double ToCircularMils(){return c(F.CRMIL);}
        public double ToHectares(){return c(F.HA);}
        public double ToHomesteads(){return c(F.HS);}
        public double ToRoods(){return c(F.R);}
        public double ToSabins(){return c(F.S);}
        public double ToSquareCentimeters(){return c(F.C);}
        public double ToSquareChains(){return c(F.CH);}
        public double ToSquareDecimeters(){return c(F.D);}
        public double ToSquareDekameters(){return c(F.DA);}
        public double ToSquareFeet(){return c(F.FT);}
        public double ToSquareHectometers(){return c(F.H);}
        public double ToSquareInches(){return c(F.IN);}
        public double ToSquareKilometers(){return c(F.K);}    
        public double ToSquareMeters(){return c(F.M);}
        public double ToSquareMicrometers(){return c(F.MU);}   
        public double ToSquareMiles(){return c(F.MI);}
        public double ToSquareMillimeters(){return c(F.MIL);}
        public double ToSquareNanometers(){return c(F.N);}   
        public double ToSquarePerches(){return c(F.PE);}
        public double ToSquarePoles(){return c(F.PO);}
        public double ToSquareRods(){return c(F.ROD);}
        public double ToSquareYards(){return c(F.YD);}
    }

    /// <summary>
    /// UnitOf.DataStorage()
    /// 
    /// double foo = new UnitOf.DataStorage().FromMegabytes(1.25)ToKilobytes(); //One line conversion from 1.25 Megabytes to Kilobytes
    /// </summary>
    [Serializable]
    public class DataStorage : B<G>{

        /// <summary>
        /// Method to perform all conversions within DataStorage class.
        /// All "To" methods within DataStorage use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.DataStorage foo = new UnitOf.DataStorage().FromMegabytes(1.25); //Variable "foo" will be able to convert 1.25 Megabytes into any unit of DataStorage
        /// </summary>
        public DataStorage FromBits(double v){return s(this,v,G.B,"B");}
        public DataStorage FromBlocks(double v){return s(this,v,G.BL,"BL");}
        public DataStorage FromBluRay_DoubleLayer(double v){return s(this,v,G.BD2,"BD2");}
        public DataStorage FromBluRay_SingleLayer(double v){return s(this,v,G.BD1,"BD1");}
        public DataStorage FromBytes(double v){return s(this,v,G.BY,"BY");}
        public DataStorage FromCDs_74Minutes(double v) {return s(this,v,G.CD74,"CD74");}
        public DataStorage FromCDs_80Minutes(double v) {return s(this,v,G.CD80,"CD80");}
        public DataStorage FromDVDs_DoubleSidedDoubleLayer(double v) {return s(this,v,G.D22,"D22");}
        public DataStorage FromDVDs_DoubleSidedSingleLayer(double v) {return s(this,v,G.D12,"D12");}
        public DataStorage FromDVDs_SingleSidedDoubleLayer(double v) {return s(this,v,G.D21,"D21");}
        public DataStorage FromDVDs_SingleSidedSingleLayer(double v) {return s(this,v,G.D11,"D11");}
        public DataStorage FromExabits(double v){return s(this,v,G.EBI,"EBI");}
        public DataStorage FromExabytes(double v){return s(this,v,G.EB,"EB");}
        public DataStorage FromFloppyDisks_35DD(double v){return s(this,v,G.F35DD,"F35DD");}
        public DataStorage FromFloppyDisks_35ED(double v) {return s(this,v,G.F35ED,"F35ED");}
        public DataStorage FromFloppyDisks_35HD(double v) {return s(this,v,G.F35HD,"F35HD");}
        public DataStorage FromFloppyDisks_525DD(double v) {return s(this,v,G.F525DD,"F525DD");}
        public DataStorage FromFloppyDisks_525HD(double v) {return s(this,v,G.F525HD,"F525HD");}
        public DataStorage FromGigabits(double v){return s(this,v,G.GBI,"GBI");}
        public DataStorage FromGigabytes(double v){return s(this,v,G.GB,"GB");}
        public DataStorage FromKilobits(double v){return s(this,v,G.KBI,"KBI");}
        public DataStorage FromKilobytes(double v){return s(this,v,G.KB,"KB");}
        public DataStorage FromMegabits(double v){return s(this,v,G.MBI,"MBI");}
        public DataStorage FromMegabytes(double v){return s(this,v,G.MB,"MB");}
        public DataStorage FromNibbles(double v){return s(this,v,G.NI,"NI");}
        public DataStorage FromPetabits(double v){return s(this,v,G.PBI,"PBI");}
        public DataStorage FromPetabytes(double v){return s(this,v,G.PB,"PB");}
        public DataStorage FromSIUnitExabits(double v){return s(this,v,G.SIEBI,"SIEBI");}
        public DataStorage FromSIUnitExabytes(double v){return s(this,v,G.SIEB,"SIEB");}
        public DataStorage FromSIUnitGigabits(double v){return s(this,v,G.SIGBI,"SIGBI");}
        public DataStorage FromSIUnitGigabytes(double v){return s(this,v,G.SIGB,"SIGB");}
        public DataStorage FromSIUnitKilobits(double v){return s(this,v,G.SIKBI,"SIKBI");}
        public DataStorage FromSIUnitKilobytes(double v){return s(this,v,G.SIKB,"SIKB");}
        public DataStorage FromSIUnitMegabits(double v){return s(this,v,G.SIMBI,"SIMBI");}
        public DataStorage FromSIUnitMegabytes(double v){return s(this,v,G.SIMB,"SIMB");}
        public DataStorage FromSIUnitPetabits(double v){return s(this,v,G.SIPBI,"SIPBI");}
        public DataStorage FromSIUnitPetabytes(double v){return s(this,v,G.SIPB,"SIPB");}
        public DataStorage FromSIUnitTerabits(double v){return s(this,v,G.SITBI,"SITBI");}
        public DataStorage FromSIUnitTerabytes(double v){return s(this,v,G.SITB,"SITB");}
        public DataStorage FromSIUnitYottabits(double v){return s(this,v,G.SIYBI,"SIYBI");}
        public DataStorage FromSIUnitYottabytes(double v){return s(this,v,G.SIYB,"SIYB");}
        public DataStorage FromSIUnitZettabits(double v){return s(this,v,G.SIZBI,"SIZBI");}
        public DataStorage FromSIUnitZettabytes(double v){return s(this,v,G.SIZB,"SIZB");}
        public DataStorage FromTerabits(double v){return s(this,v,G.TBI,"TBI");}
        public DataStorage FromTerabytes(double v){return s(this,v,G.TB,"TB");}
        public DataStorage FromWords(double v){return s(this,v,G.W,"W");}
        public DataStorage FromYottabits(double v){return s(this,v,G.YBI,"YBI");}
        public DataStorage FromYottabytes(double v){return s(this,v,G.YB,"YB");}
        public DataStorage FromZettabits(double v){return s(this,v,G.ZBI,"ZBI");}
        public DataStorage FromZettabytes(double v){return s(this,v,G.ZB,"ZB");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToKilobytes(); //Variable "bar" being of type UnitOf.DataStorage with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.DataStorage().FromMegabytes(1.25).ToKilobytes(); //One line conversion from 1.25 Megabytes to Kilobytes
        /// </summary>
        public double ToBits(){return c(G.B);}
        public double ToBlocks(){return c(G.BL);}
        public double ToBluRay_DoubleLayer(){return c(G.BD2);}
        public double ToBluRay_SingleLayer(){return c(G.BD1);}
        public double ToBytes(){return c(G.BY);}
        public double ToCDs_74Minutes(){return c(G.CD74);}
        public double ToCDs_80Minutes(){return c(G.CD80);}
        public double ToDVDs_DoubleSidedDoubleLayer(){return c(G.D22);}
        public double ToDVDs_DoubleSidedSingleLayer(){return c(G.D12);}
        public double ToDVDs_SingleSidedDoubleLayer(){return c(G.D21);}
        public double ToDVDs_SingleSidedSingleLayer(){return c(G.D11);}
        public double ToExabits(){return c(G.EBI);}
        public double ToExabytes(){return c(G.EB);}
        public double ToFloppyDisks_35DD(){return c(G.F35DD);}
        public double ToFloppyDisks_35ED(){return c(G.F35ED);}
        public double ToFloppyDisks_35HD(){return c(G.F35HD);}
        public double ToFloppyDisks_525DD(){return c(G.F525DD);}
        public double ToFloppyDisks_525HD(){return c(G.F525HD);}
        public double ToGigabits(){return c(G.GBI);}
        public double ToGigabytes(){return c(G.GB);}
        public double ToKilobits(){return c(G.KBI);}
        public double ToKilobytes(){return c(G.KB);}
        public double ToMegabits(){return c(G.MBI);}
        public double ToMegabytes(){return c(G.MB);}
        public double ToNibbles(){return c(G.NI);}
        public double ToPetabits(){return c(G.PBI);}
        public double ToPetabytes(){return c(G.PB);}
        public double ToSIUnitExabits(){return c(G.SIEBI);}
        public double ToSIUnitExabytes(){return c(G.SIEB);}
        public double ToSIUnitGigabits(){return c(G.SIGBI);}
        public double ToSIUnitGigabytes(){return c(G.SIGB);}
        public double ToSIUnitKilobits(){return c(G.SIKBI);}
        public double ToSIUnitKilobytes(){return c(G.SIKB);}
        public double ToSIUnitMegabits(){return c(G.SIMBI);}
        public double ToSIUnitMegabytes(){return c(G.SIMB);}
        public double ToSIUnitPetabits(){return c(G.SIPBI);}
        public double ToSIUnitPetabytes(){return c(G.SIPB);}
        public double ToSIUnitTerabits(){return c(G.SITBI);}
        public double ToSIUnitTerabytes(){return c(G.SITB);}
        public double ToSIUnitYottabits(){return c(G.SIYBI);}
        public double ToSIUnitYottabytes(){return c(G.SIYB);}
        public double ToSIUnitZettabits(){return c(G.SIZBI);}
        public double ToSIUnitZettabytes(){return c(G.SIZB);}
        public double ToTerabits(){return c(G.TBI);}
        public double ToTerabytes(){return c(G.TB);}
        public double ToWords(){return c(G.W);}
        public double ToYottabits(){return c(G.YBI);}
        public double ToYottabytes(){return c(G.YB);}
        public double ToZettabits(){return c(G.ZBI);}
        public double ToZettabytes(){return c(G.ZB);}
    }

    /// <summary>
    /// UnitOf.DataTransferRate()
    /// 
    /// Ex: double foo = new UnitOf.DataTransferRate().FromMegabytesPerSecond(1.25).ToKilobytesPerSecond(); //One line conversion from 1.25 MegabytesPerSecond to KilobytesPerSecond
    /// </summary>
    [Serializable]
    public class DataTransferRate : B<H>{

        /// <summary>
        /// Method to perform all conversions within DataTransferRate class.
        /// All "To" methods within DataTransferRate use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.DataTransferRate foo = new UnitOf.DataTransferRate().FromMegabytesPerSecond(1.25); //Variable "foo" will be able to convert 1.25 MegabytesPerSecond into any unit of DataTransferRate
        /// </summary>
        public DataTransferRate FromBitsPerSecond(double v){return s(this,v,H.BIS,"BIS");}
        public DataTransferRate FromBytesPerSecond(double v){return s(this,v,H.BS,"BS");}
        public DataTransferRate FromEthernetsBase10(double v){return s(this,v,H.E10,"E10");}
        public DataTransferRate FromEthernetsBase100(double v){return s(this,v,H.E100,"E100");}
        public DataTransferRate FromEthernetsBase1000(double v){return s(this,v,H.E1000,"E1000");}
        public DataTransferRate FromFireWires400(double v){return s(this,v,H.FW400,"FW400");}
        public DataTransferRate FromFireWires800(double v){return s(this,v,H.FW800,"FW800");}
        public DataTransferRate FromFireWiresS1600_S3200(double v){return s(this,v,H.FW3200,"FW3200");}
        public DataTransferRate FromGigabitsPerSecond(double v){return s(this,v,H.GBIS,"GBIS");}
        public DataTransferRate FromGigabytesPerSecond(double v){return s(this,v,H.GBS,"GBS");}
        public DataTransferRate FromISDNsDual(double v){return s(this,v,H.ISDND,"ISDND");}
        public DataTransferRate FromISDNsSingle(double v){return s(this,v,H.ISDNS,"ISDNS");}
        public DataTransferRate FromKilobitsPerSecond(double v){return s(this,v,H.KBIS,"KBIS");}
        public DataTransferRate FromKilobytesPerSecond(double v){return s(this,v,H.KBS,"KBS");}
        public DataTransferRate FromMegabitsPerSecond(double v){return s(this,v,H.MBIS,"MBIS");}
        public DataTransferRate FromMegabytesPerSecond(double v){return s(this,v,H.MBS,"MBS");}
        public DataTransferRate FromModems110b(double v){return s(this,v,H.M110,"M110");}
        public DataTransferRate FromModems1200b(double v){return s(this,v,H.M1200,"M1200");}
        public DataTransferRate FromModems14_4k(double v){return s(this,v,H.M14K,"M14K");}
        public DataTransferRate FromModems2400b(double v){return s(this,v,H.M2400,"M2400");}
        public DataTransferRate FromModems28_8k(double v){return s(this,v,H.M28K,"M28K");}
        public DataTransferRate FromModems300b(double v){return s(this,v,H.M300,"M300");}
        public DataTransferRate FromModems33_6k(double v){return s(this,v,H.M33K,"M33K");}
        public DataTransferRate FromModems56k(double v){return s(this,v,H.M56K,"M56K");}
        public DataTransferRate FromModems9600b(double v){return s(this,v,H.M9600,"M9600");}
        public DataTransferRate FromOCs1(double v){return s(this,v,H.OC1,"OC1");}
        public DataTransferRate FromOCs12(double v){return s(this,v,H.OC12,"OC12");}
        public DataTransferRate FromOCs192(double v){return s(this,v,H.OC192,"OC192");}
        public DataTransferRate FromOCs24(double v){return s(this,v,H.OC24,"OC24");}
        public DataTransferRate FromOCs3(double v){return s(this,v,H.OC3,"OC3");}
        public DataTransferRate FromOCs48(double v){return s(this,v,H.OC48,"OC48");}
        public DataTransferRate FromOCs768(double v){return s(this,v,H.OC768,"OC768");}
        public DataTransferRate FromPetabitsPerSecond(double v){return s(this,v,H.PBIS,"PBIS");}
        public DataTransferRate FromPetabytesPerSecond(double v){return s(this,v,H.PBS,"PBS");}
        public DataTransferRate FromSIUnitGigabitsPerSecond(double v){return s(this,v,H.SIGBIS,"SIGBIS");}
        public DataTransferRate FromSIUnitGigabytesPerSecond(double v){return s(this,v,H.SIGBS,"SIGBS");}
        public DataTransferRate FromSIUnitKilobitsPerSecond(double v){return s(this,v,H.SIKBIS,"SIKBIS");}
        public DataTransferRate FromSIUnitKilobytesPerSecond(double v){return s(this,v,H.SIKBS,"SIKBS");}
        public DataTransferRate FromSIUnitMegabitsPerSecond(double v){return s(this,v,H.SIMBIS,"SIMBIS");}
        public DataTransferRate FromSIUnitMegabytesPerSecond(double v){return s(this,v,H.SIMBS,"SIMBS");}
        public DataTransferRate FromSIUnitPetabitsPerSecond(double v){return s(this,v,H.SIPBIS,"SIPBIS");}
        public DataTransferRate FromSIUnitPetabytesPerSecond(double v){return s(this,v,H.SIPBS,"SIPBS");}
        public DataTransferRate FromSIUnitTerabitsPerSecond(double v){return s(this,v,H.SITBIS,"SITBIS");}
        public DataTransferRate FromSIUnitTerabytesPerSecond(double v){return s(this,v,H.SITBS,"SITBS");}
        public DataTransferRate FromTerabitsPerSecond(double v){return s(this,v,H.TBIS,"TBIS");}
        public DataTransferRate FromTerabytesPerSecond(double v){return s(this,v,H.TBS,"TBS");}
        public DataTransferRate FromUSBs1_0(double v){return s(this,v,H.USB1,"USB1");}
        public DataTransferRate FromUSBs2_0(double v){return s(this,v,H.USB2,"USB2");}
        public DataTransferRate FromUSBs3_0(double v){return s(this,v,H.USB3,"USB3");}
        public DataTransferRate FromUSBs3_1(double v){return s(this,v,H.USB31,"USB31");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToKilobytesPerSecond(); //Variable "bar" being of type UnitOf.DataTransferRate with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.DataTransferRate().FromMegabytesPerSecond(1.25).ToKilobytesPerSecond(); //One line conversion from 1.25 MegabytesPerSecond to KilobytesPerSecond
        /// </summary>
        public double ToBitsPerSecond(){return c(H.BIS);}
        public double ToBytesPerSecond(){return c(H.BS);}
        public double ToEthernetsBase10(){return c(H.E10);}
        public double ToEthernetsBase100(){return c(H.E100);}
        public double ToEthernetsBase1000(){return c(H.E1000);}
        public double ToFireWires400(){return c(H.FW400);}
        public double ToFireWires800(){return c(H.FW800);}
        public double ToFireWiresS1600_S3200(){return c(H.FW3200);}
        public double ToGigabitsPerSecond(){return c(H.GBIS);}
        public double ToGigabytesPerSecond(){return c(H.GBS);}
        public double ToISDNsDual(){return c(H.ISDND);}
        public double ToISDNsSingle(){return c(H.ISDNS);}
        public double ToKilobitsPerSecond(){return c(H.KBIS);}
        public double ToKilobytesPerSecond(){return c(H.KBS);}
        public double ToMegabitsPerSecond(){return c(H.MBIS);}
        public double ToMegabytesPerSecond(){return c(H.MBS);}
        public double ToModems110b(){return c(H.M110);}
        public double ToModems1200b(){return c(H.M1200);}
        public double ToModems14_4k(){return c(H.M14K);}
        public double ToModems2400b(){return c(H.M2400);}
        public double ToModems28_8k(){return c(H.M28K);}
        public double ToModems300b(){return c(H.M300);}
        public double ToModems33_6k(){return c(H.M33K);}
        public double ToModems56k(){return c(H.M56K);}
        public double ToModems9600b(){return c(H.M9600);}
        public double ToOCs1(){return c(H.OC1);}
        public double ToOCs12(){return c(H.OC12);}
        public double ToOCs192(){return c(H.OC192);}
        public double ToOCs24(){return c(H.OC24);}
        public double ToOCs3(){return c(H.OC3);}
        public double ToOCs48(){return c(H.OC48);}
        public double ToOCs768(){return c(H.OC768);}
        public double ToPetabitsPerSecond(){return c(H.PBIS);}
        public double ToPetabytesPerSecond(){return c(H.PBS);}
        public double ToSIUnitGigabitsPerSecond(){return c(H.SIGBIS);}
        public double ToSIUnitGigabytesPerSecond(){return c(H.SIGBS);}
        public double ToSIUnitKilobitsPerSecond(){return c(H.SIKBIS);}
        public double ToSIUnitKilobytesPerSecond(){return c(H.SIKBS);}
        public double ToSIUnitMegabitsPerSecond(){return c(H.SIMBIS);}
        public double ToSIUnitMegabytesPerSecond(){return c(H.SIMBS);}
        public double ToSIUnitPetabitsPerSecond(){return c(H.SIPBIS);}
        public double ToSIUnitPetabytesPerSecond(){return c(H.SIPBS);}
        public double ToSIUnitTerabitsPerSecond(){return c(H.SITBIS);}
        public double ToSIUnitTerabytesPerSecond(){return c(H.SITBS);}
        public double ToTerabitsPerSecond(){return c(H.TBIS);}
        public double ToTerabytesPerSecond(){return c(H.TBS);}
        public double ToUSBs1_0(){return c(H.USB1);}
        public double ToUSBs2_0(){return c(H.USB2);}
        public double ToUSBs3_0(){return c(H.USB3);}
        public double ToUSBs3_1(){return c(H.USB31);}
    }

    /// <summary>
    /// UnitOf.DataType() - Convert any C# data type and more including converting to and from fractions
    /// 
    /// Ex 1: double foo1 = new UnitOf.DataType("-12.5").ToDouble();     //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .ToDouble() default value of 0.0d is returned.
    /// Ex 2: String foo2 = new UnitOf.DataType(12.5).ToFraction("3/2"); //Returns "25/2" from 12.5 (double). If the conversion did fail, the .ToFraction() passed default value of "3/2" is returned.
    /// Ex 3: double bar1 = new UnitOf.DataType("5/2").ToDouble();       //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .ToDouble() default value of 0.0D is returned.
    /// Ex 4: int bar2 = new UnitOf.DataType(null).ToInt(7);             //Conversion fails, returns 7 as it is the default passed.
    /// </summary>
    [Serializable]
    public class DataType : I{
        public DataType(object v) { s(this, v, (v == null) ? "null" : v.GetType().Name); }
    }

    /// <summary>
    /// UnitOf.ElectricCharge()
    /// 
    /// Ex: double foo = new UnitOf.ElectricCharge().FromCoulombs(1.25).ToAmpereHours(); //One line conversion from 1.25 Coulombs to AmpereHours
    /// </summary>
    [Serializable]
    public class ElectricCharge : B<J>{

        /// <summary>
        /// Method to perform all conversions within ElectricCharge class.
        /// All "To" methods within ElectricCharge use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.ElectricCharge foo = new UnitOf.ElectricCharge().FromCoulombs(1.25); //Variable "foo" will be able to convert 1.25 Coulombs into any unit of ElectricCharge
        /// </summary>
        public ElectricCharge FromAbcoulombs(double v){return s(this,v,J.ABC,"ABC");}
        public ElectricCharge FromAmpereHours(double v){return s(this,v,J.AH,"AH");}
        public ElectricCharge FromAmpereMinutes(double v){return s(this,v,J.AM,"AM");}
        public ElectricCharge FromAmpereSeconds(double v){return s(this,v,J.AS,"AS");}
        public ElectricCharge FromCoulombs(double v){return s(this,v,J.C,"C");}
        public ElectricCharge FromEMUsOfCharge(double v){return s(this,v,J.EMU,"EMU");}
        public ElectricCharge FromESUsOfCharge(double v){return s(this,v,J.ESU,"ESU");}
        public ElectricCharge FromElectronCharge(double v){return s(this,v,J.E,"E");}
        public ElectricCharge FromFaradVolts(double v){return s(this,v,J.F,"F");}
        public ElectricCharge FromFaradayCarbon12(double v){return s(this,v,J.FA12,"FA12");}
        public ElectricCharge FromFaradayChemistry(double v){return s(this,v,J.FACH,"FACH");}
        public ElectricCharge FromFaradayPhysics(double v){return s(this,v,J.FAPH,"FAPH");}
        public ElectricCharge FromFranklins(double v){return s(this,v,J.FR,"FR");}
        public ElectricCharge FromKilocoulombs(double v){return s(this,v,J.KC,"KC");}
        public ElectricCharge FromMegacoulombs(double v){return s(this,v,J.MC,"MC");}
        public ElectricCharge FromMicrocoulombs(double v){return s(this,v,J.MUC,"MUC");}
        public ElectricCharge FromMillicoulombs(double v){return s(this,v,J.MILC,"MILC");}
        public ElectricCharge FromNanocoulombs(double v){return s(this,v,J.NC,"NC");}
        public ElectricCharge FromPicocoulombs(double v){return s(this,v,J.PC,"PC");}
        public ElectricCharge FromStatcoulombs(double v){return s(this,v,J.STC,"STC");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToAmpereHours(); //Variable "bar" being of type UnitOf.ElectricCharge with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.ElectricCharge().FromCoulombs(1.25).ToAmpereHours(); //One line conversion from 1.25 Coulombs to AmpereHours
        /// </summary>
        public double ToAbcoulombs(){return c(J.ABC);}
        public double ToAmpereHours(){return c(J.AH);}
        public double ToAmpereMinutes(){return c(J.AM);}
        public double ToAmpereSeconds(){return c(J.AS);}
        public double ToCoulombs(){return c(J.C);}
        public double ToEMUsOfCharge(){return c(J.EMU);}
        public double ToESUsOfCharge(){return c(J.ESU);}
        public double ToElectronCharge(){return c(J.E);}
        public double ToFaradVolts(){return c(J.F);}
        public double ToFaradayCarbon12(){return c(J.FA12);}
        public double ToFaradayChemistry(){return c(J.FACH);}
        public double ToFaradayPhysics(){return c(J.FAPH);}
        public double ToFranklins(){return c(J.FR);}
        public double ToKilocoulombs(){return c(J.KC);}
        public double ToMegacoulombs(){return c(J.MC);}
        public double ToMicrocoulombs(){return c(J.MUC);}
        public double ToMillicoulombs(){return c(J.MILC);}
        public double ToNanocoulombs(){return c(J.NC);}
        public double ToPicocoulombs(){return c(J.PC);}
        public double ToStatcoulombs(){return c(J.STC);}
    }

    /// <summary>
    /// UnitOf.Energy() / Work
    /// 
    /// Ex: double foo = new UnitOf.Energy().FromJoules(1.25).ToWattSeconds(); //One line conversion from 1.25 Joules to WattSeconds
    /// </summary>
    [Serializable]
    public class Energy : B<K>{

        /// <summary>
        /// Method to perform all conversions within Energy class.
        /// All "To" methods within Energy use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Energy foo = new UnitOf.Energy().FromJoules(1.25); //Variable "foo" will be able to convert 1.25 Joules into any unit of Energy
        /// </summary>
        public Energy FromAttojoules(double v){return s(this,v,K.AJ,"AJ");}
        public Energy FromBTUsInternationalStandard(double v){return s(this,v,K.BTU,"BTU");}
        public Energy FromBTUsThermochemical(double v){return s(this, v, K.BTUTH, "BTUTH");}
        public Energy FromBarrelsOfOilEquivalent(double v){return s(this,v,K.BOE,"BOE");}
        public Energy FromCaloriesInternationalSteam(double v){return s(this,v,K.CALIT,"CALIT");}
        public Energy FromCaloriesNutritional(double v){return s(this,v,K.CALN,"CALN");}
        public Energy FromCaloriesThermochemical(double v){return s(this,v,K.CALTH,"CALTH");}
        public Energy FromDyneCentimeters(double v){return s(this,v,K.DYNCM,"DYNCM");}
        public Energy FromElectronVolts(double v){return s(this,v,K.EV,"EV");}
        public Energy FromErgs(double v){return s(this,v,K.ERG,"ERG");}
        public Energy FromFootPounds(double v){return s(this,v,K.FTLBF,"FTLBF");}
        public Energy FromGigajoules(double v){return s(this,v,K.GJ,"GJ");}
        public Energy FromGigatonsOfTNT(double v){return s(this, v, K.GT, "GT");}
        public Energy FromGigawattHours(double v){return s(this,v,K.GWH,"GWH");}
        public Energy FromGramForceCentimeters(double v){return s(this,v,K.GFCM,"GFCM");}
        public Energy FromGramForceMeters(double v){return s(this,v,K.GFM,"GFM");}
        public Energy FromHartrees(double v){return s(this,v,K.H,"H");}
        public Energy FromHorsepowerHours(double v){return s(this,v,K.HPH,"HPH");}
        public Energy FromHorsepowerHoursMetric(double v){return s(this,v,K.HPHM,"HPHM");}
        public Energy FromInchOunces(double v){return s(this,v,K.INOZF,"INOZF");}
        public Energy FromInchPounds(double v){return s(this,v,K.INLBF,"INLBF");}
        public Energy FromJoules(double v){return s(this,v,K.J,"J");}
        public Energy FromKilocaloriesInternationalSteam(double v){return s(this,v,K.KCALIT,"KCALIT");}
        public Energy FromKilocaloriesThermochemical(double v){return s(this,v,K.KCALTH,"KCALTH");}
        public Energy FromKiloelectronVolts(double v){return s(this,v,K.KEV,"KEV");}
        public Energy FromKilogramForceCentimeters(double v){return s(this,v,K.KGFCM,"KGFCM");}
        public Energy FromKilogramForceMeters(double v){return s(this,v,K.KGFM,"KGFM");}
        public Energy FromKilogramsOfTNT(double v){return s(this, v, K.KGT, "KGT");}
        public Energy FromKilojoules(double v){return s(this,v,K.KJ,"KJ");}
        public Energy FromKilopondMeters(double v){return s(this,v,K.KPM,"KPM");}
        public Energy FromKilotonsOfTNT(double v){return s(this, v, K.KT, "KT");}
        public Energy FromKilowattHours(double v){return s(this,v,K.KWH,"KWH");}
        public Energy FromKilowattSeconds(double v){return s(this,v,K.KWS,"KWS");}
        public Energy FromLiterAtmospheres(double v){return s(this,v,K.LA,"LA");}
        public Energy FromMegaBTUsInternationalStandard(double v){return s(this, v, K.MBTU, "MBTU");}
        public Energy FromMegaelectronVolts(double v){return s(this,v,K.MEV,"MEV");}
        public Energy FromMegajoules(double v){return s(this,v,K.MJ,"MJ");}
        public Energy FromMegatonsOfTNT(double v){return s(this, v, K.MT, "MT");}
        public Energy FromMegawattHours(double v){return s(this,v,K.MWH,"MWH");}
        public Energy FromMicrojoules(double v){return s(this,v,K.MUJ,"MUJ");}
        public Energy FromMillijoules(double v){return s(this,v,K.MILJ,"MILJ");}
        public Energy FromNanojoules(double v){return s(this,v,K.NJ,"NJ");}
        public Energy FromNewtonMeters(double v){return s(this,v,K.NM,"NM");}
        public Energy FromPlanckEnergy(double v){return s(this,v,K.EP,"EP");}
        public Energy FromPoundalFeet(double v){return s(this,v,K.PDLFT,"PDLFT");}
        public Energy FromRydbergs(double v){return s(this,v,K.RY,"RY");}
        public Energy FromThermsEC(double v){return s(this,v,K.THMEC,"THMEC");}
        public Energy FromThermsUS(double v){return s(this,v,K.THMUS,"THMUS");}
        public Energy FromTonsOfTNT(double v){return s(this, v, K.TT, "TT");}
        public Energy FromWattHours(double v){return s(this,v,K.WH,"WH");}
        public Energy FromWattSeconds(double v){return s(this,v,K.WS,"WS");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToWattSeconds(); //Variable "bar" being of type UnitOf.Energy with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Energy().FromJoules(1.25).ToWattSeconds(); //One line conversion from 1.25 Joules to WattSeconds
        /// </summary>
        public double ToAttojoules(){return c(K.AJ);}
        public double ToBTUsInternationalStandard(){return c(K.BTU);}
        public double ToBTUsThermochemical(){return c(K.BTUTH);}
        public double ToBarrelsOfOilEquivalent(){return c(K.BOE);}
        public double ToCaloriesInternationalSteam(){return c(K.CALIT);}
        public double ToCaloriesNutritional(){return c(K.CALN);}
        public double ToCaloriesThermochemical(){return c(K.CALTH);}
        public double ToDyneCentimeters(){return c(K.DYNCM);}
        public double ToElectronVolts(){return c(K.EV);}
        public double ToErgs(){return c(K.ERG);}
        public double ToFootPounds(){return c(K.FTLBF);}
        public double ToGigajoules(){return c(K.GJ);}
        public double ToGigatonsOfTNT(){return c(K.GT);}
        public double ToGigawattHours(){return c(K.GWH);}
        public double ToGramForceCentimeters(){return c(K.GFCM);}
        public double ToGramForceMeters(){return c(K.GFM);}
        public double ToHartrees(){return c(K.H);}
        public double ToHorsepowerHours(){return c(K.HPH);}
        public double ToHorsepowerHoursMetric(){return c(K.HPHM);}
        public double ToInchOunces(){return c(K.INOZF);}
        public double ToInchPounds(){return c(K.INLBF);}
        public double ToJoules(){return c(K.J);}
        public double ToKilocaloriesInternationalSteam(){return c(K.KCALIT);}
        public double ToKilocaloriesThermochemical(){return c(K.KCALTH);}
        public double ToKiloelectronVolts(){return c(K.KEV);}
        public double ToKilogramForceCentimeters(){return c(K.KGFCM);}
        public double ToKilogramForceMeters(){return c(K.KGFM);}
        public double ToKilogramsOfTNT(){return c(K.KGT);}
        public double ToKilojoules(){return c(K.KJ);}
        public double ToKilopondMeters(){return c(K.KPM);}
        public double ToKilotonsOfTNT(){return c(K.KT);}
        public double ToKilowattHours(){return c(K.KWH);}
        public double ToKilowattSeconds(){return c(K.KWS);}
        public double ToLiterAtmospheres(){return c(K.LA);}
        public double ToMegaBTUsInternationalStandard(){return c(K.MBTU);}
        public double ToMegaelectronVolts(){return c(K.MEV);}
        public double ToMegajoules(){return c(K.MJ);}
        public double ToMegatonsOfTNT(){return c(K.MT);}
        public double ToMegawattHours(){return c(K.MWH);}
        public double ToMicrojoules(){return c(K.MUJ);}
        public double ToMillijoules(){return c(K.MILJ);}
        public double ToNanojoules(){return c(K.NJ);}
        public double ToNewtonMeters(){return c(K.NM);}
        public double ToPlanckEnergy(){return c(K.EP);}
        public double ToPoundalFeet(){return c(K.PDLFT);}
        public double ToRydbergs(){return c(K.RY);}
        public double ToThermsEC(){return c(K.THMEC);}
        public double ToThermsUS(){return c(K.THMUS);}
        public double ToTonsOfTNT(){return c(K.TT);}
        public double ToWattHours(){return c(K.WH);}
        public double ToWattSeconds(){return c(K.WS);}
    }

    /// <summary>
    /// UnitOf.Force()
    /// 
    /// Ex: double foo = new UnitOf.Force().FromNewtons(1.25).ToPoundForces(); //One line conversion from 1.25 Newtons to PoundForces
    /// </summary>
    [Serializable]
    public class Force : B<L>{

        /// <summary>
        /// Method to perform all conversions within Force class.
        /// All "To" methods within Force use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Force foo = new UnitOf.Force().FromNewtons(1.25); //Variable "foo" will be able to convert 1.25 Newtons into any unit of Force
        /// </summary>
        public Force FromAtomicUnitsOfForce(double v){return s(this,v,L.AUF,"AUF");}
        public Force FromAttonewtons(double v){return s(this,v,L.AN,"AN");}
        public Force FromCentinewtons(double v){return s(this,v,L.CN,"CN");}
        public Force FromDecinewtons(double v){return s(this,v,L.DN,"DN");}
        public Force FromDekanewtons(double v){return s(this,v,L.DAN,"DAN");}
        public Force FromDynes(double v){return s(this,v,L.DYN,"DYN");}
        public Force FromExanewtons(double v){return s(this,v,L.EN,"EN");}
        public Force FromFemtonewtons(double v){return s(this,v,L.FN,"FN");}
        public Force FromGiganewtons(double v){return s(this,v,L.GN,"GN");}
        public Force FromGramForces(double v){return s(this,v,L.GF,"GF");}
        public Force FromGraveForces(double v){return s(this,v,L.GFF,"GFF");}
        public Force FromHectonewtons(double v){return s(this,v,L.HN,"HN");}
        public Force FromJouleCentimeters(double v){return s(this,v,L.JCM,"JCM");}
        public Force FromJouleMeters(double v){return s(this,v,L.JM,"JM");}
        public Force FromKilogramForces(double v){return s(this,v,L.KGF,"KGF");}
        public Force FromKilonewtons(double v){return s(this,v,L.KN,"KN");}
        public Force FromKiloponds(double v){return s(this,v,L.KP,"KP");}
        public Force FromKilopoundForces(double v){return s(this,v,L.KIP,"KIP");}
        public Force FromLongTonForces(double v){return s(this,v,L.LTF,"LTF");}
        public Force FromMeganewtons(double v){return s(this,v,L.MN,"MN");}
        public Force FromMetricTonForces(double v){return s(this,v,L.TFM,"TFM");}
        public Force FromMicronewtons(double v){return s(this,v,L.MUN,"MUN");}
        public Force FromMilligraveForces(double v){return s(this,v,L.MGF,"MGF");}
        public Force FromMillinewtons(double v){return s(this,v,L.MILN,"MILN");}
        public Force FromNanonewtons(double v){return s(this,v,L.NN,"NN");}
        public Force FromNewtons(double v){return s(this,v,L.N,"N");}
        public Force FromOunceForces(double v){return s(this,v,L.OZF,"OZF");}
        public Force FromPetanewtons(double v){return s(this,v,L.PEN,"PEN");}
        public Force FromPiconewtons(double v){return s(this,v,L.PN,"PN");}
        public Force FromPonds(double v){return s(this,v,L.P,"P");}
        public Force FromPoundFeetPerSecondSquared(double v){return s(this,v,L.LBFT,"LBFT");}
        public Force FromPoundForces(double v){return s(this,v,L.LBF,"LBF");}
        public Force FromPoundals(double v){return s(this,v,L.PDL,"PDL");}
        public Force FromShortTonForces(double v){return s(this,v,L.TFS,"TFS");}
        public Force FromSthenes(double v){return s(this,v,L.SN,"SN");}
        public Force FromTeranewtons(double v){return s(this,v,L.TN,"TN");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToPoundForces(); //Variable "bar" being of type UnitOf.Force with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Force().FromNewtons(1.25).ToPoundForces(); //One line conversion from 1.25 Newtons to PoundForces
        /// </summary>
        public double ToAtomicUnitsOfForce(){return c(L.AUF);}
        public double ToAttonewtons(){return c(L.AN);}
        public double ToCentinewtons(){return c(L.CN);}
        public double ToDecinewtons(){return c(L.DN);}
        public double ToDekanewtons(){return c(L.DAN);}
        public double ToDynes(){return c(L.DYN);}
        public double ToExanewtons(){return c(L.EN);}
        public double ToFemtonewtons(){return c(L.FN);}
        public double ToGiganewtons(){return c(L.GN);}
        public double ToGramForces(){return c(L.GF);}
        public double ToGraveForces(){return c(L.GFF);}
        public double ToHectonewtons(){return c(L.HN);}
        public double ToJouleCentimeters(){return c(L.JCM);}
        public double ToJouleMeters(){return c(L.JM);}
        public double ToKilogramForces(){return c(L.KGF);}
        public double ToKilonewtons(){return c(L.KN);}
        public double ToKiloponds(){return c(L.KP);}
        public double ToKilopoundForces(){return c(L.KIP);}
        public double ToLongTonForces(){return c(L.LTF);}
        public double ToMeganewtons(){return c(L.MN);}
        public double ToMetricTonForces(){return c(L.TFM);}
        public double ToMicronewtons(){return c(L.MUN);}
        public double ToMilligraveForces(){return c(L.MGF);}
        public double ToMillinewtons(){return c(L.MILN);}
        public double ToNanonewtons(){return c(L.NN);}
        public double ToNewtons(){return c(L.N);}
        public double ToOunceForces(){return c(L.OZF);}
        public double ToPetanewtons(){return c(L.PEN);}
        public double ToPiconewtons(){return c(L.PN);}
        public double ToPonds(){return c(L.P);}
        public double ToPoundFeetPerSecondSquared(){return c(L.LBFT);}
        public double ToPoundForces(){return c(L.LBF);}
        public double ToPoundals(){return c(L.PDL);}
        public double ToShortTonForces(){return c(L.TFS);}
        public double ToSthenes(){return c(L.SN);}
        public double ToTeranewtons(){return c(L.TN);}
    }

    /// <summary>
    /// UnitOf.Frequency()
    /// 
    /// Ex: double foo = new UnitOf.Frequency().FromHertz(1.25).ToCyclesPerSecond(); //One line conversion from 1.25 Hertz to CyclesPerSecond
    /// </summary>
    [Serializable]
    public class Frequency : B<M>{

        /// <summary>
        /// Method to perform all conversions within Frequency class.
        /// All "To" methods within Frequency use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Frequency foo = new UnitOf.Frequency().FromHertz(1.25); //Variable "foo" will be able to convert 1.25 Hertz into any unit of Frequency
        /// </summary>
        public Frequency FromAttohertz(double v){return s(this,v,M.AHZ,"AHZ");}
        public Frequency FromCentihertz(double v){return s(this,v,M.CHZ,"CHZ");}
        public Frequency FromCyclesPerSecond(double v){return s(this,v,M.CS,"CS");}
        public Frequency FromDecihertz(double v){return s(this,v,M.DHZ,"DHZ");}
        public Frequency FromDekahertz(double v){return s(this,v,M.DAHZ,"DAHZ");}
        public Frequency FromExahertz(double v){return s(this,v,M.EHZ,"EHZ");}
        public Frequency FromFemtohertz(double v){return s(this,v,M.FHZ,"FHZ");}
        public Frequency FromGigahertz(double v){return s(this,v,M.GHZ,"GHZ");}
        public Frequency FromHectohertz(double v){return s(this,v,M.HHZ,"HHZ");}
        public Frequency FromHertz(double v){return s(this,v,M.HZ,"HZ");}
        public Frequency FromKilohertz(double v){return s(this,v,M.KHZ,"KHZ");}
        public Frequency FromMegahertz(double v){return s(this,v,M.MHZ,"MHZ");}
        public Frequency FromMicrohertz(double v){return s(this,v,M.MUHZ,"MUHZ");}
        public Frequency FromMillihertz(double v){return s(this,v,M.MIHZ,"MIHZ");}
        public Frequency FromNanohertz(double v){return s(this,v,M.NHZ,"NHZ");}
        public Frequency FromPetahertz(double v){return s(this,v,M.PEHZ,"PEHZ");}
        public Frequency FromPicohertz(double v){return s(this,v,M.PHZ,"PHZ");}
        public Frequency FromRevolutionsPerDay(double v){return s(this,v,M.RD,"RD");}
        public Frequency FromRevolutionsPerHour(double v){return s(this,v,M.RH,"RH");}
        public Frequency FromRevolutionsPerMinute(double v){return s(this,v,M.RM,"RM");}
        public Frequency FromRevolutionsPerSecond(double v){return s(this,v,M.RS,"RS");}
        public Frequency FromTerahertz(double v){return s(this,v,M.THZ,"THZ");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToCyclesPerSecond(); //Variable "bar" being of type UnitOf.Frequency with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Frequency().FromHertz(1.25).ToCyclesPerSecond(); //One line conversion from 1.25 Hertz to CyclesPerSecond
        /// </summary>
        public double ToAttohertz(){return c(M.AHZ);}
        public double ToCentihertz(){return c(M.CHZ);}
        public double ToCyclesPerSecond(){return c(M.CS);}
        public double ToDecihertz(){return c(M.DHZ);}
        public double ToDekahertz(){return c(M.DAHZ);}
        public double ToExahertz(){return c(M.EHZ);}
        public double ToFemtohertz(){return c(M.FHZ);}
        public double ToGigahertz(){return c(M.GHZ);}
        public double ToHectohertz(){return c(M.HHZ);}
        public double ToHertz(){return c(M.HZ);}
        public double ToKilohertz(){return c(M.KHZ);}
        public double ToMegahertz(){return c(M.MHZ);}
        public double ToMicrohertz(){return c(M.MUHZ);}
        public double ToMillihertz(){return c(M.MIHZ);}
        public double ToNanohertz(){return c(M.NHZ);}
        public double ToPetahertz(){return c(M.PEHZ);}
        public double ToPicohertz(){return c(M.PHZ);}
        public double ToRevolutionsPerDay(){return c(M.RD);}
        public double ToRevolutionsPerHour(){return c(M.RH);}
        public double ToRevolutionsPerMinute(){return c(M.RM);}
        public double ToRevolutionsPerSecond(){return c(M.RS);}
        public double ToTerahertz(){return c(M.THZ);}
    }

    /// <summary>
    /// UnitOf.FuelEconomy()
    /// 
    /// Ex: double foo = new UnitOf.FuelEconomy().FromMetersPerCubicMeter(1.25).ToMetersPerLiter(); //One line conversion from 1.25 MetersPerCubicMeter to MetersPerLiter
    /// </summary>
    [Serializable]
    public class FuelEconomy : B<N>{

        /// <summary>
        /// Method to perform all conversions within FuelEconomy class.
        /// All "To" methods within FuelEconomy use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.FuelEconomy foo = new UnitOf.FuelEconomy().FromMetersPerCubicMeter(1.25); //Variable "foo" will be able to convert 1.25 MetersPerCubicMeter into any unit of FuelEconomy
        /// </summary>
        public FuelEconomy FromCentimetersPerLiter(double v){return s(this,v,N.CML,"CML");}
        public FuelEconomy FromDekametersPerLiter(double v){return s(this,v,N.DAML,"DAML");}
        public FuelEconomy FromExametersPerLiter(double v){return s(this,v,N.EML,"EML");}
        public FuelEconomy FromGigametersPerLiter(double v){return s(this,v,N.GML,"GML");}
        public FuelEconomy FromHectometersPerLiter(double v){return s(this,v,N.HML,"HML");}
        public FuelEconomy FromKilometersPerGallonUK(double v){return s(this, v, N.KMGALUK, "KMGALUK");}
        public FuelEconomy FromKilometersPerGallonUS(double v){return s(this,v,N.KMGALUS,"KMGALUS");}
        public FuelEconomy FromKilometersPerLiter(double v){return s(this,v,N.KML,"KML");}
        public FuelEconomy FromMegametersPerLiter(double v){return s(this,v,N.MML,"MML");}
        public FuelEconomy FromMetersPerCubicCentimeter(double v){return s(this, v, N.MCM, "MCM");}
        public FuelEconomy FromMetersPerCubicFoot(double v){return s(this, v, N.MFT, "MFT");}
        public FuelEconomy FromMetersPerCubicInch(double v){return s(this, v, N.MIN, "MIN");}
        public FuelEconomy FromMetersPerCubicMeter(double v){return s(this, v, N.MM, "MM");}
        public FuelEconomy FromMetersPerCubicYard(double v){return s(this, v, N.MYD, "MYD");}
        public FuelEconomy FromMetersPerCupUK(double v){return s(this,v,N.MCUPUK,"MCUPUK");}
        public FuelEconomy FromMetersPerCupUS(double v){return s(this,v,N.MCUPUS,"MCUPUS");}
        public FuelEconomy FromMetersPerFluidOunceUK(double v){return s(this,v,N.MFOZUK,"MFOZUK");}
        public FuelEconomy FromMetersPerFluidOunceUS(double v){return s(this,v,N.MFOZUS,"MFOZUS");}
        public FuelEconomy FromMetersPerGallonUK(double v){return s(this,v,N.MGALUK,"MGALUK");}
        public FuelEconomy FromMetersPerGallonUS(double v){return s(this, v, N.MGALUS, "MGALUS");}
        public FuelEconomy FromMetersPerLiter(double v){return s(this,v,N.ML,"ML");}
        public FuelEconomy FromMetersPerPintUK(double v){return s(this,v,N.MPTUK,"MPTUK");}
        public FuelEconomy FromMetersPerPintUS(double v){return s(this,v,N.MPTUS,"MPTUS");}
        public FuelEconomy FromMetersPerQuartUK(double v){return s(this,v,N.MQTUK,"MQTUK");}
        public FuelEconomy FromMetersPerQuartUS(double v){return s(this,v,N.MQTUS,"MQTUS");}
        public FuelEconomy FromMilesPerGallonUK(double v){return s(this,v,N.MIGALUK,"MIGALUK");}
        public FuelEconomy FromMilesPerGallonUS(double v){return s(this,v,N.MIGALUS,"MIGALUS");}
        public FuelEconomy FromMilesPerLiterUS(double v){return s(this,v,N.MIL,"MIL");}
        public FuelEconomy FromNauticalMilesPerGallonUS(double v){return s(this,v,N.NMIGAL,"NMIGAL");}
        public FuelEconomy FromNauticalMilesPerLiter(double v){return s(this,v,N.NMIL,"NMIL");}
        public FuelEconomy FromPetametersPerLiter(double v){return s(this,v,N.PML,"PML");}
        public FuelEconomy FromTerametersPerLiter(double v){return s(this,v,N.TML,"TML");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToMetersPerLiter(); //Variable "bar" being of type UnitOf.FuelEconomy with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.FuelEconomy().FromMetersPerCubicMeter(1.25).ToMetersPerLiter(); //One line conversion from 1.25 MetersPerCubicMeter to MetersPerLiter
        /// </summary>
        public double ToCentimetersPerLiter(){return c(N.CML);}
        public double ToDekametersPerLiter(){return c(N.DAML);}
        public double ToExametersPerLiter(){return c(N.EML);}
        public double ToGigametersPerLiter(){return c(N.GML);}
        public double ToHectometersPerLiter(){return c(N.HML);}
        public double ToKilometersPerGallonUK(){return c(N.KMGALUK);}
        public double ToKilometersPerGallonUS(){return c(N.KMGALUS);}
        public double ToKilometersPerLiter(){return c(N.KML);}
        public double ToMegametersPerLiter(){return c(N.MML);}
        public double ToMetersPerCubicCentimeter(){return c(N.MCM);}
        public double ToMetersPerCubicFoot(){return c(N.MFT);}
        public double ToMetersPerCubicInch(){return c(N.MIN);}
        public double ToMetersPerCubicMeter(){return c(N.MM);}
        public double ToMetersPerCubicYard(){return c(N.MYD);}
        public double ToMetersPerCupUK(){return c(N.MCUPUK);}
        public double ToMetersPerCupUS(){return c(N.MCUPUS);}
        public double ToMetersPerFluidOunceUK(){return c(N.MFOZUK);}
        public double ToMetersPerFluidOunceUS(){return c(N.MFOZUS);}
        public double ToMetersPerGallonUK(){return c(N.MGALUK);}
        public double ToMetersPerGallonUS(){return c(N.MGALUS);}
        public double ToMetersPerLiter(){return c(N.ML);}
        public double ToMetersPerPintUK(){return c(N.MPTUK);}
        public double ToMetersPerPintUS(){return c(N.MPTUS);}
        public double ToMetersPerQuartUK(){return c(N.MQTUK);}
        public double ToMetersPerQuartUS(){return c(N.MQTUS);}
        public double ToMilesPerGallonUK(){return c(N.MIGALUK);}
        public double ToMilesPerGallonUS(){return c(N.MIGALUS);}
        public double ToMilesPerLiterUS(){return c(N.MIL);}
        public double ToNauticalMilesPerGallonUS(){return c(N.NMIGAL);}
        public double ToNauticalMilesPerLiter(){return c(N.NMIL);}
        public double ToPetametersPerLiter(){return c(N.PML);}
        public double ToTerametersPerLiter(){return c(N.TML);}
    }

    /// <summary>
    /// UnitOf.Length()
    /// 
    /// Ex: double foo = new UnitOf.Length().FromMeters(1.25).ToFeet(); //One line conversion from 1.25 Meters to Feet
    /// </summary>
    [Serializable]
    public class Length : B<O>{

        /// <summary>
        /// Method to perform all conversions within Length class.
        /// All "To" methods within Length use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Length foo = new UnitOf.Length().FromMeters(1.25); //Variable "foo" will be able to convert 1.25 Meters into any unit of Length
        /// </summary>
        public Length FromAngstroms(double v){return s(this,v,O.A,"A");}
        public Length FromAttometers(double v){return s(this,v,O.AM,"AM");}
        public Length FromBarleycorns(double v){return s(this,v,O.BC,"BC");}
        public Length FromCablesImperial(double v){return s(this,v,O.CBLIMP,"CBLIMP");}
        public Length FromCablesInternational(double v){return s(this,v,O.CBLIN,"CBLIN");}
        public Length FromCablesUSCustomary(double v){return s(this,v,O.CBLUS,"CBLUS");}
        public Length FromCaliber(double v){return s(this,v,O.CL,"CL");}
        public Length FromCentiinches(double v){return s(this,v,O.CIN,"CIN");}
        public Length FromCentimeters(double v){return s(this,v,O.CM,"CM");}
        public Length FromChains(double v){return s(this,v,O.CH,"CH");}
        public Length FromCubits(double v){return s(this,v,O.CU,"CU");}
        public Length FromDecimeters(double v){return s(this,v,O.DM,"DM");}
        public Length FromDekameters(double v){return s(this,v,O.DAM,"DAM");}
        public Length FromElls(double v){return s(this,v,O.ELL,"ELL");}
        public Length FromExameters(double v){return s(this,v,O.EM,"EM");}
        public Length FromFathoms(double v){return s(this,v,O.FTM,"FTM");}
        public Length FromFeet(double v){return s(this,v,O.FT,"FT");}
        public Length FromFemtometers(double v){return s(this,v,O.FM,"FM");}
        public Length FromFingers(double v){return s(this,v,O.FING,"FING");}
        public Length FromFurlongs(double v){return s(this,v,O.FUR,"FUR");}
        public Length FromGigameters(double v){return s(this,v,O.GM,"GM");}
        public Length FromHands(double v){return s(this,v,O.HAND,"HAND");}
        public Length FromHectometers(double v){return s(this,v,O.HM,"HM");}
        public Length FromInches(double v){return s(this,v,O.IN,"IN");}
        public Length FromKilometers(double v){return s(this,v,O.KM,"KM");}
        public Length FromKiloyards(double v){return s(this,v,O.KYD,"KYD");}
        public Length FromLeagues(double v){return s(this,v,O.LEA,"LEA");}
        public Length FromLightYears(double v){return s(this,v,O.LY,"LY");}
        public Length FromLinks(double v){return s(this,v,O.LNK,"LNK");}
        public Length FromMegameters(double v){return s(this,v,O.MM,"MM");}
        public Length FromMeters(double v){return s(this,v,O.M,"M");}
        public Length FromMicroinches(double v){return s(this,v,O.MUIN,"MUIN");}
        public Length FromMicrometers(double v){return s(this,v,O.MUM,"MUM");}
        public Length FromMicrons(double v){return s(this,v,O.MURM,"MURM");}
        public Length FromMiles(double v){return s(this,v,O.MI,"MI");}
        public Length FromMillimeters(double v){return s(this,v,O.MILM,"MILM");}
        public Length FromNails(double v){return s(this,v,O.NAIL,"NAIL");}
        public Length FromNanometers(double v){return s(this,v,O.NM,"NM");}
        public Length FromNauticalLeaguesInternational(double v){return s(this,v,O.NLEAIN,"NLEAIN");}
        public Length FromNauticalLeaguesUK(double v){return s(this,v,O.NLEAUK,"NLEAUK");}
        public Length FromNauticalMilesInternational(double v){return s(this,v,O.NMIINT,"NMIINT");}
        public Length FromNauticalMilesUK(double v){return s(this,v,O.NMIUK,"NMIUK");}
        public Length FromNauticalMilesUSCustomary(double v){return s(this,v,O.NMIUS,"NMIUS");}
        public Length FromPerches(double v){return s(this,v,O.PER,"PER");}
        public Length FromPetameters(double v){return s(this,v,O.PEM,"PEM");}
        public Length FromPicometers(double v){return s(this,v,O.PM,"PM");}
        public Length FromPoles(double v){return s(this,v,O.POL,"POL");}
        public Length FromRods(double v){return s(this,v,O.RD,"RD");}
        public Length FromRopes(double v){return s(this,v,O.ROPE,"ROPE");}
        public Length FromSpans(double v){return s(this,v,O.SPAN,"SPAN");}
        public Length FromTerameters(double v){return s(this,v,O.TM,"TM");}
        public Length FromThousandthInches(double v){return s(this,v,O.TIN,"TIN");}
        public Length FromYards(double v){return s(this,v,O.YD,"YD");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToFeet(); //Variable "bar" being of type UnitOf.Length with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Length().FromMeters(1.25).ToFeet(); //One line conversion from 1.25 Meters to Feet
        /// </summary>
        public double ToAngstroms(){return c(O.A);}
        public double ToAttometers(){return c(O.AM);}
        public double ToBarleycorns(){return c(O.BC);}
        public double ToCablesImperial(){return c(O.CBLIMP);}
        public double ToCablesInternational(){return c(O.CBLIN);}
        public double ToCablesUSCustomary(){return c(O.CBLUS);}
        public double ToCaliber(){return c(O.CL);}
        public double ToCentiinches(){return c(O.CIN);}
        public double ToCentimeters(){return c(O.CM);}
        public double ToChains(){return c(O.CH);}
        public double ToCubits(){return c(O.CU);}
        public double ToDecimeters(){return c(O.DM);}
        public double ToDekameters(){return c(O.DAM);}
        public double ToElls(){return c(O.ELL);}
        public double ToExameters(){return c(O.EM);}
        public double ToFathoms(){return c(O.FTM);}
        public double ToFeet(){return c(O.FT);}
        public double ToFemtometers(){return c(O.FM);}
        public double ToFingers(){return c(O.FING);}
        public double ToFurlongs(){return c(O.FUR);}
        public double ToGigameters(){return c(O.GM);}
        public double ToHands(){return c(O.HAND);}
        public double ToHectometers(){return c(O.HM);}
        public double ToInches(){return c(O.IN);}
        public double ToKilometers(){return c(O.KM);}
        public double ToKiloyards(){return c(O.KYD);}
        public double ToLeagues(){return c(O.LEA);}
        public double ToLightYears(){return c(O.LY);}
        public double ToLinks(){return c(O.LNK);}
        public double ToMegameters(){return c(O.MM);}
        public double ToMeters(){return c(O.M);}
        public double ToMicroinches(){return c(O.MUIN);}
        public double ToMicrometers(){return c(O.MUM);}
        public double ToMicrons(){return c(O.MURM);}
        public double ToMiles(){return c(O.MI);}
        public double ToMillimeters(){return c(O.MILM);}
        public double ToNails(){return c(O.NAIL);}
        public double ToNanometers(){return c(O.NM);}
        public double ToNauticalLeaguesInternational(){return c(O.NLEAIN);}
        public double ToNauticalLeaguesUK(){return c(O.NLEAUK);}
        public double ToNauticalMilesInternational(){return c(O.NMIINT);}
        public double ToNauticalMilesUK(){return c(O.NMIUK);}
        public double ToNauticalMilesUSCustomary(){return c(O.NMIUS);}
        public double ToPerches(){return c(O.PER);}
        public double ToPetameters(){return c(O.PEM);}
        public double ToPicometers(){return c(O.PM);}
        public double ToPoles(){return c(O.POL);}
        public double ToRods(){return c(O.RD);}
        public double ToRopes(){return c(O.ROPE);}
        public double ToSpans(){return c(O.SPAN);}
        public double ToTerameters(){return c(O.TM);}
        public double ToThousandthInches(){return c(O.TIN);}
        public double ToYards(){return c(O.YD);}
    }

    /// <summary>
    /// UnitOf.Mass()
    /// 
    /// Ex: double foo = new UnitOf.Mass().FromGrams(1.25).ToPounds(); //One line conversion from 1.25 Grams to Pounds
    /// </summary>
    [Serializable]
    public class Mass : B<P>{

        /// <summary>
        /// Method to perform all conversions within Mass class.
        /// All "To" methods within Mass use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Mass foo = new UnitOf.Mass().FromGrams(1.25); //Variable "foo" will be able to convert 1.25 Grams into any unit of Mass
        /// </summary>
        public Mass FromAttograms(double v){return s(this,v,P.AG,"AG");}
        public Mass FromCarats(double v){return s(this,v,P.CT,"CT");}
        public Mass FromCentigrams(double v){return s(this,v,P.CG,"CG");}
        public Mass FromCentners(double v){return s(this,v,P.CWT,"CWT");}
        public Mass FromDecigrams(double v){return s(this,v,P.DG,"DG");}
        public Mass FromDekagrams(double v){return s(this,v,P.DAG,"DAG");}
        public Mass FromExagrams(double v){return s(this,v,P.EG,"EG");}
        public Mass FromFemtograms(double v){return s(this,v,P.FG,"FG");}
        public Mass FromGamma(double v){return s(this,v,P.GAMM,"GAMM");}
        public Mass FromGigagrams(double v){return s(this,v,P.GG,"GG");}
        public Mass FromGrams(double v){return s(this,v,P.G,"G");}
        public Mass FromHectograms(double v){return s(this,v,P.HG,"HG");}
        public Mass FromKilograms(double v){return s(this,v,P.KG,"KG");}
        public Mass FromKilopounds(double v){return s(this,v,P.KIP,"KIP");}
        public Mass FromKilotonsMetric(double v){return s(this,v,P.TK,"TK");}
        public Mass FromMegagrams(double v){return s(this,v,P.MG,"MG");}
        public Mass FromMicrograms(double v){return s(this,v,P.MUG,"MUG");}
        public Mass FromMilligrams(double v){return s(this,v,P.MILG,"MILG");}
        public Mass FromNanograms(double v){return s(this,v,P.NG,"NG");}
        public Mass FromOuncesMetric(double v){return s(this,v,P.MOZ,"MOZ");}
        public Mass FromOuncesUS(double v){return s(this,v,P.USOZ,"USOZ");}
        public Mass FromPetagrams(double v){return s(this,v,P.PEG,"PEG");}
        public Mass FromPicograms(double v){return s(this,v,P.PG,"PG");}
        public Mass FromPounds(double v){return s(this,v,P.LB,"LB");}
        public Mass FromQuintals(double v){return s(this,v,P.QU,"QU");}
        public Mass FromSlugs(double v){return s(this,v,P.SLUG,"SLUG");}
        public Mass FromStonesUK(double v){return s(this,v,P.STUK,"STUK");}
        public Mass FromStonesUS(double v){return s(this,v,P.STUS,"STUS");}
        public Mass FromTeragrams(double v){return s(this,v,P.TG,"TG");}
        public Mass FromTonsImperial(double v){return s(this,v,P.TI,"TI");}
        public Mass FromTonsMetric(double v){return s(this,v,P.TM,"TM");}
        public Mass FromTonsUS(double v){return s(this,v,P.TUS,"TUS");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToPounds(); //Variable "bar" being of type UnitOf.Mass with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Mass().FromGrams(1.25).ToPounds(); //One line conversion from 1.25 Grams to Pounds
        /// </summary>
        public double ToAttograms(){return c(P.AG);}
        public double ToCarats(){return c(P.CT);}
        public double ToCentigrams(){return c(P.CG);}
        public double ToCentners(){return c(P.CWT);}
        public double ToDecigrams(){return c(P.DG);}
        public double ToDekagrams(){return c(P.DAG);}
        public double ToExagrams(){return c(P.EG);}
        public double ToFemtograms(){return c(P.FG);}
        public double ToGamma(){return c(P.GAMM);}
        public double ToGigagrams(){return c(P.GG);}
        public double ToGrams(){return c(P.G);}
        public double ToHectograms(){return c(P.HG);}
        public double ToKilograms(){return c(P.KG);}
        public double ToKilopounds(){return c(P.KIP);}
        public double ToKilotonsMetric(){return c(P.TK);}
        public double ToMegagrams(){return c(P.MG);}
        public double ToMicrograms(){return c(P.MUG);}
        public double ToMilligrams(){return c(P.MILG);}
        public double ToNanograms(){return c(P.NG);}
        public double ToOuncesMetric(){return c(P.MOZ);}
        public double ToOuncesUS(){return c(P.USOZ);}
        public double ToPetagrams(){return c(P.PEG);}
        public double ToPicograms(){return c(P.PG);}
        public double ToPounds(){return c(P.LB);}
        public double ToQuintals(){return c(P.QU);}
        public double ToSlugs(){return c(P.SLUG);}
        public double ToStonesUK(){return c(P.STUK);}
        public double ToStonesUS(){return c(P.STUS);}
        public double ToTeragrams(){return c(P.TG);}
        public double ToTonsImperial(){return c(P.TI);}
        public double ToTonsMetric(){return c(P.TM);}
        public double ToTonsUS(){return c(P.TUS);}  
    }

    /// <summary>
    /// UnitOf.MetricPrefix()
    /// 
    /// Ex: double foo = new UnitOf.MetricPrefix().FromKilo(1.25).ToGiga(); //One line conversion from 1.25 Kilo to Giga
    /// </summary>
    [Serializable]
    public class MetricPrefix : B<Q>{

        /// <summary>
        /// Method to perform all conversions within MetricPrefix class.
        /// All "To" methods within MetricPrefix use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t,false);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.MetricPrefix foo = new UnitOf.MetricPrefix().FromKilo(1.25); //Variable "foo" will be able to convert 1.25 Kilo into any unit of MetricPrefix
        /// </summary>
        public MetricPrefix FromAtto(double v){return s(this,v,Q.A,"A");}
        public MetricPrefix FromCenti(double v){return s(this,v,Q.C,"C");}
        public MetricPrefix FromDeci(double v){return s(this,v,Q.D,"D");}
        public MetricPrefix FromDeka(double v){return s(this,v,Q.DA,"DA");}
        public MetricPrefix FromExa(double v){return s(this,v,Q.E,"E");}
        public MetricPrefix FromFemto(double v){return s(this,v,Q.F,"F");}
        public MetricPrefix FromGiga(double v){return s(this,v,Q.G,"G");}
        public MetricPrefix FromHecto(double v){return s(this,v,Q.H,"H");}
        public MetricPrefix FromKilo(double v){return s(this,v,Q.K,"K");}
        public MetricPrefix FromMega(double v){return s(this,v,Q.M,"M");}
        public MetricPrefix FromMicro(double v){return s(this,v,Q.MU,"MU");}
        public MetricPrefix FromMilli(double v){return s(this,v,Q.MIL,"MIL");}
        public MetricPrefix FromNano(double v){return s(this,v,Q.N,"N");}
        public MetricPrefix FromNoPrefix(double v){return s(this,v,Q.NN,"NN");}
        public MetricPrefix FromPeta(double v){return s(this,v,Q.PE,"PE");}
        public MetricPrefix FromPico(double v){return s(this,v,Q.P,"P");}
        public MetricPrefix FromTera(double v){return s(this,v,Q.T,"T");}
        public MetricPrefix FromYocto(double v){return s(this,v,Q.YO,"YO");}
        public MetricPrefix FromYotta(double v){return s(this,v,Q.Y,"Y");}
        public MetricPrefix FromZepto(double v){return s(this,v,Q.ZO,"ZO");}
        public MetricPrefix FromZetta(double v){return s(this,v,Q.Z,"Z");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToGiga(); //Variable "bar" being of type UnitOf.MetricPrefix with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.MetricPrefix().FromKilo(1.25).ToGiga(); //One line conversion from 1.25 Kilo to Giga
        /// </summary>
        public double ToAtto(){return c(Q.A);}
        public double ToCenti(){return c(Q.C);}
        public double ToDeci(){return c(Q.D);}
        public double ToDeka(){return c(Q.DA);}
        public double ToExa(){return c(Q.E);}
        public double ToFemto(){return c(Q.F);}
        public double ToGiga(){return c(Q.G);}
        public double ToHecto(){return c(Q.H);}
        public double ToKilo(){return c(Q.K);}
        public double ToMega(){return c(Q.M);}
        public double ToMicro(){return c(Q.MU);}
        public double ToMilli(){return c(Q.MIL);}
        public double ToNano(){return c(Q.N);}
        public double ToNoPrefix(){return c(Q.NN);}
        public double ToPeta(){return c(Q.PE);}
        public double ToPico(){return c(Q.P);}
        public double ToTera(){return c(Q.T);}
        public double ToYocto(){return c(Q.YO);}
        public double ToYotta(){return c(Q.Y);}
        public double ToZepto(){return c(Q.ZO);}
        public double ToZetta(){return c(Q.Z);}
    }

    /// <summary>
    /// UnitOf.Pressure()
    /// 
    /// Ex: double foo = new UnitOf.Pressure().FromPascals(1.25).ToKSI(); //One line conversion from 1.25 Pascals to KSI
    /// </summary>
    [Serializable]
    public class Pressure : B<T>{

        /// <summary>
        /// Method to perform all conversions within Pressure class.
        /// All "To" methods within Pressure use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Pressure foo = new UnitOf.Pressure().FromPascals(1.25); //Variable "foo" will be able to convert 1.25 Pascals into any unit of Pressure
        /// </summary>
        public Pressure FromAttopascals(double v){return s(this, v, T.APA, "APA");}
        public Pressure FromBars(double v){return s(this, v, T.BAR, "BAR");}
        public Pressure FromBaryes(double v){return s(this, v, T.BA, "BA");}
        public Pressure FromCentimetersOfMercury0C(double v){return s(this, v, T.CMHG, "CMHG");}
        public Pressure FromCentimetersOfWater4C(double v){return s(this, v, T.CMW4, "CMW4");}
        public Pressure FromCentipascals(double v){return s(this, v, T.CPA, "CPA");}
        public Pressure FromDecibars(double v){return s(this, v, T.DBAR, "DBAR");}
        public Pressure FromDecipascals(double v){return s(this, v, T.DPA, "DPA");}
        public Pressure FromDekapascals(double v){return s(this, v, T.DAPA, "DAPA");}
        public Pressure FromDynesPerSquareCentimeter(double v){return s(this, v, T.DYNCM, "DYNCM");}
        public Pressure FromExapascals(double v){return s(this, v, T.EPA, "EPA");}
        public Pressure FromFeetOfSeaWater(double v){return s(this, v, T.FSW, "FSW");}
        public Pressure FromFeetOfWater4C(double v){return s(this, v, T.FTW4, "FTW4");}
        public Pressure FromFeetOfWater60F(double v){return s(this, v, T.FTW60, "FTW60");}
        public Pressure FromFemtopascals(double v){return s(this, v, T.FPA, "FPA");}
        public Pressure FromGigapascals(double v){return s(this, v, T.GPA, "GPA");}
        public Pressure FromGramsPerSquareCentimeter(double v){return s(this, v, T.GFCM, "GFCM");}
        public Pressure FromHectopascals(double v){return s(this, v, T.HPA, "HPA");}
        public Pressure FromInchesOfMercury32F(double v){return s(this, v, T.INHG32, "INHG32");}
        public Pressure FromInchesOfMercury60F(double v){return s(this, v, T.INHG60, "INHG60");}
        public Pressure FromInchesOfWater4C(double v){return s(this, v, T.INW4, "INW4");}
        public Pressure FromInchesOfWater60F(double v){return s(this, v, T.INW60, "INW60");}
        public Pressure FromKSI(double v){return s(this,v,T.KSI,"KSI");}
        public Pressure FromKilogramsPerSquareCentimeter(double v){return s(this, v, T.KGFCM, "KGFCM");}
        public Pressure FromKilogramsPerSquareMeter(double v){return s(this, v, T.KGFM, "KGFM");}
        public Pressure FromKilogramsPerSquareMillimeter(double v){return s(this, v, T.KFGMM, "KFGMM");}
        public Pressure FromKilonewtonsPerSquareMeter(double v){return s(this, v, T.KNM, "KNM");}
        public Pressure FromKilopascals(double v){return s(this, v, T.KPA, "KPA");}
        public Pressure FromKipsPerSquareInch(double v){return s(this, v, T.KIPFIN, "KIPFIN");}
        public Pressure FromLongTonsPerSquareFoot(double v){return s(this, v, T.TFFTL, "TFFTL");}
        public Pressure FromLongTonsPerSquareInch(double v){return s(this, v, T.TFINL, "TFINL");}
        public Pressure FromMegapascals(double v){return s(this, v, T.MPA, "MPA");}
        public Pressure FromMetersOfSeaWater(double v){return s(this, v, T.MSW, "MSW");}
        public Pressure FromMetersOfWater4C(double v){return s(this, v, T.MW4, "MW4");}
        public Pressure FromMicrobars(double v){return s(this, v, T.MUBAR, "MUBAR");}
        public Pressure FromMicropascals(double v){return s(this, v, T.MUPA, "MUPA");}
        public Pressure FromMillibars(double v){return s(this, v, T.MILBAR, "MILBAR");}
        public Pressure FromMillimetersOfMercury0C(double v){return s(this, v, T.MMHG, "MMHG");}
        public Pressure FromMillimetersOfWater4C(double v){return s(this, v, T.MMW4, "MMW4");}
        public Pressure FromMillipascals(double v){return s(this, v, T.MILPA, "MILPA");}
        public Pressure FromNanopascals(double v){return s(this, v, T.NPA, "NPA");}
        public Pressure FromNewtonsPerSquareCentimeter(double v){return s(this, v, T.NCM, "NCM");}
        public Pressure FromNewtonsPerSquareMeter(double v){return s(this, v, T.NM, "NM");}
        public Pressure FromNewtonsPerSquareMillimeter(double v){return s(this, v, T.NMM, "NMM");}
        public Pressure FromPSI(double v){return s(this,v,T.PSI,"PSI");}
        public Pressure FromPascals(double v){return s(this, v, T.PA, "PA");}
        public Pressure FromPetapascals(double v){return s(this, v, T.PEPA, "PEPA");}
        public Pressure FromPicopascals(double v){return s(this, v, T.PPA, "PPA");}
        public Pressure FromPieze(double v){return s(this,v,T.PIZ,"PIZ");}
        public Pressure FromPoundalsPerSquareFoot(double v){return s(this, v, T.PDLFT, "PDLFT");}
        public Pressure FromPoundsPerSquareFoot(double v){return s(this, v, T.LBFFT, "LBFFT");}
        public Pressure FromPoundsPerSquareInch(double v){return s(this, v, T.LBFIN, "LBFIN");}
        public Pressure FromShortTonsPerSquareFoot(double v){return s(this, v, T.TFFTS, "TFFTS");}
        public Pressure FromShortTonsPerSquareInch(double v){return s(this, v, T.TFINS, "TFINS");}
        public Pressure FromStandardAtmospheres(double v){return s(this, v, T.ATM, "ATM");}
        public Pressure FromSthenesPerSquareMeter(double v){return s(this, v, T.SM, "SM");}
        public Pressure FromTechnicalAtmospheres(double v){return s(this, v, T.AT, "AT");}
        public Pressure FromTerapascals(double v){return s(this, v, T.TPA, "TPA");}
        public Pressure FromTorrs(double v){return s(this, v, T.TORR, "TORR");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToKSI(); //Variable "bar" being of type UnitOf.Pressure with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Pressure().FromPascals(1.25).ToKSI(); //One line conversion from 1.25 Pascals to KSI
        /// </summary>
        public double ToAttopascals(){return c(T.APA);}
        public double ToBars(){return c(T.BAR);}
        public double ToBaryes(){return c(T.BA);}
        public double ToCentimetersOfMercury0C(){return c(T.CMHG);}
        public double ToCentimetersOfWater4C(){return c(T.CMW4);}
        public double ToCentipascals(){return c(T.CPA);}
        public double ToDecibars(){return c(T.DBAR);}
        public double ToDecipascals(){return c(T.DPA);}
        public double ToDekapascals(){return c(T.DAPA);}
        public double ToDynesPerSquareCentimeter(){return c(T.DYNCM);}
        public double ToExapascals(){return c(T.EPA);}
        public double ToFeetOfSeaWater(){return c(T.FSW);}
        public double ToFeetOfWater4C(){return c(T.FTW4);}
        public double ToFeetOfWater60F(){return c(T.FTW60);}
        public double ToFemtopascals(){return c(T.FPA);}
        public double ToGigapascals(){return c(T.GPA);}
        public double ToGramsPerSquareCentimeter(){return c(T.GFCM);}
        public double ToHectopascals(){return c(T.HPA);}
        public double ToInchesOfMercury32F(){return c(T.INHG32);}
        public double ToInchesOfMercury60F(){return c(T.INHG60);}
        public double ToInchesOfWater4C(){return c(T.INW4);}
        public double ToInchesOfWater60F(){return c(T.INW60);}
        public double ToKSI(){return c(T.KSI);}
        public double ToKilogramsPerSquareCentimeter(){return c(T.KGFCM);}
        public double ToKilogramsPerSquareMeter(){return c(T.KGFM);}
        public double ToKilogramsPerSquareMillimeter(){return c(T.KFGMM);}
        public double ToKilonewtonsPerSquareMeter(){return c(T.KNM);}
        public double ToKilopascals(){return c(T.KPA);}
        public double ToKipsPerSquareInch(){return c(T.KIPFIN);}
        public double ToLongTonsPerSquareFoot(){return c(T.TFFTL);}
        public double ToLongTonsPerSquareInch(){return c(T.TFINL);}
        public double ToMegapascals(){return c(T.MPA);}
        public double ToMetersOfSeaWater(){return c(T.MSW);}
        public double ToMetersOfWater4C(){return c(T.MW4);}
        public double ToMicrobars(){return c(T.MUBAR);}
        public double ToMicropascals(){return c(T.MUPA);}
        public double ToMillibars(){return c(T.MILBAR);}
        public double ToMillimetersOfMercury0C(){return c(T.MMHG);}
        public double ToMillimetersOfWater4C(){return c(T.MMW4);}
        public double ToMillipascals(){return c(T.MILPA);}
        public double ToNanopascals(){return c(T.NPA);}
        public double ToNewtonsPerSquareCentimeter(){return c(T.NCM);}
        public double ToNewtonsPerSquareMeter(){return c(T.NM);}
        public double ToNewtonsPerSquareMillimeter(){return c(T.NMM);}
        public double ToPSI(){return c(T.PSI);}
        public double ToPascals(){return c(T.PA);}
        public double ToPetapascals(){return c(T.PEPA);}
        public double ToPicopascals(){return c(T.PPA);}
        public double ToPieze(){return c(T.PIZ);}
        public double ToPoundalsPerSquareFoot(){return c(T.PDLFT);}
        public double ToPoundsPerSquareFoot(){return c(T.LBFFT);}
        public double ToPoundsPerSquareInch(){return c(T.LBFIN);}
        public double ToShortTonsPerSquareFoot(){return c(T.TFFTS);}
        public double ToShortTonsPerSquareInch(){return c(T.TFINS);}
        public double ToStandardAtmospheres(){return c(T.ATM);}
        public double ToSthenesPerSquareMeter(){return c(T.SM);}
        public double ToTechnicalAtmospheres(){return c(T.AT);}
        public double ToTerapascals(){return c(T.TPA);}
        public double ToTorrs(){return c(T.TORR);}
    }

    /// <summary>
    /// UnitOf.Speed()
    /// 
    /// Ex: double foo = new UnitOf.Speed().FromMilesPerHour(1.25).ToKilometersPerHour(); //One line conversion from 1.25 MilesPerHour to KilometersPerHour
    /// </summary>
    [Serializable]
    public class Speed : B<V>{

        /// <summary>
        /// Method to perform all conversions within Speed class.
        /// All "To" methods within Speed use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t,false);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Speed foo = new UnitOf.Speed().FromMilesPerHour(1.25); //Variable "foo" will be able to convert 1.25 MilesPerHour into any unit of Speed
        /// </summary>
        public Speed FromCentimetersPerHour(double v){return s(this,v,V.CMH,"CMH");}
        public Speed FromCentimetersPerMinute(double v){return s(this,v,V.CMM,"CMM");}
        public Speed FromCentimetersPerSecond(double v){return s(this,v,V.CMS,"CMS");}
        public Speed FromEarthsVelocity(double v){return s(this,v,V.EV,"EV");}
        public Speed FromFeetPerHour(double v){return s(this,v,V.FTH,"FTH");}
        public Speed FromFeetPerMinute(double v){return s(this,v,V.FTM,"FTM");}
        public Speed FromFeetPerSecond(double v){return s(this,v,V.FTS,"FTS");}
        public Speed FromFirstCosmicVelocity(double v){return s(this, v, V.CV1, "CV1");}
        public Speed FromInchesPerHour(double v){return s(this,v,V.INH,"INH");}
        public Speed FromInchesPerMinute(double v){return s(this,v,V.INM,"INM");}
        public Speed FromInchesPerSecond(double v){return s(this,v,V.INS,"INS");}
        public Speed FromKilometersPerHour(double v){return s(this,v,V.KMH,"KMH");}
        public Speed FromKilometersPerMinute(double v){return s(this,v,V.KMM,"KMM");}
        public Speed FromKilometersPerSecond(double v){return s(this,v,V.KMS,"KMS");}
        public Speed FromKnots(double v){return s(this,v,V.KN,"KN");}
        public Speed FromLight(double v){return s(this,v,V.C,"C");}
        public Speed FromMach(double v){return s(this,v,V.MA,"MA");}
        public Speed FromMetersPerHour(double v){return s(this,v,V.MH,"MH");}
        public Speed FromMetersPerMinute(double v){return s(this,v,V.MM,"MM");}
        public Speed FromMetersPerSecond(double v){return s(this,v,V.MS,"MS");}
        public Speed FromMilesPerHour(double v){return s(this,v,V.MIH,"MIH");}
        public Speed FromMilesPerMinute(double v){return s(this,v,V.MIM,"MIM");}
        public Speed FromMilesPerSecond(double v){return s(this,v,V.MIS,"MIS");}
        public Speed FromMillimetersPerHour(double v){return s(this,v,V.MMH,"MMH");}
        public Speed FromMillimetersPerMinute(double v){return s(this,v,V.MMM,"MMM");}
        public Speed FromMillimetersPerSecond(double v){return s(this,v,V.MMS,"MMS");}
        public Speed FromSecondCosmicVelocity(double v){return s(this,v,V.CV2,"CV2");}
        public Speed FromSoundsInAir(double v){return s(this, v, V.SA, "SA");}
        public Speed FromSoundsInWater(double v){return s(this, v, V.SW, "SW");}
        public Speed FromThirdCosmicVelocity(double v){return s(this, v, V.CV3, "CV3");}
        public Speed FromYardsPerHour(double v){return s(this,v,V.YH,"YH");}
        public Speed FromYardsPerMinute(double v){return s(this,v,V.YM,"YM");}
        public Speed FromYardsPerSecond(double v){return s(this,v,V.YS,"YS");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToKilometersPerHour(); //Variable "bar" being of type UnitOf.Speed with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Speed().FromMilesPerHour(1.25).ToKilometersPerHour(); //One line conversion from 1.25 MilesPerHour to KilometersPerHour
        /// </summary>
        public double ToCentimetersPerHour(){return c(V.CMH);}
        public double ToCentimetersPerMinute(){return c(V.CMM);}
        public double ToCentimetersPerSecond(){return c(V.CMS);}
        public double ToEarthsVelocity(){return c(V.EV);}
        public double ToFeetPerHour(){return c(V.FTH);}
        public double ToFeetPerMinute(){return c(V.FTM);}
        public double ToFeetPerSecond(){return c(V.FTS);}
        public double ToFirstCosmicVelocity(){return c(V.CV1);}
        public double ToInchesPerHour(){return c(V.INH);}
        public double ToInchesPerMinute(){return c(V.INM);}
        public double ToInchesPerSecond(){return c(V.INS);}
        public double ToKilometersPerHour(){return c(V.KMH);}
        public double ToKilometersPerMinute(){return c(V.KMM);}
        public double ToKilometersPerSecond(){return c(V.KMS);}
        public double ToKnots(){return c(V.KN);}
        public double ToLight(){return c(V.C);}
        public double ToMach(){return c(V.MA);}
        public double ToMetersPerHour(){return c(V.MH);}
        public double ToMetersPerMinute(){return c(V.MM);}
        public double ToMetersPerSecond(){return c(V.MS);}
        public double ToMilesPerHour(){return c(V.MIH);}
        public double ToMilesPerMinute(){return c(V.MIM);}
        public double ToMilesPerSecond(){return c(V.MIS);}
        public double ToMillimetersPerHour(){return c(V.MMH);}
        public double ToMillimetersPerMinute(){return c(V.MMM);}
        public double ToMillimetersPerSecond(){return c(V.MMS);}
        public double ToSecondCosmicVelocity(){return c(V.CV2);}
        public double ToSoundsInAir(){return c(V.SA);}
        public double ToSoundsInWater(){return c(V.SW);}
        public double ToThirdCosmicVelocity(){return c(V.CV3);}
        public double ToYardsPerHour(){return c(V.YH);}
        public double ToYardsPerMinute(){return c(V.YM);}
        public double ToYardsPerSecond(){return c(V.YS);}
    }

    /// <summary>
    /// UnitOf.Temperature()
    /// 
    /// Ex: double foo = new UnitOf.Temperature().FromCelsius(1.25).ToFahrenheit(); //One line conversion from 1.25 Celsius to Fahrenheit
    /// </summary>
    [Serializable]
    public class Temperature : B<W>{

        /// <summary>
        /// Method to perform all conversions within Temperature class.
        /// All "To" methods within Temperature use this method.
        /// </summary>
        private double c(double t){
            return FromCelsiusToType(ToCelsius(me.v, me.t), t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Temperature foo = new UnitOf.Temperature().FromCelsius(1.25); //Variable "foo" will be able to convert 1.25 Celsius into any unit of Temperature
        /// </summary>
        public Temperature FromCelsius(double v){return s(this,v, W.C,"C");}
        public Temperature FromFahrenheit(double v){return s(this,v, W.F,"F");}
        public Temperature FromKelvin(double v){return s(this,v, W.K,"K");}
        public Temperature FromRankine(double v){return s(this,v, W.R,"R");}
        public Temperature FromReaumur(double v){return s(this,v, W.RE,"RE");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToFahrenheit(); //Variable "bar" being of type UnitOf.Temperature with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Temperature().FromCelsius(1.25).ToFahrenheit(); //One line conversion from 1.25 Celsius to Fahrenheit
        /// </summary>
        public double ToCelsius(){return c(W.C);}
        public double ToFahrenheit(){return c(W.F);}
        public double ToKelvin(){return c(W.K);}
        public double ToRankine(){return c(W.R);}
        public double ToReaumur(){return c(W.RE);}

        /// <summary>
        /// Only used in Temperature's conversion method.
        /// converts value passed of any Temperature unit into Celsius
        /// </summary>
        private double ToCelsius(double v, double t){
            switch((int)t){
                case W.F: return (v-32) / 1.8;
                case W.K: return v - 273.15;
                case W.R: return (v - 491.67) * (5.0 / 9.0);
                case W.RE: return v * 1.25;
                default: return v;
            }
        }

        /// <summary>
        /// Only used in Temperature's conversion method.
        /// Converts Celsius value passed into any Temperature unit.
        /// </summary>
        private double FromCelsiusToType(double v, double t){
            switch((int)t){
                case W.F: return (v * 1.8) + 32;
                case W.K: return v + 273.15;
                case W.R: return (v + 273.15) * 1.8;
                case W.RE: return v * 0.8;
                default: return v;
            }
        }
    }

    /// <summary>
    /// UnitOf.Time()
    /// 
    /// Ex: double foo = new UnitOf.Time().FromMinutes(1.25).ToHours(); //One line conversion from 1.25 Minutes to Hours
    /// </summary>
    [Serializable]
    public class Time : B<X>{

        /// <summary>
        /// Method to perform all conversions within Time class.
        /// All "To" methods within Time use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Time foo = new UnitOf.Time().FromMinutes(1.25); //Variable "foo" will be able to convert 1.25 Minutes into any unit of Time
        /// </summary>
        public Time FromAttoseconds(double v){return s(this,v,X.AS,"AS");}
        public Time FromCenturies(double v){return s(this,v,X.C,"C");}
        public Time FromDays(double v){return s(this,v,X.D,"D");}
        public Time FromDecades(double v){return s(this,v,X.DE,"DE");}
        public Time FromFemtoseconds(double v){return s(this,v,X.FS,"FS");}
        public Time FromFortnights(double v){return s(this,v,X.FN,"FN");}
        public Time FromGregorianYears(double v){return s(this,v,X.GY,"GY");}
        public Time FromHours(double v){return s(this,v,X.H,"H");}
        public Time FromJulianYears(double v){return s(this,v,X.JY,"JY");}
        public Time FromLeapYears(double v){return s(this,v,X.LY,"LY");}
        public Time FromMicroseconds(double v){return s(this,v,X.MUS,"MUS");}
        public Time FromMillenniums(double v){return s(this,v,X.M,"M");}
        public Time FromMilliseconds(double v){return s(this,v,X.MS,"MS");}
        public Time FromMinutes(double v){return s(this,v,X.MIN,"MIN");}
        public Time FromMonths(double v){return s(this,v,X.MON,"MON");}
        public Time FromNanoseconds(double v){return s(this,v,X.NS,"NS");}
        public Time FromPicoseconds(double v){return s(this,v,X.PS,"PS");}
        public Time FromSeconds(double v){return s(this,v,X.S,"S");}
        public Time FromWeeks(double v){return s(this,v,X.WK,"WK");}
        public Time FromYears(double v){return s(this,v,X.Y,"Y");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToHours(); //Variable "bar" being of type UnitOf.Time with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Time().FromMinutes(1.25).ToHours(); //One line conversion from 1.25 Minutes to Hours
        /// </summary>
        public double ToAttoseconds(){return c(X.AS);}
        public double ToCenturies(){return c(X.C);}
        public double ToDays(){return c(X.D);}
        public double ToDecades(){return c(X.DE);}
        public double ToFemtoseconds(){return c(X.FS);}
        public double ToFortnights(){return c(X.FN);}
        public double ToGregorianYears(){return c(X.GY);}
        public double ToHours(){return c(X.H);}
        public double ToJulianYears(){return c(X.JY);}
        public double ToLeapYears(){return c(X.LY);}
        public double ToMicroseconds(){return c(X.MUS);}
        public double ToMillenniums(){return c(X.M);}
        public double ToMilliseconds(){return c(X.MS);}
        public double ToMinutes(){return c(X.MIN);}
        public double ToMonths(){return c(X.MON);}
        public double ToNanoseconds(){return c(X.NS);}
        public double ToPicoseconds(){return c(X.PS);}
        public double ToSeconds(){return c(X.S);}
        public double ToWeeks(){return c(X.WK);}
        public double ToYears(){return c(X.Y);}
    }

    /// <summary>
    /// UnitOf.Torque()
    /// 
    /// Ex: double foo = new UnitOf.Torque().FromNewtonMeters(1.25).ToGramMeters(); //One line conversion from 1.25 NewtonMeters to GramMeters
    /// </summary>
    [Serializable]
    public class Torque : B<Y>{

        /// <summary>
        /// Method to perform all conversions within Torque class.
        /// All "To" methods within Torque use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Torque foo = new UnitOf.Torque().FromNewtonMeters(1.25); //Variable "foo" will be able to convert 1.25 NewtonMeters into any unit of Torque
        /// </summary>
        public Torque FromDyneCentimeters(double v){return s(this,v,Y.DYNCM,"DYNCM");}
        public Torque FromDyneMeters(double v){return s(this,v,Y.DYNM,"DYNM");}
        public Torque FromDyneMillimeters(double v){return s(this,v,Y.DYNMM,"DYNMM");}
        public Torque FromGramCentimeters(double v){return s(this,v,Y.GFCM,"GFCM");}
        public Torque FromGramMeters(double v){return s(this,v,Y.GFM,"GFM");}
        public Torque FromGramMillimeters(double v){return s(this,v,Y.GFMM,"GFMM");}
        public Torque FromKilogramCentimeters(double v){return s(this,v,Y.KGFCM,"KGFCM");}
        public Torque FromKilogramMeters(double v){return s(this,v,Y.KGFM,"KGFM");}
        public Torque FromKilogramMillimeters(double v){return s(this,v,Y.KGFMM,"KGFMM");}
        public Torque FromKilonewtonMeters(double v){return s(this,v,Y.KNM,"KNM");}
        public Torque FromNewtonCentimeters(double v){return s(this,v,Y.NCM,"NCM");}
        public Torque FromNewtonMeters(double v){return s(this,v,Y.NM,"NM");}
        public Torque FromNewtonMillimeters(double v){return s(this,v,Y.NMM,"NMM");}
        public Torque FromOunceFeet(double v){return s(this,v,Y.OZFFT,"OZFFT");}
        public Torque FromOunceInches(double v){return s(this,v,Y.OZFIN,"OZFIN");}
        public Torque FromPoundFeet(double v){return s(this,v,Y.LBFFT,"LBFFT");}
        public Torque FromPoundInches(double v){return s(this,v,Y.LBFIN,"LBFIN");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToGramMeters(); //Variable "bar" being of type UnitOf.Torque with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Torque().FromNewtonMeters(1.25).ToGramMeters(); //One line conversion from 1.25 NewtonMeters to GramMeters
        /// </summary>
        public double ToDyneCentimeters(){return c(Y.DYNCM);}
        public double ToDyneMeters(){return c(Y.DYNM);}
        public double ToDyneMillimeters(){return c(Y.DYNMM);}
        public double ToGramCentimeters(){return c(Y.GFCM);}
        public double ToGramMeters(){return c(Y.GFM);}
        public double ToGramMillimeters(){return c(Y.GFMM);}
        public double ToKilogramCentimeters(){return c(Y.KGFCM);}
        public double ToKilogramMeters(){return c(Y.KGFM);}
        public double ToKilogramMillimeters(){return c(Y.KGFMM);}
        public double ToKilonewtonMeters(){return c(Y.KNM);}
        public double ToNewtonCentimeters(){return c(Y.NCM);}
        public double ToNewtonMeters(){return c(Y.NM);}
        public double ToNewtonMillimeters(){return c(Y.NMM);}
        public double ToOunceFeet(){return c(Y.OZFFT);}
        public double ToOunceInches(){return c(Y.OZFIN);}
        public double ToPoundFeet(){return c(Y.LBFFT);}
        public double ToPoundInches(){return c(Y.LBFIN);}
    }

    /// <summary>
    /// UnitOf.Volume()
    /// 
    /// Ex: double foo = new UnitOf.Volume().FromLiters(1.25).ToCubicMeters(); //One line conversion from 1.25 Liters to CubicMeters
    /// </summary>
    [Serializable]
    public class Volume : B<Z>{

        /// <summary>
        /// Method to perform all conversions within Volume class.
        /// All "To" methods within Volume use this method.
        /// </summary>
        private double c(double t){
            return k(t,me.t);
        }

        /// <summary>
        /// "From" Methods
        /// 
        /// Ex: UnitOf.Volume foo = new UnitOf.Volume().FromLiters(1.25); //Variable "foo" will be able to convert 1.25 Liters into any unit of Volume
        /// </summary>
        public Volume FromAcreFeetUSSurvey(double v){return s(this,v,Z.ACFTUS,"ACFTUS");}
        public Volume FromAcreInches(double v){return s(this,v,Z.ACIN,"ACIN");}
        public Volume FromArceFeet(double v){return s(this,v,Z.ACFTO,"ACFTO");}
        public Volume FromAttoliters(double v){return s(this,v,Z.AL,"AL");}
        public Volume FromBarrelsOfOil(double v){return s(this,v,Z.BBLO,"BBLO");}
        public Volume FromBarrelsUK(double v){return s(this,v,Z.BBLUK,"BBLUK");}
        public Volume FromBarrelsUS(double v){return s(this,v,Z.BBLUS,"BBLUS");}
        public Volume FromBoardFeet(double v){return s(this,v,Z.FBM,"FBM");}
        public Volume FromCentiliters(double v){return s(this,v,Z.CL,"CL");}
        public Volume FromCords(double v){return s(this,v,Z.CORD,"CORD");}
        public Volume FromCubicCentimeters(double v){return s(this, v, Z.CM, "CM");}
        public Volume FromCubicDecimeters(double v){return s(this, v, Z.DM, "DM");}
        public Volume FromCubicFeet(double v){return s(this, v, Z.FT, "FT");}
        public Volume FromCubicInches(double v){return s(this, v, Z.IN, "IN");}
        public Volume FromCubicKilometers(double v){return s(this, v, Z.KM, "KM");}
        public Volume FromCubicMeters(double v){return s(this, v, Z.M, "M");}
        public Volume FromCubicMiles(double v){return s(this, v, Z.MI, "MI");}
        public Volume FromCubicMillimeters(double v){return s(this, v, Z.MM, "MM");}
        public Volume FromCubicYards(double v){return s(this, v, Z.YD, "YD");}
        public Volume FromCupsMetric(double v){return s(this,v,Z.CUPM,"CUPM");}
        public Volume FromCupsUK(double v){return s(this,v,Z.CUPUK,"CUPUK");}
        public Volume FromCupsUS(double v){return s(this,v,Z.CUPUS,"CUPUS");}
        public Volume FromDeciliters(double v){return s(this,v,Z.DL,"DL");}
        public Volume FromDecisteres(double v){return s(this,v,Z.DECI,"DECI");}
        public Volume FromDekaliters(double v){return s(this,v,Z.DAL,"DAL");}
        public Volume FromDekasteres(double v){return s(this,v,Z.DEKA,"DEKA");}
        public Volume FromDessertspoonsUK(double v){return s(this,v,Z.DSTSPNUK,"DSTSPNUK");}
        public Volume FromDessertspoonsUS(double v){return s(this,v,Z.DSTSPNUS,"DSTSPNUS");}
        public Volume FromDrops(double v){return s(this,v,Z.DROP,"DROP");}
        public Volume FromExaliters(double v){return s(this,v,Z.EL,"EL");}
        public Volume FromFemtoliters(double v){return s(this,v,Z.FL,"FL");}
        public Volume FromFluidOuncesUK(double v){return s(this,v,Z.FLOZUK,"FLOZUK");}
        public Volume FromFluidOuncesUS(double v){return s(this,v,Z.FLOZUS,"FLOZUS");}
        public Volume FromGallonsUK(double v){return s(this,v,Z.GALUK,"GALUK");}
        public Volume FromGallonsUS(double v){return s(this,v,Z.GALUS,"GALUS");}
        public Volume FromGigaliters(double v){return s(this,v,Z.GL,"GL");}
        public Volume FromGillsUK(double v){return s(this,v,Z.GILUK,"GILUK");}
        public Volume FromGillsUS(double v){return s(this,v,Z.GILUS,"GILUS");}
        public Volume FromHectoliters(double v){return s(this,v,Z.HL,"HL");}
        public Volume FromHogsheads(double v){return s(this,v,Z.HOG,"HOG");}
        public Volume FromHundredCubicFeet(double v){return s(this, v, Z.CCF, "CCF");}
        public Volume FromKiloliters(double v){return s(this,v,Z.KL,"KL");}
        public Volume FromLiters(double v){return s(this,v,Z.L,"L");}
        public Volume FromMegaliters(double v){return s(this,v,Z.ML,"ML");}
        public Volume FromMicroliters(double v){return s(this,v,Z.MUL,"MUL");}
        public Volume FromMilliliters(double v){return s(this,v,Z.MILL,"MILL");}
        public Volume FromMinimsUK(double v){return s(this,v,Z.MINIUK,"MINIUK");}
        public Volume FromMinimsUS(double v){return s(this,v,Z.MINIUS,"MINIUS");}
        public Volume FromNanoliters(double v){return s(this,v,Z.NL,"NL");}
        public Volume FromPetaliters(double v){return s(this,v,Z.PEL,"PEL");}
        public Volume FromPicoliters(double v){return s(this,v,Z.PL,"PL");}
        public Volume FromPintsUK(double v){return s(this,v,Z.PTUK,"PTUK");}
        public Volume FromPintsUS(double v){return s(this,v,Z.PTUS,"PTUS");}
        public Volume FromQuartsUK(double v){return s(this,v,Z.QTUK,"QTUK");}
        public Volume FromQuartsUS(double v){return s(this,v,Z.QTUS,"QTUS");}
        public Volume FromRegisterTons(double v){return s(this,v,Z.REGTON,"REGTON");}
        public Volume FromSteres(double v){return s(this,v,Z.ST,"ST");}
        public Volume FromTablespoonsMetric(double v){return s(this,v,Z.TBSPM,"TBSPM");}
        public Volume FromTablespoonsUK(double v){return s(this,v,Z.TBSPUK,"TBSPUK");}
        public Volume FromTablespoonsUS(double v){return s(this,v,Z.TBSPUS,"TBSPUS");}
        public Volume FromTeaspoonsMetric(double v){return s(this,v,Z.TSPM,"TSPM");}
        public Volume FromTeaspoonsUK(double v){return s(this,v,Z.TSPUK,"TSPUK");}
        public Volume FromTeaspoonsUS(double v){return s(this,v,Z.TSPUS,"TSPUS");}
        public Volume FromTeraliters(double v){return s(this,v,Z.TL,"TL");}
        public Volume FromTuns(double v){return s(this,v,Z.TUN,"TUN");}

        /// <summary>
        /// "To" Methods
        /// 
        /// Ex 1: double bar = foo.ToCubicMeters(); //Variable "bar" being of type UnitOf.Volume with "From" value already assigned
        /// Ex 2: double foobar = new UnitOf.Volume().FromLiters(1.25).ToCubicMeters(); //One line conversion from 1.25 Liters to CubicMeters
        /// </summary>
        public double ToAcreFeetUSSurvey(){return c(Z.ACFTUS);}
        public double ToAcreInches(){return c(Z.ACIN);}
        public double ToArceFeet(){return c(Z.ACFTO);}
        public double ToAttoliters(){return c(Z.AL);}
        public double ToBarrelsOfOil(){return c(Z.BBLO);}
        public double ToBarrelsUK(){return c(Z.BBLUK);}
        public double ToBarrelsUS(){return c(Z.BBLUS);}
        public double ToBoardFeet(){return c(Z.FBM);}
        public double ToCentiliters(){return c(Z.CL);}
        public double ToCords(){return c(Z.CORD);}
        public double ToCubicCentimeters(){return c(Z.CM);}
        public double ToCubicDecimeters(){return c(Z.DM);}
        public double ToCubicFeet(){return c(Z.FT);}
        public double ToCubicInches(){return c(Z.IN);}
        public double ToCubicKilometers(){return c(Z.KM);}
        public double ToCubicMeters(){return c(Z.M);}
        public double ToCubicMiles(){return c(Z.MI);}
        public double ToCubicMillimeters(){return c(Z.MM);}
        public double ToCubicYards(){return c(Z.YD);}
        public double ToCupsMetric(){return c(Z.CUPM);}
        public double ToCupsUK(){return c(Z.CUPUK);}
        public double ToCupsUS(){return c(Z.CUPUS);}
        public double ToDeciliters(){return c(Z.DL);}
        public double ToDecisteres(){return c(Z.DECI);}
        public double ToDekaliters(){return c(Z.DAL);}
        public double ToDekasteres(){return c(Z.DEKA);}
        public double ToDessertspoonsUK(){return c(Z.DSTSPNUK);}
        public double ToDessertspoonsUS(){return c(Z.DSTSPNUS);}
        public double ToDrops(){return c(Z.DROP);}
        public double ToExaliters(){return c(Z.EL);}
        public double ToFemtoliters(){return c(Z.FL);}
        public double ToFluidOuncesUK(){return c(Z.FLOZUK);}
        public double ToFluidOuncesUS(){return c(Z.FLOZUS);}
        public double ToGallonsUK(){return c(Z.GALUK);}
        public double ToGallonsUS(){return c(Z.GALUS);}
        public double ToGigaliters(){return c(Z.GL);}
        public double ToGillsUK(){return c(Z.GILUK);}
        public double ToGillsUS(){return c(Z.GILUS);}
        public double ToHectoliters(){return c(Z.HL);}
        public double ToHogsheads(){return c(Z.HOG);}
        public double ToHundredCubicFeet(){return c(Z.CCF);}
        public double ToKiloliters(){return c(Z.KL);}
        public double ToLiters(){return c(Z.L);}
        public double ToMegaliters(){return c(Z.ML);}
        public double ToMicroliters(){return c(Z.MUL);}
        public double ToMilliliters(){return c(Z.MILL);}
        public double ToMinimsUK(){return c(Z.MINIUK);}
        public double ToMinimsUS(){return c(Z.MINIUS);}
        public double ToNanoliters(){return c(Z.NL);}
        public double ToPetaliters(){return c(Z.PEL);}
        public double ToPicoliters(){return c(Z.PL);}
        public double ToPintsUK(){return c(Z.PTUK);}
        public double ToPintsUS(){return c(Z.PTUS);}
        public double ToQuartsUK(){return c(Z.QTUK);}
        public double ToQuartsUS(){return c(Z.QTUS);}
        public double ToRegisterTons(){return c(Z.REGTON);}
        public double ToSteres(){return c(Z.ST);}
        public double ToTablespoonsMetric(){return c(Z.TBSPM);}
        public double ToTablespoonsUK(){return c(Z.TBSPUK);}
        public double ToTablespoonsUS(){return c(Z.TBSPUS);}
        public double ToTeaspoonsMetric(){return c(Z.TSPM);}
        public double ToTeaspoonsUK(){return c(Z.TSPUK);}
        public double ToTeaspoonsUS(){return c(Z.TSPUS);}
        public double ToTeraliters(){return c(Z.TL);}
        public double ToTuns(){return c(Z.TUN);}
    }
}