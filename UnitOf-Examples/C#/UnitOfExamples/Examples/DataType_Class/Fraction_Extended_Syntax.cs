/**
 * https://github.com/Digidemic/UnitOf
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

using System;
using System.Collections.Generic;
using System.Text;

namespace UnitOfExamples.Examples.DataType_Class
{
    /**
     * Several independent example of converting from and to fractions.
     */
    public class Fraction_Extended_Syntax
    {
        public static void run()
        {
            p("\n-=-=-=-=-=-=-=-=-\nDataType_Class > Fraction_Extended_Syntax");

            /*
            Simply the following existing fractions.
            */
            string fracToSimplify2o4 = new UnitOf.DataType("2/4").ToFraction(); //Returns "1/2"
            string fracToSimplify4o2 = new UnitOf.DataType("4/2").ToFraction(); //Returns "2" or "2/1"
            string fracToSimplify2o5 = new UnitOf.DataType("2/5").ToFraction(); //Returns "2/5", cant get any simpler 
            string fracToSimplify_default1o2 = new UnitOf.DataType("Will error, return default").ToFraction("1/2"); //Cannot create a fraction from this, default "1/2" is returned

            /*
            Decimal to fraction
            Convert whole numbers, decimals, and numbers in strings to fraction equivalent.
            */
            string numToFrac_dot5 = new UnitOf.DataType(.5).ToFraction();   //Returns "1/2"
            string numToFrac_dot75 = new UnitOf.DataType(.75).ToFraction(); //Returns "3/4"
            string numToFrac_2 = new UnitOf.DataType(2).ToFraction();       //Returns "2" or "2/1"
            string strNumToFrac_strNeg2 = new UnitOf.DataType("-2").ToFraction();  //Returns "-2" or "-2/1"

            /*
            Fraction to Decimal
            Convert the following fractions to their decimal (double) equivalent.
            */
            double fracToDecimal_2o4 = new UnitOf.DataType("2/4").ToDouble();   //Returns 0.5
            double fracToDecimal_1o2 = new UnitOf.DataType("1/2").ToDouble();   //Returns 0.5
            double fracToDecimal_4o2 = new UnitOf.DataType("4/2").ToDouble();   //Returns 2

            /*
            Print results
            */
            pt("fracToSimplify2o4: " + fracToSimplify2o4);  //Returns "1/2"
            pt("fracToSimplify4o2: " + fracToSimplify4o2);  //Returns "2" or "2/1"
            pt("fracToSimplify2o5: " + fracToSimplify2o5);  //Returns "2/5", cant get any simpler 
            pt("fracToSimplify_default1o2: " + fracToSimplify_default1o2);  //Cannot create a fraction from this, default "1/2" is returned
            pt("numToFrac_dot5: " + numToFrac_dot5);        //Returns "1/2"
            pt("numToFrac_dot75: " + numToFrac_dot75);      //Returns "3/4"
            pt("numToFrac_2: " + numToFrac_2);              //Returns "2" or "2/1"
            pt("strNumToFrac_2: " + strNumToFrac_strNeg2);  //Returns "-2" or "-2/1"
            pt("fracToDecimal_2o4: " + fracToDecimal_2o4);  //Returns 0.5
            pt("fracToDecimal_1o2: " + fracToDecimal_1o2);  //Returns 0.5
            pt("fracToDecimal_4o2: " + fracToDecimal_4o2);  //Returns 2
        }

        //-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        //Print object passed, starting with a tab
        private static void pt(object o){
            p("\t" + o);
        }

        //Print object passed
        private static void p(object o){
            Console.WriteLine(o.ToString());
        }
    }
}
