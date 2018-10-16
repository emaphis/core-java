/*
 * Chapter 10 Graphics Programming
 * Section 2 - Simple Frame
 */
package vol1.chap10.sec02;

import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author emaphis
 */
public class SimpleFrame extends JFrame {
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   public SimpleFrame() throws HeadlessException {
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
   }
}
