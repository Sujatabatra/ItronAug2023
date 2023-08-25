package com.sujata.client;

import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;
import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class EmployeeConfig {

    /*
    DriverManagerDataSource : connect to database and take care of ClassNotFoundException and SQLException
     */
    @Bean("dataSource")
    public DriverManagerDataSource getDataSource(){
        DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://127.0.0.1:3306/itrontraining");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("sujata");
        return driverManagerDataSource;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public EmployeeDao getEmployeeDao(){
        EmployeeDaoImpl employeeDao= new EmployeeDaoImpl();
        employeeDao.setJdbcTemplate(getJdbcTemplate());
        return employeeDao;
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
