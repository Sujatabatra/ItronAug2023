package com.sujata.service;

import com.sujata.entity.Employee;
import com.sujata.persistence.EmployeeDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.swing.text.html.Option;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceImplTest {

    private EmployeeDao employeeDao;
    private EmployeeServiceImpl employeeService;

    @BeforeEach
    void setUp()throws Exception{

        employeeService=new EmployeeServiceImpl();

        //Mocking Dao object
        employeeDao= Mockito.mock(EmployeeDao.class);

        employeeService.setEmployeeDao(employeeDao);
    }



    @Test
    void getEmployeeByIdTestCaseOne() {
//        Employee employee=new Employee(1,"AAA","Associate","Sales",25000);
        Mockito.when(employeeDao.getRecordById(1)).thenReturn(Optional.of(new Employee(1,"AAA","Associate","Sales",25000)));

//        assertEquals(employee,employeeService.getEmployeeById(1).get());

        assertTrue(employeeService.getEmployeeById(1).isPresent());
        
    }


}