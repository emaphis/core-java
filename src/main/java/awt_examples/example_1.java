/*
 * A few AWT examples
 */
package awt_examples;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Just a Frame.
 * @author emaphis
 */
public class example_1 {
   public static void main(String[] args) {
      Frame frame = new Frame();
      // exit when the frame is closed
      frame.addWindowListener(new WindowAdapter()
      {
         @Override
         public void windowClosing(WindowEvent ev) {
            System.exit(0);
         }
      });
      frame.setVisible(true);
   }
}
