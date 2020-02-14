/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Exersice 14
 */
package impatient.ch05.exercises;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

/*
Implement and test a log record filter that filters out log records containing
bad words such as sex, drugs, and C++.
*/

/**
 * @author emaphis
 */
public class Ex14 {


   static Logger createCustomLogger() {
      String[] blackBalled = new String[] {"sex", "drugs", "C++" };
      Filter filter = (line) ->
            Arrays.stream(blackBalled).anyMatch(predicate);
      Logger logger = Logger.getLogger(Ex13.class.getSimpleName());
      logger.setUseParentHandlers(false);
      logger.addHandler(new ConsoleHandler());
      logger.setFilter(filter);
      Arrays.stream(blackBalled);

   }

   public static class CustomLogger {
      public Logger logger;

      public CustomLogger(String name) {
         logger = Logger.getLogger(name);

         // set defaulsts.
         logger.setLevel(Level.FINE);
         logger.setUseParentHandlers(false);
      }

      public void log(String file) throws IOException {
         FileHandler handler = new FileHandler("resources/app14.log", 1000, 1, true);
         handler.setFormatter(new SimpleFormatter());
         logger.addHandler(handler);
      }


      public void filter() {

      }
   }
}
