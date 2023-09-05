<template>
    <h1>Hi I am Parents Component</h1>
    <h2>User Name from Child : {{ childName }}</h2>
    <hr>
    <ChildComponent :getUser="getUserName"></ChildComponent>
</template>
<script>
import ChildComponent
 from './ChildComponent.vue';
export default{
    name:"ParentComponent",
    components:{
        ChildComponent
    },
    data(){
        return{
            childName:''
        }
    },
    methods:{
        getUserName(name){
            this.childName=name;
        }
    }
}
</script>