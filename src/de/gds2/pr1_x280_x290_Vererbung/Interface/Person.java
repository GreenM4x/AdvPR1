package de.gds2.pr1_x280_x290_Vererbung.Interface;

public class Person implements NachrichtenEmpfaenger{
    private String Nachname;
    private String Vorname;


    public Person(String nachname, String vorname){
        super();
        Vorname = vorname;
        Nachname = nachname;

    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    @Override
    public void empfangeNachricht(String nachricht) {
        System.out.println("Nachricht an: " + Nachname + ", " + Vorname + "Inhalt: " + nachricht);

    }
}
