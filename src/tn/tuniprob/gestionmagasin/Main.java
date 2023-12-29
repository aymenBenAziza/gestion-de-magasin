package tn.tuniprob.gestionmagasin;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Magasin magasin = new Magasin(1, "SuperMagasin", "AdresseMagasin", 50);

        while (true) {
            System.out.println("\n====== Menu ======");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Afficher les caractéristiques du magasin");
            System.out.println("3. Calculer et afficher le stock total");
            System.out.println("4. Quitter");

            System.out.print("Choix: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            }
        }
    }
