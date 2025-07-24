package com.revature.jdbc;

import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {
        System.out.println("connection done...");
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        //connection
        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/rev","root","Chinnu@15");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //query
        String sql="select * from employee";
        //statement
        try {
            statement=connection.createStatement();
            resultSet=statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("emp_id")+"--"+resultSet.getString("emp_name")+"--"+resultSet.getString("department")+"--"+resultSet.getString("designation")+"--"+resultSet.getInt("salary")+"--"+resultSet.getString("email"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
