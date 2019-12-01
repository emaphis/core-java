/*
 *
 * Employee.java
 */
package impatient.ch02.sec02;

/**
 * Class to represent Employee objects.
 * @author emaphis
 */
public class Employee {
   private String name;
   private double salary;

   public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
   }

   public void raiseSalary(double byPercent) {
      double raise = this.salary * byPercent / 100.0;
      this.salary += raise;
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }
}
