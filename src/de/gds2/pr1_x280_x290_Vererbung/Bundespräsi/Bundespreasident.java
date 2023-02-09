package de.gds2.pr1_x280_x290_Vererbung.Bundespräsi;

public class Bundespreasident extends Kunde{
    private int rabattProzent;


    public Bundespreasident(String name, int rabattProzent) {
        super(name);
        this.rabattProzent = rabattProzent;
    }
}
