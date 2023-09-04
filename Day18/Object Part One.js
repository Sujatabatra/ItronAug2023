//JS is object oriented programming language however it is not class based
// Js objects are freeform and they are not bound to any class

var myObj={};
console.log("typeof myObj : "+typeof myObj);
console.log(myObj);

myObj.prop1="hello";
myObj.prop2=10;
myObj.prop3=true;
myObj.prop4=null;
myObj.prop5=undefined;
console.log("typeof myObj : "+typeof myObj);
console.log(myObj);

myObj.prop6={};
console.log(myObj);

//In JS we can;t control if the property is public or private . Any property is always accessible

console.log(myObj.prop7);