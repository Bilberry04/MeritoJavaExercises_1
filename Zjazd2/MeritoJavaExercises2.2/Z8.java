import java.util.Scanner;

public class Z8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueBuying = true;

        while (continueBuying) {
            System.out.println("Witaj w kasie biletowej.");
            System.out.println("Z jakiego biletu chcesz skorzystać?");
            System.out.println("1. Normalny");
            System.out.println("2. Ulgowy");
            System.out.println("3. Dziecięcy");
            System.out.println("4. Miesięczny");
            System.out.print("Twój wybór: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Wybrałeś bilet normalny.");
                    break;
                case 2:
                    System.out.println("Wybrałeś bilet ulgowy.");
                    break;
                case 3:
                    System.out.println("Wybrałeś bilet dziecięcy.");
                    break;
                case 4:
                    System.out.println("Wybrałeś bilet miesięczny.");
                    break;
                default:
                    System.out.println("Chyba zaszła jakaś pomyłka");
                    break;
            }

            System.out.println("Czy chcesz wybrać kolejny bilet? (tak/nie)");
            input.nextLine();
            String response = input.nextLine();
            if (!response.equalsIgnoreCase("tak")) {
                continueBuying = false;
            }
        }

        System.out.println("Dziękujemy za skorzystanie z naszej aplikacji.");
        input.close();
    }
}