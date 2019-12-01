/*
 * Chapter 2 - 2.2 Implementing Classes
 * EmployeeDemo.java
 */
package impatient.ch02.sec02;

/**
 * Test Employee class
 * @author emaphis
 */
public class EmployeeDemo {
   public static void main(String[] args) {
      Employee fred = new Employee("Fred", 50000);
      fred.raiseSalary(10);
      System.out.println("name:" + fred.getName());
      System.out.println("salary: " + fred.getSalary());
   }
}
