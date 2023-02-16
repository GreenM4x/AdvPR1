package de.gds2.pr1_x280_x290_Vererbung.Bank;

public class SparKonto extends Bankkonto  {
    private double zinsSatzt;

    public SparKonto(double kontoStand, double zinsSatzt) {
        super(kontoStand);
        this.zinsSatzt = zinsSatzt;
    }

    void zinsenAbrechnung(){
        this.kontoStand = this.kontoStand * zinsSatzt + this.kontoStand;
    }

    @Override
    public void einzahlen(double x) {
        this.kontoStand += x;
    }

    @Override
    public void abheben(double x) {
        this.kontoStand -= x;
    }
}
