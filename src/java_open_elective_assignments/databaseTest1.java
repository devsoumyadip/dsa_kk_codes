package java_open_elective_assignments;

import java.sql.*;

public class databaseTest1 {

    public static void main(String[] args) {
        // JDBC URL, username and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/java1";  //  database name : java1
        String user = "root";                               // replace with your username
        String password = "root";                       // replace with your password

        // SQL query to create a table
        String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(100), " +
                "age INT, " +
                "email VARCHAR(100))";

        // Try-with-resources to ensure connection is closed
        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Execute the SQL statement
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'students' created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
    }

