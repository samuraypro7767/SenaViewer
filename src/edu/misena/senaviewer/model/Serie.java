package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Serie {

    static int id;
    static String title;

    static String gender;
    static String creator;
    static int duration;
    static short year;

    static boolean viewed;
    static int timeViewed;
    static int sessionQuantity;

    public Serie( String title,String gender,int duration){
        this.title = title;
        this.gender = gender;
        this.duration = duration;
    }


    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public static int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public static boolean getViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public static int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public static int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    static Serie serie = new Serie("Avatar: la leyenda de Aang", "Accion", 110);

    /* menu */
    public static void menuSerie(){
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            String message = "\n\n menu de Serie\n\n";

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
                        String message1 = "\n\n informacion de Serie¡\n\n";

                        message1 += "1. Ver titulo del Serie\n";
                        message1 += "2. Ver duracuion del Serie\n";
                        message1 += "3. Ver año del Serie\n";
                        message1 += "4. Salir...\n\n";

                        System.out.println(message1);

                        System.out.println("Elige tu opcion: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1){
                            case 1:
                                System.out.println("El titulo de la Serie es: " + serie.getTitle());
                                break;
                            case 2:
                                System.out.println("El genero de la Serie es: " + serie.getGender());
                                break;
                            case 3:
                                System.out.println("La duracion de la Serie es: " + serie.getDuration());
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
                        String message2 = "\n\n actualizar informacion  de Serie¡\n\n";

                        message2 += "1. Actualizar titulo de la Serie\n";
                        message2 += "2. Actualizar  genero de la Serie\n";
                        message2 += "3. Actualizar La duracion de la Serie\n";
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