package de.gds2.ab7Wiederholungen;

import java.util.Scanner;

public class UniSubset {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Aufgabe a oder b: ");
        String programm = inputScanner.next().toLowerCase();

        if (programm.contains("a")){
            System.out.println("Geben sie min und max Wert ein: ");
            int min = inputScanner.nextInt();
            int max = inputScanner.nextInt();

            Unicode_a(min, max);
        } else if (programm.contains("b")){
            Unicode_b();
        }
    }

    public static void Unicode_a(int min, int max){

        System.out.printf("%1$-8s %2$-10s \n", "Dezimal", "Zeischenvaribale");

        for (int i = min; i <= max; i++) {

            char c = (char) i;
            String display = "";
            display = Character.toString(c);

            System.out.printf("%1$-8s %2$-10s \n", i, display);

        }

    }

    public static void Unicode_b(){
        System.out.printf("%1$-8s %2$-10s \n", "Dezimal", "Zeischenvaribale");

        for (char ch = 'A' ; ch <= 'Z'; ch++){
            int k = 0;
            String display = "";
            k = (int) ch;
            display = Character.toString(k);
            System.out.printf("%1$-10s %2$-8d \n", display, k);
        }
    }
}
