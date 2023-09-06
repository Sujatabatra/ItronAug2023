<template>
  <div>

    <h1>Employee Management System</h1>
    <hr>
    <h3>
      <router-link to="/showAll">List All Employees</router-link> &nbsp;&nbsp;|&nbsp;&nbsp;
      <router-link to="/add">Add New Employee</router-link> &nbsp;&nbsp;|&nbsp;&nbsp;
      <router-link to="/delete">Delete Employee</router-link> &nbsp;&nbsp;|&nbsp;&nbsp;
      <router-link to="/update">Update Salary</router-link> 
    </h3>
    <hr>
  </div>
</template>

<script>

export default {
  name: 'MenuComponent',

}
</script>
<style scoped>
h1{
  text-align: center;
}
</style>
