package com.sujata.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Employee {
    private int empId;
    private String empName;
    private String empDesignation;
    private String empDepartment;
    private double empSalary;
}
