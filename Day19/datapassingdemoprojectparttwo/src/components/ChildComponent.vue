<template>
    <h1>Hi I am Child Component</h1>
    <input type="text" v-model="userName" placeholder="Enter User Name"><br>
    <button v-on:click="getUser(userName)">Send User Name To Parent Compoenent</button>
</template>
<script>
export default{
    name:"ChildComponent",
    props:{
        getUser:Function
    },
    data(){
        return{
            userName:"Sujata"
        }
    }
}
</script>