package de.gds2.ab6For;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Festgeldkonto {

    public static void main(String[] args) {

        double startKapital;
        double zinssatz;
        int laufzeit = 1;
        double result;

        DecimalFormat dc = new DecimalFormat("#.00");

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Geben sie ihr Startkapital ein: ");
        startKapital = inputScanner.nextDouble();
        System.out.print("Geben sie ihren Zinssatz ein: ");
        zinssatz = inputScanner.nextDouble();
        System.out.print("Geben sie die Laufzeit ein: ");
        laufzeit = inputScanner.nextInt();

        for (int i = 1; i <= laufzeit; i++) {

            result = startKapital * Math.pow((1 + zinssatz), i);
            System.out.println(dc.format(result));
        }
    }
}
