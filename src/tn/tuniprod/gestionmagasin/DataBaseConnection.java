package tn.tuniprod.gestionmagasin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    public static void main(String[] args) {
        String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
        String password = "admin";
        String user = "system";
        try {
            Connection connection = DriverManager.getConnection(dbURL, user, password);
            System.out.println("Connecté");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
