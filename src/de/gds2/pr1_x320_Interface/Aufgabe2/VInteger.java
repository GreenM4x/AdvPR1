package de.gds2.pr1_x320_Interface.Aufgabe2;
public class VInteger extends Integer implements Vergleichbar{


    public VInteger(int w) {
        super(w);
    }

    @Override
    public int vergleichenMit(Vergleichbar obj) {
        int out = 0;
        VInteger VIntObi = (VInteger) obj;
        if (this.wert > VIntObi.wert){
            out = -1;
        }
        if (this.wert == VIntObi.wert){
            out = 0;
        }
        if (this.wert < VIntObi.wert){
            out = 1;
        }

        return out;
    }
}
