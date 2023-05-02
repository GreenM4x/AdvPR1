package de.gds2.pr1_x350_GUI_Start.OwnFrame;

import javax.swing.*;
import java.awt.*;

public class TomsFrame extends JFrame{

    JLabel lb;

    public TomsFrame(String title) throws HeadlessException {
        super(title);
        this.setSize(1280,720);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());

        lb = new JLabel("Hallo ADV Wrold");
        this.add(lb);
    }

}
