package com.revature.jdbc;

import java.sql.*;
import java.util.Scanner;

public class UpdateEmployee {
    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new Designation: ");
        String designation = sc.nextLine();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rev", "root", "Chinnu@15");
             PreparedStatement ps = con.prepareStatement("UPDATE employee SET designation = ? WHERE emp_id = ?")) {

            ps.setString(1, designation);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Designation updated successfully.");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
