package de.gds2.ab8Array;

import java.util.Scanner;

public class ArrayEingabe {
    public static void main(String[] args) {
        int[] eingabe = new int[10];
        int input;

        Scanner inpurScanner = new Scanner(System.in);

        for (int i = 0; i < eingabe.length; i++) {
            System.out.print("Gebe eine Zahl ein: ");
            input = inpurScanner.nextInt();
            if (input > 100 || input < 0) return;
            eingabe[i] = input;
        }

        for (int i = 0; i < eingabe.length; i++) {
            System.out.println("Index: " + i + ", Inhalt: " + eingabe[i]);
        }

        System.out.println("Gebe die 1st Zahl neu ein");
        eingabe[0] = inpurScanner.nextInt();
        System.out.println("Index: 0, Inhalt: " + eingabe[0]);

        inpurScanner.close();
    }
}
