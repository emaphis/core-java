/*
 * Exercise 4.5 immutable Point class,
 */
package vol1.chap04.exercises;

/**
 *
 * @author emaphis
 */
public class Point1 {
   private double x;
   private double y;

   public Point1(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public Point1() {
      this(0, 0);
   }

   public double getX() { return x; }

   public double getY() { return y; }

   public Point1 translate(double x, double y) {
      return new Point1(this.x + x, this.y + y);
   }

   public Point1 scale(double sc) {
      return new Point1(this.x * sc, this.y * sc);
   }

   public static void main(String[] args) {
      Point1 p = new Point1(3, 4).translate(1, 3).scale(0.5);
      System.out.println("Point x=" + p.getX() + " , " + "Point y=" + p.getY());
   }
}
