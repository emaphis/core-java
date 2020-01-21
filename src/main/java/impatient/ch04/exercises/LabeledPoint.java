/*
 * Chapter 4  Inheritance and Reflection
 * Exercises
 */
package impatient.ch04.exercises;

import java.util.Objects;

/**
 * Labeled Point for Exercises 1,2
 * @author emaphis
 */
public class LabeledPoint extends Point {
   private final String label;

   // Exercise 1
   public LabeledPoint(String label, double x, double y) {
      super(x, y);
      this.label = label;
   }

   public String getLabel() {
      return label;
   }

   // Exercise 2

   @Override
   public String toString() {
      return "LabelPoint: [Lable=" + label + ", x=" + x + ", y=" + y + "]";
   }

   @Override
   public boolean equals(Object otherObj) {
      if (otherObj == null) return false;
      if (this == otherObj) return true;
      if (this.getClass() != otherObj.getClass()) return false;
      LabeledPoint otherPoint = (LabeledPoint) otherObj;
      return Objects.equals(this.label, otherPoint.label) &&
            this.x ==  otherPoint.x && this.y == otherPoint.y;
   }

   @Override
   public int hashCode() {
      return Objects.hash(label, x, y);
   }

   // Exercise 3 - protected member access.
   public static double distance(Point pt1, Point pt2) {
      return Math.sqrt(pt1.x * pt2.x + pt1.y * pt2.y);
   }

   @Override
   public LabeledPoint clone() {
      return new LabeledPoint(this.label, this.x, this.y);
   }


}
