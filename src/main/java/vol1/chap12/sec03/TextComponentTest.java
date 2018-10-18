/*
 * Chapter 12 User Interface Components
 * Section 3 Text Component
 */
package vol1.chap12.sec03;

import java.awt.*;
import javax.swing.*;

/**
 * Run text component example
 * @author emaphis
 */
public class TextComponentTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new TextComponentFrame();
         frame.setTitle("Text Component");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }

}
