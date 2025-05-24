//1.	Napisz program, który w linii poleceń przyjmie dowolną liczbę nazw plików i wypisze zawartość każdego z nich.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pliki które chcesz otworzyć: (np. src/FilesTXT/plik1.txt src/FilesTXT/plik2.txt src/FilesTXT/plik3.txt)");
        String input = scanner.nextLine();

        String[] fileNames = input.split("\\s+");

        for (String fileName : fileNames) {
            System.out.println("Zawartość: " + fileName);
            readFile(fileName);
            System.out.println();
        }

        scanner.close();
    }

            public static void readFile (String path){

        try {
            Path filePath = Paths.get(path);
            List<String> lines = Files.readAllLines(filePath);
            lines.forEach(System.out::println);

        } catch(IOException e) {
            System.out.println("Błąd dla odczytu: " + path);
            e.printStackTrace();
        }
    }
}











