/*
 * Chapter 12 User Interface Components
 * Section 3 Text Components
 */
package vol1.chap12.sec03;


import javax.swing.*;
import java.awt.*;

/**
 * A frame with sample text components
 * @author emaphis
 */
public class TextComponentFrame extends JFrame {

   public static final int TEXTAREA_ROWS = 8;
   public static final int TEXTAREA_COLUMNS = 20;

   public TextComponentFrame() {

      var textField = new JTextField();
      var passwordField = new JPasswordField();

      var northPanel = new JPanel();
      northPanel.setLayout(new GridLayout(2, 2));
      northPanel.add(new JLabel("User Name:", SwingConstants.RIGHT));
      northPanel.add(textField);
      northPanel.add(new JLabel("Password: ", SwingConstants.RIGHT));
      northPanel.add(passwordField);

      add(northPanel, BorderLayout.NORTH);

      var textArea = new JTextArea(TEXTAREA_ROWS, TEXTAREA_COLUMNS);
      var scrollPane = new JScrollPane(textArea);

      add(scrollPane, BorderLayout.CENTER);

      // add button to append text into the text area
      var southPanel = new JPanel();
      var insertButton = new JButton("Insert");
      southPanel.add(insertButton);

      insertButton.addActionListener(event ->
         textArea.append("User name: " + textField.getText() + "\nPassword: "
                 + new String(passwordField.getPassword()) + "\n"));

      add(southPanel, BorderLayout.SOUTH);
      pack();
   }

}
