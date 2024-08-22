package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Chapter {
    int id;
    String title;

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

            message += "1. Getter\n";
            message += "2. Setter\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu Menu: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    int opcion1;

                    do{
                        String message1 = "\n\n!Bienvenido al Getter de Chapter¡\n\n";

                        message1 += "1. id\n";
                        message1 += "2. title\n";
                        message1 += "3. duration\n";
                        message1 += "4. year\n";
                        message1 += "5. viewed\n";
                        message1 += "6. timeViewed\n";
                        message1 += "7. sessionNumber\n";
                        message1 += "8. Salir...\n\n";

                        System.out.println(message1);

                        System.out.println("Elige tu opcion: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;

                        }
                    }while(opcion1 !=6);
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
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
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

