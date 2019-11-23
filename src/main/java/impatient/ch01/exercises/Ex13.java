/*
 * Exercises chap 13
 * Ex13.java
 */
package impatient.ch01.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Write a program that prints a lottery combination, picking six distinct
 * numbers between 1 and 49. To pick six distinct numbers, start with an
 * array list filled with 1...49. Pick a random index and remove the element.
 * Repeat six times. Print the result in sorted order.
 * @author emaphis
 */
public class Ex13 {
   public static void main(String[] args) {
      Random generator = new Random();
      final int num_picks = 6;
      ArrayList<Integer> balls = new ArrayList<>();
      ArrayList<Integer> picks = new ArrayList<>(num_picks);

      for (int i = 1; i < 50; i++) {
         balls.add(i);
      }

      for (int i =  0; i < num_picks; i++) {
         int pick = generator.nextInt(balls.size());
         picks.add(balls.remove(pick));
      }

      Collections.sort(picks);
      System.out.println("Lottery picks: " + picks);
   }
}
