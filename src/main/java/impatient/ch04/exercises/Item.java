/*
 * Chapter 4 Inheritance and Reflection
 * Exercises 5
 */
package impatient.ch04.exercises;

import java.util.Objects;

/**
 * @author emaphis
 */
public class Item {
   private String description;
   private double price;

   public Item(String description, double price) {
      this.description = description;
      this.price = price;
   }

   @Override
   public boolean equals(Object otherObj) {
      // A test to see if the objects are identitcal
      if (this == otherObj) return true;

      // Must return false if the parameter is null
      if (otherObj == null) return false;

      // Check that otherObj is an Item
      if (!(otherObj instanceof Item)) return false;

      // Test whether the instance variables have identitcal values
      Item other = (Item) otherObj;
      return Objects.equals(description, other.description)
            && price == other.price;
   }

   @Override
   public int hashCode() {
      return Objects.hash(description, price);
   }

}
