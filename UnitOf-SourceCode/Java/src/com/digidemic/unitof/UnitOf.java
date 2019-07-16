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
 * http://www.apache.org/licenses/LICENSE-2.0
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
public class UnitOf implements Serializable {

    /**
     * UnitOf.Acceleration()
     *
     * Ex: double foo = new UnitOf.Acceleration().fromGravity(1.25).toGalileos(); //One line conversion from 1.25 Gravity to Galileos
     */
    public static class Acceleration extends BaseMeasurementUnit<AccelerationUnits> implements Serializable {

        /*
        Method to perform all conversions within Acceleration class.
        All "to" methods within Acceleration use this method.
        */
        private final double c(AccelerationUnits t) {
            return doConvert(t.TO_MS, conversionHelper.type.TO_MS, false);
        }

        /*
        "from" Methods

        Ex: UnitOf.Acceleration foo = new UnitOf.Acceleration().fromGravity(1.25); //Variable "foo" will be able to convert 1.25 Gravity into any unit of Acceleration
        */
        public final Acceleration fromAttometersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.AS);
        }

        public final Acceleration fromCentimeterPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.CS);
        }

        public final Acceleration fromDecimetersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.DS);
        }

        public final Acceleration fromDekametersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.DAS);
        }

        public final Acceleration fromExametersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.ES);
        }

        public final Acceleration fromFeetPerHourPerSecond(double v) {
            return store(this, v, AccelerationUnits.FTHS);
        }

        public final Acceleration fromFeetPerMinutePerSecond(double v) {
            return store(this, v, AccelerationUnits.FTMS);
        }

        public final Acceleration fromFeetPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.FTS);
        }

        public final Acceleration fromFemtometersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.FS);
        }

        public final Acceleration fromGalileos(double v) {
            return store(this, v, AccelerationUnits.GAL);
        }

        public final Acceleration fromGigametersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.GS);
        }

        public final Acceleration fromGravity(double v) {
            return store(this, v, AccelerationUnits.G);
        }

        public final Acceleration fromHectometersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.HS);
        }

        public final Acceleration fromInchesPerMinutePerSecond(double v) {
            return store(this, v, AccelerationUnits.INMS);
        }

        public final Acceleration fromInchesPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.INS);
        }

        public final Acceleration fromKilometersPerHourPerSecond(double v) {
            return store(this, v, AccelerationUnits.KHS);
        }

        public final Acceleration fromKilometersPerHourSquared(double v) {
            return store(this, v, AccelerationUnits.KH);
        }

        public final Acceleration fromKilometersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.KS);
        }

        public final Acceleration fromKnotsPerSecond(double v) {
            return store(this, v, AccelerationUnits.KNS);
        }

        public final Acceleration fromMegametersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.MGS);
        }

        public final Acceleration fromMetersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.MS);
        }

        public final Acceleration fromMicrogalileos(double v) {
            return store(this, v, AccelerationUnits.MUGAL);
        }

        public final Acceleration fromMicrometersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.MUS);
        }

        public final Acceleration fromMilesPerHourPerSecond(double v) {
            return store(this, v, AccelerationUnits.MIHS);
        }

        public final Acceleration fromMilesPerMinutePerSecond(double v) {
            return store(this, v, AccelerationUnits.MIMS);
        }

        public final Acceleration fromMilesPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.MIS);
        }

        public final Acceleration fromMilligalileos(double v) {
            return store(this, v, AccelerationUnits.MILGAL);
        }

        public final Acceleration fromMillimetersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.MILS);
        }

        public final Acceleration fromNanometersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.NS);
        }

        public final Acceleration fromPetametersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.PES);
        }

        public final Acceleration fromPicometersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.PS);
        }

        public final Acceleration fromTerametersPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.TS);
        }

        public final Acceleration fromYardsPerSecondSquared(double v) {
            return store(this, v, AccelerationUnits.YDS);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toGalileos(); //Variable "bar" being of type UnitOf.Acceleration with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Acceleration().fromGravity(1.25).toGalileos(); //One line conversion from 1.25 Gravity to Galileos
        */
        public final double toAttometersPerSecondSquared() {
            return c(AccelerationUnits.AS);
        }

        public final double toCentimeterPerSecondSquared() {
            return c(AccelerationUnits.CS);
        }

        public final double toDecimetersPerSecondSquared() {
            return c(AccelerationUnits.DS);
        }

        public final double toDekametersPerSecondSquared() {
            return c(AccelerationUnits.DAS);
        }

        public final double toExametersPerSecondSquared() {
            return c(AccelerationUnits.ES);
        }

        public final double toFeetPerHourPerSecond() {
            return c(AccelerationUnits.FTHS);
        }

        public final double toFeetPerMinutePerSecond() {
            return c(AccelerationUnits.FTMS);
        }

        public final double toFeetPerSecondSquared() {
            return c(AccelerationUnits.FTS);
        }

        public final double toFemtometersPerSecondSquared() {
            return c(AccelerationUnits.FS);
        }

        public final double toGalileos() {
            return c(AccelerationUnits.GAL);
        }

        public final double toGigametersPerSecondSquared() {
            return c(AccelerationUnits.GS);
        }

        public final double toGravity() {
            return c(AccelerationUnits.G);
        }

        public final double toHectometersPerSecondSquared() {
            return c(AccelerationUnits.HS);
        }

        public final double toInchesPerMinutePerSecond() {
            return c(AccelerationUnits.INMS);
        }

        public final double toInchesPerSecondSquared() {
            return c(AccelerationUnits.INS);
        }

        public final double toKilometersPerHourPerSecond() {
            return c(AccelerationUnits.KHS);
        }

        public final double toKilometersPerHourSquared() {
            return c(AccelerationUnits.KH);
        }

        public final double toKilometersPerSecondSquared() {
            return c(AccelerationUnits.KS);
        }

        public final double toKnotsPerSecond() {
            return c(AccelerationUnits.KNS);
        }

        public final double toMegametersPerSecondSquared() {
            return c(AccelerationUnits.MGS);
        }

        public final double toMetersPerSecondSquared() {
            return c(AccelerationUnits.MS);
        }

        public final double toMicrogalileos() {
            return c(AccelerationUnits.MUGAL);
        }

        public final double toMicrometersPerSecondSquared() {
            return c(AccelerationUnits.MUS);
        }

        public final double toMilesPerHourPerSecond() {
            return c(AccelerationUnits.MIHS);
        }

        public final double toMilesPerMinutePerSecond() {
            return c(AccelerationUnits.MIMS);
        }

        public final double toMilesPerSecondSquared() {
            return c(AccelerationUnits.MIS);
        }

        public final double toMilligalileos() {
            return c(AccelerationUnits.MILGAL);
        }

        public final double toMillimetersPerSecondSquared() {
            return c(AccelerationUnits.MILS);
        }

        public final double toNanometersPerSecondSquared() {
            return c(AccelerationUnits.NS);
        }

        public final double toPetametersPerSecondSquared() {
            return c(AccelerationUnits.PES);
        }

        public final double toPicometersPerSecondSquared() {
            return c(AccelerationUnits.PS);
        }

        public final double toTerametersPerSecondSquared() {
            return c(AccelerationUnits.TS);
        }

        public final double toYardsPerSecondSquared() {
            return c(AccelerationUnits.YDS);
        }
    }

    /**
     * UnitOf.Angle()
     *
     * Ex: double foo = new UnitOf.Angle().fromDegrees(1.25).toRadians(); //One line conversion from 1.25 Degrees to Radians
     */
    public static class Angle extends BaseMeasurementUnit<AngleUnits> implements Serializable {

        /*
        Method to perform all conversions within Angle class.
        All "to" methods within Angle use this method.
        */
        private final double c(AngleUnits t) {
            return doConvert(t.TO_D, conversionHelper.type.TO_D);
        }

        /*
        "from" Methods

        Ex: UnitOf.Angle foo = new UnitOf.Angle().fromDegrees(1.25); //Variable "foo" will be able to convert 1.25 Degrees into any unit of Angle
        */
        public final Angle fromCircles(double v) {
            return store(this, v, AngleUnits.C);
        }

        public final Angle fromDegrees(double v) {
            return store(this, v, AngleUnits.D);
        }

        public final Angle fromGradians(double v) {
            return store(this, v, AngleUnits.G);
        }

        public final Angle fromMils(double v) {
            return store(this, v, AngleUnits.MIL);
        }

        public final Angle fromMinutes(double v) {
            return store(this, v, AngleUnits.M);
        }

        public final Angle fromQuadrants(double v) {
            return store(this, v, AngleUnits.Q);
        }

        public final Angle fromRadians(double v) {
            return store(this, v, AngleUnits.RAD);
        }

        public final Angle fromRevolutions(double v) {
            return store(this, v, AngleUnits.R);
        }

        public final Angle fromRightAngles(double v) {
            return store(this, v, AngleUnits.RA);
        }

        public final Angle fromSeconds(double v) {
            return store(this, v, AngleUnits.S);
        }

        public final Angle fromSextants(double v) {
            return store(this, v, AngleUnits.SE);
        }

        public final Angle fromSigns(double v) {
            return store(this, v, AngleUnits.SI);
        }

        public final Angle fromTurns(double v) {
            return store(this, v, AngleUnits.T);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toRadians(); //Variable "bar" being of type UnitOf.Angle with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Angle().fromDegrees(1.25).toRadians(); //One line conversion from 1.25 Degrees to Radians
        */
        public final double toCircles() {
            return c(AngleUnits.C);
        }

        public final double toDegrees() {
            return c(AngleUnits.D);
        }

        public final double toGradians() {
            return c(AngleUnits.G);
        }

        public final double toMils() {
            return c(AngleUnits.MIL);
        }

        public final double toMinutes() {
            return c(AngleUnits.M);
        }

        public final double toQuadrants() {
            return c(AngleUnits.Q);
        }

        public final double toRadians() {
            return c(AngleUnits.RAD);
        }

        public final double toRevolutions() {
            return c(AngleUnits.R);
        }

        public final double toRightAngles() {
            return c(AngleUnits.RA);
        }

        public final double toSeconds() {
            return c(AngleUnits.S);
        }

        public final double toSextants() {
            return c(AngleUnits.SE);
        }

        public final double toSigns() {
            return c(AngleUnits.SI);
        }

        public final double toTurns() {
            return c(AngleUnits.T);
        }
    }

    /**
     * UnitOf.Anything() - Build your own custom measurement at compile or run-time using the UnitOf methodology
     *
     * See UnitOf example projects on Github for fully working examples
     */
    public static class Anything implements Serializable {
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
        private final double c(double fc, double cv, double tc) {
            return Utils.divideOrMultiply(Utils.divideOrMultiply(cv, tc, mtd), fc, !mtd);
        }

        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet");
         *
         * @param keyName Key Unit Name. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         */
        public Anything(Object keyName) {
            this(keyName, 1);
        }

        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",1);
         *
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param keyValue Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         */
        public Anything(Object keyName, double keyValue) {
            this(keyName, keyValue, true, new HashMap());
        }

        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",true);
         *
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param multiplyToKeyThenDivide Multiply then divide conversion algorithm, false will divide then multiply when converting "to"
         */
        public Anything(Object keyName, boolean multiplyToKeyThenDivide) {
            this(keyName, 1, multiplyToKeyThenDivide, new HashMap());
        }

        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet", new HashMap<Object, Double>(){{put("Meters",0.3048); put("Inches",12.0);}});
         *
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param units Available units defined by the user what can be converted from and into. This works similarly to enums of each UnitOf measurement. Type HashMap of Objects/Double for the key/value (Ex: Feet/1).
         */
        public Anything(Object keyName, HashMap<Object, Double> units) {
            this(keyName, 1, true, units);
        }

        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet", new double[]{1,0.3048,12});
         *
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param units Available units defined by the user what can be converted from and into. This works similarly to enums of each UnitOf measurement. Type Array of doubles: unlike the constructors that uses a HashMap to define the key/value pair (like meters/1), only the value is defined here and is used for both key/value (so 1/1)
         */
        public Anything(Object keyName, double[] units) {
            this(keyName, 1, true, Utils.convertDoubleArrayToHashMap(units));
        }

        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",1,true);
         *
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param keyValue Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param multiplyToKeyThenDivide Multiply then divide conversion algorithm, false will divide then multiply when converting "to"
         */
        public Anything(Object keyName, double keyValue, boolean multiplyToKeyThenDivide) {
            this(keyName, keyValue, multiplyToKeyThenDivide, new HashMap());
        }

        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",1, new HashMap<Object, Double>(){{put("Meters",0.3048); put("Inches",12.0);}});
         *
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param keyValue Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param units Available units defined by the user what can be converted from and into. This works similarly to enums of each UnitOf measurement. Type HashMap of Objects/Double for the key/value (Ex: Feet/1).
         */
        public Anything(Object keyName, double keyValue, HashMap<Object, Double> units) {
            this(keyName, keyValue, true, units);
        }

        /**
         * Create new UnitOf.Anything
         * Ex: new UnitOf.Anything("Feet",1, new double[]{1,0.3048,12});
         *
         * @param keyName Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param keyValue Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. Value here will be set to 1. Key Name/Value is automatically added as a Unit. .Anything() Conversion works by converting the starting value to this key then from the key to the desired value.
         * @param units Available units defined by the user what can be converted from and into. This works similarly to enums of each UnitOf measurement. Type Array of doubles: unlike the constructors that uses a HashMap to define the key/value pair (like meters/1), only the value is defined here and is used for both key/value (so 1/1)
         */
        public Anything(Object keyName, double keyValue, double[] units) {
            this(keyName, keyValue, true, Utils.convertDoubleArrayToHashMap(units));
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
        public Anything(Object keyName, double keyValue, boolean multiplyToKeyThenDivide, double[] units) {
            this(keyName, keyValue, multiplyToKeyThenDivide, Utils.convertDoubleArrayToHashMap(units));
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
        public Anything(Object keyName, double keyValue, boolean multiplyToKeyThenDivide, HashMap<Object, Double> units) {
            this.kn = nc(keyName);
            this.fn = this.kn;
            this.kv = keyValue;
            this.fv = this.kv;
            this.mtd = multiplyToKeyThenDivide;
            if (units != null) {
                this.u = units;
            }
            this.u.put(this.kn, this.kv);   //if collection of units is passed in it is not necessary to include it with the collection of units as it is added/updated here.
        }

        /**
         * Adds or updates a Unit's Name with its associated Value in relation to the Key to the collection of Units.
         * @param nameAndValue Unit Value for the Unit Name in relation to the Key. Unit Name here is also the value.
         */
        public final void addUnit(double nameAndValue) {
            addUnit(nameAndValue, nameAndValue);
        }

        /**
         * Adds or updates a Unit's Name with its associated Value in relation to the Key to the collection of Units.
         * @param name Unit Name
         * @param val Unit Value for the Unit Name in relation to the Key
         */
        public final void addUnit(Object name, double val) {
            Object n = nc(name);
            if (kn.equals(n)) {
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
        private final double getUnitValueByName(Object name) {
            try {
                return u.get(nc(name));
            } catch (Exception e) {
                return u.getOrDefault((new DataType(name)).toDouble(-998.7654), 0.0);
            }
        }

        /**
         * View the Unit Key Name originally passed in to the .Anything() constructor.
         * Conversion here works by converting the starting value to this key then from the key to the desired value.
         * @return The Unit Key Name
         */
        public final Object getKeyName() {
            return kn;
        }

        /**
         * View the Unit Key Value originally passed in to the .Anything() constructor.
         * Conversion here works by converting the starting value to this key then from the key to the desired value.
         * @return The Unit Key Value
         */
        public final double getKeyValue() {
            return kv;
        }

        /**
         * Returns the set "from" Unit Name
         */
        public final Object getFromName() {
            return fn;
        }

        /**
         * Returns the set "from" Unit Value
         */
        public final double getFromValue() {
            return fv;
        }

        /**
         * Initializes the declared new UnitOf.Anything variable with its Unit Name/Value.
         * Following this with UnitOf.Anything's to() will convert this value to the desired type's value
         * @param fromValue Starting Unit Value to be converted
         * @param fromName Starting Unit Name to be converted
         */
        public final void from(Object fromName, double fromValue) {
            this.fn = nc(fromName);
            this.fv = fromValue;
        }

        /**
         * Convert the already passed in "from" Unit Name/Value
         * @param toName Convert already passed in "from" Unit into this unit by name
         * @return The finished conversion Value
         */
        public final double to(Object toName) {
            return convertNow(fv, fn, toName);
        }

        /**
         * One liner conversion, pass in a starting Unit Name/Value to be converted into the desired Unit by Name.
         * @param fromValue Starting Unit Value
         * @param fromName Starting Unit Name
         * @param toName Converting into Unit Name
         * @return The finished conversion Value
         */
        public final double convertNow(double fromValue, Object fromName, Object toName) {
            return c(getUnitValueByName(fromName), fromValue, getUnitValueByName(toName));
        }

        /**
         * Safely check and replace Object if null
         * @param o Object to be checked if null
         * @return "null" if null, Object passed in if not null
         */
        private final Object nc(Object o) {
            return (o == null) ? "null" : o;
        }
    }

    /**
     * UnitOf.Area()
     *
     * Ex: double foo = new UnitOf.Area().fromSquareMeters(1.25).toAcres(); //One line conversion from 1.25 SquareMeters to Acres
     */
    public static class Area extends BaseMeasurementUnit<AreaUnits> implements Serializable {

        /*
        Method to perform all conversions within Area class.
        All "to" methods within Area use this method.
        */
        private final double c(AreaUnits t) {
            return doConvert(t.TO_M, conversionHelper.type.TO_M);
        }

        /*
        "from" Methods

        Ex: UnitOf.Area foo = new UnitOf.Area().fromSquareMeters(1.25); //Variable "foo" will be able to convert 1.25 SquareMeters into any unit of Area
        */
        public final Area fromAcres(double v) {
            return store(this, v, AreaUnits.AC);
        }

        public final Area fromAres(double v) {
            return store(this, v, AreaUnits.A);
        }

        public final Area fromArpents(double v) {
            return store(this, v, AreaUnits.AR);
        }

        public final Area fromBarns(double v) {
            return store(this, v, AreaUnits.B);
        }

        public final Area fromCircularInches(double v) {
            return store(this, v, AreaUnits.CRIN);
        }

        public final Area fromCircularMils(double v) {
            return store(this, v, AreaUnits.CRMIL);
        }

        public final Area fromHectares(double v) {
            return store(this, v, AreaUnits.HA);
        }

        public final Area fromHomesteads(double v) {
            return store(this, v, AreaUnits.HS);
        }

        public final Area fromRoods(double v) {
            return store(this, v, AreaUnits.R);
        }

        public final Area fromSabins(double v) {
            return store(this, v, AreaUnits.S);
        }

        public final Area fromSquareCentimeters(double v) {
            return store(this, v, AreaUnits.C);
        }

        public final Area fromSquareChains(double v) {
            return store(this, v, AreaUnits.CH);
        }

        public final Area fromSquareDecimeters(double v) {
            return store(this, v, AreaUnits.D);
        }

        public final Area fromSquareDekameters(double v) {
            return store(this, v, AreaUnits.DA);
        }

        public final Area fromSquareFeet(double v) {
            return store(this, v, AreaUnits.FT);
        }

        public final Area fromSquareHectometers(double v) {
            return store(this, v, AreaUnits.H);
        }

        public final Area fromSquareInches(double v) {
            return store(this, v, AreaUnits.IN);
        }

        public final Area fromSquareKilometers(double v) {
            return store(this, v, AreaUnits.K);
        }

        public final Area fromSquareMeters(double v) {
            return store(this, v, AreaUnits.M);
        }

        public final Area fromSquareMicrometers(double v) {
            return store(this, v, AreaUnits.MU);
        }

        public final Area fromSquareMiles(double v) {
            return store(this, v, AreaUnits.MI);
        }

        public final Area fromSquareMillimeters(double v) {
            return store(this, v, AreaUnits.MIL);
        }

        public final Area fromSquareNanometers(double v) {
            return store(this, v, AreaUnits.N);
        }

        public final Area fromSquarePerches(double v) {
            return store(this, v, AreaUnits.PE);
        }

        public final Area fromSquarePoles(double v) {
            return store(this, v, AreaUnits.PO);
        }

        public final Area fromSquareRods(double v) {
            return store(this, v, AreaUnits.ROD);
        }

        public final Area fromSquareYards(double v) {
            return store(this, v, AreaUnits.YD);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toAcres(); //Variable "bar" being of type UnitOf.Area with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Area().fromSquareMeters(1.25).toAcres(); //One line conversion from 1.25 SquareMeters to Acres
        */
        public final double toAcres() {
            return c(AreaUnits.AC);
        }

        public final double toAres() {
            return c(AreaUnits.A);
        }

        public final double toArpents() {
            return c(AreaUnits.AR);
        }

        public final double toBarns() {
            return c(AreaUnits.B);
        }

        public final double toCircularInches() {
            return c(AreaUnits.CRIN);
        }

        public final double toCircularMils() {
            return c(AreaUnits.CRMIL);
        }

        public final double toHectares() {
            return c(AreaUnits.HA);
        }

        public final double toHomesteads() {
            return c(AreaUnits.HS);
        }

        public final double toRoods() {
            return c(AreaUnits.R);
        }

        public final double toSabins() {
            return c(AreaUnits.S);
        }

        public final double toSquareCentimeters() {
            return c(AreaUnits.C);
        }

        public final double toSquareChains() {
            return c(AreaUnits.CH);
        }

        public final double toSquareDecimeters() {
            return c(AreaUnits.D);
        }

        public final double toSquareDekameters() {
            return c(AreaUnits.DA);
        }

        public final double toSquareFeet() {
            return c(AreaUnits.FT);
        }

        public final double toSquareHectometers() {
            return c(AreaUnits.H);
        }

        public final double toSquareInches() {
            return c(AreaUnits.IN);
        }

        public final double toSquareKilometers() {
            return c(AreaUnits.K);
        }

        public final double toSquareMeters() {
            return c(AreaUnits.M);
        }

        public final double toSquareMicrometers() {
            return c(AreaUnits.MU);
        }

        public final double toSquareMiles() {
            return c(AreaUnits.MI);
        }

        public final double toSquareMillimeters() {
            return c(AreaUnits.MIL);
        }

        public final double toSquareNanometers() {
            return c(AreaUnits.N);
        }

        public final double toSquarePerches() {
            return c(AreaUnits.PE);
        }

        public final double toSquarePoles() {
            return c(AreaUnits.PO);
        }

        public final double toSquareRods() {
            return c(AreaUnits.ROD);
        }

        public final double toSquareYards() {
            return c(AreaUnits.YD);
        }
    }

    /**
     * UnitOf.DataStorage()
     *
     * Ex: double foo = new UnitOf.DataStorage().fromMegabytes(1.25).toKilobytes(); //One line conversion from 1.25 Megabytes to Kilobytes
     */
    public static class DataStorage extends BaseMeasurementUnit<DataStorageUnits> implements Serializable {

        /*
        Method to perform all conversions within DataStorage class.
        All "to" methods within DataStorage use this method.
        */
        private final double c(DataStorageUnits t) {
            return doConvert(t.TO_MB, conversionHelper.type.TO_MB);
        }

        /*
        "from" Methods

        Ex: UnitOf.DataStorage foo = new UnitOf.DataStorage().fromMegabytes(1.25); //Variable "foo" will be able to convert 1.25 Megabytes into any unit of DataStorage
        */
        public final DataStorage fromBits(double v) {
            return store(this, v, DataStorageUnits.B);
        }

        public final DataStorage fromBlocks(double v) {
            return store(this, v, DataStorageUnits.BL);
        }

        public final DataStorage fromBluRay_DoubleLayer(double v) {
            return store(this, v, DataStorageUnits.BD2);
        }

        public final DataStorage fromBluRay_SingleLayer(double v) {
            return store(this, v, DataStorageUnits.BD1);
        }

        public final DataStorage fromBytes(double v) {
            return store(this, v, DataStorageUnits.BY);
        }

        public final DataStorage fromCDs_74Minutes(double v) {
            return store(this, v, DataStorageUnits.CD74);
        }

        public final DataStorage fromCDs_80Minutes(double v) {
            return store(this, v, DataStorageUnits.CD80);
        }

        public final DataStorage fromDVDs_DoubleSidedDoubleLayer(double v) {
            return store(this, v, DataStorageUnits.D22);
        }

        public final DataStorage fromDVDs_DoubleSidedSingleLayer(double v) {
            return store(this, v, DataStorageUnits.D12);
        }

        public final DataStorage fromDVDs_SingleSidedDoubleLayer(double v) {
            return store(this, v, DataStorageUnits.D21);
        }

        public final DataStorage fromDVDs_SingleSidedSingleLayer(double v) {
            return store(this, v, DataStorageUnits.D11);
        }

        public final DataStorage fromExabits(double v) {
            return store(this, v, DataStorageUnits.EBI);
        }

        public final DataStorage fromExabytes(double v) {
            return store(this, v, DataStorageUnits.EB);
        }

        public final DataStorage fromFloppyDisks_35DD(double v) {
            return store(this, v, DataStorageUnits.F35DD);
        }

        public final DataStorage fromFloppyDisks_35ED(double v) {
            return store(this, v, DataStorageUnits.F35ED);
        }

        public final DataStorage fromFloppyDisks_35HD(double v) {
            return store(this, v, DataStorageUnits.F35HD);
        }

        public final DataStorage fromFloppyDisks_525DD(double v) {
            return store(this, v, DataStorageUnits.F525DD);
        }

        public final DataStorage fromFloppyDisks_525HD(double v) {
            return store(this, v, DataStorageUnits.F525HD);
        }

        public final DataStorage fromGigabits(double v) {
            return store(this, v, DataStorageUnits.GBI);
        }

        public final DataStorage fromGigabytes(double v) {
            return store(this, v, DataStorageUnits.GB);
        }

        public final DataStorage fromKilobits(double v) {
            return store(this, v, DataStorageUnits.KBI);
        }

        public final DataStorage fromKilobytes(double v) {
            return store(this, v, DataStorageUnits.KB);
        }

        public final DataStorage fromMegabits(double v) {
            return store(this, v, DataStorageUnits.MBI);
        }

        public final DataStorage fromMegabytes(double v) {
            return store(this, v, DataStorageUnits.MB);
        }

        public final DataStorage fromNibbles(double v) {
            return store(this, v, DataStorageUnits.NI);
        }

        public final DataStorage fromPetabits(double v) {
            return store(this, v, DataStorageUnits.PBI);
        }

        public final DataStorage fromPetabytes(double v) {
            return store(this, v, DataStorageUnits.PB);
        }

        public final DataStorage fromSIUnitExabits(double v) {
            return store(this, v, DataStorageUnits.SIEBI);
        }

        public final DataStorage fromSIUnitExabytes(double v) {
            return store(this, v, DataStorageUnits.SIEB);
        }

        public final DataStorage fromSIUnitGigabits(double v) {
            return store(this, v, DataStorageUnits.SIGBI);
        }

        public final DataStorage fromSIUnitGigabytes(double v) {
            return store(this, v, DataStorageUnits.SIGB);
        }

        public final DataStorage fromSIUnitKilobits(double v) {
            return store(this, v, DataStorageUnits.SIKBI);
        }

        public final DataStorage fromSIUnitKilobytes(double v) {
            return store(this, v, DataStorageUnits.SIKB);
        }

        public final DataStorage fromSIUnitMegabits(double v) {
            return store(this, v, DataStorageUnits.SIMBI);
        }

        public final DataStorage fromSIUnitMegabytes(double v) {
            return store(this, v, DataStorageUnits.SIMB);
        }

        public final DataStorage fromSIUnitPetabits(double v) {
            return store(this, v, DataStorageUnits.SIPBI);
        }

        public final DataStorage fromSIUnitPetabytes(double v) {
            return store(this, v, DataStorageUnits.SIPB);
        }

        public final DataStorage fromSIUnitTerabits(double v) {
            return store(this, v, DataStorageUnits.SITBI);
        }

        public final DataStorage fromSIUnitTerabytes(double v) {
            return store(this, v, DataStorageUnits.SITB);
        }

        public final DataStorage fromSIUnitYottabits(double v) {
            return store(this, v, DataStorageUnits.SIYBI);
        }

        public final DataStorage fromSIUnitYottabytes(double v) {
            return store(this, v, DataStorageUnits.SIYB);
        }

        public final DataStorage fromSIUnitZettabits(double v) {
            return store(this, v, DataStorageUnits.SIZBI);
        }

        public final DataStorage fromSIUnitZettabytes(double v) {
            return store(this, v, DataStorageUnits.SIZB);
        }

        public final DataStorage fromTerabits(double v) {
            return store(this, v, DataStorageUnits.TBI);
        }

        public final DataStorage fromTerabytes(double v) {
            return store(this, v, DataStorageUnits.TB);
        }

        public final DataStorage fromWords(double v) {
            return store(this, v, DataStorageUnits.W);
        }

        public final DataStorage fromYottabits(double v) {
            return store(this, v, DataStorageUnits.YBI);
        }

        public final DataStorage fromYottabytes(double v) {
            return store(this, v, DataStorageUnits.YB);
        }

        public final DataStorage fromZettabits(double v) {
            return store(this, v, DataStorageUnits.ZBI);
        }

        public final DataStorage fromZettabytes(double v) {
            return store(this, v, DataStorageUnits.ZB);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toKilobytes(); //Variable "bar" being of type UnitOf.DataStorage with "from" value already assigned
        Ex 2: double foobar = new UnitOf.DataStorage().fromMegabytes(1.25).toKilobytes(); //One line conversion from 1.25 Megabytes to Kilobytes
        */
        public final double toBits() {
            return c(DataStorageUnits.B);
        }

        public final double toBlocks() {
            return c(DataStorageUnits.BL);
        }

        public final double toBluRay_DoubleLayer() {
            return c(DataStorageUnits.BD2);
        }

        public final double toBluRay_SingleLayer() {
            return c(DataStorageUnits.BD1);
        }

        public final double toBytes() {
            return c(DataStorageUnits.BY);
        }

        public final double toCDs_74Minutes() {
            return c(DataStorageUnits.CD74);
        }

        public final double toCDs_80Minutes() {
            return c(DataStorageUnits.CD80);
        }

        public final double toDVDs_DoubleSidedDoubleLayer() {
            return c(DataStorageUnits.D22);
        }

        public final double toDVDs_DoubleSidedSingleLayer() {
            return c(DataStorageUnits.D12);
        }

        public final double toDVDs_SingleSidedDoubleLayer() {
            return c(DataStorageUnits.D21);
        }

        public final double toDVDs_SingleSidedSingleLayer() {
            return c(DataStorageUnits.D11);
        }

        public final double toExabits() {
            return c(DataStorageUnits.EBI);
        }

        public final double toExabytes() {
            return c(DataStorageUnits.EB);
        }

        public final double toFloppyDisks_35DD() {
            return c(DataStorageUnits.F35DD);
        }

        public final double toFloppyDisks_35ED() {
            return c(DataStorageUnits.F35ED);
        }

        public final double toFloppyDisks_35HD() {
            return c(DataStorageUnits.F35HD);
        }

        public final double toFloppyDisks_525DD() {
            return c(DataStorageUnits.F525DD);
        }

        public final double toFloppyDisks_525HD() {
            return c(DataStorageUnits.F525HD);
        }

        public final double toGigabits() {
            return c(DataStorageUnits.GBI);
        }

        public final double toGigabytes() {
            return c(DataStorageUnits.GB);
        }

        public final double toKilobits() {
            return c(DataStorageUnits.KBI);
        }

        public final double toKilobytes() {
            return c(DataStorageUnits.KB);
        }

        public final double toMegabits() {
            return c(DataStorageUnits.MBI);
        }

        public final double toMegabytes() {
            return c(DataStorageUnits.MB);
        }

        public final double toNibbles() {
            return c(DataStorageUnits.NI);
        }

        public final double toPetabits() {
            return c(DataStorageUnits.PBI);
        }

        public final double toPetabytes() {
            return c(DataStorageUnits.PB);
        }

        public final double toSIUnitExabits() {
            return c(DataStorageUnits.SIEBI);
        }

        public final double toSIUnitExabytes() {
            return c(DataStorageUnits.SIEB);
        }

        public final double toSIUnitGigabits() {
            return c(DataStorageUnits.SIGBI);
        }

        public final double toSIUnitGigabytes() {
            return c(DataStorageUnits.SIGB);
        }

        public final double toSIUnitKilobits() {
            return c(DataStorageUnits.SIKBI);
        }

        public final double toSIUnitKilobytes() {
            return c(DataStorageUnits.SIKB);
        }

        public final double toSIUnitMegabits() {
            return c(DataStorageUnits.SIMBI);
        }

        public final double toSIUnitMegabytes() {
            return c(DataStorageUnits.SIMB);
        }

        public final double toSIUnitPetabits() {
            return c(DataStorageUnits.SIPBI);
        }

        public final double toSIUnitPetabytes() {
            return c(DataStorageUnits.SIPB);
        }

        public final double toSIUnitTerabits() {
            return c(DataStorageUnits.SITBI);
        }

        public final double toSIUnitTerabytes() {
            return c(DataStorageUnits.SITB);
        }

        public final double toSIUnitYottabits() {
            return c(DataStorageUnits.SIYBI);
        }

        public final double toSIUnitYottabytes() {
            return c(DataStorageUnits.SIYB);
        }

        public final double toSIUnitZettabits() {
            return c(DataStorageUnits.SIZBI);
        }

        public final double toSIUnitZettabytes() {
            return c(DataStorageUnits.SIZB);
        }

        public final double toTerabits() {
            return c(DataStorageUnits.TBI);
        }

        public final double toTerabytes() {
            return c(DataStorageUnits.TB);
        }

        public final double toWords() {
            return c(DataStorageUnits.W);
        }

        public final double toYottabits() {
            return c(DataStorageUnits.YBI);
        }

        public final double toYottabytes() {
            return c(DataStorageUnits.YB);
        }

        public final double toZettabits() {
            return c(DataStorageUnits.ZBI);
        }

        public final double toZettabytes() {
            return c(DataStorageUnits.ZB);
        }
    }

    /**
     * UnitOf.DataTransferRate()
     *
     * Ex: double foo = new UnitOf.DataTransferRate().fromMegabytesPerSecond(1.25).toKilobytesPerSecond(); //One line conversion from 1.25 MegabytesPerSecond to KilobytesPerSecond
     */
    public static class DataTransferRate extends BaseMeasurementUnit<DataTransferRateUnits> implements Serializable {

        /*
        Method to perform all conversions within DataTransferRate class.
        All "to" methods within DataTransferRate use this method.
        */
        private final double c(DataTransferRateUnits t) {
            return doConvert(t.TO_MBS, conversionHelper.type.TO_MBS);
        }

        /*
        "from" Methods

        Ex: UnitOf.DataTransferRate foo = new UnitOf.DataTransferRate().fromMegabytesPerSecond(1.25); //Variable "foo" will be able to convert 1.25 MegabytesPerSecond into any unit of DataTransferRate
        */
        public final DataTransferRate fromBitsPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.BIS);
        }

        public final DataTransferRate fromBytesPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.BS);
        }

        public final DataTransferRate fromEthernetsBase10(double v) {
            return store(this, v, DataTransferRateUnits.E10);
        }

        public final DataTransferRate fromEthernetsBase100(double v) {
            return store(this, v, DataTransferRateUnits.E100);
        }

        public final DataTransferRate fromEthernetsBase1000(double v) {
            return store(this, v, DataTransferRateUnits.E1000);
        }

        public final DataTransferRate fromFireWires400(double v) {
            return store(this, v, DataTransferRateUnits.FW400);
        }

        public final DataTransferRate fromFireWires800(double v) {
            return store(this, v, DataTransferRateUnits.FW800);
        }

        public final DataTransferRate fromFireWiresS1600_S3200(double v) {
            return store(this, v, DataTransferRateUnits.FW3200);
        }

        public final DataTransferRate fromGigabitsPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.GBIS);
        }

        public final DataTransferRate fromGigabytesPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.GBS);
        }

        public final DataTransferRate fromISDNsDual(double v) {
            return store(this, v, DataTransferRateUnits.ISDND);
        }

        public final DataTransferRate fromISDNsSingle(double v) {
            return store(this, v, DataTransferRateUnits.ISDNS);
        }

        public final DataTransferRate fromKilobitsPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.KBIS);
        }

        public final DataTransferRate fromKilobytesPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.KBS);
        }

        public final DataTransferRate fromMegabitsPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.MBIS);
        }

        public final DataTransferRate fromMegabytesPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.MBS);
        }

        public final DataTransferRate fromModems110b(double v) {
            return store(this, v, DataTransferRateUnits.M110);
        }

        public final DataTransferRate fromModems1200b(double v) {
            return store(this, v, DataTransferRateUnits.M1200);
        }

        public final DataTransferRate fromModems14_4k(double v) {
            return store(this, v, DataTransferRateUnits.M14K);
        }

        public final DataTransferRate fromModems2400b(double v) {
            return store(this, v, DataTransferRateUnits.M2400);
        }

        public final DataTransferRate fromModems28_8k(double v) {
            return store(this, v, DataTransferRateUnits.M28K);
        }

        public final DataTransferRate fromModems300b(double v) {
            return store(this, v, DataTransferRateUnits.M300);
        }

        public final DataTransferRate fromModems33_6k(double v) {
            return store(this, v, DataTransferRateUnits.M33K);
        }

        public final DataTransferRate fromModems56k(double v) {
            return store(this, v, DataTransferRateUnits.M56K);
        }

        public final DataTransferRate fromModems9600b(double v) {
            return store(this, v, DataTransferRateUnits.M9600);
        }

        public final DataTransferRate fromOCs1(double v) {
            return store(this, v, DataTransferRateUnits.OC1);
        }

        public final DataTransferRate fromOCs12(double v) {
            return store(this, v, DataTransferRateUnits.OC12);
        }

        public final DataTransferRate fromOCs192(double v) {
            return store(this, v, DataTransferRateUnits.OC192);
        }

        public final DataTransferRate fromOCs24(double v) {
            return store(this, v, DataTransferRateUnits.OC24);
        }

        public final DataTransferRate fromOCs3(double v) {
            return store(this, v, DataTransferRateUnits.OC3);
        }

        public final DataTransferRate fromOCs48(double v) {
            return store(this, v, DataTransferRateUnits.OC48);
        }

        public final DataTransferRate fromOCs768(double v) {
            return store(this, v, DataTransferRateUnits.OC768);
        }

        public final DataTransferRate fromPetabitsPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.PBIS);
        }

        public final DataTransferRate fromPetabytesPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.PBS);
        }

        public final DataTransferRate fromSIUnitGigabitsPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.SIGBIS);
        }

        public final DataTransferRate fromSIUnitGigabytesPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.SIGBS);
        }

        public final DataTransferRate fromSIUnitKilobitsPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.SIKBIS);
        }

        public final DataTransferRate fromSIUnitKilobytesPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.SIKBS);
        }

        public final DataTransferRate fromSIUnitMegabitsPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.SIMBIS);
        }

        public final DataTransferRate fromSIUnitMegabytesPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.SIMBS);
        }

        public final DataTransferRate fromSIUnitPetabitsPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.SIPBIS);
        }

        public final DataTransferRate fromSIUnitPetabytesPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.SIPBS);
        }

        public final DataTransferRate fromSIUnitTerabitsPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.SITBIS);
        }

        public final DataTransferRate fromSIUnitTerabytesPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.SITBS);
        }

        public final DataTransferRate fromTerabitsPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.TBIS);
        }

        public final DataTransferRate fromTerabytesPerSecond(double v) {
            return store(this, v, DataTransferRateUnits.TBS);
        }

        public final DataTransferRate fromUSBs1_0(double v) {
            return store(this, v, DataTransferRateUnits.USB1);
        }

        public final DataTransferRate fromUSBs2_0(double v) {
            return store(this, v, DataTransferRateUnits.USB2);
        }

        public final DataTransferRate fromUSBs3_0(double v) {
            return store(this, v, DataTransferRateUnits.USB3);
        }

        public final DataTransferRate fromUSBs3_1(double v) {
            return store(this, v, DataTransferRateUnits.USB31);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toKilobytesPerSecond(); //Variable "bar" being of type UnitOf.DataTransferRate with "from" value already assigned
        Ex 2: double foobar = new UnitOf.DataTransferRate().fromMegabytesPerSecond(1.25).toKilobytesPerSecond(); //One line conversion from 1.25 MegabytesPerSecond to KilobytesPerSecond
        */
        public final double toBitsPerSecond() {
            return c(DataTransferRateUnits.BIS);
        }

        public final double toBytesPerSecond() {
            return c(DataTransferRateUnits.BS);
        }

        public final double toEthernetsBase10() {
            return c(DataTransferRateUnits.E10);
        }

        public final double toEthernetsBase100() {
            return c(DataTransferRateUnits.E100);
        }

        public final double toEthernetsBase1000() {
            return c(DataTransferRateUnits.E1000);
        }

        public final double toFireWires400() {
            return c(DataTransferRateUnits.FW400);
        }

        public final double toFireWires800() {
            return c(DataTransferRateUnits.FW800);
        }

        public final double toFireWiresS1600_S3200() {
            return c(DataTransferRateUnits.FW3200);
        }

        public final double toGigabitsPerSecond() {
            return c(DataTransferRateUnits.GBIS);
        }

        public final double toGigabytesPerSecond() {
            return c(DataTransferRateUnits.GBS);
        }

        public final double toISDNsDual() {
            return c(DataTransferRateUnits.ISDND);
        }

        public final double toISDNsSingle() {
            return c(DataTransferRateUnits.ISDNS);
        }

        public final double toKilobitsPerSecond() {
            return c(DataTransferRateUnits.KBIS);
        }

        public final double toKilobytesPerSecond() {
            return c(DataTransferRateUnits.KBS);
        }

        public final double toMegabitsPerSecond() {
            return c(DataTransferRateUnits.MBIS);
        }

        public final double toMegabytesPerSecond() {
            return c(DataTransferRateUnits.MBS);
        }

        public final double toModems110b() {
            return c(DataTransferRateUnits.M110);
        }

        public final double toModems1200b() {
            return c(DataTransferRateUnits.M1200);
        }

        public final double toModems14_4k() {
            return c(DataTransferRateUnits.M14K);
        }

        public final double toModems2400b() {
            return c(DataTransferRateUnits.M2400);
        }

        public final double toModems28_8k() {
            return c(DataTransferRateUnits.M28K);
        }

        public final double toModems300b() {
            return c(DataTransferRateUnits.M300);
        }

        public final double toModems33_6k() {
            return c(DataTransferRateUnits.M33K);
        }

        public final double toModems56k() {
            return c(DataTransferRateUnits.M56K);
        }

        public final double toModems9600b() {
            return c(DataTransferRateUnits.M9600);
        }

        public final double toOCs1() {
            return c(DataTransferRateUnits.OC1);
        }

        public final double toOCs12() {
            return c(DataTransferRateUnits.OC12);
        }

        public final double toOCs192() {
            return c(DataTransferRateUnits.OC192);
        }

        public final double toOCs24() {
            return c(DataTransferRateUnits.OC24);
        }

        public final double toOCs3() {
            return c(DataTransferRateUnits.OC3);
        }

        public final double toOCs48() {
            return c(DataTransferRateUnits.OC48);
        }

        public final double toOCs768() {
            return c(DataTransferRateUnits.OC768);
        }

        public final double toPetabitsPerSecond() {
            return c(DataTransferRateUnits.PBIS);
        }

        public final double toPetabytesPerSecond() {
            return c(DataTransferRateUnits.PBS);
        }

        public final double toSIUnitGigabitsPerSecond() {
            return c(DataTransferRateUnits.SIGBIS);
        }

        public final double toSIUnitGigabytesPerSecond() {
            return c(DataTransferRateUnits.SIGBS);
        }

        public final double toSIUnitKilobitsPerSecond() {
            return c(DataTransferRateUnits.SIKBIS);
        }

        public final double toSIUnitKilobytesPerSecond() {
            return c(DataTransferRateUnits.SIKBS);
        }

        public final double toSIUnitMegabitsPerSecond() {
            return c(DataTransferRateUnits.SIMBIS);
        }

        public final double toSIUnitMegabytesPerSecond() {
            return c(DataTransferRateUnits.SIMBS);
        }

        public final double toSIUnitPetabitsPerSecond() {
            return c(DataTransferRateUnits.SIPBIS);
        }

        public final double toSIUnitPetabytesPerSecond() {
            return c(DataTransferRateUnits.SIPBS);
        }

        public final double toSIUnitTerabitsPerSecond() {
            return c(DataTransferRateUnits.SITBIS);
        }

        public final double toSIUnitTerabytesPerSecond() {
            return c(DataTransferRateUnits.SITBS);
        }

        public final double toTerabitsPerSecond() {
            return c(DataTransferRateUnits.TBIS);
        }

        public final double toTerabytesPerSecond() {
            return c(DataTransferRateUnits.TBS);
        }

        public final double toUSBs1_0() {
            return c(DataTransferRateUnits.USB1);
        }

        public final double toUSBs2_0() {
            return c(DataTransferRateUnits.USB2);
        }

        public final double toUSBs3_0() {
            return c(DataTransferRateUnits.USB3);
        }

        public final double toUSBs3_1() {
            return c(DataTransferRateUnits.USB31);
        }
    }

    /**
     * UnitOf.DataType() - Convert any Java data type and more including converting to and from fractions
     *
     * Ex 1: double foo1 = new UnitOf.DataType("-12.5").toDouble();     //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toDouble() default value of 0.0d is returned.
     * Ex 2: String foo2 = new UnitOf.DataType(12.5).toFraction("3/2"); //Returns "25/2" from 12.5 (double). If the conversion did fail, the .toFraction() passed default value of "3/2" is returned.
     * Ex 3: double bar1 = new UnitOf.DataType("5/2").toDouble();       //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toDouble() default value of 0.0d is returned.
     * Ex 4: int bar2 = new UnitOf.DataType(null).toInt(7);             //Conversion fails, returns 7 as it is the default passed.
     */
    public static class DataType extends DataTypeConversions implements Serializable {
        public DataType(Object value) {
            store(DataType.class, value, (value == null) ? String.valueOf(value) : value.getClass().getSimpleName());
        }
    }

    /**
     * UnitOf.ElectricCharge()
     *
     * Ex: double foo = new UnitOf.ElectricCharge().fromCoulombs(1.25).toAmpereHours(); //One line conversion from 1.25 Coulombs to AmpereHours
     */
    public static class ElectricCharge extends BaseMeasurementUnit<ElectricChargeUnits> implements Serializable {

        /*
        Method to perform all conversions within ElectricCharge class.
        All "to" methods within ElectricCharge use this method.
        */
        private final double c(ElectricChargeUnits t) {
            return doConvert(t.TO_MC, conversionHelper.type.TO_MC);
        }

        /*
        "from" Methods

        Ex: UnitOf.ElectricCharge foo = new UnitOf.ElectricCharge().fromCoulombs(1.25); //Variable "foo" will be able to convert 1.25 Coulombs into any unit of ElectricCharge
        */
        public final ElectricCharge fromAbcoulombs(double v) {
            return store(this, v, ElectricChargeUnits.ABC);
        }

        public final ElectricCharge fromAmpereHours(double v) {
            return store(this, v, ElectricChargeUnits.AH);
        }

        public final ElectricCharge fromAmpereMinutes(double v) {
            return store(this, v, ElectricChargeUnits.AM);
        }

        public final ElectricCharge fromAmpereSeconds(double v) {
            return store(this, v, ElectricChargeUnits.AS);
        }

        public final ElectricCharge fromCoulombs(double v) {
            return store(this, v, ElectricChargeUnits.C);
        }

        public final ElectricCharge fromEMUsOfCharge(double v) {
            return store(this, v, ElectricChargeUnits.EMU);
        }

        public final ElectricCharge fromESUsOfCharge(double v) {
            return store(this, v, ElectricChargeUnits.ESU);
        }

        public final ElectricCharge fromElectronCharge(double v) {
            return store(this, v, ElectricChargeUnits.E);
        }

        public final ElectricCharge fromFaradVolts(double v) {
            return store(this, v, ElectricChargeUnits.F);
        }

        public final ElectricCharge fromFaradayCarbon12(double v) {
            return store(this, v, ElectricChargeUnits.FA12);
        }

        public final ElectricCharge fromFaradayChemistry(double v) {
            return store(this, v, ElectricChargeUnits.FACH);
        }

        public final ElectricCharge fromFaradayPhysics(double v) {
            return store(this, v, ElectricChargeUnits.FAPH);
        }

        public final ElectricCharge fromFranklins(double v) {
            return store(this, v, ElectricChargeUnits.FR);
        }

        public final ElectricCharge fromKilocoulombs(double v) {
            return store(this, v, ElectricChargeUnits.KC);
        }

        public final ElectricCharge fromMegacoulombs(double v) {
            return store(this, v, ElectricChargeUnits.MC);
        }

        public final ElectricCharge fromMicrocoulombs(double v) {
            return store(this, v, ElectricChargeUnits.MUC);
        }

        public final ElectricCharge fromMillicoulombs(double v) {
            return store(this, v, ElectricChargeUnits.MILC);
        }

        public final ElectricCharge fromNanocoulombs(double v) {
            return store(this, v, ElectricChargeUnits.NC);
        }

        public final ElectricCharge fromPicocoulombs(double v) {
            return store(this, v, ElectricChargeUnits.PC);
        }

        public final ElectricCharge fromStatcoulombs(double v) {
            return store(this, v, ElectricChargeUnits.STC);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toAmpereHours(); //Variable "bar" being of type UnitOf.ElectricCharge with "from" value already assigned
        Ex 2: double foobar = new UnitOf.ElectricCharge().fromCoulombs(1.25).toAmpereHours(); //One line conversion from 1.25 Coulombs to AmpereHours
        */
        public final double toAbcoulombs() {
            return c(ElectricChargeUnits.ABC);
        }

        public final double toAmpereHours() {
            return c(ElectricChargeUnits.AH);
        }

        public final double toAmpereMinutes() {
            return c(ElectricChargeUnits.AM);
        }

        public final double toAmpereSeconds() {
            return c(ElectricChargeUnits.AS);
        }

        public final double toCoulombs() {
            return c(ElectricChargeUnits.C);
        }

        public final double toEMUsOfCharge() {
            return c(ElectricChargeUnits.EMU);
        }

        public final double toESUsOfCharge() {
            return c(ElectricChargeUnits.ESU);
        }

        public final double toElectronCharge() {
            return c(ElectricChargeUnits.E);
        }

        public final double toFaradVolts() {
            return c(ElectricChargeUnits.F);
        }

        public final double toFaradayCarbon12() {
            return c(ElectricChargeUnits.FA12);
        }

        public final double toFaradayChemistry() {
            return c(ElectricChargeUnits.FACH);
        }

        public final double toFaradayPhysics() {
            return c(ElectricChargeUnits.FAPH);
        }

        public final double toFranklins() {
            return c(ElectricChargeUnits.FR);
        }

        public final double toKilocoulombs() {
            return c(ElectricChargeUnits.KC);
        }

        public final double toMegacoulombs() {
            return c(ElectricChargeUnits.MC);
        }

        public final double toMicrocoulombs() {
            return c(ElectricChargeUnits.MUC);
        }

        public final double toMillicoulombs() {
            return c(ElectricChargeUnits.MILC);
        }

        public final double toNanocoulombs() {
            return c(ElectricChargeUnits.NC);
        }

        public final double toPicocoulombs() {
            return c(ElectricChargeUnits.PC);
        }

        public final double toStatcoulombs() {
            return c(ElectricChargeUnits.STC);
        }
    }

    /**
     * UnitOf.Energy() / Work
     *
     * Ex: double foo = new UnitOf.Energy().fromJoules(1.25).toWattSeconds(); //One line conversion from 1.25 Joules to WattSeconds
     */
    public static class Energy extends BaseMeasurementUnit<EnergyWorkUnits> implements Serializable {

        /*
        Method to perform all conversions within Energy class.
        All "to" methods within Energy use this method.
        */
        private final double c(EnergyWorkUnits t) {
            return doConvert(t.TO_J, conversionHelper.type.TO_J);
        }

        /*
        "from" Methods

        Ex: UnitOf.Energy foo = new UnitOf.Energy().fromJoules(1.25); //Variable "foo" will be able to convert 1.25 Joules into any unit of Energy
        */
        public final Energy fromAttojoules(double v) {
            return store(this, v, EnergyWorkUnits.AJ);
        }

        public final Energy fromBTUsInternationalStandard(double v) {
            return store(this, v, EnergyWorkUnits.BTU);
        }

        public final Energy fromBTUsThermochemical(double v) {
            return store(this, v, EnergyWorkUnits.BTUTH);
        }

        public final Energy fromBarrelsOfOilEquivalent(double v) {
            return store(this, v, EnergyWorkUnits.BOE);
        }

        public final Energy fromCaloriesInternationalSteam(double v) {
            return store(this, v, EnergyWorkUnits.CALIT);
        }

        public final Energy fromCaloriesNutritional(double v) {
            return store(this, v, EnergyWorkUnits.CALN);
        }

        public final Energy fromCaloriesThermochemical(double v) {
            return store(this, v, EnergyWorkUnits.CALTH);
        }

        public final Energy fromDyneCentimeters(double v) {
            return store(this, v, EnergyWorkUnits.DYNCM);
        }

        public final Energy fromElectronVolts(double v) {
            return store(this, v, EnergyWorkUnits.EV);
        }

        public final Energy fromErgs(double v) {
            return store(this, v, EnergyWorkUnits.ERG);
        }

        public final Energy fromFootPounds(double v) {
            return store(this, v, EnergyWorkUnits.FTLBF);
        }

        public final Energy fromGigajoules(double v) {
            return store(this, v, EnergyWorkUnits.GJ);
        }

        public final Energy fromGigatonsOfTNT(double v) {
            return store(this, v, EnergyWorkUnits.GT);
        }

        public final Energy fromGigawattHours(double v) {
            return store(this, v, EnergyWorkUnits.GWH);
        }

        public final Energy fromGramForceCentimeters(double v) {
            return store(this, v, EnergyWorkUnits.GFCM);
        }

        public final Energy fromGramForceMeters(double v) {
            return store(this, v, EnergyWorkUnits.GFM);
        }

        public final Energy fromHartrees(double v) {
            return store(this, v, EnergyWorkUnits.H);
        }

        public final Energy fromHorsepowerHours(double v) {
            return store(this, v, EnergyWorkUnits.HPH);
        }

        public final Energy fromHorsepowerHoursMetric(double v) {
            return store(this, v, EnergyWorkUnits.HPHM);
        }

        public final Energy fromInchOunces(double v) {
            return store(this, v, EnergyWorkUnits.INOZF);
        }

        public final Energy fromInchPounds(double v) {
            return store(this, v, EnergyWorkUnits.INLBF);
        }

        public final Energy fromJoules(double v) {
            return store(this, v, EnergyWorkUnits.J);
        }

        public final Energy fromKilocaloriesInternationalSteam(double v) {
            return store(this, v, EnergyWorkUnits.KCALIT);
        }

        public final Energy fromKilocaloriesThermochemical(double v) {
            return store(this, v, EnergyWorkUnits.KCALTH);
        }

        public final Energy fromKiloelectronVolts(double v) {
            return store(this, v, EnergyWorkUnits.KEV);
        }

        public final Energy fromKilogramForceCentimeters(double v) {
            return store(this, v, EnergyWorkUnits.KGFCM);
        }

        public final Energy fromKilogramForceMeters(double v) {
            return store(this, v, EnergyWorkUnits.KGFM);
        }

        public final Energy fromKilogramsOfTNT(double v) {
            return store(this, v, EnergyWorkUnits.KGT);
        }

        public final Energy fromKilojoules(double v) {
            return store(this, v, EnergyWorkUnits.KJ);
        }

        public final Energy fromKilopondMeters(double v) {
            return store(this, v, EnergyWorkUnits.KPM);
        }

        public final Energy fromKilotonsOfTNT(double v) {
            return store(this, v, EnergyWorkUnits.KT);
        }

        public final Energy fromKilowattHours(double v) {
            return store(this, v, EnergyWorkUnits.KWH);
        }

        public final Energy fromKilowattSeconds(double v) {
            return store(this, v, EnergyWorkUnits.KWS);
        }

        public final Energy fromLiterAtmospheres(double v) {
            return store(this, v, EnergyWorkUnits.LA);
        }

        public final Energy fromMegaBTUsInternationalStandard(double v) {
            return store(this, v, EnergyWorkUnits.MBTU);
        }

        public final Energy fromMegaelectronVolts(double v) {
            return store(this, v, EnergyWorkUnits.MEV);
        }

        public final Energy fromMegajoules(double v) {
            return store(this, v, EnergyWorkUnits.MJ);
        }

        public final Energy fromMegatonsOfTNT(double v) {
            return store(this, v, EnergyWorkUnits.MT);
        }

        public final Energy fromMegawattHours(double v) {
            return store(this, v, EnergyWorkUnits.MWH);
        }

        public final Energy fromMicrojoules(double v) {
            return store(this, v, EnergyWorkUnits.MUJ);
        }

        public final Energy fromMillijoules(double v) {
            return store(this, v, EnergyWorkUnits.MILJ);
        }

        public final Energy fromNanojoules(double v) {
            return store(this, v, EnergyWorkUnits.NJ);
        }

        public final Energy fromNewtonMeters(double v) {
            return store(this, v, EnergyWorkUnits.NM);
        }

        public final Energy fromPlanckEnergy(double v) {
            return store(this, v, EnergyWorkUnits.EP);
        }

        public final Energy fromPoundalFeet(double v) {
            return store(this, v, EnergyWorkUnits.PDLFT);
        }

        public final Energy fromRydbergs(double v) {
            return store(this, v, EnergyWorkUnits.RY);
        }

        public final Energy fromThermsEC(double v) {
            return store(this, v, EnergyWorkUnits.THMEC);
        }

        public final Energy fromThermsUS(double v) {
            return store(this, v, EnergyWorkUnits.THMUS);
        }

        public final Energy fromTonsOfTNT(double v) {
            return store(this, v, EnergyWorkUnits.TT);
        }

        public final Energy fromWattHours(double v) {
            return store(this, v, EnergyWorkUnits.WH);
        }

        public final Energy fromWattSeconds(double v) {
            return store(this, v, EnergyWorkUnits.WS);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toWattSeconds(); //Variable "bar" being of type UnitOf.Energy with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Energy().fromJoules(1.25).toWattSeconds(); //One line conversion from 1.25 Joules to WattSeconds
        */
        public final double toAttojoules() {
            return c(EnergyWorkUnits.AJ);
        }

        public final double toBTUsInternationalStandard() {
            return c(EnergyWorkUnits.BTU);
        }

        public final double toBTUsThermochemical() {
            return c(EnergyWorkUnits.BTUTH);
        }

        public final double toBarrelsOfOilEquivalent() {
            return c(EnergyWorkUnits.BOE);
        }

        public final double toCaloriesInternationalSteam() {
            return c(EnergyWorkUnits.CALIT);
        }

        public final double toCaloriesNutritional() {
            return c(EnergyWorkUnits.CALN);
        }

        public final double toCaloriesThermochemical() {
            return c(EnergyWorkUnits.CALTH);
        }

        public final double toDyneCentimeters() {
            return c(EnergyWorkUnits.DYNCM);
        }

        public final double toElectronVolts() {
            return c(EnergyWorkUnits.EV);
        }

        public final double toErgs() {
            return c(EnergyWorkUnits.ERG);
        }

        public final double toFootPounds() {
            return c(EnergyWorkUnits.FTLBF);
        }

        public final double toGigajoules() {
            return c(EnergyWorkUnits.GJ);
        }

        public final double toGigatonsOfTNT() {
            return c(EnergyWorkUnits.GT);
        }

        public final double toGigawattHours() {
            return c(EnergyWorkUnits.GWH);
        }

        public final double toGramForceCentimeters() {
            return c(EnergyWorkUnits.GFCM);
        }

        public final double toGramForceMeters() {
            return c(EnergyWorkUnits.GFM);
        }

        public final double toHartrees() {
            return c(EnergyWorkUnits.H);
        }

        public final double toHorsepowerHours() {
            return c(EnergyWorkUnits.HPH);
        }

        public final double toHorsepowerHoursMetric() {
            return c(EnergyWorkUnits.HPHM);
        }

        public final double toInchOunces() {
            return c(EnergyWorkUnits.INOZF);
        }

        public final double toInchPounds() {
            return c(EnergyWorkUnits.INLBF);
        }

        public final double toJoules() {
            return c(EnergyWorkUnits.J);
        }

        public final double toKilocaloriesInternationalSteam() {
            return c(EnergyWorkUnits.KCALIT);
        }

        public final double toKilocaloriesThermochemical() {
            return c(EnergyWorkUnits.KCALTH);
        }

        public final double toKiloelectronVolts() {
            return c(EnergyWorkUnits.KEV);
        }

        public final double toKilogramForceCentimeters() {
            return c(EnergyWorkUnits.KGFCM);
        }

        public final double toKilogramForceMeters() {
            return c(EnergyWorkUnits.KGFM);
        }

        public final double toKilogramsOfTNT() {
            return c(EnergyWorkUnits.KGT);
        }

        public final double toKilojoules() {
            return c(EnergyWorkUnits.KJ);
        }

        public final double toKilopondMeters() {
            return c(EnergyWorkUnits.KPM);
        }

        public final double toKilotonsOfTNT() {
            return c(EnergyWorkUnits.KT);
        }

        public final double toKilowattHours() {
            return c(EnergyWorkUnits.KWH);
        }

        public final double toKilowattSeconds() {
            return c(EnergyWorkUnits.KWS);
        }

        public final double toLiterAtmospheres() {
            return c(EnergyWorkUnits.LA);
        }

        public final double toMegaBTUsInternationalStandard() {
            return c(EnergyWorkUnits.MBTU);
        }

        public final double toMegaelectronVolts() {
            return c(EnergyWorkUnits.MEV);
        }

        public final double toMegajoules() {
            return c(EnergyWorkUnits.MJ);
        }

        public final double toMegatonsOfTNT() {
            return c(EnergyWorkUnits.MT);
        }

        public final double toMegawattHours() {
            return c(EnergyWorkUnits.MWH);
        }

        public final double toMicrojoules() {
            return c(EnergyWorkUnits.MUJ);
        }

        public final double toMillijoules() {
            return c(EnergyWorkUnits.MILJ);
        }

        public final double toNanojoules() {
            return c(EnergyWorkUnits.NJ);
        }

        public final double toNewtonMeters() {
            return c(EnergyWorkUnits.NM);
        }

        public final double toPlanckEnergy() {
            return c(EnergyWorkUnits.EP);
        }

        public final double toPoundalFeet() {
            return c(EnergyWorkUnits.PDLFT);
        }

        public final double toRydbergs() {
            return c(EnergyWorkUnits.RY);
        }

        public final double toThermsEC() {
            return c(EnergyWorkUnits.THMEC);
        }

        public final double toThermsUS() {
            return c(EnergyWorkUnits.THMUS);
        }

        public final double toTonsOfTNT() {
            return c(EnergyWorkUnits.TT);
        }

        public final double toWattHours() {
            return c(EnergyWorkUnits.WH);
        }

        public final double toWattSeconds() {
            return c(EnergyWorkUnits.WS);
        }
    }

    /**
     * UnitOf.Force()
     *
     * Ex: double foo = new UnitOf.Force().fromNewtons(1.25).toPoundForces(); //One line conversion from 1.25 Newtons to PoundForces
     */
    public static class Force extends BaseMeasurementUnit<ForceUnits> implements Serializable {

        /*
        Method to perform all conversions within Force class.
        All "to" methods within Force use this method.
        */
        private final double c(ForceUnits t) {
            return doConvert(t.TO_N, conversionHelper.type.TO_N);
        }

        /*
        "from" Methods

        Ex: UnitOf.Force foo = new UnitOf.Force().fromNewtons(1.25); //Variable "foo" will be able to convert 1.25 Newtons into any unit of Force
        */
        public final Force fromAtomicUnitsOfForce(double v) {
            return store(this, v, ForceUnits.AUF);
        }

        public final Force fromAttonewtons(double v) {
            return store(this, v, ForceUnits.AN);
        }

        public final Force fromCentinewtons(double v) {
            return store(this, v, ForceUnits.CN);
        }

        public final Force fromDecinewtons(double v) {
            return store(this, v, ForceUnits.DN);
        }

        public final Force fromDekanewtons(double v) {
            return store(this, v, ForceUnits.DAN);
        }

        public final Force fromDynes(double v) {
            return store(this, v, ForceUnits.DYN);
        }

        public final Force fromExanewtons(double v) {
            return store(this, v, ForceUnits.EN);
        }

        public final Force fromFemtonewtons(double v) {
            return store(this, v, ForceUnits.FN);
        }

        public final Force fromGiganewtons(double v) {
            return store(this, v, ForceUnits.GN);
        }

        public final Force fromGramForces(double v) {
            return store(this, v, ForceUnits.GF);
        }

        public final Force fromGraveForces(double v) {
            return store(this, v, ForceUnits.GFF);
        }

        public final Force fromHectonewtons(double v) {
            return store(this, v, ForceUnits.HN);
        }

        public final Force fromJouleCentimeters(double v) {
            return store(this, v, ForceUnits.JCM);
        }

        public final Force fromJouleMeters(double v) {
            return store(this, v, ForceUnits.JM);
        }

        public final Force fromKilogramForces(double v) {
            return store(this, v, ForceUnits.KGF);
        }

        public final Force fromKilonewtons(double v) {
            return store(this, v, ForceUnits.KN);
        }

        public final Force fromKiloponds(double v) {
            return store(this, v, ForceUnits.KP);
        }

        public final Force fromKilopoundForces(double v) {
            return store(this, v, ForceUnits.KIP);
        }

        public final Force fromLongTonForces(double v) {
            return store(this, v, ForceUnits.LTF);
        }

        public final Force fromMeganewtons(double v) {
            return store(this, v, ForceUnits.MN);
        }

        public final Force fromMetricTonForces(double v) {
            return store(this, v, ForceUnits.TFM);
        }

        public final Force fromMicronewtons(double v) {
            return store(this, v, ForceUnits.MUN);
        }

        public final Force fromMilligraveForces(double v) {
            return store(this, v, ForceUnits.MGF);
        }

        public final Force fromMillinewtons(double v) {
            return store(this, v, ForceUnits.MILN);
        }

        public final Force fromNanonewtons(double v) {
            return store(this, v, ForceUnits.NN);
        }

        public final Force fromNewtons(double v) {
            return store(this, v, ForceUnits.N);
        }

        public final Force fromOunceForces(double v) {
            return store(this, v, ForceUnits.OZF);
        }

        public final Force fromPetanewtons(double v) {
            return store(this, v, ForceUnits.PEN);
        }

        public final Force fromPiconewtons(double v) {
            return store(this, v, ForceUnits.PN);
        }

        public final Force fromPonds(double v) {
            return store(this, v, ForceUnits.P);
        }

        public final Force fromPoundFeetPerSecondSquared(double v) {
            return store(this, v, ForceUnits.LBFT);
        }

        public final Force fromPoundForces(double v) {
            return store(this, v, ForceUnits.LBF);
        }

        public final Force fromPoundals(double v) {
            return store(this, v, ForceUnits.PDL);
        }

        public final Force fromShortTonForces(double v) {
            return store(this, v, ForceUnits.TFS);
        }

        public final Force fromSthenes(double v) {
            return store(this, v, ForceUnits.SN);
        }

        public final Force fromTeranewtons(double v) {
            return store(this, v, ForceUnits.TN);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toPoundForces(); //Variable "bar" being of type UnitOf.Force with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Force().fromNewtons(1.25).toPoundForces(); //One line conversion from 1.25 Newtons to PoundForces
        */
        public final double toAtomicUnitsOfForce() {
            return c(ForceUnits.AUF);
        }

        public final double toAttonewtons() {
            return c(ForceUnits.AN);
        }

        public final double toCentinewtons() {
            return c(ForceUnits.CN);
        }

        public final double toDecinewtons() {
            return c(ForceUnits.DN);
        }

        public final double toDekanewtons() {
            return c(ForceUnits.DAN);
        }

        public final double toDynes() {
            return c(ForceUnits.DYN);
        }

        public final double toExanewtons() {
            return c(ForceUnits.EN);
        }

        public final double toFemtonewtons() {
            return c(ForceUnits.FN);
        }

        public final double toGiganewtons() {
            return c(ForceUnits.GN);
        }

        public final double toGramForces() {
            return c(ForceUnits.GF);
        }

        public final double toGraveForces() {
            return c(ForceUnits.GFF);
        }

        public final double toHectonewtons() {
            return c(ForceUnits.HN);
        }

        public final double toJouleCentimeters() {
            return c(ForceUnits.JCM);
        }

        public final double toJouleMeters() {
            return c(ForceUnits.JM);
        }

        public final double toKilogramForces() {
            return c(ForceUnits.KGF);
        }

        public final double toKilonewtons() {
            return c(ForceUnits.KN);
        }

        public final double toKiloponds() {
            return c(ForceUnits.KP);
        }

        public final double toKilopoundForces() {
            return c(ForceUnits.KIP);
        }

        public final double toLongTonForces() {
            return c(ForceUnits.LTF);
        }

        public final double toMeganewtons() {
            return c(ForceUnits.MN);
        }

        public final double toMetricTonForces() {
            return c(ForceUnits.TFM);
        }

        public final double toMicronewtons() {
            return c(ForceUnits.MUN);
        }

        public final double toMilligraveForces() {
            return c(ForceUnits.MGF);
        }

        public final double toMillinewtons() {
            return c(ForceUnits.MILN);
        }

        public final double toNanonewtons() {
            return c(ForceUnits.NN);
        }

        public final double toNewtons() {
            return c(ForceUnits.N);
        }

        public final double toOunceForces() {
            return c(ForceUnits.OZF);
        }

        public final double toPetanewtons() {
            return c(ForceUnits.PEN);
        }

        public final double toPiconewtons() {
            return c(ForceUnits.PN);
        }

        public final double toPonds() {
            return c(ForceUnits.P);
        }

        public final double toPoundFeetPerSecondSquared() {
            return c(ForceUnits.LBFT);
        }

        public final double toPoundForces() {
            return c(ForceUnits.LBF);
        }

        public final double toPoundals() {
            return c(ForceUnits.PDL);
        }

        public final double toShortTonForces() {
            return c(ForceUnits.TFS);
        }

        public final double toSthenes() {
            return c(ForceUnits.SN);
        }

        public final double toTeranewtons() {
            return c(ForceUnits.TN);
        }
    }

    /**
     * UnitOf.Frequency()
     *
     * Ex: double foo = new UnitOf.Frequency().fromHertz(1.25).toCyclesPerSecond(); //One line conversion from 1.25 Hertz to CyclesPerSecond
     */
    public static class Frequency extends BaseMeasurementUnit<FrequencyUnits> implements Serializable {

        /*
        Method to perform all conversions within Frequency class.
        All "to" methods within Frequency use this method.
        */
        private final double c(FrequencyUnits t) {
            return doConvert(t.TO_MHZ, conversionHelper.type.TO_MHZ);
        }

        /*
        "from" Methods

        Ex: UnitOf.Frequency foo = new UnitOf.Frequency().fromHertz(1.25); //Variable "foo" will be able to convert 1.25 Hertz into any unit of Frequency
        */
        public final Frequency fromAttohertz(double v) {
            return store(this, v, FrequencyUnits.AHZ);
        }

        public final Frequency fromCentihertz(double v) {
            return store(this, v, FrequencyUnits.CHZ);
        }

        public final Frequency fromCyclesPerSecond(double v) {
            return store(this, v, FrequencyUnits.CS);
        }

        public final Frequency fromDecihertz(double v) {
            return store(this, v, FrequencyUnits.DHZ);
        }

        public final Frequency fromDekahertz(double v) {
            return store(this, v, FrequencyUnits.DAHZ);
        }

        public final Frequency fromExahertz(double v) {
            return store(this, v, FrequencyUnits.EHZ);
        }

        public final Frequency fromFemtohertz(double v) {
            return store(this, v, FrequencyUnits.FHZ);
        }

        public final Frequency fromGigahertz(double v) {
            return store(this, v, FrequencyUnits.GHZ);
        }

        public final Frequency fromHectohertz(double v) {
            return store(this, v, FrequencyUnits.HHZ);
        }

        public final Frequency fromHertz(double v) {
            return store(this, v, FrequencyUnits.HZ);
        }

        public final Frequency fromKilohertz(double v) {
            return store(this, v, FrequencyUnits.KHZ);
        }

        public final Frequency fromMegahertz(double v) {
            return store(this, v, FrequencyUnits.MHZ);
        }

        public final Frequency fromMicrohertz(double v) {
            return store(this, v, FrequencyUnits.MUHZ);
        }

        public final Frequency fromMillihertz(double v) {
            return store(this, v, FrequencyUnits.MIHZ);
        }

        public final Frequency fromNanohertz(double v) {
            return store(this, v, FrequencyUnits.NHZ);
        }

        public final Frequency fromPetahertz(double v) {
            return store(this, v, FrequencyUnits.PEHZ);
        }

        public final Frequency fromPicohertz(double v) {
            return store(this, v, FrequencyUnits.PHZ);
        }

        public final Frequency fromRevolutionsPerDay(double v) {
            return store(this, v, FrequencyUnits.RD);
        }

        public final Frequency fromRevolutionsPerHour(double v) {
            return store(this, v, FrequencyUnits.RH);
        }

        public final Frequency fromRevolutionsPerMinute(double v) {
            return store(this, v, FrequencyUnits.RM);
        }

        public final Frequency fromRevolutionsPerSecond(double v) {
            return store(this, v, FrequencyUnits.RS);
        }

        public final Frequency fromTerahertz(double v) {
            return store(this, v, FrequencyUnits.THZ);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toCyclesPerSecond(); //Variable "bar" being of type UnitOf.Frequency with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Frequency().fromHertz(1.25).toCyclesPerSecond(); //One line conversion from 1.25 Hertz to CyclesPerSecond
        */
        public final double toAttohertz() {
            return c(FrequencyUnits.AHZ);
        }

        public final double toCentihertz() {
            return c(FrequencyUnits.CHZ);
        }

        public final double toCyclesPerSecond() {
            return c(FrequencyUnits.CS);
        }

        public final double toDecihertz() {
            return c(FrequencyUnits.DHZ);
        }

        public final double toDekahertz() {
            return c(FrequencyUnits.DAHZ);
        }

        public final double toExahertz() {
            return c(FrequencyUnits.EHZ);
        }

        public final double toFemtohertz() {
            return c(FrequencyUnits.FHZ);
        }

        public final double toGigahertz() {
            return c(FrequencyUnits.GHZ);
        }

        public final double toHectohertz() {
            return c(FrequencyUnits.HHZ);
        }

        public final double toHertz() {
            return c(FrequencyUnits.HZ);
        }

        public final double toKilohertz() {
            return c(FrequencyUnits.KHZ);
        }

        public final double toMegahertz() {
            return c(FrequencyUnits.MHZ);
        }

        public final double toMicrohertz() {
            return c(FrequencyUnits.MUHZ);
        }

        public final double toMillihertz() {
            return c(FrequencyUnits.MIHZ);
        }

        public final double toNanohertz() {
            return c(FrequencyUnits.NHZ);
        }

        public final double toPetahertz() {
            return c(FrequencyUnits.PEHZ);
        }

        public final double toPicohertz() {
            return c(FrequencyUnits.PHZ);
        }

        public final double toRevolutionsPerDay() {
            return c(FrequencyUnits.RD);
        }

        public final double toRevolutionsPerHour() {
            return c(FrequencyUnits.RH);
        }

        public final double toRevolutionsPerMinute() {
            return c(FrequencyUnits.RM);
        }

        public final double toRevolutionsPerSecond() {
            return c(FrequencyUnits.RS);
        }

        public final double toTerahertz() {
            return c(FrequencyUnits.THZ);
        }
    }

    /**
     * UnitOf.FuelEconomy()
     *
     * Ex: double foo = new UnitOf.FuelEconomy().fromMetersPerCubicMeter(1.25).toMetersPerLiter(); //One line conversion from 1.25 MetersPerCubicMeter to MetersPerLiter
     */
    public static class FuelEconomy extends BaseMeasurementUnit<FuelEconomyUnits> implements Serializable {

        /*
        Method to perform all conversions within FuelEconomy class.
        All "to" methods within FuelEconomy use this method.
        */
        private final double c(FuelEconomyUnits t) {
            return doConvert(t.TO_KML, conversionHelper.type.TO_KML);
        }

        /*
        "from" Methods

        Ex: UnitOf.FuelEconomy foo = new UnitOf.FuelEconomy().fromMetersPerCubicMeter(1.25); //Variable "foo" will be able to convert 1.25 MetersPerCubicMeter into any unit of FuelEconomy
        */
        public final FuelEconomy fromCentimetersPerLiter(double v) {
            return store(this, v, FuelEconomyUnits.CML);
        }

        public final FuelEconomy fromDekametersPerLiter(double v) {
            return store(this, v, FuelEconomyUnits.DAML);
        }

        public final FuelEconomy fromExametersPerLiter(double v) {
            return store(this, v, FuelEconomyUnits.EML);
        }

        public final FuelEconomy fromGigametersPerLiter(double v) {
            return store(this, v, FuelEconomyUnits.GML);
        }

        public final FuelEconomy fromHectometersPerLiter(double v) {
            return store(this, v, FuelEconomyUnits.HML);
        }

        public final FuelEconomy fromKilometersPerGallonUK(double v) {
            return store(this, v, FuelEconomyUnits.KMGALUK);
        }

        public final FuelEconomy fromKilometersPerGallonUS(double v) {
            return store(this, v, FuelEconomyUnits.KMGALUS);
        }

        public final FuelEconomy fromKilometersPerLiter(double v) {
            return store(this, v, FuelEconomyUnits.KML);
        }

        public final FuelEconomy fromMegametersPerLiter(double v) {
            return store(this, v, FuelEconomyUnits.MML);
        }

        public final FuelEconomy fromMetersPerCubicCentimeter(double v) {
            return store(this, v, FuelEconomyUnits.MCM);
        }

        public final FuelEconomy fromMetersPerCubicFoot(double v) {
            return store(this, v, FuelEconomyUnits.MFT);
        }

        public final FuelEconomy fromMetersPerCubicInch(double v) {
            return store(this, v, FuelEconomyUnits.MIN);
        }

        public final FuelEconomy fromMetersPerCubicMeter(double v) {
            return store(this, v, FuelEconomyUnits.MM);
        }

        public final FuelEconomy fromMetersPerCubicYard(double v) {
            return store(this, v, FuelEconomyUnits.MYD);
        }

        public final FuelEconomy fromMetersPerCupUK(double v) {
            return store(this, v, FuelEconomyUnits.MCUPUK);
        }

        public final FuelEconomy fromMetersPerCupUS(double v) {
            return store(this, v, FuelEconomyUnits.MCUPUS);
        }

        public final FuelEconomy fromMetersPerFluidOunceUK(double v) {
            return store(this, v, FuelEconomyUnits.MFOZUK);
        }

        public final FuelEconomy fromMetersPerFluidOunceUS(double v) {
            return store(this, v, FuelEconomyUnits.MFOZUS);
        }

        public final FuelEconomy fromMetersPerGallonUK(double v) {
            return store(this, v, FuelEconomyUnits.MGALUK);
        }

        public final FuelEconomy fromMetersPerGallonUS(double v) {
            return store(this, v, FuelEconomyUnits.MGALUS);
        }

        public final FuelEconomy fromMetersPerLiter(double v) {
            return store(this, v, FuelEconomyUnits.ML);
        }

        public final FuelEconomy fromMetersPerPintUK(double v) {
            return store(this, v, FuelEconomyUnits.MPTUK);
        }

        public final FuelEconomy fromMetersPerPintUS(double v) {
            return store(this, v, FuelEconomyUnits.MPTUS);
        }

        public final FuelEconomy fromMetersPerQuartUK(double v) {
            return store(this, v, FuelEconomyUnits.MQTUK);
        }

        public final FuelEconomy fromMetersPerQuartUS(double v) {
            return store(this, v, FuelEconomyUnits.MQTUS);
        }

        public final FuelEconomy fromMilesPerGallonUK(double v) {
            return store(this, v, FuelEconomyUnits.MIGALUK);
        }

        public final FuelEconomy fromMilesPerGallonUS(double v) {
            return store(this, v, FuelEconomyUnits.MIGALUS);
        }

        public final FuelEconomy fromMilesPerLiterUS(double v) {
            return store(this, v, FuelEconomyUnits.MIL);
        }

        public final FuelEconomy fromNauticalMilesPerGallonUS(double v) {
            return store(this, v, FuelEconomyUnits.NMIGAL);
        }

        public final FuelEconomy fromNauticalMilesPerLiter(double v) {
            return store(this, v, FuelEconomyUnits.NMIL);
        }

        public final FuelEconomy fromPetametersPerLiter(double v) {
            return store(this, v, FuelEconomyUnits.PML);
        }

        public final FuelEconomy fromTerametersPerLiter(double v) {
            return store(this, v, FuelEconomyUnits.TML);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toMetersPerLiter(); //Variable "bar" being of type UnitOf.FuelEconomy with "from" value already assigned
        Ex 2: double foobar = new UnitOf.FuelEconomy().fromMetersPerCubicMeter(1.25).toMetersPerLiter(); //One line conversion from 1.25 MetersPerCubicMeter to MetersPerLiter
        */
        public final double toCentimetersPerLiter() {
            return c(FuelEconomyUnits.CML);
        }

        public final double toDekametersPerLiter() {
            return c(FuelEconomyUnits.DAML);
        }

        public final double toExametersPerLiter() {
            return c(FuelEconomyUnits.EML);
        }

        public final double toGigametersPerLiter() {
            return c(FuelEconomyUnits.GML);
        }

        public final double toHectometersPerLiter() {
            return c(FuelEconomyUnits.HML);
        }

        public final double toKilometersPerGallonUK() {
            return c(FuelEconomyUnits.KMGALUK);
        }

        public final double toKilometersPerGallonUS() {
            return c(FuelEconomyUnits.KMGALUS);
        }

        public final double toKilometersPerLiter() {
            return c(FuelEconomyUnits.KML);
        }

        public final double toMegametersPerLiter() {
            return c(FuelEconomyUnits.MML);
        }

        public final double toMetersPerCubicCentimeter() {
            return c(FuelEconomyUnits.MCM);
        }

        public final double toMetersPerCubicFoot() {
            return c(FuelEconomyUnits.MFT);
        }

        public final double toMetersPerCubicInch() {
            return c(FuelEconomyUnits.MIN);
        }

        public final double toMetersPerCubicMeter() {
            return c(FuelEconomyUnits.MM);
        }

        public final double toMetersPerCubicYard() {
            return c(FuelEconomyUnits.MYD);
        }

        public final double toMetersPerCupUK() {
            return c(FuelEconomyUnits.MCUPUK);
        }

        public final double toMetersPerCupUS() {
            return c(FuelEconomyUnits.MCUPUS);
        }

        public final double toMetersPerFluidOunceUK() {
            return c(FuelEconomyUnits.MFOZUK);
        }

        public final double toMetersPerFluidOunceUS() {
            return c(FuelEconomyUnits.MFOZUS);
        }

        public final double toMetersPerGallonUK() {
            return c(FuelEconomyUnits.MGALUK);
        }

        public final double toMetersPerGallonUS() {
            return c(FuelEconomyUnits.MGALUS);
        }

        public final double toMetersPerLiter() {
            return c(FuelEconomyUnits.ML);
        }

        public final double toMetersPerPintUK() {
            return c(FuelEconomyUnits.MPTUK);
        }

        public final double toMetersPerPintUS() {
            return c(FuelEconomyUnits.MPTUS);
        }

        public final double toMetersPerQuartUK() {
            return c(FuelEconomyUnits.MQTUK);
        }

        public final double toMetersPerQuartUS() {
            return c(FuelEconomyUnits.MQTUS);
        }

        public final double toMilesPerGallonUK() {
            return c(FuelEconomyUnits.MIGALUK);
        }

        public final double toMilesPerGallonUS() {
            return c(FuelEconomyUnits.MIGALUS);
        }

        public final double toMilesPerLiterUS() {
            return c(FuelEconomyUnits.MIL);
        }

        public final double toNauticalMilesPerGallonUS() {
            return c(FuelEconomyUnits.NMIGAL);
        }

        public final double toNauticalMilesPerLiter() {
            return c(FuelEconomyUnits.NMIL);
        }

        public final double toPetametersPerLiter() {
            return c(FuelEconomyUnits.PML);
        }

        public final double toTerametersPerLiter() {
            return c(FuelEconomyUnits.TML);
        }
    }

    /**
     * UnitOf.Length()
     *
     * Ex: double foo = new UnitOf.Length().fromMeters(1.25).toFeet(); //One line conversion from 1.25 Meters to Feet
     */
    public static class Length extends BaseMeasurementUnit<LengthUnits> implements Serializable {

        /*
        Method to perform all conversions within Length class.
        All "to" methods within Length use this method.
        */
        private final double c(LengthUnits t) {
            return doConvert(t.TO_M, conversionHelper.type.TO_M);
        }

        /*
        "from" Methods

        Ex: UnitOf.Length foo = new UnitOf.Length().fromMeters(1.25); //Variable "foo" will be able to convert 1.25 Meters into any unit of Length
        */
        public final Length fromAngstroms(double v) {
            return store(this, v, LengthUnits.A);
        }

        public final Length fromAttometers(double v) {
            return store(this, v, LengthUnits.AM);
        }

        public final Length fromBarleycorns(double v) {
            return store(this, v, LengthUnits.BC);
        }

        public final Length fromCablesImperial(double v) {
            return store(this, v, LengthUnits.CBLIMP);
        }

        public final Length fromCablesInternational(double v) {
            return store(this, v, LengthUnits.CBLIN);
        }

        public final Length fromCablesUSCustomary(double v) {
            return store(this, v, LengthUnits.CBLUS);
        }

        public final Length fromCaliber(double v) {
            return store(this, v, LengthUnits.CL);
        }

        public final Length fromCentiinches(double v) {
            return store(this, v, LengthUnits.CIN);
        }

        public final Length fromCentimeters(double v) {
            return store(this, v, LengthUnits.CM);
        }

        public final Length fromChains(double v) {
            return store(this, v, LengthUnits.CH);
        }

        public final Length fromCubits(double v) {
            return store(this, v, LengthUnits.CU);
        }

        public final Length fromDecimeters(double v) {
            return store(this, v, LengthUnits.DM);
        }

        public final Length fromDekameters(double v) {
            return store(this, v, LengthUnits.DAM);
        }

        public final Length fromElls(double v) {
            return store(this, v, LengthUnits.ELL);
        }

        public final Length fromExameters(double v) {
            return store(this, v, LengthUnits.EM);
        }

        public final Length fromFathoms(double v) {
            return store(this, v, LengthUnits.FTM);
        }

        public final Length fromFeet(double v) {
            return store(this, v, LengthUnits.FT);
        }

        public final Length fromFemtometers(double v) {
            return store(this, v, LengthUnits.FM);
        }

        public final Length fromFingers(double v) {
            return store(this, v, LengthUnits.FING);
        }

        public final Length fromFurlongs(double v) {
            return store(this, v, LengthUnits.FUR);
        }

        public final Length fromGigameters(double v) {
            return store(this, v, LengthUnits.GM);
        }

        public final Length fromHands(double v) {
            return store(this, v, LengthUnits.HAND);
        }

        public final Length fromHectometers(double v) {
            return store(this, v, LengthUnits.HM);
        }

        public final Length fromInches(double v) {
            return store(this, v, LengthUnits.IN);
        }

        public final Length fromKilometers(double v) {
            return store(this, v, LengthUnits.KM);
        }

        public final Length fromKiloyards(double v) {
            return store(this, v, LengthUnits.KYD);
        }

        public final Length fromLeagues(double v) {
            return store(this, v, LengthUnits.LEA);
        }

        public final Length fromLightYears(double v) {
            return store(this, v, LengthUnits.LY);
        }

        public final Length fromLinks(double v) {
            return store(this, v, LengthUnits.LNK);
        }

        public final Length fromMegameters(double v) {
            return store(this, v, LengthUnits.MM);
        }

        public final Length fromMeters(double v) {
            return store(this, v, LengthUnits.M);
        }

        public final Length fromMicroinches(double v) {
            return store(this, v, LengthUnits.MUIN);
        }

        public final Length fromMicrometers(double v) {
            return store(this, v, LengthUnits.MUM);
        }

        public final Length fromMicrons(double v) {
            return store(this, v, LengthUnits.MURM);
        }

        public final Length fromMiles(double v) {
            return store(this, v, LengthUnits.MI);
        }

        public final Length fromMillimeters(double v) {
            return store(this, v, LengthUnits.MILM);
        }

        public final Length fromNails(double v) {
            return store(this, v, LengthUnits.NAIL);
        }

        public final Length fromNanometers(double v) {
            return store(this, v, LengthUnits.NM);
        }

        public final Length fromNauticalLeaguesInternational(double v) {
            return store(this, v, LengthUnits.NLEAIN);
        }

        public final Length fromNauticalLeaguesUK(double v) {
            return store(this, v, LengthUnits.NLEAUK);
        }

        public final Length fromNauticalMilesInternational(double v) {
            return store(this, v, LengthUnits.NMIINT);
        }

        public final Length fromNauticalMilesUK(double v) {
            return store(this, v, LengthUnits.NMIUK);
        }

        public final Length fromNauticalMilesUSCustomary(double v) {
            return store(this, v, LengthUnits.NMIUS);
        }

        public final Length fromPerches(double v) {
            return store(this, v, LengthUnits.PER);
        }

        public final Length fromPetameters(double v) {
            return store(this, v, LengthUnits.PEM);
        }

        public final Length fromPicometers(double v) {
            return store(this, v, LengthUnits.PM);
        }

        public final Length fromPoles(double v) {
            return store(this, v, LengthUnits.POL);
        }

        public final Length fromRods(double v) {
            return store(this, v, LengthUnits.RD);
        }

        public final Length fromRopes(double v) {
            return store(this, v, LengthUnits.ROPE);
        }

        public final Length fromSpans(double v) {
            return store(this, v, LengthUnits.SPAN);
        }

        public final Length fromTerameters(double v) {
            return store(this, v, LengthUnits.TM);
        }

        public final Length fromThousandthInches(double v) {
            return store(this, v, LengthUnits.TIN);
        }

        public final Length fromYards(double v) {
            return store(this, v, LengthUnits.YD);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toFeet(); //Variable "bar" being of type UnitOf.Length with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Length().fromMeters(1.25).toFeet(); //One line conversion from 1.25 Meters to Feet
        */
        public final double toAngstroms() {
            return c(LengthUnits.A);
        }

        public final double toAttometers() {
            return c(LengthUnits.AM);
        }

        public final double toBarleycorns() {
            return c(LengthUnits.BC);
        }

        public final double toCablesImperial() {
            return c(LengthUnits.CBLIMP);
        }

        public final double toCablesInternational() {
            return c(LengthUnits.CBLIN);
        }

        public final double toCablesUSCustomary() {
            return c(LengthUnits.CBLUS);
        }

        public final double toCaliber() {
            return c(LengthUnits.CL);
        }

        public final double toCentiinches() {
            return c(LengthUnits.CIN);
        }

        public final double toCentimeters() {
            return c(LengthUnits.CM);
        }

        public final double toChains() {
            return c(LengthUnits.CH);
        }

        public final double toCubits() {
            return c(LengthUnits.CU);
        }

        public final double toDecimeters() {
            return c(LengthUnits.DM);
        }

        public final double toDekameters() {
            return c(LengthUnits.DAM);
        }

        public final double toElls() {
            return c(LengthUnits.ELL);
        }

        public final double toExameters() {
            return c(LengthUnits.EM);
        }

        public final double toFathoms() {
            return c(LengthUnits.FTM);
        }

        public final double toFeet() {
            return c(LengthUnits.FT);
        }

        public final double toFemtometers() {
            return c(LengthUnits.FM);
        }

        public final double toFingers() {
            return c(LengthUnits.FING);
        }

        public final double toFurlongs() {
            return c(LengthUnits.FUR);
        }

        public final double toGigameters() {
            return c(LengthUnits.GM);
        }

        public final double toHands() {
            return c(LengthUnits.HAND);
        }

        public final double toHectometers() {
            return c(LengthUnits.HM);
        }

        public final double toInches() {
            return c(LengthUnits.IN);
        }

        public final double toKilometers() {
            return c(LengthUnits.KM);
        }

        public final double toKiloyards() {
            return c(LengthUnits.KYD);
        }

        public final double toLeagues() {
            return c(LengthUnits.LEA);
        }

        public final double toLightYears() {
            return c(LengthUnits.LY);
        }

        public final double toLinks() {
            return c(LengthUnits.LNK);
        }

        public final double toMegameters() {
            return c(LengthUnits.MM);
        }

        public final double toMeters() {
            return c(LengthUnits.M);
        }

        public final double toMicroinches() {
            return c(LengthUnits.MUIN);
        }

        public final double toMicrometers() {
            return c(LengthUnits.MUM);
        }

        public final double toMicrons() {
            return c(LengthUnits.MURM);
        }

        public final double toMiles() {
            return c(LengthUnits.MI);
        }

        public final double toMillimeters() {
            return c(LengthUnits.MILM);
        }

        public final double toNails() {
            return c(LengthUnits.NAIL);
        }

        public final double toNanometers() {
            return c(LengthUnits.NM);
        }

        public final double toNauticalLeaguesInternational() {
            return c(LengthUnits.NLEAIN);
        }

        public final double toNauticalLeaguesUK() {
            return c(LengthUnits.NLEAUK);
        }

        public final double toNauticalMilesInternational() {
            return c(LengthUnits.NMIINT);
        }

        public final double toNauticalMilesUK() {
            return c(LengthUnits.NMIUK);
        }

        public final double toNauticalMilesUSCustomary() {
            return c(LengthUnits.NMIUS);
        }

        public final double toPerches() {
            return c(LengthUnits.PER);
        }

        public final double toPetameters() {
            return c(LengthUnits.PEM);
        }

        public final double toPicometers() {
            return c(LengthUnits.PM);
        }

        public final double toPoles() {
            return c(LengthUnits.POL);
        }

        public final double toRods() {
            return c(LengthUnits.RD);
        }

        public final double toRopes() {
            return c(LengthUnits.ROPE);
        }

        public final double toSpans() {
            return c(LengthUnits.SPAN);
        }

        public final double toTerameters() {
            return c(LengthUnits.TM);
        }

        public final double toThousandthInches() {
            return c(LengthUnits.TIN);
        }

        public final double toYards() {
            return c(LengthUnits.YD);
        }
    }

    /**
     * UnitOf.Mass()
     *
     * Ex: double foo = new UnitOf.Mass().fromGrams(1.25).toPounds(); //One line conversion from 1.25 Grams to Pounds
     */
    public static class Mass extends BaseMeasurementUnit<MassUnits> implements Serializable {

        /*
        Method to perform all conversions within Mass class.
        All "to" methods within Mass use this method.
        */
        private final double c(MassUnits t) {
            return doConvert(t.TO_G, conversionHelper.type.TO_G);
        }

        /*
        "from" Methods

        Ex: UnitOf.Mass foo = new UnitOf.Mass().fromGrams(1.25); //Variable "foo" will be able to convert 1.25 Grams into any unit of Mass
        */
        public final Mass fromAttograms(double v) {
            return store(this, v, MassUnits.AG);
        }

        public final Mass fromCarats(double v) {
            return store(this, v, MassUnits.CT);
        }

        public final Mass fromCentigrams(double v) {
            return store(this, v, MassUnits.CG);
        }

        public final Mass fromCentners(double v) {
            return store(this, v, MassUnits.CWT);
        }

        public final Mass fromDecigrams(double v) {
            return store(this, v, MassUnits.DG);
        }

        public final Mass fromDekagrams(double v) {
            return store(this, v, MassUnits.DAG);
        }

        public final Mass fromExagrams(double v) {
            return store(this, v, MassUnits.EG);
        }

        public final Mass fromFemtograms(double v) {
            return store(this, v, MassUnits.FG);
        }

        public final Mass fromGamma(double v) {
            return store(this, v, MassUnits.GAMM);
        }

        public final Mass fromGigagrams(double v) {
            return store(this, v, MassUnits.GG);
        }

        public final Mass fromGrams(double v) {
            return store(this, v, MassUnits.G);
        }

        public final Mass fromHectograms(double v) {
            return store(this, v, MassUnits.HG);
        }

        public final Mass fromKilograms(double v) {
            return store(this, v, MassUnits.KG);
        }

        public final Mass fromKilopounds(double v) {
            return store(this, v, MassUnits.KIP);
        }

        public final Mass fromKilotonsMetric(double v) {
            return store(this, v, MassUnits.TK);
        }

        public final Mass fromMegagrams(double v) {
            return store(this, v, MassUnits.MG);
        }

        public final Mass fromMicrograms(double v) {
            return store(this, v, MassUnits.MUG);
        }

        public final Mass fromMilligrams(double v) {
            return store(this, v, MassUnits.MILG);
        }

        public final Mass fromNanograms(double v) {
            return store(this, v, MassUnits.NG);
        }

        public final Mass fromOuncesMetric(double v) {
            return store(this, v, MassUnits.MOZ);
        }

        public final Mass fromOuncesUS(double v) {
            return store(this, v, MassUnits.USOZ);
        }

        public final Mass fromPetagrams(double v) {
            return store(this, v, MassUnits.PEG);
        }

        public final Mass fromPicograms(double v) {
            return store(this, v, MassUnits.PG);
        }

        public final Mass fromPounds(double v) {
            return store(this, v, MassUnits.LB);
        }

        public final Mass fromQuintals(double v) {
            return store(this, v, MassUnits.QU);
        }

        public final Mass fromSlugs(double v) {
            return store(this, v, MassUnits.SLUG);
        }

        public final Mass fromStonesUK(double v) {
            return store(this, v, MassUnits.STUK);
        }

        public final Mass fromStonesUS(double v) {
            return store(this, v, MassUnits.STUS);
        }

        public final Mass fromTeragrams(double v) {
            return store(this, v, MassUnits.TG);
        }

        public final Mass fromTonsImperial(double v) {
            return store(this, v, MassUnits.TI);
        }

        public final Mass fromTonsMetric(double v) {
            return store(this, v, MassUnits.TM);
        }

        public final Mass fromTonsUS(double v) {
            return store(this, v, MassUnits.TUS);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toPounds(); //Variable "bar" being of type UnitOf.Mass with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Mass().fromGrams(1.25).toPounds(); //One line conversion from 1.25 Grams to Pounds
        */
        public final double toAttograms() {
            return c(MassUnits.AG);
        }

        public final double toCarats() {
            return c(MassUnits.CT);
        }

        public final double toCentigrams() {
            return c(MassUnits.CG);
        }

        public final double toCentners() {
            return c(MassUnits.CWT);
        }

        public final double toDecigrams() {
            return c(MassUnits.DG);
        }

        public final double toDekagrams() {
            return c(MassUnits.DAG);
        }

        public final double toExagrams() {
            return c(MassUnits.EG);
        }

        public final double toFemtograms() {
            return c(MassUnits.FG);
        }

        public final double toGamma() {
            return c(MassUnits.GAMM);
        }

        public final double toGigagrams() {
            return c(MassUnits.GG);
        }

        public final double toGrams() {
            return c(MassUnits.G);
        }

        public final double toHectograms() {
            return c(MassUnits.HG);
        }

        public final double toKilograms() {
            return c(MassUnits.KG);
        }

        public final double toKilopounds() {
            return c(MassUnits.KIP);
        }

        public final double toKilotonsMetric() {
            return c(MassUnits.TK);
        }

        public final double toMegagrams() {
            return c(MassUnits.MG);
        }

        public final double toMicrograms() {
            return c(MassUnits.MUG);
        }

        public final double toMilligrams() {
            return c(MassUnits.MILG);
        }

        public final double toNanograms() {
            return c(MassUnits.NG);
        }

        public final double toOuncesMetric() {
            return c(MassUnits.MOZ);
        }

        public final double toOuncesUS() {
            return c(MassUnits.USOZ);
        }

        public final double toPetagrams() {
            return c(MassUnits.PEG);
        }

        public final double toPicograms() {
            return c(MassUnits.PG);
        }

        public final double toPounds() {
            return c(MassUnits.LB);
        }

        public final double toQuintals() {
            return c(MassUnits.QU);
        }

        public final double toSlugs() {
            return c(MassUnits.SLUG);
        }

        public final double toStonesUK() {
            return c(MassUnits.STUK);
        }

        public final double toStonesUS() {
            return c(MassUnits.STUS);
        }

        public final double toTeragrams() {
            return c(MassUnits.TG);
        }

        public final double toTonsImperial() {
            return c(MassUnits.TI);
        }

        public final double toTonsMetric() {
            return c(MassUnits.TM);
        }

        public final double toTonsUS() {
            return c(MassUnits.TUS);
        }
    }

    /**
     * UnitOf.MetricPrefix()
     *
     * Ex: double foo = new UnitOf.MetricPrefix().fromKilo(1.25).toGiga(); //One line conversion from 1.25 Kilo to Giga
     */
    public static class MetricPrefix extends BaseMeasurementUnit<MetricPrefixUnits> implements Serializable {

        /*
        Method to perform all conversions within MetricPrefix class.
        All "to" methods within MetricPrefix use this method.
        */
        private final double c(MetricPrefixUnits t) {
            return doConvert(t.TO_NN, conversionHelper.type.TO_NN, false);
        }

        /*
        "from" Methods

        Ex: UnitOf.MetricPrefix foo = new UnitOf.MetricPrefix().fromKilo(1.25); //Variable "foo" will be able to convert 1.25 Kilo into any unit of MetricPrefix
        */
        public final MetricPrefix fromAtto(double v) {
            return store(this, v, MetricPrefixUnits.A);
        }

        public final MetricPrefix fromCenti(double v) {
            return store(this, v, MetricPrefixUnits.C);
        }

        public final MetricPrefix fromDeci(double v) {
            return store(this, v, MetricPrefixUnits.D);
        }

        public final MetricPrefix fromDeka(double v) {
            return store(this, v, MetricPrefixUnits.DA);
        }

        public final MetricPrefix fromExa(double v) {
            return store(this, v, MetricPrefixUnits.E);
        }

        public final MetricPrefix fromFemto(double v) {
            return store(this, v, MetricPrefixUnits.F);
        }

        public final MetricPrefix fromGiga(double v) {
            return store(this, v, MetricPrefixUnits.G);
        }

        public final MetricPrefix fromHecto(double v) {
            return store(this, v, MetricPrefixUnits.H);
        }

        public final MetricPrefix fromKilo(double v) {
            return store(this, v, MetricPrefixUnits.K);
        }

        public final MetricPrefix fromMega(double v) {
            return store(this, v, MetricPrefixUnits.M);
        }

        public final MetricPrefix fromMicro(double v) {
            return store(this, v, MetricPrefixUnits.MU);
        }

        public final MetricPrefix fromMilli(double v) {
            return store(this, v, MetricPrefixUnits.MIL);
        }

        public final MetricPrefix fromNano(double v) {
            return store(this, v, MetricPrefixUnits.N);
        }

        public final MetricPrefix fromNoPrefix(double v) {
            return store(this, v, MetricPrefixUnits.NN);
        }

        public final MetricPrefix fromPeta(double v) {
            return store(this, v, MetricPrefixUnits.PE);
        }

        public final MetricPrefix fromPico(double v) {
            return store(this, v, MetricPrefixUnits.P);
        }

        public final MetricPrefix fromTera(double v) {
            return store(this, v, MetricPrefixUnits.T);
        }

        public final MetricPrefix fromYocto(double v) {
            return store(this, v, MetricPrefixUnits.YO);
        }

        public final MetricPrefix fromYotta(double v) {
            return store(this, v, MetricPrefixUnits.Y);
        }

        public final MetricPrefix fromZepto(double v) {
            return store(this, v, MetricPrefixUnits.ZO);
        }

        public final MetricPrefix fromZetta(double v) {
            return store(this, v, MetricPrefixUnits.Z);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toGiga(); //Variable "bar" being of type UnitOf.MetricPrefix with "from" value already assigned
        Ex 2: double foobar = new UnitOf.MetricPrefix().fromKilo(1.25).toGiga(); //One line conversion from 1.25 Kilo to Giga
        */
        public final double toAtto() {
            return c(MetricPrefixUnits.A);
        }

        public final double toCenti() {
            return c(MetricPrefixUnits.C);
        }

        public final double toDeci() {
            return c(MetricPrefixUnits.D);
        }

        public final double toDeka() {
            return c(MetricPrefixUnits.DA);
        }

        public final double toExa() {
            return c(MetricPrefixUnits.E);
        }

        public final double toFemto() {
            return c(MetricPrefixUnits.F);
        }

        public final double toGiga() {
            return c(MetricPrefixUnits.G);
        }

        public final double toHecto() {
            return c(MetricPrefixUnits.H);
        }

        public final double toKilo() {
            return c(MetricPrefixUnits.K);
        }

        public final double toMega() {
            return c(MetricPrefixUnits.M);
        }

        public final double toMicro() {
            return c(MetricPrefixUnits.MU);
        }

        public final double toMilli() {
            return c(MetricPrefixUnits.MIL);
        }

        public final double toNano() {
            return c(MetricPrefixUnits.N);
        }

        public final double toNoPrefix() {
            return c(MetricPrefixUnits.NN);
        }

        public final double toPeta() {
            return c(MetricPrefixUnits.PE);
        }

        public final double toPico() {
            return c(MetricPrefixUnits.P);
        }

        public final double toTera() {
            return c(MetricPrefixUnits.T);
        }

        public final double toYocto() {
            return c(MetricPrefixUnits.YO);
        }

        public final double toYotta() {
            return c(MetricPrefixUnits.Y);
        }

        public final double toZepto() {
            return c(MetricPrefixUnits.ZO);
        }

        public final double toZetta() {
            return c(MetricPrefixUnits.Z);
        }
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
    public static class NumericBase extends NumericBaseConversions implements Serializable {

        /*
        "from" Methods

        Ex: UnitOf.NumericBase foo = new UnitOf.NumericBase().fromHexadecimal("ADa3"); //Variable "foo" will be able to convert "ADa3" Hex into any unit of NumericBase
        */
        public final NumericBase fromBase11(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B11);
        }

        public final NumericBase fromBase12(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B12);
        }

        public final NumericBase fromBase13(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B13);
        }

        public final NumericBase fromBase14(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B14);
        }

        public final NumericBase fromBase15(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B15);
        }

        public final NumericBase fromBase17(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B17);
        }

        public final NumericBase fromBase18(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B18);
        }

        public final NumericBase fromBase19(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B19);
        }

        public final NumericBase fromBase20(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B20);
        }

        public final NumericBase fromBase21(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B21);
        }

        public final NumericBase fromBase22(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B22);
        }

        public final NumericBase fromBase23(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B23);
        }

        public final NumericBase fromBase24(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B24);
        }

        public final NumericBase fromBase25(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B25);
        }

        public final NumericBase fromBase26(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B26);
        }

        public final NumericBase fromBase27(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B27);
        }

        public final NumericBase fromBase28(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B28);
        }

        public final NumericBase fromBase29(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B29);
        }

        public final NumericBase fromBase3(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B3);
        }

        public final NumericBase fromBase30(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B30);
        }

        public final NumericBase fromBase31(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B31);
        }

        public final NumericBase fromBase32(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B32);
        }

        public final NumericBase fromBase33(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B33);
        }

        public final NumericBase fromBase34(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B34);
        }

        public final NumericBase fromBase35(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B35);
        }

        public final NumericBase fromBase36(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B36);
        }

        public final NumericBase fromBase4(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B4);
        }

        public final NumericBase fromBase5(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B5);
        }

        public final NumericBase fromBase6(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B6);
        }

        public final NumericBase fromBase7(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B7);
        }

        public final NumericBase fromBase9(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B9);
        }

        public final NumericBase fromBinary(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B2);
        }

        public final NumericBase fromDecimal(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B10);
        }

        public final NumericBase fromHexadecimal(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B16);
        }

        public final NumericBase fromOctal(Object v) {
            return store(this, v, com.digidemic.unitof.NumericBase.B8);
        }
    }

    /**
     * UnitOf.Pressure()
     *
     * Ex: double foo = new UnitOf.Pressure().fromPascals(1.25).toKSI(); //One line conversion from 1.25 Pascals to KSI
     */
    public static class Pressure extends BaseMeasurementUnit<PressureUnits> implements Serializable {

        /*
        Method to perform all conversions within Pressure class.
        All "to" methods within Pressure use this method.
        */
        private final double c(PressureUnits pressureUnits) {
            return doConvert(pressureUnits.TO_PA, conversionHelper.type.TO_PA);
        }

        /*
        "from" Methods

        Ex: UnitOf.Pressure foo = new UnitOf.Pressure().fromPascals(1.25); //Variable "foo" will be able to convert 1.25 Pascals into any unit of Pressure
        */
        public final Pressure fromAttopascals(double v) {
            return store(this, v, PressureUnits.APA);
        }

        public final Pressure fromBars(double v) {
            return store(this, v, PressureUnits.BAR);
        }

        public final Pressure fromBaryes(double v) {
            return store(this, v, PressureUnits.BA);
        }

        public final Pressure fromCentimetersOfMercury0C(double v) {
            return store(this, v, PressureUnits.CMHG);
        }

        public final Pressure fromCentimetersOfWater4C(double v) {
            return store(this, v, PressureUnits.CMW4);
        }

        public final Pressure fromCentipascals(double v) {
            return store(this, v, PressureUnits.CPA);
        }

        public final Pressure fromDecibars(double v) {
            return store(this, v, PressureUnits.DBAR);
        }

        public final Pressure fromDecipascals(double v) {
            return store(this, v, PressureUnits.DPA);
        }

        public final Pressure fromDekapascals(double v) {
            return store(this, v, PressureUnits.DAPA);
        }

        public final Pressure fromDynesPerSquareCentimeter(double v) {
            return store(this, v, PressureUnits.DYNCM);
        }

        public final Pressure fromExapascals(double v) {
            return store(this, v, PressureUnits.EPA);
        }

        public final Pressure fromFeetOfSeaWater(double v) {
            return store(this, v, PressureUnits.FSW);
        }

        public final Pressure fromFeetOfWater4C(double v) {
            return store(this, v, PressureUnits.FTW4);
        }

        public final Pressure fromFeetOfWater60F(double v) {
            return store(this, v, PressureUnits.FTW60);
        }

        public final Pressure fromFemtopascals(double v) {
            return store(this, v, PressureUnits.FPA);
        }

        public final Pressure fromGigapascals(double v) {
            return store(this, v, PressureUnits.GPA);
        }

        public final Pressure fromGramsPerSquareCentimeter(double v) {
            return store(this, v, PressureUnits.GFCM);
        }

        public final Pressure fromHectopascals(double v) {
            return store(this, v, PressureUnits.HPA);
        }

        public final Pressure fromInchesOfMercury32F(double v) {
            return store(this, v, PressureUnits.INHG32);
        }

        public final Pressure fromInchesOfMercury60F(double v) {
            return store(this, v, PressureUnits.INHG60);
        }

        public final Pressure fromInchesOfWater4C(double v) {
            return store(this, v, PressureUnits.INW4);
        }

        public final Pressure fromInchesOfWater60F(double v) {
            return store(this, v, PressureUnits.INW60);
        }

        public final Pressure fromKSI(double v) {
            return store(this, v, PressureUnits.KSI);
        }

        public final Pressure fromKilogramsPerSquareCentimeter(double v) {
            return store(this, v, PressureUnits.KGFCM);
        }

        public final Pressure fromKilogramsPerSquareMeter(double v) {
            return store(this, v, PressureUnits.KGFM);
        }

        public final Pressure fromKilogramsPerSquareMillimeter(double v) {
            return store(this, v, PressureUnits.KFGMM);
        }

        public final Pressure fromKilonewtonsPerSquareMeter(double v) {
            return store(this, v, PressureUnits.KNM);
        }

        public final Pressure fromKilopascals(double v) {
            return store(this, v, PressureUnits.KPA);
        }

        public final Pressure fromKipsPerSquareInch(double v) {
            return store(this, v, PressureUnits.KIPFIN);
        }

        public final Pressure fromLongTonsPerSquareFoot(double v) {
            return store(this, v, PressureUnits.TFFTL);
        }

        public final Pressure fromLongTonsPerSquareInch(double v) {
            return store(this, v, PressureUnits.TFINL);
        }

        public final Pressure fromMegapascals(double v) {
            return store(this, v, PressureUnits.MPA);
        }

        public final Pressure fromMetersOfSeaWater(double v) {
            return store(this, v, PressureUnits.MSW);
        }

        public final Pressure fromMetersOfWater4C(double v) {
            return store(this, v, PressureUnits.MW4);
        }

        public final Pressure fromMicrobars(double v) {
            return store(this, v, PressureUnits.MUBAR);
        }

        public final Pressure fromMicropascals(double v) {
            return store(this, v, PressureUnits.MUPA);
        }

        public final Pressure fromMillibars(double v) {
            return store(this, v, PressureUnits.MILBAR);
        }

        public final Pressure fromMillimetersOfMercury0C(double v) {
            return store(this, v, PressureUnits.MMHG);
        }

        public final Pressure fromMillimetersOfWater4C(double v) {
            return store(this, v, PressureUnits.MMW4);
        }

        public final Pressure fromMillipascals(double v) {
            return store(this, v, PressureUnits.MILPA);
        }

        public final Pressure fromNanopascals(double v) {
            return store(this, v, PressureUnits.NPA);
        }

        public final Pressure fromNewtonsPerSquareCentimeter(double v) {
            return store(this, v, PressureUnits.NCM);
        }

        public final Pressure fromNewtonsPerSquareMeter(double v) {
            return store(this, v, PressureUnits.NM);
        }

        public final Pressure fromNewtonsPerSquareMillimeter(double v) {
            return store(this, v, PressureUnits.NMM);
        }

        public final Pressure fromPSI(double v) {
            return store(this, v, PressureUnits.PSI);
        }

        public final Pressure fromPascals(double v) {
            return store(this, v, PressureUnits.PA);
        }

        public final Pressure fromPetapascals(double v) {
            return store(this, v, PressureUnits.PEPA);
        }

        public final Pressure fromPicopascals(double v) {
            return store(this, v, PressureUnits.PPA);
        }

        public final Pressure fromPieze(double v) {
            return store(this, v, PressureUnits.PIZ);
        }

        public final Pressure fromPoundalsPerSquareFoot(double v) {
            return store(this, v, PressureUnits.PDLFT);
        }

        public final Pressure fromPoundsPerSquareFoot(double v) {
            return store(this, v, PressureUnits.LBFFT);
        }

        public final Pressure fromPoundsPerSquareInch(double v) {
            return store(this, v, PressureUnits.LBFIN);
        }

        public final Pressure fromShortTonsPerSquareFoot(double v) {
            return store(this, v, PressureUnits.TFFTS);
        }

        public final Pressure fromShortTonsPerSquareInch(double v) {
            return store(this, v, PressureUnits.TFINS);
        }

        public final Pressure fromStandardAtmospheres(double v) {
            return store(this, v, PressureUnits.ATM);
        }

        public final Pressure fromSthenesPerSquareMeter(double v) {
            return store(this, v, PressureUnits.SM);
        }

        public final Pressure fromTechnicalAtmospheres(double v) {
            return store(this, v, PressureUnits.AT);
        }

        public final Pressure fromTerapascals(double v) {
            return store(this, v, PressureUnits.TPA);
        }

        public final Pressure fromTorrs(double v) {
            return store(this, v, PressureUnits.TORR);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toKSI(); //Variable "bar" being of type UnitOf.Pressure with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Pressure().fromPascals(1.25).toKSI(); //One line conversion from 1.25 Pascals to KSI
        */
        public final double toAttopascals() {
            return c(PressureUnits.APA);
        }

        public final double toBars() {
            return c(PressureUnits.BAR);
        }

        public final double toBaryes() {
            return c(PressureUnits.BA);
        }

        public final double toCentimetersOfMercury0C() {
            return c(PressureUnits.CMHG);
        }

        public final double toCentimetersOfWater4C() {
            return c(PressureUnits.CMW4);
        }

        public final double toCentipascals() {
            return c(PressureUnits.CPA);
        }

        public final double toDecibars() {
            return c(PressureUnits.DBAR);
        }

        public final double toDecipascals() {
            return c(PressureUnits.DPA);
        }

        public final double toDekapascals() {
            return c(PressureUnits.DAPA);
        }

        public final double toDynesPerSquareCentimeter() {
            return c(PressureUnits.DYNCM);
        }

        public final double toExapascals() {
            return c(PressureUnits.EPA);
        }

        public final double toFeetOfSeaWater() {
            return c(PressureUnits.FSW);
        }

        public final double toFeetOfWater4C() {
            return c(PressureUnits.FTW4);
        }

        public final double toFeetOfWater60F() {
            return c(PressureUnits.FTW60);
        }

        public final double toFemtopascals() {
            return c(PressureUnits.FPA);
        }

        public final double toGigapascals() {
            return c(PressureUnits.GPA);
        }

        public final double toGramsPerSquareCentimeter() {
            return c(PressureUnits.GFCM);
        }

        public final double toHectopascals() {
            return c(PressureUnits.HPA);
        }

        public final double toInchesOfMercury32F() {
            return c(PressureUnits.INHG32);
        }

        public final double toInchesOfMercury60F() {
            return c(PressureUnits.INHG60);
        }

        public final double toInchesOfWater4C() {
            return c(PressureUnits.INW4);
        }

        public final double toInchesOfWater60F() {
            return c(PressureUnits.INW60);
        }

        public final double toKSI() {
            return c(PressureUnits.KSI);
        }

        public final double toKilogramsPerSquareCentimeter() {
            return c(PressureUnits.KGFCM);
        }

        public final double toKilogramsPerSquareMeter() {
            return c(PressureUnits.KGFM);
        }

        public final double toKilogramsPerSquareMillimeter() {
            return c(PressureUnits.KFGMM);
        }

        public final double toKilonewtonsPerSquareMeter() {
            return c(PressureUnits.KNM);
        }

        public final double toKilopascals() {
            return c(PressureUnits.KPA);
        }

        public final double toKipsPerSquareInch() {
            return c(PressureUnits.KIPFIN);
        }

        public final double toLongTonsPerSquareFoot() {
            return c(PressureUnits.TFFTL);
        }

        public final double toLongTonsPerSquareInch() {
            return c(PressureUnits.TFINL);
        }

        public final double toMegapascals() {
            return c(PressureUnits.MPA);
        }

        public final double toMetersOfSeaWater() {
            return c(PressureUnits.MSW);
        }

        public final double toMetersOfWater4C() {
            return c(PressureUnits.MW4);
        }

        public final double toMicrobars() {
            return c(PressureUnits.MUBAR);
        }

        public final double toMicropascals() {
            return c(PressureUnits.MUPA);
        }

        public final double toMillibars() {
            return c(PressureUnits.MILBAR);
        }

        public final double toMillimetersOfMercury0C() {
            return c(PressureUnits.MMHG);
        }

        public final double toMillimetersOfWater4C() {
            return c(PressureUnits.MMW4);
        }

        public final double toMillipascals() {
            return c(PressureUnits.MILPA);
        }

        public final double toNanopascals() {
            return c(PressureUnits.NPA);
        }

        public final double toNewtonsPerSquareCentimeter() {
            return c(PressureUnits.NCM);
        }

        public final double toNewtonsPerSquareMeter() {
            return c(PressureUnits.NM);
        }

        public final double toNewtonsPerSquareMillimeter() {
            return c(PressureUnits.NMM);
        }

        public final double toPSI() {
            return c(PressureUnits.PSI);
        }

        public final double toPascals() {
            return c(PressureUnits.PA);
        }

        public final double toPetapascals() {
            return c(PressureUnits.PEPA);
        }

        public final double toPicopascals() {
            return c(PressureUnits.PPA);
        }

        public final double toPieze() {
            return c(PressureUnits.PIZ);
        }

        public final double toPoundalsPerSquareFoot() {
            return c(PressureUnits.PDLFT);
        }

        public final double toPoundsPerSquareFoot() {
            return c(PressureUnits.LBFFT);
        }

        public final double toPoundsPerSquareInch() {
            return c(PressureUnits.LBFIN);
        }

        public final double toShortTonsPerSquareFoot() {
            return c(PressureUnits.TFFTS);
        }

        public final double toShortTonsPerSquareInch() {
            return c(PressureUnits.TFINS);
        }

        public final double toStandardAtmospheres() {
            return c(PressureUnits.ATM);
        }

        public final double toSthenesPerSquareMeter() {
            return c(PressureUnits.SM);
        }

        public final double toTechnicalAtmospheres() {
            return c(PressureUnits.AT);
        }

        public final double toTerapascals() {
            return c(PressureUnits.TPA);
        }

        public final double toTorrs() {
            return c(PressureUnits.TORR);
        }
    }

    /**
     * UnitOf.Speed()
     *
     * Ex: double foo = new UnitOf.Speed().fromMilesPerHour(1.25).toKilometersPerHour(); //One line conversion from 1.25 MilesPerHour to KilometersPerHour
     */
    public static class Speed extends BaseMeasurementUnit<SpeedUnits> implements Serializable {

        /*
        Method to perform all conversions within Speed class.
        All "to" methods within Speed use this method.
        */
        private final double c(SpeedUnits t) {
            return doConvert(t.TO_MS, conversionHelper.type.TO_MS, false);
        }

        /*
        "from" Methods

        Ex: UnitOf.Speed foo = new UnitOf.Speed().fromMilesPerHour(1.25); //Variable "foo" will be able to convert 1.25 MilesPerHour into any unit of Speed
        */
        public final Speed fromCentimetersPerHour(double v) {
            return store(this, v, SpeedUnits.CMH);
        }

        public final Speed fromCentimetersPerMinute(double v) {
            return store(this, v, SpeedUnits.CMM);
        }

        public final Speed fromCentimetersPerSecond(double v) {
            return store(this, v, SpeedUnits.CMS);
        }

        public final Speed fromEarthsVelocity(double v) {
            return store(this, v, SpeedUnits.EV);
        }

        public final Speed fromFeetPerHour(double v) {
            return store(this, v, SpeedUnits.FTH);
        }

        public final Speed fromFeetPerMinute(double v) {
            return store(this, v, SpeedUnits.FTM);
        }

        public final Speed fromFeetPerSecond(double v) {
            return store(this, v, SpeedUnits.FTS);
        }

        public final Speed fromFirstCosmicVelocity(double v) {
            return store(this, v, SpeedUnits.CV1);
        }

        public final Speed fromInchesPerHour(double v) {
            return store(this, v, SpeedUnits.INH);
        }

        public final Speed fromInchesPerMinute(double v) {
            return store(this, v, SpeedUnits.INM);
        }

        public final Speed fromInchesPerSecond(double v) {
            return store(this, v, SpeedUnits.INS);
        }

        public final Speed fromKilometersPerHour(double v) {
            return store(this, v, SpeedUnits.KMH);
        }

        public final Speed fromKilometersPerMinute(double v) {
            return store(this, v, SpeedUnits.KMM);
        }

        public final Speed fromKilometersPerSecond(double v) {
            return store(this, v, SpeedUnits.KMS);
        }

        public final Speed fromKnots(double v) {
            return store(this, v, SpeedUnits.KN);
        }

        public final Speed fromLight(double v) {
            return store(this, v, SpeedUnits.C);
        }

        public final Speed fromMach(double v) {
            return store(this, v, SpeedUnits.MA);
        }

        public final Speed fromMetersPerHour(double v) {
            return store(this, v, SpeedUnits.MH);
        }

        public final Speed fromMetersPerMinute(double v) {
            return store(this, v, SpeedUnits.MM);
        }

        public final Speed fromMetersPerSecond(double v) {
            return store(this, v, SpeedUnits.MS);
        }

        public final Speed fromMilesPerHour(double v) {
            return store(this, v, SpeedUnits.MIH);
        }

        public final Speed fromMilesPerMinute(double v) {
            return store(this, v, SpeedUnits.MIM);
        }

        public final Speed fromMilesPerSecond(double v) {
            return store(this, v, SpeedUnits.MIS);
        }

        public final Speed fromMillimetersPerHour(double v) {
            return store(this, v, SpeedUnits.MMH);
        }

        public final Speed fromMillimetersPerMinute(double v) {
            return store(this, v, SpeedUnits.MMM);
        }

        public final Speed fromMillimetersPerSecond(double v) {
            return store(this, v, SpeedUnits.MMS);
        }

        public final Speed fromSecondCosmicVelocity(double v) {
            return store(this, v, SpeedUnits.CV2);
        }

        public final Speed fromSoundsInAir(double v) {
            return store(this, v, SpeedUnits.SA);
        }

        public final Speed fromSoundsInWater(double v) {
            return store(this, v, SpeedUnits.SW);
        }

        public final Speed fromThirdCosmicVelocity(double v) {
            return store(this, v, SpeedUnits.CV3);
        }

        public final Speed fromYardsPerHour(double v) {
            return store(this, v, SpeedUnits.YH);
        }

        public final Speed fromYardsPerMinute(double v) {
            return store(this, v, SpeedUnits.YM);
        }

        public final Speed fromYardsPerSecond(double v) {
            return store(this, v, SpeedUnits.YS);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toKilometersPerHour(); //Variable "bar" being of type UnitOf.Speed with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Speed().fromMilesPerHour(1.25).toKilometersPerHour(); //One line conversion from 1.25 MilesPerHour to KilometersPerHour
        */
        public final double toCentimetersPerHour() {
            return c(SpeedUnits.CMH);
        }

        public final double toCentimetersPerMinute() {
            return c(SpeedUnits.CMM);
        }

        public final double toCentimetersPerSecond() {
            return c(SpeedUnits.CMS);
        }

        public final double toEarthsVelocity() {
            return c(SpeedUnits.EV);
        }

        public final double toFeetPerHour() {
            return c(SpeedUnits.FTH);
        }

        public final double toFeetPerMinute() {
            return c(SpeedUnits.FTM);
        }

        public final double toFeetPerSecond() {
            return c(SpeedUnits.FTS);
        }

        public final double toFirstCosmicVelocity() {
            return c(SpeedUnits.CV1);
        }

        public final double toInchesPerHour() {
            return c(SpeedUnits.INH);
        }

        public final double toInchesPerMinute() {
            return c(SpeedUnits.INM);
        }

        public final double toInchesPerSecond() {
            return c(SpeedUnits.INS);
        }

        public final double toKilometersPerHour() {
            return c(SpeedUnits.KMH);
        }

        public final double toKilometersPerMinute() {
            return c(SpeedUnits.KMM);
        }

        public final double toKilometersPerSecond() {
            return c(SpeedUnits.KMS);
        }

        public final double toKnots() {
            return c(SpeedUnits.KN);
        }

        public final double toLight() {
            return c(SpeedUnits.C);
        }

        public final double toMach() {
            return c(SpeedUnits.MA);
        }

        public final double toMetersPerHour() {
            return c(SpeedUnits.MH);
        }

        public final double toMetersPerMinute() {
            return c(SpeedUnits.MM);
        }

        public final double toMetersPerSecond() {
            return c(SpeedUnits.MS);
        }

        public final double toMilesPerHour() {
            return c(SpeedUnits.MIH);
        }

        public final double toMilesPerMinute() {
            return c(SpeedUnits.MIM);
        }

        public final double toMilesPerSecond() {
            return c(SpeedUnits.MIS);
        }

        public final double toMillimetersPerHour() {
            return c(SpeedUnits.MMH);
        }

        public final double toMillimetersPerMinute() {
            return c(SpeedUnits.MMM);
        }

        public final double toMillimetersPerSecond() {
            return c(SpeedUnits.MMS);
        }

        public final double toSecondCosmicVelocity() {
            return c(SpeedUnits.CV2);
        }

        public final double toSoundsInAir() {
            return c(SpeedUnits.SA);
        }

        public final double toSoundsInWater() {
            return c(SpeedUnits.SW);
        }

        public final double toThirdCosmicVelocity() {
            return c(SpeedUnits.CV3);
        }

        public final double toYardsPerHour() {
            return c(SpeedUnits.YH);
        }

        public final double toYardsPerMinute() {
            return c(SpeedUnits.YM);
        }

        public final double toYardsPerSecond() {
            return c(SpeedUnits.YS);
        }
    }

    /**
     * UnitOf.Temperature()
     *
     * Ex: double foo = new UnitOf.Temperature().fromCelsius(1.25).toFahrenheit(); //One line conversion from 1.25 Celsius to Fahrenheit
     */
    public static class Temperature extends BaseMeasurementUnit<TemperatureUnits> implements Serializable {

        /*
        Method to perform all conversions within Temperature class.
        All "to" methods within Temperature use this method.
        */
        private final double c(TemperatureUnits t) {
            return fromCelsiusToType(toCelsius(conversionHelper.value, conversionHelper.type), t);
        }

        /*
        "from" Methods

        Ex: UnitOf.Temperature foo = new UnitOf.Temperature().fromCelsius(1.25); //Variable "foo" will be able to convert 1.25 Celsius into any unit of Temperature
        */
        public final Temperature fromCelsius(double v) {
            return store(this, v, TemperatureUnits.C);
        }

        public final Temperature fromFahrenheit(double v) {
            return store(this, v, TemperatureUnits.F);
        }

        public final Temperature fromKelvin(double v) {
            return store(this, v, TemperatureUnits.K);
        }

        public final Temperature fromRankine(double v) {
            return store(this, v, TemperatureUnits.R);
        }

        public final Temperature fromReaumur(double v) {
            return store(this, v, TemperatureUnits.RE);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toFahrenheit(); //Variable "bar" being of type UnitOf.Temperature with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Temperature().fromCelsius(1.25).toFahrenheit(); //One line conversion from 1.25 Celsius to Fahrenheit
        */
        public final double toCelsius() {
            return c(TemperatureUnits.C);
        }

        public final double toFahrenheit() {
            return c(TemperatureUnits.F);
        }

        public final double toKelvin() {
            return c(TemperatureUnits.K);
        }

        public final double toRankine() {
            return c(TemperatureUnits.R);
        }

        public final double toReaumur() {
            return c(TemperatureUnits.RE);
        }

        /*
        Only used in Temperature's conversion method.
        converts value passed of any Temperature unit into Celsius
        */
        private final double toCelsius(double v, TemperatureUnits t) {
            switch (t) {
                case F:
                    return (v - 32) / 1.8;
                case K:
                    return v - 273.15;
                case R:
                    return (v - 491.67) * (5.0 / 9.0);
                case RE:
                    return v * 1.25;
                default:
                    return v;
            }
        }

        /*
        Only used in Temperature's conversion method.
        Converts Celsius value passed into any Temperature unit.
        */
        private final double fromCelsiusToType(double v, TemperatureUnits t) {
            switch (t) {
                case F:
                    return (v * 1.8) + 32;
                case K:
                    return v + 273.15;
                case R:
                    return (v + 273.15) * 1.8;
                case RE:
                    return v * 0.8;
                default:
                    return v;
            }
        }
    }

    /**
     * UnitOf.Time()
     *
     * Ex: double foo = new UnitOf.Time().fromMinutes(1.25).toHours(); //One line conversion from 1.25 Minutes to Hours
     */
    public static class Time extends BaseMeasurementUnit<TimeUnits> implements Serializable {

        /*
        Method to perform all conversions within Time class.
        All "to" methods within Time use this method.
        */
        private final double c(TimeUnits t) {
            return doConvert(t.TO_S, conversionHelper.type.TO_S);
        }

        /*
        "from" Methods

        Ex: UnitOf.Time foo = new UnitOf.Time().fromMinutes(1.25); //Variable "foo" will be able to convert 1.25 Minutes into any unit of Time
        */
        public final Time fromAttoseconds(double v) {
            return store(this, v, TimeUnits.AS);
        }

        public final Time fromCenturies(double v) {
            return store(this, v, TimeUnits.C);
        }

        public final Time fromDays(double v) {
            return store(this, v, TimeUnits.D);
        }

        public final Time fromDecades(double v) {
            return store(this, v, TimeUnits.DE);
        }

        public final Time fromFemtoseconds(double v) {
            return store(this, v, TimeUnits.FS);
        }

        public final Time fromFortnights(double v) {
            return store(this, v, TimeUnits.FN);
        }

        public final Time fromGregorianYears(double v) {
            return store(this, v, TimeUnits.GY);
        }

        public final Time fromHours(double v) {
            return store(this, v, TimeUnits.H);
        }

        public final Time fromJulianYears(double v) {
            return store(this, v, TimeUnits.JY);
        }

        public final Time fromLeapYears(double v) {
            return store(this, v, TimeUnits.LY);
        }

        public final Time fromMicroseconds(double v) {
            return store(this, v, TimeUnits.MUS);
        }

        public final Time fromMillenniums(double v) {
            return store(this, v, TimeUnits.M);
        }

        public final Time fromMilliseconds(double v) {
            return store(this, v, TimeUnits.MS);
        }

        public final Time fromMinutes(double v) {
            return store(this, v, TimeUnits.MIN);
        }

        public final Time fromMonths(double v) {
            return store(this, v, TimeUnits.MON);
        }

        public final Time fromNanoseconds(double v) {
            return store(this, v, TimeUnits.NS);
        }

        public final Time fromPicoseconds(double v) {
            return store(this, v, TimeUnits.PS);
        }

        public final Time fromSeconds(double v) {
            return store(this, v, TimeUnits.S);
        }

        public final Time fromWeeks(double v) {
            return store(this, v, TimeUnits.WK);
        }

        public final Time fromYears(double v) {
            return store(this, v, TimeUnits.Y);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toHours(); //Variable "bar" being of type UnitOf.Time with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Time().fromMinutes(1.25).toHours(); //One line conversion from 1.25 Minutes to Hours
        */
        public final double toAttoseconds() {
            return c(TimeUnits.AS);
        }

        public final double toCenturies() {
            return c(TimeUnits.C);
        }

        public final double toDays() {
            return c(TimeUnits.D);
        }

        public final double toDecades() {
            return c(TimeUnits.DE);
        }

        public final double toFemtoseconds() {
            return c(TimeUnits.FS);
        }

        public final double toFortnights() {
            return c(TimeUnits.FN);
        }

        public final double toGregorianYears() {
            return c(TimeUnits.GY);
        }

        public final double toHours() {
            return c(TimeUnits.H);
        }

        public final double toJulianYears() {
            return c(TimeUnits.JY);
        }

        public final double toLeapYears() {
            return c(TimeUnits.LY);
        }

        public final double toMicroseconds() {
            return c(TimeUnits.MUS);
        }

        public final double toMillenniums() {
            return c(TimeUnits.M);
        }

        public final double toMilliseconds() {
            return c(TimeUnits.MS);
        }

        public final double toMinutes() {
            return c(TimeUnits.MIN);
        }

        public final double toMonths() {
            return c(TimeUnits.MON);
        }

        public final double toNanoseconds() {
            return c(TimeUnits.NS);
        }

        public final double toPicoseconds() {
            return c(TimeUnits.PS);
        }

        public final double toSeconds() {
            return c(TimeUnits.S);
        }

        public final double toWeeks() {
            return c(TimeUnits.WK);
        }

        public final double toYears() {
            return c(TimeUnits.Y);
        }
    }

    /**
     * UnitOf.Torque()
     *
     * Ex: double foo = new UnitOf.Torque().fromNewtonMeters(1.25).toGramMeters(); //One line conversion from 1.25 NewtonMeters to GramMeters
     */
    public static class Torque extends BaseMeasurementUnit<TorqueUnits> implements Serializable {

        /*
        Method to perform all conversions within Torque class.
        All "to" methods within Torque use this method.
        */
        private final double c(TorqueUnits t) {
            return doConvert(t.TO_KGFM, conversionHelper.type.TO_KGFM);
        }

        /*
        "from" Methods

        Ex: UnitOf.Torque foo = new UnitOf.Torque().fromNewtonMeters(1.25); //Variable "foo" will be able to convert 1.25 NewtonMeters into any unit of Torque
        */
        public final Torque fromDyneCentimeters(double v) {
            return store(this, v, TorqueUnits.DYNCM);
        }

        public final Torque fromDyneMeters(double v) {
            return store(this, v, TorqueUnits.DYNM);
        }

        public final Torque fromDyneMillimeters(double v) {
            return store(this, v, TorqueUnits.DYNMM);
        }

        public final Torque fromGramCentimeters(double v) {
            return store(this, v, TorqueUnits.GFCM);
        }

        public final Torque fromGramMeters(double v) {
            return store(this, v, TorqueUnits.GFM);
        }

        public final Torque fromGramMillimeters(double v) {
            return store(this, v, TorqueUnits.GFMM);
        }

        public final Torque fromKilogramCentimeters(double v) {
            return store(this, v, TorqueUnits.KGFCM);
        }

        public final Torque fromKilogramMeters(double v) {
            return store(this, v, TorqueUnits.KGFM);
        }

        public final Torque fromKilogramMillimeters(double v) {
            return store(this, v, TorqueUnits.KGFMM);
        }

        public final Torque fromKilonewtonMeters(double v) {
            return store(this, v, TorqueUnits.KNM);
        }

        public final Torque fromNewtonCentimeters(double v) {
            return store(this, v, TorqueUnits.NCM);
        }

        public final Torque fromNewtonMeters(double v) {
            return store(this, v, TorqueUnits.NM);
        }

        public final Torque fromNewtonMillimeters(double v) {
            return store(this, v, TorqueUnits.NMM);
        }

        public final Torque fromOunceFeet(double v) {
            return store(this, v, TorqueUnits.OZFFT);
        }

        public final Torque fromOunceInches(double v) {
            return store(this, v, TorqueUnits.OZFIN);
        }

        public final Torque fromPoundFeet(double v) {
            return store(this, v, TorqueUnits.LBFFT);
        }

        public final Torque fromPoundInches(double v) {
            return store(this, v, TorqueUnits.LBFIN);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toGramMeters(); //Variable "bar" being of type UnitOf.Torque with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Torque().fromNewtonMeters(1.25).toGramMeters(); //One line conversion from 1.25 NewtonMeters to GramMeters
        */
        public final double toDyneCentimeters() {
            return c(TorqueUnits.DYNCM);
        }

        public final double toDyneMeters() {
            return c(TorqueUnits.DYNM);
        }

        public final double toDyneMillimeters() {
            return c(TorqueUnits.DYNMM);
        }

        public final double toGramCentimeters() {
            return c(TorqueUnits.GFCM);
        }

        public final double toGramMeters() {
            return c(TorqueUnits.GFM);
        }

        public final double toGramMillimeters() {
            return c(TorqueUnits.GFMM);
        }

        public final double toKilogramCentimeters() {
            return c(TorqueUnits.KGFCM);
        }

        public final double toKilogramMeters() {
            return c(TorqueUnits.KGFM);
        }

        public final double toKilogramMillimeters() {
            return c(TorqueUnits.KGFMM);
        }

        public final double toKilonewtonMeters() {
            return c(TorqueUnits.KNM);
        }

        public final double toNewtonCentimeters() {
            return c(TorqueUnits.NCM);
        }

        public final double toNewtonMeters() {
            return c(TorqueUnits.NM);
        }

        public final double toNewtonMillimeters() {
            return c(TorqueUnits.NMM);
        }

        public final double toOunceFeet() {
            return c(TorqueUnits.OZFFT);
        }

        public final double toOunceInches() {
            return c(TorqueUnits.OZFIN);
        }

        public final double toPoundFeet() {
            return c(TorqueUnits.LBFFT);
        }

        public final double toPoundInches() {
            return c(TorqueUnits.LBFIN);
        }
    }

    /**
     * UnitOf.Volume()
     *
     * Ex: double foo = new UnitOf.Volume().fromLiters(1.25).toCubicMeters(); //One line conversion from 1.25 Liters to CubicMeters
     */
    public static class Volume extends BaseMeasurementUnit<VolumeUnits> implements Serializable {

        /*
        Method to perform all conversions within Volume class.
        All "to" methods within Volume use this method.
        */
        private final double c(VolumeUnits t) {
            return doConvert(t.TO_M, conversionHelper.type.TO_M);
        }

        /*
        "from" Methods

        Ex: UnitOf.Volume foo = new UnitOf.Volume().fromLiters(1.25); //Variable "foo" will be able to convert 1.25 Liters into any unit of Volume
        */
        public final Volume fromAcreFeetUSSurvey(double v) {
            return store(this, v, VolumeUnits.ACFTUS);
        }

        public final Volume fromAcreInches(double v) {
            return store(this, v, VolumeUnits.ACIN);
        }

        public final Volume fromArceFeet(double v) {
            return store(this, v, VolumeUnits.ACFTO);
        }

        public final Volume fromAttoliters(double v) {
            return store(this, v, VolumeUnits.AL);
        }

        public final Volume fromBarrelsOfOil(double v) {
            return store(this, v, VolumeUnits.BBLO);
        }

        public final Volume fromBarrelsUK(double v) {
            return store(this, v, VolumeUnits.BBLUK);
        }

        public final Volume fromBarrelsUS(double v) {
            return store(this, v, VolumeUnits.BBLUS);
        }

        public final Volume fromBoardFeet(double v) {
            return store(this, v, VolumeUnits.FBM);
        }

        public final Volume fromCentiliters(double v) {
            return store(this, v, VolumeUnits.CL);
        }

        public final Volume fromCords(double v) {
            return store(this, v, VolumeUnits.CORD);
        }

        public final Volume fromCubicCentimeters(double v) {
            return store(this, v, VolumeUnits.CM);
        }

        public final Volume fromCubicDecimeters(double v) {
            return store(this, v, VolumeUnits.DM);
        }

        public final Volume fromCubicFeet(double v) {
            return store(this, v, VolumeUnits.FT);
        }

        public final Volume fromCubicInches(double v) {
            return store(this, v, VolumeUnits.IN);
        }

        public final Volume fromCubicKilometers(double v) {
            return store(this, v, VolumeUnits.KM);
        }

        public final Volume fromCubicMeters(double v) {
            return store(this, v, VolumeUnits.M);
        }

        public final Volume fromCubicMiles(double v) {
            return store(this, v, VolumeUnits.MI);
        }

        public final Volume fromCubicMillimeters(double v) {
            return store(this, v, VolumeUnits.MM);
        }

        public final Volume fromCubicYards(double v) {
            return store(this, v, VolumeUnits.YD);
        }

        public final Volume fromCupsMetric(double v) {
            return store(this, v, VolumeUnits.CUPM);
        }

        public final Volume fromCupsUK(double v) {
            return store(this, v, VolumeUnits.CUPUK);
        }

        public final Volume fromCupsUS(double v) {
            return store(this, v, VolumeUnits.CUPUS);
        }

        public final Volume fromDeciliters(double v) {
            return store(this, v, VolumeUnits.DL);
        }

        public final Volume fromDecisteres(double v) {
            return store(this, v, VolumeUnits.DECI);
        }

        public final Volume fromDekaliters(double v) {
            return store(this, v, VolumeUnits.DAL);
        }

        public final Volume fromDekasteres(double v) {
            return store(this, v, VolumeUnits.DEKA);
        }

        public final Volume fromDessertspoonsUK(double v) {
            return store(this, v, VolumeUnits.DSTSPNUK);
        }

        public final Volume fromDessertspoonsUS(double v) {
            return store(this, v, VolumeUnits.DSTSPNUS);
        }

        public final Volume fromDrops(double v) {
            return store(this, v, VolumeUnits.DROP);
        }

        public final Volume fromExaliters(double v) {
            return store(this, v, VolumeUnits.EL);
        }

        public final Volume fromFemtoliters(double v) {
            return store(this, v, VolumeUnits.FL);
        }

        public final Volume fromFluidOuncesUK(double v) {
            return store(this, v, VolumeUnits.FLOZUK);
        }

        public final Volume fromFluidOuncesUS(double v) {
            return store(this, v, VolumeUnits.FLOZUS);
        }

        public final Volume fromGallonsUK(double v) {
            return store(this, v, VolumeUnits.GALUK);
        }

        public final Volume fromGallonsUS(double v) {
            return store(this, v, VolumeUnits.GALUS);
        }

        public final Volume fromGigaliters(double v) {
            return store(this, v, VolumeUnits.GL);
        }

        public final Volume fromGillsUK(double v) {
            return store(this, v, VolumeUnits.GILUK);
        }

        public final Volume fromGillsUS(double v) {
            return store(this, v, VolumeUnits.GILUS);
        }

        public final Volume fromHectoliters(double v) {
            return store(this, v, VolumeUnits.HL);
        }

        public final Volume fromHogsheads(double v) {
            return store(this, v, VolumeUnits.HOG);
        }

        public final Volume fromHundredCubicFeet(double v) {
            return store(this, v, VolumeUnits.CCF);
        }

        public final Volume fromKiloliters(double v) {
            return store(this, v, VolumeUnits.KL);
        }

        public final Volume fromLiters(double v) {
            return store(this, v, VolumeUnits.L);
        }

        public final Volume fromMegaliters(double v) {
            return store(this, v, VolumeUnits.ML);
        }

        public final Volume fromMicroliters(double v) {
            return store(this, v, VolumeUnits.MUL);
        }

        public final Volume fromMilliliters(double v) {
            return store(this, v, VolumeUnits.MILL);
        }

        public final Volume fromMinimsUK(double v) {
            return store(this, v, VolumeUnits.MINIUK);
        }

        public final Volume fromMinimsUS(double v) {
            return store(this, v, VolumeUnits.MINIUS);
        }

        public final Volume fromNanoliters(double v) {
            return store(this, v, VolumeUnits.NL);
        }

        public final Volume fromPetaliters(double v) {
            return store(this, v, VolumeUnits.PEL);
        }

        public final Volume fromPicoliters(double v) {
            return store(this, v, VolumeUnits.PL);
        }

        public final Volume fromPintsUK(double v) {
            return store(this, v, VolumeUnits.PTUK);
        }

        public final Volume fromPintsUS(double v) {
            return store(this, v, VolumeUnits.PTUS);
        }

        public final Volume fromQuartsUK(double v) {
            return store(this, v, VolumeUnits.QTUK);
        }

        public final Volume fromQuartsUS(double v) {
            return store(this, v, VolumeUnits.QTUS);
        }

        public final Volume fromRegisterTons(double v) {
            return store(this, v, VolumeUnits.REGTON);
        }

        public final Volume fromSteres(double v) {
            return store(this, v, VolumeUnits.ST);
        }

        public final Volume fromTablespoonsMetric(double v) {
            return store(this, v, VolumeUnits.TBSPM);
        }

        public final Volume fromTablespoonsUK(double v) {
            return store(this, v, VolumeUnits.TBSPUK);
        }

        public final Volume fromTablespoonsUS(double v) {
            return store(this, v, VolumeUnits.TBSPUS);
        }

        public final Volume fromTeaspoonsMetric(double v) {
            return store(this, v, VolumeUnits.TSPM);
        }

        public final Volume fromTeaspoonsUK(double v) {
            return store(this, v, VolumeUnits.TSPUK);
        }

        public final Volume fromTeaspoonsUS(double v) {
            return store(this, v, VolumeUnits.TSPUS);
        }

        public final Volume fromTeraliters(double v) {
            return store(this, v, VolumeUnits.TL);
        }

        public final Volume fromTuns(double v) {
            return store(this, v, VolumeUnits.TUN);
        }

        /*
        "to" Methods

        Ex 1: double bar = foo.toCubicMeters(); //Variable "bar" being of type UnitOf.Volume with "from" value already assigned
        Ex 2: double foobar = new UnitOf.Volume().fromLiters(1.25).toCubicMeters(); //One line conversion from 1.25 Liters to CubicMeters
        */
        public final double toAcreFeetUSSurvey() {
            return c(VolumeUnits.ACFTUS);
        }

        public final double toAcreInches() {
            return c(VolumeUnits.ACIN);
        }

        public final double toArceFeet() {
            return c(VolumeUnits.ACFTO);
        }

        public final double toAttoliters() {
            return c(VolumeUnits.AL);
        }

        public final double toBarrelsOfOil() {
            return c(VolumeUnits.BBLO);
        }

        public final double toBarrelsUK() {
            return c(VolumeUnits.BBLUK);
        }

        public final double toBarrelsUS() {
            return c(VolumeUnits.BBLUS);
        }

        public final double toBoardFeet() {
            return c(VolumeUnits.FBM);
        }

        public final double toCentiliters() {
            return c(VolumeUnits.CL);
        }

        public final double toCords() {
            return c(VolumeUnits.CORD);
        }

        public final double toCubicCentimeters() {
            return c(VolumeUnits.CM);
        }

        public final double toCubicDecimeters() {
            return c(VolumeUnits.DM);
        }

        public final double toCubicFeet() {
            return c(VolumeUnits.FT);
        }

        public final double toCubicInches() {
            return c(VolumeUnits.IN);
        }

        public final double toCubicKilometers() {
            return c(VolumeUnits.KM);
        }

        public final double toCubicMeters() {
            return c(VolumeUnits.M);
        }

        public final double toCubicMiles() {
            return c(VolumeUnits.MI);
        }

        public final double toCubicMillimeters() {
            return c(VolumeUnits.MM);
        }

        public final double toCubicYards() {
            return c(VolumeUnits.YD);
        }

        public final double toCupsMetric() {
            return c(VolumeUnits.CUPM);
        }

        public final double toCupsUK() {
            return c(VolumeUnits.CUPUK);
        }

        public final double toCupsUS() {
            return c(VolumeUnits.CUPUS);
        }

        public final double toDeciliters() {
            return c(VolumeUnits.DL);
        }

        public final double toDecisteres() {
            return c(VolumeUnits.DECI);
        }

        public final double toDekaliters() {
            return c(VolumeUnits.DAL);
        }

        public final double toDekasteres() {
            return c(VolumeUnits.DEKA);
        }

        public final double toDessertspoonsUK() {
            return c(VolumeUnits.DSTSPNUK);
        }

        public final double toDessertspoonsUS() {
            return c(VolumeUnits.DSTSPNUS);
        }

        public final double toDrops() {
            return c(VolumeUnits.DROP);
        }

        public final double toExaliters() {
            return c(VolumeUnits.EL);
        }

        public final double toFemtoliters() {
            return c(VolumeUnits.FL);
        }

        public final double toFluidOuncesUK() {
            return c(VolumeUnits.FLOZUK);
        }

        public final double toFluidOuncesUS() {
            return c(VolumeUnits.FLOZUS);
        }

        public final double toGallonsUK() {
            return c(VolumeUnits.GALUK);
        }

        public final double toGallonsUS() {
            return c(VolumeUnits.GALUS);
        }

        public final double toGigaliters() {
            return c(VolumeUnits.GL);
        }

        public final double toGillsUK() {
            return c(VolumeUnits.GILUK);
        }

        public final double toGillsUS() {
            return c(VolumeUnits.GILUS);
        }

        public final double toHectoliters() {
            return c(VolumeUnits.HL);
        }

        public final double toHogsheads() {
            return c(VolumeUnits.HOG);
        }

        public final double toHundredCubicFeet() {
            return c(VolumeUnits.CCF);
        }

        public final double toKiloliters() {
            return c(VolumeUnits.KL);
        }

        public final double toLiters() {
            return c(VolumeUnits.L);
        }

        public final double toMegaliters() {
            return c(VolumeUnits.ML);
        }

        public final double toMicroliters() {
            return c(VolumeUnits.MUL);
        }

        public final double toMilliliters() {
            return c(VolumeUnits.MILL);
        }

        public final double toMinimsUK() {
            return c(VolumeUnits.MINIUK);
        }

        public final double toMinimsUS() {
            return c(VolumeUnits.MINIUS);
        }

        public final double toNanoliters() {
            return c(VolumeUnits.NL);
        }

        public final double toPetaliters() {
            return c(VolumeUnits.PEL);
        }

        public final double toPicoliters() {
            return c(VolumeUnits.PL);
        }

        public final double toPintsUK() {
            return c(VolumeUnits.PTUK);
        }

        public final double toPintsUS() {
            return c(VolumeUnits.PTUS);
        }

        public final double toQuartsUK() {
            return c(VolumeUnits.QTUK);
        }

        public final double toQuartsUS() {
            return c(VolumeUnits.QTUS);
        }

        public final double toRegisterTons() {
            return c(VolumeUnits.REGTON);
        }

        public final double toSteres() {
            return c(VolumeUnits.ST);
        }

        public final double toTablespoonsMetric() {
            return c(VolumeUnits.TBSPM);
        }

        public final double toTablespoonsUK() {
            return c(VolumeUnits.TBSPUK);
        }

        public final double toTablespoonsUS() {
            return c(VolumeUnits.TBSPUS);
        }

        public final double toTeaspoonsMetric() {
            return c(VolumeUnits.TSPM);
        }

        public final double toTeaspoonsUK() {
            return c(VolumeUnits.TSPUK);
        }

        public final double toTeaspoonsUS() {
            return c(VolumeUnits.TSPUS);
        }

        public final double toTeraliters() {
            return c(VolumeUnits.TL);
        }

        public final double toTuns() {
            return c(VolumeUnits.TUN);
        }
    }
}