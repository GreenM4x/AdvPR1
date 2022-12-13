package de.gds2.AbgabeArray;

import java.util.Arrays;

public class Vergleich {

    public static void main(String[] args) {
        int[] zahlen = {3,5,8,6,4,1,2,7,9};
        Arrays.sort(zahlen);
        System.out.println(Arrays.toString(zahlen)); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}

