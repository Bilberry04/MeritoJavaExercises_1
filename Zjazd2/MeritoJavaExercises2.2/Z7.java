//Instrukcja SWITCH w Javie jest możliwa na typie String, który nie jest dostępny w C++
//Inne typy, których nie obsługuje również c++ to: Integer, Short, Byte, Character
//Działa w JAVA: byte, short, char, int, enum, String, Integer, Byte, Short, Character.
//Działa w C++: int, char, enum, short, unsigned int, long.
//Poniżej przykład użycia instrukcji switch w Javie na typie String
public class Z7 {
    public static void main(String[] args) {
        String kolor = "czerwony";

        switch (kolor) {
            case "czerwony":
                System.out.println("Wybrałeś kolor czerwony.");
                break;
            case "zielony":
                System.out.println("Wybrałeś kolor zielony.");
                break;
            case "niebieski":
                System.out.println("Wybrałeś kolor niebieski.");
                break;
            default:
                System.out.println("Nieznany kolor.");
        }
    }
}