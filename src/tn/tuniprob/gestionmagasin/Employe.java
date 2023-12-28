package tn.tuniprob.gestionmagasin;

public class Employe {
    private int identifiant;
    private String nom;
    private String adresse;
    private int nbrHeures;

    // Constructeur
    public Employe(int identifiant, String nom, String adresse, int nbrHeures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }

    // Getters and setters

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbrHeures() {
        return nbrHeures;
    }

    public void setNbrHeures(int nbrHeures) {
        this.nbrHeures = nbrHeures;
    }

    // Méthode pour calculer le salaire
    public double calculerSalaire() {
        return nbrHeures * 5; // Salaire de base à 5DT/H
    }
}
