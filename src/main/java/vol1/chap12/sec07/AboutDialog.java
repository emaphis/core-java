/*
 * Chapter 12 User Interface Components
 * Section 7 Dialogs
 */
package vol1.chap12.sec07;

import java.awt.*;
import javax.swing.*;

/**
 * A sample modal dialog that displays a message and waits for the user to
 * click the OK button.
 * @author emaphis
 */
public class AboutDialog extends JDialog {

   public AboutDialog(JFrame owner) {
      super(owner, "About Dialog Test", true);

      // add HTML label to center
      add(new JLabel ("<html><h1><i>Core Java</i></h1><hr> By Cay Horstmann</html"),
            BorderLayout.CENTER);

      // OK button closes the dialog
      var ok = new JButton("OK");
      ok.addActionListener(event -> setVisible(false));

      // add OK button to southern border
      var panel = new JPanel();
      panel.add(ok);
      add(panel, BorderLayout.SOUTH);

      pack();
   }
}
