
package generics.ch02;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Scanner;


public class Junk {
   public static void main(String[] args) throws InterruptedException {
      whilstRemovingDuringIteration_shouldThrowException();

   }

   public static void whilstRemovingDuringIteration_shouldThrowException() throws InterruptedException {

    List<Integer> integers = Arrays.asList(1, 2, 3);

    for (Integer integer : integers) {
        integers.remove(1);
    }
}
}
