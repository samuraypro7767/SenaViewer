package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Serie extends Film {

    static int timeViewed;
    static int sessionQuantity;

    public Serie(String title, String genre,int duration ){
     super(title, genre, duration);
    }

    public static int getTimeViewed() {
        return timeViewed;
    }

    public static int getSessionQuantity() {
        return sessionQuantity;
    }

    public static Serie getSerie() {
        return serie;
    }

    public static void setTimeViewed(int timeViewed) {
        Serie.timeViewed = timeViewed;
    }

    public static void setSessionQuantity(int sessionQuantity) {
        Serie.sessionQuantity = sessionQuantity;
    }

    public static void setSerie(Serie serie) {
        Serie.serie = serie;
    }

    static Serie serie = new Serie("Avatar: la leyenda de Aang", "Accion", 110);

    @Override
    public String toString() {
        return "Serie{" +
                "timeViewed=" + timeViewed +
                ", sessionQuantity=" + sessionQuantity +
                ", " + super.toString() +
                '}';
    }

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
                                System.out.println("El genero de la Serie es: " + serie.getGenre());
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