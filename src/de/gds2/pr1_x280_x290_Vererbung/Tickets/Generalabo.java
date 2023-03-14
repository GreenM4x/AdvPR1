package de.gds2.pr1_x280_x290_Vererbung.Tickets;

public class Generalabo extends Ticket {

    private String inhaber;
    private String verfallsDatum;

    public Generalabo ( int preis, String inhaber, String verfallsDatum ) {
        super(preis);
        this.inhaber = inhaber;
        this.verfallsDatum = verfallsDatum;
    }

    public void entwerten () {
        /* Es passiert nichts */
    }

    @Override
    public boolean gueltigInZone ( int zone ) {
        return true;
    }

    public boolean gueltigAm ( String datum ) {
        return verfallsDatum.compareTo(datum) >= 0;
    }

    public boolean gueltFuerPerson ( String name ) {
        return inhaber.equals(name);
    }

    public String getInhaber () {
        return inhaber;
    }

}