/*
 * Chapter 12 User Interface Components
 * Section 4 Choice Components - Check boxes
 */
package vol1.chap12.sec04;


import java.awt.*;
import javax.swing.*;

/**
 * Run check box example
 * @author emaphis
 */
public class CheckBoxTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new CheckBoxFrame();
         frame.setTitle("Checkboxes");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }

}
