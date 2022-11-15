package de.gds2.oo1;

import de.gds2.ab9Plaetzchen.Plaetzchen;

public class Starter {
    public static void main(String[] args) {

        Getraenk bier= new Getraenk();
        bier.name = "Tannenzäpfle";

        bier.bestamd = 3.0;
        bier.maxBestand = 100.0;
        bier.minBestand = 25.0;

        System.out.println(bier.BestellMenge());

        Plaetzchen plaetzchen03 = new Plaetzchen();


    }
}
