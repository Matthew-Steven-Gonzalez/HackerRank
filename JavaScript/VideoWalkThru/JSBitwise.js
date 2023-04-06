// Read, Write, Execute
// 00000100
// 00000010
// 00000111

const readPermission = 4;
const writePermission = 2;
const executePermission= 1;

let myPermission = 0;

myPermission = myPermission | readPermission | writePermission;

let message = (myPermission & executePermission) ? 'yes' : 'no';
    
console.log(message);