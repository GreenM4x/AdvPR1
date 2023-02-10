package de.gds2.pr1_x280_x290_Vererbung.Rechnung;

public class Rechnung {
    protected double gesambetrag;
    protected double mehrwertsteuer;

    public Rechnung(double gesambetrag, double mehrwertsteuer) {
        this.gesambetrag = gesambetrag;
        this.mehrwertsteuer = mehrwertsteuer;
    }

    protected double bruttobetragBerechnen(){
        return gesambetrag + gesambetrag * mehrwertsteuer;
    }
}
