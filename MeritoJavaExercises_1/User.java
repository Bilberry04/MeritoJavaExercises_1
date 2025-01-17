public class User {

    private int[] optionUsage; 

    public User() {
        this.optionUsage = new int[5]; 
    }

    public void incrementOptionCount(int option) {
        if (option >= 1 && option <= 5) {
            optionUsage[option - 1]++;
        }
    }

    public void displayStatistics() {
        System.out.println("=== STATYSTYKI UŻYTKOWNIKA ===");
        System.out.println("Opcja [1] Wypisz kwadrat liczb: " + optionUsage[0] + " razy");
        System.out.println("Opcja [2] Oblicz sumę cyfr liczby: " + optionUsage[1] + " razy");
        System.out.println("Opcja [3] Sprawdź, czy liczba jest pierwsza: " + optionUsage[2] + " razy");
        System.out.println("Opcja [4] Oblicz silnię liczby: " + optionUsage[3] + " razy");
        System.out.println("Opcja [5] Wyświetl statystyki: " + optionUsage[4] + " razy");
        System.out.println("==============================");
    }
}
