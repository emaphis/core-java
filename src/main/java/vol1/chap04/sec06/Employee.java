/*
 * Create your own classes example
 * Chapter 4 Section 6 - Construtctors
 */
package vol1.chap04.sec06;

import java.time.LocalDate;
import java.util.Random;

/**
 * Class to represent employees
 * @author emaphis
 */
public class Employee {
   private static int nextId;

   // instance fields
   private int id;
   private String name = "";  // instance field initialization
   private double salary;

   // static initialization block
   static {
      Random generator = new Random();
      // Set nextId to a random between 0 and 9999;
      nextId = generator.nextInt(10000);
   }

   // object initialization block
   {
      id = nextId;
      nextId++;
   }

   // three over loaded constructors
   public Employee(String n, double s) {
      this.name = n;
      this.salary = s;
   }

   public Employee(double s) {
      // calls the Employee(String, double) constructor
      this("Employee #" + nextId, s);
   }

   // the default constructor
   public Employee() {
      // initialize to "" above
      // salary not explicitly set -- intitialized to 0
      // id initialized in initialization block
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
