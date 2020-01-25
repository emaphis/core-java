/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exercise 6
 */
package impatient.ch05.exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Section 5.1.6, “The finally Clause” (page 189) has an example of a broken
try statement with catch and finally clauses. Fix the code with:
(a) catching the exception in the finally clause,
(b) a try/catch statement containing a try/finally statement,
(c) a try-with-resources statement with a catch clause
*/

/**
 * @author emaphis
 */
public class Ex06 {

   // Original version.
   static String version0(Path path) {
      String result = "";
      BufferedReader in = null;
      try {
         in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
         // get first line
         result = in.readLine();
      } catch (IOException ex) {
         System.err.println("Caught IOException: " + ex.getMessage());
      } finally {
         if (in != null) {
      //      in.close(); // Caution—might throw an exception
         }
      }
      return result;
   }

   // (a) catching the exception in the finally clause,
   static String version1(Path path) {
      String result = "";
      BufferedReader in = null;
      try {
         in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
         // get first line
         result = in.readLine();
      } catch (IOException ex) {
         System.err.println("Caught IOException: " + ex.getMessage());
      } finally {
         if (in != null) {
            try {
               in.close();
            } catch (IOException ex) {
               System.err.println("Caught IOException: " + ex.getMessage());

            }
         }
      }
      return result;
   }

   // (b) a try/catch statement containing a try/finally statement,
   static String version2(Path path) {
      String result = "";
      BufferedReader in = null;
      try {
         try {
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            // get first line
            result = in.readLine();
         } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
         } finally {
            if (in != null) {
               in.close();
            }
         }
      } catch (IOException ex) {
            System.err.println("Caught IOException: " + ex.getMessage());
      }
      return result;
   }

   // (c) a try-with-resources statement with a catch clause
   static String version3(Path path) {
      String result = "";
      try (BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
         // get first line
         result = in.readLine();
      } catch (IOException ex) {
         System.err.println("Caught IOException: " + ex.getMessage());
      }
      return result;
   }

   public static void main(String[] args) {
      Path path = Paths.get("resources//infile.txt");

      String ret0 = version0(path);
      System.out.println("ret0: " + ret0);

      String ret1 = version1(path);
      System.out.println("ret1: " + ret1);

      String ret2 = version2(path);
      System.out.println("ret2: " + ret2);

      String ret3 = version3(path);
      System.out.println("ret3: " + ret3);
   }
}
