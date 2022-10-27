package de.gds2.ab3if;

import java.util.Scanner;

public class Discountpreise {

    public static void main(String[] args) {

        //INIT
        double  rabat = 0.20;
        int     gesamtbetrag = 0;
        double discountpreis = 0.0;

        //Eingabe
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Gebe sie den Gesamtbetag in Cent ein: ");
        gesamtbetrag = inputScanner.nextInt();

        //Varabeitung

        if (gesamtbetrag > 5000){
            discountpreis = gesamtbetrag * (1 -rabat);
        } else {
            discountpreis = gesamtbetrag;
        }
        
        System.out.println("Bezahl " + discountpreis + " du kek");


    }
}
