package com.sujata.service;

import com.sujata.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(int empId);

    boolean addNewEmployee(Employee employee);

    boolean deleteEmployeeById(int empId);
}
