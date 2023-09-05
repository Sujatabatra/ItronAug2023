<template>
<div>
    <h1>Hi I am Parent Component</h1>
    <!-- <FirstChild message="Hello from Parent to Child Component" :user="user" :getUserData="getData"></FirstChild> -->
    <hr>
    <ul>
        <li v-for="user in users" :key="user.firstName">
            <FirstChild :data="user"></FirstChild>
        </li>
    </ul>
</div>
</template>
<script>
import FirstChild from './FirstChild.vue';
export default{
    name:"ParentComponent",
    components:{
        FirstChild
    },
    data(){
        return{
            user:{firstName:"Sujata",lastName:"Batra"},
            users:[{firstName:"Sujata",lastName:"Batra"},
            {firstName:"Arindam",lastName:"Singh"},
            {firstName:"Amrit",lastName:"Raj"},
            {firstName:"Krithik",lastName:"Gopinath"},
            {firstName:"Prateek",lastName:"Kushwaha"}]
        }
    },
    methods:{
        getData(){
            console.log(this.user);
            alert(this.user.firstName+" "+this.user.lastName);
        }
    }

}
</script>
<!-- <style scoped>
    div{
        background-color: gray;
        height: 400px;

    }
</style> -->