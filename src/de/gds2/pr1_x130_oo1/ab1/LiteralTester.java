package de.gds2.pr1_x130_oo1.ab1;

public class LiteralTester {

    public static void main(String[] args) {

        String str1, str2, str3, str4;
        int anzahl = 0;

        str1 = "Bo, die Katze";
        str2 = "Bo, die Katze";

        str3 = new String("Fred, der hund");
        str4 = new String("Fred, der hund");

        if (str1 == str2) {
            anzahl++;
        } else {
            anzahl = anzahl + 2;
        }

        if (str3 == str4) {
            anzahl++;

        }else {
            anzahl = anzahl + 2;
        }

        System.out.println("Es wurden " + anzahl + " Objekte erzeugt");



    }
}
