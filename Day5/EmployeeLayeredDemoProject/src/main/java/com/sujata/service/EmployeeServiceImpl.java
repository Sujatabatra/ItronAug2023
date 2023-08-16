package com.sujata.service;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDao employeeDao=new EmployeeDaoImpl();

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllRecord();
    }

    @Override
    public Optional<Employee> getEmployeeById(int empId) {
        return employeeDao.getRecordById(empId);
    }
}
