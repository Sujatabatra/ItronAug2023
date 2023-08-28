package com.sujata.resource;

import com.sujata.entity.Employees;
import com.sujata.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employees> getAllEmployeesResource(){
        Employees employees=new Employees(employeeService.getAllEmployees());
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }


}
