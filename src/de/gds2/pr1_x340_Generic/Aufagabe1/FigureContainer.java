package de.gds2.pr1_x340_Generic.Aufagabe1;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class FigureContainer {

     List<Figure> figures;

    public FigureContainer () {
        this.figures = new Vector<Figure>();
    }

    public void add(Figure fig){
        this.figures.add(fig);
    }

    public Figure getFigure(int id){
        for(Figure figs : figures) {
            if(figs.getId() == id) {
                return figs;
            }
        }

        return null;
    }

    public boolean containsFig(int id){
        for(Figure figs : figures) {
            if(figs.getId() == id) {
                return true;
            }
        }

        return false;

    }

    public Iterator<Figure> iterator(){
        return this.figures.iterator();
    }

    public int size(){
        return figures.size();
    }

    public void drawAll(){
        for(Figure figs : figures) {
           figs.draw();
        }
    }

}
