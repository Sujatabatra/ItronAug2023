var person={
  firstname : "Sujata",
  lastname : "Batra",
  getFullName : function(){
    return this.firstname+" "+this.lastname;
  }
}

var fullName=person.getFullName();
console.log(fullName);

var person2=person;
person={};

console.log(person2);
console.log(person2.getFullName());