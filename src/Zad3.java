import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pliki które chcesz otworzyć: (np. src/FilesTXT/plik1.txt src/FilesTXT/plik2.txt src/FilesTXT/plik3.txt)");
        String nameFile = scanner.nextLine();
        String[] fileNames = nameFile.split("\\s+");

        try {
            Path path = Paths.get(fileNames[0]);

            List<String> lines = Files.readAllLines(path);
            lines.forEach(System.out::println);

            System.out.println("Podaj nowa linie do zapisu '" + nameFile + "':");
            String input = scanner.nextLine();
            String newLine = input;
            Files.write(path, newLine.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
