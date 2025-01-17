import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int number = inputInt("Podaj liczbę: ");

        if (number < 0) {
            System.out.println("Podana liczba jest liczbą ujemną");
        } else {
            System.out.print("Liczby nieparzyste: ");
            for (int i = 1; i <= number; i += 2) {
                if (i < number - 1) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println(".");
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
