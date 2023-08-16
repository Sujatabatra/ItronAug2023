package com.sujata.persistence;

import com.sujata.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDao {
    List<Employee> getAllRecord();
    Optional<Employee> getRecordById(int id);

    int addRecord(Employee employee);

    int deleteRecordById(int id);
}
