/*
 * Chapter 12 User Interface Components
 * Section 5 Menus.
 */
package vol1.chap12.sec05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A frame with a toolbar and menu for color changes.
 * @author emaphis
 */
public class ToolBarFrame extends JFrame {

   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HIEGHT = 200;
   private JPanel panel;

   public ToolBarFrame() {
      setSize(DEFAULT_WIDTH, DEFAULT_HIEGHT);

      // add panel for colr change
      panel = new JPanel();
      add(panel, BorderLayout.CENTER);

      // set up actions
      var blueAction = new ColorAction("Blue", new ImageIcon("./src/main/resources/blue-ball.gif"), Color.BLUE);
      var yellowAction = new ColorAction("Yellow", new ImageIcon("./src/main/resources/yellow-ball.gif"), Color.YELLOW);
      var redAction = new ColorAction("Red", new ImageIcon("./src/main/resources/red-ball.gif"), Color.RED);

      Action exitAction = new AbstractAction("Exit", new ImageIcon("./src/main/resources/exit.gif")) {
         @Override
         public void actionPerformed(ActionEvent event) {
            System.exit(0);
         }
      };
      exitAction.putValue(Action.SHORT_DESCRIPTION, "Exit");

      // populate toolbar
      var bar = new JToolBar();
      bar.add(blueAction);
      bar.add(yellowAction);
      bar.add(redAction);
      bar.addSeparator();
      bar.add(exitAction);
      add(bar, BorderLayout.NORTH);

      // populate menu
      var menu = new JMenu("Color");
      menu.add(yellowAction);
      menu.add(blueAction);
      menu.add(redAction);
      menu.add(exitAction);
      var menuBar = new JMenuBar();
      menuBar.add(menu);
      setJMenuBar(menuBar);
   }

   /**
    * The color action set the background of the frame to a given color.
    */
   class ColorAction extends AbstractAction {

      public ColorAction(String name, Icon icon, Color c) {
         putValue(Action.NAME, name);
         putValue(Action.SMALL_ICON, icon);
         putValue(Action.SHORT_DESCRIPTION, name + " background");
         putValue("Color", c);
      }

      @Override
      public void actionPerformed(ActionEvent e) {
         var c = (Color) getValue("Color");
         panel.setBackground(c);
      }
   }
}

