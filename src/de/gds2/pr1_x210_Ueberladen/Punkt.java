package de.gds2.pr1_x210_Ueberladen;

public class Punkt {
    private double x;
    private double y;
    private int norm = 1;

    public static void main(String[] args) {
    }

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

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public static void gleichheit (Punkt punkta, Punkt punktb) {
        if (punkta.x == punktb.x && punkta.y == punktb.y) {
            System.out.println("Punkte sind gleich");
        } else {
            System.out.println("punkte sind nicht gleich");
        }
    }
    public static void drucken(double x, double y){
        System.out.println("Punkt: " + x + " " + y );

    }

    public void drucken(String text) {
        System.out.println("Punkt " + this.x + " " + this.y);
    }

    public static void spiegelnX (double x){
        if (x > 0) System.out.println("X = " +  -x);
        if (x < 0) System.out.println("X = " + Math.abs(x));
        else System.out.println("X = 0 ");
    }

    public static void spiegelnY (double y){
        if (y > 0) System.out.println("Y = " +  -y);
        if (y < 0) System.out.println("Y = " + Math.abs(y));
        else System.out.println("Y = 0 ");
    }

    public void dist(Punkt p1, Punkt p2){

        if (this.getNorm() == 1) {
            double dist = (Math.sqrt(p1.x - p2.x) + Math.sqrt(p1.y - p2.y));
            System.out.println("Distance = " + dist);
        }
        if (this.getNorm() == 2) {
            double dist = Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
            System.out.println("Distance =" + dist );
        }

    }



}
