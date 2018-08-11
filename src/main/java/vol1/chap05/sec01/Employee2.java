/*
 * Manager Employee inherateance example
 * Chapter 5 Section 1 - Abstract Inheritance.
 */
package vol1.chap05.sec01;

import java.time.*;

/**
 * Class to represent employees
 * @author emaphis
 */
public class Employee2 extends Person {
   private double salary;
   private final LocalDate hireDay;

   public Employee2(String name, double salary, int year, int month, int day) {
      super(name);
      this.salary = salary;
      hireDay = LocalDate.of(year, month, day);
   }

   public double getSalary() {
      return salary;
   }

   public LocalDate getHireDay() {
      return hireDay;
   }

   @Override
   public String getDescription() {
      return String.format("an employee with a salary 0f $%.2f", salary);
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100.0;
      salary += raise;
   }
}
