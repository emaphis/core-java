/*
 * Chapter 2 Object-Oriented Programming
 * Section 2.7 Documentation comments.
 * Invoice.java
 */
package impatient.ch02.sec07;

import java.util.ArrayList;

/**
 * An <code>Invoice</code> object represents an invoice with
 * line items for each part of the order
 * @author emaphis
 * @version 1.1
 */
public class Invoice {
   /**
    * An <code>Invoide.Item</code> object represents an order line item.
    */
   private static class Item {  // Item is nested inside Invoice
      String description;
      int quantity;
      double unitPrice;

      /**
       * Calculates the line item price
       * @return the line item price
       */
      double price() { return quantity * unitPrice; }

      @Override
      public String toString() {
         return quantity + " x " + description + " @ $" + unitPrice + " each";
      }

   }

   private ArrayList<Item> items = new ArrayList();

   /**
    * Add an <code>item</code> to the <code>invoice</code>
    * @param description Item description
    * @param quantity Item quantity
    * @param unitPrice Item unit price
    */
   public void addItem(String description, int quantity, double unitPrice) {
      Item newItem = new Item();
      newItem.description = description;
      newItem.quantity = quantity;
      newItem.unitPrice = unitPrice;
      items.add(newItem);
   }

   /**
    * Print out the line items and invoice total.
    */
   public void print() {
      double total = 0;
      for (Item item : items) {
         System.out.println(item);
         total += item.price();
      }
      System.out.println("total: " + total);
   }
}
