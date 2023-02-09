package de.gds2.pr1_x280_x290_Vererbung;

public class Fuehrungskraft extends Mitarbeiter {

    public String posistion;

    public Fuehrungskraft() {
    }

    public Fuehrungskraft(String name, String vorname, double gehalt) {
        super(name, vorname, gehalt);
        posistion = "The Boss";
    }


}
