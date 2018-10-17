/*
 * Chapter 10 Graphics Programming
 * Section 7 Fonts
 */
package vol1.chap10.sec07;

import java.awt.*;
import javax.swing.*;

/**
 * Font App
 * @author emaphis
 */
public class FontTest {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new FontFrame();
         frame.setTitle("FontTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
