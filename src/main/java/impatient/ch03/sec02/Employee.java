/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 2 Static, Default, and Private Methods
 * Resolving Default Method Conflics
 * Employee.java
 */
package impatient.ch03.sec02;

/**
 *
 * @author emaphis
 */
public class Employee implements Person, Identified {
   private String name;
   private double salary;

   public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100.0;
      salary += salary;
   }

   @Override
   public int getId() { return Identified.super.getId(); }

   @Override
   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

}
