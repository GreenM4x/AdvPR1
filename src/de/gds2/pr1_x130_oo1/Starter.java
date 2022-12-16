package de.gds2.pr1_x130_oo1;

public class Starter {
    public static void main(String[] args) {

        Getraenk bier = new Getraenk();

        bier.setName("Tannenzäpfle");
        System.out.println(bier.getName());

        System.out.println(bier.BestellMenge());

        Auto jaguarAndi = new Auto(4, "schwarz");
        Auto jaguarAndi2 = new Auto();



    }
}
