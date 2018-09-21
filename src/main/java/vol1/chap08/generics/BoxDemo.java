/*
 * Chapter 6 Classes
 * Section Generics - Type Inference and Generic Methods.
 */
package vol1.chap08.generics;

import java.util.List;
import java.util.ArrayList;

/**
 * Type Inference and Generic Methods.
 * @author emaphis
 */
public class BoxDemo {

   public static <U> void addBox(U u, List<Box<U>> boxes) {
      Box<U> box = new Box<>();
      box.set(u);
      boxes.add(box);  // box
   }

   public static <U> void outputBoxes(List<Box<U>> boxes) {
      int counter = 0;
      for (Box<U> box : boxes) {
         U boxContents = box.get();  // unBox
         System.out.println("Box #" + counter + " contains [" +
                            boxContents.toString() + "]");
         counter++;
      }
   }

   public static void main(String[] args) {
      ArrayList<Box<Integer>> listOfIntegerBoxes = new ArrayList<>();
      addBox(10, listOfIntegerBoxes);
      addBox(20, listOfIntegerBoxes);
      addBox(30, listOfIntegerBoxes);
      outputBoxes(listOfIntegerBoxes);
   }
}
