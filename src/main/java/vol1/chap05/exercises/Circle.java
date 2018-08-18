/*
 * Chapter 5 Exercises
 * Abstract class
 */
package vol1.chap05.exercises;

/**
 *
 * @author emaphis
 */
public class Circle extends Shape { 
   private final double radius;

   public Circle(Point center, double radius) {
      super(center);
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }

   @Override
   public Point getCenter() {
      return getPoint();
   }
}
