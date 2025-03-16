import java.util.Scanner;

public class Z1 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę: ");
        Scanner inputScanner = new Scanner(System.in);
        int liczba = inputScanner.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Twoja liczba jest parzysta");
        } else {
            System.out.println("Twoja liczba jest nieparzysta");
        }

        inputScanner.close();
    }
}
