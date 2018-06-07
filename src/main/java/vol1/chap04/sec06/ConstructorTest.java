/*
 * Examples of the use of Java class contructors.
 * Chp 4 sec 6
 */
package vol1.chap04.sec06;



/**
 *
 * @author emaphis
 */
public class ConstructorTest {
   public static void main(String[] args) {
      // fill the staff array with Employee objects
      Employee[] staff = new Employee[3];

      staff[0] = new Employee("Harry", 40000);
      staff[1] = new Employee(60000);
      staff[2] = new Employee();

      // print out information about all Employee objects
      for (Employee e : staff) {
         System.out.println("name=" + e.getName() + ",id=" + e.getId() +
               ",salary=" + e.getSalary());
      }

   }
}
