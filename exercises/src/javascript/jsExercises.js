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
