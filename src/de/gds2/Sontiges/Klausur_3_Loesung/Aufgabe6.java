package de.gds2.Sontiges.Klausur_3_Loesung;

public class Aufgabe6 {

    public static void main(String[] args) {
        String beispiel = "Zes or zes Yoo zing and zang";
        printTauschYZ(beispiel);

    }

    private static void printTauschYZ(String string){

        char oldChar;
        StringBuilder nStrb = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {

            oldChar = string.charAt(i);

            switch (oldChar) {
                case 'Y' -> oldChar = 'Z';
                case 'Z' -> oldChar = 'Y';
                case 'y' -> oldChar = 'z';
                case 'z' -> oldChar = 'y';
                default -> {
                }
            }

            nStrb.append(oldChar);

        }

        System.out.println(nStrb);
    }
}
