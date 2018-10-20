/*
 * Chapter 10 Graphics Programming
 * Section 8 Images
 */
package vol1.chap10.sec08;

import javax.swing.*;

/**
 * Image handling
 * @author emaphis
 */
public class ImageFrame extends JFrame {

   public ImageFrame() {
      add(new ImageComponent());
      pack();
   }

}
