/*
 * Chapter 12 User Interface Components
 * Section 7 Dialogs
 */
package vol1.chap12.sec07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A frame with a a menu whose File->About action shows a password dialog.
 * @author emaphis
 */
public class DataExchangeFrame extends JFrame {
   private static final int TEXT_ROWS = 20;
   private static final int TEXT_COLUMNS = 40;
   private PasswordChooser dialog = null;
   private final JTextArea textArea;

   public DataExchangeFrame() {

      // constuct a File menu
      var menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      var fileMenu = new JMenu("File");
      menuBar.add(fileMenu);

      // Add Connect and Exit menu items.

      // The About item show the About dialog
      var connectItem = new JMenuItem("Connect");
      connectItem.addActionListener(new ConnectAction());
      fileMenu.add(connectItem);

      // The exit item exits the program
      var exitItem = new JMenuItem("Exit");
      exitItem.addActionListener(event -> System.exit(0));
      fileMenu.add(exitItem);

      textArea = new JTextArea(TEXT_ROWS, TEXT_COLUMNS);
      add(new JScrollPane(textArea), BorderLayout.CENTER);
      pack();
   }


   /**
    * The Connect action pops up the password dialog.
    */
   private class ConnectAction implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent event) {
         // if first time, constuct dialog
         if (dialog == null) dialog = new PasswordChooser();

         // set default values
         dialog.setUser(new User("yourname", null));

         // pop up dialog
         if (dialog.showDialog(DataExchangeFrame.this, "Connect")) {
            // if accepted, retrieve user input
            User u = dialog.getUser();
            textArea.append("user name = " + u.getName() + ", password = "
               + (new String(u.getPassword())) + "\n");
         }
      }

   }
}

