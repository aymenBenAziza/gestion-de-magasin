package tn.tuniprod.gestionmagasin;

public class ProduitLegume extends Produit {
    private String saison;

    // Constructeurs
    public ProduitLegume() {
        super();
    }

    public ProduitLegume(int id, String type, String libelle, double quantite, double prix, String saison) {
        super(id, type, libelle, quantite, prix);
        this.saison = saison;
    }

    // Getter and setter for the additional attribute
    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    // Override toString method for better representation
    @Override
    public String toString() {
        return "ProduitLegume{" +
                "id=" + getId() +
                ", type='" + getType() + '\'' +
                ", libelle='" + getLibelle() + '\'' +
                ", quantite=" + getQuantite() +
                ", saison='" + saison + '\'' +
                '}';
    }
}
