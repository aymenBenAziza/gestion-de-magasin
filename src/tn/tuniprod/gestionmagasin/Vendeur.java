package tn.tuniprod.gestionmagasin;

public class Vendeur extends Employe {
    private double tauxDeVente;

    // Constructeurs, getters et setters

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        // Implémentation du calcul de salaire pour un vendeur
        double salaireFixe = 450.0;
        return salaireFixe * (tauxDeVente / 100.0);
    }

    @Override
    public String toString() {
        return super.toString() + ", Taux de Vente: " + tauxDeVente;
    }
}
