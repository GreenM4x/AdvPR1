package de.gds2.pr1_x320_Interface.Aufgabe2;

public interface Vergleichbar {
    /*
     * vergleicht das aufgerufene Objekt mit dem als Parameter uebergebenen
     * Objekt; liefert: -1 falls das aufgerufene Objekt kleiner ist als das
     * Parameterobjekt 0 falls beide Objekte gleich gross sind 1 falls das
     * aufgerufene Objekt groesser ist als das Parameterobj.
     */
    public int vergleichenMit(Vergleichbar obj);

}
