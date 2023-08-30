package com.sujata.service;

import com.sujata.entity.Employee;
import com.sujata.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
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
        try {
            return restTemplate.getForObject("http://localhost:8085/employees/" + employeeId, Employee.class);
        }
        catch (Exception ex){
            return null;
        }
    }

    @Override
    public boolean addEmployee(Employee employee) {
        try {
            ResponseEntity<Employee> employeeResponseEntity = restTemplate.postForEntity("http://localhost:8085/employees", employee, Employee.class);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public boolean deleteEmployee(int employeeId) {
     try {
         HttpHeaders httpHeaders = new HttpHeaders();
         HttpEntity httpEntity = new HttpEntity<>(httpHeaders);
         restTemplate.exchange("http://localhost:8085/employees/" + employeeId, HttpMethod.DELETE, httpEntity, Employee.class);
        return true;
     }
     catch (Exception ex){
         return false;
     }
    }

    @Override
    public boolean updateEmployee(int employeeId, double incrementAmount) {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            HttpEntity httpEntity = new HttpEntity<>(httpHeaders);
            restTemplate.exchange("http://localhost:8085/employees/" + employeeId+"/"+incrementAmount, HttpMethod.PUT, httpEntity, Employee.class);
            return true;
        }
        catch (Exception ex){
            return false;
        }
    }
}
