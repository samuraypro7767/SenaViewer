
import edu.misena.senaviewer.model.Chapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do{
            String message = "\n\n!Bienvenido a SenaViewed¡\n\n";

            message += "1. Book\n";
            message += "2. Chapter\n";
            message += "3. Movie\n";
            message += "4. Serie\n";
            message += "5. Magazine\n";
            message += "6. Report\n";
            message += "7. ReportToday\n";
            message += "8. Salir...\n";

            System.out.println(message);

            System.out.println("Elige tu Menu: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1: System.out.println("estas en Book");
                    break;
                case 2:
                    System.out.println("estas en Chapter");
                    Chapter.menuChapter();
                    break;
                case 3:
                    System.out.println("estas en Movie");
                    break;
                case 4:
                    System.out.println("estas en Serie");
                    break;
                case 5:
                    System.out.println("estas en Magazine");
                    break;
                case 6:
                    System.out.println("estas en Report");
                    break;
                case 7:
                    System.out.println("estas en ReportToday");
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;

            }


        }while(opcion !=8);
    }
}
