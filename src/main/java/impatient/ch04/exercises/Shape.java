/*
 * Chapter 4  Inheritance and Reflection
 * Exercise 4, 5
 */
package impatient.ch04.exercises;

import java.util.Objects;

/**
 * @author emaphis
 */
public abstract class Shape implements Cloneable {
   private Point point;

   public Shape(Point point) {
      this.point = point;
   }

   protected Point getPoint() {
      return point;
   }

   public void moveBy(int dx, int dy) {
      this.point = new Point(this.point.getX() + dx, this.point.getY() +  dy);
   }

   @Override
   abstract public Shape clone();

   abstract public Point getCenter();

   @Override
   public String toString() {
      return "Shape: " + this.point.toString();
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass()) return false;
      Shape other = (Shape) obj;
      return this.point.equals(other.point);
   }

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 97 * hash + Objects.hashCode(this.point);
      return hash;
   }


}
