package tn.tuniprod.gestionmagasin;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Magasin magasin = new Magasin(1, "SuperMagasin", "AdresseMagasin", 50);
        DataBaseConnection db = new DataBaseConnection();
        db.downloadEmploye(magasin);
        db.downloadProduit(magasin);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                db.uploadEmploye(magasin);
                db.uploadProduit(magasin);
                System.out.println("Data uploaded before exit.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }));

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
                    scanner.nextLine();
                    System.out.print("libelle: ");
                    produit.setLibelle(scanner.nextLine());
                    System.out.print("type: ");
                    produit.setType(scanner.nextLine());
                    System.out.print("quantite: ");
                    produit.setQuantite(scanner.nextDouble());
                    scanner.nextLine();
                    System.out.print("prix: ");
                    produit.setPrix(scanner.nextDouble());
                    magasin.ajouterProduit(produit);
                    break;
                case 2:
                    System.out.println("Supprimer un produit...");
                    System.out.println("id: ");
                    int id = scanner.nextInt();
                    magasin.getProduits().remove(id);
                    break;
                case 3:
                    System.out.println("id: ");
                    int ID = scanner.nextInt();
                    System.out.println("Mettre à jour un produit...");
                    System.out.println("1. id");
                    System.out.println("2. libelle");
                    System.out.println("3. quantite");
                    System.out.println("4. prix");
                    System.out.print("choix: ");
                    int choix = scanner.nextInt();
                    switch (choix){
                        case 1:
                            System.out.print("id: ");
                            magasin.getProduits().get(ID).setId(scanner.nextInt());
                            break;
                        case 2:
                            System.out.print("libelle: ");
                            magasin.getProduits().get(ID).setLibelle(scanner.nextLine());
                        case 3:
                            System.out.print("type: ");
                            magasin.getProduits().get(ID).setType(scanner.nextLine());
                        case 4:
                            System.out.print("quantite: ");
                            magasin.getProduits().get(ID).setQuantite(scanner.nextDouble());
                        case 5:
                            System.out.print("prix: ");
                            magasin.getProduits().get(ID).setPrix(scanner.nextDouble());
                    }
                    break;
                case 4:
                    return; // Return to the main menu
                default:
                    System.out.println("Choix invalide. Veuillez choisir un nombre entre 1 et 4.");
            }
        }
    }
    private static void manageEmployeesMenu(Scanner scanner, Magasin magasin) throws SQLException {
        while (true) {
            Employe emp = new Employe();
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

                    // Call a method to add an employeemagasin.ajouterEmploye(emp);
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
