package de.gds2.pr1_x210_Ueberladen.fuhrpark;

public class Autovermietung {
    public static void main ( String[] args ) {
        Fahrzeug mercedes = new Fahrzeug();
        Fahrzeug ferrari = new Fahrzeug();

        Fuhrpark Car2T = new Fuhrpark(mercedes, ferrari);
    }
}
