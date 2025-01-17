import java.util.Scanner;

public class MathOperations {

    public static void printSquare(Scanner scanner) {
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();
        if (number < 1) {
            System.out.println("Podana liczba powinna być większa od 0.");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (j == number) {
                        System.out.print(j);
                    } else {
                        System.out.print(j + ", ");
                    }
                }
                System.out.println();
            }
        }
    }

    
    public static void calculateSumOfDigits(Scanner scanner) {
        System.out.print("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Suma cyfr liczby " + number + " wynosi: " + sum);
    }

 
    public static void checkPrimeNumber(Scanner scanner) {
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " nie jest liczbą pierwszą.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " jest liczbą pierwszą.");
            } else {
                System.out.println(number + " nie jest liczbą pierwszą.");
            }
        }
    }

    
    public static void calculateFactorial(Scanner scanner) {
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Silnia jest zdefiniowana tylko dla liczb >= 0.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Silnia liczby " + number + " wynosi: " + factorial);
        }
    }
}
