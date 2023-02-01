package de.gds2.Sontiges.Klausur4.ubung.Assoziationen;

import java.util.Arrays;
import java.util.Scanner;

public class Abteilung {
    static int counter = 0;
    private static Angestellter[] angesteltenListe = new Angestellter[2];

    public static void main(String[] args) {

        Angestellter player1 = new Angestellter("Tom");
        Angestellter player2 = new Angestellter("Max");


        addAngestellter(player1);
        addAngestellter(player2);
        zeigeAlleAngestellten();
        dellAngestellter(player2);
        zeigeAlleAngestellten();

    }

    public static void addAngestellter(Angestellter angestellter){
        angesteltenListe[counter] = angestellter;
        counter++;
    }

    public static void dellAngestellter(Angestellter angestellter){
        int y = 0;
        for (Angestellter i: angesteltenListe) {
            if (i == angestellter) {
                angesteltenListe[y] = new Angestellter("Leer");
            }
            y++;
        }
    }

    public static void zeigeAlleAngestellten(){
        for (Angestellter i: angesteltenListe) {
            System.out.println("Name: " + i.getName());
        }
    }

}
