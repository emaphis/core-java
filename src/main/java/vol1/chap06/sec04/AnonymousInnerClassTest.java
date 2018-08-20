/*
 * Chapter 4 Sec 6 - Inner classes
 * Aonymous Inner class
 */
package vol1.chap06.sec04;

import javax.swing.*;

/**
 *
 * @author emaphis
 */
public class AnonymousInnerClassTest {
   public static void main(String[] args) {
      TalkingClock2 clock = new TalkingClock2();
      clock.start(1000, true);

      // keep program running util user selects "Ok"
      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }
}
