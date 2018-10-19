/*
 * Chapter 11 Event Handling
 * Section 3 Mouse Events
 */
package vol1.chap11.sec03;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

/**
 * A component with mouse operations for adding and removing squares
 * @author emaphis
 */
public class MouseComponent extends JComponent {

   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;

   private static final int SIDELENGHT = 10;
   private final ArrayList<Rectangle2D> squares;
   private Rectangle2D current;  // the square containing the mouse currsor.

   public MouseComponent() {
      squares = new ArrayList<>();
      current = null;

      addMouseListener(new MouseHandler());
      addMouseMotionListener(new MouseMotionHandler());
   }

   @Override
   public Dimension getPreferredSize() { return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT); }

   @Override
   protected void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;

      // draw all squares
      for (Rectangle2D s : squares)
         g2.draw(s);
   }

   /**
    * Finds the first square containing a point.
    * @param p a point
    * @return the first square that contains p
    */
   public Rectangle2D find(Point2D p) {
      for (Rectangle2D s : squares) {
         if (s.contains(p)) return s;
      }
      return null;
   }

   /**
    * Adds a square to the collection
    * @param p the center of the square
    */
   public void add(Point2D p) {
      double x = p.getX();
      double y = p.getY();

      current = new Rectangle2D.Double(x - SIDELENGHT / 2, y - SIDELENGHT / 2,
                             SIDELENGHT, SIDELENGHT);
      squares.add(current);
      repaint();
   }

   /**
    * Removes a square from the collection
    * @param s the square to remove
    */
   public void remove(Rectangle2D s) {
      if (s == null) return;
      if (s == current) current = null;
      squares.remove(s);
      repaint();
   }


   private class MouseHandler extends MouseAdapter {
      @Override
      public void mousePressed(MouseEvent event) {
         // add new square if the cursion isn't inside a square
         current = find(event.getPoint());
         if (current == null) add(event.getPoint());
      }

      @Override
      public void mouseClicked(MouseEvent event) {
         // remove the current square if double clicked
         current = find(event.getPoint());
         if (current != null && event.getClickCount() >= 2) remove(current);
      }
   }

   private class MouseMotionHandler implements MouseMotionListener {

      @Override
      public void mouseMoved(MouseEvent event) {
         // set the mouse cursor to cross hairs if it is inside
         // the rectangle

         if (find(event.getPoint()) == null) setCursor(Cursor.getDefaultCursor());
         else setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
      }

      @Override
      public void mouseDragged(MouseEvent event) {
         if (current != null) {
            int x = event.getX();
            int y = event.getY();

            // drag the current rectangle to center it at (x,y)
            current.setFrame(x-SIDELENGHT / 2, y - SIDELENGHT / 2, SIDELENGHT, SIDELENGHT);
            repaint();
         }
      }
   }
}