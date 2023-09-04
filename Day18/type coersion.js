// Type Coersion :We have variables assigned to value and we are operating on those variables and there are certain times where interpretter have to do automatic type conversion in order to make operation work.

console.log("type of 123 : "+typeof 123);
console.log("type of '4 ' : "+typeof "4");
var result=123+"4";

console.log("type of result : "+typeof result);
console.log("result : "+result);

console.log("type of 123 : "+typeof 123);
console.log("type of '4 ' : "+typeof "4");
var result=123*"4";

console.log("type of result : "+typeof result);
console.log("result : "+result);


console.log("type of 123 : "+typeof 123);
console.log("type of 'Sujata ' : "+typeof "Sujata");
var result1=123*"Sujata";

console.log("type of result1 : "+typeof result1);
console.log("result1 : "+result1);

var a=10;
var b="10";
var result2=a==b;
console.log("typeof result2 : "+typeof result2);
console.log("result2 : "+result2)

//=== : does comparison but does not do type conversion
var result3=a===b;
console.log("typeof result3 : "+typeof result3);
console.log("result3 : "+result3)

//While checking for conditions : and non zero value is true and zero is false
// String value is true and empty string is false
// undefined and null arealso false
