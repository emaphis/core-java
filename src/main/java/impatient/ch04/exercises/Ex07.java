/*
 * Chapter 4  Inheritance and Reflection
 * Exercises
 */
package impatient.ch04.exercises;

/*
Define an enumeration type for the eight combinations of primary colors
BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE with methods getRed, getGreen,
and getBlue.
*/

/*
 * @author emaphis
 */
public class Ex07 {

   public static void main(String[] args) {
      printColorComponents("Red", Colors.RED);
      printColorComponents("Magenta", Colors.MAGENTA);
      printColorComponents("Black", Colors.BLACK);
   }

   static void printColorComponents(String colorName, Colors color) {
      System.out.println(colorName + " is composed of:");
      System.out.println("  " + color.getRed() + " of Red");
      System.out.println("  " + color.getGreen() + " of Green");
      System.out.println("  " + color.getBlue() + " of Blue");
      System.out.println();
   }
}
