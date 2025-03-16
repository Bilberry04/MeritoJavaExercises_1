public class Z4 {
    public static void main(String[] args) {
        int a = 50;
        int b = 25;

        if (a < b) {
            if (a % 2 == 1) {
                for (int i = a; i <= b; i += 2) {
                    System.out.print(i + ",");
                }
            } else {
                for (int i = a + 1; i <= b; i += 2) {
                    System.out.print(i + ",");
                }
            }
        } else if (a == b) {
            System.out.print("Liczby są równe");
        } else {
            if (a % 2 == 1) {
                for (int i = a; i >= b; i -= 2) {
                    System.out.print(i + ",");
                }
            } else {
                for (int i = a - 1; i >= b; i -= 2) {
                    System.out.print(i + ",");
                }
            }
        }
    }
}