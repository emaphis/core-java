/*
 * Exercises Chapter 2
 * Ex06.java
 */

package impatient.ch02.exercises;

/*
 * Repeat the preceding exercise, but now make translate and scale into mutators.
 */

/**
 * A <code>Point2</code> object represents a point in the plane
 * @author emaphis
 * @version 1.0
 */
class Point2 {
   private double x;
   private double y;

   /**
    * Constructs a <code>Point2</code> object given the x and y coordinates.
    * @param x coordinate
    * @param y coordinate
    */
   public Point2(double x, double y) {
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
    * @return Point2
    */
   public Point2 translate(double dx, double dy) {
      this.x += dx;
      this.y += dy;
      return this;
   }

   /**
    * Scales the point by the given factor
    * @param factor
    * @return Point2
    */
   public Point2 scale(double factor) {
      this.x *= factor;
      this.y *= factor;
      return this;
   }
}

public class Ex06 {

      public static void main(String[] args) {
         var p = new Point2(3, 4)
            .translate(1, 3)
            .scale(0.5);

         System.out.println("x=" + p.getX() + "; y=" + p.getY());
   }
}
