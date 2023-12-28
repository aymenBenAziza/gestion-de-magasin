package tn.tuniprob.gestionmagasin;

public class Vendeur extends Employe {
    private double tauxDeVente;

    // Constructeur
    public Vendeur(int identifiant, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(identifiant, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    // Getters and setters

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    // Méthode pour calculer le salaire du vendeur
    @Override
    public double calculerSalaire() {
        return 450 * (tauxDeVente / 100); // Salaire fixe de 450DT multiplié par le taux de vente
    }
}
