/*
 * Chapter 6 Classes
 * Section vol1.chap06.interfaces
 */
package vol1.chap06.interfaces;

/**
 *
 * @author emaphis
 */
public class Rectangle implements Relatable {
   public int width = 0;
   public int height = 0;
   public Point origin;

   // constructors
   public Rectangle() {
      origin = new Point(0, 0);
   }

   public Rectangle(Point p) {
      origin = p;
   }

   public Rectangle(int w, int h) {
      origin = new Point(0, 0);
      width = w;
      height = h;
   }

   public Rectangle(Point p, int w, int h) {
      origin = p;
      width = w;
      height = h;
   }

   /**
    * a method for moving the rectangle
    * @param x
    * @param y
    */
   public void move(int x, int y) {
      origin = new Point(x, y);
   }

   /**
    * a method of computing the area
    * of the rectangle
    * @return the area
    */
   public int getArea() {
      return width * height;
   }

   @Override
   public int isLargerThan(Relatable other) {
      Rectangle otherRect = (Rectangle) other;
      if (this.getArea() < otherRect.getArea()) return -1;
      else if (this.getArea() > otherRect.getArea()) return 1;
      else return 0;
   }
}
