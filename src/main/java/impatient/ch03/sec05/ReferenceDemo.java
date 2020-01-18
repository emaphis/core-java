/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Sec 5 Method and Constructor References.
 * Method References.
 */

package impatient.ch03.sec05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author emaphis
 */
public class ReferenceDemo {

   public static void main(String[] args) {
      methodReference();
      constructorReference();
   }

   static void methodReference() {

      String[] strings = { "Mary", "had", "a", "little", "lamb" };
      Arrays.sort(strings, String::compareToIgnoreCase);
      System.out.println(Arrays.toString(strings));

      ArrayList<String> list = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
      list.removeIf(Objects::isNull);
      list.forEach(System.out::println);

   }

   static void constructorReference() {
      ArrayList<String> names = new ArrayList<>();
      names.add("Peter");
      names.add("Paul");
      names.add("Mary");

      Employee[] employees = names.stream().map(Employee::new).toArray(Employee[]::new);
      for (Employee employee : employees) {
         System.out.println(employee.getName());
      }
   }

}
