package weeek8.currency_conventer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConventer extends JFrame {


    private JPanel mainPanel;
    private JTextField dollarstextfield;
    private JButton convertButton;
    private JLabel EuroResultLabel;


    private double DollarstoEuros = 0.84;
    private final String EUROS = "Euros";
    private  final String POUNDS = "Pounds";

    private Map<String, Double> exchangeRates =Map.of(EUROS, 0.84, POUNDS, 0.75);




    CurrencyConventer() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(300, 300));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // WE need to figure out all componets
                String dollarString = dollarstextfield.getText();

                try {
                    double dollars = Double.parseDouble(dollarString);
                    double euros = dollars + DollarstoEuros;
                    String resultString = String.format("%.2f dollars is equivalent to %2f euros", dollars, euros);

                    EuroResultLabel.setText(resultString);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(CurrencyConventer.this, "Please enter without and $ or other characters");
                }

            }

        });
    }
}


