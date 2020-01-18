/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 3 Examples of Intefaces
 * The Comparable Interface.
 * Employee.java
 */
package impatient.ch03.sec03;

/**
 *
 * @author emaphis
 */
public class Employee implements Comparable<Employee> {
   private final String name;
   private double salary;

   public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
   }

   public Employee(String name) {
      this.name = name;
      this.salary = 0;
   }

   public Employee(double salary) {
      this.name = "";
      this.salary = salary;
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100.0;
      salary += salary;
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   @Override
   public int compareTo(Employee other) {
      return Double.compare(salary, other.salary);
   }

}
