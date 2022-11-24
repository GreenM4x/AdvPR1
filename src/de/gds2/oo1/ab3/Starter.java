package de.gds2.oo1.ab3;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        int z1, z2, n1, n2;
        int wahl;

        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Geben sie Zähler 1 ein: ");
        z1 = inputScanner.nextInt();

        System.out.print("Geben sie Nenner 1 ein: ");
        n1 = inputScanner.nextInt();

        System.out.println("Geben sie Zähler 2 ein: ");
        z2 = inputScanner.nextInt();

        System.out.println("Geben sie Nenner 2 ein: ");
        n2 = inputScanner.nextInt();

        System.out.println("Möchten sie die Brüche addieren [1],subtrahieren [2], multiplizieren [3] oder dividieren [4]");
        wahl = inputScanner.nextInt();

        switch (wahl) {
            case 1 -> Bruchrechnen.addieren(z1, n1, z2, n2);
            case 2 -> Bruchrechnen.substrahieren(z1, n1, z2, n2);
            case 3 -> Bruchrechnen.multiplizieren(z1, n1, z2, n2);
            case 4 -> Bruchrechnen.dividieren(z1, n1, z2, n2);
            default -> System.out.println("Keine gültige eingabe");
        }
    }
}
