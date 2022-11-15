package de.gds2.oo1;

public class Getraenk {

    String name;

    double maxBestand;
    double bestamd;
    double minBestand;

    double preis;

    public double BestellMenge(){
        double bestellmenge = 0.0;

        if (bestamd < minBestand) {
            bestellmenge = maxBestand - bestamd;
        }

        return bestellmenge;
    }
}
