/*
 * Chapter 11 Event handling
 * Section 3 Mouse Events
 */
package vol1.chap11.sec03;

import java.awt.*;
import javax.swing.*;

/**
 * Run action frame example
 * @author emaphis
 */
public class MouseTest {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new MouseFrame();
         frame.setTitle("ButtonTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
