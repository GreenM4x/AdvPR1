package de.gds2.pr1_x320_Interface.Aufgabe2;

public class ExtraKlasse {
    public static void main(String[] args) {
        Vergleichbar meins1 = new VInteger(24);
        Vergleichbar meins2 = new VInteger(22);
        Vergleichbar meins3 = new VInteger(20);
        Vergleichbar meins4 = new VInteger(27);

        Vergleichbar[] myelements = new Vergleichbar[4];

        myelements[0] = meins1;
        myelements[1] = meins2;
        myelements[2] = meins3;
        myelements[3] = meins4;

        VInteger erbernis = (VInteger) NuetzlicheFunktionen.kleinstesElement(myelements);

        System.out.println(erbernis.wert);

    }
}
