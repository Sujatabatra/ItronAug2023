package com.sujata.entity;

import java.util.Objects;

public class Employee {
    private int eId;
    private String eName;
    private String designation;
    private String department;
    private Double salary;

    public Employee(){

    }

    public Employee(int eId, String eName, String designation, String department, Double salary) {
        this.eId = eId;
        this.eName = eName;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return eId == employee.eId && Objects.equals(eName, employee.eName) && Objects.equals(designation, employee.designation) && Objects.equals(department, employee.department) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eId, eName, designation, department, salary);
    }
}
