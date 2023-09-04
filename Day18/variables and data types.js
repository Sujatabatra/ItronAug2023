//Note : When we declare a vraible an explicit value got assigned to a vraiable and that value is "undefined" if we are not assiigning any
// Declaration : asked the compiler to create a new variable and give it a name
var value1;

console.log("type of value :"+typeof value1);  // undefined
console.log("value1 : "+value1);   //undefined

// Definition : is when we assign a value to variable
value1=42;
console.log("type of value1 :"+typeof value1);  //number
console.log("value1 : "+value1);

value1="Sujata"
console.log("type of value1 :"+typeof value1);  //string
console.log("value1 : "+value1);

value1=true
console.log("type of value1 :"+typeof value1);  //boolean
console.log("value1 : "+value1);

//number : are double-precision 64 bit format IEEE 754 values
value1=7.8;
console.log("type of value1 :"+typeof value1);  //number
console.log("value1 : "+value1);

//string : sequence of unicode characters
value1='a';
console.log("type of value1 :"+typeof value1);  //string
console.log("value1 : "+value1);