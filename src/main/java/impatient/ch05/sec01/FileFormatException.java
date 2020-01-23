/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Sec 1  Exception Handling
 *   1.2  The Exception Hierarchy
 *   1.7  Chainable Excetions
 */
package impatient.ch05.sec01;

import java.io.IOException;

/**
 *
 * @author emaphis
 */
public class FileFormatException extends IOException {

   public FileFormatException() {}

   public FileFormatException(String message, Throwable cause) {
      super(message);
      initCause(cause);
   }

   // Add Constructors for chained exceptions.
}
