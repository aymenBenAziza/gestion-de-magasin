package tn.tuniprob.gestionmagasin;

import java.util.ArrayList;

public class Magasin {
    private int identifiant;
    private String nom;
    private String adresse;
    private int capaciteMax;
    private ArrayList<Produit> produits;
    private ArrayList<Employe> employes;

    // Constructeur par défaut
    public Magasin() {
        produits = new ArrayList<>();
        employes = new ArrayList<>();
    }

    // Constructeur avec paramètres
    public Magasin(int identifiant, String nom, String adresse, int capaciteMax) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.capaciteMax = capaciteMax;
        this.produits = new ArrayList<>();
        this.employes = new ArrayList<>();
    }

    // Méthode pour ajouter un produit au magasin sans redondance
    public void ajouterProduitSansRedondance(Produit produit) {
        if (!rechercherProduit(produit)) {
            ajouterProduit(produit);
        } else {
            System.out.println("Le produit existe déjà dans le magasin. Ajout annulé.");
        }
    }

    public boolean rechercherProduit(Produit produit) {
        return produits.contains(produit);
    }

    // Méthode pour ajouter un employé au magasin
    public void ajouterEmploye(Employe employe) {
        if (employes.size() < 20) {
            employes.add(employe);
        } else {
            System.out.println("Le nombre maximal d'employés est atteint. Impossible d'ajouter plus d'employés.");
        }
    }

    // Méthode pour calculer et afficher les salaires des employés
    public void calculerEtAfficherSalaires() {
        System.out.println("Salaires des employés pour le magasin " + nom + ":");

        for (Employe employe : employes) {
            double salaire = employe.calculerSalaire();
            System.out.println(employe.getNom() + " - Salaire: " + salaire + " DT");
        }
    }

    // Méthode pour afficher les caractéristiques du magasin et les détails des produits et employés
    public void afficherCaracteristiques() {
        System.out.println("Identifiant du magasin: " + identifiant);
        System.out.println("Nom: " + nom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité maximale: " + capaciteMax);
        System.out.println("Nombre total de produits: " + produits.size());
        System.out.println("Nombre total d'employés: " + employes.size());

        System.out.println("Détails des produits:");
        for (Produit produit : produits) {
            System.out.println("Nom: " + produit.getLibelle() + ", Prix: " + produit.getPrix());
        }

        System.out.println("Détails des employés:");
        for (Employe employe : employes) {
            System.out.println("Nom: " + employe.getNom() + ", Identifiant: " + employe.getIdentifiant());
        }
    }

    // Méthode pour ajouter un produit au magasin
    public void ajouterProduit(Produit produit) {
        if (produits.size() < capaciteMax) {
            produits.add(produit);
        } else {
            System.out.println("Capacité maximale du magasin atteinte. Impossible d'ajouter plus de produits.");
        }
    }

    // Méthode pour comparer deux produits
    public boolean comparerProduits(Produit produit1, Produit produit2) {
        return (produit1.getIdentifiant() == produit2.getIdentifiant()) &&
                (produit1.getLibelle().equals(produit2.getLibelle())) &&
                (produit1.getPrix() == produit2.getPrix());
    }

    // Méthode pour comparer un produit avec les produits du magasin
    public boolean comparerProduitAvecMagasin(Produit produit) {
        for (Produit p : produits) {
            if (comparerProduits(p, produit)) {
                return true;
            }
        }
        return false;
    }

    public float calculStock(ProduitFruit p) {
        float stockTotal = 0;
        for (Produit produit : produits) {
            if(produit instanceof ProduitFruit)
                stockTotal ++;
        }
        return stockTotal;
    }

    // Méthode pour trouver le magasin avec le plus de produits entre deux magasins
    public static Magasin magasinAvecPlusDeProduits(Magasin magasin1, Magasin magasin2) {
        return (magasin1.getProduits().size() > magasin2.getProduits().size()) ? magasin1 : magasin2;
    }


    // Autres getters et setters

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public void setCapaciteMax(int capaciteMax) {
        this.capaciteMax = capaciteMax;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }

}
