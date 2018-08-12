/*
 * Manager Employee Object methods exampe
 * Chapter 5 Section 2.
 */
package vol1.chap05.sec02;

import java.time.*;
import java.util.Objects;

/**
 * Class to represent employees
 * @author emaphis
 */
public class Employee {
   private String name = "";  // instance field initialization
   private double salary;
   private final LocalDate hireDay;

   public Employee(String name, double salary, int year, int month, int day) {
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

   @Override
   public boolean equals(Object otherObject) {
      // a quick test to see if the objects are identical
      if (this == otherObject) return true;
   
      // must return false if the explicit parameter is null
      if (otherObject == null) return false;
   
      // if the classes don't match, they can't ve equal
      if (getClass() != otherObject.getClass()) return false;
   
      // now we know otherObject is a non-null Emplyee so..
      Employee other = (Employee) otherObject;
   
      // test whether the fields have identical values
      return Objects.equals(name, other.name) && salary == other.salary
            && Objects.equals(hireDay, other.hireDay);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, salary, hireDay);
   }

   @Override
   public String toString() {
      return getClass().getName() + "[name=" + name + ",salara=" + salary
            + ",hireDay=" + hireDay + "]";
   }
}
