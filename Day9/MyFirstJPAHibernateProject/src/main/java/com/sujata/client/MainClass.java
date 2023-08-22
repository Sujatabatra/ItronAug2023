package com.sujata.client;

import com.sujata.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("default");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();

        try{
            entityTransaction.begin();

            //DB some Operation
            Employee employee=new Employee();
            employee.seteId(6);
            employee.seteName("FFFF");
            employee.setDesignation("Associate");
            employee.setDepartment("HR");
            employee.setSalary(45000.0);

            entityManager.persist(employee);

            entityTransaction.commit();
        }
        finally {
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
