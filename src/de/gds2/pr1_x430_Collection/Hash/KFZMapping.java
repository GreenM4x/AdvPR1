package de.gds2.pr1_x430_Collection.Hash;

import java.util.HashMap;

public class KFZMapping {

    private static HashMap<String, String> map = new HashMap<String, String>();

    public static void insert(String kennzeischen, String landKreis) {
        map.put(kennzeischen, landKreis);

    }

    public static void remove(String kennzeischen) {
        map.remove(kennzeischen);
    }

    public static void printLandkreis(String kennzeischen) {
        System.out.println(map.get(kennzeischen));
    }

    public static void main(String[] args) {

        insert("s", "Stuttgart");
        insert("BB", "Böblingen");

        printLandkreis("BB");
    }


}
