package tn.tuniprob.gestionmagasin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
    public static void main(String[] args) {
        String dbURL = "jdbc:oracle:thin:@localhost:1522:xe";
        String username = "system";
        String password = "admin";
        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Connected to the database:");
            String sql =  "insert into employe " +
                          "values(1, 'aymen ben aziza', 'beb ejdid', 500)";
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0)
                System.out.println("a row has been inserted");
            else
                System.out.println("faild to insert a row");

        } catch (SQLException e) {
            System.out.println("Oops, connection error");
            e.printStackTrace();
        }
    }
}
