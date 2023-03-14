package de.gds2.pr1_x280_x290_Vererbung.Tickets;

public class EinzelTicket extends Ticket {

    private int zone;
    private String verfallsDatum;

    public EinzelTicket ( int preis, String verfallsDatum, int zone ) {
        super(preis);
        this.verfallsDatum = verfallsDatum;
        this.zone = zone;
    }

    @Override
    public boolean gueltigInZone ( int zone ) {
        return this.zone == zone;
    }

    public boolean gueltigAm ( String datum ) {
        return verfallsDatum.equals(datum);
    }

}
