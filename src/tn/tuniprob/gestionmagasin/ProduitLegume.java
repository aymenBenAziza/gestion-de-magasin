package tn.tuniprob.gestionmagasin;

public class ProduitLegume extends Produit {
    private String saisonRecolte;

    // Constructeur
    public ProduitLegume(int identifiant, String libelle, String marque, double prix, String saisonRecolte) {
        super(identifiant, libelle, marque, prix);
        this.saisonRecolte = saisonRecolte;
    }

    // Getter et Setter
    public String getSaisonRecolte() {
        return saisonRecolte;
    }

    public void setSaisonRecolte(String saisonRecolte) {
        this.saisonRecolte = saisonRecolte;
    }
}
