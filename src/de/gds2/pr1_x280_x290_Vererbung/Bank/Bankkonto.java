package de.gds2.pr1_x280_x290_Vererbung.Bank;

public class Bankkonto {
    protected double kontoStand;

    public Bankkonto(double kontoStand) {
        this.kontoStand = kontoStand;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public void einzahlen(double x) {
        this.kontoStand += x;
    }

    public void abheben(double x) {
        this.kontoStand -= x;
    }


}
