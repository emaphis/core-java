/*
 * Core Jave SE 9
 * Chapter 5 Section 3
 * Equality
 * Item and DiscountedItem examples
 */
package vol1.chap05.sec02;

/**
 * Equality Example
 * @author emaphis
 */
public class DiscountedItem {
   private double discout;

   @Override
   public boolean equals(Object otherObject) {
      if (getClass() != otherObject.getClass()) return false;
      if (!super.equals(otherObject)) return false;
      DiscountedItem other = (DiscountedItem) otherObject;
      return discout == other.discout;
   }

   @Override
   public int hashCode() {
      int hash = 7;
      hash = 31 * hash + (int) (Double.doubleToLongBits(this.discout) ^ (Double.doubleToLongBits(this.discout) >>> 32));
      return hash;
   }


}
