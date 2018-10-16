/*
 * Chapter 10 Graphics Programming
 * Section 04 Displaying information in a component
 */
package vol1.chap10.sec04;

import java.awt.*;
import javax.swing.*;

/**
 * A JComponent example
 * @author emaphis
 */
public class NotHelloWorldComponent extends JComponent {
   public static final int MESSAGE_X = 75;
   public static final int MESSAGE_Y = 100;
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   @Override
   public void paint(Graphics g) {
      g.drawString("Not a Hello World Program", MESSAGE_X, MESSAGE_Y);
      //super.paint(g);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
   }
}
