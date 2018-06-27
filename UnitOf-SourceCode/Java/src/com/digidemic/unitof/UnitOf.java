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
 * https://github.com/Digidemic/UnitOf for Code, Documentation, Examples, Feature List, Diagrams, FAQ and more.
 * 
 * UnitOf is also available in C# and JavaScript.
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
 * DataType (Convert any Java data type and more including converting to and from fractions)
 * ElectricCharge
 * Energy / Work
 * Force
 * Frequency
 * FuelEconomy
 * Length
 * Mass
 * MetricPrefix
 * NumericBase
 * Pressure
 * Speed
 * Temperature
 * Time
 * Torque
 * Volume 
 */
public class UnitOf implements Serializable{
    
    /**
     * UnitOf.Acceleration()
     * 
     * Ex: double foo = new UnitOf.Acceleration().fromGravity(1.25).toGalileos(); //One line conversion from 1.25 Gravity to Galileos
     */
    public static class Acceleration extends B<D> implements Serializable{
        
        /*
        Method to perform all conversions within Acceleration class.
        All "to" methods within Acceleration use this method.
        */
        private final double c(D t){        
            return k(t.TO_MS,me.t.TO_MS,false);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Acceleration foo = new UnitOf.Acceleration().fromGravity(1.25); //Variable "foo" will be able to convert 1.25 Gravity into any unit of Acceleration
        */
        public final Acceleration fromAttometersPerSecondSquared(double v){return s(this, v, D.AS);}
        public final Acceleration fromCentimeterPerSecondSquared(double v){return s(this, v, D.CS);}
        public final Acceleration fromDecimetersPerSecondSquared(double v){return s(this, v, D.DS);}
        public final Acceleration fromDekametersPerSecondSquared(double v){return s(this, v, D.DAS);}      
        public final Acceleration fromExametersPerSecondSquared(double v){return s(this, v, D.ES);}
        public final Acceleration fromFeetPerHourPerSecond(double v){return s(this, v, D.FTHS);}       
        public final Acceleration fromFeetPerMinutePerSecond(double v){return s(this, v, D.FTMS);}
        public final Acceleration fromFeetPerSecondSquared(double v){return s(this, v, D.FTS);}
        public final Acceleration fromFemtometersPerSecondSquared(double v){return s(this, v, D.FS);}
        public final Acceleration fromGalileos(double v){return s(this, v, D.GAL);}
        public final Acceleration fromGigametersPerSecondSquared(double v){return s(this, v, D.GS);}
        public final Acceleration fromGravity(double v){return s(this, v, D.G);}
        public final Acceleration fromHectometersPerSecondSquared(double v){return s(this, v, D.HS);}
        public final Acceleration fromInchesPerMinutePerSecond(double v){return s(this, v, D.INMS);}      
        public final Acceleration fromInchesPerSecondSquared(double v){return s(this, v, D.INS);}
        public final Acceleration fromKilometersPerHourPerSecond(double v){return s(this, v, D.KHS);}
        public final Acceleration fromKilometersPerHourSquared(double v){return s(this, v, D.KH);}
        public final Acceleration fromKilometersPerSecondSquared(double v){return s(this, v, D.KS);}
        public final Acceleration fromKnotsPerSecond(double v){return s(this, v, D.KNS);}
        public final Acceleration fromMegametersPerSecondSquared(double v){return s(this, v, D.MGS);}
        public final Acceleration fromMetersPerSecondSquared(double v){return s(this, v, D.MS);}
        public final Acceleration fromMicrogalileos(double v){return s(this, v, D.MUGAL);}
        public final Acceleration fromMicrometersPerSecondSquared(double v){return s(this, v, D.MUS);}
        public final Acceleration fromMilesPerHourPerSecond(double v){return s(this, v, D.MIHS);}     
        public final Acceleration fromMilesPerMinutePerSecond(double v){return s(this, v, D.MIMS);}
        public final Acceleration fromMilesPerSecondSquared(double v){return s(this, v, D.MIS);}
        public final Acceleration fromMilligalileos(double v){return s(this, v, D.MILGAL);}
        public final Acceleration fromMillimetersPerSecondSquared(double v){return s(this, v, D.MILS);}
        public final Acceleration fromNanometersPerSecondSquared(double v){return s(this, v, D.NS);}
        public final Acceleration fromPetametersPerSecondSquared(double v){return s(this, v, D.PES);}
        public final Acceleration fromPicometersPerSecondSquared(double v){return s(this, v, D.PS);}
        public final Acceleration fromTerametersPerSecondSquared(double v){return s(this, v, D.TS);}
        public final Acceleration fromYardsPerSecondSquared(double v){return s(this, v, D.YDS);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toGalileos(); //Variable "bar" being of type UnitOf.Acceleration with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Acceleration().fromGravity(1.25).toGalileos(); //One line conversion from 1.25 Gravity to Galileos
        */
        public final double toAttometersPerSecondSquared(){return c(D.AS);}
        public final double toCentimeterPerSecondSquared(){return c(D.CS);}
        public final double toDecimetersPerSecondSquared(){return c(D.DS);}
        public final double toDekametersPerSecondSquared(){return c(D.DAS);}
        public final double toExametersPerSecondSquared(){return c(D.ES);}
        public final double toFeetPerHourPerSecond(){return c(D.FTHS);}
        public final double toFeetPerMinutePerSecond(){return c(D.FTMS);}
        public final double toFeetPerSecondSquared(){return c(D.FTS);}
        public final double toFemtometersPerSecondSquared(){return c(D.FS);}
        public final double toGalileos(){return c(D.GAL);}
        public final double toGigametersPerSecondSquared(){return c(D.GS);}
        public final double toGravity(){return c(D.G);}
        public final double toHectometersPerSecondSquared(){return c(D.HS);}
        public final double toInchesPerMinutePerSecond(){return c(D.INMS);}
        public final double toInchesPerSecondSquared(){return c(D.INS);}
        public final double toKilometersPerHourPerSecond(){return c(D.KHS);} 
        public final double toKilometersPerHourSquared(){return c(D.KH);} 
        public final double toKilometersPerSecondSquared(){return c(D.KS);}
        public final double toKnotsPerSecond(){return c(D.KNS);}
        public final double toMegametersPerSecondSquared(){return c(D.MGS);}
        public final double toMetersPerSecondSquared(){return c(D.MS);}
        public final double toMicrogalileos(){return c(D.MUGAL);}
        public final double toMicrometersPerSecondSquared(){return c(D.MUS);}
        public final double toMilesPerHourPerSecond(){return c(D.MIHS);}
        public final double toMilesPerMinutePerSecond(){return c(D.MIMS);}
        public final double toMilesPerSecondSquared(){return c(D.MIS);} 
        public final double toMilligalileos(){return c(D.MILGAL);}
        public final double toMillimetersPerSecondSquared(){return c(D.MILS);}
        public final double toNanometersPerSecondSquared(){return c(D.NS);}
        public final double toPetametersPerSecondSquared(){return c(D.PES);}
        public final double toPicometersPerSecondSquared(){return c(D.PS);}
        public final double toTerametersPerSecondSquared(){return c(D.TS);}
        public final double toYardsPerSecondSquared(){return c(D.YDS);}
    }
    
    /**
     * UnitOf.Angle()
     * 
     * Ex: double foo = new UnitOf.Angle().fromDegrees(1.25).toRadians(); //One line conversion from 1.25 Degrees to Radians
     */
    public static class Angle extends B<E> implements Serializable{    
        
        /*
        Method to perform all conversions within Angle class.
        All "to" methods within Angle use this method.
        */
        private final double c(E t){
            return k(t.TO_D,me.t.TO_D);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Angle foo = new UnitOf.Angle().fromDegrees(1.25); //Variable "foo" will be able to convert 1.25 Degrees into any unit of Angle
        */
        public final Angle fromCircles(double v){return s(this,v, E.C);}
        public final Angle fromDegrees(double v){return s(this,v, E.D);}    
        public final Angle fromGradians(double v){return s(this,v, E.G);}
        public final Angle fromMils(double v){return s(this,v, E.MIL);}
        public final Angle fromMinutes(double v){return s(this,v, E.M);}
        public final Angle fromQuadrants(double v){return s(this,v, E.Q);}
        public final Angle fromRadians(double v){return s(this,v, E.RAD);}
        public final Angle fromRevolutions(double v){return s(this,v, E.R);}
        public final Angle fromRightAngles(double v){return s(this,v, E.RA);}
        public final Angle fromSeconds(double v){return s(this,v, E.S);}
        public final Angle fromSextants(double v){return s(this,v, E.SE);}
        public final Angle fromSigns(double v){return s(this,v, E.SI);}
        public final Angle fromTurns(double v){return s(this,v, E.T);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toRadians(); //Variable "bar" being of type UnitOf.Angle with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Angle().fromDegrees(1.25).toRadians(); //One line conversion from 1.25 Degrees to Radians
        */
        public final double toCircles(){return c(E.C);}
        public final double toDegrees(){return c(E.D);}
        public final double toGradians(){return c(E.G);}
        public final double toMils(){return c(E.MIL);}  
        public final double toMinutes(){return c(E.M);}
        public final double toQuadrants(){return c(E.Q);}
        public final double toRadians(){return c(E.RAD);}  
        public final double toRevolutions(){return c(E.R);}
        public final double toRightAngles(){return c(E.RA);}
        public final double toSeconds(){return c(E.S);}
        public final double toSextants(){return c(E.SE);}
        public final double toSigns(){return c(E.SI);}
        public final double toTurns(){return c(E.T);}
    }
    
    /**
     * UnitOf.Anything() - Build your own custom measurement at compile or run-time using the UnitOf methodology
     * 
     * See UnitOf example projects on Github for fully working examples
     */
    public static class Anything implements Serializable{
        private HashMap<Object, Double> u = new HashMap();  //Units available to convert "from" and "to", includes key/value
        private boolean mtd = true; //Multiply then divide conversion algorithm, false will divide then multiply when converting "to"
        private Object kn = "";     //Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name (kn).  
        private double kv = 0;      //Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. UnitOf.Anything() conversion works by converting the starting value to the defined key, then from the key to the desired value (kv).
        private Object fn = "";     //From Unit Name. Unit to be used for conversions. Ex: from passed in was 5 meters, "meters" would be the From Unit Name (fn).
        private double fv = 0;      //From Unit Value. Unit to be used for conversions. Ex: from passed in was 5 meters, 5 would be the From Unit Name (fv).
             
        /**
         * Method to perform all conversions within Anything class
         * @param fc Constant value of "from" unit. Unit starting from factor value.
         * @param cv "from" value passed. Unit value being converted that passed by the user.
         * @param tc Constant value of "to" unit. Unit being converted into factor value.
         * @return Finished conversion. "from" converted into "to" value.
         */
        private final double c(double fc, double cv, double tc){
            return U.i(U.i(cv, tc, mtd), fc, !mtd);
        }

        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet");
         * 
         * @param keyName Key Unit Name. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         */
        public Anything(Object keyName){
            this(keyName, 1);
        }
        
        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",1);
         * 
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param keyValue Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         */
        public Anything(Object keyName, double keyValue){
            this(keyName,keyValue,true,new HashMap());
        }
        
        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",true);
         * 
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param multiplyToKeyThenDivide Multiply then divide conversion algorithm, false will divide then multiply when converting "to"
         */
        public Anything(Object keyName, boolean multiplyToKeyThenDivide){
            this(keyName, 1, multiplyToKeyThenDivide,new HashMap());
        }
         
        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet", new HashMap<Object, Double>(){{put("Meters",0.3048); put("Inches",12.0);}});
         * 
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param units Available units defined by the user what can be converted from and into. This works similarly to enums of each UnitOf measurement. Type HashMap of Objects/Double for the key/value (Ex: Feet/1).
         */
        public Anything(Object keyName, HashMap<Object,Double> units){
            this(keyName, 1, true, units);
        }
        
        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet", new double[]{1,0.3048,12});
         * 
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param units Available units defined by the user what can be converted from and into. This works similarly to enums of each UnitOf measurement. Type Array of doubles: unlike the constructors that uses a HashMap to define the key/value pair (like meters/1), only the value is defined here and is used for both key/value (so 1/1)
         */
        public Anything(Object keyName, double[] units){
            this(keyName, 1, true, U.ah(units));
        }
        
        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",1,true);
         * 
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param keyValue Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param multiplyToKeyThenDivide Multiply then divide conversion algorithm, false will divide then multiply when converting "to"
         */
        public Anything(Object keyName, double keyValue, boolean multiplyToKeyThenDivide){
            this(keyName,keyValue,multiplyToKeyThenDivide,new HashMap());
        }
        
        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",1, new HashMap<Object, Double>(){{put("Meters",0.3048); put("Inches",12.0);}});
         * 
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param keyValue Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param units Available units defined by the user what can be converted from and into. This works similarly to enums of each UnitOf measurement. Type HashMap of Objects/Double for the key/value (Ex: Feet/1).
         */
        public Anything(Object keyName, double keyValue, HashMap<Object,Double> units){
            this(keyName,keyValue,true,units);
        }
        
        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",1, new double[]{1,0.3048,12});
         * 
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param keyValue Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param units Available units defined by the user what can be converted from and into. This works similarly to enums of each UnitOf measurement. Type Array of doubles: unlike the constructors that uses a HashMap to define the key/value pair (like meters/1), only the value is defined here and is used for both key/value (so 1/1)
         */
        public Anything(Object keyName, double keyValue, double[] units){
            this(keyName,keyValue,true,U.ah(units));
        }

        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",1,true, new double[]{1,0.3048,12});
         * 
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param keyValue Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param multiplyToKeyThenDivide Multiply then divide conversion algorithm, false will divide then multiply when converting "to"
         * @param units Available units defined by the user what can be converted from and into. This works similarly to enums of each UnitOf measurement. Type Array of doubles: unlike the constructors that uses a HashMap to define the key/value pair (like meters/1), only the value is defined here and is used for both key/value (so 1/1)
         */
        public Anything(Object keyName, double keyValue, boolean multiplyToKeyThenDivide, double[] units){
            this(keyName,keyValue,multiplyToKeyThenDivide,U.ah(units));
        }
        
        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",1,true, new HashMap<Object, Double>(){{put("Meters",0.3048); put("Inches",12.0);}});
         * 
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param keyValue Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param multiplyToKeyThenDivide Multiply then divide conversion algorithm, false will divide then multiply when converting "to"
         * @param units Available units defined by the user what can be converted from and into. This works similarly to enums of each UnitOf measurement. Type HashMap of Objects/Double for the key/value (Ex: Feet/1).
         */
        public Anything(Object keyName, double keyValue, boolean multiplyToKeyThenDivide, HashMap<Object,Double> units){
            this.kn = nc(keyName);
            this.fn = this.kn;
            this.kv = keyValue;
            this.fv = this.kv;
            this.mtd = multiplyToKeyThenDivide;
            if(units != null){
                this.u = units;
            }
            this.u.put(this.kn, this.kv);   //if collection of units is passed in it is not necessary to include it with the collection of units as it is added/updated here.
        }

        /**
         * Adds or updates a Unit's Name with its associated Value in relation to the Key to the collection of Units.
         * @param nameAndValue Unit Value for the Unit Name in relation to the Key. Unit Name here is also the value.
         */
        public final void addUnit(double nameAndValue){
            addUnit(nameAndValue,nameAndValue);
        }
        
        /**
         * Adds or updates a Unit's Name with its associated Value in relation to the Key to the collection of Units.
         * @param name Unit Name
         * @param val Unit Value for the Unit Name in relation to the Key
         */
        public final void addUnit(Object name, double val){
            Object n = nc(name);
            if(kn.equals(n)){
                kn = n;
                kv = val;
            }
            u.put(n, val);
        }
        
        /**
         * Takes the Unit Name passed and returns the found Unit's Value
         * @param name Unit Name
         * @return Unit Value of the Unit Name passed in. Returns 0.0 if Unit Name cannot be found.
         */
        private final double getUnitValueByName(Object name){
            try{
                return u.get(nc(name));
            } catch(Exception e){
                return u.getOrDefault((new DataType(name)).toDouble(-998.7654),0.0);
            }
        }
        
        /**
         * View the Unit Key Name originally passed in to the .Anything() constructor.
         * Conversion here works by converting the starting value to this key then from the key to the desired value.
         * @return The Unit Key Name
         */
        public final Object getKeyName(){
            return kn;
        }

        /**
         * View the Unit Key Value originally passed in to the .Anything() constructor.
         * Conversion here works by converting the starting value to this key then from the key to the desired value.
         * @return The Unit Key Value
         */
        public final double getKeyValue(){
            return kv;
        }
        
        /**
         * Returns the set "from" Unit Name
         */
        public final Object getFromName(){
            return fn;
        }

        /**
         * Returns the set "from" Unit Value
         */
        public final double getFromValue(){
            return fv;
        }

        /**
         * Initializes the declared new UnitOf.Anything variable with its Unit Name/Value.
         * Following this with UnitOf.Anything's to() will convert this value to the desired type's value
         * @param fromValue Starting Unit Value to be converted
         * @param fromName Starting Unit Name to be converted
         */
        public final void from(Object fromName, double fromValue){
            this.fn = nc(fromName);
            this.fv = fromValue;
        }

        /**
         * Convert the already passed in "from" Unit Name/Value
         * @param toName Convert already passed in "from" Unit into this unit by name
         * @return The finished conversion Value
         */
        public final double to(Object toName){
            return convertNow(fv, fn, toName);
        }
        
        /**
         * One liner conversion, pass in a starting Unit Name/Value to be converted into the desired Unit by Name.
         * @param fromValue Starting Unit Value
         * @param fromName Starting Unit Name
         * @param toName Converting into Unit Name
         * @return The finished conversion Value
         */
        public final double convertNow(double fromValue, Object fromName, Object toName){
            return c(getUnitValueByName(fromName), fromValue, getUnitValueByName(toName));
        }  
        
        /**
         * Safely check and replace Object if null
         * @param o Object to be checked if null
         * @return "null" if null, Object passed in if not null
         */
        private final Object nc(Object o){
            return (o == null) ? "null" : o;
        }
    }
    
    /**
     * UnitOf.Area()
     * 
     * Ex: double foo = new UnitOf.Area().fromSquareMeters(1.25).toAcres(); //One line conversion from 1.25 SquareMeters to Acres
     */
    public static class Area extends B<F> implements Serializable{    
        
        /*
        Method to perform all conversions within Area class.
        All "to" methods within Area use this method.
        */
        private final double c(F t){
            return k(t.TO_M,me.t.TO_M);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Area foo = new UnitOf.Area().fromSquareMeters(1.25); //Variable "foo" will be able to convert 1.25 SquareMeters into any unit of Area
        */
        public final Area fromAcres(double v){return s(this,v, F.AC);}
        public final Area fromAres(double v){return s(this,v, F.A);}
        public final Area fromArpents(double v){return s(this,v, F.AR);}
        public final Area fromBarns(double v){return s(this,v, F.B);}
        public final Area fromCircularInches(double v){return s(this,v, F.CRIN);}
        public final Area fromCircularMils(double v){return s(this,v, F.CRMIL);}
        public final Area fromHectares(double v){return s(this,v, F.HA);}
        public final Area fromHomesteads(double v){return s(this,v, F.HS);}
        public final Area fromRoods(double v){return s(this,v, F.R);}
        public final Area fromSabins(double v){return s(this,v, F.S);}
        public final Area fromSquareCentimeters(double v){return s(this,v, F.C);}
        public final Area fromSquareChains(double v){return s(this,v, F.CH);}
        public final Area fromSquareDecimeters(double v){return s(this,v, F.D);}
        public final Area fromSquareDekameters(double v){return s(this,v, F.DA);}       
        public final Area fromSquareFeet(double v){return s(this,v, F.FT);}
        public final Area fromSquareHectometers(double v){return s(this,v, F.H);}
        public final Area fromSquareInches(double v){return s(this,v, F.IN);}
        public final Area fromSquareKilometers(double v){return s(this,v, F.K);}
        public final Area fromSquareMeters(double v){return s(this,v, F.M);}
        public final Area fromSquareMicrometers(double v){return s(this,v, F.MU);}
        public final Area fromSquareMiles(double v){return s(this,v, F.MI);}
        public final Area fromSquareMillimeters(double v){return s(this,v, F.MIL);}
        public final Area fromSquareNanometers(double v){return s(this,v, F.N);}
        public final Area fromSquarePerches(double v){return s(this,v, F.PE);}
        public final Area fromSquarePoles(double v){return s(this,v, F.PO);}
        public final Area fromSquareRods(double v){return s(this,v, F.ROD);}
        public final Area fromSquareYards(double v){return s(this,v, F.YD);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toAcres(); //Variable "bar" being of type UnitOf.Area with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Area().fromSquareMeters(1.25).toAcres(); //One line conversion from 1.25 SquareMeters to Acres
        */
        public final double toAcres(){return c(F.AC);}
        public final double toAres(){return c(F.A);}
        public final double toArpents(){return c(F.AR);}
        public final double toBarns(){return c(F.B);}
        public final double toCircularInches(){return c(F.CRIN);}
        public final double toCircularMils(){return c(F.CRMIL);}
        public final double toHectares(){return c(F.HA);}
        public final double toHomesteads(){return c(F.HS);}
        public final double toRoods(){return c(F.R);}
        public final double toSabins(){return c(F.S);}
        public final double toSquareCentimeters(){return c(F.C);}
        public final double toSquareChains(){return c(F.CH);}
        public final double toSquareDecimeters(){return c(F.D);}
        public final double toSquareDekameters(){return c(F.DA);}
        public final double toSquareFeet(){return c(F.FT);}
        public final double toSquareHectometers(){return c(F.H);}
        public final double toSquareInches(){return c(F.IN);}
        public final double toSquareKilometers(){return c(F.K);}    
        public final double toSquareMeters(){return c(F.M);}
        public final double toSquareMicrometers(){return c(F.MU);}   
        public final double toSquareMiles(){return c(F.MI);}
        public final double toSquareMillimeters(){return c(F.MIL);}
        public final double toSquareNanometers(){return c(F.N);}   
        public final double toSquarePerches(){return c(F.PE);}
        public final double toSquarePoles(){return c(F.PO);}
        public final double toSquareRods(){return c(F.ROD);}
        public final double toSquareYards(){return c(F.YD);}
    }
    
    /**
     * UnitOf.DataStorage()
     * 
     * Ex: double foo = new UnitOf.DataStorage().fromMegabytes(1.25).toKilobytes(); //One line conversion from 1.25 Megabytes to Kilobytes
     */
    public static class DataStorage extends B<G> implements Serializable{    
        
        /*
        Method to perform all conversions within DataStorage class.
        All "to" methods within DataStorage use this method.
        */
        private final double c(G t){
            return k(t.TO_MB,me.t.TO_MB);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.DataStorage foo = new UnitOf.DataStorage().fromMegabytes(1.25); //Variable "foo" will be able to convert 1.25 Megabytes into any unit of DataStorage
        */
        public final DataStorage fromBits(double v){return s(this, v, G.B);}
        public final DataStorage fromBlocks(double v){return s(this, v, G.BL);}
        public final DataStorage fromBluRay_DoubleLayer(double v){return s(this, v, G.BD2);}       
        public final DataStorage fromBluRay_SingleLayer(double v){return s(this, v, G.BD1);}
        public final DataStorage fromBytes(double v){return s(this, v, G.BY);}
        public final DataStorage fromCDs_74Minutes(double v){return s(this, v, G.CD74);}
        public final DataStorage fromCDs_80Minutes(double v){return s(this, v, G.CD80);}
        public final DataStorage fromDVDs_DoubleSidedDoubleLayer(double v){return s(this, v, G.D22);}
        public final DataStorage fromDVDs_DoubleSidedSingleLayer(double v){return s(this, v, G.D12);}
        public final DataStorage fromDVDs_SingleSidedDoubleLayer(double v){return s(this, v, G.D21);}
        public final DataStorage fromDVDs_SingleSidedSingleLayer(double v){return s(this, v, G.D11);}
        public final DataStorage fromExabits(double v){return s(this, v, G.EBI);}
        public final DataStorage fromExabytes(double v){return s(this, v, G.EB);}
        public final DataStorage fromFloppyDisks_35DD(double v){return s(this, v, G.F35DD);}
        public final DataStorage fromFloppyDisks_35ED(double v){return s(this, v, G.F35ED);}
        public final DataStorage fromFloppyDisks_35HD(double v){return s(this, v, G.F35HD);}
        public final DataStorage fromFloppyDisks_525DD(double v){return s(this, v, G.F525DD);}
        public final DataStorage fromFloppyDisks_525HD(double v){return s(this, v, G.F525HD);}
        public final DataStorage fromGigabits(double v){return s(this, v, G.GBI);}
        public final DataStorage fromGigabytes(double v){return s(this, v, G.GB);}
        public final DataStorage fromKilobits(double v){return s(this, v, G.KBI);}
        public final DataStorage fromKilobytes(double v){return s(this, v, G.KB);}
        public final DataStorage fromMegabits(double v){return s(this, v, G.MBI);}
        public final DataStorage fromMegabytes(double v){return s(this, v, G.MB);}
        public final DataStorage fromNibbles(double v){return s(this, v, G.NI);}
        public final DataStorage fromPetabits(double v){return s(this, v, G.PBI);}
        public final DataStorage fromPetabytes(double v){return s(this, v, G.PB);}
        public final DataStorage fromSIUnitExabits(double v){return s(this, v, G.SIEBI);}
        public final DataStorage fromSIUnitExabytes(double v){return s(this, v, G.SIEB);}
        public final DataStorage fromSIUnitGigabits(double v){return s(this, v, G.SIGBI);}
        public final DataStorage fromSIUnitGigabytes(double v){return s(this, v, G.SIGB);}
        public final DataStorage fromSIUnitKilobits(double v){return s(this, v, G.SIKBI);}
        public final DataStorage fromSIUnitKilobytes(double v){return s(this, v, G.SIKB);}
        public final DataStorage fromSIUnitMegabits(double v){return s(this, v, G.SIMBI);}
        public final DataStorage fromSIUnitMegabytes(double v){return s(this, v, G.SIMB);}
        public final DataStorage fromSIUnitPetabits(double v){return s(this, v, G.SIPBI);}
        public final DataStorage fromSIUnitPetabytes(double v){return s(this, v, G.SIPB);}
        public final DataStorage fromSIUnitTerabits(double v){return s(this, v, G.SITBI);}
        public final DataStorage fromSIUnitTerabytes(double v){return s(this, v, G.SITB);}
        public final DataStorage fromSIUnitYottabits(double v){return s(this, v, G.SIYBI);}
        public final DataStorage fromSIUnitYottabytes(double v){return s(this, v, G.SIYB);}
        public final DataStorage fromSIUnitZettabits(double v){return s(this, v, G.SIZBI);}
        public final DataStorage fromSIUnitZettabytes(double v){return s(this, v, G.SIZB);}
        public final DataStorage fromTerabits(double v){return s(this, v, G.TBI);}
        public final DataStorage fromTerabytes(double v){return s(this, v, G.TB);}
        public final DataStorage fromWords(double v){return s(this, v, G.W);}
        public final DataStorage fromYottabits(double v){return s(this, v, G.YBI);}
        public final DataStorage fromYottabytes(double v){return s(this, v, G.YB);}
        public final DataStorage fromZettabits(double v){return s(this, v, G.ZBI);}
        public final DataStorage fromZettabytes(double v){return s(this, v, G.ZB);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toKilobytes(); //Variable "bar" being of type UnitOf.DataStorage with "from" value already assigned
        Ex 2: double foobar = new UnitOf.DataStorage().fromMegabytes(1.25).toKilobytes(); //One line conversion from 1.25 Megabytes to Kilobytes
        */
        public final double toBits(){return c(G.B);}
        public final double toBlocks(){return c(G.BL);}
        public final double toBluRay_DoubleLayer(){return c(G.BD2);}
        public final double toBluRay_SingleLayer(){return c(G.BD1);}
        public final double toBytes(){return c(G.BY);}
        public final double toCDs_74Minutes(){return c(G.CD74);}
        public final double toCDs_80Minutes(){return c(G.CD80);}
        public final double toDVDs_DoubleSidedDoubleLayer(){return c(G.D22);}
        public final double toDVDs_DoubleSidedSingleLayer(){return c(G.D12);}
        public final double toDVDs_SingleSidedDoubleLayer(){return c(G.D21);}
        public final double toDVDs_SingleSidedSingleLayer(){return c(G.D11);}
        public final double toExabits(){return c(G.EBI);}
        public final double toExabytes(){return c(G.EB);}
        public final double toFloppyDisks_35DD(){return c(G.F35DD);}
        public final double toFloppyDisks_35ED(){return c(G.F35ED);}
        public final double toFloppyDisks_35HD(){return c(G.F35HD);}
        public final double toFloppyDisks_525DD(){return c(G.F525DD);}
        public final double toFloppyDisks_525HD(){return c(G.F525HD);}
        public final double toGigabits(){return c(G.GBI);}
        public final double toGigabytes(){return c(G.GB);}
        public final double toKilobits(){return c(G.KBI);}
        public final double toKilobytes(){return c(G.KB);}
        public final double toMegabits(){return c(G.MBI);}
        public final double toMegabytes(){return c(G.MB);}
        public final double toNibbles(){return c(G.NI);}
        public final double toPetabits(){return c(G.PBI);}
        public final double toPetabytes(){return c(G.PB);}    
        public final double toSIUnitExabits(){return c(G.SIEBI);}
        public final double toSIUnitExabytes(){return c(G.SIEB);}
        public final double toSIUnitGigabits(){return c(G.SIGBI);}
        public final double toSIUnitGigabytes(){return c(G.SIGB);}
        public final double toSIUnitKilobits(){return c(G.SIKBI);}
        public final double toSIUnitKilobytes(){return c(G.SIKB);}
        public final double toSIUnitMegabits(){return c(G.SIMBI);}
        public final double toSIUnitMegabytes(){return c(G.SIMB);}
        public final double toSIUnitPetabits(){return c(G.SIPBI);}
        public final double toSIUnitPetabytes(){return c(G.SIPB);}
        public final double toSIUnitTerabits(){return c(G.SITBI);}
        public final double toSIUnitTerabytes(){return c(G.SITB);}
        public final double toSIUnitYottabits(){return c(G.SIYBI);}
        public final double toSIUnitYottabytes(){return c(G.SIYB);}
        public final double toSIUnitZettabits(){return c(G.SIZBI);}
        public final double toSIUnitZettabytes(){return c(G.SIZB);}   
        public final double toTerabits(){return c(G.TBI);}
        public final double toTerabytes(){return c(G.TB);}
        public final double toWords(){return c(G.W);}
        public final double toYottabits(){return c(G.YBI);}
        public final double toYottabytes(){return c(G.YB);}
        public final double toZettabits(){return c(G.ZBI);}
        public final double toZettabytes(){return c(G.ZB);}
    }
    
    /**
     * UnitOf.DataTransferRate()
     * 
     * Ex: double foo = new UnitOf.DataTransferRate().fromMegabytesPerSecond(1.25).toKilobytesPerSecond(); //One line conversion from 1.25 MegabytesPerSecond to KilobytesPerSecond
     */
    public static class DataTransferRate extends B<H> implements Serializable{    
        
        /*
        Method to perform all conversions within DataTransferRate class.
        All "to" methods within DataTransferRate use this method.
        */
        private final double c(H t){
            return k(t.TO_MBS,me.t.TO_MBS);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.DataTransferRate foo = new UnitOf.DataTransferRate().fromMegabytesPerSecond(1.25); //Variable "foo" will be able to convert 1.25 MegabytesPerSecond into any unit of DataTransferRate
        */
        public final DataTransferRate fromBitsPerSecond(double v){return s(this, v, H.BIS);}
        public final DataTransferRate fromBytesPerSecond(double v){return s(this, v, H.BS);}
        public final DataTransferRate fromEthernetsBase10(double v){return s(this, v, H.E10);}
        public final DataTransferRate fromEthernetsBase100(double v){return s(this, v, H.E100);}
        public final DataTransferRate fromEthernetsBase1000(double v){return s(this, v, H.E1000);}
        public final DataTransferRate fromFireWires400(double v){return s(this, v, H.FW400);}
        public final DataTransferRate fromFireWires800(double v){return s(this, v, H.FW800);}
        public final DataTransferRate fromFireWiresS1600_S3200(double v){return s(this, v, H.FW3200);}
        public final DataTransferRate fromGigabitsPerSecond(double v){return s(this, v, H.GBIS);}
        public final DataTransferRate fromGigabytesPerSecond(double v){return s(this, v, H.GBS);}
        public final DataTransferRate fromISDNsDual(double v){return s(this, v, H.ISDND);}
        public final DataTransferRate fromISDNsSingle(double v){return s(this, v, H.ISDNS);}
        public final DataTransferRate fromKilobitsPerSecond(double v){return s(this, v, H.KBIS);}   
        public final DataTransferRate fromKilobytesPerSecond(double v){return s(this, v, H.KBS);} 
        public final DataTransferRate fromMegabitsPerSecond(double v){return s(this, v, H.MBIS);}
        public final DataTransferRate fromMegabytesPerSecond(double v){return s(this, v, H.MBS);}
        public final DataTransferRate fromModems110b(double v){return s(this, v, H.M110);}
        public final DataTransferRate fromModems1200b(double v){return s(this, v, H.M1200);}
        public final DataTransferRate fromModems14_4k(double v){return s(this, v, H.M14K);}
        public final DataTransferRate fromModems2400b(double v){return s(this, v, H.M2400);}
        public final DataTransferRate fromModems28_8k(double v){return s(this, v, H.M28K);}
        public final DataTransferRate fromModems300b(double v){return s(this, v, H.M300);}
        public final DataTransferRate fromModems33_6k(double v){return s(this, v, H.M33K);}
        public final DataTransferRate fromModems56k(double v){return s(this, v, H.M56K);}
        public final DataTransferRate fromModems9600b(double v){return s(this, v, H.M9600);}
        public final DataTransferRate fromOCs1(double v){return s(this, v, H.OC1);}
        public final DataTransferRate fromOCs12(double v){return s(this, v, H.OC12);}
        public final DataTransferRate fromOCs192(double v){return s(this, v, H.OC192);}
        public final DataTransferRate fromOCs24(double v){return s(this, v, H.OC24);}
        public final DataTransferRate fromOCs3(double v){return s(this, v, H.OC3);}
        public final DataTransferRate fromOCs48(double v){return s(this, v, H.OC48);}
        public final DataTransferRate fromOCs768(double v){return s(this, v, H.OC768);}
        public final DataTransferRate fromPetabitsPerSecond(double v){return s(this, v, H.PBIS);}
        public final DataTransferRate fromPetabytesPerSecond(double v){return s(this, v, H.PBS);}
        public final DataTransferRate fromSIUnitGigabitsPerSecond(double v){return s(this, v, H.SIGBIS);}
        public final DataTransferRate fromSIUnitGigabytesPerSecond(double v){return s(this, v, H.SIGBS);}
        public final DataTransferRate fromSIUnitKilobitsPerSecond(double v){return s(this, v, H.SIKBIS);}   
        public final DataTransferRate fromSIUnitKilobytesPerSecond(double v){return s(this, v, H.SIKBS);} 
        public final DataTransferRate fromSIUnitMegabitsPerSecond(double v){return s(this, v, H.SIMBIS);}
        public final DataTransferRate fromSIUnitMegabytesPerSecond(double v){return s(this, v, H.SIMBS);}
        public final DataTransferRate fromSIUnitPetabitsPerSecond(double v){return s(this, v, H.SIPBIS);}
        public final DataTransferRate fromSIUnitPetabytesPerSecond(double v){return s(this, v, H.SIPBS);}
        public final DataTransferRate fromSIUnitTerabitsPerSecond(double v){return s(this, v, H.SITBIS);}
        public final DataTransferRate fromSIUnitTerabytesPerSecond(double v){return s(this, v, H.SITBS);}
        public final DataTransferRate fromTerabitsPerSecond(double v){return s(this, v, H.TBIS);}
        public final DataTransferRate fromTerabytesPerSecond(double v){return s(this, v, H.TBS);}
        public final DataTransferRate fromUSBs1_0(double v){return s(this, v, H.USB1);}
        public final DataTransferRate fromUSBs2_0(double v){return s(this, v, H.USB2);}
        public final DataTransferRate fromUSBs3_0(double v){return s(this, v, H.USB3);}
        public final DataTransferRate fromUSBs3_1(double v){return s(this, v, H.USB31);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toKilobytesPerSecond(); //Variable "bar" being of type UnitOf.DataTransferRate with "from" value already assigned
        Ex 2: double foobar = new UnitOf.DataTransferRate().fromMegabytesPerSecond(1.25).toKilobytesPerSecond(); //One line conversion from 1.25 MegabytesPerSecond to KilobytesPerSecond
        */
        public final double toBitsPerSecond(){return c(H.BIS);}
        public final double toBytesPerSecond(){return c(H.BS);}
        public final double toEthernetsBase10(){return c(H.E10);}
        public final double toEthernetsBase100(){return c(H.E100);}
        public final double toEthernetsBase1000(){return c(H.E1000);}
        public final double toFireWires400(){return c(H.FW400);}
        public final double toFireWires800(){return c(H.FW800);}
        public final double toFireWiresS1600_S3200(){return c(H.FW3200);}
        public final double toGigabitsPerSecond(){return c(H.GBIS);}
        public final double toGigabytesPerSecond(){return c(H.GBS);}
        public final double toISDNsDual(){return c(H.ISDND);}
        public final double toISDNsSingle(){return c(H.ISDNS);}
        public final double toKilobitsPerSecond(){return c(H.KBIS);}
        public final double toKilobytesPerSecond(){return c(H.KBS);}
        public final double toMegabitsPerSecond(){return c(H.MBIS);}
        public final double toMegabytesPerSecond(){return c(H.MBS);}
        public final double toModems110b(){return c(H.M110);}
        public final double toModems1200b(){return c(H.M1200);}
        public final double toModems14_4k(){return c(H.M14K);}
        public final double toModems2400b(){return c(H.M2400);}
        public final double toModems28_8k(){return c(H.M28K);}
        public final double toModems300b(){return c(H.M300);}
        public final double toModems33_6k(){return c(H.M33K);}
        public final double toModems56k(){return c(H.M56K);}
        public final double toModems9600b(){return c(H.M9600);}
        public final double toOCs1(){return c(H.OC1);}
        public final double toOCs12(){return c(H.OC12);}
        public final double toOCs192(){return c(H.OC192);}
        public final double toOCs24(){return c(H.OC24);}
        public final double toOCs3(){return c(H.OC3);}
        public final double toOCs48(){return c(H.OC48);}
        public final double toOCs768(){return c(H.OC768);}
        public final double toPetabitsPerSecond(){return c(H.PBIS);}
        public final double toPetabytesPerSecond(){return c(H.PBS);}       
        public final double toSIUnitGigabitsPerSecond(){return c(H.SIGBIS);}
        public final double toSIUnitGigabytesPerSecond(){return c(H.SIGBS);}
        public final double toSIUnitKilobitsPerSecond(){return c(H.SIKBIS);}
        public final double toSIUnitKilobytesPerSecond(){return c(H.SIKBS);}
        public final double toSIUnitMegabitsPerSecond(){return c(H.SIMBIS);}
        public final double toSIUnitMegabytesPerSecond(){return c(H.SIMBS);}
        public final double toSIUnitPetabitsPerSecond(){return c(H.SIPBIS);}
        public final double toSIUnitPetabytesPerSecond(){return c(H.SIPBS);}
        public final double toSIUnitTerabitsPerSecond(){return c(H.SITBIS);}
        public final double toSIUnitTerabytesPerSecond(){return c(H.SITBS);}
        public final double toTerabitsPerSecond(){return c(H.TBIS);}
        public final double toTerabytesPerSecond(){return c(H.TBS);}
        public final double toUSBs1_0(){return c(H.USB1);}
        public final double toUSBs2_0(){return c(H.USB2);}
        public final double toUSBs3_0(){return c(H.USB3);}
        public final double toUSBs3_1(){return c(H.USB31);}
    }
    
    /**
     * UnitOf.DataType() - Convert any Java data type and more including converting to and from fractions
     * 
     * Ex 1: double foo1 = new UnitOf.DataType("-12.5").toDouble();     //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toDouble() default value of 0.0d is returned.
     * Ex 2: String foo2 = new UnitOf.DataType(12.5).toFraction("3/2"); //Returns "25/2" from 12.5 (double). If the conversion did fail, the .toFraction() passed default value of "3/2" is returned.
     * Ex 3: double bar1 = new UnitOf.DataType("5/2").toDouble();       //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toDouble() default value of 0.0d is returned.
     * Ex 4: int bar2 = new UnitOf.DataType(null).toInt(7);             //Conversion fails, returns 7 as it is the default passed.
     */
    public static class DataType extends I implements Serializable{
        public DataType(Object v){s(DataType.class, v, (v == null) ? String.valueOf(v) : v.getClass().getSimpleName());}
    }

    /**
     * UnitOf.ElectricCharge()
     * 
     * Ex: double foo = new UnitOf.ElectricCharge().fromCoulombs(1.25).toAmpereHours(); //One line conversion from 1.25 Coulombs to AmpereHours
     */
    public static class ElectricCharge extends B<J> implements Serializable{
        
        /*
        Method to perform all conversions within ElectricCharge class.
        All "to" methods within ElectricCharge use this method.
        */
        private final double c(J t){
            return k(t.TO_MC,me.t.TO_MC);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.ElectricCharge foo = new UnitOf.ElectricCharge().fromCoulombs(1.25); //Variable "foo" will be able to convert 1.25 Coulombs into any unit of ElectricCharge
        */
        public final ElectricCharge fromAbcoulombs(double v){return s(this, v, J.ABC);}
        public final ElectricCharge fromAmpereHours(double v){return s(this, v, J.AH);}
        public final ElectricCharge fromAmpereMinutes(double v){return s(this, v, J.AM);}
        public final ElectricCharge fromAmpereSeconds(double v){return s(this, v, J.AS);}
        public final ElectricCharge fromCoulombs(double v){return s(this, v, J.C);}
        public final ElectricCharge fromEMUsOfCharge(double v){return s(this, v, J.EMU);}
        public final ElectricCharge fromESUsOfCharge(double v){return s(this, v, J.ESU);}
        public final ElectricCharge fromElectronCharge(double v){return s(this, v, J.E);}
        public final ElectricCharge fromFaradVolts(double v){return s(this, v, J.F);}
        public final ElectricCharge fromFaradayCarbon12(double v){return s(this, v, J.FA12);}
        public final ElectricCharge fromFaradayChemistry(double v){return s(this, v, J.FACH);}
        public final ElectricCharge fromFaradayPhysics(double v){return s(this, v, J.FAPH);}
        public final ElectricCharge fromFranklins(double v){return s(this, v, J.FR);}
        public final ElectricCharge fromKilocoulombs(double v){return s(this, v, J.KC);}
        public final ElectricCharge fromMegacoulombs(double v){return s(this, v, J.MC);}
        public final ElectricCharge fromMicrocoulombs(double v){return s(this, v, J.MUC);}
        public final ElectricCharge fromMillicoulombs(double v){return s(this, v, J.MILC);}
        public final ElectricCharge fromNanocoulombs(double v){return s(this, v, J.NC);}
        public final ElectricCharge fromPicocoulombs(double v){return s(this, v, J.PC);}
        public final ElectricCharge fromStatcoulombs(double v){return s(this, v, J.STC);}
             
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toAmpereHours(); //Variable "bar" being of type UnitOf.ElectricCharge with "from" value already assigned
        Ex 2: double foobar = new UnitOf.ElectricCharge().fromCoulombs(1.25).toAmpereHours(); //One line conversion from 1.25 Coulombs to AmpereHours
        */
        public final double toAbcoulombs(){return c(J.ABC);}
        public final double toAmpereHours(){return c(J.AH);}
        public final double toAmpereMinutes(){return c(J.AM);}
        public final double toAmpereSeconds(){return c(J.AS);}
        public final double toCoulombs(){return c(J.C);}
        public final double toEMUsOfCharge(){return c(J.EMU);}
        public final double toESUsOfCharge(){return c(J.ESU);}
        public final double toElectronCharge(){return c(J.E);}
        public final double toFaradVolts(){return c(J.F);}
        public final double toFaradayCarbon12(){return c(J.FA12);}
        public final double toFaradayChemistry(){return c(J.FACH);}
        public final double toFaradayPhysics(){return c(J.FAPH);}
        public final double toFranklins(){return c(J.FR);}
        public final double toKilocoulombs(){return c(J.KC);}
        public final double toMegacoulombs(){return c(J.MC);}
        public final double toMicrocoulombs(){return c(J.MUC);}
        public final double toMillicoulombs(){return c(J.MILC);}
        public final double toNanocoulombs(){return c(J.NC);}
        public final double toPicocoulombs(){return c(J.PC);}
        public final double toStatcoulombs(){return c(J.STC);}
    }
    
    /**
     * UnitOf.Energy() / Work
     * 
     * Ex: double foo = new UnitOf.Energy().fromJoules(1.25).toWattSeconds(); //One line conversion from 1.25 Joules to WattSeconds
     */
    public static class Energy extends B<K> implements Serializable{
        
        /*
        Method to perform all conversions within Energy class.
        All "to" methods within Energy use this method.
        */
        private final double c(K t){
            return k(t.TO_J,me.t.TO_J);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Energy foo = new UnitOf.Energy().fromJoules(1.25); //Variable "foo" will be able to convert 1.25 Joules into any unit of Energy
        */
        public final Energy fromAttojoules(double v){return s(this, v, K.AJ);}
        public final Energy fromBTUsInternationalStandard(double v){return s(this, v, K.BTU);}
        public final Energy fromBTUsThermochemical(double v){return s(this, v, K.BTUTH);}
        public final Energy fromBarrelsOfOilEquivalent(double v){return s(this, v, K.BOE);}
        public final Energy fromCaloriesInternationalSteam(double v){return s(this, v, K.CALIT);}
        public final Energy fromCaloriesNutritional(double v){return s(this, v, K.CALN);}
        public final Energy fromCaloriesThermochemical(double v){return s(this, v, K.CALTH);}
        public final Energy fromDyneCentimeters(double v){return s(this, v, K.DYNCM);}
        public final Energy fromElectronVolts(double v){return s(this, v, K.EV);}
        public final Energy fromErgs(double v){return s(this, v, K.ERG);}
        public final Energy fromFootPounds(double v){return s(this, v, K.FTLBF);}
        public final Energy fromGigajoules(double v){return s(this, v, K.GJ);}
        public final Energy fromGigatonsOfTNT(double v){return s(this, v, K.GT);}
        public final Energy fromGigawattHours(double v){return s(this, v, K.GWH);}
        public final Energy fromGramForceCentimeters(double v){return s(this, v, K.GFCM);}
        public final Energy fromGramForceMeters(double v){return s(this, v, K.GFM);}
        public final Energy fromHartrees(double v){return s(this, v, K.H);}
        public final Energy fromHorsepowerHours(double v){return s(this, v, K.HPH);}
        public final Energy fromHorsepowerHoursMetric(double v){return s(this, v, K.HPHM);}
        public final Energy fromInchOunces(double v){return s(this, v, K.INOZF);}
        public final Energy fromInchPounds(double v){return s(this, v, K.INLBF);}
        public final Energy fromJoules(double v){return s(this, v, K.J);}
        public final Energy fromKilocaloriesInternationalSteam(double v){return s(this, v, K.KCALIT);}
        public final Energy fromKilocaloriesThermochemical(double v){return s(this, v, K.KCALTH);}
        public final Energy fromKiloelectronVolts(double v){return s(this, v, K.KEV);}
        public final Energy fromKilogramForceCentimeters(double v){return s(this, v, K.KGFCM);}
        public final Energy fromKilogramForceMeters(double v){return s(this, v, K.KGFM);}
        public final Energy fromKilogramsOfTNT(double v){return s(this, v, K.KGT);}
        public final Energy fromKilojoules(double v){return s(this, v, K.KJ);}
        public final Energy fromKilopondMeters(double v){return s(this, v, K.KPM);}
        public final Energy fromKilotonsOfTNT(double v){return s(this, v, K.KT);}
        public final Energy fromKilowattHours(double v){return s(this, v, K.KWH);}
        public final Energy fromKilowattSeconds(double v){return s(this, v, K.KWS);}
        public final Energy fromLiterAtmospheres(double v){return s(this, v, K.LA);}
        public final Energy fromMegaBTUsInternationalStandard(double v){return s(this, v, K.MBTU);}
        public final Energy fromMegaelectronVolts(double v){return s(this, v, K.MEV);}
        public final Energy fromMegajoules(double v){return s(this, v, K.MJ);}
        public final Energy fromMegatonsOfTNT(double v){return s(this, v, K.MT);}
        public final Energy fromMegawattHours(double v){return s(this, v, K.MWH);}
        public final Energy fromMicrojoules(double v){return s(this, v, K.MUJ);}
        public final Energy fromMillijoules(double v){return s(this, v, K.MILJ);}
        public final Energy fromNanojoules(double v){return s(this, v, K.NJ);}
        public final Energy fromNewtonMeters(double v){return s(this, v, K.NM);}
        public final Energy fromPlanckEnergy(double v){return s(this, v, K.EP);}
        public final Energy fromPoundalFeet(double v){return s(this, v, K.PDLFT);}
        public final Energy fromRydbergs(double v){return s(this, v, K.RY);}
        public final Energy fromThermsEC(double v){return s(this, v, K.THMEC);}
        public final Energy fromThermsUS(double v){return s(this, v, K.THMUS);}
        public final Energy fromTonsOfTNT(double v){return s(this, v, K.TT);}
        public final Energy fromWattHours(double v){return s(this, v, K.WH);}
        public final Energy fromWattSeconds(double v){return s(this, v, K.WS);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toWattSeconds(); //Variable "bar" being of type UnitOf.Energy with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Energy().fromJoules(1.25).toWattSeconds(); //One line conversion from 1.25 Joules to WattSeconds
        */
        public final double toAttojoules(){return c(K.AJ);}
        public final double toBTUsInternationalStandard(){return c(K.BTU);}
        public final double toBTUsThermochemical(){return c(K.BTUTH);}
        public final double toBarrelsOfOilEquivalent(){return c(K.BOE);}
        public final double toCaloriesInternationalSteam(){return c(K.CALIT);}
        public final double toCaloriesNutritional(){return c(K.CALN);}
        public final double toCaloriesThermochemical(){return c(K.CALTH);}
        public final double toDyneCentimeters(){return c(K.DYNCM);}
        public final double toElectronVolts(){return c(K.EV);}
        public final double toErgs(){return c(K.ERG);}
        public final double toFootPounds(){return c(K.FTLBF);}
        public final double toGigajoules(){return c(K.GJ);}
        public final double toGigatonsOfTNT(){return c(K.GT);}
        public final double toGigawattHours(){return c(K.GWH);}
        public final double toGramForceCentimeters(){return c(K.GFCM);}
        public final double toGramForceMeters(){return c(K.GFM);}
        public final double toHartrees(){return c(K.H);}
        public final double toHorsepowerHours(){return c(K.HPH);}
        public final double toHorsepowerHoursMetric(){return c(K.HPHM);}
        public final double toInchOunces(){return c(K.INOZF);}
        public final double toInchPounds(){return c(K.INLBF);}
        public final double toJoules(){return c(K.J);}
        public final double toKilocaloriesInternationalSteam(){return c(K.KCALIT);}
        public final double toKilocaloriesThermochemical(){return c(K.KCALTH);}
        public final double toKiloelectronVolts(){return c(K.KEV);}
        public final double toKilogramForceCentimeters(){return c(K.KGFCM);}
        public final double toKilogramForceMeters(){return c(K.KGFM);}
        public final double toKilogramsOfTNT(){return c(K.KGT);}
        public final double toKilojoules(){return c(K.KJ);}
        public final double toKilopondMeters(){return c(K.KPM);}
        public final double toKilotonsOfTNT(){return c(K.KT);}
        public final double toKilowattHours(){return c(K.KWH);}
        public final double toKilowattSeconds(){return c(K.KWS);}
        public final double toLiterAtmospheres(){return c(K.LA);}
        public final double toMegaBTUsInternationalStandard(){return c(K.MBTU);}
        public final double toMegaelectronVolts(){return c(K.MEV);}
        public final double toMegajoules(){return c(K.MJ);}
        public final double toMegatonsOfTNT(){return c(K.MT);}
        public final double toMegawattHours(){return c(K.MWH);}
        public final double toMicrojoules(){return c(K.MUJ);}
        public final double toMillijoules(){return c(K.MILJ);}
        public final double toNanojoules(){return c(K.NJ);}
        public final double toNewtonMeters(){return c(K.NM);}
        public final double toPlanckEnergy(){return c(K.EP);}
        public final double toPoundalFeet(){return c(K.PDLFT);}
        public final double toRydbergs(){return c(K.RY);}
        public final double toThermsEC(){return c(K.THMEC);}
        public final double toThermsUS(){return c(K.THMUS);}
        public final double toTonsOfTNT(){return c(K.TT);}
        public final double toWattHours(){return c(K.WH);}      
        public final double toWattSeconds(){return c(K.WS);}
    }
    
    /**
     * UnitOf.Force()
     * 
     * Ex: double foo = new UnitOf.Force().fromNewtons(1.25).toPoundForces(); //One line conversion from 1.25 Newtons to PoundForces
     */
    public static class Force extends B<L> implements Serializable{
        
        /*
        Method to perform all conversions within Force class.
        All "to" methods within Force use this method.
        */
        private final double c(L t){
            return k(t.TO_N,me.t.TO_N);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Force foo = new UnitOf.Force().fromNewtons(1.25); //Variable "foo" will be able to convert 1.25 Newtons into any unit of Force
        */
        public final Force fromAtomicUnitsOfForce(double v){return s(this, v, L.AUF);}
        public final Force fromAttonewtons(double v){return s(this, v, L.AN);}
        public final Force fromCentinewtons(double v){return s(this, v, L.CN);}
        public final Force fromDecinewtons(double v){return s(this, v, L.DN);}
        public final Force fromDekanewtons(double v){return s(this, v, L.DAN);}
        public final Force fromDynes(double v){return s(this, v, L.DYN);}
        public final Force fromExanewtons(double v){return s(this, v, L.EN);}
        public final Force fromFemtonewtons(double v){return s(this, v, L.FN);}
        public final Force fromGiganewtons(double v){return s(this, v, L.GN);}
        public final Force fromGramForces(double v){return s(this, v, L.GF);}
        public final Force fromGraveForces(double v){return s(this, v, L.GFF);}
        public final Force fromHectonewtons(double v){return s(this, v, L.HN);}
        public final Force fromJouleCentimeters(double v){return s(this, v, L.JCM);}
        public final Force fromJouleMeters(double v){return s(this, v, L.JM);}
        public final Force fromKilogramForces(double v){return s(this, v, L.KGF);}
        public final Force fromKilonewtons(double v){return s(this, v, L.KN);}
        public final Force fromKiloponds(double v){return s(this, v, L.KP);}
        public final Force fromKilopoundForces(double v){return s(this, v, L.KIP);}
        public final Force fromLongTonForces(double v){return s(this, v, L.LTF);}
        public final Force fromMeganewtons(double v){return s(this, v, L.MN);}
        public final Force fromMetricTonForces(double v){return s(this, v, L.TFM);}
        public final Force fromMicronewtons(double v){return s(this, v, L.MUN);}
        public final Force fromMilligraveForces(double v){return s(this, v, L.MGF);}
        public final Force fromMillinewtons(double v){return s(this, v, L.MILN);}
        public final Force fromNanonewtons(double v){return s(this, v, L.NN);}
        public final Force fromNewtons(double v){return s(this, v, L.N);}
        public final Force fromOunceForces(double v){return s(this, v, L.OZF);}
        public final Force fromPetanewtons(double v){return s(this, v, L.PEN);}
        public final Force fromPiconewtons(double v){return s(this, v, L.PN);}
        public final Force fromPonds(double v){return s(this, v, L.P);}
        public final Force fromPoundFeetPerSecondSquared(double v){return s(this, v, L.LBFT);}
        public final Force fromPoundForces(double v){return s(this, v, L.LBF);}
        public final Force fromPoundals(double v){return s(this, v, L.PDL);}
        public final Force fromShortTonForces(double v){return s(this, v, L.TFS);}
        public final Force fromSthenes(double v){return s(this, v, L.SN);}
        public final Force fromTeranewtons(double v){return s(this, v, L.TN);}
                
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toPoundForces(); //Variable "bar" being of type UnitOf.Force with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Force().fromNewtons(1.25).toPoundForces(); //One line conversion from 1.25 Newtons to PoundForces
        */
        public final double toAtomicUnitsOfForce(){return c(L.AUF);}
        public final double toAttonewtons(){return c(L.AN);}
        public final double toCentinewtons(){return c(L.CN);}
        public final double toDecinewtons(){return c(L.DN);}
        public final double toDekanewtons(){return c(L.DAN);}
        public final double toDynes(){return c(L.DYN);}
        public final double toExanewtons(){return c(L.EN);}
        public final double toFemtonewtons(){return c(L.FN);}
        public final double toGiganewtons(){return c(L.GN);}
        public final double toGramForces(){return c(L.GF);}
        public final double toGraveForces(){return c(L.GFF);}
        public final double toHectonewtons(){return c(L.HN);}
        public final double toJouleCentimeters(){return c(L.JCM);}
        public final double toJouleMeters(){return c(L.JM);}
        public final double toKilogramForces(){return c(L.KGF);}
        public final double toKilonewtons(){return c(L.KN);}
        public final double toKiloponds(){return c(L.KP);}
        public final double toKilopoundForces(){return c(L.KIP);}
        public final double toLongTonForces(){return c(L.LTF);}
        public final double toMeganewtons(){return c(L.MN);}
        public final double toMetricTonForces(){return c(L.TFM);}
        public final double toMicronewtons(){return c(L.MUN);}
        public final double toMilligraveForces(){return c(L.MGF);}
        public final double toMillinewtons(){return c(L.MILN);}
        public final double toNanonewtons(){return c(L.NN);}
        public final double toNewtons(){return c(L.N);}
        public final double toOunceForces(){return c(L.OZF);}
        public final double toPetanewtons(){return c(L.PEN);}
        public final double toPiconewtons(){return c(L.PN);}
        public final double toPonds(){return c(L.P);}
        public final double toPoundFeetPerSecondSquared(){return c(L.LBFT);}
        public final double toPoundForces(){return c(L.LBF);}
        public final double toPoundals(){return c(L.PDL);}
        public final double toShortTonForces(){return c(L.TFS);}
        public final double toSthenes(){return c(L.SN);}
        public final double toTeranewtons(){return c(L.TN);}    
    }
    
    /**
     * UnitOf.Frequency()
     * 
     * Ex: double foo = new UnitOf.Frequency().fromHertz(1.25).toCyclesPerSecond(); //One line conversion from 1.25 Hertz to CyclesPerSecond
     */
    public static class Frequency extends B<M> implements Serializable{
        
        /*
        Method to perform all conversions within Frequency class.
        All "to" methods within Frequency use this method.
        */
        private final double c(M t){
            return k(t.TO_MHZ,me.t.TO_MHZ);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Frequency foo = new UnitOf.Frequency().fromHertz(1.25); //Variable "foo" will be able to convert 1.25 Hertz into any unit of Frequency
        */
        public final Frequency fromAttohertz(double v){return s(this,v, M.AHZ);}
        public final Frequency fromCentihertz(double v){return s(this,v, M.CHZ);}
        public final Frequency fromCyclesPerSecond(double v){return s(this,v, M.CS);}
        public final Frequency fromDecihertz(double v){return s(this,v, M.DHZ);}
        public final Frequency fromDekahertz(double v){return s(this,v, M.DAHZ);}
        public final Frequency fromExahertz(double v){return s(this,v, M.EHZ);}
        public final Frequency fromFemtohertz(double v){return s(this,v, M.FHZ);}
        public final Frequency fromGigahertz(double v){return s(this,v, M.GHZ);}
        public final Frequency fromHectohertz(double v){return s(this,v, M.HHZ);}
        public final Frequency fromHertz(double v){return s(this,v, M.HZ);}
        public final Frequency fromKilohertz(double v){return s(this,v, M.KHZ);}
        public final Frequency fromMegahertz(double v){return s(this,v, M.MHZ);}
        public final Frequency fromMicrohertz(double v){return s(this,v, M.MUHZ);}
        public final Frequency fromMillihertz(double v){return s(this,v, M.MIHZ);}
        public final Frequency fromNanohertz(double v){return s(this,v, M.NHZ);}
        public final Frequency fromPetahertz(double v){return s(this,v, M.PEHZ);}
        public final Frequency fromPicohertz(double v){return s(this,v, M.PHZ);}
        public final Frequency fromRevolutionsPerDay(double v){return s(this,v, M.RD);}
        public final Frequency fromRevolutionsPerHour(double v){return s(this,v, M.RH);}
        public final Frequency fromRevolutionsPerMinute(double v){return s(this,v, M.RM);}
        public final Frequency fromRevolutionsPerSecond(double v){return s(this,v, M.RS);}
        public final Frequency fromTerahertz(double v){return s(this,v, M.THZ);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toCyclesPerSecond(); //Variable "bar" being of type UnitOf.Frequency with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Frequency().fromHertz(1.25).toCyclesPerSecond(); //One line conversion from 1.25 Hertz to CyclesPerSecond
        */
        public final double toAttohertz(){return c(M.AHZ);}
        public final double toCentihertz(){return c(M.CHZ);}
        public final double toCyclesPerSecond(){return c(M.CS);}
        public final double toDecihertz(){return c(M.DHZ);}
        public final double toDekahertz(){return c(M.DAHZ);}
        public final double toExahertz(){return c(M.EHZ);}
        public final double toFemtohertz(){return c(M.FHZ);}
        public final double toGigahertz(){return c(M.GHZ);}
        public final double toHectohertz(){return c(M.HHZ);}
        public final double toHertz(){return c(M.HZ);}
        public final double toKilohertz(){return c(M.KHZ);}
        public final double toMegahertz(){return c(M.MHZ);}
        public final double toMicrohertz(){return c(M.MUHZ);}
        public final double toMillihertz(){return c(M.MIHZ);}
        public final double toNanohertz(){return c(M.NHZ);}
        public final double toPetahertz(){return c(M.PEHZ);}
        public final double toPicohertz(){return c(M.PHZ);}
        public final double toRevolutionsPerDay(){return c(M.RD);}
        public final double toRevolutionsPerHour(){return c(M.RH);}
        public final double toRevolutionsPerMinute(){return c(M.RM);}
        public final double toRevolutionsPerSecond(){return c(M.RS);}
        public final double toTerahertz(){return c(M.THZ);}
    }
    
    /**
     * UnitOf.FuelEconomy()
     * 
     * Ex: double foo = new UnitOf.FuelEconomy().fromMetersPerCubicMeter(1.25).toMetersPerLiter(); //One line conversion from 1.25 MetersPerCubicMeter to MetersPerLiter
     */
    public static class FuelEconomy extends B<N> implements Serializable{
        
        /*
        Method to perform all conversions within FuelEconomy class.
        All "to" methods within FuelEconomy use this method.
        */
        private final double c(N t){
            return k(t.TO_KML,me.t.TO_KML);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.FuelEconomy foo = new UnitOf.FuelEconomy().fromMetersPerCubicMeter(1.25); //Variable "foo" will be able to convert 1.25 MetersPerCubicMeter into any unit of FuelEconomy
        */
        public final FuelEconomy fromCentimetersPerLiter(double v){return s(this, v, N.CML);}
        public final FuelEconomy fromDekametersPerLiter(double v){return s(this, v, N.DAML);}
        public final FuelEconomy fromExametersPerLiter(double v){return s(this, v, N.EML);}
        public final FuelEconomy fromGigametersPerLiter(double v){return s(this, v, N.GML);}
        public final FuelEconomy fromHectometersPerLiter(double v){return s(this, v, N.HML);}
        public final FuelEconomy fromKilometersPerGallonUK(double v){return s(this, v, N.KMGALUK);}
        public final FuelEconomy fromKilometersPerGallonUS(double v){return s(this, v, N.KMGALUS);}
        public final FuelEconomy fromKilometersPerLiter(double v){return s(this, v, N.KML);}
        public final FuelEconomy fromMegametersPerLiter(double v){return s(this, v, N.MML);}
        public final FuelEconomy fromMetersPerCubicCentimeter(double v){return s(this, v, N.MCM);}
        public final FuelEconomy fromMetersPerCubicFoot(double v){return s(this, v, N.MFT);}
        public final FuelEconomy fromMetersPerCubicInch(double v){return s(this, v, N.MIN);}
        public final FuelEconomy fromMetersPerCubicMeter(double v){return s(this, v, N.MM);}
        public final FuelEconomy fromMetersPerCubicYard(double v){return s(this, v, N.MYD);}
        public final FuelEconomy fromMetersPerCupUK(double v){return s(this, v, N.MCUPUK);}
        public final FuelEconomy fromMetersPerCupUS(double v){return s(this, v, N.MCUPUS);}
        public final FuelEconomy fromMetersPerFluidOunceUK(double v){return s(this, v, N.MFOZUK);}
        public final FuelEconomy fromMetersPerFluidOunceUS(double v){return s(this, v, N.MFOZUS);}
        public final FuelEconomy fromMetersPerGallonUK(double v){return s(this, v, N.MGALUK);}
        public final FuelEconomy fromMetersPerGallonUS(double v){return s(this, v, N.MGALUS);}
        public final FuelEconomy fromMetersPerLiter(double v){return s(this, v, N.ML);}
        public final FuelEconomy fromMetersPerPintUK(double v){return s(this, v, N.MPTUK);}
        public final FuelEconomy fromMetersPerPintUS(double v){return s(this, v, N.MPTUS);}
        public final FuelEconomy fromMetersPerQuartUK(double v){return s(this, v, N.MQTUK);}
        public final FuelEconomy fromMetersPerQuartUS(double v){return s(this, v, N.MQTUS);}
        public final FuelEconomy fromMilesPerGallonUK(double v){return s(this, v, N.MIGALUK);}
        public final FuelEconomy fromMilesPerGallonUS(double v){return s(this, v, N.MIGALUS);}
        public final FuelEconomy fromMilesPerLiterUS(double v){return s(this, v, N.MIL);}
        public final FuelEconomy fromNauticalMilesPerGallonUS(double v){return s(this, v, N.NMIGAL);}
        public final FuelEconomy fromNauticalMilesPerLiter(double v){return s(this, v, N.NMIL);}
        public final FuelEconomy fromPetametersPerLiter(double v){return s(this, v, N.PML);}
        public final FuelEconomy fromTerametersPerLiter(double v){return s(this, v, N.TML);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toMetersPerLiter(); //Variable "bar" being of type UnitOf.FuelEconomy with "from" value already assigned
        Ex 2: double foobar = new UnitOf.FuelEconomy().fromMetersPerCubicMeter(1.25).toMetersPerLiter(); //One line conversion from 1.25 MetersPerCubicMeter to MetersPerLiter
        */
        public final double toCentimetersPerLiter(){return c(N.CML);}
        public final double toDekametersPerLiter(){return c(N.DAML);}
        public final double toExametersPerLiter(){return c(N.EML);}
        public final double toGigametersPerLiter(){return c(N.GML);}
        public final double toHectometersPerLiter(){return c(N.HML);}
        public final double toKilometersPerGallonUK(){return c(N.KMGALUK);}
        public final double toKilometersPerGallonUS(){return c(N.KMGALUS);}
        public final double toKilometersPerLiter(){return c(N.KML);}
        public final double toMegametersPerLiter(){return c(N.MML);}
        public final double toMetersPerCubicCentimeter(){return c(N.MCM);}
        public final double toMetersPerCubicFoot(){return c(N.MFT);}
        public final double toMetersPerCubicInch(){return c(N.MIN);}
        public final double toMetersPerCubicMeter(){return c(N.MM);}
        public final double toMetersPerCubicYard(){return c(N.MYD);}
        public final double toMetersPerCupUK(){return c(N.MCUPUK);}
        public final double toMetersPerCupUS(){return c(N.MCUPUS);}
        public final double toMetersPerFluidOunceUK(){return c(N.MFOZUK);}
        public final double toMetersPerFluidOunceUS(){return c(N.MFOZUS);}
        public final double toMetersPerGallonUK(){return c(N.MGALUK);}
        public final double toMetersPerGallonUS(){return c(N.MGALUS);}
        public final double toMetersPerLiter(){return c(N.ML);}
        public final double toMetersPerPintUK(){return c(N.MPTUK);}
        public final double toMetersPerPintUS(){return c(N.MPTUS);}
        public final double toMetersPerQuartUK(){return c(N.MQTUK);}
        public final double toMetersPerQuartUS(){return c(N.MQTUS);}
        public final double toMilesPerGallonUK(){return c(N.MIGALUK);}
        public final double toMilesPerGallonUS(){return c(N.MIGALUS);}
        public final double toMilesPerLiterUS(){return c(N.MIL);}
        public final double toNauticalMilesPerGallonUS(){return c(N.NMIGAL);}
        public final double toNauticalMilesPerLiter(){return c(N.NMIL);}
        public final double toPetametersPerLiter(){return c(N.PML);}
        public final double toTerametersPerLiter(){return c(N.TML);}
    }
    
    /**
     * UnitOf.Length()
     * 
     * Ex: double foo = new UnitOf.Length().fromMeters(1.25).toFeet(); //One line conversion from 1.25 Meters to Feet
     */
    public static class Length extends B<O> implements Serializable{
        
        /*
        Method to perform all conversions within Length class.
        All "to" methods within Length use this method.
        */
        private final double c(O t){
            return k(t.TO_M,me.t.TO_M);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Length foo = new UnitOf.Length().fromMeters(1.25); //Variable "foo" will be able to convert 1.25 Meters into any unit of Length
        */
        public final Length fromAngstroms(double v){return s(this, v, O.A);}
        public final Length fromAttometers(double v){return s(this, v, O.AM);}
        public final Length fromBarleycorns(double v){return s(this, v, O.BC);}
        public final Length fromCablesImperial(double v){return s(this, v, O.CBLIMP);}
        public final Length fromCablesInternational(double v){return s(this, v, O.CBLIN);}
        public final Length fromCablesUSCustomary(double v){return s(this, v, O.CBLUS);}
        public final Length fromCaliber(double v){return s(this, v, O.CL);}
        public final Length fromCentiinches(double v){return s(this, v, O.CIN);}
        public final Length fromCentimeters(double v){return s(this, v, O.CM);}
        public final Length fromChains(double v){return s(this, v, O.CH);}
        public final Length fromCubits(double v){return s(this, v, O.CU);}
        public final Length fromDecimeters(double v){return s(this, v, O.DM);}
        public final Length fromDekameters(double v){return s(this, v, O.DAM);}
        public final Length fromElls(double v){return s(this, v, O.ELL);}
        public final Length fromExameters(double v){return s(this, v, O.EM);}
        public final Length fromFathoms(double v){return s(this, v, O.FTM);}
        public final Length fromFeet(double v){return s(this, v, O.FT);}
        public final Length fromFemtometers(double v){return s(this, v, O.FM);}
        public final Length fromFingers(double v){return s(this, v, O.FING);}
        public final Length fromFurlongs(double v){return s(this, v, O.FUR);}
        public final Length fromGigameters(double v){return s(this, v, O.GM);}
        public final Length fromHands(double v){return s(this, v, O.HAND);}
        public final Length fromHectometers(double v){return s(this, v, O.HM);}
        public final Length fromInches(double v){return s(this, v, O.IN);}
        public final Length fromKilometers(double v){return s(this, v, O.KM);}
        public final Length fromKiloyards(double v){return s(this, v, O.KYD);}
        public final Length fromLeagues(double v){return s(this, v, O.LEA);}
        public final Length fromLightYears(double v){return s(this, v, O.LY);}
        public final Length fromLinks(double v){return s(this, v, O.LNK);}
        public final Length fromMegameters(double v){return s(this, v, O.MM);}
        public final Length fromMeters(double v){return s(this, v, O.M);}
        public final Length fromMicroinches(double v){return s(this, v, O.MUIN);}
        public final Length fromMicrometers(double v){return s(this, v, O.MUM);}
        public final Length fromMicrons(double v){return s(this, v, O.MURM);}
        public final Length fromMiles(double v){return s(this, v, O.MI);}
        public final Length fromMillimeters(double v){return s(this, v, O.MILM);}
        public final Length fromNails(double v){return s(this, v, O.NAIL);}
        public final Length fromNanometers(double v){return s(this, v, O.NM);}
        public final Length fromNauticalLeaguesInternational(double v){return s(this, v, O.NLEAIN);}
        public final Length fromNauticalLeaguesUK(double v){return s(this, v, O.NLEAUK);}
        public final Length fromNauticalMilesInternational(double v){return s(this, v, O.NMIINT);}
        public final Length fromNauticalMilesUK(double v){return s(this, v, O.NMIUK);}
        public final Length fromNauticalMilesUSCustomary(double v){return s(this, v, O.NMIUS);}
        public final Length fromPerches(double v){return s(this, v, O.PER);}
        public final Length fromPetameters(double v){return s(this, v, O.PEM);}
        public final Length fromPicometers(double v){return s(this, v, O.PM);}
        public final Length fromPoles(double v){return s(this, v, O.POL);}
        public final Length fromRods(double v){return s(this, v, O.RD);}
        public final Length fromRopes(double v){return s(this, v, O.ROPE);}
        public final Length fromSpans(double v){return s(this, v, O.SPAN);}
        public final Length fromTerameters(double v){return s(this, v, O.TM);}
        public final Length fromThousandthInches(double v){return s(this, v, O.TIN);}
        public final Length fromYards(double v){return s(this, v, O.YD);}
                
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toFeet(); //Variable "bar" being of type UnitOf.Length with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Length().fromMeters(1.25).toFeet(); //One line conversion from 1.25 Meters to Feet
        */
        public final double toAngstroms(){return c(O.A);}
        public final double toAttometers(){return c(O.AM);}
        public final double toBarleycorns(){return c(O.BC);}
        public final double toCablesImperial(){return c(O.CBLIMP);}
        public final double toCablesInternational(){return c(O.CBLIN);}
        public final double toCablesUSCustomary(){return c(O.CBLUS);}
        public final double toCaliber(){return c(O.CL);}
        public final double toCentiinches(){return c(O.CIN);}
        public final double toCentimeters(){return c(O.CM);}
        public final double toChains(){return c(O.CH);}
        public final double toCubits(){return c(O.CU);}
        public final double toDecimeters(){return c(O.DM);}
        public final double toDekameters(){return c(O.DAM);}
        public final double toElls(){return c(O.ELL);}
        public final double toExameters(){return c(O.EM);}
        public final double toFathoms(){return c(O.FTM);}
        public final double toFeet(){return c(O.FT);}
        public final double toFemtometers(){return c(O.FM);}
        public final double toFingers(){return c(O.FING);}
        public final double toFurlongs(){return c(O.FUR);}
        public final double toGigameters(){return c(O.GM);}
        public final double toHands(){return c(O.HAND);}
        public final double toHectometers(){return c(O.HM);}
        public final double toInches(){return c(O.IN);}
        public final double toKilometers(){return c(O.KM);}
        public final double toKiloyards(){return c(O.KYD);}
        public final double toLeagues(){return c(O.LEA);}
        public final double toLightYears(){return c(O.LY);}
        public final double toLinks(){return c(O.LNK);}
        public final double toMegameters(){return c(O.MM);}
        public final double toMeters(){return c(O.M);}
        public final double toMicroinches(){return c(O.MUIN);}
        public final double toMicrometers(){return c(O.MUM);}
        public final double toMicrons(){return c(O.MURM);}
        public final double toMiles(){return c(O.MI);}
        public final double toMillimeters(){return c(O.MILM);}
        public final double toNails(){return c(O.NAIL);}
        public final double toNanometers(){return c(O.NM);}
        public final double toNauticalLeaguesInternational(){return c(O.NLEAIN);}
        public final double toNauticalLeaguesUK(){return c(O.NLEAUK);}
        public final double toNauticalMilesInternational(){return c(O.NMIINT);}
        public final double toNauticalMilesUK(){return c(O.NMIUK);}
        public final double toNauticalMilesUSCustomary(){return c(O.NMIUS);}
        public final double toPerches(){return c(O.PER);}
        public final double toPetameters(){return c(O.PEM);}
        public final double toPicometers(){return c(O.PM);}
        public final double toPoles(){return c(O.POL);}
        public final double toRods(){return c(O.RD);}
        public final double toRopes(){return c(O.ROPE);}
        public final double toSpans(){return c(O.SPAN);}
        public final double toTerameters(){return c(O.TM);}
        public final double toThousandthInches(){return c(O.TIN);}
        public final double toYards(){return c(O.YD);}
    }
    
    /**
     * UnitOf.Mass()
     * 
     * Ex: double foo = new UnitOf.Mass().fromGrams(1.25).toPounds(); //One line conversion from 1.25 Grams to Pounds
     */
    public static class Mass extends B<P> implements Serializable{
        
        /*
        Method to perform all conversions within Mass class.
        All "to" methods within Mass use this method.
        */
        private final double c(P t){
            return k(t.TO_G,me.t.TO_G);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Mass foo = new UnitOf.Mass().fromGrams(1.25); //Variable "foo" will be able to convert 1.25 Grams into any unit of Mass
        */
        public final Mass fromAttograms(double v){return s(this, v, P.AG);}
        public final Mass fromCarats(double v){return s(this, v, P.CT);}
        public final Mass fromCentigrams(double v){return s(this, v, P.CG);}
        public final Mass fromCentners(double v){return s(this, v, P.CWT);}
        public final Mass fromDecigrams(double v){return s(this, v, P.DG);}
        public final Mass fromDekagrams(double v){return s(this, v, P.DAG);}
        public final Mass fromExagrams(double v){return s(this, v, P.EG);}
        public final Mass fromFemtograms(double v){return s(this, v, P.FG);}
        public final Mass fromGamma(double v){return s(this, v, P.GAMM);}
        public final Mass fromGigagrams(double v){return s(this, v, P.GG);}
        public final Mass fromGrams(double v){return s(this, v, P.G);}
        public final Mass fromHectograms(double v){return s(this, v, P.HG);}
        public final Mass fromKilograms(double v){return s(this, v, P.KG);}
        public final Mass fromKilopounds(double v){return s(this, v, P.KIP);}
        public final Mass fromKilotonsMetric(double v){return s(this, v, P.TK);}
        public final Mass fromMegagrams(double v){return s(this, v, P.MG);}
        public final Mass fromMicrograms(double v){return s(this, v, P.MUG);}
        public final Mass fromMilligrams(double v){return s(this, v, P.MILG);}
        public final Mass fromNanograms(double v){return s(this, v, P.NG);}
        public final Mass fromOuncesMetric(double v){return s(this, v, P.MOZ);}
        public final Mass fromOuncesUS(double v){return s(this, v, P.USOZ);}
        public final Mass fromPetagrams(double v){return s(this, v, P.PEG);}
        public final Mass fromPicograms(double v){return s(this, v, P.PG);}
        public final Mass fromPounds(double v){return s(this, v, P.LB);}
        public final Mass fromQuintals(double v){return s(this, v, P.QU);}
        public final Mass fromSlugs(double v){return s(this, v, P.SLUG);}
        public final Mass fromStonesUK(double v){return s(this, v, P.STUK);}
        public final Mass fromStonesUS(double v){return s(this, v, P.STUS);}
        public final Mass fromTeragrams(double v){return s(this, v, P.TG);}
        public final Mass fromTonsImperial(double v){return s(this, v, P.TI);}
        public final Mass fromTonsMetric(double v){return s(this, v, P.TM);}
        public final Mass fromTonsUS(double v){return s(this, v, P.TUS);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toPounds(); //Variable "bar" being of type UnitOf.Mass with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Mass().fromGrams(1.25).toPounds(); //One line conversion from 1.25 Grams to Pounds
        */
        public final double toAttograms(){return c(P.AG);}
        public final double toCarats(){return c(P.CT);}
        public final double toCentigrams(){return c(P.CG);}
        public final double toCentners(){return c(P.CWT);}
        public final double toDecigrams(){return c(P.DG);}
        public final double toDekagrams(){return c(P.DAG);}
        public final double toExagrams(){return c(P.EG);}
        public final double toFemtograms(){return c(P.FG);}
        public final double toGamma(){return c(P.GAMM);}
        public final double toGigagrams(){return c(P.GG);}
        public final double toGrams(){return c(P.G);}
        public final double toHectograms(){return c(P.HG);}
        public final double toKilograms(){return c(P.KG);}
        public final double toKilopounds(){return c(P.KIP);}
        public final double toKilotonsMetric(){return c(P.TK);}
        public final double toMegagrams(){return c(P.MG);}
        public final double toMicrograms(){return c(P.MUG);}
        public final double toMilligrams(){return c(P.MILG);}
        public final double toNanograms(){return c(P.NG);}
        public final double toOuncesMetric(){return c(P.MOZ);}
        public final double toOuncesUS(){return c(P.USOZ);}
        public final double toPetagrams(){return c(P.PEG);}
        public final double toPicograms(){return c(P.PG);}
        public final double toPounds(){return c(P.LB);}
        public final double toQuintals(){return c(P.QU);}
        public final double toSlugs(){return c(P.SLUG);}
        public final double toStonesUK(){return c(P.STUK);}
        public final double toStonesUS(){return c(P.STUS);}
        public final double toTeragrams(){return c(P.TG);}
        public final double toTonsImperial(){return c(P.TI);}
        public final double toTonsMetric(){return c(P.TM);}
        public final double toTonsUS(){return c(P.TUS);}       
    }

    /**
     * UnitOf.MetricPrefix()
     * 
     * Ex: double foo = new UnitOf.MetricPrefix().fromKilo(1.25).toGiga(); //One line conversion from 1.25 Kilo to Giga
     */
    public static class MetricPrefix extends B<Q> implements Serializable{
        
        /*
        Method to perform all conversions within MetricPrefix class.
        All "to" methods within MetricPrefix use this method.
        */
        private final double c(Q t){
            return k(t.TO_NN,me.t.TO_NN,false);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.MetricPrefix foo = new UnitOf.MetricPrefix().fromKilo(1.25); //Variable "foo" will be able to convert 1.25 Kilo into any unit of MetricPrefix
        */
        public final MetricPrefix fromAtto(double v){return s(this, v, Q.A);}
        public final MetricPrefix fromCenti(double v){return s(this, v, Q.C);}
        public final MetricPrefix fromDeci(double v){return s(this, v, Q.D);}
        public final MetricPrefix fromDeka(double v){return s(this, v, Q.DA);}
        public final MetricPrefix fromExa(double v){return s(this, v, Q.E);}
        public final MetricPrefix fromFemto(double v){return s(this, v, Q.F);}
        public final MetricPrefix fromGiga(double v){return s(this, v, Q.G);}
        public final MetricPrefix fromHecto(double v){return s(this, v, Q.H);}
        public final MetricPrefix fromKilo(double v){return s(this, v, Q.K);}
        public final MetricPrefix fromMega(double v){return s(this, v, Q.M);}
        public final MetricPrefix fromMicro(double v){return s(this, v, Q.MU);}
        public final MetricPrefix fromMilli(double v){return s(this, v, Q.MIL);}
        public final MetricPrefix fromNano(double v){return s(this, v, Q.N);}
        public final MetricPrefix fromNoPrefix(double v){return s(this, v, Q.NN);}
        public final MetricPrefix fromPeta(double v){return s(this, v, Q.PE);}
        public final MetricPrefix fromPico(double v){return s(this, v, Q.P);}
        public final MetricPrefix fromTera(double v){return s(this, v, Q.T);}
        public final MetricPrefix fromYocto(double v){return s(this, v, Q.YO);}
        public final MetricPrefix fromYotta(double v){return s(this, v, Q.Y);}
        public final MetricPrefix fromZepto(double v){return s(this, v, Q.ZO);}
        public final MetricPrefix fromZetta(double v){return s(this, v, Q.Z);}
              
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toGiga(); //Variable "bar" being of type UnitOf.MetricPrefix with "from" value already assigned
        Ex 2: double foobar = new UnitOf.MetricPrefix().fromKilo(1.25).toGiga(); //One line conversion from 1.25 Kilo to Giga
        */
        public final double toAtto(){return c(Q.A);}
        public final double toCenti(){return c(Q.C);}
        public final double toDeci(){return c(Q.D);}
        public final double toDeka(){return c(Q.DA);}
        public final double toExa(){return c(Q.E);}
        public final double toFemto(){return c(Q.F);}
        public final double toGiga(){return c(Q.G);}
        public final double toHecto(){return c(Q.H);}
        public final double toKilo(){return c(Q.K);}
        public final double toMega(){return c(Q.M);}
        public final double toMicro(){return c(Q.MU);}
        public final double toMilli(){return c(Q.MIL);}
        public final double toNano(){return c(Q.N);}
        public final double toNoPrefix(){return c(Q.NN);}
        public final double toPeta(){return c(Q.PE);}
        public final double toPico(){return c(Q.P);}
        public final double toTera(){return c(Q.T);}
        public final double toYocto(){return c(Q.YO);}
        public final double toYotta(){return c(Q.Y);}
        public final double toZepto(){return c(Q.ZO);}
        public final double toZetta(){return c(Q.Z);}
    }
    
    /**
     * UnitOf.NumericBase()
     * 
     * Ex:
     *  String hexToBinary = "";   
     *  try{
     *      hexToBinary = new UnitOf.NumericBase().fromHexadecimal("ADa3").toBinary();//Returns 1010110110100011
     *  } catch(Exception e){
     *      //Handle exception: all NumericBase conversion "To" are throwable. For many conversions, strings with letter have to be passed in but do not always apply to every numeric base
     *  }
     */
    public static class NumericBase extends R implements Serializable{
        
        /*
        "from" Methods
        
        Ex: UnitOf.NumericBase foo = new UnitOf.NumericBase().fromHexadecimal("ADa3"); //Variable "foo" will be able to convert "ADa3" Hex into any unit of NumericBase
        */
        public final NumericBase fromBase11(Object v){return s(this, v, S.B11);}
        public final NumericBase fromBase12(Object v){return s(this, v, S.B12);}
        public final NumericBase fromBase13(Object v){return s(this, v, S.B13);}
        public final NumericBase fromBase14(Object v){return s(this, v, S.B14);}
        public final NumericBase fromBase15(Object v){return s(this, v, S.B15);}
        public final NumericBase fromBase17(Object v){return s(this, v, S.B17);}
        public final NumericBase fromBase18(Object v){return s(this, v, S.B18);}
        public final NumericBase fromBase19(Object v){return s(this, v, S.B19);}
        public final NumericBase fromBase20(Object v){return s(this, v, S.B20);}
        public final NumericBase fromBase21(Object v){return s(this, v, S.B21);}
        public final NumericBase fromBase22(Object v){return s(this, v, S.B22);}
        public final NumericBase fromBase23(Object v){return s(this, v, S.B23);}
        public final NumericBase fromBase24(Object v){return s(this, v, S.B24);}
        public final NumericBase fromBase25(Object v){return s(this, v, S.B25);}
        public final NumericBase fromBase26(Object v){return s(this, v, S.B26);}
        public final NumericBase fromBase27(Object v){return s(this, v, S.B27);}
        public final NumericBase fromBase28(Object v){return s(this, v, S.B28);}
        public final NumericBase fromBase29(Object v){return s(this, v, S.B29);}
        public final NumericBase fromBase3(Object v){return s(this, v, S.B3);}
        public final NumericBase fromBase30(Object v){return s(this, v, S.B30);}
        public final NumericBase fromBase31(Object v){return s(this, v, S.B31);}
        public final NumericBase fromBase32(Object v){return s(this, v, S.B32);}
        public final NumericBase fromBase33(Object v){return s(this, v, S.B33);}
        public final NumericBase fromBase34(Object v){return s(this, v, S.B34);}
        public final NumericBase fromBase35(Object v){return s(this, v, S.B35);}
        public final NumericBase fromBase36(Object v){return s(this, v, S.B36);}
        public final NumericBase fromBase4(Object v){return s(this, v, S.B4);}
        public final NumericBase fromBase5(Object v){return s(this, v, S.B5);}
        public final NumericBase fromBase6(Object v){return s(this, v, S.B6);}
        public final NumericBase fromBase7(Object v){return s(this, v, S.B7);}
        public final NumericBase fromBase9(Object v){return s(this, v, S.B9);}
        public final NumericBase fromBinary(Object v){return s(this, v, S.B2);}
        public final NumericBase fromDecimal(Object v){return s(this, v, S.B10);}
        public final NumericBase fromHexadecimal(Object v){return s(this, v, S.B16);}
        public final NumericBase fromOctal(Object v){return s(this, v, S.B8);}
    }
    
    /**
     * UnitOf.Pressure()
     * 
     * Ex: double foo = new UnitOf.Pressure().fromPascals(1.25).toKSI(); //One line conversion from 1.25 Pascals to KSI
     */
    public static class Pressure extends B<T> implements Serializable{   
        
        /*
        Method to perform all conversions within Pressure class.
        All "to" methods within Pressure use this method.
        */
        private final double c(T t){
            return k(t.TO_PA,me.t.TO_PA);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Pressure foo = new UnitOf.Pressure().fromPascals(1.25); //Variable "foo" will be able to convert 1.25 Pascals into any unit of Pressure
        */
        public final Pressure fromAttopascals(double v){return s(this,v,T.APA);}
        public final Pressure fromBars(double v){return s(this,v,T.BAR);}
        public final Pressure fromBaryes(double v){return s(this,v,T.BA);}
        public final Pressure fromCentimetersOfMercury0C(double v){return s(this,v,T.CMHG);}
        public final Pressure fromCentimetersOfWater4C(double v){return s(this,v,T.CMW4);}
        public final Pressure fromCentipascals(double v){return s(this,v,T.CPA);}
        public final Pressure fromDecibars(double v){return s(this,v,T.DBAR);}
        public final Pressure fromDecipascals(double v){return s(this,v,T.DPA);}
        public final Pressure fromDekapascals(double v){return s(this,v,T.DAPA);}
        public final Pressure fromDynesPerSquareCentimeter(double v){return s(this,v,T.DYNCM);}
        public final Pressure fromExapascals(double v){return s(this,v,T.EPA);}
        public final Pressure fromFeetOfSeaWater(double v){return s(this,v,T.FSW);}
        public final Pressure fromFeetOfWater4C(double v){return s(this,v,T.FTW4);}
        public final Pressure fromFeetOfWater60F(double v){return s(this,v,T.FTW60);}
        public final Pressure fromFemtopascals(double v){return s(this,v,T.FPA);}
        public final Pressure fromGigapascals(double v){return s(this,v,T.GPA);}
        public final Pressure fromGramsPerSquareCentimeter(double v){return s(this,v,T.GFCM);}
        public final Pressure fromHectopascals(double v){return s(this,v,T.HPA);}
        public final Pressure fromInchesOfMercury32F(double v){return s(this,v,T.INHG32);}
        public final Pressure fromInchesOfMercury60F(double v){return s(this,v,T.INHG60);}
        public final Pressure fromInchesOfWater4C(double v){return s(this,v,T.INW4);}
        public final Pressure fromInchesOfWater60F(double v){return s(this,v,T.INW60);}
        public final Pressure fromKSI(double v){return s(this,v,T.KSI);}
        public final Pressure fromKilogramsPerSquareCentimeter(double v){return s(this,v,T.KGFCM);}
        public final Pressure fromKilogramsPerSquareMeter(double v){return s(this,v,T.KGFM);}
        public final Pressure fromKilogramsPerSquareMillimeter(double v){return s(this,v,T.KFGMM);}
        public final Pressure fromKilonewtonsPerSquareMeter(double v){return s(this,v,T.KNM);}
        public final Pressure fromKilopascals(double v){return s(this,v,T.KPA);}
        public final Pressure fromKipsPerSquareInch(double v){return s(this,v,T.KIPFIN);}
        public final Pressure fromLongTonsPerSquareFoot(double v){return s(this,v,T.TFFTL);}
        public final Pressure fromLongTonsPerSquareInch(double v){return s(this,v,T.TFINL);}
        public final Pressure fromMegapascals(double v){return s(this,v,T.MPA);}
        public final Pressure fromMetersOfSeaWater(double v){return s(this,v,T.MSW);}
        public final Pressure fromMetersOfWater4C(double v){return s(this,v,T.MW4);}
        public final Pressure fromMicrobars(double v){return s(this,v,T.MUBAR);}
        public final Pressure fromMicropascals(double v){return s(this,v,T.MUPA);}
        public final Pressure fromMillibars(double v){return s(this,v,T.MILBAR);}
        public final Pressure fromMillimetersOfMercury0C(double v){return s(this,v,T.MMHG);}
        public final Pressure fromMillimetersOfWater4C(double v){return s(this,v,T.MMW4);}
        public final Pressure fromMillipascals(double v){return s(this,v,T.MILPA);}
        public final Pressure fromNanopascals(double v){return s(this,v,T.NPA);}
        public final Pressure fromNewtonsPerSquareCentimeter(double v){return s(this,v,T.NCM);}
        public final Pressure fromNewtonsPerSquareMeter(double v){return s(this,v,T.NM);}
        public final Pressure fromNewtonsPerSquareMillimeter(double v){return s(this,v,T.NMM);}
        public final Pressure fromPSI(double v){return s(this,v,T.PSI);}
        public final Pressure fromPascals(double v){return s(this,v,T.PA);}
        public final Pressure fromPetapascals(double v){return s(this,v,T.PEPA);}
        public final Pressure fromPicopascals(double v){return s(this,v,T.PPA);}
        public final Pressure fromPieze(double v){return s(this,v,T.PIZ);}
        public final Pressure fromPoundalsPerSquareFoot(double v){return s(this,v,T.PDLFT);}
        public final Pressure fromPoundsPerSquareFoot(double v){return s(this,v,T.LBFFT);}
        public final Pressure fromPoundsPerSquareInch(double v){return s(this,v,T.LBFIN);}
        public final Pressure fromShortTonsPerSquareFoot(double v){return s(this,v,T.TFFTS);}
        public final Pressure fromShortTonsPerSquareInch(double v){return s(this,v,T.TFINS);}
        public final Pressure fromStandardAtmospheres(double v){return s(this,v,T.ATM);}
        public final Pressure fromSthenesPerSquareMeter(double v){return s(this,v,T.SM);}
        public final Pressure fromTechnicalAtmospheres(double v){return s(this,v,T.AT);}
        public final Pressure fromTerapascals(double v){return s(this,v,T.TPA);}
        public final Pressure fromTorrs(double v){return s(this,v,T.TORR);}
              
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toKSI(); //Variable "bar" being of type UnitOf.Pressure with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Pressure().fromPascals(1.25).toKSI(); //One line conversion from 1.25 Pascals to KSI
        */
        public final double toAttopascals(){return c(T.APA);}
        public final double toBars(){return c(T.BAR);}
        public final double toBaryes(){return c(T.BA);}
        public final double toCentimetersOfMercury0C(){return c(T.CMHG);}
        public final double toCentimetersOfWater4C(){return c(T.CMW4);}
        public final double toCentipascals(){return c(T.CPA);}
        public final double toDecibars(){return c(T.DBAR);}
        public final double toDecipascals(){return c(T.DPA);}
        public final double toDekapascals(){return c(T.DAPA);}
        public final double toDynesPerSquareCentimeter(){return c(T.DYNCM);}
        public final double toExapascals(){return c(T.EPA);}
        public final double toFeetOfSeaWater(){return c(T.FSW);}
        public final double toFeetOfWater4C(){return c(T.FTW4);}
        public final double toFeetOfWater60F(){return c(T.FTW60);}
        public final double toFemtopascals(){return c(T.FPA);}
        public final double toGigapascals(){return c(T.GPA);}
        public final double toGramsPerSquareCentimeter(){return c(T.GFCM);}
        public final double toHectopascals(){return c(T.HPA);}
        public final double toInchesOfMercury32F(){return c(T.INHG32);}
        public final double toInchesOfMercury60F(){return c(T.INHG60);}
        public final double toInchesOfWater4C(){return c(T.INW4);}
        public final double toInchesOfWater60F(){return c(T.INW60);}
        public final double toKSI(){return c(T.KSI);}
        public final double toKilogramsPerSquareCentimeter(){return c(T.KGFCM);}
        public final double toKilogramsPerSquareMeter(){return c(T.KGFM);}
        public final double toKilogramsPerSquareMillimeter(){return c(T.KFGMM);}
        public final double toKilonewtonsPerSquareMeter(){return c(T.KNM);}
        public final double toKilopascals(){return c(T.KPA);}
        public final double toKipsPerSquareInch(){return c(T.KIPFIN);}
        public final double toLongTonsPerSquareFoot(){return c(T.TFFTL);}
        public final double toLongTonsPerSquareInch(){return c(T.TFINL);}
        public final double toMegapascals(){return c(T.MPA);}
        public final double toMetersOfSeaWater(){return c(T.MSW);}
        public final double toMetersOfWater4C(){return c(T.MW4);}
        public final double toMicrobars(){return c(T.MUBAR);}
        public final double toMicropascals(){return c(T.MUPA);}
        public final double toMillibars(){return c(T.MILBAR);}
        public final double toMillimetersOfMercury0C(){return c(T.MMHG);}
        public final double toMillimetersOfWater4C(){return c(T.MMW4);}
        public final double toMillipascals(){return c(T.MILPA);}
        public final double toNanopascals(){return c(T.NPA);}
        public final double toNewtonsPerSquareCentimeter(){return c(T.NCM);}
        public final double toNewtonsPerSquareMeter(){return c(T.NM);}
        public final double toNewtonsPerSquareMillimeter(){return c(T.NMM);}
        public final double toPSI(){return c(T.PSI);}
        public final double toPascals(){return c(T.PA);}
        public final double toPetapascals(){return c(T.PEPA);}
        public final double toPicopascals(){return c(T.PPA);}
        public final double toPieze(){return c(T.PIZ);}
        public final double toPoundalsPerSquareFoot(){return c(T.PDLFT);}
        public final double toPoundsPerSquareFoot(){return c(T.LBFFT);}
        public final double toPoundsPerSquareInch(){return c(T.LBFIN);}
        public final double toShortTonsPerSquareFoot(){return c(T.TFFTS);}
        public final double toShortTonsPerSquareInch(){return c(T.TFINS);}
        public final double toStandardAtmospheres(){return c(T.ATM);}
        public final double toSthenesPerSquareMeter(){return c(T.SM);}
        public final double toTechnicalAtmospheres(){return c(T.AT);}
        public final double toTerapascals(){return c(T.TPA);}
        public final double toTorrs(){return c(T.TORR);}
    }
   
    /**
     * UnitOf.Speed()
     * 
     * Ex: double foo = new UnitOf.Speed().fromMilesPerHour(1.25).toKilometersPerHour(); //One line conversion from 1.25 MilesPerHour to KilometersPerHour
     */
    public static class Speed extends B<V> implements Serializable{
        
        /*
        Method to perform all conversions within Speed class.
        All "to" methods within Speed use this method.
        */
        private final double c(V t){
            return k(t.TO_MS,me.t.TO_MS,false);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Speed foo = new UnitOf.Speed().fromMilesPerHour(1.25); //Variable "foo" will be able to convert 1.25 MilesPerHour into any unit of Speed
        */
        public final Speed fromCentimetersPerHour(double v){return s(this, v, V.CMH);}
        public final Speed fromCentimetersPerMinute(double v){return s(this, v, V.CMM);}
        public final Speed fromCentimetersPerSecond(double v){return s(this, v, V.CMS);}
        public final Speed fromEarthsVelocity(double v){return s(this, v, V.EV);}
        public final Speed fromFeetPerHour(double v){return s(this, v, V.FTH);}
        public final Speed fromFeetPerMinute(double v){return s(this, v, V.FTM);}
        public final Speed fromFeetPerSecond(double v){return s(this, v, V.FTS);}
        public final Speed fromFirstCosmicVelocity(double v){return s(this, v, V.CV1);}
        public final Speed fromInchesPerHour(double v){return s(this, v, V.INH);}
        public final Speed fromInchesPerMinute(double v){return s(this, v, V.INM);}
        public final Speed fromInchesPerSecond(double v){return s(this, v, V.INS);}
        public final Speed fromKilometersPerHour(double v){return s(this, v, V.KMH);}
        public final Speed fromKilometersPerMinute(double v){return s(this, v, V.KMM);}
        public final Speed fromKilometersPerSecond(double v){return s(this, v, V.KMS);}
        public final Speed fromKnots(double v){return s(this, v, V.KN);}
        public final Speed fromLight(double v){return s(this, v, V.C);}
        public final Speed fromMach(double v){return s(this, v, V.MA);}
        public final Speed fromMetersPerHour(double v){return s(this, v, V.MH);}
        public final Speed fromMetersPerMinute(double v){return s(this, v, V.MM);}
        public final Speed fromMetersPerSecond(double v){return s(this, v, V.MS);}
        public final Speed fromMilesPerHour(double v){return s(this, v, V.MIH);}
        public final Speed fromMilesPerMinute(double v){return s(this, v, V.MIM);}
        public final Speed fromMilesPerSecond(double v){return s(this, v, V.MIS);}
        public final Speed fromMillimetersPerHour(double v){return s(this, v, V.MMH);}
        public final Speed fromMillimetersPerMinute(double v){return s(this, v, V.MMM);}
        public final Speed fromMillimetersPerSecond(double v){return s(this, v, V.MMS);}
        public final Speed fromSecondCosmicVelocity(double v){return s(this, v, V.CV2);}
        public final Speed fromSoundsInAir(double v){return s(this, v, V.SA);}
        public final Speed fromSoundsInWater(double v){return s(this, v, V.SW);}
        public final Speed fromThirdCosmicVelocity(double v){return s(this, v, V.CV3);}
        public final Speed fromYardsPerHour(double v){return s(this, v, V.YH);}
        public final Speed fromYardsPerMinute(double v){return s(this, v, V.YM);}
        public final Speed fromYardsPerSecond(double v){return s(this, v, V.YS);}
               
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toKilometersPerHour(); //Variable "bar" being of type UnitOf.Speed with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Speed().fromMilesPerHour(1.25).toKilometersPerHour(); //One line conversion from 1.25 MilesPerHour to KilometersPerHour
        */
        public final double toCentimetersPerHour(){return c(V.CMH);}
        public final double toCentimetersPerMinute(){return c(V.CMM);}
        public final double toCentimetersPerSecond(){return c(V.CMS);}
        public final double toEarthsVelocity(){return c(V.EV);}
        public final double toFeetPerHour(){return c(V.FTH);}
        public final double toFeetPerMinute(){return c(V.FTM);}
        public final double toFeetPerSecond(){return c(V.FTS);}
        public final double toFirstCosmicVelocity(){return c(V.CV1);}
        public final double toInchesPerHour(){return c(V.INH);}
        public final double toInchesPerMinute(){return c(V.INM);}
        public final double toInchesPerSecond(){return c(V.INS);}
        public final double toKilometersPerHour(){return c(V.KMH);}
        public final double toKilometersPerMinute(){return c(V.KMM);}
        public final double toKilometersPerSecond(){return c(V.KMS);}
        public final double toKnots(){return c(V.KN);}
        public final double toLight(){return c(V.C);}
        public final double toMach(){return c(V.MA);}
        public final double toMetersPerHour(){return c(V.MH);}
        public final double toMetersPerMinute(){return c(V.MM);}
        public final double toMetersPerSecond(){return c(V.MS);}
        public final double toMilesPerHour(){return c(V.MIH);}
        public final double toMilesPerMinute(){return c(V.MIM);}
        public final double toMilesPerSecond(){return c(V.MIS);}
        public final double toMillimetersPerHour(){return c(V.MMH);}
        public final double toMillimetersPerMinute(){return c(V.MMM);}
        public final double toMillimetersPerSecond(){return c(V.MMS);}
        public final double toSecondCosmicVelocity(){return c(V.CV2);}
        public final double toSoundsInAir(){return c(V.SA);}
        public final double toSoundsInWater(){return c(V.SW);}
        public final double toThirdCosmicVelocity(){return c(V.CV3);}
        public final double toYardsPerHour(){return c(V.YH);}
        public final double toYardsPerMinute(){return c(V.YM);}
        public final double toYardsPerSecond(){return c(V.YS);}
    }
   
    /**
     * UnitOf.Temperature()
     * 
     * Ex: double foo = new UnitOf.Temperature().fromCelsius(1.25).toFahrenheit(); //One line conversion from 1.25 Celsius to Fahrenheit
     */
    public static class Temperature extends B<W> implements Serializable{    
        
        /*
        Method to perform all conversions within Temperature class.
        All "to" methods within Temperature use this method.
        */
        private final double c(W t){
            return fromCelsiusToType(toCelsius(me.v, me.t), t);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Temperature foo = new UnitOf.Temperature().fromCelsius(1.25); //Variable "foo" will be able to convert 1.25 Celsius into any unit of Temperature
        */
        public final Temperature fromCelsius(double v){return s(this,v, W.C);}
        public final Temperature fromFahrenheit(double v){return s(this,v, W.F);}
        public final Temperature fromKelvin(double v){return s(this,v, W.K);}
        public final Temperature fromRankine(double v){return s(this,v, W.R);}
        public final Temperature fromReaumur(double v){return s(this,v, W.RE);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toFahrenheit(); //Variable "bar" being of type UnitOf.Temperature with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Temperature().fromCelsius(1.25).toFahrenheit(); //One line conversion from 1.25 Celsius to Fahrenheit
        */
        public final double toCelsius(){return c(W.C);}
        public final double toFahrenheit(){return c(W.F);}
        public final double toKelvin(){return c(W.K);}
        public final double toRankine(){return c(W.R);}
        public final double toReaumur(){return c(W.RE);}

        /*
        Only used in Temperature's conversion method.
        converts value passed of any Temperature unit into Celsius
        */
        private final double toCelsius(double v, W t){
            switch(t){
                case F: return (v - 32) / 1.8;
                case K: return v - 273.15;
                case R: return (v - 491.67) * (5.0 / 9.0);
                case RE: return v * 1.25;
                default: return v;
            }
        }

        /*
        Only used in Temperature's conversion method.
        Converts Celsius value passed into any Temperature unit.
        */
        private final double fromCelsiusToType(double v, W t){
            switch(t){
                case F: return (v * 1.8) + 32;
                case K: return v + 273.15;
                case R: return (v + 273.15) * 1.8;
                case RE: return v * 0.8;
                default: return v;
            }
        }
    }
    
    /**
     * UnitOf.Time()
     * 
     * Ex: double foo = new UnitOf.Time().fromMinutes(1.25).toHours(); //One line conversion from 1.25 Minutes to Hours
     */
    public static class Time extends B<X> implements Serializable{
        
        /*
        Method to perform all conversions within Time class.
        All "to" methods within Time use this method.
        */
        private final double c(X t){
            return k(t.TO_S,me.t.TO_S);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Time foo = new UnitOf.Time().fromMinutes(1.25); //Variable "foo" will be able to convert 1.25 Minutes into any unit of Time
        */
        public final Time fromAttoseconds(double v){return s(this, v, X.AS);}
        public final Time fromCenturies(double v){return s(this, v, X.C);}
        public final Time fromDays(double v){return s(this, v, X.D);}
        public final Time fromDecades(double v){return s(this, v, X.DE);}
        public final Time fromFemtoseconds(double v){return s(this, v, X.FS);}
        public final Time fromFortnights(double v){return s(this, v, X.FN);}
        public final Time fromGregorianYears(double v){return s(this, v, X.GY);}
        public final Time fromHours(double v){return s(this, v, X.H);}
        public final Time fromJulianYears(double v){return s(this, v, X.JY);}
        public final Time fromLeapYears(double v){return s(this, v, X.LY);}
        public final Time fromMicroseconds(double v){return s(this, v, X.MUS);}
        public final Time fromMillenniums(double v){return s(this, v, X.M);}
        public final Time fromMilliseconds(double v){return s(this, v, X.MS);}
        public final Time fromMinutes(double v){return s(this, v, X.MIN);}
        public final Time fromMonths(double v){return s(this, v, X.MON);}
        public final Time fromNanoseconds(double v){return s(this, v, X.NS);}
        public final Time fromPicoseconds(double v){return s(this, v, X.PS);}
        public final Time fromSeconds(double v){return s(this, v, X.S);}
        public final Time fromWeeks(double v){return s(this, v, X.WK);}
        public final Time fromYears(double v){return s(this, v, X.Y);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toHours(); //Variable "bar" being of type UnitOf.Time with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Time().fromMinutes(1.25).toHours(); //One line conversion from 1.25 Minutes to Hours
        */
        public final double toAttoseconds(){return c(X.AS);}
        public final double toCenturies(){return c(X.C);}
        public final double toDays(){return c(X.D);}
        public final double toDecades(){return c(X.DE);}
        public final double toFemtoseconds(){return c(X.FS);}
        public final double toFortnights(){return c(X.FN);}
        public final double toGregorianYears(){return c(X.GY);}
        public final double toHours(){return c(X.H);}
        public final double toJulianYears(){return c(X.JY);}
        public final double toLeapYears(){return c(X.LY);}
        public final double toMicroseconds(){return c(X.MUS);}
        public final double toMillenniums(){return c(X.M);}
        public final double toMilliseconds(){return c(X.MS);}
        public final double toMinutes(){return c(X.MIN);}
        public final double toMonths(){return c(X.MON);}
        public final double toNanoseconds(){return c(X.NS);}
        public final double toPicoseconds(){return c(X.PS);}
        public final double toSeconds(){return c(X.S);}
        public final double toWeeks(){return c(X.WK);}
        public final double toYears(){return c(X.Y);}
    }

    /**
     * UnitOf.Torque()
     * 
     * Ex: double foo = new UnitOf.Torque().fromNewtonMeters(1.25).toGramMeters(); //One line conversion from 1.25 NewtonMeters to GramMeters
     */
    public static class Torque extends B<Y> implements Serializable{
        
        /*
        Method to perform all conversions within Torque class.
        All "to" methods within Torque use this method.
        */
        private final double c(Y t){
            return k(t.TO_KGFM,me.t.TO_KGFM);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Torque foo = new UnitOf.Torque().fromNewtonMeters(1.25); //Variable "foo" will be able to convert 1.25 NewtonMeters into any unit of Torque
        */
        public final Torque fromDyneCentimeters(double v){return s(this, v, Y.DYNCM);}
        public final Torque fromDyneMeters(double v){return s(this, v, Y.DYNM);}
        public final Torque fromDyneMillimeters(double v){return s(this, v, Y.DYNMM);}
        public final Torque fromGramCentimeters(double v){return s(this, v, Y.GFCM);}
        public final Torque fromGramMeters(double v){return s(this, v, Y.GFM);}
        public final Torque fromGramMillimeters(double v){return s(this, v, Y.GFMM);}
        public final Torque fromKilogramCentimeters(double v){return s(this, v, Y.KGFCM);}
        public final Torque fromKilogramMeters(double v){return s(this, v, Y.KGFM);}
        public final Torque fromKilogramMillimeters(double v){return s(this, v, Y.KGFMM);}
        public final Torque fromKilonewtonMeters(double v){return s(this, v, Y.KNM);}
        public final Torque fromNewtonCentimeters(double v){return s(this, v, Y.NCM);}
        public final Torque fromNewtonMeters(double v){return s(this, v, Y.NM);}
        public final Torque fromNewtonMillimeters(double v){return s(this, v, Y.NMM);}
        public final Torque fromOunceFeet(double v){return s(this, v, Y.OZFFT);}
        public final Torque fromOunceInches(double v){return s(this, v, Y.OZFIN);}
        public final Torque fromPoundFeet(double v){return s(this, v, Y.LBFFT);}
        public final Torque fromPoundInches(double v){return s(this, v, Y.LBFIN);}
               
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toGramMeters(); //Variable "bar" being of type UnitOf.Torque with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Torque().fromNewtonMeters(1.25).toGramMeters(); //One line conversion from 1.25 NewtonMeters to GramMeters
        */
        public final double toDyneCentimeters(){return c(Y.DYNCM);}
        public final double toDyneMeters(){return c(Y.DYNM);}
        public final double toDyneMillimeters(){return c(Y.DYNMM);}
        public final double toGramCentimeters(){return c(Y.GFCM);}
        public final double toGramMeters(){return c(Y.GFM);}
        public final double toGramMillimeters(){return c(Y.GFMM);}
        public final double toKilogramCentimeters(){return c(Y.KGFCM);}
        public final double toKilogramMeters(){return c(Y.KGFM);}
        public final double toKilogramMillimeters(){return c(Y.KGFMM);}
        public final double toKilonewtonMeters(){return c(Y.KNM);}
        public final double toNewtonCentimeters(){return c(Y.NCM);}
        public final double toNewtonMeters(){return c(Y.NM);}
        public final double toNewtonMillimeters(){return c(Y.NMM);}
        public final double toOunceFeet(){return c(Y.OZFFT);}
        public final double toOunceInches(){return c(Y.OZFIN);}
        public final double toPoundFeet(){return c(Y.LBFFT);}
        public final double toPoundInches(){return c(Y.LBFIN);}        
    }
    
    /**
     * UnitOf.Volume()
     * 
     * Ex: double foo = new UnitOf.Volume().fromLiters(1.25).toCubicMeters(); //One line conversion from 1.25 Liters to CubicMeters
     */
    public static class Volume extends B<Z> implements Serializable{

        /*
        Method to perform all conversions within Volume class.
        All "to" methods within Volume use this method.
        */
        private final double c(Z t){
            return k(t.TO_M,me.t.TO_M);
        }
        
        /*
        "from" Methods
        
        Ex: UnitOf.Volume foo = new UnitOf.Volume().fromLiters(1.25); //Variable "foo" will be able to convert 1.25 Liters into any unit of Volume
        */
        public final Volume fromAcreFeetUSSurvey(double v){return s(this, v, Z.ACFTUS);}
        public final Volume fromAcreInches(double v){return s(this, v, Z.ACIN);}
        public final Volume fromArceFeet(double v){return s(this, v, Z.ACFTO);}
        public final Volume fromAttoliters(double v){return s(this, v, Z.AL);}
        public final Volume fromBarrelsOfOil(double v){return s(this, v, Z.BBLO);}
        public final Volume fromBarrelsUK(double v){return s(this, v, Z.BBLUK);}
        public final Volume fromBarrelsUS(double v){return s(this, v, Z.BBLUS);}
        public final Volume fromBoardFeet(double v){return s(this, v, Z.FBM);}
        public final Volume fromCentiliters(double v){return s(this, v, Z.CL);}
        public final Volume fromCords(double v){return s(this, v, Z.CORD);}
        public final Volume fromCubicCentimeters(double v){return s(this, v, Z.CM);}
        public final Volume fromCubicDecimeters(double v){return s(this, v, Z.DM);}
        public final Volume fromCubicFeet(double v){return s(this, v, Z.FT);}
        public final Volume fromCubicInches(double v){return s(this, v, Z.IN);}
        public final Volume fromCubicKilometers(double v){return s(this, v, Z.KM);}
        public final Volume fromCubicMeters(double v){return s(this, v, Z.M);}
        public final Volume fromCubicMiles(double v){return s(this, v, Z.MI);}
        public final Volume fromCubicMillimeters(double v){return s(this, v, Z.MM);}
        public final Volume fromCubicYards(double v){return s(this, v, Z.YD);}
        public final Volume fromCupsMetric(double v){return s(this, v, Z.CUPM);}
        public final Volume fromCupsUK(double v){return s(this, v, Z.CUPUK);}
        public final Volume fromCupsUS(double v){return s(this, v, Z.CUPUS);}
        public final Volume fromDeciliters(double v){return s(this, v, Z.DL);}
        public final Volume fromDecisteres(double v){return s(this, v, Z.DECI);}
        public final Volume fromDekaliters(double v){return s(this, v, Z.DAL);}
        public final Volume fromDekasteres(double v){return s(this, v, Z.DEKA);}
        public final Volume fromDessertspoonsUK(double v){return s(this, v, Z.DSTSPNUK);}
        public final Volume fromDessertspoonsUS(double v){return s(this, v, Z.DSTSPNUS);}
        public final Volume fromDrops(double v){return s(this, v, Z.DROP);}
        public final Volume fromExaliters(double v){return s(this, v, Z.EL);}
        public final Volume fromFemtoliters(double v){return s(this, v, Z.FL);}
        public final Volume fromFluidOuncesUK(double v){return s(this, v, Z.FLOZUK);}
        public final Volume fromFluidOuncesUS(double v){return s(this, v, Z.FLOZUS);}
        public final Volume fromGallonsUK(double v){return s(this, v, Z.GALUK);}
        public final Volume fromGallonsUS(double v){return s(this, v, Z.GALUS);}
        public final Volume fromGigaliters(double v){return s(this, v, Z.GL);}
        public final Volume fromGillsUK(double v){return s(this, v, Z.GILUK);}
        public final Volume fromGillsUS(double v){return s(this, v, Z.GILUS);}
        public final Volume fromHectoliters(double v){return s(this, v, Z.HL);}
        public final Volume fromHogsheads(double v){return s(this, v, Z.HOG);}
        public final Volume fromHundredCubicFeet(double v){return s(this, v, Z.CCF);}
        public final Volume fromKiloliters(double v){return s(this, v, Z.KL);}
        public final Volume fromLiters(double v){return s(this, v, Z.L);}
        public final Volume fromMegaliters(double v){return s(this, v, Z.ML);}
        public final Volume fromMicroliters(double v){return s(this, v, Z.MUL);}
        public final Volume fromMilliliters(double v){return s(this, v, Z.MILL);}
        public final Volume fromMinimsUK(double v){return s(this, v, Z.MINIUK);}
        public final Volume fromMinimsUS(double v){return s(this, v, Z.MINIUS);}
        public final Volume fromNanoliters(double v){return s(this, v, Z.NL);}
        public final Volume fromPetaliters(double v){return s(this, v, Z.PEL);}
        public final Volume fromPicoliters(double v){return s(this, v, Z.PL);}
        public final Volume fromPintsUK(double v){return s(this, v, Z.PTUK);}
        public final Volume fromPintsUS(double v){return s(this, v, Z.PTUS);}
        public final Volume fromQuartsUK(double v){return s(this, v, Z.QTUK);}
        public final Volume fromQuartsUS(double v){return s(this, v, Z.QTUS);}
        public final Volume fromRegisterTons(double v){return s(this, v, Z.REGTON);}
        public final Volume fromSteres(double v){return s(this, v, Z.ST);}
        public final Volume fromTablespoonsMetric(double v){return s(this, v, Z.TBSPM);}
        public final Volume fromTablespoonsUK(double v){return s(this, v, Z.TBSPUK);}
        public final Volume fromTablespoonsUS(double v){return s(this, v, Z.TBSPUS);}
        public final Volume fromTeaspoonsMetric(double v){return s(this, v, Z.TSPM);}
        public final Volume fromTeaspoonsUK(double v){return s(this, v, Z.TSPUK);}
        public final Volume fromTeaspoonsUS(double v){return s(this, v, Z.TSPUS);}
        public final Volume fromTeraliters(double v){return s(this, v, Z.TL);}
        public final Volume fromTuns(double v){return s(this, v, Z.TUN);}
                
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toCubicMeters(); //Variable "bar" being of type UnitOf.Volume with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Volume().fromLiters(1.25).toCubicMeters(); //One line conversion from 1.25 Liters to CubicMeters
        */
        public final double toAcreFeetUSSurvey(){return c(Z.ACFTUS);}
        public final double toAcreInches(){return c(Z.ACIN);}
        public final double toArceFeet(){return c(Z.ACFTO);}
        public final double toAttoliters(){return c(Z.AL);}
        public final double toBarrelsOfOil(){return c(Z.BBLO);}
        public final double toBarrelsUK(){return c(Z.BBLUK);}
        public final double toBarrelsUS(){return c(Z.BBLUS);}
        public final double toBoardFeet(){return c(Z.FBM);}
        public final double toCentiliters(){return c(Z.CL);}
        public final double toCords(){return c(Z.CORD);}
        public final double toCubicCentimeters(){return c(Z.CM);}
        public final double toCubicDecimeters(){return c(Z.DM);}
        public final double toCubicFeet(){return c(Z.FT);}
        public final double toCubicInches(){return c(Z.IN);}
        public final double toCubicKilometers(){return c(Z.KM);}
        public final double toCubicMeters(){return c(Z.M);}
        public final double toCubicMiles(){return c(Z.MI);}
        public final double toCubicMillimeters(){return c(Z.MM);}
        public final double toCubicYards(){return c(Z.YD);}
        public final double toCupsMetric(){return c(Z.CUPM);}
        public final double toCupsUK(){return c(Z.CUPUK);}
        public final double toCupsUS(){return c(Z.CUPUS);}
        public final double toDeciliters(){return c(Z.DL);}
        public final double toDecisteres(){return c(Z.DECI);}
        public final double toDekaliters(){return c(Z.DAL);}
        public final double toDekasteres(){return c(Z.DEKA);}
        public final double toDessertspoonsUK(){return c(Z.DSTSPNUK);}
        public final double toDessertspoonsUS(){return c(Z.DSTSPNUS);}
        public final double toDrops(){return c(Z.DROP);}
        public final double toExaliters(){return c(Z.EL);}
        public final double toFemtoliters(){return c(Z.FL);}
        public final double toFluidOuncesUK(){return c(Z.FLOZUK);}
        public final double toFluidOuncesUS(){return c(Z.FLOZUS);}
        public final double toGallonsUK(){return c(Z.GALUK);}
        public final double toGallonsUS(){return c(Z.GALUS);}
        public final double toGigaliters(){return c(Z.GL);}
        public final double toGillsUK(){return c(Z.GILUK);}
        public final double toGillsUS(){return c(Z.GILUS);}
        public final double toHectoliters(){return c(Z.HL);}
        public final double toHogsheads(){return c(Z.HOG);}
        public final double toHundredCubicFeet(){return c(Z.CCF);}
        public final double toKiloliters(){return c(Z.KL);}
        public final double toLiters(){return c(Z.L);}
        public final double toMegaliters(){return c(Z.ML);}
        public final double toMicroliters(){return c(Z.MUL);}
        public final double toMilliliters(){return c(Z.MILL);}
        public final double toMinimsUK(){return c(Z.MINIUK);}
        public final double toMinimsUS(){return c(Z.MINIUS);}
        public final double toNanoliters(){return c(Z.NL);}
        public final double toPetaliters(){return c(Z.PEL);}
        public final double toPicoliters(){return c(Z.PL);}
        public final double toPintsUK(){return c(Z.PTUK);}
        public final double toPintsUS(){return c(Z.PTUS);}
        public final double toQuartsUK(){return c(Z.QTUK);}
        public final double toQuartsUS(){return c(Z.QTUS);}
        public final double toRegisterTons(){return c(Z.REGTON);}
        public final double toSteres(){return c(Z.ST);}
        public final double toTablespoonsMetric(){return c(Z.TBSPM);}
        public final double toTablespoonsUK(){return c(Z.TBSPUK);}
        public final double toTablespoonsUS(){return c(Z.TBSPUS);}
        public final double toTeaspoonsMetric(){return c(Z.TSPM);}
        public final double toTeaspoonsUK(){return c(Z.TSPUK);}
        public final double toTeaspoonsUS(){return c(Z.TSPUS);}
        public final double toTeraliters(){return c(Z.TL);}
        public final double toTuns(){return c(Z.TUN);}       
    }
}