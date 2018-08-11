/*
 * Manager Employee inherateance example
 * Chapter 5 Section 1 - Inheratance.
 */
package vol1.chap05.sec01;

import java.time.*;

/**
 * Class to represent employees
 * @author emaphis
 */
public class Employee {

   // instance field
   private String name = "";  // instance field initialization
   private double salary;
   private LocalDate hireDay;

   // three over loaded constructors
   public Employee(String name, double salary, int year, int month, int day) {
      // super(name, salary, year, month, day)
      this.name = name;
      this.salary = salary;
      hireDay = LocalDate.of(year, month, day);
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   public LocalDate getHireDay() {
      return hireDay;
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100.0;
      salary += raise;
   }
}
