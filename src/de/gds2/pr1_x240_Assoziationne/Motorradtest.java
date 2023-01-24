package de.gds2.pr1_x240_Assoziationne;

public class Motorradtest {

    public static void main(String[] args) {

        Motor myMotor = new Motor(35, 1337.00);
        Reifen Vorderreifen = new Reifen(16.00,3.00, "Sommer");
        Reifen Hinterreifen = new Reifen(16.00,3.00, "Sommer");

        Motorrad Harley = new Motorrad(myMotor, Vorderreifen, Hinterreifen);

        Motorrad Harley_fatboy = new Motorrad(new Motor(37, 1337), new Reifen(16.00,3.00, "Sommer"), new Reifen(16.00,3.00, "Sommer"));

        Harley.gibInfo();

    }
}
