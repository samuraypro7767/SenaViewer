package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Chapter {
    static int id;
    static String title;

    int duration;
    short year;
    boolean viewed;

    int timeViewed;
    int sessionNumber;

    public Chapter (String title,int duration,short year){
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    static Chapter chapter = new Chapter("El cahvo del 8", 20, (short) 2005);

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public static String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public short getYear(){
        return year;
    }

    public void setYear(short year){
        this.year = year;
    }

    public boolean getViewed (){
        return viewed;
    }

    public void setViewed(boolean viewed){
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

    public static void menuChapter(){
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            String message = "\n\n!Bienvenido al menu de Chapter¡\n\n";

            message += "1. Ver informacion\n";
            message += "2. Actualizar informacion\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu Menu: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    int opcion1;

                    do{
                        String message1 = "\n\n!Bienvenido a la vista de Chapter¡\n\n";

                        message1 += "1. Ver titulo del capitulo\n";
                        message1 += "2. Ver duracuion del capitulo\n";
                        message1 += "3. Ver año del capitulo\n";
                        message1 += "4. Salir...\n\n";

                        System.out.println(message1);

                        System.out.println("Elige tu opcion: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1){
                            case 1:
                                System.out.println("El titulo del capitulo es: " + chapter.getTitle());
                                break;
                            case 2:
                                System.out.println("La duracion del capitulo es: " + chapter.getDuration());
                                break;
                            case 3:
                                System.out.println("El año del capitulo es: " + chapter.getYear());
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
                        String message2 = "\n\n!Bienvenido al Setter de Chapter¡\n\n";

                        message2 += "1. id\n";
                        message2 += "2. title\n";
                        message2 += "3. duration\n";
                        message2 += "4. year\n";
                        message2 += "5. viewed\n";
                        message2 += "6. timeViewed\n";
                        message2 += "7. sessionNumber\n";
                        message2 += "8. Salir...\n\n";

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
                    }while(opcion2 !=6);
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