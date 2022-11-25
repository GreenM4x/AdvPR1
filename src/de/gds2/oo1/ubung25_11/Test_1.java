package de.gds2.oo1.ubung25_11;

import java.util.Arrays;

public class Test_1 {
    int[] myInt;

    static void change (int [] test){

        for (int i = 0; i < test.length; i++) {
            test[i] += 100;
        }
    }

    public int[] getMyInt() {
        return myInt;
    }

    public void setMyInt(int[] myInt) {
        this.myInt = myInt;
    }

    public static void main(String[] args) {
        int [] example = {2,4,6};

        Test_1 tester = new Test_1();
        tester.setMyInt(example);

        System.out.println("myInteger Array before the change was: " + Arrays.toString(tester.myInt));

        change(tester.myInt);

        System.out.println("myInt  Array after change is: " + Arrays.toString(tester.myInt));
    }
}
