package com.revature.Jdbc;

import java.sql.*;
import java.util.Scanner;

public class ReadEmployeeById {
    public void employeeId() throws SQLException {
        String sql="select * from employee where emp_id=?";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employee id:");
        int empid=sc.nextInt();
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/rev","root","Chinnu@15");
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
        ){

            preparedStatement.setInt(1,empid);

            try(ResultSet resultSet=preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println("employee id found");
                    System.out.println(resultSet.getInt("emp_id") + "--" + resultSet.getString("emp_name"));
                } else {
                    System.out.println("employee id not found");
                }
            }
        }
    }

}
