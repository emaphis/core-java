/*
 * Chapter 12 User Interface Components
 * Section 4 Choice Components - Radio Buttons
 */
package vol1.chap12.sec04;


import java.awt.*;
import javax.swing.*;

/**
 * Run radio button example
 * @author emaphis
 */
public class RadioButtonTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new RadioButtonFrame();
         frame.setTitle("Checkboxes");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }

}
