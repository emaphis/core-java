/*
 * Exercising the Package system.
 * Chapter 4 Section 7s
 */
package PackageTest;

import org.core.java.*;

import static java.lang.System.*;

/**
 *
 * @author emaphis
 */
public class PackageTest {
   public static void main(String[] args) {
      // because of the import statement, we don't have to use
      // org.core.java.Employee here.
      Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

      harry.raiseSalary(5);

      // because of the static import statement. we don't have to use System.out here
      out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
   }
}
