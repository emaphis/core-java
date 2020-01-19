/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises
 */
package impatient.ch03.exercises;

import java.util.Arrays;
import java.util.Comparator;

/*
Write a call to Arrays.sort that sorts employees by salary, breaking ties by
name. Use Comparator.thenComparing. Then do this in reverse order
*/

/**
 * @author emaphis
 */
public class Ex15 {

   public static void main(String[] args) {
      Employee[] employees = new Employee[] {
         new Employee("Peter", 20000.0),
         new Employee("Curly", 30000.0),
         new Employee("Larry", 40000.0),
         new Employee("Big Boss", 100000.0),
         new Employee("Moe", 20000.0),
         new Employee("Paul", 30000.0),
         new Employee("Mary", 40000.0)
      };

      Comparator<Employee> comp1 =
            Comparator.comparing(Employee::getSalary)
            .thenComparing(Comparator.comparing(Employee::getName));
      Arrays.sort(employees, comp1);

      for (Employee employee : employees) {
         System.out.println(employee.getName() + " : " + employee.getSalary());
      }
      System.out.println();

      Comparator<Employee> comp2 =
            Comparator.comparing(Employee::getSalary).reversed()
            .thenComparing(Comparator.comparing(Employee::getName));
      Arrays.sort(employees, comp2);

      for (Employee employee : employees) {
         System.out.println(employee.getName() + " : " + employee.getSalary());
      }
   }


}
