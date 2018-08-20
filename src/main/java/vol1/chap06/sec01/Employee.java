/*
 * Manager Employee
 * Chapter 6 Section 1 - Interfaces.
 */
package vol1.chap06.sec01;

/**
 * Class to represent employees
 * @author emaphis
 */
public class Employee implements Comparable<Employee> {

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

   public void raiseSalary(double byPercent) {
      double raise = salary * byPercent / 100.0;
      salary += raise;
   }

   /**
    * Compares employees by salary
    * @param other another Employee object
    * @return a negative value if this employee has a lower salary than
    * otherObject, 0 if the salaries are the same, a positive value otherwise
    */
   @Override
   public int compareTo(Employee other) {
      return Double.compare(salary, other.salary);
   }
}
