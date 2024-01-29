package tn.tuniprod.gestionmagasin;

public class Caissier extends Employe {
    private int numeroDeCaisse;

    // Constructeurs, getters et setters

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        // Implémentation du calcul de salaire pour un caissier
        double tauxHoraire = 5.0;
        double salaire = getNbrHeures() * tauxHoraire;

        if (getNbrHeures() > 180) {
            salaire += salaire * 0.15; // 15% de plus pour les heures supplémentaires
        }

        return salaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de Caisse: " + numeroDeCaisse;
    }
}
