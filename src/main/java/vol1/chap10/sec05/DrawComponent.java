/*
 * Chapter 10 Graphics Programming
 * Section 05 2D Drawing
 */
package vol1.chap10.sec05;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * Component that draws rectangles and ellipses
 * @author emaphis
 */
public class DrawComponent extends JComponent {
   private static final int DEFAULT_WIDTH = 400;
   private static final int DEFAULT_HEIGHT = 400;

   public DrawComponent() {
   }

   @Override
   protected void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;

      // draw rectangle
      double leftX = 100;
      double topY = 100;
      double width = 200;
      double height = 150;

      Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
      g2.draw(rect);

      // draw the enclosed ellipse
      Ellipse2D ellipse = new Ellipse2D.Double();
      ellipse.setFrame(rect);
      g2.draw(ellipse);

      // draw diagonal line
      g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + height));

      // draw a circle wiyh same center
      double centerX = rect.getCenterX();
      double centerY = rect.getCenterY();
      double radius = 150;

      Ellipse2D circle = new Ellipse2D.Double();
      circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
      g2.draw(circle);
   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
   }



}
