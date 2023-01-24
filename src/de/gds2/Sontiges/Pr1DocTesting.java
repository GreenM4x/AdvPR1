package de.gds2.Sontiges;

import java.util.StringTokenizer;

public class Pr1DocTesting {

    public static void main(String[] args) {

        String newStr = "Test String";
        StringTokenizer NewStrT = new StringTokenizer(newStr);

        while (NewStrT.hasMoreTokens()){
            String word = NewStrT.nextToken();
            System.out.println(word);
            // Ausagbe1 : Test
            // Ausgabe2 : String

        }

    }
}
