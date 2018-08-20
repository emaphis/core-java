/*
 * Chapter 5 Sec 3 - Interfaces
 * Implements Action listener
 */
package vol1.chap06.sec02;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

/**
 * Class implements ActionListener for a timer
 * @author emaphis
 */
public class TimePrinter implements ActionListener {

   @Override
   public void actionPerformed(ActionEvent event) {
      System.out.println("At the tone, the time is " + new Date());
      Toolkit.getDefaultToolkit().beep();
   }
}
