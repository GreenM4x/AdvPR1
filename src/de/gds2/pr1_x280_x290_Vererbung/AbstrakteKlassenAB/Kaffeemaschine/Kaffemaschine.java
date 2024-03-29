package de.gds2.pr1_x280_x290_Vererbung.AbstrakteKlassenAB.Kaffeemaschine;

import java.util.Scanner;

public class Kaffemaschine {

    private static ZutatenBehaelter WasserBe = new ZutatenBehaelter(10,100,"Wasser");
    private static ZutatenBehaelter KaffeeBe = new ZutatenBehaelter(10,100,"Kaffee");
    private static ZutatenBehaelter KakaoBe = new ZutatenBehaelter(10,100,"Kakao");
    private static ZutatenBehaelter ZuckerBe = new ZutatenBehaelter(10,100,"Zucker");
    private static ZutatenBehaelter MilchBe = new ZutatenBehaelter(10,100,"Milch");
    private static AbfallBehaelter abfallBe = new AbfallBehaelter(0,100);


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean machineAn = true;
        System.out.println("""
                [1] Kaffe Schwartz\s
                [2] Kaffee Zucker\s
                [3] Kaffee Milch\s
                [4] Kaffee Milch/Zucker\s
                [5] Kakao\s
                [0] Machine Auschalten""");
        while (machineAn){
            System.out.println("Gaben sie ihre wahl ein: ");
            int x = sc.nextInt();

            switch (x) {
                case 0: machineAn = false;
                break;
                case 1: getraenkErstellen(Rezept.KAFFEESCHWARZ);
                break;
                case 2: getraenkErstellen(Rezept.KAFFEEZUCKER);
                break;
                case 3: getraenkErstellen(Rezept.KAFFEEMILCH);
                break;
                case 4: getraenkErstellen(Rezept.KAFFEEMILCHZUCKER);
                break;
                case 5: getraenkErstellen(Rezept.KAKAO);
                break;

            }
        }

        sc.close();

    }

    public static void getraenkErstellen(Rezept rezept) {
        if (WasserBe.fuellstand != 0) WasserBe.fuellstand -= rezept.getWasser();
        else System.out.println("Wasser Leer");
        if (KaffeeBe.fuellstand != 0) {
            KaffeeBe.fuellstand -= rezept.getKaffe();
            if(abfallBe.fuellstand != abfallBe.maxFuellstand)
            abfallBe.fuellstand += rezept.getKaffe();
            else System.out.println("Abfall Voll");
        }
        else System.out.println("Kaffe Leer");
        if (KakaoBe.fuellstand != 0) KakaoBe.fuellstand -= rezept.getKakao();
        else System.out.println("Kakao Leer");
        if(ZuckerBe.fuellstand != 0) ZuckerBe.fuellstand -= rezept.getZucker();
        else System.out.println("Zucker Leer");
        if(MilchBe.fuellstand != 0) MilchBe.fuellstand -= rezept.getMilch();
        else System.out.println("Milch Leer");

        System.out.println("Getränk Fertig!");
    }
}
