/*
 * Chapter 4 Inheritance and Reflection
 * Sec 1 Extending a Class
 * Super and Subclasses
 */

package impatient.ch04.sec01;

/**
 * @author emaphis
 */
public class Manager extends Employee {
   private double bonus;

   public Manager(String name, double salary) {
      super(name, salary);
      this.bonus = 0;
   }

   void setBous(double bonus) {
      this.bonus = bonus;
   }

   @Override
   public double getSalary() {
      return super.getSalary() + bonus;
   }

}
