/*
 * Chapter 12 User Interface Components
 * Section 2 Layout managment
 */
package vol1.chap12.sect02;


import javax.swing.*;

/**
 * A frame containing a panel presenting a calculator
 * @author emaphis
 */
public class CalculatorFrame extends JFrame {

   public CalculatorFrame() {
      add(new CalculatorPanel());
      pack();
   }

}
