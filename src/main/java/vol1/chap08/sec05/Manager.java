/*
 * Chapter 8 - Generics
 * Sec 5 - Type Erasure
 */
package vol1.chap08.sec05;

/**
 * Represents a Manager
 * @author emaphis
 */
public class Manager extends Employee {
   public double bonus;

   public Manager (String name, double salary) {
      super(name, salary);
      this.bonus = 0.0;
   }

   public void setBonus(double bonus) {
      this.bonus = bonus;
   }

   public double getBonus() {
      return bonus;
   }
}
