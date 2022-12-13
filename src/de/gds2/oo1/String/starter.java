package de.gds2.oo1.String;

import java.util.Random;
import java.util.Scanner;

public class starter {

    public static void main(String[] args) {
        String input;

        Scanner inputScanner = new Scanner(System.in);
        Scanner inputScanner2 = new Scanner(System.in);
        System.out.println("Select Aufagabe: [1] [2] [3] [4]");
        int selection = inputScanner.nextInt();
        switch (selection) {
            case 1 -> {
                System.out.println("Aufgabe 1: Leerzeischen Entfernen");
                input = inputScanner2.nextLine();
                System.out.println(LeererzeichenEntfernenAusString(input));
            }
            case 2 -> {
                System.out.println("Aufgabe 2: Vokale Entfernen");
                input = inputScanner2.nextLine();
                System.out.println(TextOhneVokale(input));
            }
            case 3 -> {
                System.out.println("Aufgabe 3: Text Reverse");
                input = inputScanner2.nextLine();
                System.out.println(Reverse(input));
            }
            case 4 -> {
                System.out.println("Aufgabe 4: Passwort Generator");
                System.out.println("Gaben sie die Passwort länge ein (> 5)");
                int iInput = inputScanner2.nextInt();
                System.out.println(PasswordGenerator(iInput));
            }
        }

    }

    public static String LeererzeichenEntfernenAusString(String s) {
        return s.replace(" ", "");
    }

    public static String TextOhneVokale(String s){
        return s.replaceAll("[aeoui]", "");
    }

    public static String Reverse(String input) { // Hallo
        char[] array = input.toCharArray();

        String output = "";

        for (int i = array.length - 1; i >= 0; i--) {
            output = output.concat(String.valueOf(array[i]));
        }

        return output;
    }

    public static String PasswordGenerator(int lenght){

        String auswahl = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String passwort = "";

        Random rand = new Random();

        if (lenght >= 5) {
            for (int i = 0; i < lenght; i++) {
                int zufaelligeZahl = rand.nextInt(auswahl.length());
                char neuesZeichen = auswahl.charAt(zufaelligeZahl);

                passwort = passwort.concat(String.valueOf(neuesZeichen));
            }
        } else {
            return "Error: Passwortlänge kleiner als 5! Das Passwort muss aus mindestens fünf Zeichen bestehen.";
        }

        return passwort;
    }
}
