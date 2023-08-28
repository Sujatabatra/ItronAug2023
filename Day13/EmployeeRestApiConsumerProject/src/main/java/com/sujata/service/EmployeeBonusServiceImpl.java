package com.sujata.service;

import com.sujata.entity.Employee;
import com.sujata.entity.EmployeeWithBonus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeBonusServiceImpl implements EmployeeBonusService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public EmployeeWithBonus getEmployeeDetailsWithID(int id) {
        Employee employee=restTemplate.getForObject("http://localhost:8085/employees/"+id,Employee.class);
        if(employee.getEmpSalary()>50000){
            EmployeeWithBonus employee1=new EmployeeWithBonus(employee.getEmpId(),employee.getEmpName(),employee.getEmpDesignation(),employee.getEmpDepartment(),employee.getEmpSalary(),20000.0,employee.getEmpSalary()+20000);
            return employee1;
        }
        return new EmployeeWithBonus(employee.getEmpId(),employee.getEmpName(),employee.getEmpDesignation(),employee.getEmpDepartment(),employee.getEmpSalary(),0.0,employee.getEmpSalary());
    }
}
