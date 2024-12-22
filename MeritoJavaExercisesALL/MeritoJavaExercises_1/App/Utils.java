package App;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    int inputIntObject(String message) {
        try {
            System.out.print(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano błędną wartość");
            return inputIntObject(message);
        }
    }
}
