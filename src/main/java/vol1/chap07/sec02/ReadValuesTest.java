/*
 * Chapter 10 - Exceptions and logging
 * Exercise 1,2,3
 */
package vol1.chap07.sec02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 * Define and test readValues
 * @author emaphis
 */
public class ReadValuesTest {

   // Exercise 1
   public ArrayList<Double> readValues(String filename)
         throws FileNotFoundException {
      if (filename == null || filename.isEmpty())
         throw new IllegalArgumentException("bad filename");
      File input = new File(filename);
      Scanner scanner = new Scanner(input);
      ArrayList<Double> array = new ArrayList<>();
      while (scanner.hasNextDouble()) {
         double num = scanner.nextDouble();
         array.add(num);
      }
      return array;
   }

   // Exercise 2
   public double sumOfValues(String fileName)
         throws FileNotFoundException {
      ArrayList<Double> array = readValues(fileName);
      double ret  = 0.0;
      for (double d : array)
         ret += d;
      return ret;
   }
      
   // Exercise 3
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a filename to be read: ");
      String fileName = scan.nextLine();

      ReadValuesTest readValue = new ReadValuesTest();
      try {
         /*
         // ex 1
         ArrayList<Double> array = readValue.readValues(fileName);
         for (Double d : array) {
            System.out.println("num: " + d);
         }
         */
         // ex 2
         double d = readValue.sumOfValues(fileName);
         System.out.println("sum= " + d);
      } catch (FileNotFoundException ex) {
         System.err.println("File not found: " + ex.getMessage());
      } catch (IllegalArgumentException ex) {
         System.out.println("File error: " + ex.getMessage());
      }
   }
}
