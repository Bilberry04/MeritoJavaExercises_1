import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Prosty kalkulator");
        System.out.println("-----------------");

        int a = Utils.inputIntStatic("Podaj pierwszą liczbę: ");
        String sign = inputString("Podaj znak operacji (+, -, *, /): ");
        int b = Utils.inputIntStatic("Podaj drugą liczbę: ");

        System.out.println("-----------------");

        switch (sign) {
            case "+":
                System.out.println("a + b = " + (a + b));
                break;
            case "-":
                System.out.println("a - b = " + (a - b));
                break;
            case "*":
                System.out.println("a * b = " + (a * b));
                break;
            case "/":
                if (b==0){
                    System.out.println("b is zero");
                } else {
                    System.out.println("a / b = " + (a / b));
                }
                break;
            default:
                System.out.println("Podano błędną operację");
        }

    }

    static String inputString(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
