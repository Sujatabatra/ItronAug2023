<template>
    <h1>Event Handling Component</h1>
    <h2>Counter : {{ count }}</h2>
    <button v-on:click="getCount" >Increment Counter</button><br><br>
    <input type="text" placeholder="Enter First Number" v-model="value1"><br><br>
    <input type="text" placeholder="Enter Second Number" v-model="value2"><br><br>
    <button v-on:click="getSum">Calculate Sum</button>
    <h2>{{value1 }} + {{ value2 }} = {{ sum }}</h2>
    <h2>{{value1 }} + {{ value2 }} = {{ parseInt(value1)+parseInt(value2) }}</h2>
</template>
<script>
export default{
    name:"EventComponent",
    data(){
        return{
            count:0,
            value1:0,
            value2:0,
            sum:0
        }
    },
    methods:{
       getCount(){
            this.count++;
       } ,
       getSum(){
        this.sum=parseInt(this.value1)+parseInt(this.value2);
       }
    }
}
</script>