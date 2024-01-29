package tn.tuniprod.gestionmagasin;

public class Responsable extends Employe {
    private double prime;

    // Constructeurs, getters et setters

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        // Implémentation du calcul de salaire pour un responsable
        double tauxHoraire = 10.0;
        double salaire = getNbrHeures() * tauxHoraire;

        if (getNbrHeures() > 160) {
            salaire += salaire * 0.20; // 20% de plus pour les heures supplémentaires
        }

        return salaire + prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime: " + prime;
    }
}
