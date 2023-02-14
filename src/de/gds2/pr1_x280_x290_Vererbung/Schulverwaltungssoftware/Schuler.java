package de.gds2.pr1_x280_x290_Vererbung.Schulverwaltungssoftware;

public class Schuler extends Mensch {
    private int klassenstufe;
    private int jahresbeitrag;


    public Schuler(String name, int alter, int klassenstufe, int jahresbeitrag) {
        super(name, alter);
        this.klassenstufe = klassenstufe;
        this.jahresbeitrag = jahresbeitrag;
    }

    public int Jahresbeitragsfaktor() {

        return this.alter / this.klassenstufe * jahresbeitrag;
    }
    public int getKlassenstufe() {
        return klassenstufe;
    }

    public void setKlassenstufe(int klassenstufe) {
        this.klassenstufe = klassenstufe;
    }

    public int getJahresbeitrag() {
        return jahresbeitrag;
    }

    public void setJahresbeitrag(int jahresbeitrag) {
        this.jahresbeitrag = jahresbeitrag;
    }
}
