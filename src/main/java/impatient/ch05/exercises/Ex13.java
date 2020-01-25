/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exercise 13
 */
package impatient.ch05.exercises;

import java.util.Arrays;
import java.util.Random;

/*
Write a method int min(int[] values) that, just before returning the smallest
value, asserts that it is indeed ≤ all values in the array. Use a private
helper method or, if you already peeked into Chapter 8, Stream.allMatch.
Call the method repeatedly on a large array and measure the runtime
with assertions enabled, disabled, and removed

Times with assertions turned on:
time: 32
time: 31
time: 31
time: 16
time: 22
time: 31
time: 16
time: 15
time: 22
time: 32
time: 15
time: 31
time: 23
time: 31
time: 15

Times with assertions turned off:
time: 40
time: 40
time: 29
time: 25
time: 16
time: 31
time: 16
time: 38
time: 25
time: 22
time: 16
time: 38
time: 25
time: 22
time: 15

Dont see much difference.s
*/


/**
 * @author emaphis
 */
public class Ex13 {

   static int min(int[] value) {
      int num = value[0];
      for (int i  = 1; i < value.length; i++) {
         if (value[i] < num) num = value[i];
      }
      final int finalNum = num;
      assert Arrays.stream(value).allMatch(i -> i >= finalNum) : "**** Error ****";
      return num;
   }

   static long timeMin(int[] array){
      long start = System.currentTimeMillis();
      min(array);
      long end = System.currentTimeMillis();
      return end - start;
   }

   public static void main(String[] args) {
      int[] array = new int[10_000_000];
      Random rand = new Random();

      for (int i = 0; i < array.length; i++) {
         array[i] = rand.nextInt();
      }

      // Run timings
      for (int i = 0; i < 15; i++) {
         System.out.println("time: " + timeMin(array));
      }
   }
}
