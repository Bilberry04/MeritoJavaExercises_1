import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wita, podaj pierwszą liczbę:");
        int x = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int y = scanner.nextInt();
        System.out.println("Suma twoich liczb wynosi: ");
        int suma = x+y;
        System.out.println(suma);
    }
}
