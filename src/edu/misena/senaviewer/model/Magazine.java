package edu.misena.senaviewer.model;

import java.util.Date;
import java.util.Scanner;

public class Magazine {

    int id;
    String title;
    String editionDate;
    String editorial;
    String[] authors;

    public Magazine(String title,String edititionDate,String editorial){
        this.title = title;
        this.editionDate = edititionDate;
        this.editorial = editorial;
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

    public String getEditionDate() {
        return editionDate;
    }

    public void setEditionDate(String editionDate) {
        this.editionDate = editionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }


    static Magazine magazine = new Magazine("Innovations Today", "2024-08-15", "Anna Lee");

    /* menus */

    public static void menuMagazine(){
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            String message = "\n\n menu de Magazine\n\n";

            message += "1. Ver informacion\n";
            message += "2. Actualizar informacion\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu opcion: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    int opcion1;

                    do{
                        String message1 = "\n\n ver informacion de Magazine\n\n";

                        message1 += "1. Ver titulo del Magazine\n";
                        message1 += "2. Ver duracuion del Magazine\n";
                        message1 += "3. Ver año del Serie\n";
                        message1 += "4. Salir...\n\n";

                        System.out.println(message1);

                        System.out.println("Elige tu opcion: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1){
                            case 1:
                                System.out.println("El titulo de la revista es: " + magazine.getTitle());
                                break;
                            case 2:
                                System.out.println("La fecha de la revista es: " + magazine.getEditionDate());
                                break;
                            case 3:
                                System.out.println("La editorial de la revista es: " + magazine.getEditorial());
                                break;
                            case 4:
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;

                        }
                    }while(opcion1 !=4);
                    break;
                case 2:
                    int opcion2;

                    do{
                        String message2 = "\n\nactualizar informacion  de Magazine\n\n";

                        message2 += "1. Actualizar titulo de la revista\n";
                        message2 += "2. Actualizar fecha de la revista\n";
                        message2 += "3. Actualizar editorial de la revista \n";
                        message2 += "4. Salir...\n\n";

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
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;

                        }
                    }while(opcion2 !=4);
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