package de.gds2.pr1_x350_GUI_Start.Uhr;

import javax.swing.*;
import java.util.Date;

public class UhrAnwender {

    public static void main(String[] args) {
        JFrame maxFrame = new JFrame("Uhrzeit in der Adv");


        //maxFrame.setSize(1280,720);
        maxFrame.setBounds(50,50,1280,720);
        maxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();

        JLabel uhrzeitLabel = new JLabel(String.format("", new Date()));
        label.setText("Die Uhrzeit ist: ");
        maxFrame.add(label);
        maxFrame.add(uhrzeitLabel);

        maxFrame.setVisible(true);



        while (true) {
            maxFrame.setTitle(String.format("%tZ", new Date()));
        }
    }


}
