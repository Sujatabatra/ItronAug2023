<template>
    <h2>Employee Details</h2>

    Enter Employee ID :<input type="text" placeholder="Employee ID" v-model="eId"><br><br>
    Enter Employee Name : <input type="text" placeholder="Employee Name" v-model="eName"><br><br>
    Select Employee Designation : <select v-model="eDesignation">
        <option value="Associate">Associate</option>
        <option value="Sr. Associate">Sr. Associate</option>
        <option value="Executive">Executive</option>
        <option value="Sr. Executive">Sr. Executive</option>
        <option value="Manager">Manager</option>
        <option value="Sr. Manager">Sr. Manager</option>
    </select><br><br>
    Select Employee Department : <input type="radio" name="deptt" value="HR" v-model="eDepartment">HR
    <input type="radio" name="deptt" value="Marketing" v-model="eDepartment">Marketing
    <input type="radio" name="deptt" value="IT" v-model="eDepartment">IT
    <input type="radio" name="deptt" value="Sales" v-model="eDepartment">Sales
    <br><br>
    <input type="text" placeholder="Salary" v-model="eSalary"><br><br>
    <button v-on:click="saveEmployee">Save Employee</button>
    <h3 v-if="addStatus">{{ message }}</h3>
    <h3 v-if="!addStatus">{{ message }}</h3>
    
</template>
<script>
import axios from 'axios'
export default {
    name: "AddNewEmployee",
    data() {
        return {

            eId: '',
            eName: '',
            eDesignation: '',
            eDepartment: '',
            eSalary: '',
            message: '',
            addStatus: ''
        }
    },
    methods: {
        async saveEmployee() {

            let result = await axios.post("http://localhost:8085/employees", {
                "empId": this.eId,
                "empName": this.eName,
                "empDesignation": this.eDesignation,
                "empDepartment": this.eDepartment,
                "empSalary": this.eSalary
            });
            if (result.status == 201) {
                this.message = "Employee Addded";
                this.addStatus = true;
            }
            else if(result.status==204){ 
                this.message = "Employee Not Added";
                this.addStatus = false;
            }
        }
    }
}
</script>