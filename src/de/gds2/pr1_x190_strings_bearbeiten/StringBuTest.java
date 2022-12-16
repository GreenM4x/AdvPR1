package de.gds2.pr1_x190_strings_bearbeiten;

public class StringBuTest {
    public static void main(String[] args) {
        kurz();
        lange();

    }

    public static void lange(){
        long startTime = System.nanoTime();
         String str = "";
        for (int i = 0; i < 100000; i++) {
            str = str.concat(String.valueOf(i));

        }
        System.out.println("Fertig String");
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration / 1000000);
    }

    public static void kurz(){
        long startTime = System.nanoTime();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 100000; i++) {
            str.append(i);
        }

        System.out.println("Fertig Builder");
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration / 1000000);
    }
}
