package de.gds2.pr1_x425_Aggregation_Komposition.Aufgabe1;

public abstract class Werkzeug {

    private String art;
    protected int verschleiss = 0;

    public Werkzeug(String art, int verschleiss) {
        this.art = art;
        this.verschleiss = verschleiss;
    }

    public abstract void ausgabe();
}
