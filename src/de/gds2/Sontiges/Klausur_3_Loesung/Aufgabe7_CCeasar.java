package de.gds2.Sontiges.Klausur_3_Loesung;

public class Aufgabe7_CCeasar {
    public static void main(String[] args) {
        entschluesseln("mzwwfbjnmsfhmyxkjwnjs", 5);
    }

    private static void entschluesseln(String strCodiert, int rotation) {
        StringBuilder newStr = new StringBuilder();
        //ascii 97 bis 122 = a bis z
        for (int i = 0; i < strCodiert.length(); i++) {
            int charOfCode = strCodiert.charAt(i);
            charOfCode = charOfCode - rotation;

            if (charOfCode < 97) {
               int newChatAtInt = 122 - (96 - charOfCode);
               char finalChar = (char) newChatAtInt;
               newStr.append(finalChar);
            }
            else {
                char finalChar = (char) charOfCode;
                newStr.append(finalChar);
            }
        }

        System.out.println(newStr);

    }
}
