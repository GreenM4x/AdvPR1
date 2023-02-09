package de.gds2.pr1_x280_x290_Vererbung;

public class StartMitarbeiter {

    public static void main ( String[] args ) {


        Mitarbeiter Wa = new Mitarbeiter("Wellstein", "Andreas", 1600.50);
        Mitarbeiter Dit = new Mitarbeiter("Dietrich", "Hans-Martin", 1650.00);
        Fuehrungskraft Krp = new Fuehrungskraft("Krappel", "Joachim", 4000.00);


        System.out.println(Krp.name + " is " + Krp.posistion);

    }

}