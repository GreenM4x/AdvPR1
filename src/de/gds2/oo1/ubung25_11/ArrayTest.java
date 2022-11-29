package de.gds2.oo1.ubung25_11;

import java.util.Arrays;

class ArrayTest {
    public static void main(String[] args) {

        String [] zahlenNamenArray = {"eins", "zwei"};

        test();
        for(String a : zahlenNamenArray) {
            System.out.println(a);
        }
        swap(zahlenNamenArray);
    }

    static void test (){

        String[] arrayName = new String[]{"Alles", "ganz", "anders"};
        System.out.println(Arrays.toString(arrayName));
    }

    static void swap (String[] arrayName){
        String temp = arrayName[0];
        arrayName[0] = arrayName[1];
        arrayName[1] = temp;
    }
}
