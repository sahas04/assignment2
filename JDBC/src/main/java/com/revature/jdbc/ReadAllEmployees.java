package com.revature.jdbc;

import java.sql.*;

public class ReadAllEmployees {
    public void displayAll() {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rev", "root", "Chinnu@15");
             PreparedStatement ps = con.prepareStatement("SELECT * FROM employee");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                System.out.println(rs.getInt("emp_id") + " - " + rs.getString("emp_name") + " - "
                        + rs.getString("department") + " - " + rs.getString("designation") + " - "
                        + rs.getString("email") + " - " + rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
