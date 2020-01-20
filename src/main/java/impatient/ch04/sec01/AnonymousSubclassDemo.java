/*
 * Chapter 4 Inheritance and Reflection
 * Sec 1 Extending a Class
 * Anonymous Subclasses
 */

package impatient.ch04.sec01;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author emaphis
 */
public class AnonymousSubclassDemo {

   public static void main(String[] args) {
      example1();
      example1b();
      example2();
   }

   static void example1() {
      ArrayList<String> names = new ArrayList<String>(100) {
         @Override
         public void add(int index, String element) {
            super.add(index, element);
            System.out.printf("Adding %s at %d\n", element, index);
         }
      };

      names.add(0, "Moe");
      names.add(1, "Larry");
      names.add(2, "Curley");
   }

   static void example1b() {
      ArrayList<String> names = new ArrayList<String>(100) {
         @Override
         public void add(int index, String element) {
            super.add(index, element);
            System.out.printf("Adding %s at %d\n", element, index);
         }
         {  // intialization block
            add(0, "Peter");
            add(1, "Paul");
            add(2, "Mayr");
         }
      };
   }

   static void example2() {
      ArrayList<String> friends = new ArrayList<>();
      friends.add("Harry");
      friends.add("Sally");
      invite(friends);

      // anonymous class: { initialization block: {...} };
      invite(new ArrayList<>() {{ add("Harry"); add("Sally"); }});
   }

   static void invite(List<String> friends) {
      System.out.println("Guest list: " + friends);
   }
}
