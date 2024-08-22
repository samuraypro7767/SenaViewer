package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.Scanner;


public class Book {

    int id;
    String title;

    String editionDate;
    String editorial;
    String[] authors;

    int isbn;
    boolean readed;
    int timeReaded;

    public Book (String title,String editionDate, String editorial, int isbn){
        this.title = title;
        this.editionDate = editionDate;
        this.editorial = editorial;
        this.isbn = isbn;
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getEditionDate(){
        return editionDate;
    }

    public void setEditionDate(String editionDate){
        this.editionDate = editionDate;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    public String[] getAuthors(){
        return authors;
    }

    public void setAuthors(String[] authors) {
        if (authors == null) {
            this.authors = new String[0];
        } else {
            this.authors = authors;
        }
    }

    public int getIsbn(){
        return isbn;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public boolean getReaded(){
        return readed;
    }

    public void setReaded(boolean readed){
        this.readed = readed;
    }

    public int getTimeReaded(){
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded){
        this.timeReaded = timeReaded;
    }


    static Book book = new Book("The Great Gatsby", "1925/04/10", "Charles Scribner's Sons", 978074327);



    public static void menuBook(){
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            String message = "\n\nmenu  Book¡\n\n";

            message += "1. Ver informacion de Book \n";
            message += "2. Actualizar informacion de Book\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    int opcion1;

                    do{
                        String message1 = "\n\nver informacion de Book¡\n\n";

                        message1 += "1. Ver titulo del libro\n";
                        message1 += "2. Ver fecha de edicion del libro\n";
                        message1 += "3. Ver editorial del liblo\n";
                        message1 += "3. Ver isbn del libro\n";
                        message1 += "4. Salir...\n\n";

                        System.out.println(message1);

                        System.out.println("Elige tu opcion: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1){
                            case 1:
                                System.out.println("El titulo del libro es: " + book.getTitle());
                                break;
                            case 2:
                                System.out.println("La fecha de edicion del libro es: " + book.getEditionDate());
                                break;
                            case 3:
                                System.out.println("La editorial del libro es: " + book.getEditorial());
                                break;
                            case 4:
                                System.out.println("El isbn del libro es: " + book.getIsbn());
                                break;
                            case 5:
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;

                        }
                    }while(opcion1 !=5);
                    break;
                case 2:
                    int opcion2;

                    do{
                        String message2 = "\n\n actualizar informacion  de Book\n\n";

                        message2 += "1. Actualizar titulo del libro\n";
                        message2 += "2. Actualizar fecha de edicion del libro\n";
                        message2 += "3. Actualizar editorial del libro\n";
                        message2 += "4. Actualizar isbn del libro\n";
                        message2 += "5. Salir...\n\n";

                        System.out.println(message2);

                        System.out.println("Elige tu opcion: ");
                        opcion2 = scanner.nextInt();

                        switch (opcion2){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;

                        }
                    }while(opcion2 !=5);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;

            }

        }while(opcion !=3);

    }

}