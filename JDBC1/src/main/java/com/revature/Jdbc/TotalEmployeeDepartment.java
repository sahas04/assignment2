package com.revature.Jdbc;

import java.sql.*;

public class TotalEmployeeDepartment {
    public void totalEmployeeDepartment() throws SQLException {
        String sql="select count(*) as total,department from employee group by department";
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/rev","root","Chinnu@15");
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            ResultSet resultSet= preparedStatement.executeQuery();
        ) {
            System.out.println("total employees in department:");
            while (resultSet.next()){
                int count=resultSet.getInt("total");
                String dept=resultSet.getString("department");
                System.out.println(dept+"--"+count);
            }
        }
    }
}
