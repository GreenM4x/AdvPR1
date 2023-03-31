package de.gds2.pr1_x425_Aggregation_Komposition.Aufgabe2;

import java.util.ArrayList;
import java.util.Arrays;

public class Verkaeufer {

    private ArrayList<Artikel> ArtArray;
    public Verkaeufer(ArrayList<Artikel> sortiment) {
        this.ArtArray = sortiment;

    }

    public double getPreis(int index){
        return ArtArray.get(index).getPreis();
    }

    public void SetPreis(int index, double preis){
         ArtArray.get(index).setPreis(preis);
    }

    public void kaufen (int i, int b){
        ArtArray.get(i).setBestand(ArtArray.get(i).getBestand() + b);
    }

    public void rabatt (int s, int d){
        for (Artikel a: ArtArray) {
            if (a.getBestand() > s) {
                a.setPreis(a.getPreis() - (a.getPreis() * ((double) d/100)));
            }
        }
    }

    public void erweitereSortiment(int n) {
        for (int i = 0; i < n; i++) {
         ArtArray.add(null);

        }
    }

}
