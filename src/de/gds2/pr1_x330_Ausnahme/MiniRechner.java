package de.gds2.pr1_x330_Ausnahme;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniRechner {
    public static void main(String[] args) {

        try {
            Rechner();
        }
        catch (InputMismatchException ex){
            System.out.println("***************Catch 01****************");
            String name = ex.getClass().getName();
            System.out.println("Name: " + name);
            Rechner();

        }
        catch (ArithmeticException ey){
            System.out.println("***************Catch 02****************");
            String msg = ey.getMessage();
            System.err.println("Message: " + msg);
            System.out.println("Try again");
            Rechner();
        }
        catch (Exception e){
            System.out.println("***************Catch****************");
            e.printStackTrace();
            Rechner();
        }
    }

    public static void Rechner(){
        double zaehler, nenner, divison;
        Scanner sc = new Scanner(System.in);
        System.out.println("Division zweier int-Zahlen");
        System.out.println("**********************");
        System.out.println("Bitte geben Sie den Zähler ein: ");
        zaehler = sc.nextInt();
        System.out.println("Bitte geben Sie den Nenner ein: ");
        nenner = sc.nextInt();
        divison = zaehler / nenner;
        System.out.println("Ergebnis aus " + zaehler + " / "
                + nenner + " = " + divison);
        sc.close();
    }
}
