/*
 * Chapter 12 User Interface Components
 * Section 7 Dialogs
 */
package vol1.chap12.sec07;

import java.awt.*;
import javax.swing.*;

/**
 * Runs the dialog example.s
 * @author emaphis
 */
public class DialogFrameTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new DialogFrame();
         frame.setTitle("Dialog Example");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
