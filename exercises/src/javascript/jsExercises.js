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