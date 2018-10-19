/*
 * Chapter 12 User Interface Components
 * Section 4 Choice Components - Combo boxes
 */
package vol1.chap12.sec04;


import java.awt.*;
import javax.swing.*;

/**
 * Run combo box example
 * @author emaphis
 */
public class ComboBoxTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new ComboBoxFrame();
         frame.setTitle("Comboboxes");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }

}
