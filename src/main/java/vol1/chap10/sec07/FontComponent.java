/*
 * Chapter 10 Graphics Programming
 * Section 05 2D Drawing
 */
package vol1.chap10.sec07;

import java.awt.*;
import java.awt.geom.*;
import java.awt.font.*;
import javax.swing.*;

/**
 * Component that draws rectangles and ellipses
 * @author emaphis
 */
public class FontComponent extends JComponent {
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   public FontComponent() {
   }

   @Override
   protected void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;

      String message = "Hello, World!";

      Font f = new Font("Serif", Font.BOLD, 36);
      g2.setFont(f);

      // measure the size of the message
      FontRenderContext context = g2.getFontRenderContext();
      Rectangle2D bonds = f.getStringBounds(message, context);

      // set (x,y) = top left corner of text
      double x = (getWidth() - bonds.getWidth()) / 2;
      double y = (getHeight() - bonds.getHeight()) / 2;

      // add ascent to y to reach baseline
      double ascent = -bonds.getY();
      double baseY = y + ascent;

      // draw the message
      g2.drawString(message, (int) x, (int) baseY);

      g2.setPaint(Color.LIGHT_GRAY);

      // draw the baselin
      g2.draw(new Line2D.Double(x, baseY, x + bonds.getWidth(), baseY));

      // draw the enclosing rectangle
      Rectangle2D rect = new Rectangle2D.Double(x, y, bonds.getWidth(), bonds.getHeight());

   }

   @Override
   public Dimension getPreferredSize() {
      return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
   }
}
