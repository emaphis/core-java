/*
 * Chapter 11 Event handling
 * Section 2 Actions
 */
package vol1.chap11.sec02;

import java.awt.*;
import javax.swing.*;

/**
 * Run action frame example
 * @author emaphis
 */
public class ActionTest {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new ActionFrame();
         frame.setTitle("ButtonTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
