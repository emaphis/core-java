/*
 * Chapter 6 Section 4
 * Inner classes
 */
package vol1.chap06.sec04;

import javax.swing.JOptionPane;

/**
 * Test the TalkinClock class with an inner class.
 * @author emaphis
 */
public class InnerClassTest {
   public static void main(String[] args) {
      TalkingClock clock = new TalkingClock(1000, true);
      clock.start();

      // keep program running uitil use selects "Ok"
      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }
}
