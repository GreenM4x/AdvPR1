package de.gds2.pr1_x320_Interface.Aufgabe2;
public class VInteger extends Integer implements Vergleichbar{


    public VInteger(int w) {
        super(w);
    }

    @Override
    public int vergleichenMit(Vergleichbar obj) {
        int out = 0;
        if (obj.equals(this.wert)){
            out = 0;
        }

        return out;
    }
}
