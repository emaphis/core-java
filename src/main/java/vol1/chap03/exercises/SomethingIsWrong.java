/*
 * Chapter 1 Basics
 * Section vol1.chap03.exercises
 */
package vol1.chap03.exercises;

/**
 *
 * @author emaphis
 */
public class SomethingIsWrong {

   public static void main(String[] args) {
      Rectangle myRect = new Rectangle();
      myRect.width = 40;
      myRect.height = 50;
      System.out.println("myRect's area is " + myRect.area());
   }
}

class Rectangle {
   public int width;
   public int height;

   public Rectangle() {
      this.width = 0;
      this.height = 0;
   }

   public int area() {
      return width * height;
   }
 }
