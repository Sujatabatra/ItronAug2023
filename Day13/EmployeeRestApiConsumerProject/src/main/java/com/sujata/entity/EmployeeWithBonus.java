package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeWithBonus {
    private int empId;

    private String empName;

    private String empDesignation;

    private String empDepartment;

    private double empSalary;
    private double bonus;
    private double totalSalary;
}
