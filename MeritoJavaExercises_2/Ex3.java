import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wita, podaj swoje imię:");
        String name = scanner.next();
        System.out.println("Podaj swoje nazwisko:");
        String surname = scanner.next();
        System.out.println("Nazywasz się:");
        String namePlusSurname = name + " " + surname;
        System.out.println(namePlusSurname);
    }
}
