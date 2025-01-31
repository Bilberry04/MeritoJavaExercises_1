import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();
        scanner.close();

        if (firstNumber < secondNumber) {
            int forResult = 0;

            for (int i = firstNumber; i <= secondNumber; i++) {
                forResult += i;
            }

            System.out.println(forResult);

            System.out.println("------------------------");

            int whileIndex = firstNumber;
            int whileResult = 0;

            while (whileIndex <= secondNumber) {
                whileResult += whileIndex;
                whileIndex++;
            }

            System.out.println(whileResult);

            System.out.println("------------------------");

            int doIndex = firstNumber;
            int doResult = 0;

            do {
                doResult += doIndex;
                doIndex++;
            } while (doIndex <= secondNumber);

            System.out.println(doResult);
        } else {
            System.out.println("Pierwsza liczba powinna być mniejsza od drugiej");
        }
    }
}
