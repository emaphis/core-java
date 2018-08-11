/*
 * Test the Person class hiarchy
 */
package vol1.chap05.sec01;

/**
 *
 * @author emaphis
 */
public class PersonTest {
   
   public static void main(String[] args) {
      Person[] people = new Person[2];

      // fill the people array wiht Student and Employee objects
      people[0] = new Employee2("Harry Hacker", 50000, 1989, 10, 1);
      people[1] = new Student("Maria Morris", "computer science");

      // print out name and descriptions of all Person objects
      for (Person p : people) {
         System.out.println(p.getName() + ", " + p.getDescription());
      }
   }
}
