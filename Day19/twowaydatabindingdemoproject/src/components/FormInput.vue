<template>
    <div>
        <h1>Hi I am Form Input</h1>
        <form>
            Enter Employee ID :<input type="text" v-model="form.eId"><br><br>
            Enter Employee Name : <input type="text" v-model="form.eName"><br><br>
            Select Gender : <input type="radio" name="gender" value="Male" v-model="form.eGender">Male
            <input type="radio" name="gender" value="Female" v-model="form.eGender">Female <br><br>
            Select Department : <select v-model="form.eDepartment">
                <option value="IT">IT</option>
                <option value="Sales">Sales</option>
                <option value="Marketing">Marketing</option>
            </select><br><br>
            Enter Designation :<input type="text" v-model="form.eDesignation"><br><br>
            Languages Knows : <input type="checkbox" value="English" v-model="form.eLanguage"/>English
            <input type="checkbox" value="Hindi" v-model="form.eLanguage"/>Hindi
            <input type="checkbox" value="Tamil" v-model="form.eLanguage"/>Tamil
            <input type="checkbox" value="Telgu" v-model="form.eLanguage"/>Telgu<br><br>
            <input type="button" value="Save Data" v-on:click="getData">
        </form>
        {{ form }}
    </div>
</template>
<script>
export default{
    name:'FormInput',
    data(){
        return {
            form:{
                eId:'',
                eName:'',
                eGender:'',
                eDepartment:'',
                eDesignation:'',
                eLanguage:[]
            }
        }
    },
    methods:{
        getData(){
            console.log(this.form);
        }
    }
}
</script>