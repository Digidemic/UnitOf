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
     * Normal Syntax (Simple):
     * 
     *   Simply parse the value passed.
     *   An optional single parameter of the default value of true or false can be passed.
     *   Examples:
     *   new UnitOf.DataType("true").ToBoolean();        //Returns true
     *   new UnitOf.DataType("Invalid").ToBoolean();     //Returns false
     *   new UnitOf.DataType("Invalid").ToBoolean(true); //Returns true
     *
     *-=-=-=-=-=-=-=-=-=-=-=-
     *   
     * Extended Syntax (Complex):
     * 
     *   Rather than just converting the passed value to true or false as the "Normal Syntax" does, 
     *   toBoolean can compare the passed value against a collection of other Objects to find if there match, even of different data types.
     *   When a match exists between the passed object and the passed collection, true is returned. otherwise it is false.
     *   Constraints can be strengthened or loosened by enforcing case sensitivity or matching by containing only part of the value passed.
     *
     *   UnitOf.ToBoolean() allows passing in a collection of values where is the variable equals any one of them true will be returned.
     *   This can be combined with the other 2 parameters, caseSensitive and contains.
     *   caseSensitive being the UnitOf.DataType variable must match the casing of collection to return true.
     *   EX: caseSensitive = true,   "UnitOf" & "unitof" = false
     *       caseSensitive = false,  "UnitOf" & "unitof" = true
     *   contains being the collection passed has an element with a sequence of characters that are contains in the UnitOf.DataType variable.
     *   EX: contains = true,    "UnitOf" & "Unit" = true
     *       contains = false,   "UnitOf" & "tOf" = false
     *   These can be combined something like the following will return true: "uNiTOF" = "UNIt"
     */
    public class Boolean_Extended_Syntax
    {

        /*
        Determine if our collection of "Unit", "unitof", or "ThisIsUnitOf" matches in our UnitOf.DataType value, "UnitOf" toggling our matching settings.
        */
        public static void oneLiner_1_Step()
        {
            p("\n-=-=-=-=-=-=-=-=-\nDataType_Class > Boolean_Extended_Syntax > oneLiner_1_Step");
            /**
             * Returns true if "UnitOf" contains the specified sequence of char values in the same casing as the passed in UnitOf.DataType value.
             * This specified sequence of char values are: "Unit", "unitof", or "ThisIsUnitOf".
             * 
             * 1st Parameter | trueValues           | Object[]  | Objects to match the UnitOf.DataType value against: Collection passed is a String array with 3 elements, "Unit", "unitof", "ThisIsUnitOf".
             * 2nd Parameter | caseSensitive (true) | boolean   | If matching is case sensitive (can be left blank defaulting with false)
             * 3rd Parameter | contains (true)      | boolean   | If matching is less strict by only comparing the specified sequence of char value in any of the collection elements.
             *
             * Results breakdown: returns true
             * "UnitOf" == "Unit" | The proper casing exists for the first 4 characters and am only performing a contains, not equals. If equals, this would be false
             * "UnitOf" != "unitof" | CaseSensitivity (second parameter) is set to true meaning because the "u" and "o" of "unitof" are not capitalized this returns false. if casing were to be ignored this would be true.
             * "UnitOf" != "ThisIsUnitOf" | While "UnitOf" with its proper casing exists in "ThisIsUnitOf", contains does not check if the UnitOf.DataType value is contained within the collection, only the vice versa exists.
             */
            bool matchStr_Case_Contains = new UnitOf.DataType("UnitOf").ToBoolean(new string[] { "Unit", "unitof", "ThisIsUnitOf" }, true, true);//Returns true due to "Unit"

            /**
             * Returns true if "UnitOf" contains the specified sequence of char values (casing ignored) as the passed in UnitOf.DataType value.
             * This specified sequence of char values are: "Unit", "unitof", or "ThisIsUnitOf"
             * 
             * 1st Parameter | trueValues           | Object[]  | Objects to match the UnitOf.DataType value against: Collection passed is a String array with 3 elements, "Unit", "unitof", "ThisIsUnitOf".
             * 2nd Parameter | caseSensitive (false) | boolean   | If matching is case sensitive (can be left blank defaulting with false)
             * 3rd Parameter | contains (true)      | boolean   | If matching is less strict by only comparing the specified sequence of char value in any of the collection elements.
             *
             * Results breakdown: returns true
             * "UnitOf" == "Unit" | "Unit" is within "UnitOf"
             * "UnitOf" == "unitof" | "unitof" is within "UnitOf" as well as casing being ignored
             * "UnitOf" != "ThisIsUnitOf" | While "UnitOf" with its proper casing exists in "ThisIsUnitOf", contains does not check if the UnitOf.DataType value is contained within the collection, only the vice versa exists.
             */
            bool matchStr_NonCase_Contains = new UnitOf.DataType("UnitOf").ToBoolean(new string[] { "Unit", "unitof", "ThisIsUnitOf" }, false, true);//Returns true: "Unit", "unitof"

            /**
             * Returns true if "UnitOf" equals the specified sequence of char values (casing ignored) as the passed in UnitOf.DataType value.
             * This specified sequence of chars being: "Unit", "unitof", or "ThisIsUnitOf"
             * 
             * 1st Parameter | trueValues           | Object[]  | Objects to match the UnitOf.DataType value against: Collection passed is a String array with 3 elements, "Unit", "unitof", "ThisIsUnitOf".
             * 2nd Parameter | caseSensitive (false)| boolean   | If matching is case sensitive (can be left blank defaulting with false)
             * 3rd Parameter | contains (false)     | boolean   | If matching is less strict by only comparing the specified sequence of char value in any of the collection elements.
             *
             * Results breakdown: returns true
             * "UnitOf" != "Unit" | Despite casing being ignored, "UnitOf" does not equal "Unit" due to "Of" missing.
             * "UnitOf" == "unitof" | Because casing is ignored, "unitof" equals "UnitOf"
             * "UnitOf" != "ThisIsUnitOf" | "UnitOf" does not equal "ThisIsUnitOf" due to it starting with "ThisIs"
             */
            bool matchStr_NonCase_Equals = new UnitOf.DataType("UnitOf").ToBoolean(new string[] { "Unit", "unitof", "ThisIsUnitOf" });//Returns true. only "unitof"

            /**
             * Returns true if "UnitOf" contains the specified sequence of char values in the same casing as the passed in UnitOf.DataType value.
             * This specified sequence of chars being: "Unit", "unitof", or "ThisIsUnitOf"
             * 
             * 1st Parameter | trueValues           | Object[]  | Objects to match the UnitOf.DataType value against: Collection passed is a String array with 3 elements, "Unit", "unitof", "ThisIsUnitOf".
             * 2nd Parameter | caseSensitive (true) | boolean   | If matching is case sensitive (can be left blank defaulting with false)
             * 3rd Parameter | contains (false)     | boolean   | If matching is less strict by only comparing the specified sequence of char value in any of the collection elements.
             *
             * Results breakdown: returns false
             * "UnitOf" != "Unit" | While the proper casing is correct, "UnitOf" does not equal "Unit" due to "Of" missing.
             * "UnitOf" != "unitof" | "unitof" does not equals "UnitOf" because casing is not ignored
             * "UnitOf" != "ThisIsUnitOf" | "UnitOf" does not equal "ThisIsUnitOf" due to it starting with "ThisIs"
             */
            bool matchStr_Case_Equals = new UnitOf.DataType("UnitOf").ToBoolean(new string[] { "Unit", "unitof", "ThisIsUnitOf" }, true);//Returns false, no matches

            //Print results
            pt("String Passed: UnitOf | Collection passed with true value: Unit, unitof, ThisIsUnitOf");
            pt("matchStr_Case_Contains: " + matchStr_Case_Contains);        //Returns true due to "Unit"
            pt("matchStr_NonCase_Contains: " + matchStr_NonCase_Contains);  //Returns true: "Unit", "unitof"
            pt("matchStr_NonCase_Equals: " + matchStr_NonCase_Equals);      //Returns true. only "unitof"
            pt("matchStr_Case_Equals: " + matchStr_Case_Equals);            //Returns false, no matches
        }

        /*
        Using different matching data types as our collection to determine if there is a match.
        Convert a set of examples all true then all false using different DataTypes as the collection of trueValues
        */
        public static void setThenConvert_2_Steps()
        {
            p("\n-=-=-=-=-=-=-=-=-\nDataType_Class > Boolean_Extended_Syntax > setThenConvert_2_Steps");

            /*
            UnitOf.DataType, "12.5" for this entire example.
            */
            UnitOf.DataType numberMatches = new UnitOf.DataType("12.5");//String passed in.

            /*
            Returns true for all
            */
            bool t_MatchStr_NonCase_Equals = numberMatches.ToBoolean(new string[] { "1.2", "12.5", "3" });      //True, matches "12.5"
            bool t_MatchFloat_NonCase_Equals = numberMatches.ToBoolean(new object[] { 1.2f, 12.5f, 3f});        //True, matches 12.5
            bool t_MatchStr_NonCase_Contains = numberMatches.ToBoolean(new object[] { 5, 12, 3 }, false, true); //True, matches 5 & 12

            /*
            Returns false for all
            */
            bool f_MatchStr_NonCase_Equals2 = numberMatches.ToBoolean(new string[] { "1.2", "12.55", "3" });        //False, No matches
            bool f_MatchFloat_NonCase_Equals2 = numberMatches.ToBoolean(new object[] { 1.2f, 12.55f, 3f });         //False, No matches
            bool f_MatchStr_NonCase_Contains2 = numberMatches.ToBoolean(new object[] { 5, 12, 3 }, false, false);   //False, No matches

            /*
            Print results
            */
            pt("t_MatchStr_NonCase_Equals: " + t_MatchStr_NonCase_Equals);          //True, matches "12.5"
            pt("t_MatchFloat_NonCase_Equals: " + t_MatchFloat_NonCase_Equals);      //True, matches 12.5
            pt("t_MatchStr_NonCase_Contains: " + t_MatchStr_NonCase_Contains);      //True, matches 5 & 12
            pt("f_MatchStr_NonCase_Equals2: " + f_MatchStr_NonCase_Equals2);        //False, No matches
            pt("f_MatchFloat_NonCase_Equals2: " + f_MatchFloat_NonCase_Equals2);    //False, No matches
            pt("f_MatchStr_NonCase_Contains2: " + f_MatchStr_NonCase_Contains2);    //False, No matches
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
