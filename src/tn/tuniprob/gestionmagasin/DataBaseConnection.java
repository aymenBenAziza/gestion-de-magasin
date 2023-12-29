package tn.tuniprob.gestionmagasin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
    public static void main(String[] args) {
        String dbURL = "jdbc:oracle:thin:@localhost:1522:xe";
        String username = "magasin_admin";  // Use the HR schema username
        String password = "admin";  // Use the HR schema password

        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connected to the database:");
            String sql = "INSERT INTO employe VALUES (1, 'Aymen Ben Aziza', 'Beb Ejdid', 500)";

            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);

            if (rows > 0)
                System.out.println("A row has been inserted into the data base");
            else
                System.out.println("Failed to insert a row");

        } catch (SQLException e) {
            System.out.println("Oops, connection error");
            e.printStackTrace();
        }
    }
}
