package edu.misena.senaviewer.model;
import java.util.Scanner;
public class Book {



    public class book {

        static int id;
        static String title;

        static String edititionDate;
        static String editorial;
        static String[] authors ;
        static int isbn;
        static boolean readed;
        static int timeReaded;

        public book(String title,
                    String edititionDate,
                    String editorial,
                    int isbn ) {

            this.title = title;
            this.edititionDate = edititionDate;
            this.editorial = editorial;
            this.isbn = isbn;

        }

        //  getter  método de acceso
        public static int getId() {
            return  id;
        }

        //   setter método de modificación
        public void setId(int id) {
            this.id = id;
        }


        public static String getTitle() {
            return  title;
        }
        public  void setTitle(String title) {
            this.title = title;
        }


        public static String getEdititionDate() {
            return  edititionDate;
        }
        public  void setEdititionDate(String edititionDate) {
            this.edititionDate = edititionDate;
        }


        public static String getEditorial() {
            return  editorial;
        }
        public  void setEditorial(String editorial) {
            this.editorial = editorial;
        }


        public static String[] getAuthors() {
            return  authors;
        }

        public void setAuthors(String[] authors) {
            if (authors == null) {
                this.authors = new String[0];
            } else {
                this.authors = authors;
            }
        }


        public static int getIsbn() {
            return  isbn;
        }
        public  void setIsbn(int isbn) {
            this.isbn = isbn;
        }


        public static boolean getReaded() {
            return readed;
        }
        public void setReaded(boolean readed) {
            this.readed = readed;
        }


        public static int getTimeReaded() {
            return timeReaded;
        }
        public void setTimeReaded(int timeReaded) {
            this.timeReaded = timeReaded;
        }

    }




    /*Menus*/
    public static void menuBook() {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            String message = "\n\n!Menu de Book¡\n\n";

            message += "1. Ver informacion\n";
            message += "2. Actualizar informacion\n";
            message += "3. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int opcion1;

                    do {
                        String message1 = "\n\n ¿Que vas a consultar de Book?\n\n";

                        message1 += "1. Ver titulo del Libro\n";
                        message1 += "2. Ver fecha de edicion del libro\n";
                        message1 += "3. Ver editorial del libro\n";
                        message1 += "4. Ver isbn del libro\n";
                        message1 += "5. Salir...\n\n";

                        System.out.println(message1);

                        System.out.println("Elige tu opcion: ");
                        opcion1 = scanner.nextInt();

                        switch (opcion1) {
                            case 1:
                                System.out.println("El titulo del capitulo es: " + book.getTitle());
                                break;
                            case 2:
                                System.out.println("La fecha de edicion del libro  es: " + book.getEdititionDate());
                                break;
                            case 3:
                                System.out.println("El año del capitulo es: " + book.getEditorial());
                                break;
                            case 4:
                                System.out.println("El ISBN del libro es:" + book.getIsbn());
                                break;
                            case 5:
                                System.out.println("Saliendo del programa...");
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;

                        }
                    } while (opcion1 != 5);
                    break;
                case 2:
                    int opcion2;

                    do {
                        String message2 = "\n\n Actualizaciones de Chapter\n\n";

                        message2 += "1. Actualizar id\n";
                        message2 += "2. Actualizar title\n";
                        message2 += "3. Actualizar edititionDate\n";
                        message2 += "4. Actualizar editorial\n";
                        message2 += "5. Actualizar authors\n";
                        message2 += "6. Actualizar isbn\n";
                        message2 += "7. Actualizar readed\n";
                        message2 += "8. Actualizar timeReaded\n";
                        message2 += "9. Salir...\n\n";

                        System.out.println(message2);

                        System.out.println("Elige tu opcion: ");
                        opcion2 = scanner.nextInt();

                        switch (opcion2) {
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
                    } while (opcion2 != 9);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;

            }


        } while (opcion != 3);

    }
}

