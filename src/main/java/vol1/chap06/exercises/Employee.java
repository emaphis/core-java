/*
 * Chapter 6 Section 1 - Interfaces.
 * Exercise 1
 */
package vol1.chap06.exercises;


/**
 * Class to represent employees
 * @author emaphis
 */
public class Employee implements Measurable {

   // instance field
   private String name = "";  // instance field initialization
   private double salary;

   public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   @Override
   public double getMeasure() {
      return getSalary();
   }
}
