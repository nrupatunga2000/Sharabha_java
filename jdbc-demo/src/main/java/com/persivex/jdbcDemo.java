package com.persivex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
// import java.util.PreparedStatement;

/**
 we just imported the necessary packages for JDBC connectivity.
 */

  class DBConnection{
    private static final String URL = "jdbc:mysql://localhost:3306/school";
    private static final String USER = "root";
    private static final String PASSWORD = "Kanchana@1325";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }


 }
public class jdbcDemo 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        try {
            Connection conn = DBConnection.getConnection();
            String query = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");

                System.out.println("ID: " + id + " name: " + name + " marks " + marks);
            }
            rs.close();
            stmt.close();
            conn.close();

            


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
