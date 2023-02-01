package de.gds2.pr1_x270_Rekursion;

import java.util.Scanner;

public class BerechneFakRek {

    public static void main(String[] args) {
        int fakOut = 0;

        System.out.print("Eingabe:" );
        Scanner inputScanner = new Scanner(System.in);

        int i = inputScanner.nextInt();

        fakOut = fakBerechnung(i);

        inputScanner.close();

        System.out.println(fakOut);
    }

    private static int fakBerechnung(int i) {
        int result = 0;
        if (i == 1) {
            result = 1;
        } else {
            result = i * fakBerechnung(i-1);
        }
        return result;
    }


}
