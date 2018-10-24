/*
 * Chapter 14 Concurrency.
 * Section 1 Threads
 */
package vol1.chap14.sec01;

import java.awt.*;
import javax.swing.*;

/**
 * Show animated bouncing balls
 * @author emaphis
 */
public class BounceThreadTest {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new BounceFrame2();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
