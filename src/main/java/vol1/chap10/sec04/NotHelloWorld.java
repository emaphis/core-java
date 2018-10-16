/*
 * Chapter 10 Graphics Programming
 * Section vol1.chap10.sec04
 */
package vol1.chap10.sec04;

import java.awt.EventQueue;
import javax.swing.*;

/**
 * Test My Component
 * @author emaphis
 */
public class NotHelloWorld {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new NotHelloWorldFrame();
         frame.setTitle("NotHelloWorld");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
