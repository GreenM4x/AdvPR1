package de.gds2.pr1_x370_GUI_Button.AdvSchloss;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Zahlenschloss extends JFrame implements ActionListener {

    public String code = "1337";
    public String finalenter = "";
    public ArrayList<JButton> buttons = new ArrayList<>();


    public Zahlenschloss(String text) throws HeadlessException  {
        super(text);

        for (int i = 1; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(this);
            this.add(button);
            buttons.add(button);

        }

        JButton resetBtn = new JButton("Reset");
        resetBtn.addActionListener(this);
        this.add(resetBtn);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setLayout(new GridLayout(4,3));
        this.getContentPane().setBackground(Color.gray);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Reset")) {
            finalenter = "";
            this.getContentPane().setBackground(Color.gray);
            buttons.forEach(button -> button.setEnabled(true));
            return;
        } else {
            finalenter = finalenter.concat( e.getActionCommand());
        }

        if (finalenter.length() == code.length()  && !finalenter.equals(code)) {
            this.getContentPane().setBackground(Color.red);
            buttons.forEach(button -> button.setEnabled(false));

        } else if (finalenter.equals(code)){
            this.getContentPane().setBackground(Color.green);
            buttons.forEach(button -> button.setEnabled(false));
        }
        repaint();




    }
}
