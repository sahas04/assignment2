package com.revature.jdbc;

import java.sql.*;
import java.util.Scanner;

public class ReadEmployeeById {
    public void displayById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empid = sc.nextInt();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rev", "root", "Chinnu@15");
             PreparedStatement ps = con.prepareStatement("SELECT * FROM employee WHERE emp_id = ?")) {

            ps.setInt(1, empid);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println(rs.getInt("emp_id") + " - " + rs.getString("emp_name") + " - "
                        + rs.getString("department") + " - " + rs.getString("designation") + " - "
                        + rs.getString("email") + " - " + rs.getDouble("salary"));
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
