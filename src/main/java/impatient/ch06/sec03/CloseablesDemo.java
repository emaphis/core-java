/*
 * Chapter 6  Generic Programming
 * Sec 3  Type Bounds
 *
 */
package impatient.ch06.sec03;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author emaphis
 */
public class CloseablesDemo {

   public static void main(String[] args) throws Exception {
      PrintStream p1 = new PrintStream("resources//infile.txt");
      PrintStream p2 = new PrintStream("resources//outfiletxt");
      ArrayList<PrintStream> ps = new ArrayList<>();
      ps.add(p1);
      ps.add(p2);
      Closeables.closeAll(ps);
   }
}
