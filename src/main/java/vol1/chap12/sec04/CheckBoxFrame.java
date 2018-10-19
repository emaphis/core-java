/*
 * Chapter 12 User Interface Components
 * Section 4 Choice Components - Check boxes
 */
package vol1.chap12.sec04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A frame with a sample text label and check boxes for selecting a font
 * @author emaphis
 */
public class CheckBoxFrame extends JFrame {

   private JLabel label;
   private JCheckBox bold;
   private JCheckBox italic;
   private static final int FONTSIZE = 24;

   public CheckBoxFrame() {

      // add the sample text label
      label = new JLabel("The quick brown fox jumps over the lazy dog.");
      label.setFont(new Font("Serif", Font.BOLD, FONTSIZE));
      add(label, BorderLayout.CENTER);

      // This listener set the font attribute of
      // the label to the check box state
      ActionListener listener = event -> {
         int mode = 0;
         if (bold.isSelected()) mode += Font.BOLD;
         if (italic.isSelected()) mode += Font.ITALIC;
         label.setFont(new Font("Serif", mode, FONTSIZE));
      };

      // Add the check boxes
      var buttonPanel = new JPanel();

      bold = new JCheckBox("Bold");
      bold.addActionListener(listener);
      bold.setSelected(true);
      buttonPanel.add(bold);

      italic = new JCheckBox("Italic");
      italic.addActionListener(listener);
      buttonPanel.add(italic);

      add(buttonPanel, BorderLayout.SOUTH);
      pack();
   }
}
