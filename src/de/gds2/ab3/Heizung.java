package de.gds2.ab3;

import java.util.Scanner;

public class Heizung {
    public static int heizTemp = 20;
    public static void main(String[] args) {

        int raumTemp;
        Scanner input = new Scanner(System.in);
        raumTemp = input.nextInt();

        if (raumTemp < heizTemp) {
            System.out.println("Die heizung heizt");
        } else {
            System.out.println("Die heizung heizt nicht!");
        }


    }
}
