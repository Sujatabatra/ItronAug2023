package com.sujata.client;

import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;
import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public EmployeeDao getEmployeeDao(){
        return new EmployeeDaoImpl();
    }

    @Bean
    public EmployeeService getEmployeeService(){
        EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
        employeeService.setEmployeeDao(getEmployeeDao());
        return employeeService;
    }

    @Bean("presentation")
    public EmployeePresentation getEmployeePresentation(){
        EmployeePresentationImpl employeePresentation=new EmployeePresentationImpl();
        employeePresentation.setEmployeeService(getEmployeeService());
        return employeePresentation;
    }
}
