import java.util.InputMismatchException;
import java.util.Scanner;

class Utils {
    static int inputIntStatic(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowe dane wejściowe. Proszę podać liczbę całkowitą.");
                scanner.next(); // Wyczyść błędne dane wejściowe
            }
        }
    }

    int inputIntObject(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowe dane wejściowe. Proszę podać liczbę całkowitą.");
                scanner.next(); 
            }
        }
    }
}
