package de.gds2.oo1.ab2;

public class Artikel {

    private String artikelnr;
    private String bezeichnung;
    private double preis;
    private int bestand;

    public String getArtikelnr() {
        return artikelnr;
    }

    public void setArtikelnr(String artikelnr) {
        this.artikelnr = artikelnr;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getBestand() {
        return bestand;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }

    public void aendern (int pStueck){

    }
}
