/*
 * Chapter 2 Object-Oriented Programming
 * 2.4 Static Variables and Methods
 * Employee.java
 */
package impatient.ch02.sec04;


/**
 * Class to represent Employee objects.
 * Static Variables
 * @author emaphis
 */
public class Employee {
   private static int lastId = 0;
   private int id;
   private String name;
   private double salary;

   public Employee() {
      lastId++;
      this.id = lastId;
   }

   public Employee(String name, double salary) {
      this();
      this.name = name;
      this.salary = salary;
   }

   public void raiseSalary(double byPercent) {
      double raise = this.salary * byPercent / 100.0;
      this.salary += raise;
   }

   public String getName() {
      return name;
   }

   public double getSalary() {
      return salary;
   }

   public int getId() {
      return id;
   }
}
