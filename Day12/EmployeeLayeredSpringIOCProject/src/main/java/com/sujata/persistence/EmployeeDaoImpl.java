package com.sujata.persistence;

import com.sujata.entity.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public List<Employee> getAllRecord() {
        PreparedStatement preparedStatement;
        List<Employee> empList=new ArrayList<>();

        try (Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/itrontraining","root","sujata");){
            Class.forName("com.mysql.cj.jdbc.Driver");

            preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");

            ResultSet resultSet= preparedStatement.executeQuery();

            while(resultSet.next()){
                int id=resultSet.getInt("EID");
                String name=resultSet.getString("ENAME");
                String desig=resultSet.getString("DESIGNATION");
                String deptt=resultSet.getString("DEPARTMENT");
                double sal=resultSet.getDouble("SALARY");

                empList.add(new Employee(id,name,desig,deptt,sal));
            }
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return empList;
    }

    @Override
    public Optional<Employee> getRecordById(int id) {
        PreparedStatement preparedStatement;
        Employee employee=null;
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/itrontraining","root","sujata");){
            Class.forName("com.mysql.cj.jdbc.Driver");

            preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE EID=?");
            preparedStatement.setInt(1,id);


            ResultSet resultSet= preparedStatement.executeQuery();

//            3.Process Result
            if(resultSet.next()){
                int eid=resultSet.getInt("EID");
                String name=resultSet.getString("ENAME");
                String desig=resultSet.getString("DESIGNATION");
                String deptt=resultSet.getString("DEPARTMENT");
                double sal=resultSet.getDouble("SALARY");

                employee=new Employee(eid,name,desig,deptt,sal);
            }
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return Optional.ofNullable(employee);
    }

    @Override
    public int addRecord(Employee employee) {
        PreparedStatement preparedStatement;
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/itrontraining","root","sujata");){
            Class.forName("com.mysql.cj.jdbc.Driver");

            preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
            preparedStatement.setInt(1,employee.getEmpId());
            preparedStatement.setString(2,employee.getEmpName());
            preparedStatement.setString(3,employee.getEmpDesignation());
            preparedStatement.setString(4,employee.getEmpDepartment());
            preparedStatement.setDouble(5,employee.getEmpSalary());

            //executeUpdate() : execute DML statement and return number of rows manipulated by the query
            return preparedStatement.executeUpdate();

        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteRecordById(int id) {
        PreparedStatement preparedStatement;
        try (Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/itrontraining","root","sujata");){
            Class.forName("com.mysql.cj.jdbc.Driver");

            preparedStatement=connection.prepareStatement("DELETE FROM EMPLOYEE WHERE EID=?");
            preparedStatement.setInt(1,id);

            //executeUpdate() : execute DML statement and return number of rows manipulated by the query
            return preparedStatement.executeUpdate();

        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return 0;
    }
}
