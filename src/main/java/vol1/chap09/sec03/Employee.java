/*
 * Chapter 9 Colections
 * Section 3 Map
 */
package vol1.chap09.sec03;


/**
 * Employee class used in MapTest
 * @author emaphis
 */
public class Employee {

   // instance fields
   private final String name;

   public Employee(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   @Override
   public String toString() {
      return this.name;
   }
}
