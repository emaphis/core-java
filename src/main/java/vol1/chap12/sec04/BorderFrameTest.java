/*
 * Chapter 12 User Interface Components
 * Section 4 Choice Components - Border Frames
 */
package vol1.chap12.sec04;


import java.awt.*;
import javax.swing.*;

/**
 * Run border frame example
 * @author emaphis
 */
public class BorderFrameTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new BorderFrame();
         frame.setTitle("Checkboxes");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }

}
