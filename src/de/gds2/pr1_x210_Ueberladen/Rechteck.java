package de.gds2.pr1_x210_Ueberladen;

public class Rechteck {

    public static void main(String[] args) {
        double a = 8, b = 4;

        System.out.println("Rechteckfläche: \t" + rectArea(a,b));
        System.out.println("Quadrat: \t" + rectArea(a));
    }

    private static double rectArea(double a, double b) {
        return a * b;
    }

    private static double rectArea(double a) {
        return a * a;
    }
}
