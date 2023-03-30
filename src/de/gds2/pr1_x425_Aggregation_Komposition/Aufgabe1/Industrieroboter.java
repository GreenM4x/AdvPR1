package de.gds2.pr1_x425_Aggregation_Komposition.Aufgabe1;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Industrieroboter {
    private static final int maxAnzWerkzeuge = 10;

    public ArrayList<Werkzeug> werkzeugsKasten = new ArrayList<Werkzeug>(10);

    public Industrieroboter() {
    }

    public boolean werkzeugHinzufuegen(int platz, Werkzeug neu){

        platz = platz-1;

        try {
            werkzeugsKasten.get(platz);
        } catch (IndexOutOfBoundsException e) {
            werkzeugsKasten.add(platz, neu);
            return true;
        }

    return false;

    }

    public boolean werkzeugEntfernen(int platz){

        try {
            werkzeugsKasten.get(platz);
        }catch (IndexOutOfBoundsException e) {
            werkzeugsKasten.set(platz, null);
            return true;
        }
        return false;
    }
}
