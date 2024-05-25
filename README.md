![UnitOf](docs/assets/img/Logo.png)

### A measurement and data type conversion library for `Java`, `JavaScript` and `C#`.
- 20 complete units of measure.
- Parse any programming data type or convert fractions without any errors.
- Ability to create your own custom UnitOf measurements.
- Small (entire suite as little as 64kb), fast, and easy to use with super simple syntax.

## Table of Contents
- [Examples](#examples)
- [Installation](#installation)
- [Versioning](#versioning)
- [License](#license)

## Examples
- https://digidemic.github.io/UnitOf/ provides full documentation of all measurements and units, live examples, FAQ, and much more.
- Cloning the repo and navigating to `/UnitOf-Examples/` provides in-depth runnable demo projects and examples for all languages of UnitOf.
<br><br>
>`Java` & `C#` (NOTE: Written in Java but C# is the exact same only Pascal Cased methods)
```java
/* For Java, same for C# but Pascal Cased methods. C# also uses Dictionary instead of HashMap for UnitOf.Anything parameter */

//One Liner
double a = new UnitOf.Mass().fromPounds(5).toKilograms(); //2.26796 returned as 5 pounds is 2.26796 kilograms

//Set Then Convert
UnitOf.Length feet = new UnitOf.Length().fromFeet(5.5); //Instantiate UnitOf.Length and set "feet" as 5.5
double b = feet.toInches(); //66 returned as 5.5 feet is 66 inches
double c = feet.toMeters(); //1.6764 returned as 5.5 feet is 1.6764 meters

//Convert Data Type and Fractions
double d = new UnitOf.DataType("12.5").toDouble(); //12.5 of type double returned. 0.0 would be returned if conversion failed
int e = new UnitOf.DataType("Not A Number").toInt(10); //10 of type int returned since conversion fails
String f = new UnitOf.DataType(0.5).toFraction(); //"1/2" of type String returned. Empty string would be returned if failed

//Create Your Own Custom Measurement
UnitOf.Anything x = new UnitOf.Anything("FEET", new HashMap<Object, Double>() {{ put("METERS", 0.3048); put("INCHES", 12.0); }});
double g = x.convertNow(36, "INCHES", "FEET"); //3 returned as 36 inches is 3 feet
double h = x.convertNow(3, "FEET", "METERS"); //0.9144 returned as 3 feet is 0.9144 meters
```

---

<br>

>`JavaScript`
```js
/* For JavasScript */

//One Liner
var a = UnitOf.Mass.fromPounds(5).toKilograms; //2.26796 returned as 5 pounds is 2.26796 kilograms

//Set Then Convert
var feet = UnitOf.Length.fromFeet(5.5); //Instantiate UnitOf.Length and set "feet" as 5.5
var b = feet.toInches; //66 returned as 5.5 feet is 66 inches
var c = feet.toMeters; //1.6764 returned as 5.5 feet is 1.6764 meters

//Convert Data Type and Fractions
var d = UnitOf.DataType("12.5").toFloat(); //12.5 of type Float returned. 0 would be returned if conversion failed
var e = UnitOf.DataType("Not A Number").toInt(10); //10 of type Int returned since conversion fails
var f = UnitOf.DataType(0.5).toFraction(); //"1/2" of type string returned. Empty string would be returned if failed

//Create your own custom measurement
var x = UnitOf.Anything("FEET", 1, true, {METERS:0.3048, INCHES:12}); //Custom measurement w/ 3 units
var g = x.convertNow(36, "INCHES", "FEET"); //3 returned as 36 inches is 3 feet
var h = x.convertNow("3", "FEET", "METERS"); //0.9144 returned as 3 feet is 0.9144 meters
```

## Installation
>Clone the UnitOf repo to your local machine using `https://github.com/digidemic/UnitOf`<br>Only the single compiled UnitOf file of its language needs to be imported and referenced.

### Java

#### JitPack / build.gradle
[![](https://jitpack.io/v/Digidemic/unitof.svg)](https://jitpack.io/#Digidemic/unitof)
1) Add JitPack to your project's root `build.gradle` at the end of `repositories`:
- ```groovy
  dependencyResolutionManagement {
      repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
      repositories {
          mavenCentral()
          maven { url 'https://jitpack.io' }
    }
  }
  ```
2) In the `build.gradle` of the module(s) you wish to use UnitOf with, add the following to `dependencies`:
- ```groovy
  dependencies {
      implementation 'com.github.digidemic:unitof:1.0.1'
  }
  ```
3) [Sync gradle](https://www.delasign.com/blog/how-to-sync-an-android-project-with-its-gradle-files-in-android-studio/) successfully.
4) Done! Your project is now ready to use UnitOf. Go to [Examples](#examples) or [the UnitOf website](https://digidemic.github.io/UnitOf/) for UnitOf usage!

#### By Importing Jar

>1) Import `/UnitOf.jar` from the cloned repo into your project.
>2) In your classes using UnitOf, add `import com.digidemic.unitof.UnitOf;` to your list of imports.
- ##### Import using  Netbeans IDE 8.2
    - From within Netbeans, Right-click the project > `Properties` > `Libraries` category > `Compile` tab > `Add JAR/Folder` > Navigate and select `UnitOf.jar` from the cloned repo.
- ##### Import using Android Studio 3.1
    - From within Android Studio with the project open, `Project` tab open > Switch folder structure to `Project` > Expand the project and find the `libs` directory (if not there create it in the same directory as `src` and `res`) > Add the `UnitOf.jar` from the cloned repo to `libs` directory > Right-click the newly added `UnitOf.jar` node in the `libs` directory > click `Add As Library...` > Click `OK` in the `Create Library` dialog.

### JavaScript
##### By Node
```bash
npm install unitof
```

##### By script tag
>1) Import `/UnitOf.min.js` from the cloned repo into your project
>2) Add the following script tag (with the full path of `/UnitOf.min.js`) to the index html file:
```html
<script src="/UnitOf.min.js"></script>
```

### C#
##### By NuGet Package Manager
```
Install-Package UnitOf -Version 1.0.0
```

##### By manual .dll import
>1) Import `/UnitOf.dll` from the cloned repo into your project.
>2) In your index class or any class needed, add `using UnitOf;` to your list of imports.
- ##### Import using Visual Studio 2012
    - From within Visual Studio with the project open, `Solution Explorer` tab open > Expand the project directories navigating to `References` > Right-click `References` > Click `Add Reference...` > Click `Browser...` > Navigate and select `UnitOf.dll` from the cloned repo > Make sure `UnitOf.dll` is checked and click `OK`.

## Versioning
- A derivative of [SemVer](http://semver.org/) is used for versioning.
- Given a version number MAJOR . MINOR . PATCH . LANGUAGE_SPECIFIC_UPDATE&nbsp;&nbsp;COMMENT
    1) MAJOR version - Incompatible API changes.
    2) MINOR version - Functionality added in a backwards-compatible manner.
    3) PATCH version - Backwards-compatible bug fixes.
    4) LANGUAGE_SPECIFIC_UPDATE version - Specific functionality added or bug fixes only affecting a specific language (`Java`, `JavaScript`, or `C#`).
    5) COMMENT version (optional) - Presented as an alphabetic letter starting with "a", includes anything that does not affect size, performance, features, or fixes to the compiled solution. Adding or editing comments in code would be an example of this version.
- Version number may vary slightly between `Java`, `JavaScript`, and `C#` instances of UnitOf.
    - MAJOR.MINOR.PATH will always be consistent across all languages.
    - As an example they can be as follows:
        - `Java` - UnitOf_v1.2.3.0
        - `JavaScript` - UnitOf_v1.2.3.0b
        - `C#` - UnitOf_v1.2.3.2a

## License
UnitOf website, logo, Palindrome Conversion Algorithm, and all source code & example projects for Java, JavaScript & C# created by Adam Steinberg of DIGIDEMIC, LLC
```
Copyright 2024 DIGIDEMIC, LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```