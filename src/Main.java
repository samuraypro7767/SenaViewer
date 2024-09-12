import edu.misena.senaviewer.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            imprimirMenu();

            System.out.println("Elige tu Menu: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Estas en Book");
                    Book.menuBook();
                    break;
                case 2:
                    System.out.println("Estas en Chapter");
                    Chapter.menuChapter();
                    break;
                case 3:
                    System.out.println("Estas en Movie");
                    Movie.menuMovie();
                    break;
                case 4:
                    System.out.println("Estas en Serie");
                    Serie.menuSerie();
                    break;
                case 5:
                    System.out.println("Estas en Magazine");
                    Magazine.menuMagazine();
                    break;
                case 6:
                    System.out.println("Estas en Report");
                    // Implementar funcionalidad para Report
                    break;
                case 7:
                    System.out.println("Estas en ReportToday");
                    // Implementar funcionalidad para ReportToday
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

        } while (opcion != 8);

        scanner.close();
    }

    private static void imprimirMenu() {
        String message = "\n\n¡Bienvenido a SenaViewed!\n\n";
        message += "1. Book\n";
        message += "2. Chapter\n";
        message += "3. Movie\n";
        message += "4. Serie\n";
        message += "5. Magazine\n";
        message += "6. Report\n";
        message += "7. ReportToday\n";
        message += "8. Salir...\n";

        System.out.println(message);
    }
}
