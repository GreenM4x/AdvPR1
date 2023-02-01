package de.gds2.Sontiges.Klausur4.ubung.Enum;

public class Starter {
    public static void main(String[] args) {
        Monat monat = Monat.FEBRUAR;

        System.out.println(monat.name() + " hat " + monat.getAnzahlTage() + " Tage.");

        if (monat.in(Jahreszeit.WINTER)){
            System.out.println("Dieser Monat is im Winter");
        }
    }
}
