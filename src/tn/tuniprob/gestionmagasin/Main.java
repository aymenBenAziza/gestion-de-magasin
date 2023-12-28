package tn.tuniprob.gestionmagasin;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Créer 2 magasins
        Magasin magasin1 = new Magasin(1, "Carrefour", "Centre-Ville", 50);
        Magasin magasin2 = new Magasin(2, "Monoprix", "Menzah 6", 50);

        // Créer 2 caissiers, un vendeur et un responsable pour le premier magasin
        Caissier caissier1Magasin1 = new Caissier(101, "Caissier1", "Adresse1", 160, 1);
        Vendeur vendeurMagasin1 = new Vendeur(102, "Vendeur1", "Adresse2", 160, 15);
        Responsable responsableMagasin1 = new Responsable(103, "Responsable1", "Adresse3", 160, 100);

        // Créer un caissier, 3 vendeurs et un responsable pour le deuxième magasin
        Caissier caissierMagasin2 = new Caissier(201, "Caissier2", "Adresse4", 160, 2);
        Vendeur vendeur1Magasin2 = new Vendeur(202, "Vendeur2", "Adresse5", 160, 10);
        Vendeur vendeur2Magasin2 = new Vendeur(203, "Vendeur3", "Adresse6", 160, 12);
        Vendeur vendeur3Magasin2 = new Vendeur(204, "Vendeur4", "Adresse7", 160, 14);
        Responsable responsableMagasin2 = new Responsable(205, "Responsable2", "Adresse8", 160, 120);

        // Ajouter les employés aux magasins
        magasin1.ajouterEmploye(caissier1Magasin1);
        magasin1.ajouterEmploye(vendeurMagasin1);
        magasin1.ajouterEmploye(responsableMagasin1);

        magasin2.ajouterEmploye(caissierMagasin2);
        magasin2.ajouterEmploye(vendeur1Magasin2);
        magasin2.ajouterEmploye(vendeur2Magasin2);
        magasin2.ajouterEmploye(vendeur3Magasin2);
        magasin2.ajouterEmploye(responsableMagasin2);

        // Afficher les caractéristiques des employés
        System.out.println("Caractéristiques des employés dans le magasin 1:");
        magasin1.afficherCaracteristiques();

        System.out.println("\nCaractéristiques des employés dans le magasin 2:");
        magasin2.afficherCaracteristiques();

        // Créer et ajouter quelques produits pour chaque magasin
        Produit produit1Magasin1 = new Produit(1001, "Produit1", "Marque1", 5.99);
        Produit produit2Magasin1 = new Produit(1002, "Produit2", "Marque2", 8.50);

        Produit produit1Magasin2 = new Produit(2001, "Produit3", "Marque3", 12.99);
        Produit produit2Magasin2 = new Produit(2002, "Produit4", "Marque4", 6.75);

        magasin1.ajouterProduitSansRedondance(produit1Magasin1);
        magasin1.ajouterProduitSansRedondance(produit2Magasin1);

        magasin2.ajouterProduitSansRedondance(produit1Magasin2);
        magasin2.ajouterProduitSansRedondance(produit2Magasin2);

        // Afficher tous les détails de chaque magasin
        System.out.println("\nDétails du magasin 1:");
        magasin1.afficherCaracteristiques();

        System.out.println("\nDétails du magasin 2:");
        magasin2.afficherCaracteristiques();

        // Calculer et afficher les salaires pour les différents employés
        System.out.println("\nCalcul et affichage des salaires:");
        magasin1.calculerEtAfficherSalaires();
        magasin2.calculerEtAfficherSalaires();
    }
}

