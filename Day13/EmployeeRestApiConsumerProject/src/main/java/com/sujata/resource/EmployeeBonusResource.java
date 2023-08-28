package com.sujata.resource;

import com.sujata.entity.EmployeeWithBonus;
import com.sujata.service.EmployeeBonusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeBonusResource {

    @Autowired
    private EmployeeBonusService employeeBonusService;

    @GetMapping(path = "/employees/bonus/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    private ResponseEntity<EmployeeWithBonus> getDetailsResource(@PathVariable("id") int empId){
        return new ResponseEntity<>(employeeBonusService.getEmployeeDetailsWithID(empId), HttpStatus.OK);
    }
}
