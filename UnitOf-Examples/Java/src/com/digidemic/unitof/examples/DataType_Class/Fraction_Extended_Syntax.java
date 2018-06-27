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

package com.digidemic.unitof.examples.DataType_Class;

import com.digidemic.unitof.UnitOf;

/**
 * Several independent example of converting from and to fractions.
 */
public class Fraction_Extended_Syntax {
    public static void run(){
        p("\n-=-=-=-=-=-=-=-=-\nDataType_Class > Fraction_Extended_Syntax");
        
        /*
        Simply the following existing fractions.
        */  
        String fracToSimplify2o4 = new UnitOf.DataType("2/4").toFraction(); //Returns "1/2"
        String fracToSimplify4o2 = new UnitOf.DataType("4/2").toFraction(); //Returns "2" or "2/1"
        String fracToSimplify2o5 = new UnitOf.DataType("2/5").toFraction(); //Returns "2/5", cant get any simpler 
        String fracToSimplify_default1o2 = new UnitOf.DataType("Will error, return default").toFraction("1/2"); //Cannot create a fraction from this, default "1/2" is returned

        /*
        Decimal to fraction
        Convert whole numbers, decimals, and numbers in strings to fraction equivalent.
        */
        String numToFrac_dot5 = new UnitOf.DataType(.5).toFraction();   //Returns "1/2"
        String numToFrac_dot75 = new UnitOf.DataType(.75).toFraction(); //Returns "3/4"
        String numToFrac_2 = new UnitOf.DataType(2).toFraction();       //Returns "2" or "2/1"
        String strNumToFrac_strNeg2 = new UnitOf.DataType("-2").toFraction();   //Returns "-2" or "-2/1"
        
        /*
        Fraction to Decimal
        Convert the following fractions to their decimal (double) equivalent.
        */
        double fracToDecimal_2o4 = new UnitOf.DataType("2/4").toDouble();  //Returns 0.5
        double fracToDecimal_1o2 = new UnitOf.DataType("1/2").toDouble();  //Returns 0.5
        double fracToDecimal_4o2 = new UnitOf.DataType("4/2").toDouble();  //Returns 2
        
        /*
        Print results
        */
        pt("fracToSimplify2o4: " + fracToSimplify2o4);  //Returns "1/2"
        pt("fracToSimplify4o2: " + fracToSimplify4o2);  //Returns "2" or "2/1"
        pt("fracToSimplify2o5: " + fracToSimplify2o5);  //Returns "2/5", cant get any simpler 
        pt("fracToSimplify_default1o2: " + fracToSimplify_default1o2);  //Cannot create a fraction from this, default "1/2"
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
    private static void pt(Object o){
        p("\t" + o);
    }
    
    //Print object passed
    private static void p(Object o){
        System.out.println(String.valueOf(o));
    }
}
