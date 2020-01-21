/*
 * Chapter 4  Inheritance and Reflection
 * Exercises 7
 */
package impatient.ch04.exercises;

/*
Define an enumeration type for the eight combinations of primary colors
BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE with methods getRed, getGreen,
and getBlue.
*/

/**
 * @author emaphis
 */
public enum Colors {
   BLACK(0, 0, 0),
   RED(255, 0, 0),
   BLUE(0, 0, 255),
   GREEN(0, 255, 0),
   CYAN(0, 255, 255),
   MAGENTA(255, 0, 255),
   YELLOW(255, 255,0),
   WHITE(255, 255, 255);

   private final int red, green, blue;

   Colors(int red, int green, int blue) {
      this.red = red;
      this.green = green;
      this.blue = blue;
   }

   public int getRed() { return red; }
   public int getGreen() { return green; }
   public int getBlue() { return blue; }
}
