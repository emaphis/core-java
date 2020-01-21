/*
 * Chapter 4  Inheritance and Reflection
 * Exercise 1, 2, 3, 4, 5
 */
package impatient.ch04.exercises;

import java.util.Objects;


/**
 * Point class for Exercise 1, 2, 3, 4, 5
 * @author emaphis
 */
public class Point implements Cloneable {
   protected final double x;
   protected final double y;

   // Exerccise 1
   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public double getX() {
      return x;
   }

   public double getY() {
      return y;
   }

   // Exercise 2

   @Override
   public String toString() {
      return  "Point: [x=" + x + ", y=" + y + "]";
   }

   @Override
   public boolean equals(Object otherObj) {
      if (this == otherObj) return true;
      if (otherObj == null) return false;
      if (this.getClass() != otherObj.getClass()) return false;
      Point otherPoint = (Point) otherObj;
      return this.x == otherPoint.x && this.y == otherPoint.y;
   }

   @Override
   public int hashCode() {
      return Objects.hash(x, y);
   }

   @Override
   protected Point clone() {
      return new Point(this.x, this.y);
   }

}
