package com.revature.jdbc;

import java.sql.*;

public class CountEmployees {
    public void count() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rev", "root", "Chinnu@15");
             PreparedStatement ps = con.prepareStatement("SELECT COUNT(*) FROM employee");
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                System.out.println("Total Employees: " + rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
