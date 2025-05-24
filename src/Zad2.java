//2.	Do programu 1 dopisz opcję, która pozwoli na jednoczesne wypisywanie zawartości oraz zapisywanie jej do pliku.
import java.io.*;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pliki, które chcesz otworzyć (oddzielone spacją np. src/FilesTXT/plik1.txt):");
        String input = scanner.nextLine();
        String[] fileNames = input.split("\\s+");

        System.out.println("Podaj nazwę pliku, do którego zapisać wynik:");
        String outputFile = scanner.nextLine();

        try (PrintWriter writer = new PrintWriter(outputFile)) {
            for (String fileName : fileNames) {
                System.out.println("Zawartość: " + fileName);
                writer.println("Zawartość: " + fileName);

                try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                        writer.println(line);
                    }
                } catch (IOException e) {
                    System.out.println("Błąd przy odczycie " + fileName);
                    e.printStackTrace();
                }

                writer.println();
                System.out.println();
            }

            System.out.println("Zawartość zapisana do pliku: " + outputFile);

        } catch (IOException e) {
            System.out.println("Błąd przy zapisie do pliku: " + outputFile);
            e.printStackTrace();
        }

        scanner.close();
    }
}