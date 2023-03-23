package de.gds2.pr1_x330_Ausnahme.Aufgabe2;

public class wurzel {
    public static void main(String[] args) {
        double zahl = -49;
        try {
            wurzelberechnen(zahl);
        }
        catch (ArithmeticException ah){
            System.out.println(ah);
        }
    }

    private static void wurzelberechnen(double zahl) {
        double result;
        String fehlermdelung = "Wurzel kann nur von postiven zahl bla ";

        if (zahl < 0) throw new ArithmeticException(fehlermdelung);
        System.out.println( Math.sqrt(zahl));
    }


}
