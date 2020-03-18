"use strict";

//site https://edabit.com/challenge/ebcd4Xu8TLizaj6dm
//Problem: Array of Multiples
//Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num up to length.
//

function arrayOfMultiples(num, length) {
    let fullArray = [];
    for (let i = 0; i < length; i++) {
        fullArray.push(num * (i + 1));
    }
    return fullArray;
}

//site https://edabit.com/challenge/tmnCStcrkdWbreKP5
//Problem: Get Sum of People's Budget
//Create the function that takes an array with objects and returns the sum of people's budgets.
//
function getBudgets(objArray) {
    let total = 0;
    for (let i = 0; i < objArray.length; i++) {
        total += objArray[i].budget;
    }

    return total;
}

//site https://edabit.com/challenge/moK78CirzYbqk6g3z
//Problem: ReverseAndNot
//Write a function that takes an integer i and returns an integer with the integer backwards followed by the original integer.
//
function reverseAndNot(num) {
    let strNum = num.toString();
    let numReverse = strNum.split("").reverse().join("");
    let returnStr = numReverse + strNum;
    return parseInt(returnStr);
}

//site https://edabit.com/challenge/4aaBNPnFMc3bzR7JR
//Problem: Convert Key, Values in an Object to Array
//Write a function that converts an object into an array of keys and values.
//
function objectToArray(obj) {
    return Object.keys(obj).map(function (key) {
        return [key, obj[key]];
    });

}

//site https://edabit.com/challenge/SAdqaWKRpjLfZnGKA
//Problem: Get the Century
//Create a function that takes in a year and returns the correct century.
//
function century(yearNum) {
    let centuryNum = 10;
    if (yearNum % 100 === 0) {
        centuryNum = Math.floor(yearNum / 100);
    } else {
        centuryNum = Math.floor(yearNum / 100 + 1);
    }
    return centuryNum + "th century";
}

//site https://edabit.com/challenge/AtoWYYC9THAH5HbS2
//Problem: Basic Calculator
//Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.
//
function calculator(num1, operator, num2) {
    if (operator === "+") {
        return num1 + num2;
    }
    if (operator === "-") {
        return num1 - num2;
    }
    if (operator === "*") {
        return num1 * num2;
    }
    if (operator === "/") {
        if (num2 === 0) {
            return "Can't divide by 0!";
        }
        return num1 / num2;
    }
    return "invalid operator";
}

//site https://edabit.com/challenge/r6TSNwkLZ2DgsoKiH
//Problem: Oddish vs. Evenish
//Create a function that determines whether a number is Oddish or Evenish. A number is Oddish if the sum of all of its digits is odd, and a number is Evenish if the sum of all of its digits is even. If a number is Oddish, return "Oddish". Otherwise, return "Evenish".
//
//   For example, oddishOrEvenish(121) should return "Evenish", since 1 + 2 + 1 = 4. oddishOrEvenish(41) should return "Oddish", since 4 + 1 = 5.
//
function oddishOrEvenish(num) {
    var strNum = num.toString();
    var numSplit = strNum.split("");
    var total = 0;
    for (let i = 0; i < numSplit.length; i++) {
        total += parseInt(numSplit[i]);
    }
    if (total % 2 === 0) {
        return "Evenish";
    } else {
        return "Oddish";
    }
}

//site https://edabit.com/challenge/94RHwrv6PfaqEGYtr
//Calculate an Earned Run Average
//Create a function that returns an Earned Run Average (ERA). An ERA is calculated by multiplying 9 by the quotient of Earned Runs Allowed er divided by ip Innings Pitched.
// 
// In baseball statistics, innings are represented with a fractional part of .1 (1/3) or .2 (2/3) to represent the number of outs in an inning. A whole number or a number with a fractional part of .0 represents a full inning with three outs. Check the Resources tab for a deeper explanation.
//
function era(er,ip) {
    return (er/ip)*9;
}

//site https://edabit.com/challenge/Fev8jkLtDunP9wexv
//Needle in a Hex String
//Find the index of a string within a hex encoded string.
//
// You will be given a string which needs to be found in another string which has previously been translated into hex. You will need to return the first index of the needle within the hex encoded string.
function firstIndex(hex, needle) {
    let hexArray = hex.split(" ");
    let needleIndex = needle.substring(0,1);
    for (let i = 0; i<hexArray.length;i++){
        let hexConvert = parseInt(hexArray[i],16);
        if (needleIndex === String.fromCharCode(hexConvert)){
            return i;
        }
    }
    return 0;
}
// site https://edabit.com/challenge/WMorR7e2z3AkoesJC
// Straight Digital Numbers
//In this challenge, you have to establish if the digits of a given number form a straight arithmetic sequence (either increasing or decreasing). A straight sequence has an equal step between every pair of digits.
//
// Given an integer n, implement a function that returns:
//
// "Not Straight" if n is lower than 100 or if its digits are not an arithmetic sequence.
// "Trivial Straight" if n has a single repeating digit.
// An integer being the step of the sequence if the n digits are a straight arithmetic sequence.
function straightDigital(number) {
    if(number < 100){
        return "Not Straight";
    }
    var strNum = number.toString();
    var numSplit = strNum.split("");
    let straightArray = [];
    for(let i = 0; i< (numSplit.length -1) ; i++ ){
        straightArray.push(parseInt(numSplit[i+1]) - parseInt(numSplit[i]));
    }

    for (let i=0; i< (straightArray.length-1);i++){
        if(straightArray[i] !== straightArray[i+1]){
            return "Not Straight";
        }
    }

    if (straightArray[0] === 0){
        return "Trivial Straight";
    }else {
        return straightArray[0];
    }

}





