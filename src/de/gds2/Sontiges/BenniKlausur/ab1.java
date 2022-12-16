package de.gds2.Sontiges.BenniKlausur;

public class ab1 {
    public static void main(String[] args) {
        String text = "Hallo ich bin ein baum";
        StringBuilder str = new StringBuilder();


        String[] txtArr = text.toLowerCase().trim().split(" ");

        for (int i = 0; i < txtArr.length; i = i + 2) {
            txtArr[i] = txtArr[i].toUpperCase();
        }

        for (String temp: txtArr) {
            str.append(temp).append(" ");
        }

        System.out.println(str);
    }
}
