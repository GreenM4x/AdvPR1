package de.gds2.ab6;

public class Pyramide {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i=i+1) {
            for (int j = 10 - i; j >= 0; j=j-1) {
                System.out.print(j + " ");

            }
            System.out.println(" ");
        }
    }
}
