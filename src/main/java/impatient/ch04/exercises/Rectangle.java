/*
 * Chapter 4  Inheritance and Reflection
 * Exercises
 */
package impatient.ch04.exercises;

import java.util.Objects;

/**
 * @author emaphis
 */
public class Rectangle extends Shape {
   private final double width;
   private final double height;

   public Rectangle(Point topLeft, double width, double height) {
      super(topLeft);
      this.width = width;
      this.height = height;
   }

   @Override
   public Point getCenter() {
      Point topLeft = getPoint();
      return new Point((topLeft.getX() + width) / 2.0, (topLeft.getY() - height) / 2.0);
   }

   @Override
   public Rectangle clone() {
      return new Rectangle(this.getPoint(), this.width, this.height);
   }

   @Override
   public String toString() {
      return "Rectangle: TopLeft " + this.getPoint() + ", Width=" + this.width + ", Height=" + this.height;
    }


   @Override
   public boolean equals(Object obj) {
      if (!super.equals(obj)) return false;
      if (this.getClass() != obj.getClass()) return false;
      Rectangle other = (Rectangle) obj;
      return Double.compare(this.width, other.height) == 0 &&
            Double.compare(this.width, other.width) == 0;
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), height, width);
   }

}
