package de.gds2.pr1_80_While;

import java.util.Scanner;

public class Surface {
    public static void main(String[] args) {

        int x1,x2,y1,y2;
        int lenght, width, surface;

        Scanner inputScanner = new Scanner(System.in);


        while (true){
            System.out.print("Gebe sie x1 ein: ");
            x1 = inputScanner.nextInt();
            System.out.print("Geben sie y1 ein: ");
            y1 = inputScanner.nextInt();
            System.out.print("Geben sie x2 ein: ");
            x2 = inputScanner.nextInt();
            System.out.print("Geben sie y2 ein: ");
            y2 = inputScanner.nextInt();

            lenght = Math.abs(x2 - x1);
            width = Math.abs(y2 - y1);
            surface = lenght * width;

            if (surface == 0) break;
            System.out.print("Breite: " + lenght + "\t Höhe: " + width + "\t Fläsche: " + surface + "\n");


        }
    }
}
