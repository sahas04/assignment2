package com.revature.Jdbc;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

public class UpdateEmployee {
    public void insertEmployee() throws SQLException {
        String sql="update employee set designation=? where emp_id=?";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter designation:");
        String designation=sc.nextLine();
        System.out.println("enter employee id:");
        int id=sc.nextInt();
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/rev","root","Chinnu@15");
            PreparedStatement preparedStatement=connection.prepareStatement(sql)
        ){
            preparedStatement.setString(1,designation);
            preparedStatement.setInt(2,id);

            int rowUpdate=preparedStatement.executeUpdate();
            if(rowUpdate>0){
                System.out.println("row updated successfully");
            }else{
                System.out.println("employee not found");
            }
        }
    }
}
