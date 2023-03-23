package de.gds2.pr1_x340_Generic;

import java.util.List;
import java.util.Objects;
import java.util.Vector;

public class MAddierer {
    public static void main(String[] args) {
        Integer zahl1 = 100;
        String name = "eins";
        List myList = new Vector();

        myList.add(zahl1);
        myList.add(10);
        myList.add(15);
        //myList.add(name);
        int sum = 0;
        for (int i = 0; i< myList.size(); i++) {
            sum = sum + ((Integer) myList.get(i)).intValue();
        }

        for (Object object: myList) {
            sum = sum + ((Integer) object).intValue();
        }

        System.out.println(sum);

    }
}
