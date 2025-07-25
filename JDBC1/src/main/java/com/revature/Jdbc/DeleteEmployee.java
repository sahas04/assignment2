package com.revature.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {
    public void deleteEmployee() throws SQLException {
        Scanner sc=new Scanner(System.in);
        String sql="delete from employee where emp_id=?";
        System.out.println("enter employee id");
        int id=sc.nextInt();
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/rev","root","Chinnu@15");
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
        ){
            preparedStatement.setInt(1,id);
            int rowsDelete=preparedStatement.executeUpdate();
            if(rowsDelete>0){
                System.out.println("employee delete successfully");
            }else{
                System.out.println("employee record not deleted");
            }
        }
    }
}
