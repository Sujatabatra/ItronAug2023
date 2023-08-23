package com.sujata.persistence;

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
import java.util.Optional;

public class EmployeeDaoImpl implements EmployeeDao{


    StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    Metadata meta=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
    SessionFactory sessionFactory=meta.getSessionFactoryBuilder().build();

    @Override
    public List<Employee> getAllRecord() {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        //HQL : Hibernate Query Language : from ClassName
        Query query=session.createQuery("from Employee ");

        List<Employee> empList=query.list();

        transaction.commit();
        session.close();
        return empList;
    }

    @Override
    public Optional<Employee> getRecordById(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee=session.get(Employee.class,id);

        transaction.commit();
        session.close();
        return Optional.ofNullable(employee);
    }

    @Override
    public int addRecord(Employee employee) {
        try {
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
            session.close();
            return 1;
        }
        catch (Exception ex){
            return 0;
        }

    }

    @Override
    public int deleteRecordById(int id) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Optional<Employee> optionalEmployee=getRecordById(id);

        if(optionalEmployee.isPresent()) {
            session.delete(optionalEmployee.get());
            transaction.commit();
            session.close();
            return 1;
        }
        else{
            return 0;
        }

    }
}
