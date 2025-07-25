package com.revature.Jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertProcedure {
    public void insertProcedure() throws SQLException {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter employee name");
        String name=sc.nextLine();

        System.out.println("enter employee department");
        String dept=sc.nextLine();

        System.out.println("enter employee designation");
        String design=sc.nextLine();

        System.out.println("enter employee email");
        String email=sc.nextLine();

        System.out.println("enter employee salary");
        int salary=sc.nextInt();

        String procedure="{call employee(?,?,?,?,?)}";

        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/rev","root","Chinnu@15");
            CallableStatement callableStatement= connection.prepareCall(procedure);
        ){
            callableStatement.setString(1,name);
            callableStatement.setString(2,dept);
            callableStatement.setString(3,design);
            callableStatement.setString(4,email);
            callableStatement.setInt(5,salary);
            int rowsAffected = callableStatement.executeUpdate();
            System.out.println(rowsAffected + " employee(s) inserted successfully.");

        }
    }
}
