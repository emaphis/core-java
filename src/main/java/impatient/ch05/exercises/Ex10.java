/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * exercise 10
 */
package impatient.ch05.exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
The methods of the Scanner and PrintWriter classes do not throw checked
exceptions to make them easier to use for beginning programmers. How
do you find out whether errors occurred during reading or writing? Note
that the constructors can throw checked exceptions. Why does that defeat
the goal of making the classes easier to use for beginners?
*/

/*
You can catch exceptions manually, or jest let the program fail on error.
Yes, checked errors for constuctors does complicate use for biginners.
*/

/**
 * @author emaphis
 */
public class Ex10 {

   public static void main(String[] args) {

      File file = new File("resources//doubles.txt");

      Scanner in;
      // manditory exception handling
      try {
         in = new Scanner(file);
      } catch (FileNotFoundException ex) {
         System.err.println("File not found");
         return;
      }

      // manual exception handling...
      try {
         while (in.hasNext()) {
            double d = in.nextDouble();
            System.out.println("d: " + d);
         }
      }
      catch (IllegalStateException | InputMismatchException ex) {
         System.err.println(ex.toString());
      }
   }
}
