/*
 * Chapter 12 User Interface Components
 * Section 6 Layouts
 */
package vol1.chap12.sec06;

import java.awt.*;
import javax.swing.*;

/**
 * Run menu frame example
 * @author emaphis
 */
public class FontFrameTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
       //  JFrame frame = new FontFrame();
         JFrame frame = new FontFrame2();
         frame.setTitle("Fonts");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }

}
