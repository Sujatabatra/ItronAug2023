import { createWebHistory,createRouter } from "vue-router";
import AddNewEmployee from './components/AddNewEmployee.vue';
import ShowAllEmployees from './components/ShowAllEmployees.vue';
import DeleteEmployee from './components/DeleteEmployee.vue';
import UpdateEmployee from './components/UpdateEmployee.vue';

const routes=[
    {
        name:"AddNewEmployee",
        path:"/add",
        component:AddNewEmployee
    },
    {
        name:"ShowAllEmployees",
        path:"/showAll",
        component:ShowAllEmployees
    },
    {
        name:"DeleteEmployee",
        path:"/delete",
        component:DeleteEmployee
    },
    {
        name:"UpdateEmployee",
        path:"/update",
        component:UpdateEmployee
    }

]

const router=createRouter({history:createWebHistory(),routes});

export default router