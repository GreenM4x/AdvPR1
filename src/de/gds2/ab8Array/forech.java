package de.gds2.ab8Array;

import java.util.Arrays;

public class forech {
    public static void main(String[] args) {

        int [] testArray = {3, 6, 21, 78};

        for (int i: testArray) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(testArray));
    }
}
