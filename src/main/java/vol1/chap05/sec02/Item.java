/*
 * Core Jave SE 9
 * Chapter 5 Section 3
 * Equality
 * Item and DiscountedItem examples
 */
package vol1.chap05.sec02;

import java.util.Objects;

/**
 * Equality example
 * @author emaphis
 */
public class Item {
   private String description;
   private double price;

   @Override
   public boolean equals(Object otherObject) {
      // Check that the objects are identical
      if (this == otherObject) return true;

      // Check that the orther item isn't null
      if (otherObject == null) return false;

      // Check that otherObject is an item
      if (getClass() != otherObject.getClass()) return false;

      // Test whether the instance variables have identical values
      Item other = (Item) otherObject;
      return Objects.equals(description, other.description)
            && price == other.price;      
   }

   @Override
   public int hashCode() {
      return Objects.hash(description, price);
   }
}
