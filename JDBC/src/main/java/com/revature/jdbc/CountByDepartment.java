package com.revature.jdbc;

import java.sql.*;
import java.util.Scanner;

public class CountByDepartment {
    public void countByDept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rev", "root", "Chinnu@15");
             PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM employee WHERE department = ?")) {

            ps.setString(1, dept);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Employees in " + dept + " department: " + rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
