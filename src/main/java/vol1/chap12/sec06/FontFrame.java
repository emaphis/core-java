/*
 * Chapter 12 User Interface Components
 * Section 6 Layouts -  Grid Bag Layout
 */
package vol1.chap12.sec06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.core.java.GBC;

/**
 * A frame that uses a grid bag layout to arrange font selection components.
 * @author emaphis
 */
public class FontFrame extends JFrame {

   public static final int TEXT_ROWS = 10;
   public static final int TEXT_COLUMNS = 20;

   private final JComboBox<String> face;
   private final JComboBox<Integer> size;
   private final JCheckBox bold;
   private final JCheckBox italic;
   private final JTextArea sample;

   public FontFrame() {

      var layout = new GridBagLayout();
      setLayout(layout);

      ActionListener listener = event -> updateSample();

      // constuct components
      var faceLabel = new JLabel("Face: ");
      face = new JComboBox<>(new String[] { "Serif", "SansSerif", "Monospaced",
            "Dialog", "DialogInput"});
      face.addActionListener(listener);

      var sizeLabel = new JLabel("Size: ");
      size = new JComboBox<>(new Integer[] { 8, 10, 12, 15, 18, 24, 36, 48 });
      size.addActionListener(listener);

      bold = new JCheckBox("Bold");
      bold.addActionListener(listener);

      italic = new JCheckBox("Italic");
      italic.addActionListener(listener);

      sample = new JTextArea(TEXT_ROWS, TEXT_COLUMNS);
      sample.setText("The quick brown fox jumps over the lazy dog.");
      sample.setEditable(false);
      sample.setLineWrap(true);
      sample.setBorder(BorderFactory.createEtchedBorder());

      // add components to grid using GBC convenience class
      add(faceLabel, new GBC(0, 0).setAnchor(GBC.EAST));
      add(face, new GBC(1, 0).setFill(GBC.HORIZONTAL).setWeigh(100, 0).setInsets(1));

      add(sizeLabel, new GBC(0, 1).setAnchor(GBC.EAST));
      add(size, new GBC(1,1).setFill(GBC.HORIZONTAL).setWeigh(100, 0).setInsets(1));

      add(bold, new GBC(0, 2, 2, 1).setAnchor(GBC.CENTER).setWeigh(100, 100));
      add(italic, new GBC(0, 3, 2, 1).setAnchor(GBC.CENTER).setWeigh(100, 100));
      add(sample, new GBC(2, 0, 1, 4).setFill(GBC.BOTH).setWeigh(100, 100));
      pack();
      updateSample();
   }

   public void updateSample() {
      var fontFace = (String) face.getSelectedItem();
      int fontStyle = (bold.isSelected() ? Font.BOLD : 0)
            + (italic.isSelected() ? Font.ITALIC : 0);
      int fontSize = size.getItemAt(size.getSelectedIndex());
      var font = new Font(fontFace, fontStyle, fontSize);
      sample.setFont(font);
      sample.repaint();
   }
}
