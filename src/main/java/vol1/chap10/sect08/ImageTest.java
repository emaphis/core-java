/*
 * Chapter 10 Graphics Programming
 * Section 8 Image
 */
package vol1.chap10.sect08;


import java.awt.*;
import javax.swing.*;

/**
 * Image display App
 * @author emaphis
 */
public class ImageTest {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new ImageFrame();
         frame.setTitle("FontTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
