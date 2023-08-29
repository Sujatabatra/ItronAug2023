package com.sujata.service;

import com.sujata.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeByID(int employeeId);

    boolean addEmployee(Employee employee);

    boolean deleteEmployee(int employeeId);

    boolean updateEmployee(int employeeId,double incrementAmount);
}
