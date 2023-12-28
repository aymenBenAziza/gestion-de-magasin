package tn.tuniprob.gestionmagasin;

public class ProduitFruit extends Produit {
    private String saisonRecolte;

    // Constructeur
    public ProduitFruit(int identifiant, String libelle, String marque, double prix, String saisonRecolte) {
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
