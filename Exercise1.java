import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final double MULTIPLIER = 1.8;
        final double OFFSET = 32;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj temperaturę w stopniach Celsjusza: ");
        double celsius = scanner.nextDouble();
        scanner.close();

        double fahrenheit = (celsius * MULTIPLIER) + OFFSET;

        System.out.println(celsius + " stopni Celsjusza to " + fahrenheit + " stopni Fahrenheita.");
    }
}
