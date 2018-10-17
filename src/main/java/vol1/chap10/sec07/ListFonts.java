/*
 * Chapter 10 Graphics Programming
 * Section 07 Fonts
 */
package vol1.chap10.sec07;

import java.awt.*;

/**
 * List fonts
 * @author emaphis
 */
public class ListFonts {
   public static void main(String[] args) {
      String[] fontNames = GraphicsEnvironment
            .getLocalGraphicsEnvironment()
            .getAvailableFontFamilyNames();
      for (String fontName : fontNames) {
         System.out.println(fontName);
      }
   }
}
