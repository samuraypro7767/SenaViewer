package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Movie extends Film {
    private int timeViewed;

    public Movie(String title, String genre, String creator, int duration, short year) {
        super(title, genre, creator, duration, year);
        this.timeViewed = 0;
    }


    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "timeViewed=" + timeViewed +
                ", " + super.toString() +
                '}';
    }

    // Menú para gestionar películas
    public static void menuMovie() {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie("Deadpool", "Acción", "Tim Miller", 108, (short) 2024);

        int opcion;

        do {
            String message = "\n\nMenú de Movie\n\n";
            message += "1. Ver información\n";
            message += "2. Actualizar información\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verInformacionMovie(movie);
                    break;
                case 2:
                    actualizarInformacionMovie(scanner, movie);
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

    private static void verInformacionMovie(Movie movie) {
        Scanner scanner = new Scanner(System.in);
        int opcion1;

        do {
            String message1 = "\n\nInformación de Movie\n\n";
            message1 += "1. Ver título de la película\n";
            message1 += "2. Ver género de la película\n";
            message1 += "3. Ver creador de la película\n";
            message1 += "4. Ver duración de la película\n";
            message1 += "5. Ver año de la película\n";
            message1 += "6. Ver tiempo visto\n";
            message1 += "7. Salir...\n\n";

            System.out.println(message1);

            System.out.println("Elige tu opción: ");
            opcion1 = scanner.nextInt();

            switch (opcion1) {
                case 1:
                    System.out.println("El título de la película es: " + movie.getTitle());
                    break;
                case 2:
                    System.out.println("El género de la película es: " + movie.getGenre());
                    break;
                case 3:
                    System.out.println("El creador de la película es: " + movie.getCreator());
                    break;
                case 4:
                    System.out.println("La duración de la película es: " + movie.getDuration() + " minutos");
                    break;
                case 5:
                    System.out.println("El año de la película es: " + movie.getYear());
                    break;
                case 6:
                    System.out.println("El tiempo visto es: " + movie.getTimeViewed() + " minutos");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion1 != 7);
    }

    private static void actualizarInformacionMovie(Scanner scanner, Movie movie) {
        int opcion2;

        do {
            String message2 = "\n\nActualizar información de Movie\n\n";
            message2 += "1. Actualizar título de la película\n";
            message2 += "2. Actualizar género de la película\n";
            message2 += "3. Actualizar creador de la película\n";
            message2 += "4. Actualizar duración de la película\n";
            message2 += "5. Actualizar año de la película\n";
            message2 += "6. Actualizar tiempo visto\n";
            message2 += "7. Salir...\n\n";

            System.out.println(message2);

            System.out.println("Elige tu opción: ");
            opcion2 = scanner.nextInt();
            scanner.nextLine();
            switch (opcion2) {
                case 1:
                    System.out.println("Ingrese el nuevo título: ");
                    movie.setTitle(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo género: ");
                    movie.setGenre(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Ingrese el nuevo creador: ");
                    movie.setCreator(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Ingrese la nueva duración en minutos: ");
                    movie.setDuration(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Ingrese el nuevo año: ");
                    movie.setYear(scanner.nextShort());
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Ingrese el nuevo tiempo visto en minutos: ");
                    movie.setTimeViewed(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion2 != 7);
    }
}
