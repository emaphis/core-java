/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Sec 1  Exception Handling
 *   1.7  Stack traces.
 */
package impatient.ch05.sec01;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author emaphis
 */
public class StackTraceDemo {

   public static void bad() {
      System.out.println(1 / 0);
   }

   public static void goodOrBad(boolean ok) {
      if (ok) good(); else bad();
   }

   public static void good() {
      StackWalker walker = StackWalker.getInstance();
      walker.forEach(frame -> System.err.println("Frame: " + frame));
   }

   public static void main(String[] args) {
      try {
         goodOrBad(false);
      } catch (Exception ex) {
         ByteArrayOutputStream out = new ByteArrayOutputStream();
         ex.printStackTrace(new PrintStream(out));
         String description = out.toString();
         System.out.println("The stack trace in a string: " + description.replaceAll("\\s+", " "));
      }
      goodOrBad(true);
   }
}
