/*
 *  Chapter 2 Object-Oriented Programming
 *  2.3 Object Construction
 * Employee.java
 */
package impatient.ch02.sec03;

import java.util.Random;

/**
 * Class to represent Employee objects.
 * 2.3.1 - Implementing Constructors
 * 2.3.2 Overloading
 * @author emaphis
 */
public class Employee {
   private String name;
   private double salary;
   private final int id;

   { // initialization block
      Random generator = new Random();
      id = 1 + generator.nextInt(1_000_000);
   }

   public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
   }

   public Employee(double salary) {
      this.salary = salary;
   }

   public Employee(String name) {
      this.name = name;
   }

   public Employee() {
      this("", 0);
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

   public int getId() {
      return id;
   }

}
