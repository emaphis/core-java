/*
 * Chapter 4  Inheritance and Reflection
 * Exercise 4
 */
package impatient.ch04.exercises;

import java.util.Objects;

/**
 * @author emaphis
 */
public class Line extends Shape implements Cloneable {
   private Point to;

   public Line(Point from, Point to) {
      super(from);
      this.to = to;
   }

   @Override
   public Point getCenter() {
      Point from = super.getPoint();
      return new Point((from.getX() + to.getX()) / 2.0, (from.getY() - to.getY()) / 2.0);
   }

   // the 'to' point varies with the move
   @Override
   public void moveBy(int dx, int dy) {
      super.moveBy(dx, dy);
      to = new Point(this.to.getX() + dx, this.to.getY() + dy);
   }

   @Override
   public Line clone()  {
      return new Line(this.getCenter(), this.to);
   }

   @Override
   public String toString() {
      return "Line: From " + this.getPoint() + ", To "  + to;
   }

   @Override
   public boolean equals(Object obj) {
      if (!super.equals(obj)) return false;
      if (this.getClass() != obj.getClass()) return false;
      Line other = (Line) obj;
      return this.to.equals(other.to);
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), this.to);
   }

}
