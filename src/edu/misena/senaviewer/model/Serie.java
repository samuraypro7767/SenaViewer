package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Serie extends Film {
    private int timeViewed;
    private int sessionQuantity;


    public Serie(String title, String genre, int duration, int sessionQuantity) {
        super(title, genre, duration);
        this.sessionQuantity = sessionQuantity;
        this.timeViewed = 0; // Inicializar timeViewed
    }


    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "timeViewed=" + timeViewed +
                ", sessionQuantity=" + sessionQuantity +
                ", " + super.toString() +
                '}';
    }

    // Menú para gestionar series
    public static void menuSerie() {
        Scanner scanner = new Scanner(System.in);

        // Crear una serie de ejemplo
        Serie serie = new Serie("Avatar: la leyenda de Aang", "Acción", 110, 3);

        int opcion;

        do {
            String message = "\n\nMenú de Serie\n\n";
            message += "1. Ver información\n";
            message += "2. Actualizar información\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verInformacionSerie(scanner, serie);
                    break;
                case 2:
                    actualizarInformacionSerie(scanner, serie);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion != 3);

        scanner.close();
    }

    private static void verInformacionSerie(Scanner scanner, Serie serie) {
        int opcion1;

        do {
            String message1 = "\n\nInformación de Serie\n\n";
            message1 += "1. Ver título de la serie\n";
            message1 += "2. Ver género de la serie\n";
            message1 += "3. Ver duración de la serie\n";
            message1 += "4. Ver tiempo visto\n";
            message1 += "5. Ver cantidad de sesiones\n";
            message1 += "6. Salir...\n\n";

            System.out.println(message1);

            System.out.println("Elige tu opción: ");
            opcion1 = scanner.nextInt();

            switch (opcion1) {
                case 1:
                    System.out.println("El título de la serie es: " + serie.getTitle());
                    break;
                case 2:
                    System.out.println("El género de la serie es: " + serie.getGenre());
                    break;
                case 3:
                    System.out.println("La duración de la serie es: " + serie.getDuration() + " minutos");
                    break;
                case 4:
                    System.out.println("El tiempo visto es: " + serie.getTimeViewed() + " minutos");
                    break;
                case 5:
                    System.out.println("La cantidad de sesiones es: " + serie.getSessionQuantity());
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion1 != 6);
    }

    private static void actualizarInformacionSerie(Scanner scanner, Serie serie) {
        int opcion2;

        do {
            String message2 = "\n\nActualizar información de Serie\n\n";
            message2 += "1. Actualizar título de la serie\n";
            message2 += "2. Actualizar género de la serie\n";
            message2 += "3. Actualizar duración de la serie\n";
            message2 += "4. Actualizar tiempo visto\n";
            message2 += "5. Actualizar cantidad de sesiones\n";
            message2 += "6. Salir...\n\n";

            System.out.println(message2);

            System.out.println("Elige tu opción: ");
            opcion2 = scanner.nextInt();
            scanner.nextLine();

            switch (opcion2) {
                case 1:
                    System.out.println("Ingrese el nuevo título: ");
                    serie.setTitle(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo género: ");
                    serie.setGenre(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Ingrese la nueva duración en minutos: ");
                    serie.setDuration(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo tiempo visto en minutos: ");
                    serie.setTimeViewed(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Ingrese la nueva cantidad de sesiones: ");
                    serie.setSessionQuantity(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion2 != 6);
    }
}
