/*
 * Chapter 4 Sec 6 - Inner classes
 * Aonymous Inner class
 */
package vol1.chap06.sec04;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
import javax.swing.Timer;


/**
 * A clock that prints the time in regular intervals
 * @author emaphis
 */
class TalkingClock2 {

   /**
    * Starts the clock
    * @param interval the interval between messages
    * @param beep true if the clock should beep
    */
   void start(int interval, boolean beep) {
      // Create anonymous local class.
      ActionListener listener = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
         }
      };
      Timer t = new Timer(interval, listener);
      t.start();
   }
   
}
