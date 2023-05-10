package com.example.snowitall;
import java.sql.*;

public class push {
        public static void main(String[] args) {
                try {
                        Connection conn = DriverManager.getConnection("snowitall-db.cyvluizuepzk.us-east-1.rds.amazonaws.com", "admin", "password");
                        PreparedStatement stmt = conn.prepareStatement("INSERT INTO User (Username, Password) VALUES (?, ?)"); // replace with your SQL query


                        stmt.setString(1, "admin" ); // replace with your value for the first parameter
                        stmt.setString(2, "password"); // replace with your value for the second parameter


                        stmt.executeUpdate();


                        stmt.close();
                        conn.close();
                }
                catch (SQLException e) {
                        e.printStackTrace();
                }
        }

}
