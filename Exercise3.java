import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Kalkulator ratalny");

        double price = inputDouble("Podaj kwotę: ");
        int rate = inputInt("Podaj liczbę rat: ");

        printSeparator();

        if (isParameterInvalid(price, rate)) {
            showError();
        } else {
            calculateAndShowResult(price, rate);
        }
    }

    private static boolean isParameterInvalid(double price, int rate) {
        return price < 100 || price > 10_000 || rate < 6 || rate > 48;
    }

    private static void calculateAndShowResult(double price, int rate) {
        double interest = price * getMultiplier(rate);
        double total = price + interest;
        double rateValue = total / rate;

        System.out.printf("Odsetki: %.2f zł%n", interest);
        System.out.printf("Łączny koszt: %.2f zł%n", total);
        System.out.printf("Wysokość raty: %.2f zł%n", rateValue);
    }

    private static double getMultiplier(int rate) {
        if (rate <= 12) {
            return 0.025;
        } else if (rate <= 24) {
            return 0.05;
        } else {
            return 0.1;
        }
    }

    private static void printSeparator() {
        System.out.println("-----------------------");
    }

    private static void showError() {
        System.out.println("Podano błędną wartość !!!");
        System.out.println("Kwota powinna znajdować się w przedziale od 100 zł do 10 000 zł");
        System.out.println("Rata powinna znajdować się w przedziale od 6 do 48");
    }

    private static double inputDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(message);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowe dane wejściowe. Proszę podać liczbę.");
                scanner.next(); 
            }
        }
    }

    private static int inputInt(String message) {
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
