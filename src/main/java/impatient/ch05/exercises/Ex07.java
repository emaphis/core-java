/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exercise 7
 * Exceptions
 */
package impatient.ch05.exercises;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author emaphis
 */
public class Ex07 {

   // Explain why

   static void version1(String outputFile) throws FileNotFoundException, IOException {
      try (Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
      PrintWriter out = new PrintWriter(outputFile)) {
      while (in.hasNext())
         out.println(in.next().toLowerCase());
      }
   }

   // is better than

   static void version2(String outputFile) throws FileNotFoundException, IOException {
      Scanner in = new Scanner(Paths.get("/usr/share/dict/words"));
      PrintWriter out = new PrintWriter(outputFile);
      try (in; out) {
         while (in.hasNext())
            out.println(in.next().toLowerCase());
      }
   }
}
