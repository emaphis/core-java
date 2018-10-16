/*
 * Chapter 10 Graphics Programming
 * Section 4 Display8ng information in a Component
 */
package vol1.chap10.sec04;

//import java.awt.*;
import javax.swing.*;

/**
 *
 * @author emaphis
 */
public class NotHelloWorldFrame extends JFrame {

   public NotHelloWorldFrame() {
      add(new NotHelloWorldComponent());
      pack();
   }
}
