package de.gds2.pr1_x280_x290_Vererbung.Bank;

public class GiroKonto extends Bankkonto {
    private double gebuehr = 0.05;

    public GiroKonto(double kontoStand, double gebuehr) {
        super(kontoStand);
        this.gebuehr = gebuehr;
    }

    @Override
    public void abheben(double x) {
        super.abheben(x);
        kontoStand -= gebuehr;
    }

    @Override
    public void einzahlen(double x) {
        super.einzahlen(x);
        kontoStand -= gebuehr;
    }
}
