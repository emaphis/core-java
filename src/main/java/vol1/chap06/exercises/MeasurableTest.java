/*
 * Chapter 6 - Interfaces
 * Exercise 1, 2
 */
package vol1.chap06.exercises;

/**
 * Test Measurable Interface
 * @author emaphis
 */
public class MeasurableTest {
   
   public static double average(Measurable[] seq) {
      int count = seq.length;
      double sum = 0;
      for (Measurable m : seq) {
         sum += m.getMeasure();
      }
      return count == 0 ? 0 : sum / count;
   }

   public static Measurable largest(Measurable[] objects) {
      Measurable result = objects[0];
      for (Measurable object : objects) {
         if (object.getMeasure() > result.getMeasure()) {
            result = object;
         }
      }
      return result;
   }

   public static void main(String[] args) {
      Employee[] staff = new Employee[3];

      staff[0] = new Employee("Harry Hacker", 35000);
      staff[1] = new Employee("Carl Cracker", 75000);
      staff[2] = new Employee("Tony Tester",  38000);

      // Find the Average salary - Exercise 1
      System.out.println("Average salary= " + average(staff));

      // Find the largest salary - Exercise 2
      // Have to cast since name is part of Employee and not part of Measurable.
      Employee large = (Employee) largest(staff);
      System.out.println("Name of emloyee with argest salary= " + large.getName());
   }
}
