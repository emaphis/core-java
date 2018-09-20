/*
 * Chaper 6 Classed
 * Interfaces
 */
package vol1.chap06.interfaces;

/**
 * Represents a point object
 * @author emaphis
 */
public class Point {
   private final double x;
   private final double y;

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

   @Override
   public String toString() {
      return "Point{x=" + x + ",y=" + y + "}";
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (this.getClass() != obj.getClass()) return false;
      Point other = (Point) obj;
      // compare using Double.compare because float
      return (Double.compare(x, other.x) == 0) && (Double.compare(y, other.y) == 0);
   }

   @Override
   public int hashCode() {
      int hash = 3;
      hash = 17 * hash + (int)(Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
      hash = 17 * hash + (int)(Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
      return hash;
   }
}
