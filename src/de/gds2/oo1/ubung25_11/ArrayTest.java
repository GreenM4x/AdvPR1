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
}
