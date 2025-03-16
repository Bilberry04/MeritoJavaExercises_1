public class App {
    public static void main(String[] args) {
        int num = 5; // zmienna typu podstawowego

        System.out.println("Wartość zmiennej: " + num); // Wypisuje 5
        changeValue(num); // Wywołuje funkcję, która zmienia kopię zmiennej num
        System.out.println("Wartość zmiennej po funkcji: " + num); // Wartość num nie zmienia się, bo przekazywana jest
                                                                   // kopia zmiennej (Wypisuje 5)

        IntegerWrapper number = new IntegerWrapper(5); // Tworzy obiekt klasy IntegerWrapper z wartością 5
        System.out.println("Wartość przed funkcją: " + number.getValue()); // Wypisuje wartość przed wywołaniem funkcji
                                                                           // (5)
        changeValue(number); // Zmienia wartość wewnętrzną obiektu na 10
        System.out.println("Wartość po funkcji: " + number.getValue()); // Wypisuje zmienioną wartość (10)
        change(number); // Próbuje przypisać nowy obiekt do zmiennej 'number', ale to nie zmienia
                        // oryginalnego obiektu
        System.out.println("Wartość po funkcji: " + number.getValue()); // Wartość nadal wynosi 10, ponieważ zmiana w
                                                                        // funkcji 'change' dotyczy lokalnej kopii
                                                                        // referencji
    }

    // Funkcja, która zmienia kopię zmiennej num (int)
    public static void changeValue(int num) {
        num = 10; // Modyfikuje kopię zmiennej num w funkcji
        System.out.println("Wartość zmiennej wewnątrz funkcji: " + num); // Wypisuje 10, ale to zmienia tylko kopię
                                                                         // zmiennej
    }

    // Funkcja zmieniająca wartość wewnętrzną obiektu
    public static void changeValue(IntegerWrapper num) {
        num.setValue(10); // Zmienia wartość wewnętrzną obiektu na 10, ponieważ przekazywana jest
                          // referencja
    }

    // Funkcja próbująca przypisać nowy obiekt do zmiennej num
    public static void change(IntegerWrapper num) {
        num = new IntegerWrapper(26); // Tworzy nowy obiekt i przypisuje go do lokalnej zmiennej num, ale nie zmienia
                                      // oryginalnego obiektu
    }
}

// Klasa opakowująca liczbę całkowitą
class IntegerWrapper {
    private int value;

    public IntegerWrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value; // Zwraca wartość wewnętrzną obiektu
    }

    public void setValue(int value) {
        this.value = value; // Ustawia nową wartość wewnętrzną obiektu
    }
}