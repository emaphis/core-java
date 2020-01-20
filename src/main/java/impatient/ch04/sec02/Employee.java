/*
 * Chapter 4 Inheritance and Reflection
 * Sec 2 Object: The Cosmic Superclass
 *
 */
package impatient.ch04.sec02;

/**
 * @author emaphis
 */
public class Employee extends Object {

   private String name;
   private double salary;

   public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100;
      salary += raise;
   }

   public final String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   @Override
   public String toString() {
      return getClass().getName() + "[name=" + name
            + ",salary=" + salary + "]";
   }

   @Override
   public Employee clone() throws CloneNotSupportedException {
      return (Employee) super.clone();
   }
}
