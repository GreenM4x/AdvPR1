package de.gds2.oo1.ab2;

import de.gds2.oo1.MethodenBsp;

public class Start {
    public static void main(String[] args) {

        MethodenBsp.schreibeLog("Das ist mein Logfile");
        Artikel bowl = new Artikel();

        bowl.setBezeichnung("Julius Caesar Bowl");
        bowl.setPreis(10.95);

        System.out.println("Sie habe folgendes bestellt:");
        System.out.println(bowl.getBezeichnung());
        System.out.println("Kosten: " + bowl.getPreis());
    }
}
