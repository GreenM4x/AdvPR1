package de.gds2.pr1_x350_GUI_Start.OwnFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class testFrame extends JFrame implements ActionListener {

    JButton jb;
    public testFrame(String title) throws HeadlessException {
        super(title);
        this.setSize(200,200);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jb = new JButton("Hello");
        jb.addActionListener(this);
        this.add(jb);

    }
    boolean test = true;
    @Override
    public void actionPerformed(ActionEvent e) {

            if(test) {
                jb.setText("bye");

            }
            test = false;
            if(!test) {
                jb.setText("hello");
                test = true;
            }


    }
}
