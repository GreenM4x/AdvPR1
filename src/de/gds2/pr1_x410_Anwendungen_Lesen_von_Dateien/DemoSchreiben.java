package de.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;

public class DemoSchreiben {
    static String path = "src/de/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/leereDaten.txt";
    public static void main(String[] args) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        BufferedWriter writer = null;
        DecimalFormat df = new DecimalFormat("#.00");

        try {
            writer = Files.newBufferedWriter(Path.of(path), charset, StandardOpenOption.WRITE);
            writer.write("Zahl\tQuadratzahl\tWurzel \n");
            for (int i = 0; i <= 25; i++) {
                writer.write("*");

            }
            writer.newLine();
            for (int i = 0; i <= 10; i++) {
                writer.write(i + "\t" + ((int) Math.pow(i,2)) + "\t" + df.format(Math.sqrt(i)));
                writer.newLine();
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

}
