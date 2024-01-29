package tn.tuniprod.gestionmagasin;

public class Produit {
    private int id;
    private String type;
    private String libelle;
    private double quantite;
    private double prix;  // New attribute for the price

    // Constructeurs
    public Produit() {
    }

    public Produit(int id, String type, String libelle, double quantite, double prix) {
        this.id = id;
        this.type = type;
        this.libelle = libelle;
        this.quantite = quantite;
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", libelle='" + libelle + '\'' +
                ", quantite=" + quantite +
                '}';
    }
}
