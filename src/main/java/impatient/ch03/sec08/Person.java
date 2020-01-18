/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 8 Higher-Order Functions
 * Methods that Return Functions
 */
package impatient.ch03.sec08;

/**
 *
 * @author emaphis
 */
public class Person {
   private String first;
   private String middle;
   private String last;

   public Person(String first, String middle, String last) {
      this.first = first;
      this.middle = middle;
      this.last = last;
   }

   public Person(String first, String last) {
      this.first = first;
      this.last = last;
   }

   public String getFirstName() {
      return first;
   }

   public String getMiddleName() {
      return middle;
   }

   public String getLastName() {
      return last;
   }

   public String getName() {
      if (middle == null) {
         return first + " " + last;
      }
      else {
         return first + " " + middle +  " " + last;
      }
   }

   @Override
   public String toString() {
      return getName();
   }

}
