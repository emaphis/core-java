/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises
 */
package impatient.ch03.exercises;

/*
Provide an interface Measurable with a method double getMeasure() that measures
an object in some way. Make Employee implement Measurable. Provide
a method double average(Measurable[] objects) that computes the average
measure. Use it to compute the average salary of an array of employees.
*/

/**
 *
 * @author emaphis
 */
public class Ex01 {

   static double average(Measurable[] objects) {
      double sum = 0;
      for (Measurable object : objects) {
         sum += object.getMeasure();
      }

      return sum / objects.length;
   }

   public static void main(String[] args) {
      Measurable[] employees = new Measurable[] {
         new Employee("Peter", 20000.0),
         new Employee("Paul", 30000.0),
         new Employee("Mary", 40000.0)
      };

      double avg = average(employees);
      System.out.println(avg);
   }
}
