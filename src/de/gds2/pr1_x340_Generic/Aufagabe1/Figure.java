package de.gds2.pr1_x340_Generic.Aufagabe1;

public class Figure {
    int id;

    public Figure ( int id ) {
        this.id = id;
    }

    public void draw(){
        System.out.println("Drawing..." + this.id);
    }

    public int getId() {
        return id;
    }
}
