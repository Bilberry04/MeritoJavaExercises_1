//5.	Napisz program, który przyjmie dowolną liczbę plików do rozpakowania.

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Zad5 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Podaj pliki ZIP jako argumenty.");
            return;
        }

        for (String zipPath : args) {
            unPackZIP(zipPath, "rozpakowane/");
        }
    }

    private static void unPackZIP(String path, String destinationFolder) {
        byte[] buffer = new byte[1024];

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(path))) {

            ZipEntry zipEntry = zipInputStream.getNextEntry();
            while (zipEntry != null) {
                String fileName = zipEntry.getName();
                File newFile = new File(destinationFolder + fileName);


                if (!zipEntry.isDirectory()) {
                    try (FileOutputStream fos = new FileOutputStream(newFile)) {
                        int length;
                        while ((length = zipInputStream.read(buffer)) > 0) {
                            fos.write(buffer, 0, length);
                        }
                    }
                }

                zipInputStream.closeEntry();
                zipEntry = zipInputStream.getNextEntry();
            }

            System.out.println("Rozpakowano: " + path);

        } catch (IOException e) {
            System.out.println("Błąd przy rozpakowywaniu: " + path);
            e.printStackTrace();
        }
    }
}