/*
 * Chapter 11 Event handleing
 * Section 1 Events
 */
package vol1.chap11.sec01;

import java.awt.*;
import javax.swing.*;

/**
 * Run Plaf Frame example
 * @author emaphis
 */
public class PlafFrameTest {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new PlafFrame();
         frame.setTitle("Platform Look-andFeel Test");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
