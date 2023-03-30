package de.gds2.pr1_x425_Aggregation_Komposition.Aufgabe1;

public class Tester {
    public static void main(String[] args) {
        Bohrer bohrer1 = new Bohrer("Baum", 0,3);
        Bohrer bohrer2 = new Bohrer("Baum", 0,3);
        Bohrer bohrer3 = new Bohrer("Baum", 0,3);
        Bohrer bohrer4 = new Bohrer("Baum", 0,3);
        Bohrer bohrer5 = new Bohrer("Baum", 0,3);

        Industrieroboter coolerRobi = new Industrieroboter();

        System.out.println(coolerRobi.werkzeugHinzufuegen(1,bohrer1));
        System.out.println(coolerRobi.werkzeugHinzufuegen(1,bohrer2));
        System.out.println(coolerRobi.werkzeugEntfernen(7));
        System.out.println(coolerRobi.werkzeugEntfernen(1));
        System.out.println(coolerRobi.werkzeugHinzufuegen(1,bohrer2));


    }
}
