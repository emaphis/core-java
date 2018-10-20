/*
 * Chapter 12 User Interface Components
 * Section 5 Menus
 */
package vol1.chap12.sec05;

import java.awt.event.*;
import javax.swing.*;

/**
 * A frame with a sample menu bar.
 * @author emaphis
 */
public class MenuFrame extends JFrame {
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 200;
   private Action saveAction;
   private Action saveAsAction;
   private JCheckBoxMenuItem readonlyItem;
   private JPopupMenu popup;

   /**
    * A sample action that prints the action name to System.out
    */
   class TestAction extends AbstractAction {

      public TestAction(String name) {
         super(name);
      }

      @Override
      public void actionPerformed(ActionEvent event) {
         System.out.println(getValue(Action.NAME) + " selected");
      }

   }

   public MenuFrame() {
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      var fileMenu = new JMenu("File");
      fileMenu.add(new TestAction("Name"));

      // demonstrate accelerators
      JMenuItem openItem = fileMenu.add(new TestAction("Open"));
      openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));

      fileMenu.addSeparator();

      saveAction = new TestAction("Save");
      JMenuItem saveItem = fileMenu.add(saveAction);
      saveItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));

      saveAsAction = new TestAction("Save As");
      fileMenu.add(saveAsAction);
      fileMenu.addSeparator();

      fileMenu.add(new AbstractAction("Exit") {
         @Override
         public void actionPerformed(ActionEvent event) {
            System.exit(0);
         }
      });

      // demonstrate checkbox and radio buttonmenus
      readonlyItem = new JCheckBoxMenuItem("Read-only");
      readonlyItem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent event) {
            boolean saveOk = !readonlyItem.isSelected();
            saveAction.setEnabled(saveOk);
            saveAsAction.setEnabled(saveOk);
         }
      });

      var group = new ButtonGroup();

      var insertItem = new JRadioButtonMenuItem("Insert");
      insertItem.setSelected(true);
      var overtypeItem = new JRadioButtonMenuItem("Overtype");

      group.add(insertItem);
      group.add(overtypeItem);

      // demonstrate icons
      Action cutAction = new TestAction("Cut");
      cutAction.putValue(Action.SMALL_ICON, new ImageIcon("./src/main/resources/cut.gif"));
      Action copyAction = new TestAction("Copy");
      copyAction.putValue(Action.SMALL_ICON, new ImageIcon("./src/main/resources/copy.gif"));
      Action pastAction = new TestAction("Paste");
      pastAction.putValue(Action.SMALL_ICON, new ImageIcon("./src/main/resources/paste.gif"));

      var editMenu = new JMenu("Edit");
      editMenu.add(cutAction);
      editMenu.add(copyAction);
      editMenu.add(pastAction);

      // demonstrate nested menus
      var optionMenu = new JMenu("Options");
      optionMenu.add(readonlyItem);
      optionMenu.addSeparator();
      optionMenu.add(insertItem);
      optionMenu.add(overtypeItem);

      editMenu.addSeparator();
      editMenu.add(optionMenu);

      // demonstrate mnemonicx
      var helpMenu = new JMenu("Help");
      helpMenu.setMnemonic('H');

      var indexItem = new JMenuItem("Index");
      indexItem.setMnemonic('I');
      helpMenu.add(indexItem);

      // you can also add the mnemonic key to an action
      Action aboutAction = new TestAction("About");
      aboutAction.putValue(Action.MNEMONIC_KEY, new Integer('A'));
      helpMenu.add(aboutAction);

      // add all top-level menus to menu bar
      var menuBar = new JMenuBar();
      setJMenuBar(menuBar);

      menuBar.add(fileMenu);
      menuBar.add(editMenu);
      menuBar.add(helpMenu);

      // demonstrate pop-ups
      popup = new JPopupMenu();
      popup.add(cutAction);
      popup.add(copyAction);
      popup.add(pastAction);

      var panel = new JPanel();
      panel.setComponentPopupMenu(popup);
      add(panel);
   }

}
