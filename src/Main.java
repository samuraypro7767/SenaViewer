
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
            message += "6. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu Menu: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    break;
                case 2:
                    Chapter.menuChapter();
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


        }while(opcion !=6);
    }
}
