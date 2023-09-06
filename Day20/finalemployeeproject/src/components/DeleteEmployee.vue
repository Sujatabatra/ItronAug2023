<template>
    <div>
        <h2>Deleting Employee</h2>
        Enter Employee ID : <input type="text" placeholder="Employee ID" v-model="empId"><br><br>
        <input type="button" value="Delete Employee" v-on:click="deleteEmployee">
        <h3 v-if="deleteStatus">{{ message }}</h3>
        <h3 v-if="deleteStatus!='' && !deleteStatus">{{ message }}</h3>
    </div>
</template>
<script>
import axios from 'axios'
    export default{
        name:"DeleteEmployee",
        data(){
            return{
                empId:'',
                message:'',
                deleteStatus:''

            }
        },
        methods:{
            async deleteEmployee(){
                let result=await axios.delete("http://localhost:8085/employees/"+this.empId);
                console.log(result.status); 
                if(result.status==200){
                    this.message="Employee Deleted";
                    this.deleteStatus=true;
                }
                else{
                    this.message="Employee Not Deleted"
                    this.deleteStatus=false;
                }
                    
            }
        }
    }
</script>