/*
 * Chapter 12 User Interface Components
 * Section 4 Choice Components - Radio Buttons
 */
package vol1.chap12.sec04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A frame with a sample radio buttons for selecting a font
 * @author emaphis
 */
public class RadioButtonFrame extends JFrame {

   private JPanel buttonPanel;
   private JLabel label;
   private ButtonGroup group;
   private JCheckBox italic;
   private static final int DEFAULT_SIZE = 36;

   public RadioButtonFrame() {

      // add the sample text label
      label = new JLabel("The quick brown fox jumps over the lazy dog.");
      label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
      add(label, BorderLayout.CENTER);


      // Add the check boxes
      group = new ButtonGroup();
      buttonPanel = new JPanel();

      addRadioButton("Small", 8);
      addRadioButton("Medium", 12);
      addRadioButton("Large", 18);
      addRadioButton("Extra large", 35);

      add(buttonPanel, BorderLayout.SOUTH);
      pack();
   }

   /**
    * Add a radio button that sets the font size of the sample text.
    * @param name the string to appear on the button
    * @param size the font size this button sets
    */
   public void addRadioButton(String name, int size) {
      boolean selected = (size == DEFAULT_SIZE);
      var button = new JRadioButton(name, selected);
      group.add(button);
      buttonPanel.add(button);

      // this listener set the label font size
      ActionListener listener = event ->
            label.setFont(new Font("Serif", Font.PLAIN, size));
      button.addActionListener(listener);
   }

}
