package com.sujata.resource;

import com.sujata.entity.Employee;
import com.sujata.entity.Employees;
import com.sujata.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeResource {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employees> getAllEmployeesResource(){
        Employees employees=new Employees(employeeService.getAllEmployees());
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping(path = "/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmployeeByIdResource(@PathVariable("id") int empId){
        Optional<Employee> optionalEmployee=employeeService.getEmployeeById(empId);
        if(optionalEmployee.isPresent())
        return new ResponseEntity<>(optionalEmployee.get(), HttpStatus.FOUND);
        else
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @PostMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<Employee> insertEmployeeResource(@RequestBody Employee employee){
        if(employeeService.addNewEmployee(employee))
            return new ResponseEntity<>(employee,HttpStatus.CREATED);
        else
            return new ResponseEntity<>(null,HttpStatus.NOT_ACCEPTABLE);
    }


}
