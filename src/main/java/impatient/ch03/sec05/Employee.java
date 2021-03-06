/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 5 Method and Constructor References.
 * Constructor References.
 */
package impatient.ch03.sec05;


/**
 *
 * @author emaphis
 */
public class Employee {
   private final String name;
   private double salary;

   public Employee(String name, double salary) {
      this.name = name;
      this.salary = salary;
   }

   public Employee(String name) {
      this(name, 0);
   }

   public Employee(double salary) {
      this("", salary);
   }

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100.0;
      salary += raise;
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

}
