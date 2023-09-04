var executor=function(fn){
  fn();
}

function myFun(){
  console.log("Hi I am myFun")
}

executor(myFun);

executor(function(){
  console.log("Inline function");
});