package tn.tuniprod.gestionmagasin;

public class Employe {
    private int identifiant;
    private String nom;
    private String adresse;
    private int nbrHeures;



    // Constructeurs, getters et setters

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

    // Méthode pour calculer le salaire (à implémenter dans les sous-classes)
    public double calculerSalaire() {
        // À compléter dans les sous-classes
        return 0.0;
    }

    // Méthode pour afficher les détails de l'employé
    @Override
    public String toString() {
        return "Identifiant: " + identifiant + ", Nom: " + nom + ", Adresse: " + adresse + ", Nbr Heures: " + nbrHeures;
    }
}
