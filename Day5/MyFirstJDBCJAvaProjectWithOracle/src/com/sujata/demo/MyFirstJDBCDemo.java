package com.sujata.demo;

import java.sql.*;

public class MyFirstJDBCDemo {
    public static void main(String args[]) {

        Connection connection = null;  //Interface
        PreparedStatement preparedStatement;
        try {
//          1. Connect
//          1.1Register Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

//            1.2 Connect To DataBase
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "sujata");

//            2.Query
            preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEE");

            //DQL Statement
            ResultSet resultSet = preparedStatement.executeQuery();

//            3.Process Result
            while (resultSet.next()) {
                String id = resultSet.getString("ID");
                String name = resultSet.getString("NAME");
                String desig = resultSet.getString("DESIGNATION");
                String deptt = resultSet.getString("DEPARTMENT");
                int sal = resultSet.getInt("SALARY");

                System.out.println(id + "  " + name + "  " + desig + "  " + deptt + "  " + sal);
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
