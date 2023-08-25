package com.sujata.persistence;

import com.sujata.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Employee> getAllRecord() {
        String query="SELECT * FROM EMPLOYEE";
        List<Employee> empList=jdbcTemplate.query(query,new EmployeeRowMapper());

        return empList;
    }

    @Override
    public Optional<Employee> getRecordById(int id) {
        try {
            String query = "SELECT * FROM EMPLOYEE WHERE EID=?";
            Employee employee = jdbcTemplate.queryForObject(query, new EmployeeRowMapper(), id);
            return Optional.ofNullable(employee);
        }
        catch (EmptyResultDataAccessException ex){
            return Optional.ofNullable(null);
        }
    }

    @Override
    public int addRecord(Employee employee) {
        try {
            String query = "INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";
            return jdbcTemplate.update(query, employee.getEmpId(), employee.getEmpName(), employee.getEmpDesignation(), employee.getEmpDepartment(), employee.getEmpSalary());
        }
        catch (DuplicateKeyException ex){
            return 0;
        }
    }
    @Override
    public int deleteRecordById(int id) {
        String query="DELETE FROM EMPLOYEE WHERE EID=?";
        return jdbcTemplate.update(query,id);
    }
}
