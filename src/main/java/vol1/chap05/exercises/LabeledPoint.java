/*
 * Chapter 5 Exercises
 * Exercies 1,2
 */
package vol1.chap05.exercises;

import java.util.Objects;

/**
 * Represents a Point with a label.
 * @author emaphis
 */
public class LabeledPoint extends Point {
   private final String label;

   public LabeledPoint(String label, double x, double y) {
      super(x, y);
      this.label = label;
   }

   public String getLabel() {
      return this.label;
   }

   @Override
   public String toString() {
      return "LabeledPoint{label=" + label + ",x=" + this.getX() + ",y="
                 + this.getY() + "}";
   }

   @Override
   public boolean equals(Object obj) {
      if (!super.equals(obj)) return false;
      if (this.getClass() != obj.getClass()) return false;
      LabeledPoint other = (LabeledPoint) obj;
      return super.equals(other) && label.equals(other.label);
   }

   @Override
   public int hashCode() {
      int hash = super.hashCode() + 17 * Objects.hashCode(this.label);
      return hash;
   }
}
