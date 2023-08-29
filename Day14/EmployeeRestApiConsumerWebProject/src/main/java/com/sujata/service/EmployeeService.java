package com.sujata.service;

import com.sujata.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeByID(int employeeId);
}
