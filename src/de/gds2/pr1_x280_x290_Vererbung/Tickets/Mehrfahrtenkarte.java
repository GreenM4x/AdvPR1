package de.gds2.pr1_x280_x290_Vererbung.Tickets;

public class Mehrfahrtenkarte extends Ticket {

    private int fahrten;
    private int zone;

    public Mehrfahrtenkarte ( int preis, int fahrten, int zone ) {
        super(preis);
        this.fahrten = fahrten;
        this.zone = zone;
    }

    public void entwerten () {
        if ( fahrten == 0 ) return;
        fahrten--;
    }

    public boolean istEntwertet () {
        return fahrten == 0;
    }

    @Override
    public boolean gueltigInZone ( int zone ) {
        return zone == this.zone;
    }

}
