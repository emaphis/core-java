/*
 * Chapter 2 Collections
 */
package vol1.chap09.sec02;

import java.util.Objects;

/**
 * Represents an Item
 *
 * @author emaphis
 */
public class Item implements Comparable<Item> {

   private final String description;
   private final int partNumber;

   /**
    * Constructs an Item;
    *
    * @param description The item's description
    * @param partNumber The item's part number
    */
   public Item(String description, int partNumber) {
      this.description = description;
      this.partNumber = partNumber;
   }

   public String getDescription() {
      return description;
   }

   @Override
   public String toString() {
      return "[description=" + description + ", partNumber=" + partNumber + "]";
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (this.getClass() != obj.getClass()) {
         return false;
      }
      Item other = (Item) obj;
      return Objects.equals(description, other.description) && this.partNumber == other.partNumber;
   }

   @Override
   public int hashCode() {
      int hash = 3;
      hash = 59 * hash + Objects.hashCode(this.description);
      hash = 59 * hash + this.partNumber;
      return hash;
   }

   @Override
   public int compareTo(Item other) {
      int diff = Integer.compare(partNumber, other.partNumber);
      return diff != 0 ? diff : description.compareTo(other.description);
   }
}
