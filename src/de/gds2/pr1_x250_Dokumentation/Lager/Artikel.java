package de.gds2.pr1_x250_Dokumentation.Lager;

/**
 * Artikel dienen zum Einlagern im Warehouse mit Preis und Artikelnummer.
 * @author Andreas Wellstein
 * @version 4.0
 * @see Lager
 */
public class Artikel {

    /**
     * Der aktuelle Mehrwertsteuersatz.
     * Er liegt zur Zeit bei {@value} .
     *
     * @since 1.0
     */
    private static final double mehrwertsteuer = 0.21;

    private String artikelname;

    /**
     * Liefert den Namen eines Artikels zurueck.
     * @return Name des Artikels
     */
    public String getArtikelname() {
        return artikelname;
    }

    /**
     * Setzen eines neuen Artikelnamens
     * @param artikelname Zeichenkette die den Namen des Artikels übergibt
     */
    public void setArtikelname(String artikelname) {
        this.artikelname = artikelname;
    }
}
