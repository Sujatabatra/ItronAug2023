var myAr=[10,20,30,40];

console.log(myAr);

myAr.push(60);  //insertion at the end
console.log(myAr);

myAr.unshift(70);  //insertion at the begning
console.log(myAr);

console.log(myAr.pop());  //deletion from the end

console.log(myAr.shift());  //deletion from the begning
console.log("==================")

myAr.forEach(function(item,index,ar){
  console.log(item);
})

myAr.forEach(function(item,index,ar){
  console.log("element at "+index+" "+ar[index]);
})

console.log("==================")

myAr.forEach(function(item){
  console.log(item);
})
