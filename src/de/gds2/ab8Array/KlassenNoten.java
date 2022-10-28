package de.gds2.ab8Array;

import java.util.Scanner;

public class KlassenNoten {
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m"; // Yellow

    public static final String RESET = "\033[0m"; // Reset


    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Geben sie an wie viele Noten sie eintragen möchten: ");
        int anzahl = inputScanner.nextInt();

        String[] namen = new String[anzahl];
        double[] note = new double[anzahl];

        double durchnitt = 0;


        for (int i = 0; i < namen.length; i++) {
            System.out.print("Geben sie den Name ein: ");
            namen[i] = inputScanner.next();
            System.out.print("Gebe sie die Note ein: ");
            note[i] = inputScanner.nextDouble();

            durchnitt = durchnitt + note[i];

        }

        durchnitt = durchnitt / anzahl;


        for (int i = 0; i < anzahl; i++) {
            if (note[i] < durchnitt){
                System.out.printf("%1$-15s %2$.1f \t %3$-20s \n", namen[i], note[i], GREEN + "Überdurchschnittlich" + RESET);
            } else if (note[i] == durchnitt) {
                System.out.printf("%1$-15s %2$.1f \t %3$-20s \n", namen[i], note[i], YELLOW + "Durchschnittlich" + RESET);
            } else {
                System.out.printf("%1$-15s %2$.1f \t %3$-20s \n", namen[i], note[i], RED + "unterdurchschnittlich" + RESET);
            }

        }
    }
}
