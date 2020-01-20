/*
 * Chapter 4 Inheritance and Reflection
 * Sec 1 Extending a Class
 * Super and Subclasses
 */

package impatient.ch04.sec01;


/**
 *
 * @author emaphis
 */


public class Employee {
   private final String name;
   private double salary;

   public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100.0;
      salary += raise;
   }

   public final String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

}