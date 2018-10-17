/*
 * Chapter 11 Event handleing
 * Section 1 Events
 */
package vol1.chap11.sec01;

import java.awt.*;
import javax.swing.*;

/**
 * Run button frame example
 * @author emaphis
 */
public class ButtonTest {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new ButtonFrame();
         frame.setTitle("ButtonTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
