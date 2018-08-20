/*
 * Chapter 6 Sec 2
 * Interfaces
 */
package vol1.chap06.sec02;

//import java.awt.event.*;
import java.awt.event.*;
//import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Test the Timer class
 * @author emaphis
 */
public class TimerTest {
   public static void main(String[] args) {
      ActionListener listener = new TimePrinter();

      // constructs a timer that call the listener
      // once every 10 seconds
      Timer t = new Timer(10000, listener);
      t.start();

      JOptionPane.showMessageDialog(null, "Quit Program");
      System.exit(0);
   }
}
