package de.gds2.pr1_x380_GUI_Builder;

import javax.swing.*;

public class praemenrechner extends JDialog {
    private JPanel contentPane;
    private JButton buttonRechnen;
    private JButton buttonBeenden;
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;

    public praemenrechner() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonRechnen);
    }

    public static void main(String[] args) {
        praemenrechner dialog = new praemenrechner();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
