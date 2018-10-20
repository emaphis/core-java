/*
 * Chapter 10 Graphics Programming
 * Section 8 Images
 */
package vol1.chap10.sec08;

import java.awt.*;
import javax.swing.*;

/**
 * Component that displays a tile image
 * @author emaphis
 */
public class ImageComponent extends JComponent {
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   private final Image image;

   public ImageComponent() {
      image = new ImageIcon("./src/main/resources/blue-ball.gif").getImage();
   }

   @Override
   protected void paintComponent(Graphics g) {
      if (image == null) return;

      int imageWidth = image.getWidth(this);
      int imageHeight = image.getHeight(this);

      // draw image in the upper-left corner
      g.drawImage(image, 0, 0, null);

      // tile the image across the component
      for (int i = 0; i * imageWidth <= getWidth(); i++)
         for (int j = 0; j * imageHeight <= getHeight(); j++)
            if (i+j > 0)
               g.copyArea(0, 0, imageHeight, imageHeight, i * imageWidth, j * imageHeight);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
   }
}
