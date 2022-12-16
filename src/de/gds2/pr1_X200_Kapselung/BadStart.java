package de.gds2.pr1_X200_Kapselung;

public class BadStart {
    public static void main(String[] args) {
        Konto lisakonto = new Konto(12000, 300);
        Konto jessiskonto = new Konto(10000, 300);

        System.out.println("Lisas Kontonummer: " + lisakonto.getKontonummer());
        System.out.println("Kontostand Lisa: " + lisakonto.getKontostand());

        System.out.println("Jessicca: Kontonummer: " + jessiskonto.getKontonummer());
        System.out.println("Kontostand Jessica: " + jessiskonto.getKontostand());
    }
}
