package com.sujata.persistence;

import com.sujata.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "insert into employee values(?,?,?,?,?)")
    public int insertRecord(int id,String na,String des,String dep,double sal);

    List<Employee> findEmployeeByEmpDepartment(String deptt);
}
