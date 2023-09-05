<template>
    <h1>Hi I am Looping Component</h1>
    <h2>List of Technologies</h2>
    <ul>
        <li v-for="technology in technologies" :key="technology"> {{ technology }}</li>
    </ul>
    <h2>Employee Details</h2>
    <table border="1">
        <tr>
            <th>Employee ID</th>
            <th>Name</th>
            <th>Department</th>
            <th>Designation</th>
            <th>Salary</th>
        </tr>
        <tr v-for="employee in employees" :key="employee.eId">
            <td>{{ employee.eId }}</td>
            <td>{{ employee.eName }}</td>
            <td>{{ employee.eDeptt }}</td>
            <td>{{ employee.eDesig }}</td>
            <td>{{ employee.eSal }}</td>
        </tr>
    </table><br><br>
    <button v-on:click="deleteEmployee">Delete last Employee</button>
</template>
<script>
export default{
    name:'LoopingComponent',
    data(){
        return{
            technologies:['Java','.Net','Python','C++'],
            employees:[
                {eId:101,eName:"AAAA",eDeptt:"Sales",eDesig:"Manager",eSal:78000},
                {eId:102,eName:"BBBB",eDeptt:"HR",eDesig:"Associate",eSal:29000},
                {eId:103,eName:"CCCC",eDeptt:"Sales",eDesig:"Executive",eSal:15000},
                {eId:104,eName:"DDDD",eDeptt:"IT",eDesig:"Sr. Manager",eSal:95000},
                {eId:105,eName:"EEEE",eDeptt:"HR",eDesig:"Directory",eSal:590000},
                {eId:106,eName:"FFFF",eDeptt:"Sales",eDesig:"Sr. Manager",eSal:178000}
            ]

        }
    },
    methods:{
        deleteEmployee(){
            this.employees.pop();
        }
    }
    
}
</script>