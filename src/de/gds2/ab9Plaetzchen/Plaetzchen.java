package de.gds2.ab9Plaetzchen;

public class Plaetzchen {

    private String sorte;
    private String groesse;
    private String form;

    private boolean verzierung;

    public void ausgabe(){
        String s;

        if (verzierung) {
            s = "Ja";
        } else {
            s = "Nein";
        }
        System.out.println(sorte + ", " + groesse + ", " + form + ", " + s);

    }


    public static void main(String[] args) {

        //Standardkontruktor
        Plaetzchen plaetzchen01 = new Plaetzchen();
        plaetzchen01.sorte = "Kokos";
        plaetzchen01.groesse = "mittel";
        plaetzchen01.form = "rund";
        plaetzchen01.verzierung = true;

        Plaetzchen plaetzchen02 = new Plaetzchen();
        plaetzchen02.sorte = "Irgendwas";
        plaetzchen02.groesse = "klein";
        plaetzchen02.form = "stern";
        plaetzchen02.verzierung = false;

        System.out.println("+++ Plaetzchenliste +++");

        plaetzchen01.ausgabe();
        plaetzchen02.ausgabe();
    }


}
