package de.gds2.pr1_x240_Assoziationne;

import javax.sound.midi.Soundbank;

public class Motorrad {

    private Motor meinMotor;
    private Reifen[] meineReifen = new Reifen[2];

    public Motorrad ( Motor pMotor, Reifen pVorne, Reifen pHinten ) {
        this.meinMotor = pMotor;

        this.meineReifen[0] = pVorne;
        this.meineReifen[1] = pHinten;
    }

    public Motor getMotor () {
        return this.meinMotor;
    }

    public Reifen getVorderreifen () {
        return this.meineReifen[0]; // Ist der Vorderreifen
    }

    public Reifen getHinterreifen () {
        return this.meineReifen[1]; // ist der Hinterreifen
    }

    public void gibInfo(){
        System.out.println("Motor: \t");
        this.meinMotor.gibInfo();

        System.out.println("Reifen vorne: ");
        this.getVorderreifen().gibInfo();

        System.out.println("Reifen hinten: ");
        this.getHinterreifen().gibInfo();

    }

}
