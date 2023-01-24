package de.gds2.pr1_x210_Ueberladen;

public class Punkt {
    private double x;
    private double y;
    private int norm = 1;


    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int getNorm(){
        return norm;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public boolean gleichheit(Punkt a){

        return x == a.x && y == a.y;
    }

    public static void drucken(double x, double y){
        System.out.println("Punkt: " + x + " " + y );

    }

    public void drucken(String text) {
        System.out.println(text + this.x + " " + this.y);
    }

    public double spiegelAnX(){
        y *= -1;
        return getY();
    }
    public double spiegelAnY(){
        x *= -1;
        return getX();
    }

    public static void dist(Punkt p1, Punkt p2, int norm){

        if (norm == 1) {
            double dist = (Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
            System.out.println("Distance = " + dist);
        }
        if (norm == 2) {
            double dist = Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
            System.out.println("Distance =" + dist );
        }

    }



}
