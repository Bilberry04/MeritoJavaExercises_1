import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int a = inputInt("Podaj pierwszą liczbę: ");
        int b = inputInt("Podaj drugą liczbę: ");
        int c = inputInt("Podaj trzecią liczbę: ");

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        System.out.println("Największa liczba to: " + max);
        System.out.println("Najmniejsza liczba to: " + min);
    }

    private static int inputInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowe dane wejściowe. Proszę podać liczbę całkowitą.");
                scanner.next(); 
            }
        }
    }
}
