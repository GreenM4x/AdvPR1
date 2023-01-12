package de.gds2.Sontiges.Klausur_3_Loesung;

import java.util.Arrays;

public class Aufgabe5 {

    public static void main(String[] args) {
        int[] x = {2,4,3,2,7,0,2,7};
        int[] y = {7,7,8,4,2,4,3,5};

        schnitmenge(x,y);
    }
    private static void schnitmenge(int[] a, int[] b) {
        int[] ergebnis = new int[a.length];

        //vorsortieren
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < b.length; i++) {
            int einzelwert = b[i];

            if (Arrays.binarySearch(a, einzelwert) >= 0){
                Arrays.sort(ergebnis);
                if (Arrays.binarySearch(ergebnis, einzelwert) < 0) {
                    ergebnis[i] = einzelwert;
                }
            }

        }

        System.out.println(Arrays.toString(ergebnis));


    }
}
