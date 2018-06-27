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
/// FuelEconomy Units
/// 
/// All unit values are conversions of MCM (Meter per Cubic Centimeter) at the value of 1 converted into each unit.
/// </summary>
[Serializable]
public struct N {
    internal static readonly double CML=1e5;                //Centimeter per Liter
    internal static readonly double DAML=1e2;               //Dekameter per Liter
    internal static readonly double EML=1e-15;              //Exameter per Liter
    internal static readonly double GML=1e-6;               //Gigameter per Liter
    internal static readonly double HML=1e1;                //Hectometer per Liter
    internal static readonly double KMGALUK=4.546099293921; //Kilometer per Gallon (UK)
    internal static readonly double KMGALUS=3.7854117834;   //Kilometer per Gallon (US)
    internal static readonly double KML=1;                  //Kilometer per Liter
    internal static readonly double MML=1e-3;               //Megameter per Liter
    internal static readonly double MCM=1;                  //Meter per Cubic Centimeter
    internal static readonly double MFT=28316.84659319;     //Meter per Cubic Foot
    internal static readonly double MIN=16.38706400127;     //Meter per Cubic Inch
    internal static readonly double MM=1e6;                 //Meter per Cubic Meter
    internal static readonly double MYD=764554.8581679;     //Meter per Cubic Yard
    internal static readonly double MCUPUK=284.1312059185;  //Meter per Cup (UK)
    internal static readonly double MCUPUS=236.5882364849;  //Meter per Cup (US)
    internal static readonly double MFOZUK=28.41312059185;  //Meter per Fluid Ounce (UK)
    internal static readonly double MFOZUS=29.57352956411;  //Meter per Fluid Ounce (US)
    internal static readonly double MGALUK=4546.099293921;  //Meter per Gallon (UK)
    internal static readonly double MGALUS=3785.4117834;    //Meter per Gallon (US)
    internal static readonly double ML=1e3;                 //Meter per Liter
    internal static readonly double MPTUK=568.2624116755;   //Meter per Pint (UK)
    internal static readonly double MPTUS=473.1764729698;   //Meter per Pint (US)
    internal static readonly double MQTUK=1136.524822963;   //Meter per Quart (UK)
    internal static readonly double MQTUS=946.3529463874;   //Meter per Quart (US)
    internal static readonly double MIGALUK=2.824809362797; //Mile per Gallon (UK)
    internal static readonly double MIGALUS=2.352145832948; //Mile per Gallon (US)
    internal static readonly double MIL=1/1.609344;         //Mile per Liter (US)
    internal static readonly double NMIGAL=1/0.4895755247;  //Nautical Mile per Gallon (US)   
    internal static readonly double NMIL=1/1.85324496;      //Nautical Mile per Liter
    internal static readonly double PML=1e-12;              //Petameter per Liter
    internal static readonly double TML=1e-9;               //Terameter per Liter   
}