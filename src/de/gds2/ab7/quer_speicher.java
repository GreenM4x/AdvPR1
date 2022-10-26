package de.gds2.ab7;

public class quer_speicher {

    public static void main(String[] args) {
        {
        int m = 13, n = 2, z = 0;
        m = m + n;

        {
            double x;
            x = m / n;
            int i = (int) x;
            z = i - n;
        }
        n++;
        int h = n + 1;
    }
}
}
