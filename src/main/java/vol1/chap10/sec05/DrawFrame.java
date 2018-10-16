/*
 * Chapter 10 Graphics Programming
 * Section 05 @D Drawing
 */
package vol1.chap10.sec05;

import javax.swing.*;

/**
 * 2D drawing
 * @author emaphis
 */
public class DrawFrame extends JFrame {

   public DrawFrame() {
      add(new DrawComponent());
      pack();
   }

}
