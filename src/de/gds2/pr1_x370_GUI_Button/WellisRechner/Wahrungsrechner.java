package de.gds2.pr1_x370_GUI_Button.WellisRechner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Wahrungsrechner extends JFrame implements ActionListener {

    JComboBox currencyList;
    JTextField tfSingDo;
    JLabel euLabel;
    JTextField tfEu;

    double euro = 0;
    double newCurrency = 0;

    String[] currencysStrings = { "Dollar", "Yen", "Pound", "Bath"};



    public Wahrungsrechner(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        currencyList = new JComboBox(currencysStrings);
        currencyList.setSelectedIndex(3);
        currencyList.addActionListener(this);
        this.add(currencyList);

        tfSingDo = new JTextField("", 15);
        tfSingDo.setForeground(Color.BLUE);
        // Hintergrundfarbe wird gesetzt
        tfSingDo.setBackground(Color.WHITE);
        this.add(tfSingDo);

        euLabel = new JLabel("Betrag in Euro");
        this.add(euLabel);


        tfEu = new JTextField("", 15);
        tfEu.setForeground(Color.BLUE);
        // Hintergrundfarbe wird gesetzt
        tfEu.setBackground(Color.WHITE);
        this.add(tfEu);

        JButton buttonOK = new JButton("Umrechnen");
        buttonOK.addActionListener(this);
        this.add(buttonOK);



        this.setLayout(new GridLayout(5,1));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String currendCurrency = String.valueOf(currencyList.getSelectedItem());

        if (e.getActionCommand().equals("Umrechnen")) {
            try {
                if (tfEu.getText().replace(" ", "").equals("") && !(tfSingDo.getText().replace(" ", "").equals(""))) {
                    this.getContentPane().setBackground(Color.white);
                    newCurrency = Double.parseDouble(tfSingDo.getText());
                    euro = toEruo(currendCurrency);
                    DecimalFormat dc = new DecimalFormat("#0.00");


                    tfEu.setText(dc.format(euro).replace(",", "."));
                    tfSingDo.setText("");

                } else if (!(tfEu.getText().replace(" ", "").equals("")) && (tfSingDo.getText().replace(" ", "").equals(""))) {

                    this.getContentPane().setBackground(Color.white);

                    euro = Double.parseDouble(tfEu.getText());
                    newCurrency = fromEruo(currendCurrency);
                    DecimalFormat dc = new DecimalFormat("#0.00");


                    tfEu.setText("");
                    tfSingDo.setText(dc.format(newCurrency).replace(",", "."));


                }


            } catch (Exception exception) {
                tfEu.setText("");
                tfSingDo.setText("");
                this.getContentPane().setBackground(Color.red);
                System.out.println(exception);
            }
        }

    }

    public double toEruo(String currency) {
        double value = switch (currency) {
            case "Dollar" -> newCurrency * Currency.DOLLART.Getvallue();
            case "Yen" -> newCurrency * Currency.YEN.Getvallue();
            case "Pound" -> newCurrency * Currency.POUND.Getvallue();
            case "Bath" -> newCurrency * Currency.BATH.Getvallue();
            default -> 0;
        };

        return value;
    }

    public double fromEruo(String currency) {
        double value = switch (currency) {
            case "Dollar" -> euro / Currency.DOLLART.Getvallue();
            case "Yen" -> euro / Currency.YEN.Getvallue();
            case "Pound" -> euro / Currency.POUND.Getvallue();
            case "Bath" -> euro / Currency.BATH.Getvallue();
            default -> 0;
        };

        return value;
    }


}
