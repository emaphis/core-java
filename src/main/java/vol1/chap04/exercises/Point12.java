/*
 * Exercise 4.5 immutable Point class,
 */
package vol1.chap04.exercises;

/**
 *
 * @author emaphis
 */
public class Point12 {
   private double x;
   private double y;

   public Point12(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public Point12() {
      this(0, 0);
   }

   public double getX() { return x; }

   public double getY() { return y; }

   public void translate(double x, double y) {
      this.x =+ x;
      this.y =+ y;
   }

   public void scale(double sc) {
      this.x = this.x * sc;
      this.y = this.y * sc;
   }

   public static void main(String[] args) {
      Point12 p = new Point12(3, 4);
      System.out.println("Point x=" + p.getX() + " , " + "Point y=" + p.getY());
      p.translate(1, 3);
      System.out.println("Point x=" + p.getX() + " , " + "Point y=" + p.getY());
      p.scale(0.5);
      System.out.println("Point x=" + p.getX() + " , " + "Point y=" + p.getY());
   }
}
