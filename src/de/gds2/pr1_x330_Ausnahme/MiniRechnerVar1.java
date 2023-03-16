package de.gds2.pr1_x330_Ausnahme;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MiniRechnerVar1 {
    public static void main(String[] args) {
        double zaehler, nenner, division;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Division zweier int-Zahlen");
            System.out.println("**********************");
            System.out.println("Bitte geben Sie den Zähler ein: ");
            zaehler = sc.nextDouble();
            System.out.println("Bitte geben Sie den Nenner ein: ");
            nenner = sc.nextDouble();
            division = berechneDivision(zaehler, nenner);

        }catch (InputMismatchException ex){
            System.out.println("***************Catch 01****************");
            String name = ex.getClass().getName();
            System.out.println("Name: " + name);

        }
        catch (ArithmeticException ey){
            System.out.println("***************Catch 02****************");
            String msg = ey.getMessage();
            System.out.println("Message: " + msg);
            System.out.println("Try again");

        }
        catch (Exception e){
            System.out.println("***************Catch****************");
            e.printStackTrace();
        }
    }

    private static double berechneDivision(double zaehler, double nenner) {
        double division = 0.0;
        String fehlermdelung = "Durch null teilen geht net";
        if (nenner == 0.0){
            throw new ArithmeticException(fehlermdelung);
        } else {
        division = zaehler / nenner;
        return division;
        }
    }


}
