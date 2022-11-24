package de.gds2.oo1.ab3;

import java.text.DecimalFormat;

public class Bruchrechnen {

    private static double z;
    private static double n;
    public static void addieren(int z1, int n1, int z2, int n2) {
         z = z1 * n2 + z2 * n1;
         n = n1 * n2;
        System.out.println(z + "/" + n);
        berechnenKommaZahl(z, n);
    }

    public static void substrahieren(int z1, int n1, int z2, int n2) {
         z = z1 * n2 - z2 * n1;
         n = n1 * n2;
        System.out.println(z + "/" + n);
        berechnenKommaZahl(z, n);
    }

    public static void multiplizieren(int z1, int n1, int z2, int n2) {
         z = z1 * z2;
         n = n1 * n2;
        System.out.println(z + "/" + n);
        berechnenKommaZahl(z, n);

    }

    public static void dividieren(int z1, int n1, int z2, int n2) {
         z = z1 * n2;
         n = n1 * z2;
        System.out.println(z + "/" + n);
        berechnenKommaZahl(z, n);

    }

    public static void berechnenKommaZahl(double n3, double z3) {

        DecimalFormat dc = new DecimalFormat("#.00");
        double result = n3 / z3;
        System.out.println(result);
    }
}
