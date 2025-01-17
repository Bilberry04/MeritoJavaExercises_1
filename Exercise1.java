import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
       
        final double MULTIPLIER = 1.8;
        final double OFFSET = 32;

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
           
            if (scanner.hasNextDouble()) {
                double celsius = scanner.nextDouble();

                double fahrenheit = (celsius * MULTIPLIER) + OFFSET;

                System.out.printf("%.2f stopni Celsjusza to %.2f stopni Fahrenheita.%n", celsius, fahrenheit);
            } else {
                System.out.println("Nieprawidłowy format liczby. Proszę podać liczbę.");
            }
        } finally {
           
            scanner.close();
        }
    }
}
