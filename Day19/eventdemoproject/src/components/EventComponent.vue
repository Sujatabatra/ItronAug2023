<template>
    <h1>Event Handling Component</h1>
    <h2>Counter : {{ count }}</h2>
    <button v-on:click="getCount" >Increment Counter</button><br><br>
    <button v-on:click="getSum">Calculate Sum</button>
    <h2>{{ sum }}</h2>
</template>
<script>
export default{
    name:"EventComponent",
    data(){
        return{
            count:0,
            sum:''
        }
    },
    methods:{
       getCount(){
            this.count++;
       } ,
       getSum(){
        var value1=prompt("Enter First Number : ",0);
        var value2=prompt("Enter Second Number : ",0);
        this.sum=parseInt(value1)+parseInt(value2);
       }
    }
}
</script>