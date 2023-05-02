package de.gds2.pr1_x370_GUI_Button;

import javax.swing.*;
import java.awt.*;

public class ButtonBeispiel extends JFrame {
   JButton bSchliessen;

    public ButtonBeispiel(String text) throws HeadlessException {
        super(text);

        ImageIcon icon = new ImageIcon("src/de/gds2/pr1_x370_GUI_Button/icon.png");
        this.setLayout(new FlowLayout());
        bSchliessen = new JButton("Schliessen", new ImageIcon(icon.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT)));
        this.add(bSchliessen);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}
