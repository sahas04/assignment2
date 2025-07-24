package com.revature.jdbc;

import java.sql.*;
import java.util.Scanner;

public class DeleteEmployee {
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rev", "root", "Chinnu@15");
             PreparedStatement ps = con.prepareStatement("DELETE FROM employee WHERE emp_id = ?")) {

            ps.setInt(1, id);
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
