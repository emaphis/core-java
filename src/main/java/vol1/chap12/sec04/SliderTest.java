/*
 * Chapter 12 User Interface Components
 * Section 4 Choice Components - Sliders
 */
package vol1.chap12.sec04;

import java.awt.*;
import javax.swing.*;

/**
 * Run slider example
 * @author emaphis
 */
public class SliderTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new SliderFrame();
         frame.setTitle("Sliders");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }

}
