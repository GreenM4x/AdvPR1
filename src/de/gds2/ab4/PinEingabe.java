package de.gds2.ab4;

import java.util.Scanner;

public class PinEingabe {
    public static int fixPin = 1337;
    public static int fixPuk = 4242;

    public static void main(String[] args) {

        int tries = 0;
        Scanner inputScanner = new Scanner(System.in);
        int inputPin;
        int inputPuk;

        System.out.print("Geben sie ihren 4 Stelligen PIN ein: ");

         do {

             inputPin = inputScanner.nextInt();
             if (inputPin >= 1000 && inputPin <= 9999){
                 tries++;
                 if(inputPin != fixPin && tries < 3) {
                     System.out.println("Try again.");
                 }
                 if (inputPin == fixPin) {
                     System.out.println("Der PIN ist Ricthig");
                     return;
                 }
                 if (tries == 3) {
                     System.out.println("Sie haben den PIN dreimal falsch eingegeben!");
                 }
             } else {
                 System.out.println("*hust* 4 stellen *hust*");
             }
        } while (inputPin != fixPin && tries < 3);

        System.out.println("Geben sie jetzt den Puk ein: ");

         do {
             inputPuk = inputScanner.nextInt();
                if (inputPuk != fixPuk){
                    System.out.println("Try again.");
                } else {
                    System.out.println("Yey Puk ist richtig!");
                }
         } while (inputPuk != fixPuk);

    }
}