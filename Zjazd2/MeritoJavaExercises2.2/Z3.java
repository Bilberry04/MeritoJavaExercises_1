import java.util.Random;

public class Z3 {
    public static void main(String[] args) {
        int place = 25;
        System.out.println("fib(" + place + ") = " + fib(place));
        System.out.println("Losowa liczba i jej wartość fibonaciego: " + fib());
    }

    public static int fib(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("miejsce w ciągu fibonaciego musi być większa niż 0.");
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib() {
        Random random = new Random();
        int losowaLiczba = random.nextInt(10) + 1;
        System.out.println("Wylosowane miejsce w ciągu fibonaciego: " + losowaLiczba);
        return fib(losowaLiczba);
    }
}