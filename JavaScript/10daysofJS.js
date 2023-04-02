"USE STRICT";

// Day 1:

print("Hello World");


// Day 0 Data Types;

function performOperation(secondInteger, secondDecimal, secondString) {
    const firstInteger = 4;
    const firstDecimal = 4.0;
    const firstString = 'HackerRank ';
    console.log( firstInteger + parseInt(secondInteger));
    console.log(firstDecimal + parseFloat(secondDecimal));
    console.log( firstString  + secondString);
}


function main() {
    const secondInteger = readLine();
    const secondDecimal = readLine();
    const secondString = readLine();
    
    performOperation(secondInteger, secondDecimal, secondString);
}

// Day 1: Arithmetic Operators

function getArea(length, width) {
    let area = length * width;
    
    return area;
}

function getPerimeter(length, width) {
    let perimeter = 2 * (length + width);
    
    return perimeter;
}

// Day 1: Let and Const

function main() {
    
    const PI = Math.PI;
    
    var r = readLine();
    
    console.log(PI * (r *r));
    
    console.log(2 * PI * r);
}

// Day 2: else If

function getGrade(score) {
    let grade;
    
    if(score <= 5){
        grade = "F";
    }
    else if(score <= 10){
        grade = "E";
    }
    else if(score <= 15){
        grade = "D";
    }
    else if(score <=20){
        grade = "C";
    }
    else if(score <=25){
        grade = "B";
    }
    else{
        grade = "A";
    }
    return grade;
}

// Day 2 Switch Case

function getLetter(s) {
    let letter;
    
    switch(s[0]){
        
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            letter = "A"
            break;
        
        case 'b':
        case 'c':
        case 'd':
        case 'f':
        case 'g':
            letter = "B"
            break;
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
            letter = "C"
            break;    
        case 'n':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            letter = "D"
            break;
    }
    
    return letter;
}

// Day 3: arrays

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/

function getSecondLargest(nums) {
    var largestNumber = nums[0];
    var secondLargest = -1;
    
    for(var i = 0; i < nums.length; i++){
        if(nums[i] > largestNumber){
            secondLargest = largestNumber;
            largestNumber = nums[i];
        }
        
        if(nums[i] > secondLargest && nums[i] < largestNumber){
            secondLargest = nums[i];
        }
    }
    return secondLargest;
}

// Day 3 Try,Catch, and Finally

/*
 * Complete the reverseString function
 * Use console.log() to print to stdout.
 */

function reverseString(s) {
    
    try{
        console.log(s.split("").reverse().join(""));
    
    } catch(error){
        console.log(error.message);
        console.log(s);
    }
    
}

// Day 3 

/*
 * Complete the isPositive function.
 * If 'a' is positive, return "YES".
 * If 'a' is 0, throw an Error with the message "Zero Error"
 * If 'a' is negative, throw an Error with the message "Negative Error"
 */
function isPositive(a) {
    
    try{
        if( a == 0){
            throw new Error('Zero Error');
        }
        
        if(a < 0){
            throw new Error('Negative Error')
        }
        
        if(a > 0){
            return 'YES';
        }
        
    } catch(error){
        throw error;
    }
    
}

// Day 4 Create a Rectangle object

/*
 * Complete the Rectangle function
 */
function Rectangle(a, b) {
    this.length = a;
    this.width = b;
    this.perimeter = 2 * (a + b);
    this.area = a * b;
}


// Day 5: Inheritance

class Rectangle {
    constructor(w, h) {
        this.w = w;
        this.h = h;
    }
}
/*
 *  Write code that adds an 'area' method to the Rectangle class' prototype
 */

Rectangle.prototype.area = function(){
    return this.w * this.h;
}
/*
 * Create a Square class that inherits from Rectangle and implement its class constructor
 */

class Square extends Rectangle{
    constructor(w) {
    super(w, w);
  }
}