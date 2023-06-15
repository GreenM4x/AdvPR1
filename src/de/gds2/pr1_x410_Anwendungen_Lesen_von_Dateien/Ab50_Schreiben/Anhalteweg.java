package de.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien.Ab50_Schreiben;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;

public class Anhalteweg {
    static String path = "src/de/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/Ab50_Schreiben/bremsweg.txt";
    public static void main(String[] args) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        BufferedWriter writer = null;
        DecimalFormat df = new DecimalFormat("#.00");

        try {
            writer = Files.newBufferedWriter(Path.of(path), charset, StandardOpenOption.CREATE);
            writer.write("Geschwindigkeit [km/h]\tc.a Anhalteweg [m] \n");
            for (int i = 0; i <= 25; i++) {
                writer.write("-");

            }
            writer.newLine();
            for (double i = 10; i <= 100; i += 10) {
                writer.write(bremscalc(i));
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

    public static String bremscalc(double geschwindigkeit) {
        String result = "";

        int normbremsweg = 0;
        int reaktionsweg = 0;
        int bremsweg = 0;

            normbremsweg = (int) Math.pow((geschwindigkeit / 10),2);
            reaktionsweg = (int)(geschwindigkeit / 10) * 3;
            bremsweg = normbremsweg + reaktionsweg;

            result = result.concat((int) geschwindigkeit + "\t" + bremsweg);


        return result;
    }
}
