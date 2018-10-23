/*
 * Chapter 12 User Interface Components
 * Section 7 Dialogs
 */
package vol1.chap12.sec07;

import java.awt.*;
import javax.swing.*;

/**
 * A password chooser that is shown in a dialog
 * @author emaphis
 */
public class PasswordChooser extends JPanel {
   private final JTextField username;
   private final JPasswordField password;
   private final JButton okButton;
   private boolean ok;
   private JDialog dialog;

   public PasswordChooser() {
      setLayout(new BorderLayout());

      // construtc a panel with user name and password fields
      var panel = new JPanel();
      panel.setLayout(new GridLayout(2 ,2));
      panel.add(new JLabel("User name:"));
      panel.add(username = new JTextField(""));
      panel.add(new JLabel("Password:"));
      panel.add(password = new JPasswordField(""));
      add(panel, BorderLayout.CENTER);

      // create OK and Cancel buttons that terminate the dialog
      okButton = new JButton("Ok");
      okButton.addActionListener(event -> {
         ok = true;
         dialog.setVisible(false);
      });

      var cancelButton = new JButton("Cancel");
      cancelButton.addActionListener(event -> dialog.setVisible(false));

      // add butons to southern border
      var buttonPanel = new JPanel();
      buttonPanel.add(okButton);
      buttonPanel.add(cancelButton);
      add(buttonPanel, BorderLayout.SOUTH);
   }

   /**
    * Set the dialog defaults
    * @param u the default user information
    */
   public void setUser(User u) {
      username.setText(u.getName());
   }

   /**
    * Gets the dialog entries
    * @return a User object whose state represents the dialog entries.
    */
   public User getUser() {
      return new User(username.getText(), password.getPassword());
   }

   /**
    * Show the chooser panel in a dialog
    * @param parent a component in the owner frame or null
    * @param title the dialog window title
    * @return
    */
   public boolean showDialog(Component parent, String title) {
      ok = false;

      // locate the owner frame
      Frame owner = null;
      if (parent instanceof Frame)
         owner = (Frame) parent;
      else
         owner = (Frame) SwingUtilities.getAncestorOfClass(Frame.class, parent);

      // if first time, or if owner has changed. make a new dialog
      if (dialog == null || dialog.getOwner() != owner) {
         dialog = new JDialog(owner, true);
         dialog.add(this);
         dialog.getRootPane().setDefaultButton(okButton);
         dialog.pack();
      }

      // set title and show dialog
      dialog.setTitle(title);
      dialog.setVisible(true);
      return ok;
   }
}
