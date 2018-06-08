/*
 * Package example
 */
package org.core.java;

import java.time.LocalDate;

/**
 * Class to represent employees
 * @author emaphis
 */
public class Employee {
   // instance fields
   private final String name;
   private double salary;
   private final LocalDate hireDate;

   public Employee(String n, double s, int year, int month, int day) {
      this.name = n;
      this.salary = s;
      this.hireDate = LocalDate.of(year, month, day);
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   public LocalDate getHireDate() {
      return hireDate;
   }

   /**
    * Raise Employee Salary by a Percent
    * @param byPercent
    */
   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
}
