/*
 * Chapter 12 User Interface Components
 * Section 6 Dialogboxes
 */
package vol1.chap12.sec07;

import vol1.chap12.sec07.OptionDialogFrame;
import java.awt.*;
import javax.swing.*;

/**
 * Run button panel example
 * @author emaphis
 */
public class OptionDialogFrameTest {

   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         JFrame frame = new OptionDialogFrame();
         frame.setTitle("Fonts");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }

}
