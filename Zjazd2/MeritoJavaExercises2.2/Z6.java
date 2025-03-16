public class Z6 {
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double wynik = mediana(values);
        System.out.println("Mediana: " + wynik);
        double sum = sumTab(values);
        System.out.println("Suma liczb: " + sum);
    }

    public static double mediana(int[] values) {
        int length = values.length;

        if (length % 2 == 0) {
            return (values[length / 2 - 1] + values[length / 2]) / 2.0; // Średnia dwóch środkowych wartości
        } else {
            return values[length / 2];
        }
    }

    public static double sumTab(int[] values) {
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum;
    }
}