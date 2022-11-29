package de.gds2.oo1.ubung25_11;

class ArrayTest {
    public static void main(String[] args) {

        String [] zahlenNamenArray = {"eins", "zwei"};

        test(zahlenNamenArray);
        for(String a : zahlenNamenArray) {
            System.out.println(a);
        }
    }

    static void test (String[] arrayName){

        arrayName = new String[] {"Alles", "ganz", "anders"};
    }

    static void swap (String[] arrayName){
        String temp = arrayName[0];
        arrayName[0] = arrayName[1];
        arrayName[1] = temp;
    }
}
