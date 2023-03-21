package de.gds2.pr1_x320_Interface.Aufgabe2;


public class NuetzlicheFunktionen {

    public static Vergleichbar kleinstesElement(Vergleichbar[] elemente){

        Vergleichbar ergebnis = elemente[0];

        for (int i = 0; i < elemente.length; i++){
            if (ergebnis.vergleichenMit(elemente[i]) < 0){
                ergebnis = elemente[i];
            }

        }
        return ergebnis;
    }
}
