/*
 * Chapter 12 User Interface Components
 * Section 6 Cutom Layouts
 */
package vol1.chap12.sec06;

import java.awt.*;
import javax.swing.*;

/**
 * Run circle layout example
 * @author emaphis
 */
public class CircleLayoutTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new CircleLayoutFrame();
         frame.setTitle("Circle Layot");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }

}
