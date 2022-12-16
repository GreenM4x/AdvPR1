package de.gds2.pr1_x190_strings_bearbeiten;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Aufgabe {

    public static String[] geheimWorte = {"is", "bombe", "gummibärchen"};
    public static void main(String[] args) {
        mitToken();

    }

    private static void mitToken(){
        System.out.println("Telefonatstranscript: ");

        Scanner inputScanner = new Scanner(System.in);
        String inputText = inputScanner.nextLine();

        StringTokenizer st = new StringTokenizer(inputText.toLowerCase().trim(), " ");

        boolean terrorWord = false;
        boolean currendTerr = false;

        StringBuilder str = new StringBuilder();

        while (st.hasMoreTokens()){
            String word = st.nextToken();

            for (String tempText : geheimWorte) {
                if (tempText.equals(word)) {
                    terrorWord = true;
                    currendTerr = true;
                    break;
                }

                if (!currendTerr) {
                    str.append(word).append(" ");
                }
                currendTerr = false;

            }
        }

        if (terrorWord) System.out.println("Du bist böse");
        else System.out.println("Du bist ein guter");

        System.out.println(str);

    }

    private static void ohneToken(){
        System.out.println("Telefonatstranscript: ");

        Scanner inputScanner = new Scanner(System.in);

        String inputText = inputScanner.nextLine();
        

        String[] textArr01 = inputText.toLowerCase().trim().split(" ");
        int badCount = 0;

        for (String worte: textArr01) {
            if (Arrays.asList(geheimWorte).contains(worte)) {
                badCount++;
            }
        }

        System.out.println("Es wurden " + badCount +" Key Wörter gefunden");
        if (badCount != 0) System.out.println("Du bist böse!");
    }
}
