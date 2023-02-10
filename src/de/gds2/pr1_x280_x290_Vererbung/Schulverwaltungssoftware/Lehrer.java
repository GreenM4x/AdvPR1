package de.gds2.pr1_x280_x290_Vererbung.Schulverwaltungssoftware;

public class Lehrer extends Mensch {
    private String unterichtfach;

    public Lehrer(String name, int alter, String unterichtfach) {
        super(name, alter);
        this.unterichtfach = unterichtfach;
    }
}
