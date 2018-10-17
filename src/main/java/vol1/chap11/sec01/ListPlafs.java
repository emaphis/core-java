/*
 * Chapter 11 Event Handling
 * Section 1 Events
 */
package vol1.chap11.sec01;

import javax.swing.UIManager;

/**
 * List Platforms Look-and-Feels
 * @author emaphis
 */
public class ListPlafs {
   public static void main(String[] args) {
      UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
      for (UIManager.LookAndFeelInfo info : infos) {
         System.out.println(info.getName());
      }
   }
}

/*
   Metal
   Nimbus
   CDE/Motif
   Windows
   Windows Classic
*/
