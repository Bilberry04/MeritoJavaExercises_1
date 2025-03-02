//5.	Napisz program losuje liczbę z pewnego zakresu (np. 1–100) za pomocą Random.
// Następnie w pętli prosi użytkownika (przy użyciu Scanner) o zgadywanie liczby,
// podając wskazówki "za dużo" lub "za mało", aż użytkownik trafi. Po odgadnięciu,
// program wyświetla komunikat gratulacyjny wraz z liczbą prób.
// (Wskazówka: będziesz potrzebować pętli while lub do-while oraz porównań if-else do sprawdzania odpowiedzi.) (2 punkty)

import java.util.Random;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Random r = new Random();
        int randomNumber = r.nextInt(100) + 1;
        System.out.println("Zgadnij moją liczbę!");
        boolean y = true;
        Scanner scanner = new Scanner(System.in);
        while(y){
            int input = scanner.nextInt();
            if(input == randomNumber)
            {
                System.out.println("Zgadłeś liczbę! Liczba to: " + randomNumber);
                y = false;
                break;
            }
            else if(input < randomNumber) {
                System.out.println("Za mało");
            } else {
                System.out.println("Za dużo");
            }
        }
    }
}
