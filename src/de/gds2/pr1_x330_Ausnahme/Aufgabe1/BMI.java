package de.gds2.pr1_x330_Ausnahme.Aufgabe1;

public class BMI {
    public static void main(String[] args) {

    }

    static double berechneBMI(double gewicht, double groesse) throws Exception {
        if (groesse <= 0 || groesse > 3) throw new Exception("Die Körpergröße ist nicht möglich");
        if (gewicht <= 0 || gewicht > 500) throw new Exception("Das Gewicht ist nicht möglich");
        return gewicht / (groesse * groesse);
    }
}
