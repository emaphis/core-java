/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exersice 2
 */
package impatient.ch05.exercises;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Write a method public double sumOfValues(String filename) throws ... that calls
the preceding method and returns the sum of the values in the file.
Propagate any exceptions to the caller.
*/

/**
 * @author emaphis
 */
public class Ex02 {

   static public double sumOfValues(String filename) throws FileNotFoundException {
      List<Double> list = Ex01.readValues(filename);
      double sum = 0;
      for (Double double1 : list) {
         sum += double1;
      }
      return sum;
   }

   public static void main(String[] args) {
      try {
         double sum = sumOfValues("resources//doubles.txt");
         System.out.println("sum=" + sum);
      } catch (FileNotFoundException | InputMismatchException ex) {
         Logger.getLogger(Ex02.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
}
