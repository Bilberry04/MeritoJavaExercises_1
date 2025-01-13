import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartość dochodu: ");
        double income = scanner.nextDouble();
        scanner.close();

        double tax = 0;

        if (income <= 85_528) {
            tax = (income * 0.18 - 556.02);
        } else {
            tax = ((income - 85_528) * 0.32 + 14_839.02);
        }

        System.out.println("Należny podatek wynosi: " + (tax < 0 ? 0 : tax) + "zł");
    }
}
