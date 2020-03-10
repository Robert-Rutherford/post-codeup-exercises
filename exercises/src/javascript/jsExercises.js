"use strict";

//site https://edabit.com/challenge/ebcd4Xu8TLizaj6dm
//Problem: Array of Multiples
//Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num up to length.
//

function arrayOfMultiples(num,length){
    let fullArray = [];
    for(let i= 0; i<length;i++){
     fullArray.push(num*(i+1));
    }
    return fullArray;
}

//site https://edabit.com/challenge/tmnCStcrkdWbreKP5
//Problem: Get Sum of People's Budget
//Create the function that takes an array with objects and returns the sum of people's budgets.
//
function getBudgets(objArray){
    let total = 0;
    for(let i = 0; i< objArray.length; i++){
        total += objArray[i].budget;
    }

    return total;
}

//site https://edabit.com/challenge/moK78CirzYbqk6g3z
//Problem: ReverseAndNot
//Write a function that takes an integer i and returns an integer with the integer backwards followed by the original integer.
//
function reverseAndNot(num){
let strNum = num.toString();
let numReverse = strNum.split("").reverse().join("");
let returnStr = numReverse + strNum;
return parseInt(returnStr);
}
//site https://edabit.com/challenge/4aaBNPnFMc3bzR7JR
//Problem: Convert Key, Values in an Object to Array
//Write a function that converts an object into an array of keys and values.
//
function objectToArray(obj){
    return Object.keys(obj).map(function(key){
        return [key, obj[key]];
    });

}
//site https://edabit.com/challenge/SAdqaWKRpjLfZnGKA
//Problem: Get the Century
//Create a function that takes in a year and returns the correct century.
//
function century(yearNum){
    let centuryNum = 10;
    if(yearNum% 100 == 0){
        centuryNum = Math.floor(yearNum/100);
    }else{
        centuryNum = Math.floor(yearNum/100 + 1);
    }
    return centuryNum+"th century";
}

//site https://edabit.com/challenge/AtoWYYC9THAH5HbS2
//Problem: Basic Calculator
//Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.
//
function calculator(num1,operator,num2){
    if(operator === "+"){
        return num1 + num2;
    }
    if(operator === "-"){
        return num1 - num2;
    }
    if(operator === "*"){
        return num1 * num2;
    }
    if(operator === "/"){
        if(num2 == 0){
            return "Can't divide by 0!";
        }
        return num1/num2;
    }
    return "invalid operator";
}