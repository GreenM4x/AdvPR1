package de.gds2.oo1.Statisch;

import java.awt.Point;

public class Parameteruebergabe {

    public static void main(String[] args) {

        Point pointA = new Point();
        Point pointB = new Point(85,51);

        pointA.move(45,82);

        pointB.move(24-12, 34*3 - 45);

        int x = 87;
        int y = 55;

        pointA.move(x,y);

        pointB.move(x - 4, y*2 + 34);

        pointB.move((int) 14.132, (int) (35.8 - 12.6));
        System.out.println("new Pos: " + pointB);
    }

}
