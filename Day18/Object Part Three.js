var myObj={
  prop1:"hello",
  prop2:10,
  prop3:true,
  prop4:null,
  prop5:undefined,
  prop6:{},
  "1prop":"SomeValue",
  "1":"One"
};

console.log("myObj.prop1 : "+myObj.prop1);
console.log("myObj[prop1] : "+myObj["prop1"]);

var propertyName="prop2";
console.log("myObj.propertyName : "+myObj.propertyName);
console.log("myObj[propertyName] : "+myObj[propertyName]);

// myObj.1prop="SomeValue";
console.log(myObj);
// console.log("myObj.1prop : "+myObj.1prop);
console.log("myObj[1prop] : "+myObj["1prop"]);
console.log("myObj[1] : "+myObj[1]);






