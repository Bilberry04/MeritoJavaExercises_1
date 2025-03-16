public class Z2_2 {
    public static void main(String[] args) {
        int liczba = 4;
        int wynik = obliczSilnie(liczba);
        System.out.println("Silnia liczby " + liczba + " wynosi: " + wynik);
    }

    public static int obliczSilnie(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * obliczSilnie(n - 1);
    }
}