var myObj={
  prop1:"hello",
  prop2:10,
  prop3:true,
  prop4:null,
  prop5:undefined,
  prop6:{}
};

myObj.prop7=95;
console.log("typeof myObj : "+typeof myObj);
console.log(myObj);


myObj.prop2="Sujata";
console.log(myObj);

// myObj.prop3=undefined;
delete myObj.prop3;
console.log(myObj);



