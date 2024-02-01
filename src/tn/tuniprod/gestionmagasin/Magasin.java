package tn.tuniprod.gestionmagasin;
import java.sql.SQLException;
import java.util.ArrayList;
public class Magasin {
    private int identifiant;
    private String nom;
    private String adresse;
    private int capacite;
    private ArrayList<Produit> produits = new ArrayList<>();
    private ArrayList<Employe> employes = new ArrayList<>();

    // Constructeurs, getters et setters

    // Constructeur avec toutes les caractéristiques
    public Magasin(int identifiant, String nom, String adresse, int capacite) {
        // Appel au constructeur par défaut
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
    }


    // Getters et setters


    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }
    public ArrayList<Employe> getEmployes() {
        return this.employes;
    }
    public void setEmployes(ArrayList<Employe> employes){
        this.employes = employes;
    }
    // Autres méthodes comme ajouterProduit(), comparer(), chercherProduit(), etc.

    // Méthode pour retourner le nombre total de produits dans le magasin
    public int getNombreProduits() {
        return produits.size();
    }

    // Méthode pour afficher les caractéristiques du magasin, ainsi que le nom et le prix de ses produits
    public void afficherCaracteristiques() {
        System.out.println("Identifiant du magasin : " + identifiant);
        System.out.println("Adresse du magasin : " + adresse);
        System.out.println("Capacité du magasin : " + capacite);
        System.out.println("Produits du magasin :");
        for (Produit produit : produits) {
            System.out.println(" - Nom : " + produit.getLibelle() + ", Prix : " + produit.getPrix());
        }
        System.out.println("Nombre total de produits : " + produits.size());
    }

    public boolean comparer(Produit produit1, Produit produit2) {
        return produit1.getId() == produit2.getId() &&
                produit1.getLibelle().equals(produit2.getLibelle());
    }

    // Méthode pour comparer un produit avec les produits du magasin
    public boolean comparer(Produit produit) {
        for (Produit magasinProduit : produits) {
            if (comparer(magasinProduit, produit)) {
                return true; // Produit trouvé dans le magasin
            }
        }
        return false; // Produit non trouvé dans le magasin
    }

    // Méthode pour chercher un produit dans le magasin
    public boolean chercherProduit(Produit produit) {
        return comparer(produit);
    }

    // Modifier la méthode ajouterProduit pour éviter les redondances
    public void ajouterProduit(Produit produit) {
        if (!comparer(produit) && produits.size() < capacite) {
            produits.add(produit);
            System.out.println("Produit ajouté au magasin.");
        } else {
            System.out.println("Erreur : Le produit existe déjà dans le magasin ou capacité maximale atteinte.");
        }
    }

    // Méthode pour supprimer un produit du magasin
    public void supprimerProduit(Produit produit) {
        if (produits.remove(produit)) {
            System.out.println("Produit supprimé du magasin.");
        } else {
            System.out.println("Erreur : Le produit n'existe pas dans le magasin.");
        }
    }

    // Méthode pour retourner le magasin avec un nombre supérieur de produits entre deux magasins
    public static Magasin magasinAvecPlusDeProduits(Magasin magasin1, Magasin magasin2) {
        return (magasin1.getNombreProduits() > magasin2.getNombreProduits()) ? magasin1 : magasin2;
    }

    public void ajouterEmploye(Employe employe) throws SQLException {
        if (this.employes.size() < 20) {
            employes.add(employe); // Add the employee to the list only if upload is successful
            System.out.println("Employé ajouté au magasin.");
        } else {
            System.out.println("Erreur : Capacité maximale d'employés atteinte.");
        }
    }

    // Méthode pour afficher les caractéristiques des employés
    public void afficherCaracteristiquesEmployes() {
        System.out.println("Employés du magasin :");
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }
}

