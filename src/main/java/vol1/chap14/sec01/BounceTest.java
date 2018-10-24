/*
 * Chapter 14 Concurrency.
 * Section 1 Threads
 */
package vol1.chap14.sec01;

import java.awt.*;
import javax.swing.*;

/**
 * Shows and animated bouncing ball.
 * @author emaphis
 */
public class BounceTest {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new BounceFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
