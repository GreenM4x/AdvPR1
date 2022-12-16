package de.gds2.pr1_x130_oo1;

public class Getraenk {

    private String name;
    private double maxBestand;
    private double bestamd;
    private double minBestand;
    private double preis;

    public Getraenk() {
    }


    public Getraenk(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public double BestellMenge(){
        double bestellmenge = 0.0;

        if (bestamd < minBestand) {
            bestellmenge = maxBestand - bestamd;
        }

        return bestellmenge;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxBestand() {
        return maxBestand;
    }

    public void setMaxBestand(double maxBestand) {
        this.maxBestand = maxBestand;
    }

    public double getBestamd() {
        return bestamd;
    }

    public void setBestamd(double bestamd) {
        this.bestamd = bestamd;
    }

    public double getMinBestand() {
        return minBestand;
    }

    public void setMinBestand(double minBestand) {
        this.minBestand = minBestand;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}
