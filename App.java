import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        User user = new User(); // Instance of the User class to track statistics
        boolean exit = false;

        while (!exit) {
            try {
                Scanner scanner = new Scanner(System.in);

                System.out.println("=== MENU ===");
                System.out.println("[1] Wypisz kwadrat liczb");
                System.out.println("[2] Oblicz sumę cyfr liczby");
                System.out.println("[3] Sprawdź, czy liczba jest pierwsza");
                System.out.println("[4] Oblicz silnię liczby");
                System.out.println("[5] Wyświetl statystyki użytkownika");
                System.out.println("[6] Wyjście");
                System.out.print("Wybierz opcję: ");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        MathOperations.printSquare(scanner);
                        user.incrementOptionCount(1);
                        break;
                    case 2:
                        MathOperations.calculateSumOfDigits(scanner);
                        user.incrementOptionCount(2);
                        break;
                    case 3:
                        MathOperations.checkPrimeNumber(scanner);
                        user.incrementOptionCount(3);
                        break;
                    case 4:
                        MathOperations.calculateFactorial(scanner);
                        user.incrementOptionCount(4);
                        break;
                    case 5:
                        user.displayStatistics();
                        break;
                    case 6:
                        System.out.println("Dziękujemy za skorzystanie z programu. Do zobaczenia!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Proszę podać liczbę całkowitą.");
            }
        }
    }
}
