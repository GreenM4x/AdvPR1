package de.gds2.pr1_x280_x290_Vererbung.Interface;

import java.util.Vector;

public class Vermittler implements NachrichtenEmpfaenger, NachrichtenQuelle{

    Vector MeineVermittlerObj = new Vector<Vermittler>();

    @Override
    public void empfangeNachricht(String nachricht) {
        System.out.println("---------------Vermittler empfängt nacricht und sent sie weiter");
        sendeNachricht(nachricht);
    }

    @Override
    public void anmelden(Vermittler empf) {
        MeineVermittlerObj.add(empf);

    }

    @Override
    public void abmelden(Vermittler empf) {
        MeineVermittlerObj.add(empf);
    }

    @Override
    public void sendeNachricht(String nachricht) {
        for (int i = 0; i < MeineVermittlerObj.size(); i++) {
            NachrichtenEmpfaenger ref = (NachrichtenEmpfaenger) MeineVermittlerObj.elementAt(i);
            ref.empfangeNachricht(nachricht);
            System.out.println("Vermitler sendet an " + i);


        }

    }
}
