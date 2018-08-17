/*
 * Manager Employee inherateance example
 * Chapter 5 Section 1 - Inheratance.
 */
package vol1.chap05.sec01;

/**
 * Represents a Manager - Inherits from Employee
 * @author emaphis
 */
public class Manager extends Employee {
   private double bonus;

   public Manager(String name, double salary, int year, int month, int day) {
      super(name, salary, year, month, day);
      bonus = 0.0;
   }

   public void setBonus (double bonus) {
      this.bonus = bonus;
   }

   @Override
   public double getSalary() {
      double baseSalary = super.getSalary();
      return baseSalary + bonus; // wont work
   }
}
