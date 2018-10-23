/*
 * Chapter 12 User Interface Components
 * Section 7 Dialogs
 */
package vol1.chap12.sec07;

import java.awt.*;
import javax.swing.*;

/**
 * Runs the data exchange example
 * @author emaphis
 */
public class DataExchangeFrameTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new DataExchangeFrame();
         frame.setTitle("Data Exchange Example");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}
