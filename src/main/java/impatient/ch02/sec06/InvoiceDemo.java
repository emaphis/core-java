/*
 * Chapter 2 Object-Oriented Programming
 * Section 2.6 Nested Classes
 * InvoiceDemo.java
 */
package impatient.ch02.sec06;

/**
 *
 * @author emaphis
 */
public class InvoiceDemo {
   public static void main(String[] args) {
      Invoice invoice = new Invoice();
      invoice.addItem("Blackwell Toaster", 2, 24.95);
      invoice.addItem("ZapXpress Microwave Oven", 1, 49.95);
      invoice.print();
   }
}
