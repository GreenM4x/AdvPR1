package de.gds2.oo1.ab1;

import java.util.Scanner;

public class ZahlenEingabe {
    public static void main(String[] args) {
        int zahlen;
        boolean abfrage = false, isCorrekt = false;
        int summe = 0;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Eingabeauffoderung <ja> oder <nein>?");

        do {
            String eingabe = inputScanner.nextLine();

            if (eingabe.equals("ja") || eingabe.equals("nein")){
                if (eingabe.equals("ja")) abfrage = true;
                isCorrekt = true;
            } else {
                System.out.println("Eingabe ist Falsch");
            }
        } while (!isCorrekt);


        for (int i = 0; i < 5; i++) {

             if (abfrage) System.out.print("Geben sie " + (i + 1) + ". Zahl ein: ");
             zahlen = inputScanner.nextInt();
             summe += zahlen;
        }

        System.out.println("Gesamtsumme: " + summe);

        inputScanner.close();
    }

}
