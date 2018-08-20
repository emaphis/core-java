/*
 * Chap 6 Sec 4 - Inner Classes
 */
package vol1.chap06.sec04;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;
import javax.swing.Timer;

/**
 * A clock that prints the time in regular intervals.
 * @author emaphis
 */
public class TalkingClock {
   private int interval;
   private boolean beep;

   /**
    * Constructs a talking clock
    * @param interval between messages
    * @param beep true if clock should beep
    */
   public TalkingClock(int interval, boolean beep) {
      this.interval = interval;
      this.beep = beep;
   }

   /**
    * Starts the clock
    */
   void start() {
      ActionListener listener = new TimePrinter();
      Timer t = new Timer(interval, listener);
      t.start();
   }

   public class TimePrinter implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {
         System.out.println("At the tone, the time is " + new Date());
         if (beep) Toolkit.getDefaultToolkit().beep();
      }

   }

}
