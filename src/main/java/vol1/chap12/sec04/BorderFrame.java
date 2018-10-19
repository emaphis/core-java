/*
 * Chapter 12 User Interface Components
 * Section 4 Choice Components - Border Frame
 */
package vol1.chap12.sec04;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * A frame with a sample radio buttons selecting a border frame style
 * @author emaphis
 */
public class BorderFrame extends JFrame {

   private JPanel demoPanel;
   private JPanel buttonPanel;
   private ButtonGroup group;

   public BorderFrame() {

      demoPanel = new JPanel();
      buttonPanel = new JPanel();
      group = new ButtonGroup();

      addRadioButton("Lowered bevel", BorderFactory.createLoweredBevelBorder());
      addRadioButton("Raised bevel", BorderFactory.createRaisedBevelBorder());
      addRadioButton("Etched", BorderFactory.createEtchedBorder());
      addRadioButton("Line", BorderFactory.createLineBorder(Color.BLUE));
      addRadioButton("Matte", BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLUE));
      addRadioButton("Empty", BorderFactory.createEmptyBorder());

      Border etched = BorderFactory.createEtchedBorder();
      Border titled = BorderFactory.createTitledBorder(etched, "Border types");
      buttonPanel.setBorder(titled);

      setLayout(new GridLayout(2, 1));
      add(buttonPanel);
      add(demoPanel);
      pack();
   }

   /**
    * Add a radio button that sets the border style of the sample border.
    * @param buttonName name of style to select
    * @param b border style
    */
   public void addRadioButton(String buttonName, Border b) {
      var button = new JRadioButton(buttonName);
      button.addActionListener(event -> demoPanel.setBorder(b));
      group.add(button);
      buttonPanel.add(button);
   }

}
