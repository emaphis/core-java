/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exercise 3
 */
package impatient.ch05.exercises;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Write a program that calls the preceding method and prints the result.
Catch the exceptions and provide feedback to the user about any error
conditions
*/

/**
 * @author emaphis
 */
public class Ex03 {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a file name of a file of doubles: ");
      String filename = in.nextLine();

      try {
         double sum = Ex02.sumOfValues(filename);
         System.out.println("sum = " + sum);
      }
      catch(InputMismatchException ex) {
         System.err.println("File " + filename + " shoule contain all doubles.");
      } catch (FileNotFoundException ex) {
         System.err.println("File " + filename + " doesn't exist.");
      }
   }
}
