/*
 * Chapter 2 - Classes
 * Reference Demo
 */
package impatient.ch02.sec01;

import java.util.ArrayList;

/**
 * Accessor and Mutator methods
 * Object References
 * @author emaphis
 */
public class ReferenceDemo {
   public static void main(String[] args) {
      ArrayList<String> friends = new ArrayList<>();
      friends.add("Peter");  // size 1
      ArrayList<String> people = friends; // refers to same object.
      people.add("Paul");
      System.out.println("friends: " + friends);
   }
}
