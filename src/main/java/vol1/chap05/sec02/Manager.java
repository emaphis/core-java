/*
 * Manager Employee Object methods exampe
 * Chapter 5 Section 2.
 */
package vol1.chap05.sec02;

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

   @Override
   public boolean equals(Object otherObject) {
      if (!super.equals(otherObject)) return false;
      if (getClass() != otherObject.getClass()) return false;
      Manager other = (Manager) otherObject;
      // super.equals checked that this and other belong to the same class
      return bonus == other.bonus;
   }

   @Override
   public int hashCode() {
      return super.hashCode() + 17 * new Double(bonus).hashCode();
   }

   @Override
   public String toString() {
      return super.toString() + "[bonus=" + bonus + "]";
   }
}
