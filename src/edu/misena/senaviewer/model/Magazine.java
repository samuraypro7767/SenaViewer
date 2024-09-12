package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Magazine extends Publication {
    private int id;


    public Magazine(String title, String editionDate, String editorial) {
        super(title, editionDate, editorial);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", " + super.toString() +
                '}';
    }

    // Menú para gestionar revistas
    public static void menuMagazine() {
        Scanner scanner = new Scanner(System.in);


        Magazine magazine = new Magazine("Innovations Today", "2024-08-15", "Anna Lee");

        int opcion;

        do {
            String message = "\n\nMenú de Magazine\n\n";
            message += "1. Ver información\n";
            message += "2. Actualizar información\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    verInformacionMagazine(scanner, magazine);
                    break;
                case 2:
                    actualizarInformacionMagazine(scanner, magazine);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion != 3);

        scanner.close(); // Cerrar el scanner al final
    }

    private static void verInformacionMagazine(Scanner scanner, Magazine magazine) {
        int opcion1;

        do {
            String message1 = "\n\nInformación de Magazine\n\n";
            message1 += "1. Ver título de la revista\n";
            message1 += "2. Ver fecha de la revista\n";
            message1 += "3. Ver editorial de la revista\n";
            message1 += "4. Salir...\n\n";

            System.out.println(message1);

            System.out.println("Elige tu opción: ");
            opcion1 = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion1) {
                case 1:
                    System.out.println("El título de la revista es: " + magazine.getTitle());
                    break;
                case 2:
                    System.out.println("La fecha de la revista es: " + magazine.getEdititionDate());
                    break;
                case 3:
                    System.out.println("La editorial de la revista es: " + magazine.getEditorial());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion1 != 4);
    }

    private static void actualizarInformacionMagazine(Scanner scanner, Magazine magazine) {
        int opcion2;

        do {
            String message2 = "\n\nActualizar información de Magazine\n\n";
            message2 += "1. Actualizar título de la revista\n";
            message2 += "2. Actualizar fecha de la revista\n";
            message2 += "3. Actualizar editorial de la revista\n";
            message2 += "4. Salir...\n\n";

            System.out.println(message2);

            System.out.println("Elige tu opción: ");
            opcion2 = scanner.nextInt();
            scanner.nextLine();

            switch (opcion2) {
                case 1:
                    System.out.println("Ingrese el nuevo título: ");
                    magazine.setTitle(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese la nueva fecha (formato YYYY-MM-DD): ");
                    magazine.setEdititionDate(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Ingrese la nueva editorial: ");
                    magazine.setEdititionDate(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion2 != 4);
    }
}
