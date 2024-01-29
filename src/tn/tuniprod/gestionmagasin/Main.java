package tn.tuniprod.gestionmagasin;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Magasin magasin = new Magasin(1, "SuperMagasin", "AdresseMagasin", 50);

        while (true) {
            System.out.println("\n====== Menu ======");
            System.out.println("1. Gérer les produits");
            System.out.println("2. Gérer les employés");
            System.out.println("3. Afficher les caractéristiques du magasin");
            System.out.println("4. Calculer et afficher le stock total");
            System.out.println("5. Quitter");

            System.out.print("Choix: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    manageProductsMenu(scanner, magasin);
                    break;
                case 2:
                    manageEmployeesMenu(scanner, magasin);
                    break;
                case 3:
                    System.out.println("Caractéristiques du magasin: " + magasin);
                    magasin.afficherCaracteristiques();
                    magasin.afficherCaracteristiquesEmployes();
                    break;
                case 4:
                    System.out.println("Calculer et afficher le stock total...");
                    break;
                case 5:
                    System.out.println("Au revoir!");
                    System.exit(0); // Exit the program
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir un nombre entre 1 et 5.");
            }
        }
    }

    private static void manageProductsMenu(Scanner scanner, Magasin magasin) {
        Produit produit = new Produit();
        while (true) {
            System.out.println("\n====== Gérer les produits ======");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Supprimer un produit");
            System.out.println("3. Mettre à jour un produit");
            System.out.println("4. Retour au menu principal");

            System.out.print("Choix: ");
            int productChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (productChoice) {
                case 1:
                    produit = new Produit();
                    System.out.println("Ajouter un produit...");
                    System.out.print("id: ");
                    produit.setId(scanner.nextInt());
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("libelle: ");
                    produit.setLibelle(scanner.nextLine());
                    System.out.print("type: ");
                    produit.setType(scanner.nextLine());
                    System.out.print("quantite: ");
                    produit.setQuantite(scanner.nextDouble());
                    System.out.print("prix: ");
                    produit.setPrix(scanner.nextDouble());
                    // Call a method to add a product
                    magasin.ajouterProduit(produit);
                    break;
                case 2:
                    System.out.println("Supprimer un produit...");
                    // Call a method to delete a product
                    magasin.supprimerProduit(produit);
                    break;
                case 3:
                    System.out.println("Mettre à jour un produit...");
                    // Call a method to update a product
                    break;
                case 4:
                    return; // Return to the main menu
                default:
                    System.out.println("Choix invalide. Veuillez choisir un nombre entre 1 et 4.");
            }
        }
    }

    private static void manageEmployeesMenu(Scanner scanner, Magasin magasin) {
        Employe emp = new Employe();
        while (true) {
            System.out.println("\n====== Gérer les employés ======");
            System.out.println("1. Ajouter un employé");
            System.out.println("2. Supprimer un employé");
            System.out.println("3. Mettre à jour un employé");
            System.out.println("4. Retour au menu principal");

            System.out.print("Choix: ");
            int employeeChoice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (employeeChoice) {
                case 1:
                    System.out.println("Ajouter un employé...");
                    System.out.print("id: ");
                    emp.setIdentifiant(scanner.nextInt());

                    scanner.nextLine(); // Consume the newline character left by scanner.nextInt()

                    System.out.print("nom: ");
                    emp.setNom(scanner.nextLine()); // Use scanner.nextLine() directly to read the whole line

                    System.out.print("adresse: ");
                    emp.setAdresse(scanner.nextLine());

                    System.out.print("nombre d'heures par mois: ");
                    emp.setNbrHeures(scanner.nextInt());

                    // Call a method to add an employee
                    magasin.ajouterEmploye(emp);
                    break;
                case 2:
                    System.out.println("Supprimer un employé...");
                    // Call a method to delete an employee
                    break;
                case 3:
                    System.out.println("Mettre à jour un employé...");
                    // Call a method to update an employee
                    break;
                case 4:
                    return; // Return to the main menu
                default:
                    System.out.println("Choix invalide. Veuillez choisir un nombre entre 1 et 4.");
            }
        }
    }
}
