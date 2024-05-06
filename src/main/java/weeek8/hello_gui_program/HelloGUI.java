package weeek8.hello_gui_program;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JFrame {
    private JPanel mainPanel;
    private JButton clickMeButton;
    private JLabel myfirstLabel;



    HelloGUI() {

        setContentPane(mainPanel);


        setPreferredSize( new Dimension(500, 500));
        // width and height weidth comes first
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // this is the method for the contents within the form
        // process will finsh when it is closed so program doesnt keep runnnig

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // entire class with method
                myfirstLabel.setText("HI Gui programmers");

            }
        });



    }



}
