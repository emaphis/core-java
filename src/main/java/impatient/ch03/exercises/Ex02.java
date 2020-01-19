/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises
 */
package impatient.ch03.exercises;

/*
Continue with the preceding exercise and provide a method Measurable
largest(Measurable[] objects). Use it to find the name of the employee with
the largest salary. Why do you need a cast?
*/

/**
 *
 * @author emaphis
 */
public class Ex02 {

   static double average(Measurable[] objects) {
      double sum = 0;
      for (Measurable object : objects) {
         sum += object.getMeasure();
      }

      return sum / objects.length;
   }

   static Measurable largest(Measurable[] objects) {
      if (objects == null) return null;
      Measurable large = objects[0];
      for (Measurable object : objects) {
         if (large.getMeasure() < object.getMeasure()) {
            large = object;
         }
      }
      return large;
   }

   public static void main(String[] args) {
      Measurable[] employees = new Measurable[] {
         new Employee("Peter", 20000.0),
         new Employee("Big Boss", 100000.0),
         new Employee("Paul", 30000.0),
         new Employee("Mary", 40000.0)
      };

      double avg = average(employees);
      System.out.println(avg);
      Employee highSalary = (Employee)largest(employees);
      System.out.println(highSalary.getName());
   }
}
