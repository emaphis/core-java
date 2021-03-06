/*
 * ArrayListDemo.java
 * 1.8 Arrays
 */
package impatient.ch01.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Demo of ArrayList
 * @author emaphis
 */
public class ArrayListDemo {
   public static void main(String[] args) {
      ArrayList<String> friends = new ArrayList<>();
      friends.add("Peter");
      friends.add("Paul");
      friends.remove(1);
      System.out.println("freinds=" + friends);
      friends.add(0, "Paul"); // Adds before index 0;
      System.out.println("freinds=" + friends);
      String first = friends.get(0);
      System.out.println("first=" + first);
      friends.set(1, "Mary");
      for (int i = 0; i < friends.size(); i++) {
         System.out.println("friend=" + friends.get(i));
      }

      ArrayList<String> people = friends; // alias
      people.set(0, "Mary");
      System.out.println("friends=" + friends);

      ArrayList<String> copiedFriends = new ArrayList<>(friends);
      copiedFriends.set(0, "Fred"); // doesn't change friends
      System.out.println("copiedFriends=" + copiedFriends);
      System.out.println("friends=" + friends);

      friends = new ArrayList<>(List.of("Peter", "Paul", "Mary"));
      String[] names = friends.toArray(new String[0]);
      System.out.println("names=" + Arrays.toString(names));

      ArrayList<String> moreFriends = new ArrayList<>(List.of(names));
      System.out.println("moreFriends=" + moreFriends);

      Collections.reverse(friends);
      System.out.println("After reversing, friends=" + friends);
      Collections.shuffle(friends);
      System.out.println("After shuffling, friends=" + friends);
      Collections.sort(friends);
      System.out.println("After sorting, friends=" + friends);
   }
}
