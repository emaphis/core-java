package awt_examples;

/*
 * AWT Examples.
 */

import java.awt.*;
import java.awt.event.*;
import vol1.chap05.exercises.Circle;

/**
 *
 * @author emaphis
 */
public class example_02 extends Frame
   implements ActionListener, AdjustmentListener {

   public static void main(String[] args) {
      Frame frame = new example_02();
      frame.setVisible(true);

   }

   CircleCanvas cirlce;
   Scrollbar scrollR;
   Scrollbar scrollG;
   Scrollbar scrollB;

   public example_02() throws HeadlessException {
      setSize(500, 250);
      MenuBar menuBar = new MenuBar();
   }


   @Override
   public void actionPerformed(ActionEvent e) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   @Override
   public void adjustmentValueChanged(AdjustmentEvent e) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

}


class CircleCanvas extends Canvas {
   private Color color = Color.black;

   public CircleCanvas() {
      setBackground(new Color(220, 220, 220));
   }

   @Override
   public void paint(Graphics g) {
      super.paint(g);
      g.setColor(color);
      int w = getWidth();
      int h = getHeight();
      int d = (w > h) ? h : w;
      d -= 30;
      g.fillOval((w-d)/2, (h-d)/2, d, d);
   }

   public void setColor(Color c) {
      color = c;
      repaint();
      }
 }
}


}