package com.sujata.demo;

@FunctionalInterface
interface EmployeeFactory{
    Employee getEmployee(int id,String name,String desig,String deptt,double sal);
}

public class FourthClassDemo {
    public static void main(String args[]){

//        EmployeeFactory employeeFactory=(id,name,des,dep,sal)->new Employee(id,name,des,dep,sal);

        EmployeeFactory employeeFactory=Employee::new;
        
        Employee employee=employeeFactory.getEmployee(1,"AAA","Associate","IT",55000);

        System.out.println(employee);

    }
}
