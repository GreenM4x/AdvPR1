package de.gds2.pr1_x270_Rekursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int finalout = 0;
        System.out.print("Eingabe:");
        Scanner inputScanner = new Scanner(System.in);
        int n = inputScanner.nextInt();

        finalout = calcFib(n);

        System.out.println(finalout);

    }

    private static int calcFib(int n) {
        int result = 0;
        if (n == 0 || n == 1) {
            result = 1;
        } else {
            int result1 = calcFib(n-1);
            int result2 =  + calcFib(n-2);
            result = result1 + result2;

        }
        return result;
    }
}
