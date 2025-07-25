package com.revature.Jdbc;

import java.sql.*;

public class ReadEmployee {
    public void display() throws SQLException {
        String sql="select * from employee";
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/rev","root","Chinnu@15");
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery()){
           while(resultSet.next()){
               System.out.println(resultSet.getString("emp_name")+" "+resultSet.getInt("emp_id")+" "+resultSet.getString("department")+" "+resultSet.getString("designation")+" "+resultSet.getString("email")+" "+resultSet.getInt("salary"));
           }
    }
}}
