package de.gds2.ab3if;

import java.util.Scanner;

public class Spannung {
    public static double unterGrenze = 4.3;
    public static double oberGrenze = 5.3;

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        double input = inputScanner.nextDouble();

        if (input < unterGrenze && input > oberGrenze){
            System.out.println("ist ok");
        } else System.out.println("ist nicht ok");
    }
}
