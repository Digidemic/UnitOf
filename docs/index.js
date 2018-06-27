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

app.controller('indexController', function($scope,$document, $window, Uts,MeasCarousel, ToCarousel, FromCarousel, UOMeasurements, UOUnitOfIs, UOFAQ, UOFeatures, UODoc, $timeout, $sce, UOCodeStyle, UOHardCodedExamples) {
    var CAROUSEL_FROM_TYPE = 1;
    var CAROUSEL_TO_TYPE = 2;
    var CAROUSEL_MEASUREMENT_TYPE = 3;

    var UPDATE_MEAS_CAROUSEL_DEMO_AFTER = 3;

    var carouselDemoTimer;
    var DEFAULT_MEAS_CAROUSEL_DEMO_COUNTER_VALUE = 0;

    $scope.codeStyle = UOCodeStyle;

    $scope.preExpanded = false;
    $scope.Uts = Uts;
    $scope.uoHardCodedExamples = UOHardCodedExamples;
    $scope.ToCarousel = ToCarousel;
    $scope.FromCarousel = FromCarousel;
    $scope.MeasCarousel = MeasCarousel;
    $scope.uoMeasurement = UOMeasurements;
    $scope.uoFAQ = UOFAQ;
    $scope.uoFeatures = UOFeatures;
    $scope.uoUnitOfIs = UOUnitOfIs;
    $scope.userInput = 1;
    $scope.theNumericBaseUserInput = '3439';
    $scope.dataTypeSelectedExample = '1';
    $scope.theUserInput = 1;
    $scope.uoValue = 100;
    $scope.uoDoc = UODoc;
    $scope.demoCheckbox = true;
    $scope.updateMeasCarouselDemoAfterCount = DEFAULT_MEAS_CAROUSEL_DEMO_COUNTER_VALUE;
    $scope.tlMeas = [];
    $scope.tlMeasClassFrom = [];
    $scope.tlMeasClassTo = [];
    $scope.docFromCode = 'fromHERE';
    $scope.docToCode = 'toHERE';
    $scope.selectedIndexOfRot = 0;
    $scope.tlMeas[-1] = true;
    $scope.selectedLanguageDDL = [];
    $scope.selectedExampleDDL = [];
    $scope.setHeaderText = '';
    $scope.dtcTop = 7;
    $scope.dtcJava = $scope.dtcTop + 11;
    $scope.dtcCS = $scope.dtcJava + 7;
    $scope.dtcJS = $scope.dtcTop + 7;
    $scope.dtLine = 0;
    $scope.topBarExists = !($window.scrollY <= 50);

    $scope.faqRowCount = function(totalQuestions) {
        var n = Math.ceil(totalQuestions.length / 3);
        return new Array(n);
    };

    $(window).on('beforeunload', function(){
        $(window).scrollTop(0);
    });

    $(document).ready(function() {
        ToCarousel.onStartUp();
        FromCarousel.onStartUp();
        MeasCarousel.onStartUp();
        $('#headerRotate').rotaterator({fadeSpeed:500, pauseSpeed:8500}, $scope);
        $scope.userInputChange();
});

    $scope.uoIsTextClick = function(){
        $('#headerRotate').rotateratorTextClicked();
    };

    $scope.uoIsBarClick = function(index){
        $('#headerRotate').rotateratorClickedBar(index, $scope);
    };

    $scope.unitOfMeasurementToVisibleText = function(measurementKey, index){
        try {
            for (var i = 0; i < $scope.uoDoc.length; i++) {
                if (measurementKey.toLowerCase() === $scope.uoDoc[i].uo.toLowerCase()) {
                    if(!$scope.preExpanded && measurementKey.toLowerCase() === 'datatype(toAutoExpandOnLoadRemoveThis)'){
                        $scope.preExpanded = true;
                        $scope.toggleDocCategory(false, measurementKey, []);
                        $scope.tlMeas[index] = true;
                    }
                    return $scope.uoDoc[i].text;
                }
            }
        } catch(e){
        }
        return measurementKey;
    };

    $scope.setDocMeasCat = function(i){
        return 'docMeasCat' + i;
    };

    $scope.docTopFixedScroll = function(){
        $(window).scroll(function () {
            var d1 = $('#docMeasCat1');
            var scrollTop = $(window).scrollTop() || 0;
            var top = d1.offset().top;

            if (scrollTop >= top)   {
                d1.addClass("doc-top-fixed-scroll");
            } else {
                d1.removeClass("doc-top-fixed-scroll");
            }
        });
    };

    $scope.UnitOfLength = function(){
        return Object.keys(Uts.UnitOfJS).length;
    };

    $scope.languageSelectChange = function(option){
        $scope.selectedLanguageDDL[-1] = option;
        for(var i = 0; i < $scope.UnitOfLength(); i++){
            $scope.selectedLanguageDDL[i] = option;
        }
    };
    $scope.languageSelectChange('java');

    $scope.selectedExampleStyle = function(option){
        for(var i = 0; i < $scope.UnitOfLength(); i++){
            $scope.selectedExampleDDL[i] = option;
        }
    };
    $scope.selectedExampleStyle('1');

    $scope.toggleDocCategory = function(bool, theKey, theValue, event){
        var f = 'fromCHANGE';
        var t = 'toCHANGE';
        var fromInit = false;
        for (var key in theValue) {
            if(!fromInit) {
                fromInit = true;
                f = key || f;
            } else {
                t = key || t;
                if(t.indexOf('from') === 0) {
                    t = t.replace('from','');
                }
                t = 'to' + t;
                break;
            }
        }

        $scope.tlMeasClassFrom[0] = $scope.tableFromCellClick(f);
        $scope.tlMeasClassTo[1] = $scope.tableToCellClick(t);

        $scope.tlMeas[-1] = false;
        for(var i = 0; i < $scope.tlMeas.length; i++){
            $scope.tlMeas[i] = false;
        }
        try{
            var elmFromTop = $('#'+event.currentTarget.id).offset().top;
            var headerHeight = $('#mainNav').height();

            window.scrollTo(0,elmFromTop - headerHeight);
        } catch(e){
        }
        return !bool;
    };

    $scope.uoIsBarWidth = function(index){
        var barColor = ($scope.selectedIndexOfRot === index) ? '#ffffff' : '#888888';
        return {
            'border': '2px solid ' + barColor,
            'background': barColor
        };
    };

    $scope.tableFromCellClick = function(val, clicked){
        for(var i = 0; i < $scope.tlMeasClassFrom.length; i++){
            $scope.tlMeasClassFrom[i] = false;
        }
        $scope.docFromCode = val;
        return true;
    };

    $scope.tableToCellClick = function(val, clicked){
        for(var i = 0; i < $scope.tlMeasClassTo.length; i++){
            $scope.tlMeasClassTo[i] = false;
        }
        $scope.docToCode = val;
        return true;
    };

    $scope.isADocExpanded = function(){
        for(var i = 0; i < $scope.tlMeas.length; i++){
            if($scope.tlMeas[i]){
                return true;
            }
        }
        return false;
    };

    $scope.resetMeasCarouseDemoCounter = function(){
        $scope.updateMeasCarouselDemoAfterCount = DEFAULT_MEAS_CAROUSEL_DEMO_COUNTER_VALUE;
    };

    $scope.measVal = function() {
        return $scope.getTextFromID($scope.MeasCarousel.getVisibleCarouselValues().currentID);
    };

    $scope.fromVal = function() {
        return $scope.getTextFromID($scope.FromCarousel.getVisibleCarouselValues().currentID);
    };

    $scope.toVal = function() {
        return $scope.getTextFromID($scope.ToCarousel.getVisibleCarouselValues().currentID);
    };

    $scope.unitsFromMeasurementCollection = function(isFrom) {
        isFrom = (typeof isFrom === 'undefined') ? false : isFrom;
        var meas = $scope.measVal() || false;
        if (meas !== false) {
            for (var i = 0; i < UOMeasurements.length; i++) {
                if (UOMeasurements[i].measurement.uo.toLowerCase() === meas.toLowerCase()) {
                    try {
                        if (isFrom) {
                            var unitsOfMeas = UOMeasurements[i].units;
                            var toUnits = [];
                            for(var j = 1; j < unitsOfMeas.length; j++){
                                toUnits.push(unitsOfMeas[j]);
                            }
                            toUnits.push(unitsOfMeas[0]);
                            return toUnits;
                        }
                    }catch(e){
                    }
                    return UOMeasurements[i].units;
                }
            }
        }
        return [{uo:'',text:''}];
    };

    $scope.UnitOfMeasurementLength = function(){
        try {
            var meas = $scope.measVal() || false;
            if (meas !== false) {
                return Object.keys(UnitOf[Uts.pascalCase(meas)]).length;
            }
        } catch(e){
        }
        return 'many more';
    };

    $scope.getTextFromID = function(id){
        var elm = $("#" + id)[0] || false;
        if (elm !== false) {
            return elm.getAttribute('value') || elm.innerText;
        }
    };

    $scope.userInputChange = function(){
        try {
            var val = UnitOf[Uts.pascalCase($scope.measVal())]["from" + $scope.fromVal()]($scope.userInput)["to" + $scope.toVal()];
            $scope.uoValue = val;
        } catch(err){
            $scope.uoValue = "N/A";
        }
    };

    $scope.convertMe = function(theUserInput, meas, from, to){
        var conversion = "N/A";
        try {
            conversion = UnitOf[meas][Uts.camelCase(from)](theUserInput)[Uts.camelCase(to)];
        } catch(err){
            conversion = "N/A";
        }
        return conversion;
    };

    $scope.updateSelectedText = function(id, carouType){
        var txt = ($("#" + id)[0]).getAttribute('value') || $("#" + id)[0].innerText;
        if(carouType === CAROUSEL_FROM_TYPE){
            $scope.fromMeasurement = txt;
        } else if(carouType === CAROUSEL_TO_TYPE) {
            $scope.toMeasurement = txt;
        } else if(carouType === CAROUSEL_MEASUREMENT_TYPE){
            //$scope.objSelected = txt;
        }
        $scope.userInputChange();
    };

    $scope.carouselMeasClick = function(clickedID) {
        $scope.rotateCarouselMeas(clickedID, true);
        setTimeout(function() {
            $scope.$apply(function () {
                $scope.rotateFromAndToCarousels();
            });
        }, 5);
    };

    function magicalInputUpdateHack(){
        setTimeout(function() {
            $scope.$apply(function () {
                $scope.userInputChange();
            });
        }, 5);
    }

    $scope.rotateCarouselMeas = function(clickedID, userClicked){
        var vis = MeasCarousel.getVisibleCarouselValues();
        var goToRight = null;
        if(clickedID == vis.leftID){
            goToRight = false;
            $scope.updateSelectedText(vis.leftID, CAROUSEL_MEASUREMENT_TYPE);
        } else if(clickedID == vis.rightID){
            goToRight = true;
            $scope.updateSelectedText(vis.rightID, CAROUSEL_MEASUREMENT_TYPE);
        }
        if (goToRight !== null) {
            if(userClicked){
                $scope.disableDemo();
            }
            MeasCarousel.measRotate(goToRight,vis);
            $scope.rotateFromAndToCarousels(goToRight);
        }

        //magicalInputUpdateHack();
    };

    $scope.styleCodeQuickSummary = function(code){
        var updatedCode;
        try {
            updatedCode = code[$scope.selectedLanguageDDL[-1]];
        } catch(e){
        }
        if(typeof updatedCode === 'undefined'){
            updatedCode = code;
        }
        code = updatedCode;
        try {
            for (var i = 0; i < $scope.codeStyle.length; i++) {
                var c = $scope.codeStyle[i];
                c.startAfter = (typeof c.startAfter === 'undefined') ? false : c.startAfter;
                c.endBefore = (typeof c.endBefore === 'undefined') ? false : c.endBefore;

                var strStart = code.split(c.start);
                if (strStart.length > 1) {
                    var strEnd = (c.end === '') ? [strStart[1]] : strStart[1].split(c.end);

                    var strToUpdate = '';
                    if (!c.startAfter) {
                        strToUpdate += c.start;
                    }
                    strToUpdate += strEnd[0];
                    if (!c.endBefore) {
                        strToUpdate += c.end;
                    }

                    var alreadyUpdated = false;
                    try {
                        if (typeof c.ignoreAfter !== 'undefined') {
                            var ignoredValue = strToUpdate.split('(')[1];
                            if (ignoredValue !== c.end) {
                                ignoredValue = ignoredValue.split(c.end)[0];
                                var strToUpdateSplit = strToUpdate.split(ignoredValue);
                                updatedCode = updatedCode.replace(strToUpdate, '<span style="color:' + c.color + '">' + strToUpdateSplit[0] + '</span><span>' + ignoredValue + '</span><span style="color:' + c.color + '">' + strToUpdateSplit[1] + '</span>');
                                alreadyUpdated = true;
                            }
                        }
                    } catch (e) {
                    }
                    if (!alreadyUpdated) {
                        updatedCode = updatedCode.replace(strToUpdate, '<span style="color:' + c.color + '">' + strToUpdate + '</span>');
                    }
                }
            }
        } catch(e){
            console.log('error ' + e);
        }
        return $sce.trustAsHtml(updatedCode);
    };

    $scope.carouselFromClick = function(clickedID) {
        $scope.rotateCarouselFrom(clickedID, true);
        $scope.userInputChange();
    };

    $scope.rotateCarouselFrom = function(clickedID, userClicked){
        var vis = FromCarousel.getVisibleCarouselValues();
        var goToRight = null;
        if(clickedID == vis.leftID){
            goToRight = false;
            $scope.updateSelectedText(vis.leftID, CAROUSEL_FROM_TYPE);
        } else if(clickedID == vis.rightID){
            goToRight = true;
            $scope.updateSelectedText(vis.rightID, CAROUSEL_FROM_TYPE);
        }
        if (goToRight !== null) {
            if(userClicked){
                $scope.disableDemo();
            }
            FromCarousel.toRotate(goToRight,vis);
        }
    };

    $scope.carouselToClick = function(clickedID) {
        $scope.rotateCarouselTo(clickedID, true);
        $scope.userInputChange();
    };

    $scope.rotateCarouselTo = function(clickedID, userClicked){
        var vis = ToCarousel.getVisibleCarouselValues();
        var goToRight = null;
        if(clickedID == vis.leftID){
            goToRight = false;
            $scope.updateSelectedText(vis.leftID, CAROUSEL_TO_TYPE);
        } else if(clickedID == vis.rightID){
            goToRight = true;
            $scope.updateSelectedText(vis.rightID, CAROUSEL_TO_TYPE);
        }
        if (goToRight !== null) {
            if(userClicked){
                $scope.disableDemo();
            }
            ToCarousel.toRotate(goToRight,vis);
        }
        magicalInputUpdateHack();
    };

    $document.on('scroll', function() {
        if($window.scrollY <= 50) {
            $scope.$apply(function () {
                $scope.topBarExists = false;
            });
        } else if($scope.topBarExists === false){
            $scope.$apply(function () {
                $scope.topBarExists = true;
            });
        }
    });

    $scope.disableDemo = function(){
        $scope.demoCheckbox = false;
        $scope.demoCheckboxClick();
    };

    $scope.demoCheckboxClick = function(){
        if($scope.demoCheckbox) {
            startCarouselDemoTimer();
        } else {
            clearInterval(carouselDemoTimer);
            $scope.resetMeasCarouseDemoCounter();
        }
    };

    function startCarouselDemoTimer(){
        carouselDemoTimer = setInterval(demoTimer, 7000);
    }

    startCarouselDemoTimer();
    function demoTimer() {
        $scope.$apply(function () {
            $scope.updateMeasCarouselDemoAfterCount = ++$scope.updateMeasCarouselDemoAfterCount;
            if($scope.updateMeasCarouselDemoAfterCount >= UPDATE_MEAS_CAROUSEL_DEMO_AFTER){
                $scope.resetMeasCarouseDemoCounter();
                $scope.rotateCarouselMeas(MeasCarousel.getVisibleCarouselValues().rightID,false);
            } else {
                $scope.rotateFromAndToCarousels();
            }
        });
        $scope.$apply(function () {
            $scope.rotateFromAndToCarousels();
        });
        //magicalInputUpdateHack();
    }

    $scope.rotateFromAndToCarousels = function(rotateLeftTop){
        rotateLeftTop = rotateLeftTop || true;
        if(rotateLeftTop) {
            $scope.rotateCarouselTo(ToCarousel.getVisibleCarouselValues().leftID, false);
            $scope.rotateCarouselFrom(FromCarousel.getVisibleCarouselValues().rightID, false);
        } else {
            $scope.rotateCarouselTo(ToCarousel.getVisibleCarouselValues().rightID, false);
            $scope.rotateCarouselFrom(FromCarousel.getVisibleCarouselValues().leftID, false);
        }

    };

    $scope.bJS = function(javaOrCS) {
        return $scope.isJS('',javaOrCS);
    };

    $scope.isJS = function(js, javaOrCS) {
        try {
            js = js || '';
            javaOrCS = javaOrCS || '';
            if ($scope.selectedLanguageDDL[-1] === 'javascript') {
                return js;
            }
        } catch (e) {
        }
        return javaOrCS;
    };

    $scope.langCasing = function(txt){
        try {
            txt = txt || '';
            if ($scope.selectedLanguageDDL[-1] === 'csharp') {
                return Uts.pascalCase(txt);
            }
        } catch (e) {
        }
        return Uts.camelCase(txt);
    };

    $scope.dtLN = function(java,js,cs){
        $scope.dtLine = $scope.javaJSOrCS(java,js,cs);
        return $scope.dtLine;
    };

    $scope.javaJSOrCS = function(java,js,cs){
        try{
            java = java || '';
            js = js || '';
            cs = cs || '';
            switch ($scope.selectedLanguageDDL[-1]){
                case 'java': return java;
                case 'javascript': return js;
                case 'csharp': return cs;
            }
        } catch(e){
        }
        return '';
    };
    
    $scope.anythingArraySelectionOrNot = function(isArray, arrayTxt, allElse){
        try{
            arrayTxt = arrayTxt || '';
            allElse = allElse || '';
            if(isArray) {
                return arrayTxt;
            }
            return allElse;
        } catch(e){
        }
        return '';
    };
});