package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration; // Nouvel attribut pour la date d'expiration

    // Constructeur par défaut
    public Produit() {
    }

    // Constructeur avec paramètres
    public Produit(int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    // Méthode pour afficher les détails du produit
    public void afficher() {
        System.out.println("Identifiant: " + identifiant);
        System.out.println("Libellé: " + libelle);
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix);
        System.out.println("Date d'expiration: " + (dateExpiration != null ? dateExpiration.toString() : "Non spécifiée"));
        System.out.println("--------------");
    }

    // Méthode pour compléter les informations manquantes
    public void completerInformations(String libelle, String marque, double prix, Date dateExpiration) {
        this.libelle = libelle;
        this.marque = marque;
        this.prix = (prix >= 0) ? prix : 0; // Assure que le prix n'est pas négatif
        this.dateExpiration = dateExpiration;
    }

    // Méthode toString pour afficher les informations du produit
    @Override
    public String toString() {
        return "Identifiant: " + identifiant +
                ", Libellé: " + libelle +
                ", Marque: " + marque +
                ", Prix: " + prix +
                ", Date d'expiration: " + (dateExpiration != null ? dateExpiration.toString() : "Non spécifiée");
    }

    // Getters and setters

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = (prix >= 0) ? prix : 0; // Assure que le prix n'est pas négatif
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}
