<template>
    <div>
        <h1>Hi I am First Component</h1>
        <h2>Name : {{ name }}</h2>
        <h2>Email : {{email}}</h2>
        <h3>{{ greet("Sujata Batra") }}</h3>
        <h1>Calling Methods</h1>
        <h2>{{ addSalutation("Arindam") }}</h2>
        <h2>{{ getData() }}</h2>
    </div>
</template>
<script>
export default{
    name:'FirstComponent',
    data(){
        return{
        name : 'Sujata',
        email:'sujatabatra@hotmail.com',
        greet: function(na){
            return "Welcome to Vue JS "+this.name+na
        }
        }
    },
    methods:{
        addSalutation(name){
            return "Mr./Ms. "+name;
        },
        getData(){
            return{
                name : this.name,
                mailId:this.email
            } 
        }
        
    }

}
</script>
<style>
    div{
        color: orange;
    }
</style>