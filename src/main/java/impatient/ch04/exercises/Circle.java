/*
 * Chapter 4  Inheritance and Reflection
 * Exercise 4
 */
package impatient.ch04.exercises;

import java.util.Objects;

/**
 * @author emaphis
 */
public class Circle extends Shape implements Cloneable {
   private final double radius;

   public Circle(Point center, double radius) {
      super(center);
      this.radius = radius;
   }

   @Override
   public Point getCenter() {
      return super.getPoint();
   }

   @Override
   public Circle clone() {
      return new Circle(this.getCenter(), this.radius);
   }

   @Override
   public String toString() {
      return "Circle: " + this.getCenter().toString() + ", Radius=" + radius;
   }

   @Override
   public boolean equals(Object obj) {
      if (!super.equals(obj)) return false;
      if (this.getClass() != obj.getClass()) return false;
      Circle other = (Circle) obj;
      return Double.compare(this.radius, other.radius) == 0;
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), radius);
   }

}
