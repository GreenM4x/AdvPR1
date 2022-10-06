package de.gds2.ab3;

import java.util.Scanner;

public class GeradeUngerade {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        int input = inputScanner.nextInt();

        if (input % 2 == 0){
            System.out.println("Ist gerade");
        } else System.out.println("Ist ungerade");
    }

}
