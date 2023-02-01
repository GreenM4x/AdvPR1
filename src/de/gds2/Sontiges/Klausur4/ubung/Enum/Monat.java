package de.gds2.Sontiges.Klausur4.ubung.Enum;

public enum Monat {
    JANUAR(31, Jahreszeit.WINTER),FEBRUAR(30, Jahreszeit.WINTER),
    MAERZ(31, Jahreszeit.FRUELING),APRIL(30, Jahreszeit.FRUELING),
    MAI(31, Jahreszeit.FRUELING),JUNI(30, Jahreszeit.SOMMER),
    JULI(31, Jahreszeit.SOMMER),AUGUST(31, Jahreszeit.SOMMER),
    SEPTEMBER(30, Jahreszeit.HERBST),OKTOBER(31, Jahreszeit.HERBST),
    NOVEMBER(30, Jahreszeit.HERBST),DEZEMBER(31, Jahreszeit.WINTER);

    private final int anzahlTage;
    private final Jahreszeit jahreszeit;

    Monat(int i, Jahreszeit lol) {
        anzahlTage = i;
        jahreszeit = lol;

    }

    public int getAnzahlTage(){
        return anzahlTage;
    }
    public boolean in(Jahreszeit test){
        return test == this.jahreszeit;
    }



}










