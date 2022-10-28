package de.gds2.ab8Array;

public class DreierReihe {
    public static void main(String[] args) {
        //Init
        int[] zahlen = new int[31];

        for (int i = 0; i <= 30; i++) {
            zahlen[i] = i;
        }

        for (int i: zahlen) {
            if(i % 3 == 0) System.out.print(i + " ");
        }
    }
}
