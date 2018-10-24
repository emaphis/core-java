/*
 * Chapter 14 Concurrency.
 * Section 1 Threads
 */
package vol1.chap14.sec01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The fame with panel and buttons
 * @author emaphis
 */
public class BounceFrame2 extends JFrame {

   private final BallComponent comp;
   private static final int STEPS = 1000;
   public static final int DELAY = 5;

   /**
    * Constructs the frame with the component for showing the bouncing ball and
    * Start and Close buttons
    */
   public BounceFrame2() {
      setTitle("Bounce");
      comp = new BallComponent();
      add(comp, BorderLayout.CENTER);
      var buttonPanel = new JPanel();
      addButton(buttonPanel, "Start", event -> addBall());
      addButton(buttonPanel, "Close", event -> System.exit(0));
      add(buttonPanel, BorderLayout.SOUTH);
      pack();
   }

   /**
    * Adds a button to a container.
    * @param c the container
    * @param title the button title
    * @param listener the button's action listener
    */
   public void addButton(Container c, String title, ActionListener listener) {
      var button = new JButton(title);
      c.add(button);
      button.addActionListener(listener);
   }

   /**
    * Add a bouncing ball to the panel and makes it bounce 1000 times.
    */
   public void addBall() {
      var ball = new Ball();
      comp.add(ball);

      Runnable r = () -> {
         try {

            for (int i = 1; i <= STEPS; i++) {
               ball.move(comp.getBounds());
               comp.paint(comp.getGraphics());
               Thread.sleep(DELAY);
            }
         } catch (InterruptedException ex) {

         }
      };

      Thread t = new Thread(r);
      t.start();
   }
}
