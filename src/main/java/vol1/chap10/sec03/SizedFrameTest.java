/*
 * Chapter 10 Graphics Programming
 * Section 3 Sized Frame
 */
package vol1.chap10.sec03;

import javax.swing.*;

/**
 * Test Sized Frame class
 * @author emaphis
 */
public class SizedFrameTest {
   public static void main(String[] args) {
      JFrame frame = new Sizedframe();
      frame.setTitle("SizedFrame");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
