<template>
<h2>List Of Employees</h2>
<table border="1">
    <tr>
        <th>Employee ID</th>
        <th>Employee Name</th>
        <th>Designation</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>
    <tr v-for="employee in employees" :key="employee.empId">
        <td>{{ employee.empId }}</td>
        <td>{{ employee.empName }}</td>
        <td>{{ employee.empDesignation }}</td>
        <td>{{ employee.empDepartment }}</td>
        <td>{{ employee.empSalary }}</td>
    </tr>
</table>
</template>
<script>
import axios from 'axios'
    export default{
        name:"ShowAllEmployees",
        data(){
            return{
                employees:[]
            }
        },
        async mounted(){
            let result=await axios.get("http://localhost:8085/employees");
            this.employees=result.data.employees;
            
        }
    }
</script>
<style scoped>
h2{

    text-decoration: underline;
}
</style>