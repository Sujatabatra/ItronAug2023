package com.sujata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmployeePayslip {
    private Employee employee;
    private double hra;
    private double da;
    private double pf;
    private double totalSalary;
}
