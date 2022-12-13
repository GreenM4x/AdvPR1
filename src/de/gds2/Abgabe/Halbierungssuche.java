package de.gds2.Abgabe;

import java.util.Arrays;

public class Halbierungssuche {
    public static void main(String[] args) {
        int[] zahlen = {10,20,15,22,35};

        Arrays.sort(zahlen); //10 15 20 22 35

        System.out.println(Arrays.binarySearch(zahlen, 15));
    }
}
