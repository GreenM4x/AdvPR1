package de.gds2.pr1_x280_x290_Vererbung.AbstrakteKlassenAB.Kaffeemaschine;

public abstract class Behaelter {
    protected double fuellstand;
    protected double maxFuellstand;

    public abstract String toString();

    public Behaelter(double fuellstand, double maxFuellstand) {
        this.fuellstand = fuellstand;
        this.maxFuellstand = maxFuellstand;
    }
}
