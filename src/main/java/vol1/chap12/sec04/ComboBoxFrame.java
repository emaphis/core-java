/*
 * Chapter 12 User Interface Components
 * Section 4 Choice Components - Combo boxes
 */
package vol1.chap12.sec04;

import java.awt.*;
import javax.swing.*;

/**
 * A frame with a sample text label and combo boxes for selecting a font
 * @author emaphis
 */
public class ComboBoxFrame extends JFrame {

   private JComboBox<String> faceCombo;
   private JLabel label;
   private static final int DEFAULTSIZE = 24;

   public ComboBoxFrame() {

      // add the sample text label
      label = new JLabel("The quick brown fox jumps over the lazy dog.");
      label.setFont(new Font("Serif", Font.PLAIN, DEFAULTSIZE));
      add(label, BorderLayout.CENTER);

      // make a combo box and add face names
      faceCombo = new JComboBox<>();
      faceCombo.addItem("Serif");
      faceCombo.addItem("SansSerif");
      faceCombo.addItem("Monospaced");
      faceCombo.addItem("Dialog");
      faceCombo.addItem("DialogInput");

      // This listener sets the label front to the selected face name
      faceCombo.addActionListener(event ->
         label.setFont(
               new Font(faceCombo.getItemAt(faceCombo.getSelectedIndex()),
                 Font.PLAIN, DEFAULTSIZE)));

      // add combo box to a panel at the frame's southern border
      var comboPanel = new JPanel();
      comboPanel.add(faceCombo);
      add(comboPanel, BorderLayout.SOUTH);
      pack();
   }
}
