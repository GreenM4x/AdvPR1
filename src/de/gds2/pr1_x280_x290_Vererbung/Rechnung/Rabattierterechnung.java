package de.gds2.pr1_x280_x290_Vererbung.Rechnung;

public class Rabattierterechnung extends Rechnung {
    private double rabat;

    public Rabattierterechnung(double gesambetrag, double mehrwertsteuer, double rabat) {
        super(gesambetrag, mehrwertsteuer);
        this.rabat = rabat;
    }

    @Override
    protected double bruttobetragBerechnen() {
        return super.bruttobetragBerechnen();
    }
}
