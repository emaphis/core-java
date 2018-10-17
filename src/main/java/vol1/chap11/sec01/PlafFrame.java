/*
 * Chapter 11 Event Handling
 * Section 1 Events
 */
package vol1.chap11.sec01;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Change Platform Look-and-Feels.
 * @author emaphis
 */
public class PlafFrame extends JFrame {
   private final JPanel buttonPanel;

   public PlafFrame() {
      buttonPanel = new JPanel();

      UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();

      for (UIManager.LookAndFeelInfo info : infos) {
         makeButton(info.getName(), info.getClassName());
      }

      add(buttonPanel);
      pack();
   }

   /**
    * Makes a button to change the pluggable look-and-feel
    * @param name the button name - the name of the look and feel
    * @param className the name of the look-and=feel class
    */
   private void makeButton(String name, String className) {

      // add button to panel
      JButton button = new JButton(name);
      buttonPanel.add(button);

      // set button action
      button.addActionListener(event -> {
         // button action: switch to the new lool-and-feel
         try {
            UIManager.setLookAndFeel(className);
            SwingUtilities.updateComponentTreeUI(this);
            pack();
         } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.err.println("Exception: " + e.getMessage());
         }
      });
   }
}
