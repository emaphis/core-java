/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exercise 5
 */
package impatient.ch05.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.InvalidPathException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
Implement a method that contains the code with a Scanner and a PrintWriter
in Section 5.1.5, “The Try-with-Resources Statement” (page 187). But don’t
use the try-with-resources statement. Instead, just use catch clauses. Be
sure to close both objects, provided they have been properly constructed.

You need to consider the following conditions:
• The Scanner constructor throws an exception.
• The PrintWriter constructor throws an exception.
• hasNext, next, or println throw an exception.
• out.close() throws an exception.
• in.close() throws an exception.
*/

/**
 * @author emaphis
 */
public class Ex05 {
   public static void copy(String infile, String outfile) {
      Scanner in = null;
      PrintWriter out = null;
      try {
         File inFile = new File(infile);
         in = new Scanner(inFile);
         out = new PrintWriter(outfile);
         while (in.hasNext()) {
            String line = in.nextLine();
            out.println(line.toLowerCase());
         }
      }
      catch (FileNotFoundException ex) {
         System.err.println(ex.toString());
      }
      catch (NoSuchElementException ex) {
         System.err.println(ex.toString());
      }
      catch (InvalidPathException ex) {
         System.err.println(ex.toString());
      }
      catch (IllegalStateException ex) {
         System.err.println("Performing on opperation on a clossed stream");
      }
      finally {
         if (in != null) in.close();
         if (out != null) out.close();
      }
   }

   public static void main(String[] args) {
      copy("resources//infile.txt", "resources//outfile.txt");
   }
}
