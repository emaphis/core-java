/*
 * Chapter 8 - Generics
 * Section 1-8 - Wildcards
 */
package vol1.chap08.sec05;

import vol1.chap08.sec02.Pair;

/**
 * Test Java's wild card feature
 * @author emaphis
 */
public class PairTest3 {

   /* Wild card extension  section 8.8.1 */
   //public static void printBuddies (Pair<Employee> p) {
   public static void printBuddies(Pair<? extends Employee> p) {
      Employee first = p.getFirst();
      Employee second = p.getSecond();
      System.out.println(first.getName() + " and " + second.getName() + " are buddies");
   }

   /* Supertype bounds for wildcards section 8.8.2 */
   public static void minmaxBonus(Manager[] a, Pair<? super Manager> result) {
      if (a.length == 0) return;
      Manager min = a[0];
      Manager max = a[0];
      for (int i = 1; i < a.length; i++) {
         if (min.getBonus() > a[i].getBonus()) min = a[i];
         if (max.getBonus() < a[i].getBonus()) max = a[i];
      }
      result.setFirst(min);
      result.setSecond(max);
   }

   public static void maxminBonus(Manager[] a, Pair<? super Manager> result) {
      minmaxBonus(a, result);
      PairAlg.swapHelper(result);  // Ok - swapHelper captures wildcard type
   }

   public static void main(String[] args) {
      Manager ceo = new Manager("Gus Greedy", 80000.00);
      Manager cfo = new Manager("Sid Sneaky", 60000.00);
      Manager cio = new Manager("Charley Rader", 55000.00);

      Pair<Manager> buddies = new Pair<>(ceo, cfo);
      printBuddies(buddies);

      ceo.setBonus(1000000.0);
      cfo.setBonus(500000.0);
      cio.setBonus(750000);
      Manager[] managers  = {ceo, cfo, cio };

      Pair<Employee> result = new Pair<>();
      minmaxBonus(managers, result);
      System.out.println("max=" + result.getFirst().getName() +
                        ",min=" + result.getSecond().getName());
      maxminBonus(managers, result);
      System.out.println("min=" + result.getFirst().getName() +
                        ",max=" + result.getSecond().getName());
   }
}
