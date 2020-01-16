/*
 * Exercises Chapter 2
 * Ex05.java
 */

package impatient.ch02.exercises;

/*
 * Implement an immutable class Point that describes a point in the plane.
 * Provide a constructor to set it to a specific point, a no-arg constructor to
 * set it to the origin, and methods getX, getY, translate, and scale. The translate
 * method moves the point by a given amount in x- and y-direction. The
 * scale method scales both coordinates by a given factor. Implement these
 * methods so that they return new points with the results. For example,
 * Point p = new Point(3, 4).translate(1, 3).scale(0.5);
 * should set p to a point with coordinates (2, 3.5).
 */

/**
 * A <code>Point</code> object represents a point in the plane
 * @author emaphis
 * @version 1.0
 */
class Point {
   private final double x;
   private final double y;

   /**
    * Constructs a <code>Point</code> object given the x and y coordinates.
    * @param x coordinate
    * @param y coordinate
    */
   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }

   /**
    * Returns the x coordinate.
    * @return x coordinates
    */
   public double getX() {
      return x;
   }

   /**
    * Returns the y coordinate.
    * @return y coordinates
    */
   public double getY() {
      return y;
   }

   /**
    * Translates the point by given amount in the x & y directions
    * @param dx
    * @param dy
    * @return Point
    */
   public Point translate(double dx, double dy) {
      return new Point(this.x + dx, this.y + dy);
   }

   /**
    * Scales the point by the given factor
    * @param factor
    * @return Point
    */
   public Point scale(double factor) {
      return new Point(this.x * factor, this.y * factor);
   }
}

public class Ex05 {

   public static void main(String[] args) {
      Point p = new Point(3, 4)
            .translate(1, 3)
            .scale(0.5);

      System.out.println("x=" + p.getX() + "; y=" + p.getY());
   }
}
