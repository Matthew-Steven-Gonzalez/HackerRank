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


