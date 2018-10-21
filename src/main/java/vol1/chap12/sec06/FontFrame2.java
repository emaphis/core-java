/*
 * Chapter 12 User Interface Components
 * Section 6 Layouts - Group layout
 */
package vol1.chap12.sec06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.core.java.GBC;

/**
 * A frame that uses a group layout to arrange font selection components.
 * @author emaphis
 */
public class FontFrame2 extends JFrame {

   public static final int TEXT_ROWS = 10;
   public static final int TEXT_COLUMNS = 20;

   private final JComboBox<String> face;
   private final JComboBox<Integer> size;
   private final JCheckBox bold;
   private final JCheckBox italic;
   private final JScrollPane pane;
   private final JTextArea sample;

   public FontFrame2() {

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

      //  *** add components to grid using GBC convenience class

      pane = new JScrollPane(sample);

      var layout = new GroupLayout(getContentPane());
      setLayout(layout);

      layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                  layout.createSequentialGroup().addContainerGap().addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
                              GroupLayout.Alignment.TRAILING,
                              layout.createSequentialGroup().addGroup(
                                    layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                          .addComponent(faceLabel).addComponent(sizeLabel))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(
                                          layout.createParallelGroup(
                                                GroupLayout.Alignment.LEADING, false)
                                                .addComponent(size).addComponent(face)))
                              .addComponent(italic).addComponent(bold)).addPreferredGap(
                        LayoutStyle.ComponentPlacement.RELATED).addComponent(pane)
                        .addContainerGap()));

      layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[]{face, size});

      layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(
                  layout.createSequentialGroup().addContainerGap().addGroup(
                        layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(
                              pane, GroupLayout.Alignment.TRAILING).addGroup(
                                    layout.createSequentialGroup().addGroup(
                                          layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(face).addComponent(faceLabel))
                                          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                          .addGroup(
                                                layout.createParallelGroup(
                                                      GroupLayout.Alignment.BASELINE).addComponent(size)
                                                      .addComponent(sizeLabel)).addPreferredGap(
                                          LayoutStyle.ComponentPlacement.RELATED).addComponent(
                                                italic, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                          .addComponent(bold, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap()));
      pack();
//      updateSample();
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
