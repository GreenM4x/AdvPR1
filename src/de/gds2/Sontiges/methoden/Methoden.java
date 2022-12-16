package de.gds2.Sontiges.methoden;

public class Methoden {

    private int alter;
    private String name;


    public Methoden(int alter, String name) {
        this.alter = alter;
        this.name = name;
    }

    public static void main(String[] args) {
        Methoden max = new Methoden(20,"Max");
        max.krasserBaum();
        baum();
    }

    public static void baum(){
        System.out.println("hallo baum");
    }

    private void krasserBaum(){
        System.out.println("ich bin " + name + " der krasser baum der " + alter + " jahre alt ist");
    }
}
