package weeek8.movie_gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class moviegui extends JFrame {
    private JPanel mainPanel;
    private JLabel MovieTitleTextField;
    private JCheckBox WouldSeeAgainCheckbox;
    private JLabel OpinionLabel;
    private JSlider RatingSlider;
    private JLabel SliderValue;
    private JTextField movieTitleTextField;


    moviegui() {
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        configureEventHandlers();
    }

    private void configureEventHandlers() {
       RatingSlider.addChangeListener(new ChangeListener() {
           @Override
           public void stateChanged(ChangeEvent e) {
               String valueLabelText = RatingSlider.getValue() +"Stars";
               SliderValue.setText(valueLabelText);
               updateOpinion();
           }
       });
       WouldSeeAgainCheckbox.addChangeListener(new ChangeListener() {
           @Override
           public void stateChanged(ChangeEvent e) { updateOpinion();}{



           }
       });
       movieTitleTextField.getDocument().addDocumentListener(new DocumentListener() {
           @Override
           public void insertUpdate(DocumentEvent e) {
               updateOpinion();
           }

           @Override
           public void removeUpdate(DocumentEvent e) {
          updateOpinion();
           }

           @Override
           public void changedUpdate(DocumentEvent e) {

           }
       });

    }

  private void updateOpinion() {
        String title = movieTitleTextField.getText();
        if (title.trim().length() == 0) {
            OpinionLabel.setText("Enter A movie title");

        }
        else {
            int rating = RatingSlider.getValue();
            boolean seeAgain = WouldSeeAgainCheckbox.isSelected();

            String template = "You rated %s $d stars. you %s see again";
            String seeAgainStr = seeAgain ? "Would" : "would not";
            String opnion = String.format(template, title,rating,seeAgainStr);
            OpinionLabel.setText(opnion);
        }

  }
}
