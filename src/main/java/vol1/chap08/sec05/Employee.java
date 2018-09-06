/*
 * Chapter 8 - Genreics
 * Section 5 - Type Erasure
 */
package vol1.chap08.sec05;

/**
 * Represents and Employee
 * @author emaphis
 */
public class Employee {
   private final String name;
   private final double salary;
   Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
   }
   public String getName() {
      return this.name;
   }
   public double getSalary() {
      return this.salary;
   }
}
