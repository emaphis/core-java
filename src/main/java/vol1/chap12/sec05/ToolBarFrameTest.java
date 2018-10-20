/*
 * Chapter 12 User Interface Components
 * Section 5 Menus
 */
package vol1.chap12.sec05;


import java.awt.*;
import javax.swing.*;

/**
 * Run menu frame example
 * @author emaphis
 */
public class ToolBarFrameTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new ToolBarFrame();
         frame.setTitle("Menus");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }

}
