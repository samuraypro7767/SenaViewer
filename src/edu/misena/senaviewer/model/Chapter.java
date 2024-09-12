package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Chapter {
    private int id;
    private String title;
    private int duration;
    private short year;
    private boolean viewed;
    private int timeViewed;
    private int sessionNumber;


    public Chapter(String title, int duration, short year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
        this.viewed = false;
        this.timeViewed = 0;
        this.sessionNumber = 0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    @Override
    public String toString() {
        return "Chapter{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", viewed=" + viewed +
                ", timeViewed=" + timeViewed +
                ", sessionNumber=" + sessionNumber +
                '}';
    }


    public static void menuChapter() {
        Scanner scanner = new Scanner(System.in);
        Chapter chapter = new Chapter("El misterio de la casa encantada", 35, (short) 2023);

        int opcion;

        do {
            String message = "\n\nMenu de Chapter\n\n";
            message += "1. Ver información\n";
            message += "2. Actualizar información\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verInformacionChapter(chapter);
                    break;
                case 2:
                    actualizarInformacionChapter(scanner, chapter);
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

    private static void verInformacionChapter(Chapter chapter) {
        Scanner scanner = new Scanner(System.in);
        int opcion1;

        do {
            String message1 = "\n\n¿Que vas a consultar de Chapter?\n\n";
            message1 += "1. Ver título del capítulo\n";
            message1 += "2. Ver duración del capítulo\n";
            message1 += "3. Ver año del capítulo\n";
            message1 += "4. Salir...\n\n";

            System.out.println(message1);

            System.out.println("Elige tu opción: ");
            opcion1 = scanner.nextInt();

            switch (opcion1) {
                case 1:
                    System.out.println("El título del capítulo es: " + chapter.getTitle());
                    break;
                case 2:
                    System.out.println("La duración del capítulo es: " + chapter.getDuration() + " minutos");
                    break;
                case 3:
                    System.out.println("El año del capítulo es: " + chapter.getYear());
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

    private static void actualizarInformacionChapter(Scanner scanner, Chapter chapter) {
        int opcion2;

        do {
            String message2 = "\n\nActualizaciones de Chapter\n\n";
            message2 += "1. Actualizar id\n";
            message2 += "2. Actualizar título\n";
            message2 += "3. Actualizar duración\n";
            message2 += "4. Actualizar año\n";
            message2 += "5. Actualizar visto\n";
            message2 += "6. Actualizar tiempo visto\n";
            message2 += "7. Actualizar número de sesiones\n";
            message2 += "8. Salir...\n\n";

            System.out.println(message2);

            System.out.println("Elige tu opción: ");
            opcion2 = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion2) {
                case 1:
                    System.out.println("Ingrese el nuevo id: ");
                    chapter.setId(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo título: ");
                    chapter.setTitle(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Ingrese la nueva duración en minutos: ");
                    chapter.setDuration(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo año: ");
                    chapter.setYear(scanner.nextShort());
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("¿El capítulo ha sido visto? (true/false): ");
                    chapter.setViewed(scanner.nextBoolean());
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.println("Ingrese el tiempo visto en minutos: ");
                    chapter.setTimeViewed(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.println("Ingrese el número de sesiones: ");
                    chapter.setSessionNumber(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion2 != 8);
    }
}
