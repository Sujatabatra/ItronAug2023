package com.sujata.client;

import com.sujata.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

public class MainClient {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();

        SessionFactory sessionFactory=meta.getSessionFactoryBuilder().build();
        Session session=sessionFactory.openSession();

        Transaction transaction=session.beginTransaction();
//HQL
        Query query=session.createQuery("select empId,empName from Employee");

        List<Object[]> output=query.getResultList();

        for(Object[] out:output){
            for(Object object:out){
                System.out.print(object+"  ");
            }
            System.out.println("");
        }

        System.out.println("===========================");

        Query query1=session.createQuery("select empId,empName from Employee where empDepartment=:dep");
        query1.setParameter("dep","IT");

        List<Object[]> output1=query1.getResultList();

        for(Object[] out:output1){
            for(Object object:out){
                System.out.print(object+"  ");
            }
            System.out.println("");
        }

        Query query2=session.createNativeQuery("select * from employee", Employee.class);

        List<Employee> empList=query2.getResultList();

        for(Employee e:empList){
            System.out.println(e);
        }
        System.out.println("================");

        Query query3=session.createNamedQuery("findByDesignation", Employee.class);
        query3.setParameter("des","Associate");

        List<Employee> eList=query3.getResultList();
        for(Employee e:eList){
            System.out.println(e);
        }
        transaction.commit();

        session.close();



    }
}
