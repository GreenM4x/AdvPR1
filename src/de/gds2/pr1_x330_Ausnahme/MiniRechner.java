package de.gds2.pr1_x330_Ausnahme;

import java.util.Scanner;

public class MiniRechner {
    public static void main(String[] args) {
// Deklaration
        int zaehler, nenner, divison;
        Scanner sc = new Scanner(System.in);
        System.out.println("Division zweier int-Zahlen");
        System.out.println("**********************");
        System.out.println("Bitte geben Sie den Zähler ein: ");
        zaehler = sc.nextInt();
        System.out.println("Bitte geben Sie den Nenner ein: ");
        nenner = sc.nextInt();
        divison = zaehler / nenner;
        System.out.println("Ergebnis aus " + zaehler + " / "
                + nenner + " = " + divison);
        sc.close();
    }
}
