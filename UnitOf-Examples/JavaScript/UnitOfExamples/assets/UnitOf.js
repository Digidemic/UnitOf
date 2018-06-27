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

/**
 * https://github.com/Digidemic/UnitOf for Code, Documentation, Examples, Feature List, Diagrams, FAQ and more.
 *
 * UnitOf is also available in Java and C#.
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
 * DataType (Convert any JavaScript data type and more including converting to and from fractions)
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
"use strict";
var UnitOf = {};
(function(){

    /**
     * All conversions use the following function to multiply or divide depending on how the measurement's units are defined (See Object constants per measurement).
     */
    function inverse(n, d, mult){
        return (mult) ? n * d : n / d;
    }

    /**
     * Used by every measurement class that converts just numbers (Anything(), DataType(), NumericBase() do not apply here)
     * Function performs the full conversion of taking the user defined "from" value and converting it into the user desired "to" value.
     * var a: Object constant value of "to" unit. Unit being converted into conversion constant value.
     * var b: Object constant value of "from" unit. Unit starting from conversion constant value.
     * var q: Multiply then divide conversion algorithm, false will divide then multiply when converting "to"
     * returns: Finished conversion. "from" converted into "to" value.
     */
    function  k(value,convertIntoConstant,originalFromConstant,multValueByConstant){
        return inverse(inverse(value, convertIntoConstant, multValueByConstant), originalFromConstant, !multValueByConstant);
    }

    /**
     * UnitOf.Acceleration
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Acceleration.
     * "from" functions are located at the bottom of this document within "Acceleration" of the "UnitOf" Object.
     *
     * Ex: var foo = UnitOf.Acceleration.fromGravity(1.25).toGalileos; //One line conversion from 1.25 Gravity to Galileos
     */
    function AccelerationLogic(v,t){

        /*
         Acceleration Units

         All unit values are conversions of each unit at the value of 1 converted into MS (Meter per Second Squared).
         */
        var l = {
            AS:1e-18,			//Attometer per Second Squared
            CS:1e-2,			//Centimeter per Second Squared
            DS:1e-1,			//Decimeter per Second Squared
            DAS:1e1,			//Dekameter per Second Squared
            ES:1e18,			//Exameter per Second Squared
            FTHS:0.000084666666666667,//Foot per Hour per Second
            FTMS:0.00508,		//Foot per Minute per Second
            FTS:0.3048,			//Foot per Second Squared
            FS:1e-15,			//Femtometer per Second Squared
            GAL:1/1e2,			//Galileo
            GS:1e9,				//Gigameter per Second Squared
            G:9.80665,			//Gravity
            HS:1e2,				//Hectometer per Second Squared
            INMS:0.0004233333,	//Inch per Minute per Second
            INS:0.0254,			//Inch per Second Squared
            KHS:1/3.6,			//Kilometers per Hour per Second
            KH:1/12960.0,		//Kilometers per Hour Squared
            KS:1e3,				//Kilometer per Second Squared
            KNS:0.514444444444,	//Knot per Second
            MGS:1e6,			//Megameter per Second Squared
            MS:1,				//Meter per Second Squared
            MUGAL:1/1e8,		//Microgalileo
            MUS:1e-6,			//Micrometer per Second Squared
            MIHS:0.44704,		//Mile/Hour per Second
            MIMS:26.8224,		//Mile per Minute per Second
            MIS:1609.344,		//Mile per Second Squared
            MILGAL:1/1e5,		//Milligalileo
            MILS:1e-3,			//Millimeter per Second Squared
            NS:1e-9,			//Nanometer per Second Squared
            PES:1e15,			//Petameter per Second Squared
            PS:1e-12,			//Picometer per Second Squared
            TS:1e12,			//Terameter per Second Squared
            YDS:0.9144			//Yard per Second Squared
        };

        /*
         Function to perform all conversions within Acceleration function.
         All "to" functions within Acceleration use this function.
         */
        function c(z){
            return k(v,z,l[t],false);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toGalileos; //Variable "bar" being of type UnitOf.Acceleration with "from" value already assigned
         Ex 2: var foobar = UnitOf.Acceleration.fromGravity(1.25).toGalileos; //One line conversion from 1.25 Gravity to Galileos
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAttometersPerSecondSquared:c(l.AS),
            toCentimeterPerSecondSquared:c(l.CS),
            toDecimetersPerSecondSquared:c(l.DS),
            toDekametersPerSecondSquared:c(l.DAS),
            toExametersPerSecondSquared:c(l.ES),
            toFeetPerHourPerSecond:c(l.FTHS),
            toFeetPerMinutePerSecond:c(l.FTMS),
            toFeetPerSecondSquared:c(l.FTS),
            toFemtometersPerSecondSquared:c(l.FS),
            toGalileos:c(l.GAL),
            toGigametersPerSecondSquared:c(l.GS),
            toGravity:c(l.G),
            toHectometersPerSecondSquared:c(l.HS),
            toInchesPerMinutePerSecond:c(l.INMS),
            toInchesPerSecondSquared:c(l.INS),
            toKilometersPerHourPerSecond:c(l.KHS),
            toKilometersPerHourSquared:c(l.KH),
            toKilometersPerSecondSquared:c(l.KS),
            toKnotsPerSecond:c(l.KNS),
            toMegametersPerSecondSquared:c(l.MGS),
            toMetersPerSecondSquared:c(l.MS),
            toMicrogalileos:c(l.MUGAL),
            toMicrometersPerSecondSquared:c(l.MUS),
            toMilesPerHourPerSecond:c(l.MIHS),
            toMilesPerMinutePerSecond:c(l.MIMS),
            toMilesPerSecondSquared:c(l.MIS),
            toMilligalileos:c(l.MILGAL),
            toMillimetersPerSecondSquared:c(l.MILS),
            toNanometersPerSecondSquared:c(l.NS),
            toPetametersPerSecondSquared:c(l.PES),
            toPicometersPerSecondSquared:c(l.PS),
            toTerametersPerSecondSquared:c(l.TS),
            toYardsPerSecondSquared:c(l.YDS)
        }
    }

    /**
     * UnitOf.Angle
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Angle.
     * "from" functions are located at the bottom of this document within "Angle" of the "UnitOf" Object.
     *
     * Ex: var foo = UnitOf.Angle.fromDegrees(1.25).toRadians; //One line conversion from 1.25 Degrees to Radians
     */
    function AngleLogic(v,t){

        /*
         Angle Units

         All unit values are conversions of D (Degree) at the value of 1 converted into each unit.
         */
        var l = {
            C:1/360.0,			//Circle
            D:1,				//Degree
            G:1/0.9,			//Gradian
            MIL:(1/0.05625),	//Angular Mil
            M:60,				//Minute
            Q:1/90.0,			//Quadrant
            RAD:Math.PI/180.0,	//Radian
            R:1/360.0,			//Revolution
            RA:1/90.0,			//Right Angle
            S:3600,				//Second
            SE:1/60.0,			//Sextant
            SI:(1/30.0),		//Sign
            T:1/360.0			//Turn
        };

        /*
         Function to perform all conversions within Angle function.
         All "to" functions within Angle use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toRadians; //Variable "bar" being of type UnitOf.Angle with "from" value already assigned
         Ex 2: var foobar = UnitOf.Angle.fromDegrees(1.25).toRadians; //One line conversion from 1.25 Degrees to Radians
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toCircles:c(l.C),
            toDegrees:c(l.D),
            toGradians:c(l.G),
            toMils:c(l.MIL),
            toMinutes:c(l.M),
            toQuadrants:c(l.Q),
            toRadians:c(l.RAD),
            toRevolutions:c(l.R),
            toRightAngles:c(l.RA),
            toSeconds:c(l.S),
            toSextants:c(l.SE),
            toSigns:c(l.SI),
            toTurns:c(l.T)
        }
    }

    /**
     * UnitOf.Anything() - Build your own custom measurement at compile or run-time using the UnitOf methodology.
     *
     * See UnitOf example projects on Github for fully working examples.
     *
     *
     * Potential Constructors (Order: UnitOf function syntax | Example Syntax)
     * -=-=-=-=-=-=-
     * UnitOf.Anything(keyName, keyValue, multiplyToKeyThenDivide, units); //units type Object  | UnitOf.Anything('ft', 1, true, {'m': 0.3048,'in':12.0});
     * UnitOf.Anything(keyName, keyValue, multiplyToKeyThenDivide, units); //units type Array   | UnitOf.Anything('ft', 1, true, [0.3048,12.0]);
     * UnitOf.Anything(keyName);                                    | UnitOf.Anything('ft');
     * UnitOf.Anything(keyName, keyValue);                          | UnitOf.Anything('ft', 1);
     * UnitOf.Anything(keyName, keyValue, multiplyToKeyThenDivide); | UnitOf.Anything('ft', 1, true);
     * UnitOf.Anything(keyName, multiplyToKeyThenDivide);           | UnitOf.Anything('ft', true);
     * UnitOf.Anything(keyName, units); //Units type Object         | UnitOf.Anything('ft', {'m': 0.3048,'in':12.0});
     * UnitOf.Anything(keyName, units); //Units type Array          | UnitOf.Anything('ft', [0.3048,12.0]);
     */
    function Anything(keyName, keyValue, multiplyToKeyThenDivide, units){
        var mtd = typeof multiplyToKeyThenDivide === 'boolean' ? multiplyToKeyThenDivide : typeof keyValue === 'boolean' ? keyValue : true; //Multiply then divide conversion algorithm, false will divide then multiply when converting "to".
        var kn = keyName+'';                                    //Key Unit Name. Ex: key passed in was 1 feet, "feet" would be the key name (kn).
        var kv = typeof keyValue === 'number' ? keyValue : 1;   //Key Unit Value. Ex: key passed in was 1 feet, 1 would be the key value. UnitOf.Anything() conversion works by converting the starting value to the defined key, then from the key to the desired value (kv).
        var fn = kn;                                            //From Unit Name. Unit to be used for conversions. Ex: from passed in was 5 meters, "meters" would be the From Unit Name (fn).
        var fv = kv;                                            //From Unit Value. Unit to be used for conversions. Ex: from passed in was 5 meters, 5 would be the From Unit Name (fv).
        units = (keyValue instanceof Array || keyValue instanceof Object) ? keyValue : units;   //Units available to convert "from" and "to", includes key/value
        var u = units || {};                                    //if "units" is undefined or null default it to an empty Object
        if(units instanceof Array){                             //"units" can be passed in an array or object. Several UnitOf.Anything constructors accept an array of values to be passed serving as both the key and value of the unit. The following will turn that array into an Object as that is the format UnitOf.Anything uses behind the scenes.
            u = {};
            for(var i = 0; i < units.length; i++){              //Turn the array of units into an Object as that is the format UnitOf.Anything uses behind the scenes.
                u[units[i]+''] = units[i]+'';
            }
        } else if (!(units instanceof Object)){                 //if some other format besides Object or Array was passed in as the "units" overwrite it with an empty Object
            u = {};
        }
        u[kn] = kv;                                             //if collection of units is passed in it is not necessary to include it with the collection of units as it is added/updated here.

        /**
         * Fucntion to perform all conversions within Anything class
         * @param fc Constant value of "from" unit. Unit starting from factor value.
         * @param cv "from" value passed. Unit value being converted that passed by the user.
         * @param tc Constant value of "to" unit. Unit being converted into factor value.
         * @return Finished conversion. "from" converted into "to" value.
         */
        function c(fc,cv,tc){
            return inverse(inverse(cv,tc,mtd),fc,!mtd);
        }

        /**
         * Takes the Unit Name passed and returns the found Unit's Value
         * @param name Unit Name
         * @return Unit Value of the Unit Name passed in. Returns 0 if Unit Name cannot be found.
         */
        function getUnitValueByName(name){
            return u[name+''] || u[DataType(name).toNumber(-998.7654)] || 0;
        }

        /**
         * Available functions after UnitOf.Anything has been instantiated
         */
        return {

            /**
             * View the Unit Key Name originally passed in to the .Anything() constructor.
             * Conversion here works by converting the starting value to this key then from the key to the desired value.
             * @return The Unit Key Name
             */
            getKeyName: function(){return kn;},

            /**
             * View the Unit Key Value originally passed in to the .Anything() constructor.
             * Conversion here works by converting the starting value to this key then from the key to the desired value.
             * @return The Unit Key Value
             */
            getKeyValue: function(){return kv;},

            /**
             * Returns the set "from" Unit Name
             */
            getFromName: function(){return fn;},

            /**
             * Returns the set "from" Unit Value
             */
            getFromValue: function(){return fv;},

            /**
             * Adds or updates a Unit's Name with its associated Value in relation to the Key to the collection of Units.
             * If only a name is passed ("val" left undefined) it needs to be a number as it will represent both the Unit Name and Value.
             * @param name Unit Name
             * @param val Unit Value for the Unit Name in relation to the Key
             */
            addUnit:function(name,val){
                name = name+'';
                val = val || DataType(name).toNumber(0);
                if(kn === name){
                    kn = name;
                    kv = val;
                }
                u[name] = val;
            },

            /**
             * Initializes the declared new UnitOf.Anything variable with its Unit Name/Value.
             * Following this with UnitOf.Anything's to() will convert this value to the desired type's value
             * @param fromValue Starting Unit Value to be converted
             * @param fromName Starting Unit Name to be converted
             */
            from:function(fromName, fromValue) {
                fn = fromName+'';
                fv = DataType(fromValue).toNumber(0);
            },

            /**
             * Convert the already passed in "from" Unit Name/Value
             * @param toName Convert already passed in "from" Unit into this unit by name
             * @return The finished conversion Value
             */
            to:function(toName){
                return this.convertNow(fv,fn,toName);
            },

            /**
             * One liner conversion, pass in a starting Unit Name/Value to be converted into the desired Unit by Name.
             * @param fromValue Starting Unit Value
             * @param fromName Starting Unit Name
             * @param toName Converting into Unit Name
             * @return The finished conversion Value
             */
            convertNow:function(fromValue,fromName,toName){
                return c(getUnitValueByName(fromName),fromValue,getUnitValueByName(toName));
            }
        }
    }

    /**
     * UnitOf.Area
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Area.
     * "from" functions are located at the bottom of this document within "Area" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Area.fromSquareMeters(1.25).toAcres; //One line conversion from 1.25 SquareMeters to Acres
     */
    function AreaLogic(v,t){

        /*
         Area Units

         All unit values are conversions of M (Square Meter) at the value of 1 converted into each unit.
         */
        var l = {
            AC:1/4046.8564224,	//Acre
            A:1e-2,				//Are
            AR:1/3418.740000066,//Arpent
            B:1e28,				//Barn
            CRIN:1973.52524139,	//Circular Inch
            CRMIL:1973525241.39,//Circular Mil
            HA:1e-4,			//Hactare
            HS:1/647497.027584,	//Homestead
            R:1/1011.7141056,	//Rood
            S:1/0.09290304,		//Sabin
            C:1e4,				//Square Centimeter
            CH:1/404.68564224,	//Square Chain
            D:1e2,				//Square Decimeter
            DA:1e-2,			//Square Dekameter
            FT:1/0.09290304,	//Square Foot
            H:1e-4,				//Square Hectometer
            IN:1/0.00064516,	//Square Inch
            K:1e-6,				//Square Kilometer
            M:1,				//Square Meter
            MU:1e12,			//Square Micrometer
            MI:1/2589988.110336,//Square Mile
            MIL:1e6,			//Square millimeter
            N:1e18,				//Square Nanometer
            PE:1/25.29285264,	//Square Perch
            PO:1/25.29285264,	//Square Pole
            ROD:1/25.29285264,	//Square Rod
            YD:1/0.83612736		//Square Yard
        };

        /*
         Function to perform all conversions within Area function.
         All "to" functions within Area use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toAcres; //Variable "bar" being of type UnitOf.Area with "from" value already assigned
         Ex 2: var foobar = UnitOf.Area.fromSquareMeters(1.25).toAcres; //One line conversion from 1.25 SquareMeters to Acres
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAcres:c(l.AC),
            toAres:c(l.A),
            toArpents:c(l.AR),
            toBarns:c(l.B),
            toCircularInches:c(l.CRIN),
            toCircularMils:c(l.CRMIL),
            toHectares:c(l.HA),
            toHomesteads:c(l.HS),
            toRoods:c(l.R),
            toSabins:c(l.S),
            toSquareCentimeters:c(l.C),
            toSquareChains:c(l.CH),
            toSquareDecimeters:c(l.D),
            toSquareDekameters:c(l.DA),
            toSquareFeet:c(l.FT),
            toSquareHectometers:c(l.H),
            toSquareInches:c(l.IN),
            toSquareKilometers:c(l.K),
            toSquareMeters:c(l.M),
            toSquareMicrometers:c(l.MU),
            toSquareMiles:c(l.MI),
            toSquareMillimeters:c(l.MIL),
            toSquareNanometers:c(l.N),
            toSquarePerches:c(l.PE),
            toSquarePoles:c(l.PO),
            toSquareRods:c(l.ROD),
            toSquareYards:c(l.YD)
        }
    }

    /**
     * UnitOf.DataStorage
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.DataStorage.
     * "from" functions are located at the bottom of this document within "DataStorage" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.DataStorage.fromMegabytes(1.25).toKilobytes; //One line conversion from 1.25 Megabytes to Kilobytes
     */
    function DataStorageLogic(v,t){

        /*
         DataStorage Units

         All unit values are conversions of MB (Megabyte) at the value of 1 converted into each unit.
         */
        var l = {
            B:1.0 * 8.0 * 1024.0 * 1024.0,	//Bit
            BL:1.0 * 1.0 * 2.0 * 1024.0,	//Block
            BD2:1/51200.0,					//Blu-ray Disc (Double-Layer)
            BD1:1/25600.0,					//Blu-ray Disc (Single-Layer)
            BY:1.0 * 1.0 * 1024.0 * 1024.0,	//Byte
            CD74:1/(665096.0/1024.0),		//CD (74 Minute)
            CD80:1/702.170607567,			//CD (80 Minute)
            D22:1/17408.0,					//DVD (2 Layer 2 Side)
            D12:1/9625.6,					//DVD (1 Layer 2 Side)
            D21:1/8704.0,					//DVD (2 Layer 1 Side)
            D11:1/4812.8,					//DVD (1 Layer 1 Side)
            EBI:8/(Math.pow(1024, 4)),		//Exabit
            EB:1/(Math.pow(1024, 4)),		//Exabyte
            F35DD:1/(711.75/1024.0),		//Floppy Disk (3.5 DD)
            F35ED:1/(2847.0/1024.0),		//Floppy Disk (3.5 ED)
            F35HD:1/(1423.5/1024.0),		//Floppy Disk (3.5 HD)
            F525DD:1/(355.875/1024.0),		//Floppy Disk (5.25 DD)
            F525HD:1/(1185.5/1024.0),		//Floppy Disk (5.25 HD)
            GBI:8/(Math.pow(1024, 1)),		//Gigabit
            GB:1/(Math.pow(1024, 1)),		//Gigabyte
            KBI:8 * 1024,					//Kilobit
            KB:1024,						//Kilobyte
            MBI:8,							//Megabit
            MB:1,							//Megabyte
            NI:1.0 * 2.0 * 1024.0 * 1024.0,	//Nibble
            PBI:8/(Math.pow(1024, 3)), 		//Petabit
            PB:1/(Math.pow(1024, 3)), 		//Petabyte
            SIEBI:((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 5),	//SI Exabit
            SIEB:((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 5),	//SI Exabyte
            SIGBI:((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 2),	//SI Gigabit
            SIGB:((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 2),	//SI Gigbyte
            SIKBI:(8 * 1024.0) * (1024 / 1000.0),						//SI Kilobit
            SIKB:(1 * 1024.0) * (1024 / 1000.0),						//SI Kilobyte
            SIMBI:((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 1),	//SI Megabit
            SIMB:((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 1),	//SI Megabyte
            SIPBI:((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 4),	//SI Petabit
            SIPB:((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 4),	//SI Petabyte
            SITBI:((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 3),	//SI Terabit
            SITB:((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 3),	//SI Terabyte
            SIYBI:((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 7),	//SI Yottabit
            SIYB:((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 7),	//SI Yottabyte
            SIZBI:((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 6),	//SI Zettabit
            SIZB:((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 6),	//SI Zettabyte
            TBI:8/(Math.pow(1024, 2)),		//Terabit
            TB:1/(Math.pow(1024, 2)),		//Terabyte
            W:1.0 * 1.0 * 512.0 * 1024.0,	//Word
            YBI:8/(Math.pow(1024, 6)),		//Yottabit
            YB:1/(Math.pow(1024, 6)),		//Yottabyte
            ZBI:8/(Math.pow(1024, 5)),		//Zettabit
            ZB:1/(Math.pow(1024, 5))		//Zettabyte
        };

        /*
         Function to perform all conversions within DataStorage function.
         All "to" functions within DataStorage use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toKilobytes; //Variable "bar" being of type UnitOf.DataStorage with "from" value already assigned
         Ex 2: var foobar = UnitOf.DataStorage.fromMegabytes(1.25).toKilobytes; //One line conversion from 1.25 Megabytes to Kilobytes
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toBits:c(l.B),
            toBlocks:c(l.BL),
            toBluRay_DoubleLayer:c(l.BD2),
            toBluRay_SingleLayer:c(l.BD1),
            toBytes:c(l.BY),
            toCDs_74Minutes:c(l.CD74),
            toCDs_80Minutes:c(l.CD80),
            toDVDs_DoubleSidedDoubleLayer:c(l.D22),
            toDVDs_DoubleSidedSingleLayer:c(l.D12),
            toDVDs_SingleSidedDoubleLayer:c(l.D21),
            toDVDs_SingleSidedSingleLayer:c(l.D11),
            toExabits:c(l.EBI),
            toExabytes:c(l.EB),
            toFloppyDisks_35DD:c(l.F35DD),
            toFloppyDisks_35ED:c(l.F35ED),
            toFloppyDisks_35HD:c(l.F35HD),
            toFloppyDisks_525DD:c(l.F525DD),
            toFloppyDisks_525HD:c(l.F525HD),
            toGigabits:c(l.GBI),
            toGigabytes:c(l.GB),
            toKilobits:c(l.KBI),
            toKilobytes:c(l.KB),
            toMegabits:c(l.MBI),
            toMegabytes:c(l.MB),
            toNibbles:c(l.NI),
            toPetabits:c(l.PBI),
            toPetabytes:c(l.PB),
            toSIUnitExabits:c(l.SIEBI),
            toSIUnitExabytes:c(l.SIEB),
            toSIUnitGigabits:c(l.SIGBI),
            toSIUnitGigabytes:c(l.SIGB),
            toSIUnitKilobits:c(l.SIKBI),
            toSIUnitKilobytes:c(l.SIKB),
            toSIUnitMegabits:c(l.SIMBI),
            toSIUnitMegabytes:c(l.SIMB),
            toSIUnitPetabits:c(l.SIPBI),
            toSIUnitPetabytes:c(l.SIPB),
            toSIUnitTerabits:c(l.SITBI),
            toSIUnitTerabytes:c(l.SITB),
            toSIUnitYottabits:c(l.SIYBI),
            toSIUnitYottabytes:c(l.SIYB),
            toSIUnitZettabits:c(l.SIZBI),
            toSIUnitZettabytes:c(l.SIZB),
            toTerabits:c(l.TBI),
            toTerabytes:c(l.TB),
            toWords:c(l.W),
            toYottabits:c(l.YBI),
            toYottabytes:c(l.YB),
            toZettabits:c(l.ZBI),
            toZettabytes:c(l.ZB)
        }
    }

    /**
     * UnitOf.DataTransferRate
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.DataTransferRate.
     * "from" functions are located at the bottom of this document within "DataTransferRate" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.DataTransferRate.fromMegabytesPerSecond(1.25).toKilobytesPerSecond; //One line conversion from 1.25 MegabytesPerSecond to KilobytesPerSecond
     */
    function DataTransferRateLogic(v,t){

        /*
         DataTransferRate Units

         All unit values are conversions of MBS (Megabyte per Second) at the value of 1 converted into each unit.
         */
        var l = {
            BIS:1.0 * 8.0 * 1024.0 * 1024.0,			//Bit per Second
            BS:1.0 * 1.0 * 1024.0 * 1024.0,				//Byte per Second
            E10:(1.0 * 8.0 * 1024.0 * 1024.0) / (Math.pow(1000,2) * 10.0),		//10 Base-T Ethernet
            E100:(1.0 * 8.0 * 1024.0 * 1024.0) / (Math.pow(1000,2) * 100.0),	//100 Base-T Ethernet
            E1000:(1.0 * 8.0 * 1024.0 * 1024.0) / (Math.pow(1000,2) * 1000.0),	//1000 Base-T Ethernet
            FW400:0.02 * 1.048576,						//FireWire 400
            FW800:0.01 * 1.048576,						//FireWire 800
            FW3200:0.0025 * 1.048576,					//FireWire S1600 and S3200
            GBIS:8/(Math.pow(1024, 1)),					//Gigabit per Second
            GBS:1/(Math.pow(1024, 1)),					//Gigabyte per Second
            ISDND:65.536,								//ISDN (Dual Channel)
            ISDNS:131.072,								//ISDN (Single Channel)
            KBIS:8 * 1024,								//Kilobit per Second
            KBS:1024,									//Kilobyte per Second
            MBIS:8,										//Megabit per Second
            MBS:1,										//Megabyte per Second
            M110:(1/110.0) * (8.0 * 1024.0 * 1024.0),	//110 BPS Modem
            M1200:(1/1200.0) * (8.0 * 1024.0 * 1024.0),	//1200 BPS Modem
            M14K:(1/14400.0) * (8.0 * 1024.0 * 1024.0),	//14.4 KBPS Modem
            M2400:(1/2400.0) * (8.0 * 1024.0 * 1024.0),	//2400 BPS Modem
            M28K:(1/28800.0) * (8.0 * 1024.0 * 1024.0),	//28.8 KBPS Modem
            M300:(1/300.0) * (8.0 * 1024.0 * 1024.0),	//300 BPS Modem
            M33K:(1/33600.0) * (8.0 * 1024.0 * 1024.0),	//33.6 KBPS Modem
            M56K:(1/56000.0) * (8.0 * 1024.0 * 1024.0),	//56 KBPS Modem
            M9600:(1/9600.0) * (8.0 * 1024.0 * 1024.0),	//9600 BPS Modem
            OC1:(1/6.48) * 1.048576,					//OC1
            OC12:(1/(6.48 * 12.0)) * 1.048576,			//OC12
            OC192:(1/(6.48 * 192.0)) * 1.048576,		//OC192
            OC24:(1/(6.48 * 24.0)) * 1.048576,			//OC24
            OC3:(1/(6.48 * 3.0)) * 1.048576,			//OC3
            OC48:(1/(6.48 * 48.0)) * 1.048576,			//OC48
            OC768:(1/(6.48 * 768.0)) * 1.048576,		//OC768
            PBIS:8/(Math.pow(1024, 3)),					//Petabit per Second
            PBS:1/(Math.pow(1024, 3)),					//Petabyte per Second
            SIGBIS:((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 2),		//SI Gigabit per Second
            SIGBS:((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 2),			//SI Gigabyte per Second
            SIKBIS:(8 * 1024.0) * (1024 / 1000.0),								//SI Kilobit per Second
            SIKBS:(1 * 1024.0) * (1024 / 1000.0),								//SI Kilobyte per Second
            SIMBIS:((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 1),		//SI Megabit per Second
            SIMBS:((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 1),			//SI Megabyte per Second
            SIPBIS:((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 4),		//SI Petabit per Second
            SIPBS:((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 4),			//SI Petabyte per Second
            SITBIS:((8 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 3),		//SI Terabit per Second
            SITBS:((1 * 1024.0) * (1024 / 1000.0)) / Math.pow(1000, 3),			//SI Terabyte per Second
            TBIS:8/(Math.pow(1024, 2)),					//Terabit per Second
            TBS:1/(Math.pow(1024, 2)),					//Terabyte per Second
            USB1:(1/1.5) * 1.048576,					//USB 1.X
            USB2:(1/35.0) * 1.048576,					//USB 2.X
            USB3:(1/625.0) * 1.048576,					//USB 3.0
            USB31:(1/1250.0) * 1.048576					//USB 3.1
        };

        /*
         Function to perform all conversions within DataTransferRate function.
         All "to" functions within DataTransferRate use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toKilobytesPerSecond; //Variable "bar" being of type UnitOf.DataTransferRate with "from" value already assigned
         Ex 2: var foobar = UnitOf.DataTransferRate.fromMegabytesPerSecond(1.25).toKilobytesPerSecond; //One line conversion from 1.25 MegabytesPerSecond to KilobytesPerSecond
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toBitsPerSecond:c(l.BIS),
            toBytesPerSecond:c(l.BS),
            toEthernetsBase10:c(l.E10),
            toEthernetsBase100:c(l.E100),
            toEthernetsBase1000:c(l.E1000),
            toFireWires400:c(l.FW400),
            toFireWires800:c(l.FW800),
            toFireWiresS1600_S3200:c(l.FW3200),
            toGigabitsPerSecond:c(l.GBIS),
            toGigabytesPerSecond:c(l.GBS),
            toISDNsDual:c(l.ISDND),
            toISDNsSingle:c(l.ISDNS),
            toKilobitsPerSecond:c(l.KBIS),
            toKilobytesPerSecond:c(l.KBS),
            toMegabitsPerSecond:c(l.MBIS),
            toMegabytesPerSecond:c(l.MBS),
            toModems110b:c(l.M110),
            toModems1200b:c(l.M1200),
            toModems14_4k:c(l.M14K),
            toModems2400b:c(l.M2400),
            toModems28_8k:c(l.M28K),
            toModems300b:c(l.M300),
            toModems33_6k:c(l.M33K),
            toModems56k:c(l.M56K),
            toModems9600b:c(l.M9600),
            toOCs1:c(l.OC1),
            toOCs12:c(l.OC12),
            toOCs192:c(l.OC192),
            toOCs24:c(l.OC24),
            toOCs3:c(l.OC3),
            toOCs48:c(l.OC48),
            toOCs768:c(l.OC768),
            toPetabitsPerSecond:c(l.PBIS),
            toPetabytesPerSecond:c(l.PBS),
            toSIUnitGigabitsPerSecond:c(l.SIGBIS),
            toSIUnitGigabytesPerSecond:c(l.SIGBS),
            toSIUnitKilobitsPerSecond:c(l.SIKBIS),
            toSIUnitKilobytesPerSecond:c(l.SIKBS),
            toSIUnitMegabitsPerSecond:c(l.SIMBIS),
            toSIUnitMegabytesPerSecond:c(l.SIMBS),
            toSIUnitPetabitsPerSecond:c(l.SIPBIS),
            toSIUnitPetabytesPerSecond:c(l.SIPBS),
            toSIUnitTerabitsPerSecond:c(l.SITBIS),
            toSIUnitTerabytesPerSecond:c(l.SITBS),
            toTerabitsPerSecond:c(l.TBIS),
            toTerabytesPerSecond:c(l.TBS),
            toUSBs1_0:c(l.USB1),
            toUSBs2_0:c(l.USB2),
            toUSBs3_0:c(l.USB3),
            toUSBs3_1:c(l.USB31)
        }
    }

    /**
     * UnitOf.DataType - Convert any Java data type and more including converting to and from fractions
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.DataType.
     * "from" functions are located at the bottom of this document within "DataType" of the "UnitOf" Object.
     *
     * Ex 1: var foo1 = new UnitOf.DataType("-12.5").toFloat();         //Returns -12.5 from "-12.5" (String). If the conversion did fail, the .toFloat() default value of 0 is returned.
     * Ex 2: var foo2 = new UnitOf.DataType(12.5).toFraction("3/2");    //Returns "25/2" from 12.5 (float). If the conversion did fail, the .toFraction() passed default value of "3/2" is returned.
     * Ex 3: var bar1 = new UnitOf.DataType("5/2").toFloat();           //Returns 2.5 from "5/2" (String fraction). The string was interpreted as a fraction so it was able to convert it to its decimal form. If the conversion did fail, the .toFloat() default value of 0.0 is returned.
     * Ex 4: var bar2 = new UnitOf.DataType(null).toInt(7);             /Conversion fails, returns 7 as it is the default passed.
     */
    function DataType(v){

        /**
         * returns the value passed in without leading or trailing spaces and in lowercase for many of the private comparisons within UnitOf.DataType
         */
        function lowerTrim(val){
            return val.toLowerCase().trim();
        }

        /**
         * Tries to convert the value passed in the UnitOf.DataType() constructor into an boolean type (true or false).
         * @param defaultValue If conversion into boolean fails or cannot be done, this value is returned.
         */
        function bool(defaultValue){
            var b = lowerTrim(str());
            if(b === 'true'){
                return true;
            } else if(b === 'false'){
                return false;
            }
            defaultValue = defaultValue || '';
            return (lowerTrim(''+defaultValue) === 'true');
        }

        /**
         * Tries to convert the value passed in the UnitOf.DataType() constructor into a number type. (which includes integer and float)
         * @param defaultValue If conversion into number type fails or cannot be done, this value is returned.
         */
        function num(defaultValue){
            return Number(v) || (str() === '0' ? 0 : fToD(defaultValue));
        }

        /**
         * Tries to convert the value passed in the UnitOf.DataType() constructor into a String type.
         * To find whether to convert the constructor value passed or the defaultValue, several conditions are tested upon.
         * typeof "number" in the case of 0, type of "boolean" in case of false, typeof defaultValue for same reasons. If all else fails, return am empty string.
         * @param defaultValue If conversion into String type fails or cannot be done, this value is returned.
         */
        function str(defaultValue){
            var val = v || typeof v === 'number' ? v : typeof v === 'boolean' ? v : defaultValue || typeof defaultValue === 'number' ? defaultValue : typeof defaultValue === 'boolean' ? defaultValue : '';
            return ''+val;
        }

        /**
         * Tries to convert the value passed in the UnitOf.DataType() constructor into a fraction of type String.
         * This simplifies existing fraction Strings or turn numeric values into fraction Strings.
         *
         * Inspired by user Matthew556 post: https://stackoverflow.com/questions/31585931/how-to-convert-decimal-to-fractions
         * Who credits: http://jonisalonen.com/2012/converting-decimal-numbers-to-ratios/
         *
         * @param d If conversion into fraction String type fails or cannot be done, this value is returned.
         */
        function frac(d){
            d = d || '';
            var o = num();
            if(o != 0){
                try{
                    var N = o < 0;
                    var Q = o * (N ? -1 : 1);
                    var max = 1e-10, n1 = 1, n2 = 0, d1 = 0, d2 = 1, b = Q;
                    do {
                        var a = Math.floor(b);
                        var c = n1;
                        n1 = a * n1 + n2;
                        n2 = c;
                        c = d1;
                        d1 = a * d1 + d2;
                        d2 = c;
                        b = 1 / (b - a);
                    } while (Math.abs(Q - n1 / d1) > Q * max);
                    return (N ? "-" : "") + n1 + "/" + d1;
                } catch(e){}
            }
            return d;
        }

        /**
         * Assumes value passed in the UnitOf.Data() constructor is a fraction of type string and tries to convert it into a numeric type (float).
         * Used in num() function if conversion fails.
         * @param d If conversion into numeric type fails or cannot be done, this value is attempted to be converted into a numeric type. If successful it is returned otherwise 0 is returned.
         */
        function fToD(d){
            try{
                if(str().split("/").length == 2){
                    var w = str().replace("(", " ").replace(")", " ");
                    var f = w.split("/");
                    var n = 1,q = parseFloat(f[1]);
                    f[0] = f[0].replace("*", " ");
                    var x = f[0].trim().split(" ");
                    for(var i = 0; i < x.length; i++){
                        if(x[i]){
                            n = n * parseFloat(x[i]);
                        }
                    }
                    return n/q;
                }
            } catch(e){}
            return Number(d) || 0;
        }

        /**
         * Available functions after UnitOf.DataType has been instantiated
         */
        return {
            getValuePassed: v,              //Returns the original value passed in the UnitOf.DataType() constructor
            getTypeConstantPassed:typeof v, //Returns the type of the original value passed in the UnitOf.DataType() constructor

            /**
             * "to" String
             * Tries to convert the value passed in the UnitOf.DataType() constructor into a String type.
             * If this conversion fails the default value (which may be passed in as a parameter) is returned.
             *
             * Ex: var foo = UnitOf.DataType(12.5).toString("Conversion Failed");   //Returns "12.5" from 12.5 (float). If the conversion did fail, the .toString() passed default value of "Conversion Failed" is returned.
             */
            toString:function(defaultValue){
                return str(defaultValue);
            },

            /**
             * "to" Number
             * Tries to convert the value passed in the UnitOf.DataType() constructor into a numeric type (includes integer and float).
             * If this conversion fails the default value (which may be passed in as a parameter) is returned.
             *
             * Ex: var foo = UnitOf.DataType("12.5").toFloat(7.0);   //Returns 12.5 from 12.5 (String). If the conversion did fail, the .toFloat() passed default value of 7.0 is returned.
             */
            toNumber: function(defaultValue) {
                return num(defaultValue);
            },

            /**
             * "to" Boolean (Simple and Complex)
             *
             * Simple
             * Tries to convert the value passed in the UnitOf.DataType() constructor into a boolean type.
             * If this conversion fails the default value (which may be passed in as a parameter) is returned.
             *
             * Ex: var foo = UnitOf.DataType("TrUe").toBoolean();  //Returns true from "TrUe" (String). If the conversion did fail, the .toBoolean() default value of false is returned.
             *
             *
             * Complex
             * Use a collection of values to determine if the UnitOf.DataType variable exists within the collection.
             *
             * Ex 1: var foo1 = UnitOf.DataType("UnitOf").toBoolean(["Unit", "unitof", "ThisIsUnitOf"],true, true);     //Returns true due to "Unit"
             * Ex 2: var bar1 = UnitOf.DataType("UnitOf").toBoolean(["Unit", "unitof", "ThisIsUnitOf"],false, true);    //Returns true: "Unit", "unitof"
             * Ex 3: var foo2 = UnitOf.DataType("UnitOf").toBoolean(["Unit", "unitof", "ThisIsUnitOf"]);                //Returns true. only "unitof"
             * Ex 4: var bar2 = UnitOf.DataType("UnitOf").toBoolean(["Unit", "unitof", "ThisIsUnitOf"],true);           //Returns false, no matches
             */
            toBoolean:function(defaultValue, trueValues, caseSensitive, contains){
                var trueValueShiftOne = defaultValue instanceof Array;                              //boolean here to allow for there to not have to be a default and to allow multiple constructor possibilities if using complex form of toBoolean().
                contains = trueValueShiftOne ? caseSensitive || false : contains || false;
                caseSensitive = trueValueShiftOne ? trueValues || false : caseSensitive || false;
                trueValues = trueValueShiftOne ? defaultValue : trueValues;
                defaultValue = trueValueShiftOne ? false : defaultValue || false;

                if(trueValues instanceof Array){    //Complex use of toBoolean. Use a collection of values to determine if the UnitOf.DataType variable exists within the collection.
                    var val = (caseSensitive) ? str() : lowerTrim(str());
                    for(var i = 0; i < trueValues.length; i++){
                        var t = trueValues[i] || '';
                        t = ''+t;
                        t = (caseSensitive) ? t.trim() : lowerTrim(t);
                        if((contains && val.indexOf(t) > -1) || (!contains && val === t)){
                            return true;
                        }
                    }
                    return false;
                } else {    //Simple use of toBoolean. Tries to convert the value passed in the UnitOf.DataType() constructor into a boolean type. If this conversion fails the default value (which may be passed in as a parameter) is returned.
                    return bool(defaultValue);
                }
            },

            /**
             * "to" Int
             * Tries to convert the value passed in the UnitOf.DataType() constructor into an int type.
             * If this conversion fails the default value (which may be passed in as a parameter) is returned.
             *
             * Ex: var foo = UnitOf.DataType("12.5").toInt(7);  //Returns 12 from 12.5 (String). If the conversion did fail, the .toInt() passed default value of 7.0 is returned.
             */
            toInt:function(defaultValue){
                return parseInt(num(defaultValue));
            },

            /**
             * "to" Float
             * Tries to convert the value passed in the UnitOf.DataType() constructor into a float type.
             * If this conversion fails the default value (which may be passed in as a parameter) is returned.
             *
             * Ex: var foo = UnitOf.DataType("12.5").toFloat(7.0);   //Returns 12.5 from 12.5 (String). If the conversion did fail, the .toFloat() passed default value of 7.0 is returned.
             */
            toFloat:function(defaultValue){
                return parseFloat(num(defaultValue));
            },

            /**
             * "to" Char
             * Tries to convert the value passed in the UnitOf.DataType() constructor into a char type.
             * If this conversion fails the default value (which may be passed in as a parameter) is returned.
             *
             * Ex: var foo = UnitOf.DataType(12.5).toChar('@');   //Returns '1' from 12.5 (double). If the conversion did fail, the .toChar() passed default value of '@' is returned.
             */
            toChar:function(defaultValue){
                return str(defaultValue).charAt(0);
            },

            /**
             * "to" Fraction
             * Tries to convert the value passed in the UnitOf.DataType() constructor into a fraction of type String.
             * This simplifies existing fraction Strings or turn numeric values into fraction Strings.
             *
             * Ex 1: var foo = UnitOf.DataType("2/4").toFraction();     //returns "1/2"
             * Ex 2: var bar = new UnitOf.DataType(.75).toFraction();   //returns "3/4"
             */
            toFraction:function(defaultValue){
                return frac(defaultValue);
            }
        }
    }

    /**
     * UnitOf.ElectricCharge
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.ElectricCharge.
     * "from" functions are located at the bottom of this document within "ElectricCharge" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.ElectricCharge.fromCoulombs(1.25).toAmpereHours; //One line conversion from 1.25 Coulombs to AmpereHours
     */
    function ElectricChargeLogic(v,t){

        /*
         ElectricCharge Units

         All unit values are conversions of MC (Megacoulomb) at the value of 1 converted into each unit.
         */
        var l = {
            ABC:1e5,				//Abcoulomb
            AH:1/0.0036,			//Ampere Hour
            AM:1/0.00006,			//Ampere Minute
            AS:1e6,					//Ampere Second
            C:1e6,					//Coulomb
            EMU:1e5,				//EMU of Charge
            ESU:2.99792457999957e15,//ESU of Charge
            E:1/1.60217646e-25,		//Electron Charge
            F:1e6,					//Farad Volt
            FA12:1/0.0964853103,	//Faraday (Carbon 12)
            FACH:1/0.0964957007,	//Faraday (Chemistry)
            FAPH:1/0.0965219008,	//Faraday (Physics)
            FR:2.99792457999957e15,	//Franklin
            KC:1e3,					//Kilocoulomb
            MC:1,					//Megacoulomb
            MUC:1e12,				//Microcoulomb
            MILC:1e9,				//Millicoulomb
            NC:1e15,				//Nanocoulomb
            PC:1e18,				//Picocoulomb
            STC:2.99792457999957e15	//Statcoulomb
        };

        /*
         Function to perform all conversions within ElectricCharge function.
         All "to" functions within ElectricCharge use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toAmpereHours; //Variable "bar" being of type UnitOf.ElectricCharge with "from" value already assigned
         Ex 2: var foobar = UnitOf.ElectricCharge.fromCoulombs(1.25).toAmpereHours; //One line conversion from 1.25 Coulombs to AmpereHours
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAbcoulombs:c(l.ABC),
            toAmpereHours:c(l.AH),
            toAmpereMinutes:c(l.AM),
            toAmpereSeconds:c(l.AS),
            toCoulombs:c(l.C),
            toEMUsOfCharge:c(l.EMU),
            toESUsOfCharge:c(l.ESU),
            toElectronCharge:c(l.E),
            toFaradVolts:c(l.F),
            toFaradayCarbon12:c(l.FA12),
            toFaradayChemistry:c(l.FACH),
            toFaradayPhysics:c(l.FAPH),
            toFranklins:c(l.FR),
            toKilocoulombs:c(l.KC),
            toMegacoulombs:c(l.MC),
            toMicrocoulombs:c(l.MUC),
            toMillicoulombs:c(l.MILC),
            toNanocoulombs:c(l.NC),
            toPicocoulombs:c(l.PC),
            toStatcoulombs:c(l.STC)
        }
    }

    /**
     * UnitOf.Energy
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Energy.
     * "from" functions are located at the bottom of this document within "Energy" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Energy.fromJoules(1.25).toWattSeconds; //One line conversion from 1.25 Joules to WattSeconds
     */
    function EnergyLogic(v,t){

        /*
         Energy/Work Units

         All unit values are conversions of J (Joule) at the value of 1 converted into each unit.
         */
        var l = {
            AJ:1e18,					//Attojoule
            BTU:1/1055.05585262,		//British Thermal Unit
            BTUTH:1/1054.349999974,		//Thermochemical British Thermal Unit
            BOE:1/61178632e2,			//Barrel of Oil Equivalent
            CALIT:1/4.1868,				//Calorie (International Steam)
            CALN:1/4186.8,				//Calorie (Nutritional)
            CALTH:1/4.184,				//Calorie (Thermochemical)
            DYNCM:1/1e-7,				//Dyne Centimeter
            EV:1/1.60217733e-19,		//Electron Volt
            ERG:1e7,					//Erg
            FTLBF:0.737562149,			//Foot Pound
            GJ:1e-9,					//Gigajoule
            GT:1/4.184e18,				//Gigaton of TNT
            GWH:1/36e11,				//Gigawatt Hour
            GFCM:10197.16213009,		//Gram Force Centimeter
            GFM:101.9716213009,			//Gram Force Meter
            H:1/4.3597482e-18,			//Hartree Energy
            HPH:1/2684519.537696172792,	//Horsepower Hour
            HPHM:1/2647795.5,			//Horsepower Hour (Metric)
            INOZF:141.611932666,		//Inch Ounce
            INLBF:8.850745792,			//Inch Pound
            J:1,						//Joule
            KCALIT:1/4186.8,			//Kilocalorie (International Steam)
            KCALTH:1/4184.0,			//Kilocalorie (Thermochemical)
            KEV:1/1.60217733e-16,		//Kiloelectron Volt
            KGFCM:10.19716213009,		//Kilogram Force Centimeter
            KGFM:0.1019716213009,		//Kilogram Force Meter
            KGT:1/4184e3,				//Kilogram of TNT
            KJ:1e-3,					//Kilojoule
            KPM:0.1019716213009,		//Kilopond Meter
            KT:1/4.184e12,				//Kiloton of TNT
            KWH:1/36e5,					//Kilowatt Hour
            KWS:1e-3,					//Kilowatt Second
            LA:1/101.325,				//Liter Atmosphere
            MBTU:1/1055055852.62,		//Mega British Thermal Unit
            MEV:1/1.60217733e-13,		//Megaelectron Volt
            MJ:1e-6,					//Megajoule
            MT:1/4.184e15,				//Megaton of TNT
            MWH:1/36e8,					//Megawatt Hour
            MUJ:1e6,					//Microjoule
            MILJ:1e3,					//Millijoule
            NJ:1e9,						//Nanojoule
            NM:1,						//Newton Meter
            EP:1/19561e5,				//Planck Energy
            PDLFT:1/0.04214011,			//Poundal Foot
            RY:1/2.179872e-18,			//Rydberg
            THMEC:1/105505600.0,		//Therm (EC)
            THMUS:1/105480400.0,		//Therm (US)
            TT:1/4184e6,				//Ton of TNT
            WH:1/36e2,					//Watt Hour
            WS:1						//Watt Second
        };

        /*
         Function to perform all conversions within Energy function.
         All "to" functions within Energy use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toWattSeconds; //Variable "bar" being of type UnitOf.Energy with "from" value already assigned
         Ex 2: var foobar = UnitOf.Energy.fromJoules(1.25).toWattSeconds; //One line conversion from 1.25 Joules to WattSeconds
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAttojoules:c(l.AJ),
            toBTUsInternationalStandard:c(l.BTU),
            toBTUsThermochemical:c(l.BTUTH),
            toBarrelsOfOilEquivalent:c(l.BOE),
            toCaloriesInternationalSteam:c(l.CALIT),
            toCaloriesNutritional:c(l.CALN),
            toCaloriesThermochemical:c(l.CALTH),
            toDyneCentimeters:c(l.DYNCM),
            toElectronVolts:c(l.EV),
            toErgs:c(l.ERG),
            toFootPounds:c(l.FTLBF),
            toGigajoules:c(l.GJ),
            toGigatonsOfTNT:c(l.GT),
            toGigawattHours:c(l.GWH),
            toGramForceCentimeters:c(l.GFCM),
            toGramForceMeters:c(l.GFM),
            toHartrees:c(l.H),
            toHorsepowerHours:c(l.HPH),
            toHorsepowerHoursMetric:c(l.HPHM),
            toInchOunces:c(l.INOZF),
            toInchPounds:c(l.INLBF),
            toJoules:c(l.J),
            toKilocaloriesInternationalSteam:c(l.KCALIT),
            toKilocaloriesThermochemical:c(l.KCALTH),
            toKiloelectronVolts:c(l.KEV),
            toKilogramForceCentimeters:c(l.KGFCM),
            toKilogramForceMeters:c(l.KGFM),
            toKilogramsOfTNT:c(l.KGT),
            toKilojoules:c(l.KJ),
            toKilopondMeters:c(l.KPM),
            toKilotonsOfTNT:c(l.KT),
            toKilowattHours:c(l.KWH),
            toKilowattSeconds:c(l.KWS),
            toLiterAtmospheres:c(l.LA),
            toMegaBTUsInternationalStandard:c(l.MBTU),
            toMegaelectronVolts:c(l.MEV),
            toMegajoules:c(l.MJ),
            toMegatonsOfTNT:c(l.MT),
            toMegawattHours:c(l.MWH),
            toMicrojoules:c(l.MUJ),
            toMillijoules:c(l.MILJ),
            toNanojoules:c(l.NJ),
            toNewtonMeters:c(l.NM),
            toPlanckEnergy:c(l.EP),
            toPoundalFeet:c(l.PDLFT),
            toRydbergs:c(l.RY),
            toThermsEC:c(l.THMEC),
            toThermsUS:c(l.THMUS),
            toTonsOfTNT:c(l.TT),
            toWattHours:c(l.WH),
            toWattSeconds:c(l.WS)
        }
    }

    /**
     * UnitOf.Force
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Force.
     * "from" functions are located at the bottom of this document within "Force" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Force.fromNewtons(1.25).toPoundForces; //One line conversion from 1.25 Newtons to PoundForces
     */
    function ForceLogic(v,t){

        /*
         Force Units

         All unit values are conversions of N (Newton) at the value of 1 converted into each unit.
         */
        var l = {
            AUF:12137804.11081,			//Atomic Unit of Force
            AN:1e18,					//Attonewton
            CN:1e2,						//Centinewton
            DN:1e1,						//Decinewton
            DAN:1e-1,					//Dekanewton
            DYN:1e5,					//Dyne
            EN:1e-18,					//Exanewton
            FN:1e15,					//Femtonewton
            GN:1e-9,					//Giganewton
            GF:1/9.80665e-3,			//Gram Force
            GFF:1/9.80665,				//Grave Force
            HN:1e-2,					//Hectonewton
            JCM:1e2,					//Joule per Centimeter
            JM:1,						//Joule per Meter
            KGF:1/9.80665,				//Kilogram force
            KN:1e-3,					//Kilonewton
            KP:1/9.80665,				//Kilopond
            KIP:1/4448.221615255,		//Kilopound Force
            LTF:1/9964.01641818352,		//Long Ton Force
            MN:1e-6,					//Meganewton
            TFM:1/9806.65,				//Ton Force (Metric)
            MUN:1e6,					//Micronewton
            MGF:1/9.80665e-3,			//Milligrave Force
            MILN:1e3,					//Millinewton
            NN:1e9,						//Nanonewton
            N:1,						//Newton
            OZF:1/0.27801385095378125,	//Ounce Force
            PEN:1e-15,					//Petanewton
            PN:1e12,					//Piconewton
            P:1/9.80665e-3,				//Pond
            LBFT:1/0.138254954376,		//Pound Foot per Second Squared
            LBF:1/4.4482216152605,		//Pound Force
            PDL:1/0.138254954376,		//Poundal
            TFS:1/8896.443230521,		//Ton Force (Short)
            SN:1/1e3,					//Sthene
            TN:1e-12					//Teranewton
        };

        /*
         Function to perform all conversions within Force function.
         All "to" functions within Force use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toPoundForces; //Variable "bar" being of type UnitOf.Force with "from" value already assigned
         Ex 2: var foobar = UnitOf.Force.fromNewtons(1.25).toPoundForces; //One line conversion from 1.25 Newtons to PoundForces
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAtomicUnitsOfForce:c(l.AUF),
            toAttonewtons:c(l.AN),
            toCentinewtons:c(l.CN),
            toDecinewtons:c(l.DN),
            toDekanewtons:c(l.DAN),
            toDynes:c(l.DYN),
            toExanewtons:c(l.EN),
            toFemtonewtons:c(l.FN),
            toGiganewtons:c(l.GN),
            toGramForces:c(l.GF),
            toGraveForces:c(l.GFF),
            toHectonewtons:c(l.HN),
            toJouleCentimeters:c(l.JCM),
            toJouleMeters:c(l.JM),
            toKilogramForces:c(l.KGF),
            toKilonewtons:c(l.KN),
            toKiloponds:c(l.KP),
            toKilopoundForces:c(l.KIP),
            toLongTonForces:c(l.LTF),
            toMeganewtons:c(l.MN),
            toMetricTonForces:c(l.TFM),
            toMicronewtons:c(l.MUN),
            toMilligraveForces:c(l.MGF),
            toMillinewtons:c(l.MILN),
            toNanonewtons:c(l.NN),
            toNewtons:c(l.N),
            toOunceForces:c(l.OZF),
            toPetanewtons:c(l.PEN),
            toPiconewtons:c(l.PN),
            toPonds:c(l.P),
            toPoundFeetPerSecondSquared:c(l.LBFT),
            toPoundForces:c(l.LBF),
            toPoundals:c(l.PDL),
            toShortTonForces:c(l.TFS),
            toSthenes:c(l.SN),
            toTeranewtons:c(l.TN)
        }
    }

    /**
     * UnitOf.Frequency
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Frequency.
     * "from" functions are located at the bottom of this document within "Frequency" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Frequency.fromHertz(1.25).toCyclesPerSecond; //One line conversion from 1.25 Hertz to CyclesPerSecond
     */
    function FrequencyLogic(v,t){

        /*
         Frequency Units

         All unit values are conversions of MHZ (Megahertz) at the value of 1 converted into each unit.
         */
        var l = {
            AHZ:1e24,	//Attohertz
            CHZ:1e8,	//Centihertz
            CS:1e6,		//Cycle per Second
            DHZ:1e7,	//Decihertz
            DAHZ:1e5,	//Dekahertz
            EHZ:1e-12,	//Exahertz
            FHZ:1e21,	//Femtohertz
            GHZ:1e-3,	//Gigahertz
            HHZ:1e4,	//Hectohertz
            HZ:1e6,		//Hertz
            KHZ:1e3,	//Kilohertz
            MHZ:1,		//Megahertz
            MUHZ:1e12,	//Microhertz
            MIHZ:1e9,	//Millihertz
            NHZ:1e15,	//Nanohertz
            PEHZ:1e-9,	//Petahertz
            PHZ:1e18,	//Picohertz
            RD:864e8,	//Revolution per Day
            RH:36e8,	//Revolution per Hour
            RM:6e7,		//Revolution per Minute
            RS:1e6,		//Revolution per Second
            THZ:1e-6	//Terahertz
        };

        /*
         Function to perform all conversions within Frequency function.
         All "to" functions within Frequency use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toCyclesPerSecond; //Variable "bar" being of type UnitOf.Frequency with "from" value already assigned
         Ex 2: var foobar = UnitOf.Frequency.fromHertz(1.25).toCyclesPerSecond; //One line conversion from 1.25 Hertz to CyclesPerSecond
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAttohertz:c(l.AHZ),
            toCentihertz:c(l.CHZ),
            toCyclesPerSecond:c(l.CS),
            toDecihertz:c(l.DHZ),
            toDekahertz:c(l.DAHZ),
            toExahertz:c(l.EHZ),
            toFemtohertz:c(l.FHZ),
            toGigahertz:c(l.GHZ),
            toHectohertz:c(l.HHZ),
            toHertz:c(l.HZ),
            toKilohertz:c(l.KHZ),
            toMegahertz:c(l.MHZ),
            toMicrohertz:c(l.MUHZ),
            toMillihertz:c(l.MIHZ),
            toNanohertz:c(l.NHZ),
            toPetahertz:c(l.PEHZ),
            toPicohertz:c(l.PHZ),
            toRevolutionsPerDay:c(l.RD),
            toRevolutionsPerHour:c(l.RH),
            toRevolutionsPerMinute:c(l.RM),
            toRevolutionsPerSecond:c(l.RS),
            toTerahertz:c(l.THZ)
        }
    }

    /**
     * UnitOf.FuelEconomy
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.FuelEconomy.
     * "from" functions are located at the bottom of this document within "FuelEconomy" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.FuelEconomy.fromMetersPerCubicMeter(1.25).toMetersPerLiter; //One line conversion from 1.25 MetersPerCubicMeter to MetersPerLiter
     */
    function FuelEconomyLogic(v,t){

        /*
         FuelEconomy Units

         All unit values are conversions of MCM (Meter per Cubic Centimeter) at the value of 1 converted into each unit.
         */
        var l = {
            CML:1e5,				//Centimeter per Liter
            DAML:1e2,				//Dekameter per Liter
            EML:1e-15,				//Exameter per Liter
            GML:1e-6,				//Gigameter per Liter
            HML:1e1,				//Hectometer per Liter
            KMGALUK:4.546099293921,	//Kilometer per Gallon (UK)
            KMGALUS:3.7854117834,	//Kilometer per Gallon (US)
            KML:1,					//Kilometer per Liter
            MML:1e-3,				//Megameter per Liter
            MCM:1,					//Meter per Cubic Centimeter
            MFT:28316.84659319,		//Meter per Cubic Foot
            MIN:16.38706400127,		//Meter per Cubic Inch
            MM:1e6,					//Meter per Cubic Meter
            MYD:764554.8581679,		//Meter per Cubic Yard
            MCUPUK:284.1312059185,	//Meter per Cup (UK)
            MCUPUS:236.5882364849,	//Meter per Cup (US)
            MFOZUK:28.41312059185,	//Meter per Fluid Ounce (UK)
            MFOZUS:29.57352956411,	//Meter per Fluid Ounce (US)
            MGALUK:4546.099293921,	//Meter per Gallon (UK)
            MGALUS:3785.4117834,	//Meter per Gallon (US)
            ML:1e3,					//Meter per Liter
            MPTUK:568.2624116755,	//Meter per Pint (UK)
            MPTUS:473.1764729698,	//Meter per Pint (US)
            MQTUK:1136.524822963,	//Meter per Quart (UK)
            MQTUS:946.3529463874,	//Meter per Quart (US)
            MIGALUK:2.824809362797,	//Mile per Gallon (UK)
            MIGALUS:2.352145832948,	//Mile per Gallon (US)
            MIL:1/1.609344,			//Mile per Liter (US)
            NMIGAL:1/0.4895755247,	//Nautical Mile per Gallon (US)
            NMIL:1/1.85324496,		//Nautical Mile per Liter
            PML:1e-12,				//Petameter per Liter
            TML:1e-9				//Terameter per Liter
        };

        /*
         Function to perform all conversions within FuelEconomy function.
         All "to" functions within FuelEconomy use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toMetersPerLiter; //Variable "bar" being of type UnitOf.FuelEconomy with "from" value already assigned
         Ex 2: var foobar = UnitOf.FuelEconomy.fromMetersPerCubicMeter(1.25).toMetersPerLiter; //One line conversion from 1.25 MetersPerCubicMeter to MetersPerLiter
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toCentimetersPerLiter:c(l.CML),
            toDekametersPerLiter:c(l.DAML),
            toExametersPerLiter:c(l.EML),
            toGigametersPerLiter:c(l.GML),
            toHectometersPerLiter:c(l.HML),
            toKilometersPerGallonUK:c(l.KMGALUK),
            toKilometersPerGallonUS:c(l.KMGALUS),
            toKilometersPerLiter:c(l.KML),
            toMegametersPerLiter:c(l.MML),
            toMetersPerCubicCentimeter:c(l.MCM),
            toMetersPerCubicFoot:c(l.MFT),
            toMetersPerCubicInch:c(l.MIN),
            toMetersPerCubicMeter:c(l.MM),
            toMetersPerCubicYard:c(l.MYD),
            toMetersPerCupUK:c(l.MCUPUK),
            toMetersPerCupUS:c(l.MCUPUS),
            toMetersPerFluidOunceUK:c(l.MFOZUK),
            toMetersPerFluidOunceUS:c(l.MFOZUS),
            toMetersPerGallonUK:c(l.MGALUK),
            toMetersPerGallonUS:c(l.MGALUS),
            toMetersPerLiter:c(l.ML),
            toMetersPerPintUK:c(l.MPTUK),
            toMetersPerPintUS:c(l.MPTUS),
            toMetersPerQuartUK:c(l.MQTUK),
            toMetersPerQuartUS:c(l.MQTUS),
            toMilesPerGallonUK:c(l.MIGALUK),
            toMilesPerGallonUS:c(l.MIGALUS),
            toMilesPerLiterUS:c(l.MIL),
            toNauticalMilesPerGallonUS:c(l.NMIGAL),
            toNauticalMilesPerLiter:c(l.NMIL),
            toPetametersPerLiter:c(l.PML),
            toTerametersPerLiter:c(l.TML)
        }
    }

    /**
     * UnitOf.Length
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Length.
     * "from" functions are located at the bottom of this document within "Length" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Length.fromMeters(1.25).toFeet; //One line conversion from 1.25 Meters to Feet
     */
    function LengthLogic(v,t){

        /*
         Length Units

         All unit values are conversions of M (Meter) at the value of 1 converted into each unit.
         */
        var l = {
            A:1e10,						//Angstrom
            AM:1e18,					//Attometer
            BC:1/(0.2286/27.0),			//Barleycorn
            CBLIMP:1/185.3184,			//Cable Length (Imperial)
            CBLIN:1/185.2,				//Cable Length (International)
            CBLUS:1/219.456,			//Cable Length (US)
            CL:1/0.000254,				//Caliber
            CIN:1/0.000254,				//Centiinch
            CM:1e2,						//Centimeter
            CH:1/20.1168,				//Chain
            CU:1/0.4572,				//Cubit
            DM:1e1,						//Decimeter
            DAM:1e-1,					//Dekameter
            ELL:1/1.143,				//Ell
            EM:1e-18,					//Exameter
            FTM:1/1.8288,				//Fathom
            FT:1/0.3048,				//Foot
            FM:1e15,					//Femtometer
            FING:1/0.1143,				//Finger
            FUR:1/201.168,				//Furlong
            GM:1e-9,					//Gigameter
            HAND:1/0.1016,				//Hand
            HM:1e-2,					//Hectometer
            IN:1/0.0254,				//Inch
            KM:1e-3,					//Kilometer
            KYD:1/914.4,				//Kiloyard
            LEA:1/4828.032,				//League
            LY:1/9.46073047258e15,		//Lightyear
            LNK:1/0.201168,				//Link
            MM:1e-6,					//Megameter
            M:1,						//Meter
            MUIN:1/(0.0000254/1000.0),	//Microinch
            MUM:1e6,					//Micrometer
            MURM:1e6,					//Micron
            MI:1/1609.344,				//Mile
            MILM:1e3,					//Millimeter
            NAIL:1/0.05715,				//Nail
            NM:1e9,						//Nanometer
            NLEAIN:1/5556.0,			//Nautical League (International)
            NLEAUK:1/5559.552,			//Nautical League (UK)
            NMIINT:1/1852.0,			//Nautical Mile (International)
            NMIUK:1/1853.184,			//Nautical Mile (UK)
            NMIUS:1/1853.248,			//Nautical Mile (US)
            PER:1/5.0292,				//Perch
            PEM:1e-15,					//Petameter
            PM:1e12,					//Picometer
            POL:1/5.0292,				//Pole
            RD:1/5.0292,				//Rod
            ROPE:1/6.096,				//Rope
            SPAN:1/0.2286,				//Span
            TM:1e-12,					//Terameter
            TIN:1/0.0000254,			//Thousandth of Inch
            YD:1/0.9144					//Yard
        };

        /*
         Function to perform all conversions within Length function.
         All "to" functions within Length use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toFeet; //Variable "bar" being of type UnitOf.Length with "from" value already assigned
         Ex 2: var foobar = UnitOf.Length.fromMeters(1.25).toFeet; //One line conversion from 1.25 Meters to Feet
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAngstroms:c(l.A),
            toAttometers:c(l.AM),
            toBarleycorns:c(l.BC),
            toCablesImperial:c(l.CBLIMP),
            toCablesInternational:c(l.CBLIN),
            toCablesUSCustomary:c(l.CBLUS),
            toCaliber:c(l.CL),
            toCentiinches:c(l.CIN),
            toCentimeters:c(l.CM),
            toChains:c(l.CH),
            toCubits:c(l.CU),
            toDecimeters:c(l.DM),
            toDekameters:c(l.DAM),
            toElls:c(l.ELL),
            toExameters:c(l.EM),
            toFathoms:c(l.FTM),
            toFeet:c(l.FT),
            toFemtometers:c(l.FM),
            toFingers:c(l.FING),
            toFurlongs:c(l.FUR),
            toGigameters:c(l.GM),
            toHands:c(l.HAND),
            toHectometers:c(l.HM),
            toInches:c(l.IN),
            toKilometers:c(l.KM),
            toKiloyards:c(l.KYD),
            toLeagues:c(l.LEA),
            toLightYears:c(l.LY),
            toLinks:c(l.LNK),
            toMegameters:c(l.MM),
            toMeters:c(l.M),
            toMicroinches:c(l.MUIN),
            toMicrometers:c(l.MUM),
            toMicrons:c(l.MURM),
            toMiles:c(l.MI),
            toMillimeters:c(l.MILM),
            toNails:c(l.NAIL),
            toNanometers:c(l.NM),
            toNauticalLeaguesInternational:c(l.NLEAIN),
            toNauticalLeaguesUK:c(l.NLEAUK),
            toNauticalMilesInternational:c(l.NMIINT),
            toNauticalMilesUK:c(l.NMIUK),
            toNauticalMilesUSCustomary:c(l.NMIUS),
            toPerches:c(l.PER),
            toPetameters:c(l.PEM),
            toPicometers:c(l.PM),
            toPoles:c(l.POL),
            toRods:c(l.RD),
            toRopes:c(l.ROPE),
            toSpans:c(l.SPAN),
            toTerameters:c(l.TM),
            toThousandthInches:c(l.TIN),
            toYards:c(l.YD)
        }
    }

    /**
     * UnitOf.Mass
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Mass.
     * "from" functions are located at the bottom of this document within "Mass" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Mass.fromGrams(1.25).toPounds; //One line conversion from 1.25 Grams to Pounds
     */
    function MassLogic(v,t){

        /*
         Mass Units

         All unit values are conversions of G (Gram) at the value of 1 converted into each unit.
         */
        var l = {
            AG:1e18,				//Attogram
            CT:5,					//Carat
            CG:1e2,					//Centigram
            CWT:1e-5,				//Centner
            DG:1e1,					//Decigram
            DAG:1e-1,				//Dekagram
            EG:1e-18,				//Exagram
            FG:1e15,				//Femtogram
            GAMM:1e6,				//Gamma
            GG:1e-9,				//Gigagram
            G:1,					//Gram
            HG:1e-2,				//Hectogram
            KG:1e-3,				//Kilogram
            KIP:1/453592.37,		//Kilopound
            TK:1e-9,				//Kilotons (Metric)
            MG:1e-6,				//Megagram
            MUG:1e6,				//Microgram
            MILG:1e3,				//Milligram
            NG:1e9,					//Nanogram
            MOZ:4e-2,				//Ounce (Metric)
            USOZ:1/28.349523125,	//Ounce (US)
            PEG:1e-15,				//Petagram
            PG:1e12,				//Picogram
            LB:1/453.592,			//Pound
            QU:1e-5,				//Quintal (Metric)
            SLUG:1/14593.9029372,	//Slug
            STUK:1/6350.29318,		//Stone (UK)
            STUS:1/5669.904625,		//Stone (US)
            TG:1e-12,				//Teragram
            TI:1/1016000.0,			//Ton (Imperial)
            TM:1e-6,				//Tons (Metric)
            TUS:1/907185.0			//Ton (US)
        };

        /*
         Function to perform all conversions within Mass function.
         All "to" functions within Mass use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toPounds; //Variable "bar" being of type UnitOf.Mass with "from" value already assigned
         Ex 2: var foobar = UnitOf.Mass.fromGrams(1.25).toPounds; //One line conversion from 1.25 Grams to Pounds
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAttograms:c(l.AG),
            toCarats:c(l.CT),
            toCentigrams:c(l.CG),
            toCentners:c(l.CWT),
            toDecigrams:c(l.DG),
            toDekagrams:c(l.DAG),
            toExagrams:c(l.EG),
            toFemtograms:c(l.FG),
            toGamma:c(l.GAMM),
            toGigagrams:c(l.GG),
            toGrams:c(l.G),
            toHectograms:c(l.HG),
            toKilograms:c(l.KG),
            toKilopounds:c(l.KIP),
            toKilotonsMetric:c(l.TK),
            toMegagrams:c(l.MG),
            toMicrograms:c(l.MUG),
            toMilligrams:c(l.MILG),
            toNanograms:c(l.NG),
            toOuncesMetric:c(l.MOZ),
            toOuncesUS:c(l.USOZ),
            toPetagrams:c(l.PEG),
            toPicograms:c(l.PG),
            toPounds:c(l.LB),
            toQuintals:c(l.QU),
            toSlugs:c(l.SLUG),
            toStonesUK:c(l.STUK),
            toStonesUS:c(l.STUS),
            toTeragrams:c(l.TG),
            toTonsImperial:c(l.TI),
            toTonsMetric:c(l.TM),
            toTonsUS:c(l.TUS)
        }
    }

    /**
     * UnitOf.MetricPrefix
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.MetricPrefix.
     * "from" functions are located at the bottom of this document within "MetricPrefix" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.MetricPrefix.fromKilo(1.25).toGiga; //One line conversion from 1.25 Kilo to Giga
     */
    function MetricPrefixLogic(v,t){

        /*
         MetricPrefix Units

         All unit values are conversions of each unit at the value of 1 converted into NN (No Prefix).
         */
        var l = {
            A:1e-18,	//Atto
            C:1e-2,		//Centi
            D:1e-1,		//Deci
            DA:1e1,		//Deka
            E:1e18,		//Exa
            F:1e-15,	//Femto
            G:1e9,		//Giga
            H:1e2,		//Hecto
            K:1e3,		//Kilo
            M:1e6,		//Mega
            MU:1e-6,	//Micro
            MIL:1e-3,	//Milli
            N:1e-9,		//Nano
            NN:1e0,		//No Prefix
            PE:1e15,	//Peta
            P:1e-12,	//Pico
            T:1e12,		//Tera
            YO:1e-24,	//Yocto
            Y:1e24,		//Yotta
            ZO:1e-21,	//Zepto
            Z:1e21		//Zetta
        };

        /*
         Function to perform all conversions within MetricPrefix function.
         All "to" functions within MetricPrefix use this function.
         */
        function c(z){
            return k(v,z,l[t],false);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toGiga; //Variable "bar" being of type UnitOf.MetricPrefix with "from" value already assigned
         Ex 2: var foobar = UnitOf.MetricPrefix.fromKilo(1.25).toGiga; //One line conversion from 1.25 Kilo to Giga
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAtto:c(l.A),
            toCenti:c(l.C),
            toDeci:c(l.D),
            toDeka:c(l.DA),
            toExa:c(l.E),
            toFemto:c(l.F),
            toGiga:c(l.G),
            toHecto:c(l.H),
            toKilo:c(l.K),
            toMega:c(l.M),
            toMicro:c(l.MU),
            toMilli:c(l.MIL),
            toNano:c(l.N),
            toNoPrefix:c(l.NN),
            toPeta:c(l.PE),
            toPico:c(l.P),
            toTera:c(l.T),
            toYocto:c(l.YO),
            toYotta:c(l.Y),
            toZepto:c(l.ZO),
            toZetta:c(l.Z)
        }
    }

    /**
     * UnitOf.NumericBase
     *
     * Ex:
     *  var hexToBinary = "";
     *  try{
     *      hexToBinary = new UnitOf.NumericBase.fromHexadecimal("ADa3").toBinary; //Returns 1010110110100011
     *  } catch(e){
     *      //Handle exception: all NumericBase conversion "To" are throwable. For many conversions, strings with letter have to be passed in but do not always apply to every numeric base
     *  }
     */
    function NumericBaseLogic(v,t){

        /*
         NumericBase Units
         */
        var l = {
            B11:11,	//Base 11
            B12:12,	//Base 12
            B13:13,	//Base 13
            B14:14,	//Base 14
            B15:15,	//Base 15
            B17:17,	//Base 17
            B18:18,	//Base 18
            B19:19,	//Base 19
            B20:20,	//Base 20
            B21:21,	//Base 21
            B22:22,	//Base 22
            B23:23,	//Base 23
            B24:24,	//Base 24
            B25:25,	//Base 25
            B26:26,	//Base 26
            B27:27,	//Base 27
            B28:28,	//Base 28
            B29:29,	//Base 29
            B3:3,	//Base 3
            B30:30,	//Base 30
            B31:31,	//Base 31
            B32:32,	//Base 32
            B33:33,	//Base 33
            B34:34,	//Base 34
            B35:35,	//Base 35
            B36:36,	//Base 36
            B4:4,	//Base 4
            B5:5,	//Base 5
            B6:6,	//Base 5
            B7:7,	//Base 6
            B9:9,	//Base 9
            B2:2,	//Base 2 / Binary
            B10:10,	//Base 10 / Decimal
            B16:16,	//Base 16 / Hex
            B8:8	//Base 8 / Octal
        };

        /*
        Function to perform all conversions within NumericBase.
        All conversions convert user passed base and value into decimal (Base 10) then from decimal to desired base.
         */
        function c(z) {
            v = ''+v;
            return decimalToAnyBase(anyBaseToDecimal(v, l[t]), z);
        }

        /*
        Takes decimal (Base 10) value and converts it into desired base
         */
        function decimalToAnyBase(v, base) {
            var bi = bigInt((v.indexOf('-') === 0) ? (v.substring(1)).toUpperCase().trim() : v.toUpperCase().trim());
            var r;
            var s = '';
            var bt = bigInt('' + base);

            while (bi.toString() !== '0') {
                r = bi.mod(bt);
                s = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'.charAt(r.value) + s;
                bi = bi.divide(bt);
            }
            s = (v.indexOf('-') === 0) ? '-' + s : s;
            return s;
        }

        /*
        Takes any base passed in and converts the value into decimal (Base 10)
         */
        function anyBaseToDecimal(v, base) {
            var nn = (v.indexOf('-') === 0) ? (v.substring(1)).toUpperCase().trim() : v.toUpperCase().trim();
            var bb = bigInt(base);

            var z = bigInt(0);
            for (var i = 0; i < nn.length; i++) {
                z = z.multiply(bb);
                var inv = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'.indexOf(nn.charAt(i));
                if (inv + 1 > base || inv < 0) {
                    throw 'Base ' + base + ' does not support ' + v;
                }
                z = z.add(bigInt(inv));
            }
            return (v.indexOf('-') === 0) ? '-' + z.toString() : z.toString();
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toBinary; //Variable "bar" being of type UnitOf.NumericBase with "from" value already assigned
         Ex 2: var foobar = UnitOf.NumericBase.fromHexadecimal("ADa3").toBinary; //One line conversion from 1.25 Hexadecimal to Binary
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toBase11:c(l.B11),
            toBase12:c(l.B12),
            toBase13:c(l.B13),
            toBase14:c(l.B14),
            toBase15:c(l.B15),
            toBase17:c(l.B17),
            toBase18:c(l.B18),
            toBase19:c(l.B19),
            toBase20:c(l.B20),
            toBase21:c(l.B21),
            toBase22:c(l.B22),
            toBase23:c(l.B23),
            toBase24:c(l.B24),
            toBase25:c(l.B25),
            toBase26:c(l.B26),
            toBase27:c(l.B27),
            toBase28:c(l.B28),
            toBase29:c(l.B29),
            toBase3:c(l.B3),
            toBase30:c(l.B30),
            toBase31:c(l.B31),
            toBase32:c(l.B32),
            toBase33:c(l.B33),
            toBase34:c(l.B34),
            toBase35:c(l.B35),
            toBase36:c(l.B36),
            toBase4:c(l.B4),
            toBase5:c(l.B5),
            toBase6:c(l.B6),
            toBase7:c(l.B7),
            toBase9:c(l.B9),
            toBinary:c(l.B2),
            toDecimal:c(l.B10),
            toHexadecimal:c(l.B16),
            toOctal:c(l.B8)
        }
    }

    /**
     * UnitOf.Pressure
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Pressure.
     * "from" functions are located at the bottom of this document within "Pressure" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Pressure.fromPascals(1.25).toKSI; //One line conversion from 1.25 Pascals to KSI
     */
    function PressureLogic(v,t){

        /*
         Pressure Units

         All unit values are conversions of PA (Pascal) at the value of 1 converted into each unit.
         */
        var l = {
            APA:1e18,				//Attopascal
            BAR:1e-5,				//Bar
            BA:1e1,					//Barye
            CMHG:1/1333.22,			//Centimeter Mercury (0C)
            CMW4:1/98.0638,			//Centimeter Water (4C)
            CPA:1e2,				//Centipascal
            DBAR:1e-4,				//Decibar
            DPA:1e1,				//Decipascal
            DAPA:1e-1,				//Dekapascal
            DYNCM:1e1,				//Dyne per Square Centimeter
            EPA:1e-18,				//Exapascal
            FSW:1/3064.30593138,	//Foot Sea Water (15ะก)
            FTW4:1/2988.98,			//Foot Water (4C)
            FTW60:1/2986.116,		//Foot Water (60F)
            FPA:1e15,				//Femtopascal
            GPA:1e-9,				//Gigapascal
            GFCM:1/98.0665,			//Gram Force per Square Centimeter
            HPA:1e-2,				//Hectopascal
            INHG32:1/3386.38,		//Inch Mercury (32F)
            INHG60:1/3376.85,		//Inch Mercury (60F)
            INW4:1/249.082,			//Inch Water (4C)
            INW60:1/248.843,		//Inch Water (60F)
            KSI:1/6894757.293178,	//KSI
            KGFCM:1/98066.5,		//Kilogram Force per Square Centimeter
            KGFM:1/9.80665,			//Kilogram Force per Square Meter
            KFGMM:1/9806650.0,		//Kilogram Force per Square Millimeter
            KNM:1e-3,				//Kilonewton per Square Meter
            KPA:1e-3,				//Kilopascal
            KIPFIN:1/6894757.293178,//Kip Force per Square Inch
            TFFTL:1/107251.780116,	//Ton Force per Square Foot (Long)
            TFINL:1/15444256.3367,	//Ton Force per Square Inch (Long)
            MPA:1e-6,				//Megapascal
            MSW:1e-4,				//Meter Sea Water
            MW4:1/9806.38,			//Meter Water (4C)
            MUBAR:1e1,				//Microbar
            MUPA:1e6,				//Micropascal
            MILBAR:1e-2,			//Millibar
            MMHG:1/133.322,			//Millimeter Mercury (0C)
            MMW4:1/9.80638,			//Millimeter Water (4C)
            MILPA:1e3,				//Millipascal
            NPA:1e9,				//Nanopascal
            NCM:1e-4,				//Newton per Square Centimeter
            NM:1,					//Newton per Square Meter
            NMM:1e-6,				//Newton per Square Millimeter
            PSI:1/6894.757293178,	//PSI
            PA:1,					//Pascal
            PEPA:1e-15,				//Petapascal
            PPA:1e12,				//Picopascal
            PIZ:1e-3,				//Pieze
            PDLFT:1/1.48816394357,	//Poundal per Square Foot
            LBFFT:1/47.8802589804,	//Pound Force per Square Foot
            LBFIN:1/6894.757293178,	//Pound Force per Square Inch
            TFFTS:1/95760.51796068,	//Ton Force per Square Foot (Short)
            TFINS:1/13789514.58634,	//Ton Force per Square Inch (Short)
            ATM:1/101325.0,			//Standard Atmosphere
            SM:1e-3,				//Sthene per Square Meter
            AT:1/98066.5,			//Atmosphere Technical
            TPA:1e-12,				//Terapascal
            TORR:1/133.3223684211	//Torr
        };

        /*
         Function to perform all conversions within Pressure function.
         All "to" functions within Pressure use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toKSI; //Variable "bar" being of type UnitOf.Pressure with "from" value already assigned
         Ex 2: var foobar = UnitOf.Pressure.fromPascals(1.25).toKSI; //One line conversion from 1.25 Pascals to KSI
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAttopascals:c(l.APA),
            toBars:c(l.BAR),
            toBaryes:c(l.BA),
            toCentimetersOfMercury0C:c(l.CMHG),
            toCentimetersOfWater4C:c(l.CMW4),
            toCentipascals:c(l.CPA),
            toDecibars:c(l.DBAR),
            toDecipascals:c(l.DPA),
            toDekapascals:c(l.DAPA),
            toDynesPerSquareCentimeter:c(l.DYNCM),
            toExapascals:c(l.EPA),
            toFeetOfSeaWater:c(l.FSW),
            toFeetOfWater4C:c(l.FTW4),
            toFeetOfWater60F:c(l.FTW60),
            toFemtopascals:c(l.FPA),
            toGigapascals:c(l.GPA),
            toGramsPerSquareCentimeter:c(l.GFCM),
            toHectopascals:c(l.HPA),
            toInchesOfMercury32F:c(l.INHG32),
            toInchesOfMercury60F:c(l.INHG60),
            toInchesOfWater4C:c(l.INW4),
            toInchesOfWater60F:c(l.INW60),
            toKSI:c(l.KSI),
            toKilogramsPerSquareCentimeter:c(l.KGFCM),
            toKilogramsPerSquareMeter:c(l.KGFM),
            toKilogramsPerSquareMillimeter:c(l.KFGMM),
            toKilonewtonsPerSquareMeter:c(l.KNM),
            toKilopascals:c(l.KPA),
            toKipsPerSquareInch:c(l.KIPFIN),
            toLongTonsPerSquareFoot:c(l.TFFTL),
            toLongTonsPerSquareInch:c(l.TFINL),
            toMegapascals:c(l.MPA),
            toMetersOfSeaWater:c(l.MSW),
            toMetersOfWater4C:c(l.MW4),
            toMicrobars:c(l.MUBAR),
            toMicropascals:c(l.MUPA),
            toMillibars:c(l.MILBAR),
            toMillimetersOfMercury0C:c(l.MMHG),
            toMillimetersOfWater4C:c(l.MMW4),
            toMillipascals:c(l.MILPA),
            toNanopascals:c(l.NPA),
            toNewtonsPerSquareCentimeter:c(l.NCM),
            toNewtonsPerSquareMeter:c(l.NM),
            toNewtonsPerSquareMillimeter:c(l.NMM),
            toPSI:c(l.PSI),
            toPascals:c(l.PA),
            toPetapascals:c(l.PEPA),
            toPicopascals:c(l.PPA),
            toPieze:c(l.PIZ),
            toPoundalsPerSquareFoot:c(l.PDLFT),
            toPoundsPerSquareFoot:c(l.LBFFT),
            toPoundsPerSquareInch:c(l.LBFIN),
            toShortTonsPerSquareFoot:c(l.TFFTS),
            toShortTonsPerSquareInch:c(l.TFINS),
            toStandardAtmospheres:c(l.ATM),
            toSthenesPerSquareMeter:c(l.SM),
            toTechnicalAtmospheres:c(l.AT),
            toTerapascals:c(l.TPA),
            toTorrs:c(l.TORR)
        }
    }

    /**
     * UnitOf.Speed
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Speed.
     * "from" functions are located at the bottom of this document within "Speed" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Speed.fromMilesPerHour(1.25).toKilometersPerHour; //One line conversion from 1.25 MilesPerHour to KilometersPerHour
     */
    function SpeedLogic(v,t){

        /*
         Speed Units

         All unit values are conversions of each unit at the value of 1 converted into MS (Meters per Second).
         */
        var l = {
            CMH:1/36e4,				//Centimeter per Hour
            CMM:1/6e3,				//Centimeter per Minute
            CMS:1/1e2,				//Centimeter per Second
            EV:29765,				//Earths Velocity
            FTH:1/11811.02362205,	//Feet per Hour
            FTM:0.00508,			//Feet per Minute
            FTS:0.3048,				//Feet per Second
            CV1:7900,				//Cosmic Velocity First
            INH:7.0555555555e-6,	//Inch per Hour
            INM:4.2333333333e-4,	//Inch per Minute
            INS:0.0254,				//Inch per Second
            KMH:1/3.6,				//Kilometer per Hour
            KMM:1/6e-2,				//Kilometer per Minute
            KMS:1e3,				//Kilometer per Second
            KN:1/1.943844492441,	//Knot
            C:299792458,			//Light
            MA:295.0464000003,		//Mach SI Standard
            MH:1/36e2,				//Meters per Hour
            MM:1/60.0,				//Meters per Minute
            MS:1,					//Meters per Second
            MIH:0.44704,			//Miles per Hour
            MIM:26.8224,			//Miles per Minute
            MIS:1609.344,			//Miles per Second
            MMH:1/36e5,				//Millimeter per Hour
            MMM:1/6e4,				//Millimeter per Minute
            MMS:1/1e3,				//Millimeter per Second
            CV2:11200,				//Cosmic Velocity Second
            SA:344,					//Speed of Sound in Air
            SW:1482.7,				//Speed of Sound in Water
            CV3:16670,				//Cosmic Velocity Third
            YH:0.000254,			//Yard per Hour
            YM:0.01524,				//Yard per Minute
            YS:0.9144				//Yard per Second
        };

        /*
         Function to perform all conversions within Speed function.
         All "to" functions within Speed use this function.
         */
        function c(z){
            return k(v,z,l[t],false);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toKilometersPerHour; //Variable "bar" being of type UnitOf.Speed with "from" value already assigned
         Ex 2: var foobar = UnitOf.Speed.fromMilesPerHour(1.25).toKilometersPerHour; //One line conversion from 1.25 MilesPerHour to KilometersPerHour
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toCentimetersPerHour:c(l.CMH),
            toCentimetersPerMinute:c(l.CMM),
            toCentimetersPerSecond:c(l.CMS),
            toEarthsVelocity:c(l.EV),
            toFeetPerHour:c(l.FTH),
            toFeetPerMinute:c(l.FTM),
            toFeetPerSecond:c(l.FTS),
            toFirstCosmicVelocity:c(l.CV1),
            toInchesPerHour:c(l.INH),
            toInchesPerMinute:c(l.INM),
            toInchesPerSecond:c(l.INS),
            toKilometersPerHour:c(l.KMH),
            toKilometersPerMinute:c(l.KMM),
            toKilometersPerSecond:c(l.KMS),
            toKnots:c(l.KN),
            toLight:c(l.C),
            toMach:c(l.MA),
            toMetersPerHour:c(l.MH),
            toMetersPerMinute:c(l.MM),
            toMetersPerSecond:c(l.MS),
            toMilesPerHour:c(l.MIH),
            toMilesPerMinute:c(l.MIM),
            toMilesPerSecond:c(l.MIS),
            toMillimetersPerHour:c(l.MMH),
            toMillimetersPerMinute:c(l.MMM),
            toMillimetersPerSecond:c(l.MMS),
            toSecondCosmicVelocity:c(l.CV2),
            toSoundsInAir:c(l.SA),
            toSoundsInWater:c(l.SW),
            toThirdCosmicVelocity:c(l.CV3),
            toYardsPerHour:c(l.YH),
            toYardsPerMinute:c(l.YM),
            toYardsPerSecond:c(l.YS)
        }
    }

    /**
     * UnitOf.Temperature
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Temperature.
     * "from" functions are located at the bottom of this document within "Temperature" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Temperature.fromCelsius(1.25).toFahrenheit; //One line conversion from 1.25 Celsius to Fahrenheit
     */
    function TemperatureLogic(v,t){

        /*
         Function to perform all conversions within Temperature function.
         All "to" functions within Temperature use this function.
         */
        function c(z) {
            return fromCelsiusToType(toCelsius(v,t),z);
        }

        /*
         Only used in Temperature's conversion function.
         converts value passed of any Temperature unit into Celsius
         */
        function fromCelsiusToType(val,t){
            switch(t){
                case 'F': return (val * 1.8) + 32;		//Fahrenheit
                case 'K': return val + 273.15;			//Kelvin
                case 'R': return (val + 273.15) * 1.8;	//Rankine
                case 'RE': return val * .8;				//Reaumur
                default: return val;					//Celsius
            }
        }

        /*
         Only used in Temperature's conversion function.
         Converts Celsius value passed into any Temperature unit.
         */
        function toCelsius(val,t){
            switch(t){
                case 'F': return (val - 32) / 1.8;				//Fahrenheit
                case 'K': return val - 273.15;					//Kelvin
                case 'R': return (val - 491.67) * (5.0 / 9.0);	//Rankine
                case 'RE': return val * 1.25;					//Reaumur
                default: return val;							//Celsius
            }
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toFahrenheit; //Variable "bar" being of type UnitOf.Temperature with "from" value already assigned
         Ex 2: var foobar = UnitOf.Temperature.fromCelsius(1.25).toFahrenheit; //One line conversion from 1.25 Celsius to Fahrenheit
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toCelsius:c('C'),
            toFahrenheit:c('F'),
            toKelvin:c('K'),
            toRankine:c('R'),
            toReaumur:c('RE')
        };
    }

    /**
     * UnitOf.Time
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Time.
     * "from" functions are located at the bottom of this document within "Time" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Time.fromMinutes(1.25).toHours; //One line conversion from 1.25 Minutes to Hours
     */
    function TimeLogic(v,t){

        /*
         Time Units

         All unit values are conversions of S (Seconds) at the value of 1 converted into each unit.
         */
        var l = {
            AS:1e18,			//Attoseconds
            C:1/31536e5,		//Centuries
            D:1/864e2,			//Days
            DE:1/31536e4,		//Decades
            FS:1e15,			//Femtoseconds
            FN:1/1209600.0,		//Fortnight
            GY:1/31556952.00001,//Gregorian Years
            H:1/36e2,			//Hours
            JY:1/31557600.0,	//Julian Years
            LY:1/31622400.0,	//Leap Years
            MUS:1e6,			//Microseconds
            M:1/31536e6,		//Millenniums
            MS:1e3,				//Milliseconds
            MIN:1/60.0,			//Minutes
            MON:1/2628000.0,	//Months
            NS:1e9,				//Nanoseconds
            PS:1e12,			//Picoseconds
            S:1,				//Seconds
            WK:1/604800.0,		//Weeks
            Y:1/31536e3 		//Years
        };

        /*
         Function to perform all conversions within Time function.
         All "to" functions within Time use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toHours; //Variable "bar" being of type UnitOf.Time with "from" value already assigned
         Ex 2: var foobar = UnitOf.Time.fromMinutes(1.25).toHours; //One line conversion from 1.25 Minutes to Hours
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAttoseconds:c(l.AS),
            toCenturies:c(l.C),
            toDays:c(l.D),
            toDecades:c(l.DE),
            toFemtoseconds:c(l.FS),
            toFortnights:c(l.FN),
            toGregorianYears:c(l.GY),
            toHours:c(l.H),
            toJulianYears:c(l.JY),
            toLeapYears:c(l.LY),
            toMicroseconds:c(l.MUS),
            toMillenniums:c(l.M),
            toMilliseconds:c(l.MS),
            toMinutes:c(l.MIN),
            toMonths:c(l.MON),
            toNanoseconds:c(l.NS),
            toPicoseconds:c(l.PS),
            toSeconds:c(l.S),
            toWeeks:c(l.WK),
            toYears:c(l.Y)
        }
    }

    /**
     * UnitOf.Torque
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Torque.
     * "from" functions are located at the bottom of this document within "Torque" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Torque.fromNewtonMeters(1.25).toGramMeters; //One line conversion from 1.25 NewtonMeters to GramMeters
     */
    function TorqueLogic(v,t){

        /*
         Torque Units

         All unit values are conversions of KGFM (Kilogram Force Meter) at the value of 1 converted into each unit.
         */
        var l = {
            DYNCM:9.80665e7,		//Dyne Centimeter
            DYNM:9.80665e5,			//Dyne Meter
            DYNMM:9.80665e8,		//Dyne Millimeter
            GFCM:1e5,				//Gram Force Centimeter
            GFM:1e3,				//Gram Force Meter
            GFMM:1e6,				//Gram Force Millimeter
            KGFCM:1e2,				//Kilogram Force Centimeter
            KGFM:1,					//Kilogram Force Meter
            KGFMM:1e3,				//Kilogram Force Millimeter
            KNM:9.80665e-3,			//Kilonewton Meter
            NCM:9.80665e2,			//Newton Centimeter
            NM:9.80665,				//Newton Meter
            NMM:9.80665e3,			//Newton Millimeter
            OZFFT:115.7282185748,	//Ounce Force Foot
            OZFIN:1388.738622898,	//Ounce Force Inch
            LBFFT:7.23301357557,	//Pound Force Foot
            LBFIN:86.79616290684	//Pound Force Inch
        };

        /*
         Function to perform all conversions within Torque function.
         All "to" functions within Torque use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toGramMeters; //Variable "bar" being of type UnitOf.Torque with "from" value already assigned
         Ex 2: var foobar = UnitOf.Torque.fromNewtonMeters(1.25).toGramMeters; //One line conversion from 1.25 NewtonMeters to GramMeters
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toDyneCentimeters:c(l.DYNCM),
            toDyneMeters:c(l.DYNM),
            toDyneMillimeters:c(l.DYNMM),
            toGramCentimeters:c(l.GFCM),
            toGramMeters:c(l.GFM),
            toGramMillimeters:c(l.GFMM),
            toKilogramCentimeters:c(l.KGFCM),
            toKilogramMeters:c(l.KGFM),
            toKilogramMillimeters:c(l.KGFMM),
            toKilonewtonMeters:c(l.KNM),
            toNewtonCentimeters:c(l.NCM),
            toNewtonMeters:c(l.NM),
            toNewtonMillimeters:c(l.NMM),
            toOunceFeet:c(l.OZFFT),
            toOunceInches:c(l.OZFIN),
            toPoundFeet:c(l.LBFFT),
            toPoundInches:c(l.LBFIN)
        }
    }

    /**
     * UnitOf.Volume
     * The following function contains constants, "to" functions, and the conversion function for UnitOf.Volume.
     * "from" functions are located at the bottom of this document within "Volume" of the "UnitOf" Object.
     *
     * Ex: var foo = new UnitOf.Volume.fromLiters(1.25).toCubicMeters; //One line conversion from 1.25 Liters to CubicMeters
     */
    function VolumeLogic(v,t){

        /*
         Volume Units

         All unit values are conversions of M (Cubic Meter) at the value of 1 converted into each unit.
         */
        var l = {
            ACFTUS:0.0008107083295205,	//Acre Foot (US)
            ACIN:0.009728558325479,		//Acre Inch
            ACFTO:0.0008107131937899,	//Acre Foot
            AL:1e21,					//Attoliter
            BBLO:6.289810770432,		//Barrel (Oil)
            BBLUK:6.110256897197,		//Barrel (UK)
            BBLUS:8.386414360576,		//Barrel (US)
            FBM:423.7760006579,			//Board Foot
            CL:1e5,						//Centiliter
            CORD:0.2758958337616,		//Cord
            CM:1e6,						//Cubic Centimeter
            DM:1e3,						//Cubic Decimeter
            FT:35.31466672148,			//Cubic Foot
            IN:61023.74409473,			//Cubic Inch
            KM:1e-9,					//Cubic Kilometer
            M:1,						//Cubic Meter
            MI:2.399127585789e-10,		//Cubic Mile
            MM:1e9,						//Cubic Millimeter
            YD:1.307950619314,			//Cubic Yard
            CUPM:4e3,					//Cup (Metric)
            CUPUK:3519.507972785,		//Cup (UK)
            CUPUS:4226.75283773,		//Cup (US)
            DL:1e4,						//Deciliter
            DECI:1e1,					//Decistere
            DAL:1e2,					//Dekaliter
            DEKA:0.1,					//Dekastere
            DSTSPNUK:84468.19134685,	//Dessertspoon (UK)
            DSTSPNUS:101442.0681055,	//Dessertspoon (US)
            DROP:2e7,					//Drop
            EL:1e-15,					//Exaliter
            FL:1e18,					//Femtoliter
            FLOZUK:35195.07972785,		//Fluid Ounce (UK)
            FLOZUS:33814.02270184,		//Fluid Ounce (US)
            GALUK:219.9692482991,		//Gallon (UK)
            GALUS:264.1720523581,		//Gallon (US)
            GL:1e-6,					//Gigaliter
            GILUK:7039.015945571,		//Fill (UK)
            GILUS:8453.505675461,		//Gill (US)
            HL:1e1,						//Hectoliter
            HOG:4.193207180288,			//Hogshead
            CCF:0.3531466672149,		//100 Cubic Feet
            KL:1,						//Kiloliter
            L:1e3,						//Liter
            ML:1e-3,					//Megaliter
            MUL:1e9,					//Microliter
            MILL:1e6,					//Milliliter
            MINIUK:16893638.26937,		//Minim (UK)
            MINIUS:16230730.89688,		//Minim (US)
            NL:1e12,					//Nanoliter
            PEL:1e-12,					//Petaliter
            PL:1e15,					//Picoliter
            PTUK:1759.753986393,		//Pint (UK)
            PTUS:2113.376418865,		//Pint (US)
            QTUK:879.8769931964,		//Quart (UK)
            QTUS:1056.688209433,		//Quart (US)
            REGTON:0.3531466672149,		//Register Ton
            ST:1,						//Stere
            TBSPM:66666.66666667,		//Tablespoon (Metric)
            TBSPUK:56312.12756457,		//Tablespoon (UK)
            TBSPUS:67628.04540369,		//Tablespoon (US)
            TSPM:2e5,					//Teaspoon (Metric)
            TSPUK:168936.3826937,		//Teaspoon (UK)
            TSPUS:202884.1362111,		//Teaspoon (US)
            TL:1e-9,					//Teraliter
            TUN:1.048301795072			//Tun
        };

        /*
         Function to perform all conversions within Volume function.
         All "to" functions within Volume use this function.
         */
        function c(z){
            return k(v,z,l[t],true);
        }

        /*
         "to" Functions

         Ex 1: var bar = foo.toCubicMeters; //Variable "bar" being of type UnitOf.Volume with "from" value already assigned
         Ex 2: var foobar = UnitOf.Volume.fromLiters(1.25).toCubicMeters; //One line conversion from 1.25 Liters to CubicMeters
         */
        return {
            getValuePassed:v,
            getTypeConstantPassed:t,
            toAcreFeetUSSurvey:c(l.ACFTUS),
            toAcreInches:c(l.ACIN),
            toArceFeet:c(l.ACFTO),
            toAttoliters:c(l.AL),
            toBarrelsOfOil:c(l.BBLO),
            toBarrelsUK:c(l.BBLUK),
            toBarrelsUS:c(l.BBLUS),
            toBoardFeet:c(l.FBM),
            toCentiliters:c(l.CL),
            toCords:c(l.CORD),
            toCubicCentimeters:c(l.CM),
            toCubicDecimeters:c(l.DM),
            toCubicFeet:c(l.FT),
            toCubicInches:c(l.IN),
            toCubicKilometers:c(l.KM),
            toCubicMeters:c(l.M),
            toCubicMiles:c(l.MI),
            toCubicMillimeters:c(l.MM),
            toCubicYards:c(l.YD),
            toCupsMetric:c(l.CUPM),
            toCupsUK:c(l.CUPUK),
            toCupsUS:c(l.CUPUS),
            toDeciliters:c(l.DL),
            toDecisteres:c(l.DECI),
            toDekaliters:c(l.DAL),
            toDekasteres:c(l.DEKA),
            toDessertspoonsUK:c(l.DSTSPNUK),
            toDessertspoonsUS:c(l.DSTSPNUS),
            toDrops:c(l.DROP),
            toExaliters:c(l.EL),
            toFemtoliters:c(l.FL),
            toFluidOuncesUK:c(l.FLOZUK),
            toFluidOuncesUS:c(l.FLOZUS),
            toGallonsUK:c(l.GALUK),
            toGallonsUS:c(l.GALUS),
            toGigaliters:c(l.GL),
            toGillsUK:c(l.GILUK),
            toGillsUS:c(l.GILUS),
            toHectoliters:c(l.HL),
            toHogsheads:c(l.HOG),
            toHundredCubicFeet:c(l.CCF),
            toKiloliters:c(l.KL),
            toLiters:c(l.L),
            toMegaliters:c(l.ML),
            toMicroliters:c(l.MUL),
            toMilliliters:c(l.MILL),
            toMinimsUK:c(l.MINIUK),
            toMinimsUS:c(l.MINIUS),
            toNanoliters:c(l.NL),
            toPetaliters:c(l.PEL),
            toPicoliters:c(l.PL),
            toPintsUK:c(l.PTUK),
            toPintsUS:c(l.PTUS),
            toQuartsUK:c(l.QTUK),
            toQuartsUS:c(l.QTUS),
            toRegisterTons:c(l.REGTON),
            toSteres:c(l.ST),
            toTablespoonsMetric:c(l.TBSPM),
            toTablespoonsUK:c(l.TBSPUK),
            toTablespoonsUS:c(l.TBSPUS),
            toTeaspoonsMetric:c(l.TSPM),
            toTeaspoonsUK:c(l.TSPUK),
            toTeaspoonsUS:c(l.TSPUS),
            toTeraliters:c(l.TL),
            toTuns:c(l.TUN)
        }
    }

    /**
     * Building UnitOf object with all measurement's "from" Functions
     *
     * Ex: var foo = UnitOf.Length.fromMeters(1.25); //Variable "foo" will be able to convert 1.25 Meters into any unit of Length
     * Ex: var foo = UnitOf.DataType(1.25); //Variable "foo" will be able to convert 1.25 as a float into any data type defined in the UnitOf.DataType function
     * Ex: var foo = UnitOf.NumericBase.fromHexadecimal("ADa3"); //Variable "foo" will be able to convert "Ada3" into any numeric base defined in the UnitOf.NumericBase function
     */
    UnitOf= {
        Acceleration: {
            fromAttometersPerSecondSquared: function(v){return AccelerationLogic(v,'AS');},
            fromCentimeterPerSecondSquared: function(v){return AccelerationLogic(v,'CS');},
            fromDecimetersPerSecondSquared: function(v){return AccelerationLogic(v,'DS');},
            fromDekametersPerSecondSquared: function(v){return AccelerationLogic(v,'DAS');},
            fromExametersPerSecondSquared: function(v){return AccelerationLogic(v,'ES');},
            fromFeetPerHourPerSecond: function(v){return AccelerationLogic(v,'FTHS');},
            fromFeetPerMinutePerSecond: function(v){return AccelerationLogic(v,'FTMS');},
            fromFeetPerSecondSquared: function(v){return AccelerationLogic(v,'FTS');},
            fromFemtometersPerSecondSquared: function(v){return AccelerationLogic(v,'FS');},
            fromGalileos: function(v){return AccelerationLogic(v,'GAL');},
            fromGigametersPerSecondSquared: function(v){return AccelerationLogic(v,'GS');},
            fromGravity: function(v){return AccelerationLogic(v,'G');},
            fromHectometersPerSecondSquared: function(v){return AccelerationLogic(v,'HS');},
            fromInchesPerMinutePerSecond: function(v){return AccelerationLogic(v,'INMS');},
            fromInchesPerSecondSquared: function(v){return AccelerationLogic(v,'INS');},
            fromKilometersPerHourPerSecond: function(v){return AccelerationLogic(v,'KHS');},
            fromKilometersPerHourSquared: function(v){return AccelerationLogic(v,'KH');},
            fromKilometersPerSecondSquared: function(v){return AccelerationLogic(v,'KS');},
            fromKnotsPerSecond: function(v){return AccelerationLogic(v,'KNS');},
            fromMegametersPerSecondSquared: function(v){return AccelerationLogic(v,'MGS');},
            fromMetersPerSecondSquared: function(v){return AccelerationLogic(v,'MS');},
            fromMicrogalileos: function(v){return AccelerationLogic(v,'MUGAL');},
            fromMicrometersPerSecondSquared: function(v){return AccelerationLogic(v,'MUS');},
            fromMilesPerHourPerSecond: function(v){return AccelerationLogic(v,'MIHS');},
            fromMilesPerMinutePerSecond: function(v){return AccelerationLogic(v,'MIMS');},
            fromMilesPerSecondSquared: function(v){return AccelerationLogic(v,'MIS');},
            fromMilligalileos: function(v){return AccelerationLogic(v,'MILGAL');},
            fromMillimetersPerSecondSquared: function(v){return AccelerationLogic(v,'MILS');},
            fromNanometersPerSecondSquared: function(v){return AccelerationLogic(v,'NS');},
            fromPetametersPerSecondSquared: function(v){return AccelerationLogic(v,'PES');},
            fromPicometersPerSecondSquared: function(v){return AccelerationLogic(v,'PS');},
            fromTerametersPerSecondSquared: function(v){return AccelerationLogic(v,'TS');},
            fromYardsPerSecondSquared: function(v){return AccelerationLogic(v,'YDS');}
        }, Angle: {
            fromCircles: function(v){return AngleLogic(v,'C');},
            fromDegrees: function(v){return AngleLogic(v,'D');},
            fromGradians: function(v){return AngleLogic(v,'G');},
            fromMils: function(v){return AngleLogic(v,'MIL');},
            fromMinutes: function(v){return AngleLogic(v,'M');},
            fromQuadrants: function(v){return AngleLogic(v,'Q');},
            fromRadians: function(v){return AngleLogic(v,'RAD');},
            fromRevolutions: function(v){return AngleLogic(v,'R');},
            fromRightAngles: function(v){return AngleLogic(v,'RA');},
            fromSeconds: function(v){return AngleLogic(v,'S');},
            fromSextants: function(v){return AngleLogic(v,'SE');},
            fromSigns: function(v){return AngleLogic(v,'SI');},
            fromTurns: function(v){return AngleLogic(v,'T');}
        }, Anything: function(keyName, keyValue, multiplyToKeyThenDivide, units) {return Anything(keyName, keyValue, multiplyToKeyThenDivide, units);
        },Area: {
            fromAcres: function(v){return AreaLogic(v,'AC');},
            fromAres: function(v){return AreaLogic(v,'A');},
            fromArpents: function(v){return AreaLogic(v,'AR');},
            fromBarns: function(v){return AreaLogic(v,'B');},
            fromCircularInches: function(v){return AreaLogic(v,'CRIN');},
            fromCircularMils: function(v){return AreaLogic(v,'CRMIL');},
            fromHectares: function(v){return AreaLogic(v,'HA');},
            fromHomesteads: function(v){return AreaLogic(v,'HS');},
            fromRoods: function(v){return AreaLogic(v,'R');},
            fromSabins: function(v){return AreaLogic(v,'S');},
            fromSquareCentimeters: function(v){return AreaLogic(v,'C');},
            fromSquareChains: function(v){return AreaLogic(v,'CH');},
            fromSquareDecimeters: function(v){return AreaLogic(v,'D');},
            fromSquareDekameters: function(v){return AreaLogic(v,'DA');},
            fromSquareFeet: function(v){return AreaLogic(v,'FT');},
            fromSquareHectometers: function(v){return AreaLogic(v,'H');},
            fromSquareInches: function(v){return AreaLogic(v,'IN');},
            fromSquareKilometers: function(v){return AreaLogic(v,'K');},
            fromSquareMeters: function(v){return AreaLogic(v,'M');},
            fromSquareMicrometers: function(v){return AreaLogic(v,'MU');},
            fromSquareMiles: function(v){return AreaLogic(v,'MI');},
            fromSquareMillimeters: function(v){return AreaLogic(v,'MIL');},
            fromSquareNanometers: function(v){return AreaLogic(v,'N');},
            fromSquarePerches: function(v){return AreaLogic(v,'PE');},
            fromSquarePoles: function(v){return AreaLogic(v,'PO');},
            fromSquareRods: function(v){return AreaLogic(v,'ROD');},
            fromSquareYards: function(v){return AreaLogic(v,'YD');}
        }, DataStorage: {
            fromBits: function(v){return DataStorageLogic(v,'B');},
            fromBlocks: function(v){return DataStorageLogic(v,'BL');},
            fromBluRay_DoubleLayer: function(v){return DataStorageLogic(v,'BD2');},
            fromBluRay_SingleLayer: function(v){return DataStorageLogic(v,'BD1');},
            fromBytes: function(v){return DataStorageLogic(v,'BY');},
            fromCDs_74Minutes: function(v){return DataStorageLogic(v,'CD74');},
            fromCDs_80Minutes: function(v){return DataStorageLogic(v,'CD80');},
            fromDVDs_DoubleSidedDoubleLayer: function(v){return DataStorageLogic(v,'D22');},
            fromDVDs_DoubleSidedSingleLayer: function(v){return DataStorageLogic(v,'D12');},
            fromDVDs_SingleSidedDoubleLayer: function(v){return DataStorageLogic(v,'D21');},
            fromDVDs_SingleSidedSingleLayer: function(v){return DataStorageLogic(v,'D11');},
            fromExabits: function(v){return DataStorageLogic(v,'EBI');},
            fromExabytes: function(v){return DataStorageLogic(v,'EB');},
            fromFloppyDisks_35DD: function(v){return DataStorageLogic(v,'F35DD');},
            fromFloppyDisks_35ED: function(v){return DataStorageLogic(v,'F35ED');},
            fromFloppyDisks_35HD: function(v){return DataStorageLogic(v,'F35HD');},
            fromFloppyDisks_525DD: function(v){return DataStorageLogic(v,'F525DD');},
            fromFloppyDisks_525HD: function(v){return DataStorageLogic(v,'F525HD');},
            fromGigabits: function(v){return DataStorageLogic(v,'GBI');},
            fromGigabytes: function(v){return DataStorageLogic(v,'GB');},
            fromKilobits: function(v){return DataStorageLogic(v,'KBI');},
            fromKilobytes: function(v){return DataStorageLogic(v,'KB');},
            fromMegabits: function(v){return DataStorageLogic(v,'MBI');},
            fromMegabytes: function(v){return DataStorageLogic(v,'MB');},
            fromNibbles: function(v){return DataStorageLogic(v,'NI');},
            fromPetabits: function(v){return DataStorageLogic(v,'PBI');},
            fromPetabytes: function(v){return DataStorageLogic(v,'PB');},
            fromSIUnitExabits: function(v){return DataStorageLogic(v,'SIEBI');},
            fromSIUnitExabytes: function(v){return DataStorageLogic(v,'SIEB');},
            fromSIUnitGigabits: function(v){return DataStorageLogic(v,'SIGBI');},
            fromSIUnitGigabytes: function(v){return DataStorageLogic(v,'SIGB');},
            fromSIUnitKilobits: function(v){return DataStorageLogic(v,'SIKBI');},
            fromSIUnitKilobytes: function(v){return DataStorageLogic(v,'SIKB');},
            fromSIUnitMegabits: function(v){return DataStorageLogic(v,'SIMBI');},
            fromSIUnitMegabytes: function(v){return DataStorageLogic(v,'SIMB');},
            fromSIUnitPetabits: function(v){return DataStorageLogic(v,'SIPBI');},
            fromSIUnitPetabytes: function(v){return DataStorageLogic(v,'SIPB');},
            fromSIUnitTerabits: function(v){return DataStorageLogic(v,'SITBI');},
            fromSIUnitTerabytes: function(v){return DataStorageLogic(v,'SITB');},
            fromSIUnitYottabits: function(v){return DataStorageLogic(v,'SIYBI');},
            fromSIUnitYottabytes: function(v){return DataStorageLogic(v,'SIYB');},
            fromSIUnitZettabits: function(v){return DataStorageLogic(v,'SIZBI');},
            fromSIUnitZettabytes: function(v){return DataStorageLogic(v,'SIZB');},
            fromTerabits: function(v){return DataStorageLogic(v,'TBI');},
            fromTerabytes: function(v){return DataStorageLogic(v,'TB');},
            fromWords: function(v){return DataStorageLogic(v,'W');},
            fromYottabits: function(v){return DataStorageLogic(v,'YBI');},
            fromYottabytes: function(v){return DataStorageLogic(v,'YB');},
            fromZettabits: function(v){return DataStorageLogic(v,'ZBI');},
            fromZettabytes: function(v){return DataStorageLogic(v,'ZB');}
        }, DataTransferRate: {
            fromBitsPerSecond: function(v){return DataTransferRateLogic(v,'BIS');},
            fromBytesPerSecond: function(v){return DataTransferRateLogic(v,'BS');},
            fromEthernetsBase10: function(v){return DataTransferRateLogic(v,'E10');},
            fromEthernetsBase100: function(v){return DataTransferRateLogic(v,'E100');},
            fromEthernetsBase1000: function(v){return DataTransferRateLogic(v,'E1000');},
            fromFireWires400: function(v){return DataTransferRateLogic(v,'FW400');},
            fromFireWires800: function(v){return DataTransferRateLogic(v,'FW800');},
            fromFireWiresS1600_S3200: function(v){return DataTransferRateLogic(v,'FW3200');},
            fromGigabitsPerSecond: function(v){return DataTransferRateLogic(v,'GBIS');},
            fromGigabytesPerSecond: function(v){return DataTransferRateLogic(v,'GBS');},
            fromISDNsDual: function(v){return DataTransferRateLogic(v,'ISDND');},
            fromISDNsSingle: function(v){return DataTransferRateLogic(v,'ISDNS');},
            fromKilobitsPerSecond: function(v){return DataTransferRateLogic(v,'KBIS');},
            fromKilobytesPerSecond: function(v){return DataTransferRateLogic(v,'KBS');},
            fromMegabitsPerSecond: function(v){return DataTransferRateLogic(v,'MBIS');},
            fromMegabytesPerSecond: function(v){return DataTransferRateLogic(v,'MBS');},
            fromModems110b: function(v){return DataTransferRateLogic(v,'M110');},
            fromModems1200b: function(v){return DataTransferRateLogic(v,'M1200');},
            fromModems14_4k: function(v){return DataTransferRateLogic(v,'M14K');},
            fromModems2400b: function(v){return DataTransferRateLogic(v,'M2400');},
            fromModems28_8k: function(v){return DataTransferRateLogic(v,'M28K');},
            fromModems300b: function(v){return DataTransferRateLogic(v,'M300');},
            fromModems33_6k: function(v){return DataTransferRateLogic(v,'M33K');},
            fromModems56k: function(v){return DataTransferRateLogic(v,'M56K');},
            fromModems9600b: function(v){return DataTransferRateLogic(v,'M9600');},
            fromOCs1: function(v){return DataTransferRateLogic(v,'OC1');},
            fromOCs12: function(v){return DataTransferRateLogic(v,'OC12');},
            fromOCs192: function(v){return DataTransferRateLogic(v,'OC192');},
            fromOCs24: function(v){return DataTransferRateLogic(v,'OC24');},
            fromOCs3: function(v){return DataTransferRateLogic(v,'OC3');},
            fromOCs48: function(v){return DataTransferRateLogic(v,'OC48');},
            fromOCs768: function(v){return DataTransferRateLogic(v,'OC768');},
            fromPetabitsPerSecond: function(v){return DataTransferRateLogic(v,'PBIS');},
            fromPetabytesPerSecond: function(v){return DataTransferRateLogic(v,'PBS');},
            fromSIUnitGigabitsPerSecond: function(v){return DataTransferRateLogic(v,'SIGBIS');},
            fromSIUnitGigabytesPerSecond: function(v){return DataTransferRateLogic(v,'SIGBS');},
            fromSIUnitKilobitsPerSecond: function(v){return DataTransferRateLogic(v,'SIKBIS');},
            fromSIUnitKilobytesPerSecond: function(v){return DataTransferRateLogic(v,'SIKBS');},
            fromSIUnitMegabitsPerSecond: function(v){return DataTransferRateLogic(v,'SIMBIS');},
            fromSIUnitMegabytesPerSecond: function(v){return DataTransferRateLogic(v,'SIMBS');},
            fromSIUnitPetabitsPerSecond: function(v){return DataTransferRateLogic(v,'SIPBIS');},
            fromSIUnitPetabytesPerSecond: function(v){return DataTransferRateLogic(v,'SIPBS');},
            fromSIUnitTerabitsPerSecond: function(v){return DataTransferRateLogic(v,'SITBIS');},
            fromSIUnitTerabytesPerSecond: function(v){return DataTransferRateLogic(v,'SITBS');},
            fromTerabitsPerSecond: function(v){return DataTransferRateLogic(v,'TBIS');},
            fromTerabytesPerSecond: function(v){return DataTransferRateLogic(v,'TBS');},
            fromUSBs1_0: function(v){return DataTransferRateLogic(v,'USB1');},
            fromUSBs2_0: function(v){return DataTransferRateLogic(v,'USB2');},
            fromUSBs3_0: function(v){return DataTransferRateLogic(v,'USB3');},
            fromUSBs3_1: function(v){return DataTransferRateLogic(v,'USB31');}
        }, DataType: function(v){return DataType(v);
        }, ElectricCharge: {
            fromAbcoulombs: function(v){return ElectricChargeLogic(v,'ABC');},
            fromAmpereHours: function(v){return ElectricChargeLogic(v,'AH');},
            fromAmpereMinutes: function(v){return ElectricChargeLogic(v,'AM');},
            fromAmpereSeconds: function(v){return ElectricChargeLogic(v,'AS');},
            fromCoulombs: function(v){return ElectricChargeLogic(v,'C');},
            fromEMUsOfCharge: function(v){return ElectricChargeLogic(v,'EMU');},
            fromESUsOfCharge: function(v){return ElectricChargeLogic(v,'ESU');},
            fromElectronCharge: function(v){return ElectricChargeLogic(v,'E');},
            fromFaradVolts: function(v){return ElectricChargeLogic(v,'F');},
            fromFaradayCarbon12: function(v){return ElectricChargeLogic(v,'FA12');},
            fromFaradayChemistry: function(v){return ElectricChargeLogic(v,'FACH');},
            fromFaradayPhysics: function(v){return ElectricChargeLogic(v,'FAPH');},
            fromFranklins: function(v){return ElectricChargeLogic(v,'FR');},
            fromKilocoulombs: function(v){return ElectricChargeLogic(v,'KC');},
            fromMegacoulombs: function(v){return ElectricChargeLogic(v,'MC');},
            fromMicrocoulombs: function(v){return ElectricChargeLogic(v,'MUC');},
            fromMillicoulombs: function(v){return ElectricChargeLogic(v,'MILC');},
            fromNanocoulombs: function(v){return ElectricChargeLogic(v,'NC');},
            fromPicocoulombs: function(v){return ElectricChargeLogic(v,'PC');},
            fromStatcoulombs: function(v){return ElectricChargeLogic(v,'STC');}
        }, Energy: {
            fromAttojoules: function(v){return EnergyLogic(v,'AJ');},
            fromBTUsInternationalStandard: function(v){return EnergyLogic(v,'BTU');},
            fromBTUsThermochemical: function(v){return EnergyLogic(v,'BTUTH');},
            fromBarrelsOfOilEquivalent: function(v){return EnergyLogic(v,'BOE');},
            fromCaloriesInternationalSteam: function(v){return EnergyLogic(v,'CALIT');},
            fromCaloriesNutritional: function(v){return EnergyLogic(v,'CALN');},
            fromCaloriesThermochemical: function(v){return EnergyLogic(v,'CALTH');},
            fromDyneCentimeters: function(v){return EnergyLogic(v,'DYNCM');},
            fromElectronVolts: function(v){return EnergyLogic(v,'EV');},
            fromErgs: function(v){return EnergyLogic(v,'ERG');},
            fromFootPounds: function(v){return EnergyLogic(v,'FTLBF');},
            fromGigajoules: function(v){return EnergyLogic(v,'GJ');},
            fromGigatonsOfTNT: function(v){return EnergyLogic(v,'GT');},
            fromGigawattHours: function(v){return EnergyLogic(v,'GWH');},
            fromGramForceCentimeters: function(v){return EnergyLogic(v,'GFCM');},
            fromGramForceMeters: function(v){return EnergyLogic(v,'GFM');},
            fromHartrees: function(v){return EnergyLogic(v,'H');},
            fromHorsepowerHours: function(v){return EnergyLogic(v,'HPH');},
            fromHorsepowerHoursMetric: function(v){return EnergyLogic(v,'HPHM');},
            fromInchOunces: function(v){return EnergyLogic(v,'INOZF');},
            fromInchPounds: function(v){return EnergyLogic(v,'INLBF');},
            fromJoules: function(v){return EnergyLogic(v,'J');},
            fromKilocaloriesInternationalSteam: function(v){return EnergyLogic(v,'KCALIT');},
            fromKilocaloriesThermochemical: function(v){return EnergyLogic(v,'KCALTH');},
            fromKiloelectronVolts: function(v){return EnergyLogic(v,'KEV');},
            fromKilogramForceCentimeters: function(v){return EnergyLogic(v,'KGFCM');},
            fromKilogramForceMeters: function(v){return EnergyLogic(v,'KGFM');},
            fromKilogramsOfTNT: function(v){return EnergyLogic(v,'KGT');},
            fromKilojoules: function(v){return EnergyLogic(v,'KJ');},
            fromKilopondMeters: function(v){return EnergyLogic(v,'KPM');},
            fromKilotonsOfTNT: function(v){return EnergyLogic(v,'KT');},
            fromKilowattHours: function(v){return EnergyLogic(v,'KWH');},
            fromKilowattSeconds: function(v){return EnergyLogic(v,'KWS');},
            fromLiterAtmospheres: function(v){return EnergyLogic(v,'LA');},
            fromMegaBTUsInternationalStandard: function(v){return EnergyLogic(v,'MBTU');},
            fromMegaelectronVolts: function(v){return EnergyLogic(v,'MEV');},
            fromMegajoules: function(v){return EnergyLogic(v,'MJ');},
            fromMegatonsOfTNT: function(v){return EnergyLogic(v,'MT');},
            fromMegawattHours: function(v){return EnergyLogic(v,'MWH');},
            fromMicrojoules: function(v){return EnergyLogic(v,'MUJ');},
            fromMillijoules: function(v){return EnergyLogic(v,'MILJ');},
            fromNanojoules: function(v){return EnergyLogic(v,'NJ');},
            fromNewtonMeters: function(v){return EnergyLogic(v,'NM');},
            fromPlanckEnergy: function(v){return EnergyLogic(v,'EP');},
            fromPoundalFeet: function(v){return EnergyLogic(v,'PDLFT');},
            fromRydbergs: function(v){return EnergyLogic(v,'RY');},
            fromThermsEC: function(v){return EnergyLogic(v,'THMEC');},
            fromThermsUS: function(v){return EnergyLogic(v,'THMUS');},
            fromTonsOfTNT: function(v){return EnergyLogic(v,'TT');},
            fromWattHours: function(v){return EnergyLogic(v,'WH');},
            fromWattSeconds: function(v){return EnergyLogic(v,'WS');}
        }, Force: {
            fromAtomicUnitsOfForce: function(v){return ForceLogic(v,'AUF');},
            fromAttonewtons: function(v){return ForceLogic(v,'AN');},
            fromCentinewtons: function(v){return ForceLogic(v,'CN');},
            fromDecinewtons: function(v){return ForceLogic(v,'DN');},
            fromDekanewtons: function(v){return ForceLogic(v,'DAN');},
            fromDynes: function(v){return ForceLogic(v,'DYN');},
            fromExanewtons: function(v){return ForceLogic(v,'EN');},
            fromFemtonewtons: function(v){return ForceLogic(v,'FN');},
            fromGiganewtons: function(v){return ForceLogic(v,'GN');},
            fromGramForces: function(v){return ForceLogic(v,'GF');},
            fromGraveForces: function(v){return ForceLogic(v,'GFF');},
            fromHectonewtons: function(v){return ForceLogic(v,'HN');},
            fromJouleCentimeters: function(v){return ForceLogic(v,'JCM');},
            fromJouleMeters: function(v){return ForceLogic(v,'JM');},
            fromKilogramForces: function(v){return ForceLogic(v,'KGF');},
            fromKilonewtons: function(v){return ForceLogic(v,'KN');},
            fromKiloponds: function(v){return ForceLogic(v,'KP');},
            fromKilopoundForces: function(v){return ForceLogic(v,'KIP');},
            fromLongTonForces: function(v){return ForceLogic(v,'LTF');},
            fromMeganewtons: function(v){return ForceLogic(v,'MN');},
            fromMetricTonForces: function(v){return ForceLogic(v,'TFM');},
            fromMicronewtons: function(v){return ForceLogic(v,'MUN');},
            fromMilligraveForces: function(v){return ForceLogic(v,'MGF');},
            fromMillinewtons: function(v){return ForceLogic(v,'MILN');},
            fromNanonewtons: function(v){return ForceLogic(v,'NN');},
            fromNewtons: function(v){return ForceLogic(v,'N');},
            fromOunceForces: function(v){return ForceLogic(v,'OZF');},
            fromPetanewtons: function(v){return ForceLogic(v,'PEN');},
            fromPiconewtons: function(v){return ForceLogic(v,'PN');},
            fromPonds: function(v){return ForceLogic(v,'P');},
            fromPoundFeetPerSecondSquared: function(v){return ForceLogic(v,'LBFT');},
            fromPoundForces: function(v){return ForceLogic(v,'LBF');},
            fromPoundals: function(v){return ForceLogic(v,'PDL');},
            fromShortTonForces: function(v){return ForceLogic(v,'TFS');},
            fromSthenes: function(v){return ForceLogic(v,'SN');},
            fromTeranewtons: function(v){return ForceLogic(v,'TN');}
        }, Frequency: {
            fromAttohertz: function(v){return FrequencyLogic(v,'AHZ');},
            fromCentihertz: function(v){return FrequencyLogic(v,'CHZ');},
            fromCyclesPerSecond: function(v){return FrequencyLogic(v,'CS');},
            fromDecihertz: function(v){return FrequencyLogic(v,'DHZ');},
            fromDekahertz: function(v){return FrequencyLogic(v,'DAHZ');},
            fromExahertz: function(v){return FrequencyLogic(v,'EHZ');},
            fromFemtohertz: function(v){return FrequencyLogic(v,'FHZ');},
            fromGigahertz: function(v){return FrequencyLogic(v,'GHZ');},
            fromHectohertz: function(v){return FrequencyLogic(v,'HHZ');},
            fromHertz: function(v){return FrequencyLogic(v,'HZ');},
            fromKilohertz: function(v){return FrequencyLogic(v,'KHZ');},
            fromMegahertz: function(v){return FrequencyLogic(v,'MHZ');},
            fromMicrohertz: function(v){return FrequencyLogic(v,'MUHZ');},
            fromMillihertz: function(v){return FrequencyLogic(v,'MIHZ');},
            fromNanohertz: function(v){return FrequencyLogic(v,'NHZ');},
            fromPetahertz: function(v){return FrequencyLogic(v,'PEHZ');},
            fromPicohertz: function(v){return FrequencyLogic(v,'PHZ');},
            fromRevolutionsPerDay: function(v){return FrequencyLogic(v,'RD');},
            fromRevolutionsPerHour: function(v){return FrequencyLogic(v,'RH');},
            fromRevolutionsPerMinute: function(v){return FrequencyLogic(v,'RM');},
            fromRevolutionsPerSecond: function(v){return FrequencyLogic(v,'RS');},
            fromTerahertz: function(v){return FrequencyLogic(v,'THZ');}
        }, FuelEconomy: {
            fromCentimetersPerLiter: function(v){return FuelEconomyLogic(v,'CML');},
            fromDekametersPerLiter: function(v){return FuelEconomyLogic(v,'DAML');},
            fromExametersPerLiter: function(v){return FuelEconomyLogic(v,'EML');},
            fromGigametersPerLiter: function(v){return FuelEconomyLogic(v,'GML');},
            fromHectometersPerLiter: function(v){return FuelEconomyLogic(v,'HML');},
            fromKilometersPerGallonUK: function(v){return FuelEconomyLogic(v,'KMGALUK');},
            fromKilometersPerGallonUS: function(v){return FuelEconomyLogic(v,'KMGALUS');},
            fromKilometersPerLiter: function(v){return FuelEconomyLogic(v,'KML');},
            fromMegametersPerLiter: function(v){return FuelEconomyLogic(v,'MML');},
            fromMetersPerCubicCentimeter: function(v){return FuelEconomyLogic(v,'MCM');},
            fromMetersPerCubicFoot: function(v){return FuelEconomyLogic(v,'MFT');},
            fromMetersPerCubicInch: function(v){return FuelEconomyLogic(v,'MIN');},
            fromMetersPerCubicMeter: function(v){return FuelEconomyLogic(v,'MM');},
            fromMetersPerCubicYard: function(v){return FuelEconomyLogic(v,'MYD');},
            fromMetersPerCupUK: function(v){return FuelEconomyLogic(v,'MCUPUK');},
            fromMetersPerCupUS: function(v){return FuelEconomyLogic(v,'MCUPUS');},
            fromMetersPerFluidOunceUK: function(v){return FuelEconomyLogic(v,'MFOZUK');},
            fromMetersPerFluidOunceUS: function(v){return FuelEconomyLogic(v,'MFOZUS');},
            fromMetersPerGallonUK: function(v){return FuelEconomyLogic(v,'MGALUK');},
            fromMetersPerGallonUS: function(v){return FuelEconomyLogic(v,'MGALUS');},
            fromMetersPerLiter: function(v){return FuelEconomyLogic(v,'ML');},
            fromMetersPerPintUK: function(v){return FuelEconomyLogic(v,'MPTUK');},
            fromMetersPerPintUS: function(v){return FuelEconomyLogic(v,'MPTUS');},
            fromMetersPerQuartUK: function(v){return FuelEconomyLogic(v,'MQTUK');},
            fromMetersPerQuartUS: function(v){return FuelEconomyLogic(v,'MQTUS');},
            fromMilesPerGallonUK: function(v){return FuelEconomyLogic(v,'MIGALUK');},
            fromMilesPerGallonUS: function(v){return FuelEconomyLogic(v,'MIGALUS');},
            fromMilesPerLiterUS: function(v){return FuelEconomyLogic(v,'MIL');},
            fromNauticalMilesPerGallonUS: function(v){return FuelEconomyLogic(v,'NMIGAL');},
            fromNauticalMilesPerLiter: function(v){return FuelEconomyLogic(v,'NMIL');},
            fromPetametersPerLiter: function(v){return FuelEconomyLogic(v,'PML');},
            fromTerametersPerLiter: function(v){return FuelEconomyLogic(v,'TML');}
        }, Length: {
            fromAngstroms: function(v){return LengthLogic(v,'A');},
            fromAttometers: function(v){return LengthLogic(v,'AM');},
            fromBarleycorns: function(v){return LengthLogic(v,'BC');},
            fromCablesImperial: function(v){return LengthLogic(v,'CBLIMP');},
            fromCablesInternational: function(v){return LengthLogic(v,'CBLIN');},
            fromCablesUSCustomary: function(v){return LengthLogic(v,'CBLUS');},
            fromCaliber: function(v){return LengthLogic(v,'CL');},
            fromCentiinches: function(v){return LengthLogic(v,'CIN');},
            fromCentimeters: function(v){return LengthLogic(v,'CM');},
            fromChains: function(v){return LengthLogic(v,'CH');},
            fromCubits: function(v){return LengthLogic(v,'CU');},
            fromDecimeters: function(v){return LengthLogic(v,'DM');},
            fromDekameters: function(v){return LengthLogic(v,'DAM');},
            fromElls: function(v){return LengthLogic(v,'ELL');},
            fromExameters: function(v){return LengthLogic(v,'EM');},
            fromFathoms: function(v){return LengthLogic(v,'FTM');},
            fromFeet: function(v){return LengthLogic(v,'FT');},
            fromFemtometers: function(v){return LengthLogic(v,'FM');},
            fromFingers: function(v){return LengthLogic(v,'FING');},
            fromFurlongs: function(v){return LengthLogic(v,'FUR');},
            fromGigameters: function(v){return LengthLogic(v,'GM');},
            fromHands: function(v){return LengthLogic(v,'HAND');},
            fromHectometers: function(v){return LengthLogic(v,'HM');},
            fromInches: function(v){return LengthLogic(v,'IN');},
            fromKilometers: function(v){return LengthLogic(v,'KM');},
            fromKiloyards: function(v){return LengthLogic(v,'KYD');},
            fromLeagues: function(v){return LengthLogic(v,'LEA');},
            fromLightYears: function(v){return LengthLogic(v,'LY');},
            fromLinks: function(v){return LengthLogic(v,'LNK');},
            fromMegameters: function(v){return LengthLogic(v,'MM');},
            fromMeters: function(v){return LengthLogic(v,'M');},
            fromMicroinches: function(v){return LengthLogic(v,'MUIN');},
            fromMicrometers: function(v){return LengthLogic(v,'MUM');},
            fromMicrons: function(v){return LengthLogic(v,'MURM');},
            fromMiles: function(v){return LengthLogic(v,'MI');},
            fromMillimeters: function(v){return LengthLogic(v,'MILM');},
            fromNails: function(v){return LengthLogic(v,'NAIL');},
            fromNanometers: function(v){return LengthLogic(v,'NM');},
            fromNauticalLeaguesInternational: function(v){return LengthLogic(v,'NLEAIN');},
            fromNauticalLeaguesUK: function(v){return LengthLogic(v,'NLEAUK');},
            fromNauticalMilesInternational: function(v){return LengthLogic(v,'NMIINT');},
            fromNauticalMilesUK: function(v){return LengthLogic(v,'NMIUK');},
            fromNauticalMilesUSCustomary: function(v){return LengthLogic(v,'NMIUS');},
            fromPerches: function(v){return LengthLogic(v,'PER');},
            fromPetameters: function(v){return LengthLogic(v,'PEM');},
            fromPicometers: function(v){return LengthLogic(v,'PM');},
            fromPoles: function(v){return LengthLogic(v,'POL');},
            fromRods: function(v){return LengthLogic(v,'RD');},
            fromRopes: function(v){return LengthLogic(v,'ROPE');},
            fromSpans: function(v){return LengthLogic(v,'SPAN');},
            fromTerameters: function(v){return LengthLogic(v,'TM');},
            fromThousandthInches: function(v){return LengthLogic(v,'TIN');},
            fromYards: function(v){return LengthLogic(v,'YD');}
        }, Mass: {
            fromAttograms: function(v){return MassLogic(v,'AG');},
            fromCarats: function(v){return MassLogic(v,'CT');},
            fromCentigrams: function(v){return MassLogic(v,'CG');},
            fromCentners: function(v){return MassLogic(v,'CWT');},
            fromDecigrams: function(v){return MassLogic(v,'DG');},
            fromDekagrams: function(v){return MassLogic(v,'DAG');},
            fromExagrams: function(v){return MassLogic(v,'EG');},
            fromFemtograms: function(v){return MassLogic(v,'FG');},
            fromGamma: function(v){return MassLogic(v,'GAMM');},
            fromGigagrams: function(v){return MassLogic(v,'GG');},
            fromGrams: function(v){return MassLogic(v,'G');},
            fromHectograms: function(v){return MassLogic(v,'HG');},
            fromKilograms: function(v){return MassLogic(v,'KG');},
            fromKilopounds: function(v){return MassLogic(v,'KIP');},
            fromKilotonsMetric: function(v){return MassLogic(v,'TK');},
            fromMegagrams: function(v){return MassLogic(v,'MG');},
            fromMicrograms: function(v){return MassLogic(v,'MUG');},
            fromMilligrams: function(v){return MassLogic(v,'MILG');},
            fromNanograms: function(v){return MassLogic(v,'NG');},
            fromOuncesMetric: function(v){return MassLogic(v,'MOZ');},
            fromOuncesUS: function(v){return MassLogic(v,'USOZ');},
            fromPetagrams: function(v){return MassLogic(v,'PEG');},
            fromPicograms: function(v){return MassLogic(v,'PG');},
            fromPounds: function(v){return MassLogic(v,'LB');},
            fromQuintals: function(v){return MassLogic(v,'QU');},
            fromSlugs: function(v){return MassLogic(v,'SLUG');},
            fromStonesUK: function(v){return MassLogic(v,'STUK');},
            fromStonesUS: function(v){return MassLogic(v,'STUS');},
            fromTeragrams: function(v){return MassLogic(v,'TG');},
            fromTonsImperial: function(v){return MassLogic(v,'TI');},
            fromTonsMetric: function(v){return MassLogic(v,'TM');},
            fromTonsUS: function(v){return MassLogic(v,'TUS');}
        }, MetricPrefix: {
            fromAtto: function(v){return MetricPrefixLogic(v,'A');},
            fromCenti: function(v){return MetricPrefixLogic(v,'C');},
            fromDeci: function(v){return MetricPrefixLogic(v,'D');},
            fromDeka: function(v){return MetricPrefixLogic(v,'DA');},
            fromExa: function(v){return MetricPrefixLogic(v,'E');},
            fromFemto: function(v){return MetricPrefixLogic(v,'F');},
            fromGiga: function(v){return MetricPrefixLogic(v,'G');},
            fromHecto: function(v){return MetricPrefixLogic(v,'H');},
            fromKilo: function(v){return MetricPrefixLogic(v,'K');},
            fromMega: function(v){return MetricPrefixLogic(v,'M');},
            fromMicro: function(v){return MetricPrefixLogic(v,'MU');},
            fromMilli: function(v){return MetricPrefixLogic(v,'MIL');},
            fromNano: function(v){return MetricPrefixLogic(v,'N');},
            fromNoPrefix: function(v){return MetricPrefixLogic(v,'NN');},
            fromPeta: function(v){return MetricPrefixLogic(v,'PE');},
            fromPico: function(v){return MetricPrefixLogic(v,'P');},
            fromTera: function(v){return MetricPrefixLogic(v,'T');},
            fromYocto: function(v){return MetricPrefixLogic(v,'YO');},
            fromYotta: function(v){return MetricPrefixLogic(v,'Y');},
            fromZepto: function(v){return MetricPrefixLogic(v,'ZO');},
            fromZetta: function(v){return MetricPrefixLogic(v,'Z');}
        }, NumericBase: {
            fromBase11: function(v){return NumericBaseLogic(v,'B11');},
            fromBase12: function(v){return NumericBaseLogic(v,'B12');},
            fromBase13: function(v){return NumericBaseLogic(v,'B13');},
            fromBase14: function(v){return NumericBaseLogic(v,'B14');},
            fromBase15: function(v){return NumericBaseLogic(v,'B15');},
            fromBase17: function(v){return NumericBaseLogic(v,'B17');},
            fromBase18: function(v){return NumericBaseLogic(v,'B18');},
            fromBase19: function(v){return NumericBaseLogic(v,'B19');},
            fromBase20: function(v){return NumericBaseLogic(v,'B20');},
            fromBase21: function(v){return NumericBaseLogic(v,'B21');},
            fromBase22: function(v){return NumericBaseLogic(v,'B22');},
            fromBase23: function(v){return NumericBaseLogic(v,'B23');},
            fromBase24: function(v){return NumericBaseLogic(v,'B24');},
            fromBase25: function(v){return NumericBaseLogic(v,'B25');},
            fromBase26: function(v){return NumericBaseLogic(v,'B26');},
            fromBase27: function(v){return NumericBaseLogic(v,'B27');},
            fromBase28: function(v){return NumericBaseLogic(v,'B28');},
            fromBase29: function(v){return NumericBaseLogic(v,'B29');},
            fromBase3: function(v){return NumericBaseLogic(v,'B3');},
            fromBase30: function(v){return NumericBaseLogic(v,'B30');},
            fromBase31: function(v){return NumericBaseLogic(v,'B31');},
            fromBase32: function(v){return NumericBaseLogic(v,'B32');},
            fromBase33: function(v){return NumericBaseLogic(v,'B33');},
            fromBase34: function(v){return NumericBaseLogic(v,'B34');},
            fromBase35: function(v){return NumericBaseLogic(v,'B35');},
            fromBase36: function(v){return NumericBaseLogic(v,'B36');},
            fromBase4: function(v){return NumericBaseLogic(v,'B4');},
            fromBase5: function(v){return NumericBaseLogic(v,'B5');},
            fromBase6: function(v){return NumericBaseLogic(v,'B6');},
            fromBase7: function(v){return NumericBaseLogic(v,'B7');},
            fromBase9: function(v){return NumericBaseLogic(v,'B9');},
            fromBinary: function(v){return NumericBaseLogic(v,'B2');},
            fromDecimal: function(v){return NumericBaseLogic(v,'B10');},
            fromHexadecimal: function(v){return NumericBaseLogic(v,'B16');},
            fromOctal: function(v){return NumericBaseLogic(v,'B8');}
        }, Pressure: {
            fromAttopascals: function(v){return PressureLogic(v,'APA');},
            fromBars: function(v){return PressureLogic(v,'BAR');},
            fromBaryes: function(v){return PressureLogic(v,'BA');},
            fromCentimetersOfMercury0C: function(v){return PressureLogic(v,'CMHG');},
            fromCentimetersOfWater4C: function(v){return PressureLogic(v,'CMW4');},
            fromCentipascals: function(v){return PressureLogic(v,'CPA');},
            fromDecibars: function(v){return PressureLogic(v,'DBAR');},
            fromDecipascals: function(v){return PressureLogic(v,'DPA');},
            fromDekapascals: function(v){return PressureLogic(v,'DAPA');},
            fromDynesPerSquareCentimeter: function(v){return PressureLogic(v,'DYNCM');},
            fromExapascals: function(v){return PressureLogic(v,'EPA');},
            fromFeetOfSeaWater: function(v){return PressureLogic(v,'FSW');},
            fromFeetOfWater4C: function(v){return PressureLogic(v,'FTW4');},
            fromFeetOfWater60F: function(v){return PressureLogic(v,'FTW60');},
            fromFemtopascals: function(v){return PressureLogic(v,'FPA');},
            fromGigapascals: function(v){return PressureLogic(v,'GPA');},
            fromGramsPerSquareCentimeter: function(v){return PressureLogic(v,'GFCM');},
            fromHectopascals: function(v){return PressureLogic(v,'HPA');},
            fromInchesOfMercury32F: function(v){return PressureLogic(v,'INHG32');},
            fromInchesOfMercury60F: function(v){return PressureLogic(v,'INHG60');},
            fromInchesOfWater4C: function(v){return PressureLogic(v,'INW4');},
            fromInchesOfWater60F: function(v){return PressureLogic(v,'INW60');},
            fromKSI: function(v){return PressureLogic(v,'KSI');},
            fromKilogramsPerSquareCentimeter: function(v){return PressureLogic(v,'KGFCM');},
            fromKilogramsPerSquareMeter: function(v){return PressureLogic(v,'KGFM');},
            fromKilogramsPerSquareMillimeter: function(v){return PressureLogic(v,'KFGMM');},
            fromKilonewtonsPerSquareMeter: function(v){return PressureLogic(v,'KNM');},
            fromKilopascals: function(v){return PressureLogic(v,'KPA');},
            fromKipsPerSquareInch: function(v){return PressureLogic(v,'KIPFIN');},
            fromLongTonsPerSquareFoot: function(v){return PressureLogic(v,'TFFTL');},
            fromLongTonsPerSquareInch: function(v){return PressureLogic(v,'TFINL');},
            fromMegapascals: function(v){return PressureLogic(v,'MPA');},
            fromMetersOfSeaWater: function(v){return PressureLogic(v,'MSW');},
            fromMetersOfWater4C: function(v){return PressureLogic(v,'MW4');},
            fromMicrobars: function(v){return PressureLogic(v,'MUBAR');},
            fromMicropascals: function(v){return PressureLogic(v,'MUPA');},
            fromMillibars: function(v){return PressureLogic(v,'MILBAR');},
            fromMillimetersOfMercury0C: function(v){return PressureLogic(v,'MMHG');},
            fromMillimetersOfWater4C: function(v){return PressureLogic(v,'MMW4');},
            fromMillipascals: function(v){return PressureLogic(v,'MILPA');},
            fromNanopascals: function(v){return PressureLogic(v,'NPA');},
            fromNewtonsPerSquareCentimeter: function(v){return PressureLogic(v,'NCM');},
            fromNewtonsPerSquareMeter: function(v){return PressureLogic(v,'NM');},
            fromNewtonsPerSquareMillimeter: function(v){return PressureLogic(v,'NMM');},
            fromPSI: function(v){return PressureLogic(v,'PSI');},
            fromPascals: function(v){return PressureLogic(v,'PA');},
            fromPetapascals: function(v){return PressureLogic(v,'PEPA');},
            fromPicopascals: function(v){return PressureLogic(v,'PPA');},
            fromPieze: function(v){return PressureLogic(v,'PIZ');},
            fromPoundalsPerSquareFoot: function(v){return PressureLogic(v,'PDLFT');},
            fromPoundsPerSquareFoot: function(v){return PressureLogic(v,'LBFFT');},
            fromPoundsPerSquareInch: function(v){return PressureLogic(v,'LBFIN');},
            fromShortTonsPerSquareFoot: function(v){return PressureLogic(v,'TFFTS');},
            fromShortTonsPerSquareInch: function(v){return PressureLogic(v,'TFINS');},
            fromStandardAtmospheres: function(v){return PressureLogic(v,'ATM');},
            fromSthenesPerSquareMeter: function(v){return PressureLogic(v,'SM');},
            fromTechnicalAtmospheres: function(v){return PressureLogic(v,'AT');},
            fromTerapascals: function(v){return PressureLogic(v,'TPA');},
            fromTorrs: function(v){return PressureLogic(v,'TORR');}
        }, Speed: {
            fromCentimetersPerHour: function(v){return SpeedLogic(v,'CMH');},
            fromCentimetersPerMinute: function(v){return SpeedLogic(v,'CMM');},
            fromCentimetersPerSecond: function(v){return SpeedLogic(v,'CMS');},
            fromEarthsVelocity: function(v){return SpeedLogic(v,'EV');},
            fromFeetPerHour: function(v){return SpeedLogic(v,'FTH');},
            fromFeetPerMinute: function(v){return SpeedLogic(v,'FTM');},
            fromFeetPerSecond: function(v){return SpeedLogic(v,'FTS');},
            fromFirstCosmicVelocity: function(v){return SpeedLogic(v,'CV1');},
            fromInchesPerHour: function(v){return SpeedLogic(v,'INH');},
            fromInchesPerMinute: function(v){return SpeedLogic(v,'INM');},
            fromInchesPerSecond: function(v){return SpeedLogic(v,'INS');},
            fromKilometersPerHour: function(v){return SpeedLogic(v,'KMH');},
            fromKilometersPerMinute: function(v){return SpeedLogic(v,'KMM');},
            fromKilometersPerSecond: function(v){return SpeedLogic(v,'KMS');},
            fromKnots: function(v){return SpeedLogic(v,'KN');},
            fromLight: function(v){return SpeedLogic(v,'C');},
            fromMach: function(v){return SpeedLogic(v,'MA');},
            fromMetersPerHour: function(v){return SpeedLogic(v,'MH');},
            fromMetersPerMinute: function(v){return SpeedLogic(v,'MM');},
            fromMetersPerSecond: function(v){return SpeedLogic(v,'MS');},
            fromMilesPerHour: function(v){return SpeedLogic(v,'MIH');},
            fromMilesPerMinute: function(v){return SpeedLogic(v,'MIM');},
            fromMilesPerSecond: function(v){return SpeedLogic(v,'MIS');},
            fromMillimetersPerHour: function(v){return SpeedLogic(v,'MMH');},
            fromMillimetersPerMinute: function(v){return SpeedLogic(v,'MMM');},
            fromMillimetersPerSecond: function(v){return SpeedLogic(v,'MMS');},
            fromSecondCosmicVelocity: function(v){return SpeedLogic(v,'CV2');},
            fromSoundsInAir: function(v){return SpeedLogic(v,'SA');},
            fromSoundsInWater: function(v){return SpeedLogic(v,'SW');},
            fromThirdCosmicVelocity: function(v){return SpeedLogic(v,'CV3');},
            fromYardsPerHour: function(v){return SpeedLogic(v,'YH');},
            fromYardsPerMinute: function(v){return SpeedLogic(v,'YM');},
            fromYardsPerSecond: function(v){return SpeedLogic(v,'YS');}
        }, Temperature: {
            fromCelsius: function(v){return TemperatureLogic(v,'C');},
            fromFahrenheit: function(v){return TemperatureLogic(v,'F');},
            fromKelvin: function(v){return TemperatureLogic(v,'K');},
            fromRankine: function(v){return TemperatureLogic(v,'R');},
            fromReaumur: function(v){return TemperatureLogic(v,'RE');}
        }, Time: {
            fromAttoseconds: function(v){return TimeLogic(v,'AS');},
            fromCenturies: function(v){return TimeLogic(v,'C');},
            fromDays: function(v){return TimeLogic(v,'D');},
            fromDecades: function(v){return TimeLogic(v,'DE');},
            fromFemtoseconds: function(v){return TimeLogic(v,'FS');},
            fromFortnights: function(v){return TimeLogic(v,'FN');},
            fromGregorianYears: function(v){return TimeLogic(v,'GY');},
            fromHours: function(v){return TimeLogic(v,'H');},
            fromJulianYears: function(v){return TimeLogic(v,'JY');},
            fromLeapYears: function(v){return TimeLogic(v,'LY');},
            fromMicroseconds: function(v){return TimeLogic(v,'MUS');},
            fromMillenniums: function(v){return TimeLogic(v,'M');},
            fromMilliseconds: function(v){return TimeLogic(v,'MS');},
            fromMinutes: function(v){return TimeLogic(v,'MIN');},
            fromMonths: function(v){return TimeLogic(v,'MON');},
            fromNanoseconds: function(v){return TimeLogic(v,'NS');},
            fromPicoseconds: function(v){return TimeLogic(v,'PS');},
            fromSeconds: function(v){return TimeLogic(v,'S');},
            fromWeeks: function(v){return TimeLogic(v,'WK');},
            fromYears: function(v){return TimeLogic(v,'Y');}
        }, Torque: {
            fromDyneCentimeters: function(v){return TorqueLogic(v,'DYNCM');},
            fromDyneMeters: function(v){return TorqueLogic(v,'DYNM');},
            fromDyneMillimeters: function(v){return TorqueLogic(v,'DYNMM');},
            fromGramCentimeters: function(v){return TorqueLogic(v,'GFCM');},
            fromGramMeters: function(v){return TorqueLogic(v,'GFM');},
            fromGramMillimeters: function(v){return TorqueLogic(v,'GFMM');},
            fromKilogramCentimeters: function(v){return TorqueLogic(v,'KGFCM');},
            fromKilogramMeters: function(v){return TorqueLogic(v,'KGFM');},
            fromKilogramMillimeters: function(v){return TorqueLogic(v,'KGFMM');},
            fromKilonewtonMeters: function(v){return TorqueLogic(v,'KNM');},
            fromNewtonCentimeters: function(v){return TorqueLogic(v,'NCM');},
            fromNewtonMeters: function(v){return TorqueLogic(v,'NM');},
            fromNewtonMillimeters: function(v){return TorqueLogic(v,'NMM');},
            fromOunceFeet: function(v){return TorqueLogic(v,'OZFFT');},
            fromOunceInches: function(v){return TorqueLogic(v,'OZFIN');},
            fromPoundFeet: function(v){return TorqueLogic(v,'LBFFT');},
            fromPoundInches: function(v){return TorqueLogic(v,'LBFIN');}
        }, Volume: {
            fromAcreFeetUSSurvey: function(v){return VolumeLogic(v,'ACFTUS');},
            fromAcreInches: function(v){return VolumeLogic(v,'ACIN');},
            fromArceFeet: function(v){return VolumeLogic(v,'ACFTO');},
            fromAttoliters: function(v){return VolumeLogic(v,'AL');},
            fromBarrelsOfOil: function(v){return VolumeLogic(v,'BBLO');},
            fromBarrelsUK: function(v){return VolumeLogic(v,'BBLUK');},
            fromBarrelsUS: function(v){return VolumeLogic(v,'BBLUS');},
            fromBoardFeet: function(v){return VolumeLogic(v,'FBM');},
            fromCentiliters: function(v){return VolumeLogic(v,'CL');},
            fromCords: function(v){return VolumeLogic(v,'CORD');},
            fromCubicCentimeters: function(v){return VolumeLogic(v,'CM');},
            fromCubicDecimeters: function(v){return VolumeLogic(v,'DM');},
            fromCubicFeet: function(v){return VolumeLogic(v,'FT');},
            fromCubicInches: function(v){return VolumeLogic(v,'IN');},
            fromCubicKilometers: function(v){return VolumeLogic(v,'KM');},
            fromCubicMeters: function(v){return VolumeLogic(v,'M');},
            fromCubicMiles: function(v){return VolumeLogic(v,'MI');},
            fromCubicMillimeters: function(v){return VolumeLogic(v,'MM');},
            fromCubicYards: function(v){return VolumeLogic(v,'YD');},
            fromCupsMetric: function(v){return VolumeLogic(v,'CUPM');},
            fromCupsUK: function(v){return VolumeLogic(v,'CUPUK');},
            fromCupsUS: function(v){return VolumeLogic(v,'CUPUS');},
            fromDeciliters: function(v){return VolumeLogic(v,'DL');},
            fromDecisteres: function(v){return VolumeLogic(v,'DECI');},
            fromDekaliters: function(v){return VolumeLogic(v,'DAL');},
            fromDekasteres: function(v){return VolumeLogic(v,'DEKA');},
            fromDessertspoonsUK: function(v){return VolumeLogic(v,'DSTSPNUK');},
            fromDessertspoonsUS: function(v){return VolumeLogic(v,'DSTSPNUS');},
            fromDrops: function(v){return VolumeLogic(v,'DROP');},
            fromExaliters: function(v){return VolumeLogic(v,'EL');},
            fromFemtoliters: function(v){return VolumeLogic(v,'FL');},
            fromFluidOuncesUK: function(v){return VolumeLogic(v,'FLOZUK');},
            fromFluidOuncesUS: function(v){return VolumeLogic(v,'FLOZUS');},
            fromGallonsUK: function(v){return VolumeLogic(v,'GALUK');},
            fromGallonsUS: function(v){return VolumeLogic(v,'GALUS');},
            fromGigaliters: function(v){return VolumeLogic(v,'GL');},
            fromGillsUK: function(v){return VolumeLogic(v,'GILUK');},
            fromGillsUS: function(v){return VolumeLogic(v,'GILUS');},
            fromHectoliters: function(v){return VolumeLogic(v,'HL');},
            fromHogsheads: function(v){return VolumeLogic(v,'HOG');},
            fromHundredCubicFeet: function(v){return VolumeLogic(v,'CCF');},
            fromKiloliters: function(v){return VolumeLogic(v,'KL');},
            fromLiters: function(v){return VolumeLogic(v,'L');},
            fromMegaliters: function(v){return VolumeLogic(v,'ML');},
            fromMicroliters: function(v){return VolumeLogic(v,'MUL');},
            fromMilliliters: function(v){return VolumeLogic(v,'MILL');},
            fromMinimsUK: function(v){return VolumeLogic(v,'MINIUK');},
            fromMinimsUS: function(v){return VolumeLogic(v,'MINIUS');},
            fromNanoliters: function(v){return VolumeLogic(v,'NL');},
            fromPetaliters: function(v){return VolumeLogic(v,'PEL');},
            fromPicoliters: function(v){return VolumeLogic(v,'PL');},
            fromPintsUK: function(v){return VolumeLogic(v,'PTUK');},
            fromPintsUS: function(v){return VolumeLogic(v,'PTUS');},
            fromQuartsUK: function(v){return VolumeLogic(v,'QTUK');},
            fromQuartsUS: function(v){return VolumeLogic(v,'QTUS');},
            fromRegisterTons: function(v){return VolumeLogic(v,'REGTON');},
            fromSteres: function(v){return VolumeLogic(v,'ST');},
            fromTablespoonsMetric: function(v){return VolumeLogic(v,'TBSPM');},
            fromTablespoonsUK: function(v){return VolumeLogic(v,'TBSPUK');},
            fromTablespoonsUS: function(v){return VolumeLogic(v,'TBSPUS');},
            fromTeaspoonsMetric: function(v){return VolumeLogic(v,'TSPM');},
            fromTeaspoonsUK: function(v){return VolumeLogic(v,'TSPUK');},
            fromTeaspoonsUS: function(v){return VolumeLogic(v,'TSPUS');},
            fromTeraliters: function(v){return VolumeLogic(v,'TL');},
            fromTuns: function(v){return VolumeLogic(v,'TUN');}
        }
    };
})();