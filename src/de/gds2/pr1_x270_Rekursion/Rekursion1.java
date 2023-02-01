package de.gds2.pr1_x270_Rekursion;

import java.util.Scanner;

public class Rekursion1 {

    public static void main(String[] args) {
        System.out.println("Geben Sie ein Ziele eine,solange die Zeile nihct mit " + "_ anfängt geht es Weiter");
        lieszeischen();
        System.out.println("Ende der Rekursion");
    }

    private static void lieszeischen() {
        Scanner sc = new Scanner(System.in);
        char z;
        z = sc.nextLine().charAt(0);
        if (z != '_') {
            lieszeischen();
        }
        System.out.println(z);
        sc.close();
    }
}
