package com.sujata.service;

import com.sujata.entity.Employee;
import com.sujata.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Employee> getAllEmployees() {
        Employees employees=restTemplate.getForObject("http://localhost:8085/employees",Employees.class);
        return employees.getEmployees();
    }

    @Override
    public Employee getEmployeeByID(int employeeId) {
        return restTemplate.getForObject("http://localhost:8085/employees/"+employeeId,Employee.class);
    }
}
