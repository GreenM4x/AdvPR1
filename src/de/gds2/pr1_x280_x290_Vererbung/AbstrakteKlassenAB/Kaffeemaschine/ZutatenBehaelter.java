package de.gds2.pr1_x280_x290_Vererbung.AbstrakteKlassenAB.Kaffeemaschine;

public class ZutatenBehaelter extends Behaelter {
    private String zutat;


    public ZutatenBehaelter(double fuellstand, double maxFuellstand, String zutat) {
        super(fuellstand, maxFuellstand);
        this.zutat = zutat;
    }

    @Override
    public String toString() {
        return null;
    }

    public void entnehmen(double x){
        this.fuellstand -= x;
    }
}
