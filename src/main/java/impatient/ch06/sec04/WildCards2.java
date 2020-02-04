/*
 * Chapter 6  Generic Programming
 * Sec 4  Type Variance and Wildcards
 *  Supertype Wildcards
 */
package impatient.ch06.sec04;

import static impatient.ch06.sec04.Wildcards.printNames;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author emaphis
 */
public class WildCards2 {

   // supertype wildcards
   public static void printAll1(Employee[] staff, Predicate<Employee> filter) {
      for (Employee employee : staff) {
         if (filter.test(employee))
            System.out.println(employee.getName());
      }
   }

   public static void printAll2(Employee[] staff, Predicate<? super Employee> filter) {
      for (Employee employee : staff) {
         if (filter.test(employee))
            System.out.println(employee.getName());
      }
   }

   public static void main(String[] args) {
      Employee[] staff = {
         new Employee("Peter", 20000),
         new Manager("Paul", 45000),
         new Employee("Mary", 25000)
      };

      printAll1(staff, e -> e.getSalary() > 40000);
      printAll2(staff, e -> e.getSalary() > 40000);

      Predicate<Object> evenLength = e -> e.toString().length() % 2 == 0;
  //    printAll1(staff, evenLength);
      printAll2(staff, evenLength);
   }

}
