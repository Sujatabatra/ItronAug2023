package com.sujata.demo;

import java.sql.*;

public class MyFirstJDBCDemo {
    public static void main(String args[]){

        Connection connection=null;
        PreparedStatement preparedStatement;
        try {
//          1. Connect
//          1.1Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

//            1.2 Connect To DataBase
            connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/itrontraining","root","sujata");

//            2.Query
            preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");

            //DQL Statement
            ResultSet resultSet= preparedStatement.executeQuery();

//            3.Process Result
            while(resultSet.next()){
                int id=resultSet.getInt("EID");
                String name=resultSet.getString("ENAME");
                String desig=resultSet.getString("DESIGNATION");
                String deptt=resultSet.getString("DEPARTMENT");
                double sal=resultSet.getDouble("SALARY");

                System.out.println(id+"  "+name+"  "+desig+"  "+deptt+"  "+sal);
            }
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
