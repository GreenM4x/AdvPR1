package de.gds2.pr1_x280_x290_Vererbung.Schulverwaltungssoftware;

import java.util.Scanner;

public class tester {



    public static void main(String[] args) {
         String name;
         int alter;
         String unterichtfach;
         int klassenstufe;
         int jahresbeitrag;

        Scanner sc = new Scanner(System.in);
        //Lehrer
        System.out.println("Geben sie name ein: ");
        name = sc.nextLine();
        System.out.println("Gaben sie alter ein: ");
        alter = sc.nextInt();
        System.out.println("geben sie lehrfach ein: ");
        unterichtfach = sc.nextLine();

        Lehrer lehrer01 = new Lehrer(name,alter,unterichtfach);

        //Mensch
        System.out.println("Geben sie name ein: ");
        name = sc.nextLine();
        System.out.println("Gaben sie alter ein: ");
        alter = sc.nextInt();

        Mensch mensch01 = new Mensch(name,alter);

        //schüler
        System.out.println("Geben sie name ein: ");
        name = sc.nextLine();
        System.out.println("Gaben sie alter ein: ");
        alter = sc.nextInt();
        System.out.println("Geben sie klassenstufe ein: ");
        klassenstufe = sc.nextInt();
        System.out.println("Geben sie jahresbeitrag ein: ");
        jahresbeitrag = sc.nextInt();

        Schuler schuler01 = new Schuler(name,alter,klassenstufe,jahresbeitrag);

        System.out.println(schuler01.Jahresbeitragsfaktor());


    }
}
