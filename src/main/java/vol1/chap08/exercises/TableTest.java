/*
 * Chapter 8 - Generics
 * Exercise 3,4
 */
package vol1.chap08.exercises;

/**
 * Test the table implementations
 * @author emaphis
 */
public class TableTest {
   static void testTable1() {
      Table1<String, Integer> tbl = new Table1<>();
      tbl.set("a", 1);
      tbl.set("b", 2);
      tbl.set("c", 3);
      tbl.set("d", 4);
      System.out.println("a=" + tbl.get("a") + ",b=" + tbl.get("b") +
                         ",c=" + tbl.get("c") + ",d=" + tbl.get("d"));
      tbl.remove("c");
      System.out.println("a=" + tbl.get("a") + ",b=" + tbl.get("b") +
                         ",c=" + tbl.get("c") + ",d=" + tbl.get("d"));
      tbl.set("b", 5);
      System.out.println("a=" + tbl.get("a") + ",b=" + tbl.get("b") +
                         ",c=" + tbl.get("c") + ",d=" + tbl.get("d"));
   }

   static void testTable2() {
      Table2<String, Integer> tbl = new Table2<>();
      tbl.set("a", 1);
      tbl.set("b", 2);
      tbl.set("c", 3);
      tbl.set("d", 4);
      System.out.println("a=" + tbl.get("a") + ",b=" + tbl.get("b") +
                         ",c=" + tbl.get("c") + ",d=" + tbl.get("d"));
      tbl.remove("c");
      System.out.println("a=" + tbl.get("a") + ",b=" + tbl.get("b") +
                         ",c=" + tbl.get("c") + ",d=" + tbl.get("d"));
      tbl.set("b", 5);
      System.out.println("a=" + tbl.get("a") + ",b=" + tbl.get("b") +
                         ",c=" + tbl.get("c") + ",d=" + tbl.get("d"));
   }

   public static void main(String[] args) {
      testTable1();
      testTable2();
   }
}
