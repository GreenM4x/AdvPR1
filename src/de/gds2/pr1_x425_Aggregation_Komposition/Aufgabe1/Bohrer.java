package de.gds2.pr1_x425_Aggregation_Komposition.Aufgabe1;

public class Bohrer extends Werkzeug{

    private int groesse;

    public Bohrer(String art, int verschleiss, int groesse) {
        super(art, verschleiss);
        this.groesse = groesse;
    }

    @Override
    public void ausgabe() {

    }
}
