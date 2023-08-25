package com.sujata.persistence;

import com.sujata.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer> {

    /*
    JPQL don't have insert statement so we are making use of SQL
     */
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "insert into employee values(?,?,?,?,?)")
    public int insertRecord(int id,String na,String des,String dep,double sal);
}
