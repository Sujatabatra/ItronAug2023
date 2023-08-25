package com.sujata.persistence;

import com.sujata.entity.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        int eid=resultSet.getInt("EID");
        String name=resultSet.getString("ENAME");
        String desig=resultSet.getString("DESIGNATION");
        String deptt=resultSet.getString("DEPARTMENT");
        double sal=resultSet.getDouble("SALARY");

        Employee employee=new Employee(eid,name,desig,deptt,sal);
        return employee;
    }
}
