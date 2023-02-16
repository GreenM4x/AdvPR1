package de.gds2.pr1_x280_x290_Vererbung.Bank;

public abstract class Bankkonto {
    protected double kontoStand;

    public Bankkonto(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public abstract void einzahlen(double x);

    public abstract void abheben(double x);


}
