package de.gds2.pr1_x320_Interface.intro;


public class LKW implements Driveable{

    @Override
    public void bschleunigen(double a) {
        //-> a = 0,5 m/s v = 27,8m/s
        double v = 27.8;
        double t =  v / a;
        System.out.println("Zeit von 0 auf 100km/h ist: " + t + "s");


    }

    @Override
    public void verzoegern(double a) {

    }
}
