package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Employee {
    @Id
    @Column(name="eId")
    private int empId;
    @Column(name="eName",length = 30)
    private String empName;
    @Column(name="designation",length = 20)
    private String empDesignation;
    @Column(name="department",length = 30)
    private String empDepartment;
    @Column(name = "salary")
    private double empSalary;
}
