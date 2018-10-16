/*
 * Chapter 10 Graphics Programming
 * Section vol1.chap10.sec02
 */
package vol1.chap10.sec02;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author emaphis
 */
public class SimpleFrameTest {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         SimpleFrame frame = new SimpleFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
