package com.revature.Jdbc;

import java.sql.*;
import java.util.Scanner;

public class TotalEmployee {
    public void totalEmployee() throws SQLException {
        Scanner sc=new Scanner(System.in);
        String sql="select count(*) from employee";
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/rev","root","Chinnu@15");
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            ResultSet resultSet= preparedStatement.executeQuery(sql);
        ){
            if(resultSet.next()){
                int count=resultSet.getInt(1);
                System.out.println("total no of employees:"+count);
            }
        }
    }
}
