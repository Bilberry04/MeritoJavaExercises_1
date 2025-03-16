import java.util.Scanner;

public class Z5 {
    public static void main(String[] args) {
        System.out.println("Witaj w kalkulatorze, jaką operację chcesz wykonać?");
        System.out.println("[1] +");
        System.out.println("[2] -");
        System.out.println("[3] *");
        System.out.println("[4] /");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        System.out.println("Podaj liczbę pierwszą: ");
        int a = input.nextInt();
        System.out.println("Podaj liczbę drugą: ");
        int b = input.nextInt();
        int score = 0;

        switch (choice) {
            case 1:
                score = a + b;
                break;

            case 2:
                score = a - b;
                break;

            case 3:
                score = a * b;
                break;

            case 4:
                score = a / b;
                break;

            default:
                System.out.println("Coś poszło nie tak");
                break;
        }
        System.out.println("Wynik to: " + score);
        input.close();
    }
}