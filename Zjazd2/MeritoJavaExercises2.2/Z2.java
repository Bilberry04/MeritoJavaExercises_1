public class Z2 {
    public static void main(String[] args) {
        int liczba = 4;
        int silnia = 1;

        for (int i = 1; i <= liczba; i++) {
            silnia *= i;
        }

        System.out.println("Silnia liczby " + liczba + " wynosi: " + silnia);
    }
}