package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your name ?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        // Création d'un tableau initial de tâches
        String[] tasks = new String[] {
                "Faire les courses",
                "Étudier Java",
                "Aller courir"
        };

        // Affichage des tâches existantes
        System.out.println("Liste de tâches actuelle :");
        for (int i = 0; i < tasks.length; i++) {
            System.out.println((i + 1) + ". " + tasks[i]);
        }

        // Lire une nouvelle tâche depuis l'utilisateur
        Scanner task = new Scanner(System.in);
        System.out.print("\nEntrez une nouvelle tâche à ajouter : ");
        String newTask = task.nextLine();

        // Créer un nouveau tableau avec une case en plus
        String[] updatedTasks = new String[tasks.length + 1];

        // Copier les anciennes tâches
        for (int i = 0; i < tasks.length; i++) {
            updatedTasks[i] = tasks[i];
        }

        // Ajouter la nouvelle tâche
        updatedTasks[tasks.length] = newTask;

        // Réaffichage de la liste complète
        System.out.println("\nListe mise à jour des tâches :");
        for (int i = 0; i < updatedTasks.length; i++) {
            System.out.println((i + 1) + ". " + updatedTasks[i]);
        }

        // Fermer le scanner
        scanner.close();
    }
}