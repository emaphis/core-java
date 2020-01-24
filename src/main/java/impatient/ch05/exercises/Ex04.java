/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Sec 3  Logging
 *   3.1  Using Loggers
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
Repeat the preceding exercise, but don’t use exceptions. Instead, have
readValues and sumOfValues return error codes of some kind.
*/

/**
 * @author emaphis
 */
public class Ex04 {
   public enum SumStatus { GOOD, BAD_DATA, FILE_NOT_FOUND };

   static public SumStatus sumOfValues(String filename,List<Double> list) {
      SumStatus status = readValues(filename, list);
      if (status == SumStatus.GOOD) {
         double sum = 0;
         for (Double double1 : list) {
            sum += double1;
         }
         list.add(0, sum);  // Don;t like this
      }
      return status;
   }

   static public SumStatus readValues(String filename, List<Double> list) {
      //list = new ArrayList<>();
      try {
         File file = new File(filename);
         try (Scanner in = new Scanner(file)) {
            while (in.hasNext()) {
               list.add(in.nextDouble());
            }
            return SumStatus.GOOD;
         }
      }
      catch (InputMismatchException ex) {
         System.err.println("******** Bad Data *******************");
         return SumStatus.BAD_DATA;
      } catch (FileNotFoundException ex) {
         return SumStatus.FILE_NOT_FOUND;
      }
   }

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a file name of a file of doubles: ");
      String filename = in.nextLine();

      //SumStatus status = SumStatus.GOOD;
      ArrayList<Double> list = new ArrayList<>();
      SumStatus status = sumOfValues(filename, list);
      if (status == SumStatus.GOOD) {
         System.out.println("sum = " + list.get(0));
      } else if (status == SumStatus.BAD_DATA) {
         System.err.println("File " + filename + " should contain all doubles.");
      } else {
         System.err.println("File " + filename + " doesn't exist.");
      }
   }
}
