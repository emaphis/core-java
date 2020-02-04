/*
 * Chapter 6  Generic Programming
 * Sec 4  Type Variance and Wildcards
 *  Subtype Wildcards
 *  Supertype wildcards.
 */
package impatient.ch06.sec04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author emaphis
 */
public class Wildcards {

   // subtype wildcards.
   public static void printNames(ArrayList<? extends Employee> staff) {
      for (int i = 0; i < staff.size(); i++) {
         Employee e = staff.get(i);
         System.out.println(e.getName());
      }
   }

   public static void main(String[] args) {
      ArrayList<Employee> staff = new ArrayList<>();
      staff.add(new Employee("Peter", 20000));
      staff.add(new Manager("Paul", 45000));
      staff.add(new Employee("Mary", 25000));

      printNames(staff);
   }

   public void stuff() {
      ArrayList<? extends Employee> staff = new ArrayList<>();
      //staff.add(new Employee("Larry", 20000));
      //staff.add(new Manager("Curly", 40000));
      // ... incompatible types.
   }
}
