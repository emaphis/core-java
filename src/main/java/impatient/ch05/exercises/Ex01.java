/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exercise 1, 2, 3
 */
package impatient.ch05.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Write a method public ArrayList<Double> readValues(String filename) throws ... that
reads a file containing floating-point numbers. Throw appropriate exceptions
if the file could not be opened or if some of the inputs are not
floating-point numbers.
*/

/**
 * @author emaphis
 */
public class Ex01 {

   static public ArrayList<Double> readValues(String filename)
         throws FileNotFoundException, InputMismatchException {
      ArrayList<Double> list = new ArrayList<>();
      File file = new File(filename);
      Scanner in = new Scanner(file);
      try {
         while (in.hasNext()) {
            list.add(in.nextDouble());
         }
      }
      catch (InputMismatchException ex) {
         throw ex;
        // System.err.println(ex.toString());
      }
      finally {
          in.close();
      }

      return list;
   }

   public static void main(String[] args) {
      try {
         List<Double> list = readValues("resources//doubles.txt");
         for (Double double1 : list) {
            System.out.println(double1);
         }
      } catch (FileNotFoundException | InputMismatchException ex) {
         System.out.println("***** Error *****");
         Logger.getLogger(Ex01.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
}
