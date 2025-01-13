public class Exercise7 {
    public static void main(String[] args) {
        int number = Utils.inputIntStatic("Podaj liczbę: ");

        if (number < 0) {
            System.out.println("Podana liczba jest liczbą ujemną");
        } else {
            for (int i = 0; i <= number; i++) {
                if (i % 2 != 0) {
                    if (i < number) {
                        System.out.print(i + ", ");
                    } else {
                        System.out.print(i + ".");
                    }
                }
            }
        }
    }
}
