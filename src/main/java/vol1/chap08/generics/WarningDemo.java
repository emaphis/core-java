/*
 * Chapter 8 Generics
 * Section Generics
 */
package vol1.chap08.generics;

/**
 *
 * @author emaphis
 */
public class WarningDemo {
   @SuppressWarnings("unchecked")
   public static void main(String[] args) {
      Box<Integer> bi;
      bi = createBox();
   }

   static Box createBox() {
      return new Box();
   }
}
