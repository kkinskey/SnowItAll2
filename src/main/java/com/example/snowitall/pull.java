package com.example.snowitall;
import java.sql.*;

public class pull
{
    public static void main(String[] args)
    {
        try {
            Connection conn = DriverManager.getConnection("snowitall-db.cyvluizuepzk.us-east-1.rds.amazonaws.com", "admin", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, name FROM User"); // replace with your SQL query


            while (rs.next()) {
                int id = rs.getInt("id"); // "id" is the column name for the id field
                String name = rs.getString("name"); // "name" is the column name for the name field
                // do something with the data
            }

            rs.close();
            stmt.close();
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
