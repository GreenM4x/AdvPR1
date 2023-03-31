package de.gds2.pr1_x425_Aggregation_Komposition.Aufgabe2;

public class Artikel {

    private  String name;
    private String code;
    private int bestand;
    private  double preis;

    public Artikel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getBestand() {
        return bestand;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void kaufen(int b){

        bestand -= b;
    }
}
