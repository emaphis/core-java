/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises 2, 15
 */

package impatient.ch03.exercises;

/**
 *
 * @author emaphis
 */


public class Employee implements Measurable {
   private final String name;
   private double salary;

   public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
   }

   public Employee(String name) {
      this(name, 0);
   }

   public Employee(double salary) {
      this("", salary);
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100.0;
      salary += raise;
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   @Override
   public double getMeasure() {
      return getSalary();
   }
}