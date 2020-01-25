/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exercise 8
 * Exceptions
 */
package impatient.ch05.exercises;

/*
For this exercise, you’ll need to read through the source code of the
java.util.Scanner class. If input fails when using a Scanner, the Scanner class
catches the input exception and closes the resource from which it consumes
input. What happens if closing the resource throws an exception?
How does this implementation interact with the handling of suppressed
exceptions in the try-with-resources statement?
 look in the source of the JDK :
-- <https://github.com/openjdk/jdk>
-- /src/java.base/share/classes/java/util/Scanner.java

    public void close() {
        if (closed)
            return;
        if (source instanceof Closeable) {
            try {
                ((Closeable)source).close();
            } catch (IOException ioe) {
                lastException = ioe;
            }
        }

        sourceClosed = true;
        source = null;
        closed = true;
    }

*/

/**
 * @author emaphis
 */
public class Ex08 {}
