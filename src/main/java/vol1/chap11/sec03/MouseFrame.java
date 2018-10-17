/*
 * Chapter 11 Event Handling
 * Section 3 Mouse Events
 */
package vol1.chap11.sec03;

import javax.swing.*;

/**
 * A frame containing a panel for testing mouse operations
 * @author emaphis
 */
public class MouseFrame extends JFrame {

   public MouseFrame() {
      add(new MouseComponent());
      pack();
   }

}
