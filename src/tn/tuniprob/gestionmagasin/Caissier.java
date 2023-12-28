package tn.tuniprob.gestionmagasin;

public class Caissier extends Employe {
    private int numeroDeCaisse;

    // Constructeur
    public Caissier(int identifiant, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    // Getters and setters

    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }

    // Méthode pour calculer le salaire du caissier
    @Override
    public double calculerSalaire() {
        double salaire = super.calculerSalaire();

        // Heures supplémentaires pour les caissiers (au-delà de 180 heures)
        if (getNbrHeures() > 180) {
            salaire += (getNbrHeures() - 180) * 0.15 * 5; // 15% de plus que les heures normales
        }

        return salaire;
    }
}
