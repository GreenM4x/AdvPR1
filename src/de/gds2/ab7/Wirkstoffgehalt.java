package de.gds2.ab7;

public class Wirkstoffgehalt {

    final static double loss = 0.04;
    public static void main(String[] args) {

        int monate = 0;
        for (double i = 100; i >= 50; i = i - (i * loss)) {
            System.out.println(monate);
            monate++;
        }
    }
}
