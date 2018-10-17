/*
 * Chapter 11 Even Handling
 * Section 1 Events
 */
package vol1.chap11.sec01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * A frame with a button panel
 * @author emaphis
 */
public class ButtonFrame extends JFrame {
   private final JPanel buttonPanel;
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   public ButtonFrame() {
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      // create buttons
      JButton yellowButton = new JButton("Yellow");
      JButton blueButton = new JButton("Blue");
      JButton redButton = new JButton("Red");

      buttonPanel = new JPanel();

      // add buttons to panel
      buttonPanel.add(yellowButton);
      buttonPanel.add(blueButton);
      buttonPanel.add(redButton);

      // add panel to frame
      add(buttonPanel);

      // create button actions
      ColorAction yellowAction = new ColorAction(Color.YELLOW);
      ColorAction blueAction = new ColorAction(Color.BLUE);
      ColorAction redAction = new ColorAction(Color.RED);

      // associate actions wiht buttons
      yellowButton.addActionListener(yellowAction);
      blueButton.addActionListener(blueAction);
      redButton.addActionListener(redAction);
   }

   /**
    * An action listener that sets the panel's background color.
   */
   private class ColorAction implements ActionListener {
      private final Color backgroundColor;

      public ColorAction(Color c) {
         backgroundColor = c;
      }

      @Override
      public void actionPerformed(ActionEvent e) {
         buttonPanel.setBackground(backgroundColor);
      }
   }

}
