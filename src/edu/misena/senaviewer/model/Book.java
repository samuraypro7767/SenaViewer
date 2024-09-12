package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Book extends Publication {

    private int id;
    private int isbn;
    private boolean readed;
    private int timeReaded;


    public Book(String title, String edititionDate, String editorial, int isbn) {
        super(title, edititionDate, editorial);
        this.isbn = isbn;
        this.readed = false;
        this.timeReaded = 0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn=" + isbn +
                ", readed=" + readed +
                ", timeReaded=" + timeReaded +
                ", " + super.toString() +
                '}';
    }

    // Menú de opciones para gestionar libros
    public static void menuBook() {
        Scanner scanner = new Scanner(System.in);

        Book book = new Book("The Great Gatsby", "1925/04/10", "Charles Scribner's Sons", 978074327);

        int opcion;

        do {
            String message = "\n\nMenu Book\n\n";
            message += "1. Ver información del libro\n";
            message += "2. Actualizar información del libro\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verInformacionLibro(book);
                    break;
                case 2:
                    actualizarInformacionLibro(scanner, book);
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

    private static void verInformacionLibro(Book book) {
        Scanner scanner = new Scanner(System.in);
        int opcion1;

        do {
            String message1 = "\n\nVer información del libro\n\n";
            message1 += "1. Ver título del libro\n";
            message1 += "2. Ver fecha de edición del libro\n";
            message1 += "3. Ver editorial del libro\n";
            message1 += "4. Ver ISBN del libro\n";
            message1 += "5. Salir...\n\n";

            System.out.println(message1);

            System.out.println("Elige tu opción: ");
            opcion1 = scanner.nextInt();

            switch (opcion1) {
                case 1:
                    System.out.println("El título del libro es: " + book.getTitle());
                    break;
                case 2:
                    System.out.println("La fecha de edición del libro es: " + book.getEdititionDate());
                    break;
                case 3:
                    System.out.println("La editorial del libro es: " + book.getEditorial());
                    break;
                case 4:
                    System.out.println("El ISBN del libro es: " + book.getIsbn());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion1 != 5);
    }

    private static void actualizarInformacionLibro(Scanner scanner, Book book) {
        int opcion2;

        do {
            String message2 = "\n\nActualizar información del libro\n\n";
            message2 += "1. Actualizar título del libro\n";
            message2 += "2. Actualizar fecha de edición del libro\n";
            message2 += "3. Actualizar editorial del libro\n";
            message2 += "4. Actualizar ISBN del libro\n";
            message2 += "5. Salir...\n\n";

            System.out.println(message2);

            System.out.println("Elige tu opción: ");
            opcion2 = scanner.nextInt();
            scanner.nextLine();

            switch (opcion2) {
                case 1:
                    System.out.println("Ingrese el nuevo título del libro: ");
                    book.setTitle(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Ingrese la nueva fecha de edición del libro (yyyy/MM/dd): ");
                    book.setEdititionDate(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Ingrese la nueva editorial del libro: ");
                    book.setEditorial(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Ingrese el nuevo ISBN del libro: ");
                    book.setIsbn(scanner.nextInt());
                    scanner.nextLine(); // Consumir el salto de línea
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion2 != 5);
    }
}
