/*
 * Chapter 10 Graphics Programming
 * Section 5 Working with 2D drawing
 */
package vol1.chap10.sec05;

import java.awt.*;
import javax.swing.*;

/**
 * 2D Shapes
 * @author emaphis
 */
public class DrawTest {
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new DrawFrame();
         frame.setTitle("DrawTest");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //frame.setSize(400, 400);
         frame.setVisible(true);
      });
   }
}
