/*
 * Chapter 12 User Interface Components
 * Section 7 Dialogs
 */
package vol1.chap12.sec07;

import javax.swing.*;

/**
 * A frame with a a menu whose File->About action show dialogl
 * @author emaphis
 */
public class DialogFrame extends JFrame {
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;
   private AboutDialog dialog;

   public DialogFrame() {
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      var menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      var fileMenu = new JMenu("File");
      menuBar.add(fileMenu);

      // Add About and Exit menu items.

      // The About item show the About dialog
      var aboutItem = new JMenuItem("About");
      aboutItem.addActionListener(event -> {
         if (dialog == null)  // first time
            dialog = new AboutDialog(DialogFrame.this);
         dialog.setVisible(true);
      });
      fileMenu.add(aboutItem);

      // The exit item exits the program
      var exitItem = new JMenuItem("Exit");
      exitItem.addActionListener(event -> System.exit(0));
      fileMenu.add(exitItem);
   }
}
