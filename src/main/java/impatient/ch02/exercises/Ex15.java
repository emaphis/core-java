/*
 * Exercises - Chaper 2
 * Ex15.java
 */
package impatient.ch02.exercises;

/*
Fully implement the Invoice class in Section 2.6.1, “Static Nested Classes”
(page 85). Provide a method that prints the invoice and a demo program
that constructs and prints a sample invoice.
*/


import java.util.ArrayList;
import java.util.List;

class Invoice {

   private static class Item {  // Item is nested inside Invoice
      String description;
      int quantity;
      double unitPrice;

      double price() { return quantity * unitPrice; }

      @Override
      public String toString() {
         return quantity + " x " + description + " @ $" + unitPrice + " each";
      }

   }

   private final List<Item> items = new ArrayList<>();

   public void addItem(String description, int quantity, double unitPrice) {
      Item newItem = new Item();
      newItem.description = description;
      newItem.quantity = quantity;
      newItem.unitPrice = unitPrice;
      items.add(newItem);
   }

   public void print() {
      double total = 0;
      for (Item item : items) {
         System.out.println(item);
         total += item.price();
      }
      System.out.println("total: " + total);
   }
}

/**
 *
 * @author emaphis
 */
public class Ex15 {

   public static void main(String[] args) {
      Invoice invoice = new Invoice();
      invoice.addItem("eggs", 12, 0.30);
      invoice.addItem("Ham", 1, 5.00);
      invoice.addItem("Canned corn", 5, 1.50);
      invoice.print();
   }

}
