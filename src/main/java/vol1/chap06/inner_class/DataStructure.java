/*
 * Chapter 6 Classes
 * Section Inner Class
 */
package vol1.chap06.inner_class;

/**
 *
 * @author emaphis
 */
public class DataStructure {
   // Create an array
   private final static int SIZE = 15;
   private final int[] arrayOfInts = new int[SIZE];

   public DataStructure() {
      // fill array wiht ascending integer values
      for (int i = 0; i < SIZE; i++) {
         arrayOfInts[i] = i;
      }
   }

   public void printEven() {
      // Print out values of even indices of the arrya
      DataStructureIterator iterator = this.new EvenIterator();
      while (iterator.hasNext()) {
         System.out.print(iterator.next() + " ");
      }
      System.out.println();
   }

   interface DataStructureIterator extends java.util.Iterator<Integer> { }

   // Inner class implements the DataStrureIterator interface,
   // which extens the Interator<Integer> inteface.

   private class EvenIterator implements DataStructureIterator {

      // Start stepping through the array from the beginning
      private int nextIndex = 0;

      @Override
      public boolean hasNext() {
         // check if the current element is the last in the array
         return (nextIndex <= SIZE - 1);
      }

      @Override
      public Integer next() {
         // Record a value of an even index of the array
         Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

         // Get the next even element
         nextIndex += 2;
         return retValue;
      }
   }

   public static void main(String args[]) {
      // Fill the array wiht integer values and print out only th values
      // of even indices
      DataStructure ds = new DataStructure();
      ds.printEven();
   }
}
