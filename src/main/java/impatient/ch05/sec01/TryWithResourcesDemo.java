/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Sec 1  Exception Handling
 *   1.5  Try-with-Resources Statement
 */
package impatient.ch05.sec01;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author emaphis
 */
public class TryWithResourcesDemo {

   public static void main(String[] args) throws IOException {
      List<String> lines = List.of("Mary had a little lamb. Its fleece was white as snow.".split(" "));
      try (PrintWriter out = new PrintWriter("resources//output.txt")) {
         for (String line : lines) {
            out.println(line.toLowerCase());
         }
      }

      try (Scanner in = new Scanner(Paths.get("resources//words"));
            PrintWriter out = new PrintWriter("resources//output.txt")) {
         while (in.hasNext())
            out.println(in.next().toLowerCase());
      }
   }

   public static void print(Scanner in, PrintWriter out) {
      try (in; out) {  // Effectively final variable.
         while (in.hasNext())
            out.println(in.next().toLowerCase());
      }
   }
}
