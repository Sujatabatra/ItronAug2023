<template>
    <div>
        <!-- <h1>Hi I am First Child Component</h1>
        <h2>{{ message }}</h2>
        <h2>{{ user }}</h2>
        <button v-on:click="getUserData">Click Me</button> -->
        <p>{{ data.firstName }} {{ data.lastName }}</p>
    </div>
</template>
<script>
    export default{
        name:"FirstChild",
        props:{
            message:String,
            user:Object,
            getUserData:Function,
            data:Object
        }
    }
</script>
<!-- <style scoped>
    div{
        background-color: coral;
        color:aqua;
        height:300px;
        width: 400px;
        margin: 10px;
        padding: 10px;;
    }
</style> -->