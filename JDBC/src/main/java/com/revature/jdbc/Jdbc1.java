package com.revature.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Jdbc1 {
    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        Statement statement=null;
        PreparedStatement preparedStatement=null;
        Scanner sc=new Scanner(System.in);
        ResultSet resultSet=null;

        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/rev","root","Chinnu@15");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("enter employee id:");
        int a= sc.nextInt();
        String sql="select * from employee where emp_id=?";
        preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,a);
        resultSet=preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println("employee_name:"+resultSet.getString("emp_name"));
        }

    }
}
