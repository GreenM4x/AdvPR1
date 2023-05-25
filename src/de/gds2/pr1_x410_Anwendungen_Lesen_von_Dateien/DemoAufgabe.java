package de.gds2.pr1_x410_Anwendungen_Lesen_von_Dateien;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class DemoAufgabe {
    static String filename = "src/de/gds2/pr1_x410_Anwendungen_Lesen_von_Dateien/daten.txt";
    public static void main(String[] args) {
        BufferedReader reader = null;
        String[] datenArray = null;
        String trennzeichen = "\t";
        String line="", ersteZeile="", zweiteZeile="";
        double zahl = 0.0, quadratZahl = 0.0, wurzelZahl = 0.0;
        double ergebnisZahl = 0.0,ergebnisQuadrat = 0.0, ergebnisWurzel = 0.0;


        try {
            reader = Files.newBufferedReader(Path.of(filename));
            ersteZeile = reader.readLine();
            System.out.println(ersteZeile);
            zweiteZeile = reader.readLine();
            System.out.println(zweiteZeile);

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                datenArray = line.split(trennzeichen);
                zahl = Double.parseDouble(datenArray[0]);
                quadratZahl = Double.parseDouble(datenArray[1]);
                wurzelZahl = Double.parseDouble(datenArray[2]);

                ergebnisZahl += zahl;
                ergebnisQuadrat += quadratZahl;
                ergebnisWurzel += wurzelZahl;




            }


        } catch (Exception e) {

        }

    }
}
