package de.gds2.oo1.ubung;

public class WellisStarter {
    public static void main(String[] args) {
        int[] welli = new int[] {5,7,8};
        int[] welli2 = {5,7,8};

        int[] welli3 = new int[3];
        welli3[0] = 5;
        welli3[1] = 7;
        welli3[2] = 8;

        double[] dZahlen = {3.3, 3.4, 5.0};

        int zahl = WellisTools.gibGanzZahlZurueck(dZahlen);
        System.out.println(zahl);
    }
}
