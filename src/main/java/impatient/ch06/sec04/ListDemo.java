/*
 * Chapter 6  Generic Programming
 * Sec 4  Type Variance and Wildcards
 * Unbounded Wildcards
 */
package impatient.ch06.sec04;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author emaphis
 */
public class ListDemo {

   public static void main(String[] args) {

      ArrayList<Employee> staff = new ArrayList<>();
      staff.add(new Employee("Peter", 20000));
      staff.add(new Manager("Paul", 45000));
      staff.add(null);
      staff.add(new Employee("Mary", 25000));

      System.out.println(ListUtils.hasNulls(staff));

      ListUtils.swap(staff, 0, 1);
      System.out.println(staff);
   }
}
