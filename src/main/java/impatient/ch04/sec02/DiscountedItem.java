/*
 * Chapter 4 Inheritance and Reflection
 * Sec 2 Object: The Cosmic Superclass
 * The equals Method
 */
package impatient.ch04.sec02;

import java.util.Objects;


/**
 *
 * @author emaphis
 */
public class DiscountedItem extends Item {
   private double discount;

   public DiscountedItem(double discount, String description, double price) {
      super(description, price);
      this.discount = discount;
   }

   @Override
   public boolean equals(Object otherObj) {
      if (!super.equals(otherObj)) return false;
      if (getClass() != otherObj.getClass()) return false;
      DiscountedItem other = (DiscountedItem) otherObj;
      return discount == other.discount;
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), discount);
   }

}
