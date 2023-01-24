package de.gds2.pr1_x240_Assoziationne;

public class Motor {

    private int leistung;
    private double hubraum;

    public Motor ( int pLeistung, double pHubraum ) {
        this.leistung = pLeistung;
        this.hubraum = pHubraum;
    }

    public int getLeistung () {
        return this.leistung;
    }

    public double getHubraum () {
        return this.hubraum;
    }

    public String gibInfo () {
        System.out.println("Motor: " + this.leistung + " PS, " + this.hubraum + " Liter");
        return "Motor: \" + this.leistung + \" PS, \" + this.hubraum + \" Liter";

    }

}
