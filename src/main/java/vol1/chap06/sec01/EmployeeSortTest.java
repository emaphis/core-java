/*
 * Chapter 6 Section 1
 * Comparable interface
 */
package vol1.chap06.sec01;

import java.util.*;
/**
 * Demonstrates the use of the Comparable interface
 * @author emaphis
 */
public class EmployeeSortTest {
   public static void main(String[] args) {
      Employee[] staff = new Employee[3];

      staff[0] = new Employee("Harry Hacker", 35000);
      staff[1] = new Employee("Carl Cracker", 75000);
      staff[2] = new Employee("Tony Tester",  38000);

      Arrays.sort(staff);

      // print out information about all employee objects
      for (Employee e : staff) {
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
      }
   }
}
