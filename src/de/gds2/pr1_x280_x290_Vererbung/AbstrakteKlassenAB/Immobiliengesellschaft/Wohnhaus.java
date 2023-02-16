package de.gds2.pr1_x280_x290_Vererbung.AbstrakteKlassenAB.Immobiliengesellschaft;

public class Wohnhaus extends Imobilie{
    private double grundstuecksflaeche;

    public Wohnhaus(String ort, int baujahr, double wohnflaeche, double preis, double grundstuecksflaeche) {
        super(ort, baujahr, wohnflaeche, preis);
        this.grundstuecksflaeche = grundstuecksflaeche;
    }
}
