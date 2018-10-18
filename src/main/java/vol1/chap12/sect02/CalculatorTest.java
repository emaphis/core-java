/*
 * Chapter 12 User Interface Components
 * Section 2 Layout management
 */
package vol1.chap12.sect02;

import java.awt.*;
import javax.swing.*;

/**
 * Run calculator example
 * @author emaphis
 */
public class CalculatorTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new CalculatorFrame();
         frame.setTitle("A Calulator");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }

}
