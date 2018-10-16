/*
 * Chapter 10 Graphics Programming
 * Section 3 Sized Frame
 */
package vol1.chap10.sec03;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author emaphis
 */
public class Sizedframe extends JFrame {

   public Sizedframe() {
      // get screen dimensions
      Toolkit kit = Toolkit.getDefaultToolkit();
      Dimension screenSize = kit.getScreenSize();
      int screenHeight = screenSize.height;
      int screenWidth = screenSize.width;

      // set frame width, height and let platform pick scree location
      setSize(screenWidth / 2, screenHeight / 2);
      setLocationByPlatform(true);

      // set fram icon
      Image img = new ImageIcon("./src/main/resources/about.gif").getImage();
      setIconImage(img);
   }

}
