import java.util.Scanner;
public class Zadanie7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Witaj, podaj liczbe calkowita dodatnia:");
        int number = input.nextInt();

        if(number < 0){
            System.out.println("Podana liczba jest mniejsza od zera");
        }
        else
        {
            for(int i=1; i<=number; i+=2){
                System.out.print(i+", ");
            }
        }
    }
}
