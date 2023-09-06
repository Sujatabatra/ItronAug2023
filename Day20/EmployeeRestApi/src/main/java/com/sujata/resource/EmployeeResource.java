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

    @CrossOrigin
    @GetMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employees> getAllEmployeesResource(){
        Employees employees=new Employees(employeeService.getAllEmployees());
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(path = "/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmployeeByIdResource(@PathVariable("id") int empId){
        Optional<Employee> optionalEmployee=employeeService.getEmployeeById(empId);
        if(optionalEmployee.isPresent())
        return new ResponseEntity<>(optionalEmployee.get(), HttpStatus.FOUND);
        else
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }

    @CrossOrigin
    @PostMapping(path = "/employees",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<Employee> insertEmployeeResource(@RequestBody Employee employee){
        if(employeeService.addNewEmployee(employee))
            return new ResponseEntity<>(employee,HttpStatus.CREATED);
        else
            return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
    }

    @CrossOrigin
    @DeleteMapping(path = "/employees/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> deleteEmployeeResource(@PathVariable("id") int employeeId){
        Optional<Employee> optionalEmployee=employeeService.getEmployeeById(employeeId);

        if(optionalEmployee.isPresent()){
            employeeService.deleteEmployeeById(employeeId);
            return new ResponseEntity<>(optionalEmployee.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
    }

    @CrossOrigin
    @PutMapping(path = "/employees/{id}/{sal}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> updateEmployeeSalaryResource(@PathVariable("id") int empId,@PathVariable("sal") double empSal){

        Employee employee=employeeService.updateEmployeeSalary(empId,empSal);
        if(employee!=null)
            return new ResponseEntity<>(employee,HttpStatus.ACCEPTED);
        else
            return new ResponseEntity<>(employee,HttpStatus.NO_CONTENT);
    }

}
