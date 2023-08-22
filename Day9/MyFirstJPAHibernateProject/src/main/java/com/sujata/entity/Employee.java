package com.sujata.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Employee {

    @Id
    @Column(name = "eId", nullable = false)
    private int eId;
    @Basic
    @Column(name = "eName", nullable = true, length = 30)
    private String eName;
    @Basic
    @Column(name = "designation", nullable = true, length = 20)
    private String designation;
    @Basic
    @Column(name = "department", nullable = true, length = 30)
    private String department;
    @Basic
    @Column(name = "salary", nullable = true, precision = 0)
    private Double salary;

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
