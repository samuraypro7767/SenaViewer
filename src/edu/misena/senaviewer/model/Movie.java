package edu.misena.senaviewer.model;

import java.util.Scanner;

public class Movie extends Film {

    static int timeViewed;

    public Movie(String title,String genre,String creator,int duration,short year){
    super(title,genre,creator,duration);
    }

    public static int getTimeViewed() {
        return timeViewed;
    }

    public static Movie getMovie() {
        return movie;
    }

    public static void setTimeViewed(int timeViewed) {
        Movie.timeViewed = timeViewed;
    }

    public static void setMovie(Movie movie) {
        Movie.movie = movie;
    }

    static Movie movie = new Movie("Deadpool", "Accion", " Tim Miller", 108, (short) 2024);

    /* menu*/

    public static void menuMovie(){
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            String message = "\n\n menu de Movie¡\n\n";

            message += "1. Ver informacion\n";
            message += "2. Actualizar informacion\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu OPCION: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    int opcion1;

                    do{
                        String message1 = "\n\n informacion de Movie\n\n";

                        message1 += "1. Ver titulo de la pelicula\n";
                        message1 += "2. Ver genero de la pelicula\n";
                        message1 += "3. Ver autor de la pelicula\n";
                        message1 += "4. Ver duracion de la pelicula\n";
                        message1 += "5. Ver año del capitulo\n";
                        message1 += "6. Salir...\n\n";

                        System.out.println(message1);

                        System.out.println("Elige tu opcion: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1){
                            case 1:
                                System.out.println("El titulo del capitulo es: ");
                                break;
                            case 2:
                                System.out.println("El genero de la pelicula es: " );
                                break;
                            case 3:
                                System.out.println("El autor de la pelicula es: " );
                                break;
                            case 4:
                                System.out.println("La duracion de la pelicula es: " );
                                break;
                            case 5:
                                System.out.println("El año de la pelicula es: " );
                                break;
                            case 6:
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
                        String message2 = "\n\n actualizar informacion  de Movie\n\n";

                        message2 += "1. Actualizar titulo de la pelicula\n";
                        message2 += "2. Actualizar genero de la pelicula\n";
                        message2 += "3. Actualizar autor de la pelicula\n";
                        message2 += "4. Actualizar duracion de la pelicula\n";
                        message2 += "5. Actualizar año de la pelicula\n";
                        message2 += "6. Salir...\n\n";

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