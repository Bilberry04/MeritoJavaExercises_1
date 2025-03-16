import java.util.Random;
import java.util.Scanner;

public class Z10 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w grze 'Zgadnij liczbę'!");
        System.out.println("Wybierz poziom trudności:");
        System.out.println("1. Łatwy (1-50)");
        System.out.println("2. Średni (1-100)");
        System.out.println("3. Trudny (1-200)");
        System.out.print("Twój wybór: ");
        int difficulty = scanner.nextInt();

        int minRange = 0;
        int maxRange = 0;
        int maxTries = 0;

        switch (difficulty) {
            case 1:
                minRange = 1;
                maxRange = 50;
                maxTries = 10;
                break;
            case 2:
                minRange = 1;
                maxRange = 100;
                maxTries = 8;
                break;
            case 3:
                minRange = 1;
                maxRange = 200;
                maxTries = 6;
                break;
            default:
                System.out.println("Nieprawidłowy wybór poziomu trudności.");
                return;
        }

        int randomNumber = r.nextInt(maxRange - minRange + 1) + minRange;
        int liczbaProb = 0;
        boolean y = true;

        System.out.println("Zgadnij moją liczbę!");
        System.out.println("Masz " + maxTries + " prób.");

        while (y) {
            if (liczbaProb >= maxTries) {
                System.out.println("Przekroczyłeś limit prób! Gra zakończona.");
                System.out.println("Prawidłowa liczba to: " + randomNumber);
                break;
            }

            System.out.print("Podaj liczbę: ");
            int input = scanner.nextInt();
            liczbaProb++;

            if (input == randomNumber) {
                System.out.println("Zgadłeś liczbę! Liczba to: " + randomNumber);
                System.out.println("Liczba podejść: " + liczbaProb);
                y = false;
            } else if (input < randomNumber) {
                if (randomNumber - input > 20) {
                    System.out.println("Dużo za mało!");
                } else if (randomNumber - input > 10) {
                    System.out.println("Trochę za mało.");
                } else {
                    System.out.println("Za mało.");
                }
            } else {
                if (input - randomNumber > 20) {
                    System.out.println("Dużo za dużo!");
                } else if (input - randomNumber > 10) {
                    System.out.println("Trochę za dużo.");
                } else {
                    System.out.println("Za dużo.");
                }
            }
        }

        scanner.close();
    }
}