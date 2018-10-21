/*
 * Chapter 12 User Interface Components
 * Section 6 - Custom layouts
 */
package vol1.chap12.sec06;

import java.awt.Button;
import javax.swing.*;

/**
 * A frame that shows buttons arranged along a circle
 * @author emaphis
 */
public class CircleLayoutFrame extends JFrame {

   public CircleLayoutFrame() {

      setLayout(new CircleLayout());
      add(new Button("Yellow"));
      add(new Button("Blue"));
      add(new Button("Red"));
      add(new Button("Green"));
      add(new Button("Orange"));
      add(new Button("Fuschia"));
      add(new Button("Indigo"));
      pack();
   }
}
