/*
 * Create your own classes example
 */
package vol1.chap04.sec04;

import java.time.LocalDate;

/**
 * Class to represent employees
 * @author emaphis
 */
public class Employee {
   private static int nextId = 1;

   // instance fields
   private final String name;
   private double salary;
   private int id = 0;

   public Employee(String n, double s) {
      this.name = n;
      this.salary = s;
      id = 0;
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

   public void setId() {
      id = nextId;  // set id to next available id
      nextId++;
   }

   public static int getNextId() {
      return nextId;  // return the static field
   }

   public static void main(String[] args) {
      Employee e = new Employee("Harry", 50000);
      System.out.println(e.getName() + " " + e.getSalary());
   }

   void raiseSalary(int byPercent) {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
}
