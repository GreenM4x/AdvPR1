package de.gds2.ab3if;

import java.util.Scanner;

public class Berechnung {

    public static int schraubePreis = 5;
    public static int mutterPreis = 3;
    public static int scheibePreis = 1;

    public static void main(String[] args) {

        int schraubeAnzahl = 0;
        int mutterAnzahl = 0;
        int scheibeAnzahl = 0;

        int finalBetrag = 0;

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Gabe Schrauben Anzahl ein: ");
        schraubeAnzahl = inputScanner.nextInt();
        System.out.print("Gebe Mutter Anzahl ein: ");
        mutterAnzahl = inputScanner.nextInt();
        System.out.print("Gebe scheiben Anzahl ein: ");
        scheibeAnzahl = inputScanner.nextInt();

        if (mutterAnzahl > schraubeAnzahl && scheibeAnzahl > schraubeAnzahl){
            System.out.println("Die Bestellunf ist Okay");
        } else {
            System.out.println("Kontrollieren sie ihre Bestellung" );
        }

        finalBetrag = mutterAnzahl * mutterPreis + mutterAnzahl * mutterPreis + scheibeAnzahl * scheibePreis;
        System.out.print("Final betrag beträgt: " + finalBetrag);
    }
}
