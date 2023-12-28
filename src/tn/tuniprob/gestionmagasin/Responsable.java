package tn.tuniprob.gestionmagasin;

public class Responsable extends Employe {
    private double prime;

    // Constructeur
    public Responsable(int identifiant, String nom, String adresse, int nbrHeures, double prime) {
        super(identifiant, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    // Getters and setters

    public double getPrime() {
        return prime;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    // Méthode pour calculer le salaire du responsable
    @Override
    public double calculerSalaire() {
        double salaire = super.calculerSalaire();

        // Heures supplémentaires pour les responsables (au-delà de 160 heures)
        if (getNbrHeures() > 160) {
            salaire += (getNbrHeures() - 160) * 0.20 * 10; // 20% de plus que les heures normales
        }

        return salaire + prime;
    }
}
