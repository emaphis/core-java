/*
 * ArrayDemo.java
 * 1.8 Arrays
 */
package impatient.ch01.sec08;

import java.util.Arrays;

/**
 * Demo of arrays in java
 * @author emaphis
 */
public class ArrayDemo {
   public static void main(String[] args) {
      String[] names = new String[10];
      for (int i = 0; i < names.length; i++) {
         names[i] = "";
      }
      names[0] = "Fred";
      names[1] = names[0];
      System.out.println("names=" + Arrays.toString(names));

      int[] primes1 = { 17, 19, 23, 29, 31 };
      int[] primes2 = new int[] { 2, 3, 5, 7, 11, 13 };

      // enhanced for loop
      int sum = 0;
      for (int n : primes2) {
         sum += n;
      }
      System.out.println("sum=" + sum);

      // Alliasing and copying
      int[] numbers = primes2;
      numbers[5] = 42; // opps, also changes primes2;
      System.out.println("primes=" + Arrays.toString(primes2));

      primes2[5] = 13;
      int[] copiedPrimes = Arrays.copyOf(primes2, primes2.length);
      copiedPrimes[5] = 31;  // Doesn't change primes
      System.out.println("primes=" + Arrays.toString(primes2));
      System.out.println("copiedPrimes=" + Arrays.toString(copiedPrimes));
   }
}
