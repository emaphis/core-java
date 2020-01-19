/*
 * Chapter 3 Interfaces and Lambda Expressions
 * Exercises
 */
package impatient.ch03.exercises;


/*
What are all the supertypes of String? Of Scanner? Of ImageOutputStream? Note
that each type is its own supertype. A class or interface without declared
supertype has supertype Object.
*/


/**
 *
 * @author emaphis
 */
public class Ex03 {
   public static void main(String[] args) {
      // See: <https://docs.oracle.com/en/java/javase/13/core/java-core-libraries1.html>

      // String: Serializable, Comparable<String>, and CharSequence
      // Scanner: Closeable, AutoCloseable, Iterator<String>
      // ImageOutputStream: AutoCloseable, Closeable, DataInput, DataOutput, ImageInputStream
   }
}
