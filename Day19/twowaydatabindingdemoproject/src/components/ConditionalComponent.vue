<template>
    <h1 v-if="show">Hi I am conditional Component True</h1>
    <h1 v-else>Hi I am conditional Component False</h1>
    <!-- <button v-on:click="toggel">Toggle</button> -->
    <button v-on:click="show=!show">Toggle</button>
</template>
<script>
export default{
    name:'ConditionalComponent',
    data(){
        return{
            show:true
        }
    },
    methods:{
        toggel(){
            this.show=!this.show;
        }
    }
    
}
</script>