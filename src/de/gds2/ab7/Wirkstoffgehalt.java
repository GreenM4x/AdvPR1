package de.gds2.ab7;

public class Wirkstoffgehalt {
    final static double loss = 0.04;
    public static void main(String[] args) {

        int monate = 1;
        for (double i = 100; i >= 50; i = i - (i * loss)) {
            monate++;
            System.out.println(monate);
        }
    }
}
