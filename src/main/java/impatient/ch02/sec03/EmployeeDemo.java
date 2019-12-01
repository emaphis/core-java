/*
 * Chapter 2 Object-Oriented Programming
 * 2.3 Object Construction
 * EmployeeDemo.java
 */
package impatient.ch02.sec03;

import java.util.ArrayList;

/**
 * Test Employee class
 * 2.3.1 - Implementing Constructors
 * @author emaphis
 */
public class EmployeeDemo {
   public static void main(String[] args) {
      ArrayList<Employee> staff = new ArrayList<>();

      Employee james = new Employee("James Bond", 50000);
      staff.add(james);

      Employee anonymous = new Employee("", 40000);
      staff.add(anonymous);

      Employee unpaid = new Employee("Igor Intern");
      staff.add(unpaid);

      Employee e = new Employee();
      staff.add(e);

      for (Employee employee : staff) {
         System.out.println("employee: " + employee);
      }
   }
}
