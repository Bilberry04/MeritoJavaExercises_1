// 4. Napisz program, który przyjmie dowolną liczbę plików jako parametry i spakuje je.
// java Zad4 FilesTXT/plik1.txt

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zad4 {

public static void main(String[] args) {
    ZIPpack(args);
}

    private static void ZIPpack(String[] paths) {
        try(ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream("archiwum.zip"))) {
            for (String path : paths) {
                File file = new File(path);

                if (!file.exists() || file.isDirectory()) {
                    System.out.println("Plik nie istnieje lub jest folderem: " + path);
                    continue;
                }

                try (FileInputStream fis = new FileInputStream(file)) {
                    ZipEntry zipEntry = new ZipEntry(file.getName());
                    zipOut.putNextEntry(zipEntry);

                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = fis.read(buffer)) >= 0) {
                        zipOut.write(buffer, 0, length);
                    }
                }
            }

            System.out.println("Pliki spakowane do archiwum.zip");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
