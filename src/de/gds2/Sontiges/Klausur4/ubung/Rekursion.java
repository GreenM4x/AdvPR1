package de.gds2.Sontiges.Klausur4.ubung;

import java.util.Scanner;

public class Rekursion {
    public static double med = 0;
    public static int daycount = 0;

    public static void main(String[] args) {
        int n = 0; // Tage
        System.out.print("Eingabe: ");
        Scanner inputScanner = new Scanner(System.in);
        n = inputScanner.nextInt();
        inputScanner.close();
        medikamentenmenge(n);
    }

    private static void medikamentenmenge(int n) {
        daycount++;
        med += 5;
        if (n == 0) {
            System.out.println("Tag: " + daycount + " "+ med);
        }else {
            med = med * 0.60;
            System.out.println("Tag: " + daycount + " Med:" + med);
            medikamentenmenge(n -1);
        }

    }
}
