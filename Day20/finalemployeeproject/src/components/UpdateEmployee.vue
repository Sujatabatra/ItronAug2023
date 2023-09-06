<template>
    <div>
        <h2>Increment Employee Salary</h2>
        Enter Employee ID : <input type="text" placeholder="Employee ID" v-model="eId"><br><br>
        Enter Increment Amount : <input type="text" placeholder="Increment Amount" v-model="amount"><br><br>
        <button v-on:click="updateEmployee">Increment Salary</button>
        <br><br>
        <h3 v-if="updateStatus">{{ message }}</h3>
        <h3 v-if="!updateStatus">{{ message }}</h3>
    </div>
</template>
<script>
import axios from 'axios'
    export default{
        name:"UpdateEmployee",
        data(){
            return{
                eId:'',
                amount:'',
                updateStatus:'',
                message:''
            }
        },
        methods:{
            async updateEmployee(){
                let result=await axios.put("http://localhost:8085/employees/"+this.eId+"/"+this.amount);
                console.log(result);
                if (result.status == 202) {
                this.message = "Employee Salary Incremented";
                this.updateStatus = true;
            }
            else if(result.status==204){ 
                this.message = "Employee Salary Not Incremented";
                this.updateStatus = false;
            }
            }
        }
    }
</script>