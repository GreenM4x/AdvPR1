package de.gds2.pr1_x130_oo1.String;

import java.util.Date;

public class funktionen {

    public static void main(String[] args) {

        //Add (Concat)
        String s1 = "das Aktuelle datum ist: ";
        String s2 = new Date().toString();
        String s3 = s1.concat(s2);

        System.out.println(s3);

        //Replace
        String s4 = "Grünes Krokodil";

        String s5 = s4.replace('o', 'a');
        System.out.println(s5); // Grünes Krakadil

        String s6 = s4.replace("s Krokodil", "r Frosch");
        System.out.println(s6); //Grüner Frosch


    }
}
