package tn.tuniprod.gestionmagasin;

import java.sql.*;
import java.util.ArrayList;

public class DataBaseConnection {
    String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "aymen";
    String password = "admin";
    Connection connection = null;
    public DataBaseConnection() {
        try {
            connection = DriverManager.getConnection(dbURL, user, password);
            System.out.println("Connecté");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void downloadEmploye(Magasin magasin) throws SQLException {
        String sql1 = "select id, nom, adresse, nbrheure from employe";
        String sql2 = "TRUNCATE TABLE employe";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql1);

        while (rs.next()) {
            Employe employe = new Employe(); // Move this line inside the loop
            employe.setIdentifiant(rs.getInt(1));
            employe.setNom(rs.getString(2));
            employe.setAdresse(rs.getString(3));
            employe.setNbrHeures(rs.getInt(4));
            magasin.ajouterEmploye(employe);
        }
        int row = statement.executeUpdate(sql2);
    }


    public void downloadProduit(Magasin magasin) throws SQLException {
        String sql1 = "select id, libelle, type, quantite, prix from produit";
        String sq2 = "TRUNCATE TABLE produit";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql1);
        while (rs.next()) {
            Produit produit = new Produit(); // Move this line inside the loop
            produit.setId(rs.getInt(1));
            produit.setLibelle(rs.getString(2));
            produit.setType(rs.getString(3));
            produit.setQuantite(rs.getDouble(4));
            produit.setPrix(rs.getDouble(5));
            magasin.ajouterProduit(produit);
        }
        int row = statement.executeUpdate(sq2);
        // Inside downloadEmploye method, add the following at the end of the method:
    }
    public void uploadEmploye(Magasin magasin) throws SQLException {
        String sql = "INSERT INTO employe (id, nom, adresse, nbrheure) VALUES (?, ?, ?, ?)";
        for (int i = 0; i < magasin.getEmployes().size(); i++) {
            Employe employe = magasin.getEmployes().get(i);
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, employe.getIdentifiant());
                preparedStatement.setString(2, employe.getNom());
                preparedStatement.setString(3, employe.getAdresse());
                preparedStatement.setInt(4, employe.getNbrHeures());
                preparedStatement.executeUpdate();
            }
        }
    }

    public void uploadProduit(Magasin magasin) throws SQLException {
        String sql = "INSERT INTO produit (ID, LIBELLE, TYPE, QUANTITE, PRIX) VALUES (?, ?, ?, ?, ?)";

        // Assuming you have a valid connection object named "connection"

        for (int i = 0; i < magasin.getProduits().size(); i++) {
            Produit produit = magasin.getProduits().get(i);
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setInt(1, produit.getId());
                preparedStatement.setString(2, produit.getLibelle());
                preparedStatement.setString(3, produit.getType());
                preparedStatement.setDouble(4, produit.getQuantite());
                preparedStatement.setDouble(5, produit.getPrix());
                preparedStatement.executeUpdate();
            }
        }
    }

}
