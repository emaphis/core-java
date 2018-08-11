/*
 * Creating your own classes
 */
package vol1.chap04.sec04;

/**
 * Program to test static methods.
 * @author emaphis
 */
public class StaticTest {
   public static void main(String[] args) {
      // fill the staff array with three Employee objects
      Employee[] staff = new Employee[3];

      staff[0] = new Employee("Tom", 40000);
      staff[1] = new Employee("Dick", 60000);
      staff[2] = new Employee("Harry", 65000);

      // print out information about all Employee objects
      for (Employee e : staff) {
         e.setId();
         System.out.println("name=" + e.getName() + ",id=" + e.getId() +
               ",salary=" + e.getSalary());
      }

      int n = Employee.getNextId();  // calls static method
      System.out.println("Next available id=" + n);
   }
}