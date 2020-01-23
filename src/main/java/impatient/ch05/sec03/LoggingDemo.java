/*
 * Chapter 5  Exceptions, Assertions, and Logging
 * Sec 3  Logging
 */
package impatient.ch05.sec03;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emaphis
 */
public class LoggingDemo {

   public static void main(String[] args) {
      // 5.3.1 Using Loggers
      Logger.getGlobal().info("Starting program");
      Logger.getGlobal().setLevel(Level.OFF);
      Logger.getGlobal().info("Global logger turned off");

      // 5.3.2 Loggers - 5.3.6 Log Hadlers
      Logger logger = Logger.getLogger("com.leroydev.impatient");
      logger.setLevel(Level.FINE);
      logger.fine("Set logger to fine");
      logger.setUseParentHandlers(false);
      Handler handler = new ConsoleHandler();
      logger.addHandler(handler);
      logger.fine("Configured handler");
   }
}
